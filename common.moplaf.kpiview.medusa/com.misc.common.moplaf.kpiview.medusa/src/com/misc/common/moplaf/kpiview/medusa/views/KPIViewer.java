package com.misc.common.moplaf.kpiview.medusa.views;

import java.util.HashMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

import com.misc.common.moplaf.kpiview.viewers.KPIViewerAbstract;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.Gauge.SkinType;
import eu.hansolo.medusa.GaugeBuilder;
import javafx.geometry.Insets;
import javafx.scene.Node;
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
	
	// listening to this form selection
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

	// forwarding this form selection
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
	// fields 
	//-------------------------------------------------------------------------------------
    private GridPane pane;  
    private FXCanvas canvas = null;
    static private double TILE_SIZE = 172.0; 
//	private LinkedList<KPIProviderViewed> KPIproviders	 = new LinkedList<KPIProviderViewed>();
//;
	
//	private class KPIProviderViewed {
//		private Object modelObject;
//		private LinkedList<KPIViewed> KPIsViewed;
//		
//		public KPIProviderViewed(Object modelObject) {
//			super();
//			this.modelObject = modelObject;
//			this.KPIsViewed = new LinkedList<KPIViewed>();
//		}
//		
//		public Object getModelObject() {
//			return modelObject;
//		}
//		
//		public void setModelObject(Object modelObject) {
//			this.modelObject = modelObject;
//		}
//
//		public LinkedList<KPIViewed> getKPIsViewed() {
//			return KPIsViewed;
//		}
//		
//		public void dispose(){
//			Iterator<KPIViewed> iterator = this.KPIsViewed.iterator();
//			while ( iterator.hasNext()){
//				KPIViewed next = iterator.next();
//				iterator.remove();
//				next.dispose();
//			}
//		}
//	}
	
//	private class KPIViewed {
//		private Gauge gauge;
//		private Object modelObject;
//		
//		public KPIViewed(Gauge gauge, Object modelObject) {
//			super();
//			this.gauge = gauge;
//			this.modelObject = modelObject;
//		}
//
//		public Gauge getGauge() {
//			return gauge;
//		}
//
//		public Object getModelObject() {
//			return modelObject;
//		}
//		
//		public void dispose(){
//			KPIViewer.this.pane.getChildren().remove(this.gauge);
//			this.gauge = null;
//		}
//		
//	}

	//-------------------------------------------------------------------------------------
	// constructor
	public KPIViewer(Composite parent){
        // FXCanvas
        canvas = new FXCanvas(parent, SWT.NONE);
//        org.eclipse.swt.graphics.Color background = new org.eclipse.swt.graphics.Color(Display.getCurrent(), 130, 116, 133);
//        parent.setBackground(background);
//        canvas.setBackground(background);
//        parent.setBackgroundMode(SWT.INHERIT_FORCE);
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
        canvas.setScene(newScene);
	}
	

	//-------------------------------------------------------------------------------------
	@Override
	public Control getControl() {
		return this.canvas;
	}
	//-------------------------------------------------------------------------------------
	
	//-------------------------------------------------------------------------------------
	// keep model and this form in synch
	//-------------------------------------------------------------------------------------
	/**
	 * Called by ContentViewer.setInput, himself called by KPIViewAbstract.selectionChanged
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			//CommonPlugin.INSTANCE.log("KPIViewer: inputChanged "+input.toString());
			this.refresh();
		}
	}
	
	private class RefreshContext{
		HashMap<java.util.Map.Entry<Integer,Integer>, Node> nodes = new HashMap<>();
		HashMap<String, Integer> rows = new HashMap<>();
        GaugeBuilder builder = GaugeBuilder.create().barColor(Color.rgb(255,183,77))
        		                                    .barBackgroundColor(Color.rgb(39,44,50))
        		                                    .backgroundPaint(Color.rgb(42,42,42))
        		                                    .animated(true)
        		                                    .prefSize(TILE_SIZE, TILE_SIZE);

	};

	/**
	 * Method refresh
	 */
	@Override
	public void refresh() {
		//CommonPlugin.INSTANCE.log("KPIViewer: refresh");

		RefreshContext context = new RefreshContext();
		
		// gather nodes and their positions
		for( Node node : this.pane.getChildren()){
			int row = GridPane.getRowIndex(node);
			int column = GridPane.getColumnIndex(node);
			context.nodes.put(new SimpleEntry<>(row, column), node);
		}
		
		// traverse the providers
		int columnIndex = 0;
		Object[] childrenModelElement = this.getTreeContentProvider().getChildren(this.getInput());
		for ( Object childModelElement : childrenModelElement){
			if ( this.getIKPIProvider().hasKPIs(childModelElement)){
				// the child is a kpi provider
				this.refresh(context, childModelElement, columnIndex);
				// loop control
				columnIndex++;
			}  // the child is a KPIprovider
		}  // traverse the children
		
		// remove the unused nodes
		this.pane.getChildren().removeAll(context.nodes.values());
	}  // refresh
	
	/**
	 * Refresh logic for a KPI provider in a column
	 * @param context
	 * @param provider
	 * @param column
	 */
	private void refresh(RefreshContext context, Object provider, int column){
		for ( Object kpi : this.getIKPIProvider().getKPIs(provider)){
			// get the row
			String kpiid = this.getIKPIProvider().getKPIID(kpi);
			Integer row = context.rows.get(kpiid);
			if ( row==null){
				row = context.rows.size();
				context.rows.put(kpiid, row);
			}
			// get the node
			Node node = context.nodes.remove(new SimpleEntry<>(row, column));
			if ( node == null){
				// create the node
				Gauge gauge = context.builder.build();
//				gauge.setSkinType(SkinType.TILE_KPI);
          	  	gauge.setSkin(new GaugeSkinTypeTilePercentage(gauge));
//                gauge.setValueColor(Color.AQUA);
                gauge.setUnitColor(Color.rgb(90, 90, 90));
                gauge.setValueColor(Color.rgb(90, 90, 90));
	            node = gauge;  
				pane.add(node , row, column);
			}  // create the node
			this.refresh((Gauge)node, kpi);
		}  // traverse the objects to show
	} // method refresh(KPIViewed)

	/**
	 * Refresh logic for a kpi value of a provider on a node
	 * @param gauge
	 * @param kpi
	 */
	private void refresh(Gauge gauge, Object kpi){
		float value = this.getIKPIProvider().getAmount(kpi);
		float minValue = this.getIKPIProvider().getMinAmount(kpi);
		float maxValue = this.getIKPIProvider().getMaxAmount(kpi);
//		String msg = String.format("KPI %f (%f, %f)", value, minValue, maxValue);
//		CommonPlugin.INSTANCE.log("KPIViewer: refresh node "+msg);
		gauge.setValue(value);
        gauge.setMinValue(minValue);
        gauge.setMaxValue(maxValue);
        // not supported by TILES gauges
//        gauge.setMinMeasuredValue(20.0);
//        gauge.setMinMeasuredValueVisible(true);
        // starts from zero
//        gauge.setStartFromZero(false);
        // lcd supported by AMP, INDICATOR, HORIZONTAL, QUARTER
//        gauge.setLcdVisible(false);;
        // serctions are supported by BULLET_CHART, SIMPLE, TINY, SECTION, SIMPLE_SECTION
//        gauge.addSection(new Section(10,20, Color.AZURE));
//        gauge.addSection(new Section(33,50, Color.YELLOW));
        // areas supported by INDICATOR, HORIZONTAL, VERTICAL, QUARTER
//        gauge.setAreasVisible(true);
//        gauge.addArea(new Section(80,100, Color.RED));
        // threshold supported by BULLETCHART, KPI, MODERN, INDICATOR, HORIZONTAL, VERTICAL, QUARTER, TILEKPI
//        gauge.setThresholdVisible(true);
//        gauge.setThreshold(654);
//        gauge.setThresholdColor(Color.RED);
//        gauge.addSection(new Section(600, 1000, Color.GREEN));
//        gauge.setSectionsVisible(false);
	} // method refresh(KPIViewed)
}; // class KPIViewer


	
	

