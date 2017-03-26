/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.gisview.nebula.views;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.widgets.geomap.GeoMap;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Image;

import com.misc.common.moplaf.gisview.MapViewerAbstract;


public class MapViewer extends MapViewerAbstract {

	public class MapMarker  {
		private Object modelObject;
		private float longitude;
		private float latitude;
		private Image image;
		
		public MapMarker (Object modelObject){
			this.modelObject = modelObject;
		}

		public Object getModelObject(){
			return this.modelObject;
		}
	}

	// fields 
	private GeoMap geoMap;
	private HashMap<Object, MapMarker> markers= new HashMap<Object, MapMarker>();

	// constructor
	public MapViewer(Composite parent){
		// make the control
		this.geoMap = new GeoMap(parent, SWT.H_SCROLL | SWT.V_SCROLL){
		   // paint control
		    protected void paintControl(PaintEvent e) {
				// first the map
			    super.paintControl(e);
			    // second the points
			    GC gc = e.gc;
			    for ( MapMarker marker : MapViewer.this.markers.values()){
			    	Point mapposition = this.getMapPosition();
			        int x = lon2position(marker.longitude, getZoom());
			        int y = lat2position(marker.latitude, getZoom());
			        Image icon = marker.image;
			        gc.drawImage(icon, x-mapposition.x, y-mapposition.y);
			    } // traverse the points to draw        
		    } // method paintControl
		};

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

	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		// sych the things to show with the state of the widget
		HashSet<Object> objectsToRemove = new HashSet<Object>(this.markers.keySet());
		Object objectToShow = this.getInput();
		if ( this.getILocationProvider().isLocation(objectToShow)){
			MapMarker marker = this.markers.get(objectToShow);
			if ( marker==null ){
				// create
				marker = new MapMarker(objectToShow);
				this.markers.put(objectToShow, marker);
			}
			// update
			marker.longitude = this.getILocationProvider().getLongitude(objectToShow);
			marker.latitude  = this.getILocationProvider().getLatitude(objectToShow);
			marker.image     = this.getILabelProvider().getImage(objectToShow);
		}
		// delete
		for ( Object objectToRemove : objectsToRemove){
			this.markers.remove(objectToRemove);
		}
		
		this.geoMap.redraw();
	}
	
		
}
