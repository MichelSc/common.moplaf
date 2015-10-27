package com.misc.common.moplaf.timeview.jaret.views;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.timeview.GanttViewerAbstract;

import de.jaret.util.date.Interval;
import de.jaret.util.date.IntervalImpl;
import de.jaret.util.date.JaretDate;
import de.jaret.util.ui.timebars.model.DefaultHierarchicalTimeBarModel;
import de.jaret.util.ui.timebars.model.DefaultRowHeader;
import de.jaret.util.ui.timebars.model.DefaultTimeBarNode;
import de.jaret.util.ui.timebars.model.TimeBarNode;
import de.jaret.util.ui.timebars.swt.TimeBarViewer;
import de.jaret.util.ui.timebars.swt.renderer.DefaultHierarchyRenderer;
import de.jaret.util.ui.timebars.swt.renderer.DefaultTitleRenderer;
import de.jaret.util.ui.timebars.strategy.DefaultOverlapStrategy;

public class GanttViewer extends GanttViewerAbstract {

	// fields 
	private TimeBarViewer timeBarViewer;
	private DefaultHierarchicalTimeBarModel timeBarModel;

	// constructor
	public GanttViewer(Composite parent){
		// make the control
		this.timeBarViewer = new TimeBarViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		this.timeBarViewer.setTimeScalePosition(TimeBarViewer.TIMESCALE_POSITION_TOP);
		this.timeBarViewer.setPixelPerSecond(0.05);
		this.timeBarViewer.setDrawRowGrid(true);
		this.timeBarViewer.setSelectionDelta(6);
		//this.timeBarViewer.setHierarchyWidth(5);
		this.timeBarViewer.setHierarchyRenderer(new DefaultHierarchyRenderer());
		this.timeBarViewer.addSelectionChangedListener(new GanttViewerISeletionListener());
		this.timeBarViewer.setInitialDisplayRange(new JaretDate(), 365*24*60*60);

		((DefaultOverlapStrategy) this.timeBarViewer.getOverlapStrategy()).setAssumeSortedIntervals(false);
        DefaultTitleRenderer titleRenderer = new DefaultTitleRenderer();
//titleRenderer.setBackgroundRscName("/de/jaret/examples/timebars/hierarchy/swt/titlebg.png");
        this.timeBarViewer.setTitleRenderer(titleRenderer);
        this.timeBarViewer.setTitle("Gantt chart");

		super.hookControl(this.timeBarViewer);
		/*
        this.timeBarViewer.addMouseListener(new MouseListener() {

            public void mouseDoubleClick(MouseEvent e) {
                DoubleClickEvent event = new DoubleClickEvent(GanttViewer.this, getSelection());
                // do something
            }

            public void mouseDown(MouseEvent e) {
            }

            public void mouseUp(MouseEvent e) {
            }

        });*/
        
        // fill the control
	}
	
	@Override
	public Control getControl() {
		return timeBarViewer;
	}
	
	// ******************************
	// selection management
	// ******************************
	private class GanttViewerISeletionListener implements ISelectionChangedListener{
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
	}

	private void setSelectedModelObject(Object selection){
		Object selectedObject = null;
		if ( selection instanceof GanttViewerInterval){
			selectedObject = ((GanttViewerInterval)selection).getModelObject();
		} else if ( selection instanceof GanttViewerRow){
			selectedObject = ((GanttViewerRow)selection).getModelObject();
		}
		
		this.setSelectedElement(selectedObject);
	}

	// ******************************
	// map to jaret
	// ******************************
	public class GanttViewerRow extends DefaultTimeBarNode {
		private Object modelObject;
		public GanttViewerRow (Object modelObject){
			super(new DefaultRowHeader("new row"));
			this.modelObject = modelObject;
		}
		public DefaultRowHeader getGanttRowHeader(){
			return (DefaultRowHeader)this.getRowHeader();
		}
		public Object getModelObject(){
			return this.modelObject;
		}
	}
	
	public class GanttViewerInterval extends IntervalImpl {
		private Object modelObject;
		public GanttViewerInterval(Object modelObject){
			this.modelObject = modelObject;
		}
		public Object getModelObject(){
			return this.modelObject;
		}
	}
	
    public GanttViewerRow createRow(Object modelObject){
        GanttViewerRow tbr = new GanttViewerRow(modelObject);
        return tbr;
    }
    
    public GanttViewerInterval createInterval(Object modelObject){
        GanttViewerInterval  interval = new GanttViewerInterval(modelObject);
        return interval;
    }
    
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			DefaultHierarchicalTimeBarModel model = null;
			GanttViewerRow rootNode = null;
			Object modelElement = input;
	        //rootNode = this.createRow(modelElement);
			//model = new DefaultHierarchicalTimeBarModel(rootNode);
			//this.timeBarModel = model;
			this.timeBarViewer.setModel(timeBarModel);
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		if ( this.timeBarModel!=null) {
		
			GanttViewerRow rootNode = (GanttViewerRow)this.timeBarModel.getRootNode();
			if ( rootNode != null){
				this.refreshNode(rootNode);
			}
			
			this.timeBarViewer.getHierarchicalViewState().setExpandedRecursive(rootNode, true);
		}
		this.timeBarViewer.redraw();
	}
	
	public void refreshNodeLabel(GanttViewerRow row){
		String labelToBe = this.getILabelProvider().getText(row.getModelObject());
		String labelAsIs = row.getGanttRowHeader().getLabel();
		if ( !labelToBe.equals(labelAsIs)){
			row.getGanttRowHeader().setLabel(labelToBe);
		}
	}
	
	
	public void refreshNodeInterval(GanttViewerInterval interval){
		Object modelElement = interval.getModelObject();
		// begin
		Date startToBe = this.getIIntervalEventProvider().getIntervalEventStart(modelElement);
		JaretDate startAsIs = interval.getBegin();
		if (  startAsIs==null || startToBe.compareTo(startAsIs.getDate())!= 0 ){
			interval.setBegin(new JaretDate(startToBe));
		}
		
		// end
		Date endToBe   = this.getIIntervalEventProvider().getIntervalEventEnd(modelElement);
		JaretDate endAsIs = interval.getEnd();
		if (  endAsIs == null || endToBe.compareTo(endAsIs.getDate())!= 0 ){
			interval.setEnd(new JaretDate(endToBe));
		}
	}

	public void refreshNodeRow(GanttViewerRow row){
		// refresh the label
		this.refreshNodeLabel(row);
		this.refreshNodeRowSubrows(row);
		this.refreshNodeRowIntervals(row);
	}
	
	public void refreshNodeRowSubrows(GanttViewerRow row){
		// refresh the child rows
		// get the as is
		Object modelElement = row.getModelObject();
		HashMap<Object, GanttViewerRow> ganttChildRowsAsIs = new HashMap<Object, GanttViewerRow>();
		for ( TimeBarNode childRowAsIs : row.getChildren()){
			GanttViewerRow ganttChildRowAsIs = (GanttViewerRow) childRowAsIs;
			ganttChildRowsAsIs.put(ganttChildRowAsIs.getModelObject(), ganttChildRowAsIs);
		}
		// update the child rows
		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(modelElement);
		for (Object childModelElement : childrenModelElement) {
			if( this.getIIntervalEventProvider().isIntervalEvents(childModelElement) ) {
				// the node is a row
				GanttViewerRow ganttChildRow = ganttChildRowsAsIs.get(childModelElement);
				if ( ganttChildRow == null){
					// create the row
					ganttChildRow= this.createRow(childModelElement);
					row.addNode(ganttChildRow);
				}
				else {
					ganttChildRowsAsIs.remove(modelElement);
				}
				this.refreshNodeRow(ganttChildRow);
			}
		}
	}

	public void refreshNodeRowIntervals(GanttViewerRow row){
	}
	
	
		
		// refresh the child rows
		// get the as is
		Object modelElement = row.getModelObject();
		HashMap<Object, GanttViewerRow> ganttChildRowsAsIs = new HashMap<Object, GanttViewerRow>();
		HashMap<Object, GanttViewerInterval> childIntervalsAsIs = new HashMap<Object, GanttViewerInterval>();
		for ( TimeBarNode childRowAsIs : row.getChildren()){
			GanttViewerRow ganttChildRowAsIs = (GanttViewerRow) childRowAsIs;
			ganttChildRowsAsIs.put(ganttChildRowAsIs.getModelObject(), ganttChildRowAsIs);
		}
		for (  Interval intervalAsIs : row.getIntervals()){
			GanttViewerInterval ganttIntervalAsIs = (GanttViewerInterval)intervalAsIs;
			childIntervalsAsIs.put(ganttIntervalAsIs.getModelObject(), ganttIntervalAsIs);
		}
		
		// update the child rows
		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(modelElement);
		for (Object childModelElement : childrenModelElement) {
			if( this.getIIntervalEventProvider().isIntervalEvent(childModelElement) ) {
				// the node is an interval
				GanttViewerInterval ganttInterval = childIntervalsAsIs.get(childModelElement);
				if ( ganttInterval == null){
					// create the interval
					ganttInterval = this.createInterval(childModelElement);
					this.refreshNode(ganttInterval);
					row.addInterval(ganttInterval);
				} else {
					// refresh the interval
					childIntervalsAsIs.remove(childModelElement);
					this.refreshNode(ganttInterval);
				}
			} else {
				// the node is a row
				GanttViewerRow ganttChildRow = ganttChildRowsAsIs.get(childModelElement);
				if ( ganttChildRow == null){
					// create the row
					ganttChildRow= this.createRow(childModelElement);
					row.addNode(ganttChildRow);
				}
				else {
					ganttChildRowsAsIs.remove(modelElement);
				}
				this.refreshNode(ganttChildRow);
			}
		}
		
		// remove the rows too many
		for(GanttViewerRow rowAsIs : ganttChildRowsAsIs.values()){
			row.remNode(rowAsIs);
		}
		// remove the intervals too many
		for ( GanttViewerInterval intervalAsIs : childIntervalsAsIs.values()){
			row.remInterval(intervalAsIs);
		}
	}
}
