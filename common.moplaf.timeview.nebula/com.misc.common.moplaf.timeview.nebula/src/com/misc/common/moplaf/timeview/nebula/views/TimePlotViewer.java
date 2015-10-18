package com.misc.common.moplaf.timeview.nebula.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.visualization.xygraph.dataprovider.AbstractDataProvider;
import org.eclipse.nebula.visualization.xygraph.dataprovider.IDataProviderListener;
import org.eclipse.nebula.visualization.xygraph.dataprovider.ISample;
import org.eclipse.nebula.visualization.xygraph.dataprovider.Sample;
import org.eclipse.nebula.visualization.xygraph.figures.Trace;
import org.eclipse.nebula.visualization.xygraph.figures.XYGraph;
import org.eclipse.nebula.visualization.xygraph.linearscale.Range;
import org.eclipse.nebula.visualization.xygraph.figures.Trace.PointStyle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.timeview.TimePlotViewerAbstract;


public class TimePlotViewer extends TimePlotViewerAbstract {
	//-------------------------------------------------------------------------------------
	// selection management
	//-------------------------------------------------------------------------------------
	private class TimePlotViewerISeletionListener implements ISelectionChangedListener{
		private IStructuredSelection oldSelection = null;

		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			ISelection selection = event.getSelection();
			Object selectedElement = null;
			Object selectedElementTmp = null;
			if (  !selection.isEmpty() && selection instanceof IStructuredSelection) {
				IStructuredSelection thisSelection = ((IStructuredSelection)selection);
				Iterator<?> selectedElements = thisSelection.iterator();
				while ( selectedElements.hasNext() && selectedElement==null){
					selectedElementTmp = selectedElements.next();
					if ( this.oldSelection!=null && !this.oldSelection.toList().contains(selectedElementTmp)){
						// this is a newly selected oject
						selectedElement = selectedElementTmp;
					}
				}
				if ( selectedElement==null){
					selectedElement = selectedElementTmp;
				}
				setSelectedModelObject(selectedElement);
				this.oldSelection = thisSelection;
			}
		}
	} // class selection listener

	private void setSelectedModelObject(Object selection){
		Object selectedObject = null;
//		if ( selection instanceof GanttViewerInterval){
//			selectedObject = ((GanttViewerInterval)selection).getModelObject();
//		} else if ( selection instanceof GanttViewerRow){
//			selectedObject = ((GanttViewerRow)selection).getModelObject();
//		}
		
		this.setSelectedElement(selectedObject);
	}
	//-------------------------------------------------------------------------------------
	// nested classes
	//-------------------------------------------------------------------------------------
	public class TimePlotDataProvider extends AbstractDataProvider {
		
		private class TimePlotDataProviderModelObject {
			private Object eventObject;
			private TimePlotSample sampleBefore;
			private TimePlotSample sampleAfter;
			public TimePlotDataProviderModelObject(Object eventObject, Date moment, float amountBefore, float amountAfter){
				this.eventObject = eventObject;
				this.sampleBefore = new TimePlotSample(modelObject, true, moment, amountBefore);
				this.sampleAfter  = new TimePlotSample(modelObject, false, moment, amountAfter);
			}
		};
		
		protected boolean dataRangedirty = false;
		private Object modelObject;
		private ArrayList<TimePlotDataProviderModelObject> eventObjects;

		public TimePlotDataProvider(Object modelObject) {
			super(true);
			listeners = new ArrayList<IDataProviderListener>();
			this.eventObjects = new ArrayList<TimePlotDataProviderModelObject>();
			this.modelObject = modelObject;
		}
		
		public void addEventObject(Object eventObject){
			Date moment        = TimePlotViewer.this.getIAmountEventProvider().getEventMoment(eventObject);
			float amountBefore = TimePlotViewer.this.getIAmountEventProvider().getEventAmountBefore(eventObject);
			float amountAfter  = TimePlotViewer.this.getIAmountEventProvider().getEventAmountAfter(eventObject);
			this.eventObjects.add(new TimePlotDataProviderModelObject(eventObject, moment, amountBefore, amountAfter));
			this.dataRangedirty = true;
		}
		
		public void clear(){
			this.eventObjects.clear();
			this.dataRangedirty = true;
	}

		@Override
		public int getSize() {
			return this.eventObjects.size()*2;
		}

		@Override
		public ISample getSample(int index) {
			TimePlotDataProviderModelObject modelObject = this.eventObjects.get(index / 2); // integer division
			if ( index % 2 == 0 ){
				return modelObject.sampleBefore;
			} else {
				return modelObject.sampleAfter;
			}
		}

		@Override
		protected void innerUpdate() {
			dataRangedirty = true;
		}

		@Override
		protected void updateDataRange() {
			if (!this.dataRangedirty)
				return;
			this.dataRangedirty = false;
			if (getSize() > 0) {
				double xMin = Double.MAX_VALUE;
				double xMax = Double.MIN_VALUE;
				double yMin = Double.MAX_VALUE;
				double yMax = Double.MIN_VALUE;
				for (TimePlotDataProviderModelObject eventObject : this.eventObjects) {
					double x  = eventObject.sampleBefore.getXValue();
					double y1 = eventObject.sampleBefore.getYValue();
					double y2 = eventObject.sampleAfter.getYValue();
					
					if (x < xMin ) { xMin = x; }
					if (x > xMax ) { xMax = x; }
					if (y1 < yMin ) { yMin = y1; }
					if (y1 > yMax ) { yMax = y1; }
					if (y2 < yMin ) { yMin = y2; }
					if (y2 > yMax ) { yMax = y2; }
				}

				this.xDataMinMax = new Range(xMin, xMax);
				this.yDataMinMax = new Range(yMin, yMax);
			} else {
				this.xDataMinMax = null;
				this.yDataMinMax = null;
			}
		}

		
	}; // class TimePlotDataProvider 
	//-------------------------------------------------------------------------------------
	public class TimePlotSample extends Sample {
		private Object modelObject;
		private boolean isBefore; 

		public TimePlotSample(Object modelObject, boolean isBefore, Date moment, float amount) {
			super(moment.getTime(), amount);
			this.modelObject = modelObject;
			this.isBefore = isBefore;
		}
		
		public Date getMoment(){
			return new Date((long)this.getXValue());
		}
		
	}; // class TimePlotSample
	//-------------------------------------------------------------------------------------

	//-------------------------------------------------------------------------------------
	// fields 
	//-------------------------------------------------------------------------------------
	private XYGraph xyGraph = null;
	private Canvas timePlotCanvas = null;

	//-------------------------------------------------------------------------------------
	// constructor
	public TimePlotViewer(Composite parent){
		this.timePlotCanvas = new Canvas(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		// make the control
		// use LightweightSystem to create the bridge between SWT and draw2D
		final LightweightSystem lws = new LightweightSystem(this.timePlotCanvas);

		// create a new XY Graph.
		this.xyGraph = new XYGraph();
		this.xyGraph.setTitle("Simple Example");
		this.xyGraph.primaryXAxis.setRange(new Range(0, 200));
		this.xyGraph.primaryXAxis.setDateEnabled(true);
		this.xyGraph.primaryXAxis.setAutoScale(true);
		this.xyGraph.primaryYAxis.setAutoScale(true);
		// set it as the content of LightwightSystem
		lws.setContents(this.xyGraph);

//		super.hookControl(this.timeBarViewer);
        // fill the control
	}
	
	//-------------------------------------------------------------------------------------
	@Override
	public Control getControl() {
		return this.timePlotCanvas;
	}
	//-------------------------------------------------------------------------------------
	
	//-------------------------------------------------------------------------------------
	// keep model and plot in synch
	//-------------------------------------------------------------------------------------
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			CommonPlugin.INSTANCE.log("TimePlotViewer: inputChanged "+input.toString());
			while ( !this.xyGraph.getPlotArea().getTraceList().isEmpty() ){
				this.xyGraph.removeTrace(this.xyGraph.getPlotArea().getTraceList().get(0));
			}
			//this.xyGraph.removeAll();
			Object modelElement = input;
			TimePlotDataProvider dataProvider = new TimePlotDataProvider(modelElement);
			Trace trace = new Trace("Trace1-XY Plot", xyGraph.primaryXAxis, xyGraph.primaryYAxis, dataProvider);
			trace.setPointStyle(PointStyle.XCROSS);
			this.xyGraph.addTrace(trace);
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		CommonPlugin.INSTANCE.log("TimePlotViewer: refresh");
		for ( Trace trace : this.xyGraph.getPlotArea().getTraceList()){
			this.refreshTrace(trace);
		}
		CommonPlugin.INSTANCE.log("TimePlotViewer: redraw");
		this.timePlotCanvas.redraw();
		CommonPlugin.INSTANCE.log("TimePlotViewer: redrawn");
	}
	
	private void refreshTrace(Trace trace){
		TimePlotDataProvider dataProvider = (TimePlotDataProvider)trace.getDataProvider();
		Object modelObject = dataProvider.modelObject;
		
		// refresh the label
		String labelToBe = this.getILabelProvider().getText(modelObject);
		String labelAsIs = "";
		if ( !labelToBe.equals(labelAsIs)){
			// to do: do something with the label
		}
		
		dataProvider.clear();
		// update the child rows
		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(modelObject);
		for (Object childModelElement : childrenModelElement) {
			if( this.getIAmountEventProvider().isDiscontinuousAmountEvent(childModelElement) ) {
				dataProvider.addEventObject(childModelElement);
			} else {
				// the object is ignored
			}  // the child is an event
		} // traverse the children of the model object
	} // method refreshTrace
}; // class TimePlotViewer


	
	

