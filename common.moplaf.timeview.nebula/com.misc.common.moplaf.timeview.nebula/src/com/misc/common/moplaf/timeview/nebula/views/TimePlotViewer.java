/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.timeview.nebula.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.visualization.xygraph.dataprovider.AbstractDataProvider;
import org.eclipse.nebula.visualization.xygraph.dataprovider.IDataProviderListener;
import org.eclipse.nebula.visualization.xygraph.dataprovider.ISample;
import org.eclipse.nebula.visualization.xygraph.dataprovider.Sample;
import org.eclipse.nebula.visualization.xygraph.figures.ToolbarArmedXYGraph;
import org.eclipse.nebula.visualization.xygraph.figures.Trace;
import org.eclipse.nebula.visualization.xygraph.figures.XYGraph;
import org.eclipse.nebula.visualization.xygraph.figures.ZoomType;
import org.eclipse.nebula.visualization.xygraph.linearscale.Range;
import org.eclipse.nebula.visualization.xygraph.figures.Trace.PointStyle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import com.misc.common.moplaf.timeview.IAmountEventProvider;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;


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
			private TimePlotSample sample;
			public TimePlotDataProviderModelObject(Object eventObject, Date moment, float amount){
				this.eventObject = eventObject;
				this.sample = new TimePlotSample(modelObject, true,  moment, amount);
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
			IAmountEventProvider provider = TimePlotViewer.this.getIAmountEventProvider();
			Date moment  = provider.getEventMoment(this.modelObject, eventObject);
			float amount = provider.getEventAmount(this.modelObject, eventObject);
			this.eventObjects.add(new TimePlotDataProviderModelObject(eventObject, moment, amount));
			this.dataRangedirty = true;
		}
		
		public void clear(){
			this.eventObjects.clear();
			this.dataRangedirty = true;
	}

		@Override
		public int getSize() {
			return this.eventObjects.size();
		}

		@Override
		public ISample getSample(int index) {
			TimePlotDataProviderModelObject modelObject = this.eventObjects.get(index); 
			return modelObject.sample;
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
					double x = eventObject.sample.getXValue();
					double y = eventObject.sample.getYValue();
					
					if (x < xMin ) { xMin = x; }
					if (x > xMax ) { xMax = x; }
					if (y < yMin ) { yMin = y; }
					if (y > yMax ) { yMax = y; }
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
	private ToolbarArmedXYGraph toolbarArmedXYGraph = null;

	//-------------------------------------------------------------------------------------
	// constructor
	public TimePlotViewer(Composite parent){
		this.timePlotCanvas = new Canvas(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		// make the control
		// use LightweightSystem to create the bridge between SWT and draw2D
		final LightweightSystem lws = new LightweightSystem(this.timePlotCanvas);

		// create a new XY Graph.
		this.xyGraph = new XYGraph();
//		this.xyGraph.setTitle("Simple Example");
		Date today = new Date();
		this.toolbarArmedXYGraph = new ToolbarArmedXYGraph(this.xyGraph);
		
		long start = today.getTime();
		long end = start+1000L*60L*60L*24L*30L;
		this.xyGraph.primaryXAxis.setRange(new Range(start,end));
		this.xyGraph.primaryXAxis.setDateEnabled(true);
		this.xyGraph.primaryXAxis.setAutoScale(true);
		this.xyGraph.primaryYAxis.setAutoScale(true);

		this.toolbarArmedXYGraph.addMouseListener(new MouseListener.Stub() {
			@Override
			public void mousePressed(final MouseEvent me) {
				toolbarArmedXYGraph.requestFocus();
			}
		});

		toolbarArmedXYGraph.addKeyListener(new KeyListener.Stub() {
			@Override
			public void keyPressed(final KeyEvent ke) {
				if ((ke.getState() == SWT.CONTROL) && (ke.keycode == 'z')) {
					xyGraph.getOperationsManager().undo();
				}
				if ((ke.getState() == SWT.CONTROL) && (ke.keycode == 'y')) {
					xyGraph.getOperationsManager().redo();
				}
				if ((ke.getState() == SWT.CONTROL) && (ke.keycode == 'x')) {
					xyGraph.performAutoScale();
				}
				if ((ke.getState() == SWT.CONTROL) && (ke.keycode == 's')) {
					final ImageLoader loader = new ImageLoader();
					loader.data = new ImageData[] { xyGraph.getImage().getImageData() };
					final FileDialog dialog = new FileDialog(Display.getDefault().getShells()[0], SWT.SAVE);
					dialog.setFilterNames(new String[] { "PNG Files", "All Files (*.*)" });
					dialog.setFilterExtensions(new String[] { "*.png", "*.*" }); // Windows
					final String path = dialog.open();
					if ((path != null) && !path.equals("")) {
						loader.save(path, SWT.IMAGE_PNG);
					}
				}
				if ((ke.getState() == SWT.CONTROL) && (ke.keycode + 'a' - 97 == 't')) {
					switch (xyGraph.getZoomType()) {
					case RUBBERBAND_ZOOM:
						xyGraph.setZoomType(ZoomType.HORIZONTAL_ZOOM);
						break;
					case HORIZONTAL_ZOOM:
						xyGraph.setZoomType(ZoomType.VERTICAL_ZOOM);
						break;
					case VERTICAL_ZOOM:
						xyGraph.setZoomType(ZoomType.ZOOM_IN);
						break;
					case ZOOM_IN:
						xyGraph.setZoomType(ZoomType.ZOOM_OUT);
						break;
					case ZOOM_OUT:
						xyGraph.setZoomType(ZoomType.PANNING);
						break;
					case PANNING:
						xyGraph.setZoomType(ZoomType.NONE);
						break;
					case NONE:
						xyGraph.setZoomType(ZoomType.RUBBERBAND_ZOOM);
						break;
					default:
						break;
					}
				}
			}
		});

		// set it as the content of LightwightSystem
		lws.setContents(this.toolbarArmedXYGraph);
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
			//CommonPlugin.INSTANCE.log("TimePlotViewer: inputChanged "+input.toString());
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		//CommonPlugin.INSTANCE.log("TimePlotViewer: refresh");

		ArrayList<Object> children = new ArrayList<Object>();
		Object[] elements = this.getTreeContentProvider().getChildren(this.getInput());
		for ( Object element : elements){
			Object[] subelements = this.getTreeContentProvider().getChildren(element);
			children.addAll(Arrays.asList(subelements));
		}

		LinkedList<Trace> tracesToRemove = new LinkedList<Trace>();

		boolean allRemoved = true;
		for ( Trace trace : this.xyGraph.getPlotArea().getTraceList()){
			TimePlotDataProvider dataprovider = (TimePlotDataProvider)trace.getDataProvider();
			if ( ! children.contains(dataprovider.modelObject) ){
				tracesToRemove.add(trace);
			} else {
				children.remove(dataprovider.modelObject);
				allRemoved = false;
			}
		}
		
		// do the adds
		boolean somethingAdded = false;
		for( Object modelObjectToAdd : children){
			if ( this.getIAmountEventProvider().isAmountEvents(modelObjectToAdd)){
				// it is a collection of events
				String traceLabel = this.getILabelProvider().getText(modelObjectToAdd);
				Color  color      = this.getIColorProvider().getForeground(modelObjectToAdd);
				TimePlotDataProvider dataProvider = new TimePlotDataProvider(modelObjectToAdd);
				Trace trace = new Trace(traceLabel, xyGraph.primaryXAxis, xyGraph.primaryYAxis, dataProvider);
				trace.setPointStyle(PointStyle.XCROSS);
				trace.setTraceColor(color);
				this.xyGraph.addTrace(trace);
				somethingAdded = true;
			}
		}
		
		if ( allRemoved && !somethingAdded && false){
			// selection is empty
			// nothing was added
			// keep the current selection
			// so skip the removed
		} else {
			// do the removes
			for ( Trace traceToRemove : tracesToRemove){
				this.xyGraph.removeTrace(traceToRemove);
			}
		}
		
		for ( Trace traceAsIs : this.xyGraph.getPlotArea().getTraceList()){
			this.refreshTrace(traceAsIs);
		}
		
		this.timePlotCanvas.redraw();
	}
	
	private void refreshTrace(Trace trace){
		TimePlotDataProvider dataProvider = (TimePlotDataProvider)trace.getDataProvider();
		Object modelObject = dataProvider.modelObject;
		
		dataProvider.clear();
		// update the child rows
		Object[] childrenModelElement = this.getIAmountEventProvider().getAmountEvents(modelObject);
		for (Object childModelElement : childrenModelElement) {
			dataProvider.addEventObject(childModelElement);
		} // traverse the children of the model object
	} // method refreshTrace
}; // class TimePlotViewer


	
	

