package com.misc.common.moplaf.timeview.jaret.views;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

import com.misc.common.moplaf.timeview.GanttViewerAbstract;

import de.jaret.util.date.Interval;
import de.jaret.util.date.IntervalImpl;
import de.jaret.util.date.JaretDate;
import de.jaret.util.swt.SwtGraphicsHelper;
import de.jaret.util.ui.timebars.TimeBarViewerDelegate;
import de.jaret.util.ui.timebars.model.DefaultHierarchicalTimeBarModel;
import de.jaret.util.ui.timebars.model.DefaultRowHeader;
import de.jaret.util.ui.timebars.model.DefaultTimeBarNode;
import de.jaret.util.ui.timebars.model.TimeBarNode;
import de.jaret.util.ui.timebars.swt.TimeBarViewer;
import de.jaret.util.ui.timebars.swt.renderer.DefaultHierarchyRenderer;
import de.jaret.util.ui.timebars.swt.renderer.DefaultRenderer;
import de.jaret.util.ui.timebars.swt.renderer.DefaultTitleRenderer;
import de.jaret.util.ui.timebars.strategy.DefaultOverlapStrategy;
import de.jaret.util.ui.timebars.TimeBarViewerInterface;


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

		this.timeBarViewer.setTimeBarRenderer(new IntervalRendeder());

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
	// Renderer
	// ******************************
	protected class IntervalRendeder extends DefaultRenderer{
		
		private Color getForeground(Interval interval, boolean selected){
			Color color = null;
			if ( interval instanceof GanttViewerInterval){
				GanttViewerInterval ganttInterval = (GanttViewerInterval)interval;
				color = ganttInterval.getForegroundToBe();
			} 
			if ( color == null){
				color = Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
			}
			return color;
		}
		
		private Color getBackground(Interval interval, boolean selected){
			Color color = null;
	        if (!selected) {
	        	// not selected
				if ( interval instanceof GanttViewerInterval){
					GanttViewerInterval ganttInterval = (GanttViewerInterval)interval;
					color = ganttInterval.getBackgroundToBe();
				} 
				if ( color == null) {
		            color = Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
				}
	        } else {
	        	// selected
	            color = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
	        }
			return color;
		}
		
		private String getText(Interval interval){
			if ( interval instanceof GanttViewerInterval){
				GanttViewerInterval ganttInterval = (GanttViewerInterval)interval;
				return ganttInterval.getTextToBe();
			}
			return interval.toString();
		}
		@Override
	    public void draw(GC gc, Rectangle drawingArea, TimeBarViewerDelegate delegate, Interval interval,
	            boolean selected, boolean printing, boolean overlap) {
	        _delegate = delegate;
			
	        drawFocus(gc, drawingArea, delegate, interval, selected, printing, overlap);

	        boolean horizontal = delegate.getOrientation() == TimeBarViewerInterface.Orientation.HORIZONTAL;
	        Rectangle iRect = getIRect(horizontal, drawingArea, overlap);

	        Color bg = gc.getBackground();
	        Color fg = gc.getForeground();
	        
	        String str = this.getText(interval);
            gc.setBackground(this.getBackground(interval, selected));
            gc.setForeground(this.getForeground(interval, selected));
	        gc.fillRectangle(iRect);
	        gc.drawRectangle(iRect);
	        SwtGraphicsHelper.drawStringCentered(gc, str, iRect);

	        gc.setBackground(bg);
	        gc.setForeground(fg);
	    }
		@Override
	    public String getToolTipText(TimeBarViewerDelegate delegate, Interval interval, Rectangle drawingArea, int x,
	            int y, boolean overlapping) {
	        if (contains(delegate, interval, drawingArea, x, y, overlapping)) {
	            return this.getText(interval);
	        }
	        return null;
	    }
		
	};

	
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
	// map to jaret Row
	// ******************************
	public class GanttViewerRow extends DefaultTimeBarNode {
		private Object modelObject;
		private boolean withEvents = true;
		public GanttViewerRow (Object modelObject, boolean withEvents){
			super(new DefaultRowHeader("new row"));
			this.modelObject = modelObject;
			this.withEvents = withEvents;
		}
		public DefaultRowHeader getGanttRowHeader(){
			return (DefaultRowHeader)this.getRowHeader();
		}
		public Object getModelObject(){
			return this.modelObject;
		}
		
		public String getTextToBe(){
			String labelToBe = GanttViewer.this.getILabelProvider().getText(this.modelObject);
			return labelToBe;
		}
	}
	
	// ******************************
	// map to jaret Interval
	// ******************************
	public class GanttViewerInterval extends IntervalImpl {
		private Object modelObject;
		public GanttViewerInterval(Object modelObject){
			this.modelObject = modelObject;
		}
		public Object getModelObject(){
			return this.modelObject;
		}
		
		public String getTextToBe(){
			String labelToBe = GanttViewer.this.getILabelProvider().getText(this.modelObject);
			return labelToBe;
		}
		
		public Color getForegroundToBe(){
			Color colorToBe = GanttViewer.this.getIColorProvider().getForeground(this.modelObject);
			return colorToBe;
		}

		public Color getBackgroundToBe(){
			Color colorToBe = GanttViewer.this.getIColorProvider().getBackground(this.modelObject);
			return colorToBe;
		}
		
		public Date getStartToBe(){
			Date startToBe = GanttViewer.this.getIIntervalEventProvider().getIntervalEventStart(this.modelObject);
			return startToBe;
		}
		public Date getEndToBe(){
			Date endToBe = GanttViewer.this.getIIntervalEventProvider().getIntervalEventEnd(this.modelObject);
			return endToBe;
		}
	}
	
    public GanttViewerRow createRow(Object modelObject, boolean withEvents){
        GanttViewerRow tbr = new GanttViewerRow(modelObject, withEvents);
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
			boolean eventsOnRoot = this.getIIntervalEventProvider().isIntervalEvents(input);
	        rootNode = this.createRow(modelElement, eventsOnRoot);
			model = new DefaultHierarchicalTimeBarModel(rootNode);
			this.timeBarModel = model;
			this.timeBarViewer.setModel(timeBarModel);
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		if ( this.timeBarModel!=null) {
		
			GanttViewerRow rootNode = (GanttViewerRow)this.timeBarModel.getRootNode();
			if ( rootNode != null){
				this.refreshNodeRow(rootNode);
			}
			
			this.timeBarViewer.getHierarchicalViewState().setExpandedRecursive(rootNode, true);
		}
		this.timeBarViewer.redraw();
	}
	
	public void refreshNodeLabel(GanttViewerRow row){
		String labelToBe = row.getTextToBe();
		String labelAsIs = row.getGanttRowHeader().getLabel();
		if ( !labelToBe.equals(labelAsIs)){
			row.getGanttRowHeader().setLabel(labelToBe);
		}
	}
	
	public void refreshNodeInterval(GanttViewerInterval interval){
		// begin
		Date startToBe = interval.getStartToBe();
		JaretDate startAsIs = interval.getBegin();
		if (  startAsIs==null || startToBe.compareTo(startAsIs.getDate())!= 0 ){
			interval.setBegin(new JaretDate(startToBe));
		}
		
		// end
		Date endToBe   = interval.getEndToBe();
		JaretDate endAsIs = interval.getEnd();
		if (  endAsIs == null || endToBe.compareTo(endAsIs.getDate())!= 0 ){
			interval.setEnd(new JaretDate(endToBe));
		}
	}

	private void refreshNodeRow(GanttViewerRow row){
		// refresh the label
		this.refreshNodeLabel(row);
		this.refreshNodeRowSubrows(row);
		this.refreshNodeRowIntervals(row);
	}
	
	private void refreshNodeRowSubrows(GanttViewerRow row, HashMap<Object, GanttViewerRow> ganttChildRowsAsIs, Object modelElement){
		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(modelElement);
		for (Object childModelElement : childrenModelElement) {
			if( this.getIIntervalEventProvider().isIntervalEvents(childModelElement) ) {
				// the model element is a row
				GanttViewerRow ganttChildRow = ganttChildRowsAsIs.get(childModelElement);
				if ( ganttChildRow == null){
					// create the row
					ganttChildRow= this.createRow(childModelElement, true);
					row.addNode(ganttChildRow);
				}
				else {
					// update
					ganttChildRowsAsIs.remove(modelElement);
				}
				this.refreshNodeRow(ganttChildRow);
			} else { 
				// the model element is not a row
				this.refreshNodeRowSubrows(row, ganttChildRowsAsIs, childModelElement);
			}
	    }
	}

	private void refreshNodeRowSubrows(GanttViewerRow row){
		// refresh the child rows
		// get the as is
		HashMap<Object, GanttViewerRow> ganttChildRowsAsIs = new HashMap<Object, GanttViewerRow>();
		for ( TimeBarNode childRowAsIs : row.getChildren()){
			GanttViewerRow ganttChildRowAsIs = (GanttViewerRow) childRowAsIs;
			ganttChildRowsAsIs.put(ganttChildRowAsIs.getModelObject(), ganttChildRowAsIs);
		}
		// do the refresh
		this.refreshNodeRowSubrows(row,  ganttChildRowsAsIs, row.getModelObject());
		// remove the rows too many
		for(GanttViewerRow rowAsIs : ganttChildRowsAsIs.values()){
			row.remNode(rowAsIs);
		}
	}

	private void refreshNodeRowIntervals(GanttViewerRow row){
		HashMap<Object, GanttViewerInterval> childIntervalsAsIs = new HashMap<Object, GanttViewerInterval>();
		for (  Interval intervalAsIs : row.getIntervals()){
			GanttViewerInterval ganttIntervalAsIs = (GanttViewerInterval)intervalAsIs;
			childIntervalsAsIs.put(ganttIntervalAsIs.getModelObject(), ganttIntervalAsIs);
		}
		
		if ( row.withEvents )  {
			Object[] childrenModelElement = this.getIIntervalEventProvider().getIntervalEvents(row.getModelObject());
			for (Object childModelElement : childrenModelElement) {
				// the node is an interval
				GanttViewerInterval ganttInterval = childIntervalsAsIs.get(childModelElement);
				if ( ganttInterval == null){
					// create the interval
					ganttInterval = this.createInterval(childModelElement);
					this.refreshNodeInterval(ganttInterval);
					row.addInterval(ganttInterval);
				} else {
					// update the interval
					childIntervalsAsIs.remove(childModelElement);
					this.refreshNodeInterval(ganttInterval);
				}
			}
		}
		
		// remove the intervals too many
		for ( GanttViewerInterval intervalAsIs : childIntervalsAsIs.values()){
			row.remInterval(intervalAsIs);
		}
	}
}
