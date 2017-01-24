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
	private LinkedList<KPIProviderViewed> KPIproviders	 = new LinkedList<KPIProviderViewed>();
;
	
	private int rowsSpan = 5;
	private int columnSpan = 10;

	private class KPIProviderViewed {
		private Object modelObject;
		private LinkedList<KPIViewed> KPIsViewed;
		
		public KPIProviderViewed(Object modelObject) {
			super();
			this.modelObject = modelObject;
			this.KPIsViewed = new LinkedList<KPIViewed>();
		}
		
		public Object getModelObject() {
			return modelObject;
		}
		
		public void setModelObject(Object modelObject) {
			this.modelObject = modelObject;
		}

		public LinkedList<KPIViewed> getKPIsViewed() {
			return KPIsViewed;
		}
		
		public void dispose(){
			Iterator<KPIViewed> iterator = this.KPIsViewed.iterator();
			while ( iterator.hasNext()){
				KPIViewed next = iterator.next();
				iterator.remove();
				next.dispose();
			}
		}
	}
	
	private class KPIViewed {
		private Gauge gauge;
		private Object modelObject;
		
		public KPIViewed(Gauge gauge, Object modelObject) {
			super();
			this.gauge = gauge;
			this.modelObject = modelObject;
		}

		public Gauge getGauge() {
			return gauge;
		}

		public Object getModelObject() {
			return modelObject;
		}
		
		public void dispose(){
			KPIViewer.this.pane.getChildren().remove(this.gauge);
			this.gauge = null;
		}
		
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
		
		int columnIndex = 0;
		Iterator<KPIProviderViewed> iteratorKPI = this.KPIproviders.iterator();
		KPIProviderViewed currentKPI = iteratorKPI.hasNext() ? iteratorKPI.next() : null;
		for ( Object childModelElement : childrenModelElement){
			if ( this.getIKPIProvider().hasKPIs(childModelElement)){
				// the child is a kpis provider
				if ( currentKPI==null ){
					// no more element in the list
					// add a new one
					KPIProviderViewed newKPIProviderViewed = new KPIProviderViewed(childModelElement);
					this.KPIproviders.add(newKPIProviderViewed);
					this.refresh(newKPIProviderViewed, columnIndex);
				} else if (currentKPI.getModelObject()==childModelElement){
					// this is the same
					// update
					this.refresh(currentKPI, columnIndex);
				} else {
					// this is a different one
					currentKPI.dispose();
					currentKPI.setModelObject(childModelElement);
					this.refresh(currentKPI, columnIndex);
				}
				// loop control
				columnIndex++;
				currentKPI = iteratorKPI.hasNext() ? iteratorKPI.next() : null;
			}  // the child is a KPIprovider
		}  // traverse the children
		while ( iteratorKPI.hasNext() ){
			KPIProviderViewed next = iteratorKPI.next();
			next.dispose();
			iteratorKPI.remove();
		}
	}  // refresh
	
	private void refresh(KPIProviderViewed provider, int column){
		Object modelObject = null;
		
		float kpi = this.getIKPIProvider().getAmount(modelObject);
	} // method refresh(KPIViewed)

	private void refresh(KPIViewed kpiViewed, int row){
		Object modelObject = null;
		
		float kpi = this.getIKPIProvider().getAmount(modelObject);
	} // method refresh(KPIViewed)
}; // class KPIViewer


	
	

