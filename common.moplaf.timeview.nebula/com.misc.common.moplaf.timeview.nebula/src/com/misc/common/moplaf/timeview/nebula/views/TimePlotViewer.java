package com.misc.common.moplaf.timeview.nebula.views;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.visualization.xygraph.figures.XYGraph;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.timeview.TimePlotViewerAbstract;


public class TimePlotViewer extends TimePlotViewerAbstract {

	// fields 
	private XYGraph xyGraph = null;
	private Canvas timePlotCanvas = null;
//	private DefaultHierarchicalTimeBarModel timeBarModel;

	// constructor
	public TimePlotViewer(Composite parent){
		this.timePlotCanvas = new Canvas(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		// make the control
		// use LightweightSystem to create the bridge between SWT and draw2D
		final LightweightSystem lws = new LightweightSystem(this.timePlotCanvas);

		// create a new XY Graph.
		this.xyGraph = new XYGraph();
		this.xyGraph.setTitle("Simple Example");
		// set it as the content of LightwightSystem
		lws.setContents(this.xyGraph);

//		super.hookControl(this.timeBarViewer);
        // fill the control
	}
	
	@Override
	public Control getControl() {
		return this.timePlotCanvas;
	}
	
	// ******************************
	// selection management
	// ******************************
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

    
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
//			DefaultHierarchicalTimeBarModel model = null;
//			GanttViewerRow rootNode = null;
//			Object modelElement = input;
//	        rootNode = this.createRow(modelElement);
//			model = new DefaultHierarchicalTimeBarModel(rootNode);
//			this.timeBarModel = model;
//			this.timeBarViewer.setModel(timeBarModel);
			this.refresh();
		}
	}

	@Override
	public void refresh() {
//		if ( this.timeBarModel!=null) {
//		
//			GanttViewerRow rootNode = (GanttViewerRow)this.timeBarModel.getRootNode();
//			if ( rootNode != null){
//				this.refreshNode(rootNode);
//			}
//			
//			this.timeBarViewer.getHierarchicalViewState().setExpandedRecursive(rootNode, true);
//		}
//		this.timeBarViewer.redraw();
	}
	
	public void refreshNodeLabel(Object row){
//		String labelToBe = this.getILabelProvider().getText(row.getModelObject());
//		String labelAsIs = row.getGanttRowHeader().getLabel();
//		if ( !labelToBe.equals(labelAsIs)){
//			row.getGanttRowHeader().setLabel(labelToBe);
//		}
	}
	
	
	public void refreshNode(Object interval){
//		Object modelElement = interval.getModelObject();
//		// begin
//		Date startToBe = this.getIIntervalEventProvider().getIntervalEventStart(modelElement);
//		JaretDate startAsIs = interval.getBegin();
//		if (  startAsIs==null || startToBe.compareTo(startAsIs.getDate())!= 0 ){
//			interval.setBegin(new JaretDate(startToBe));
//		}
//		
//		// end
//		Date endToBe   = this.getIIntervalEventProvider().getIntervalEventEnd(modelElement);
//		JaretDate endAsIs = interval.getEnd();
//		if (  endAsIs == null || endToBe.compareTo(endAsIs.getDate())!= 0 ){
//			interval.setEnd(new JaretDate(endToBe));
//		}
	}

	public void refreshNode2(Object row){
		// refresh the label
		this.refreshNodeLabel(row);
		
		// refresh the child rows
		// get the as is
//		Object modelElement = row.getModelObject();
//		HashMap<Object, GanttViewerRow> ganttChildRowsAsIs = new HashMap<Object, GanttViewerRow>();
//		HashMap<Object, GanttViewerInterval> childIntervalsAsIs = new HashMap<Object, GanttViewerInterval>();
//		for ( TimeBarNode childRowAsIs : row.getChildren()){
//			GanttViewerRow ganttChildRowAsIs = (GanttViewerRow) childRowAsIs;
//			ganttChildRowsAsIs.put(ganttChildRowAsIs.getModelObject(), ganttChildRowAsIs);
//		}
//		for (  Interval intervalAsIs : row.getIntervals()){
//			GanttViewerInterval ganttIntervalAsIs = (GanttViewerInterval)intervalAsIs;
//			childIntervalsAsIs.put(ganttIntervalAsIs.getModelObject(), ganttIntervalAsIs);
//		}
//		
//		// update the child rows
//		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(modelElement);
//		for (Object childModelElement : childrenModelElement) {
//			if( this.getIIntervalEventProvider().isIntervalEvent(childModelElement) ) {
//				// the node is an interval
//				GanttViewerInterval ganttInterval = childIntervalsAsIs.get(childModelElement);
//				if ( ganttInterval == null){
//					// create the interval
//					ganttInterval = this.createInterval(childModelElement);
//					this.refreshNode(ganttInterval);
//					row.addInterval(ganttInterval);
//				} else {
//					// refresh the interval
//					childIntervalsAsIs.remove(childModelElement);
//					this.refreshNode(ganttInterval);
//				}
//			} else {
//				// the node is a row
//				GanttViewerRow ganttChildRow = ganttChildRowsAsIs.get(childModelElement);
//				if ( ganttChildRow == null){
//					// create the row
//					ganttChildRow= this.createRow(childModelElement);
//					row.addNode(ganttChildRow);
//				}
//				else {
//					ganttChildRowsAsIs.remove(modelElement);
//				}
//				this.refreshNode(ganttChildRow);
//			}
//		}
//		
//		// remove the rows too many
//		for(GanttViewerRow rowAsIs : ganttChildRowsAsIs.values()){
//			row.remNode(rowAsIs);
//		}
//		// remove the intervals too many
//		for ( GanttViewerInterval intervalAsIs : childIntervalsAsIs.values()){
//			row.remInterval(intervalAsIs);
		}
	}

