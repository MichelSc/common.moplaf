package com.misc.common.moplaf.kpiview.medusa.views;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.kpiview.viewers.KPIViewerAbstract;

import eu.hansolo.medusa.Gauge;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import javafx.embed.swt.FXCanvas;



public class KPIViewer extends KPIViewerAbstract {
	//-------------------------------------------------------------------------------------
	// selection management
	//-------------------------------------------------------------------------------------
	private class KPIViewerISeletionListener implements ISelectionChangedListener{
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
//	public class TimePlotDataProvider {
//		
//		private class KPIModelObject {
//			private Object eventObject;
//			private int gaugeIndex ;
//			public KPIModelObject(Object eventObject, int gaugeIndex){
//				this.eventObject = eventObject;
//				this.gaugeIndex = gaugeIndex;
//			}
//		};
//		
//		protected boolean dataRangedirty = false;
//		private Object modelObject;
//		private ArrayList<TimePlotDataProviderModelObject> eventObjects;
//
//		public TimePlotDataProvider(Object modelObject) {
//			super(true);
//			listeners = new ArrayList<IDataProviderListener>();
//			this.eventObjects = new ArrayList<TimePlotDataProviderModelObject>();
//			this.modelObject = modelObject;
//		}
//		
//		public void addEventObject(Object eventObject){
//			Date moment        = TimePlotViewer.this.getIAmountEventProvider().getEventMoment(eventObject);
//			float amountBefore = TimePlotViewer.this.getIAmountEventProvider().getEventAmountBefore(eventObject);
//			float amountAfter  = TimePlotViewer.this.getIAmountEventProvider().getEventAmountAfter(eventObject);
//			this.eventObjects.add(new TimePlotDataProviderModelObject(eventObject, moment, amountBefore, amountAfter));
//			this.dataRangedirty = true;
//		}
//		
//		public void clear(){
//			this.eventObjects.clear();
//			this.dataRangedirty = true;
//	}

//		@Override
//		public int getSize() {
//			return this.eventObjects.size()*2;
//		}
//
//		}

		
//	}; // class TimePlotDataProvider 
	//-------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------

	//-------------------------------------------------------------------------------------
	// fields 
	//-------------------------------------------------------------------------------------
    private GridPane pane;  
    private FXCanvas canvas = null;
	private LinkedList<KPIViewed> gauges;
	
	private class KPIViewed {
		private Gauge gauge;
		private Object modelObject;
		int gridIndex;
	}

	//-------------------------------------------------------------------------------------
	// constructor
	public KPIViewer(Composite parent){
		// grid pane
    	pane = new GridPane();  
        pane.setPadding(new Insets(20));  
        pane.setHgap(10);  
        pane.setVgap(15);  
        pane.setBackground(new Background(new BackgroundFill(Color.rgb(130,116,133), CornerRadii.EMPTY, Insets.EMPTY)));  

        // scroll pane
        ScrollPane superPane = new ScrollPane();
        superPane.setContent(pane);
        
        // scene
        Scene newScene =  new Scene(superPane);
        
        // FXCanvas
        canvas = new FXCanvas(parent, SWT.NONE);
        canvas.setScene(newScene);
	}
	
	//-------------------------------------------------------------------------------------
	@Override
	public Control getControl() {
		return this.canvas;
	}
	//-------------------------------------------------------------------------------------
	
	//-------------------------------------------------------------------------------------
	// keep model and plot in synch
	//-------------------------------------------------------------------------------------
	/**
	 * Called by ContentViewe.setInput, himself called by KPIViewAbstract.selectionChanged
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			//CommonPlugin.INSTANCE.log("TimePlotViewer: inputChanged "+input.toString());
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		//CommonPlugin.INSTANCE.log("TimePlotViewer: refresh");

		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(this.getInput());
		
		HashSet<Object> children = new HashSet<Object>(Arrays.asList(childrenModelElement));

		LinkedList<Gauge> gaugesToRemove = new LinkedList<Gauge>();

//		boolean allRemoved = true;
//		for ( Gauge gauge: this.xyGraph.getPlotArea().getTraceList()){
//			TimePlotDataProvider dataprovider = (TimePlotDataProvider)trace.getDataProvider();
//			if ( ! children.contains(dataprovider.modelObject) ){
//				tracesToRemove.add(trace);
//			} else {
//				children.remove(dataprovider.modelObject);
//				allRemoved = false;
//			}
//		}
//		
//		// do the adds
//		boolean somethingAdded = false;
//		for( Object modelObjectToAdd : children){
//			if ( this.getIAmountEventProvider().isAmountEvents(modelObjectToAdd)){
//				// it is a collection of events
//				String traceLabel = this.getILabelProvider().getText(modelObjectToAdd);
//				Color  color      = this.getIColorProvider().getForeground(modelObjectToAdd);
//				TimePlotDataProvider dataProvider = new TimePlotDataProvider(modelObjectToAdd);
//				Trace trace = new Trace(traceLabel, xyGraph.primaryXAxis, xyGraph.primaryYAxis, dataProvider);
//				trace.setPointStyle(PointStyle.XCROSS);
//				trace.setTraceColor(color);
//				this.xyGraph.addTrace(trace);
//				somethingAdded = true;
//			}
//		}
//		
//		if ( allRemoved && !somethingAdded){
//			// the chart will be empty: we keep is as it si
//			return;
//		}
//		
//		// do the removes
//		for ( Trace traceToRemove : tracesToRemove){
//			this.xyGraph.removeTrace(traceToRemove);
//		}
		
//		for ( Trace traceAsIs : this.xyGraph.getPlotArea().getTraceList()){
//			this.refreshTrace(traceAsIs);
//		}
		
//		this.timePlotCanvas.redraw();
	}
	
	private void refresh(KPIViewed kpiViewed){
		Object modelObject = null;
		
		float kpi = this.getIKPIProvider().getAmount(modelObject);
	} // method refresh(KPIViewed)
}; // class KPIViewer


	
	

