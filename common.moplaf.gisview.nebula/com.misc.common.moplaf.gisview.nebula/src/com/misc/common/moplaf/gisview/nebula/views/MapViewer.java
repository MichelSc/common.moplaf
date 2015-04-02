package com.misc.common.moplaf.gisview.nebula.views;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.widgets.geomap.GeoMap;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.gisview.MapViewerAbstract;


public class MapViewer extends MapViewerAbstract {

	// fields 
	private GeoMap geoMap;

	// constructor
	public MapViewer(Composite parent){
		// make the control
		this.geoMap = new GeoMap(parent, SWT.H_SCROLL | SWT.V_SCROLL);

		super.hookControl(this.geoMap);
        
	}
	
	@Override
	public Control getControl() {
		return this.geoMap;
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
		// receives the selected object
		// call setSelectedObject
		Object selectedObject = null;
		// to do ....
		
		this.setSelectedElement(selectedObject);
	}

	// ******************************
	// map to jaret
	// ******************************
	public class MapMarker  {
		private Object modelObject;
		private float longitude;
		private float latitude;
		
		public MapMarker (Object modelObject){
			this.modelObject = modelObject;
		}

		public Object getModelObject(){
			return this.modelObject;
		}
	}
	
    public MapMarker createRow(Object modelObject){
        MapMarker marker = new MapMarker(modelObject);
        return marker;
    }
    
    
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			Object modelElement = input;
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		this.geoMap.redraw();
	}
	
	private void refresh(Object modelElement){
		
	}
	
	

		
}
