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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.widgets.geomap.GeoMap;
import org.eclipse.nebula.widgets.geomap.GeoMapUtil;
import org.eclipse.nebula.widgets.geomap.OsmTileServer;
import org.eclipse.nebula.widgets.geomap.PointD;
import org.eclipse.nebula.widgets.geomap.TileServer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.gisview.ILocation;
import com.misc.common.moplaf.gisview.Plugin;
import com.misc.common.moplaf.gisview.viewers.MapViewerAbstract;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Image;


public class MapViewer extends MapViewerAbstract {

	public class MapMarker  {
		private Object modelObject;
		private double longitude;
		private double latitude;
		private Image image;
		private Color color;
		
		public MapMarker (Object modelObject){
			this.modelObject = modelObject;
		}

		public Object getModelObject(){
			return this.modelObject;
		}
	}

	public class MapPath  {
		private Object modelObject;
		private Color color = null;
		
		public MapPath(Object modelObject){
			this.modelObject = modelObject;
		}

		public Object getModelObject(){
			return this.modelObject;
		}
		
		PointD[] points; // map coordinates
	}

	// fields 
	private GeoMap geoMap;
	private HashMap<Object, MapMarker> markers= new HashMap<Object, MapMarker>();
	private HashMap<Object, MapPath> paths= new HashMap<Object, MapPath>();

	// constructor
	public MapViewer(Composite parent){
		// make the control
		this.geoMap = new GeoMap(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		
		// set the tileserver
//		this.geoMap.setTileServer(GoogleTileServer.TILESERVERS[1]);
//		this.geoMap.setTileServer(OsmTileServer.TILESERVERS[0]);
		String url = Plugin.getDefault().getMapServerUrl();
		int maxZoom = Plugin.getDefault().getMapServerMaxZoom();
		TileServer tileServer = new OsmTileServer(url, maxZoom);
		this.geoMap.setTileServer(tileServer);
		
		// add the paint listener
		this.geoMap.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {
				GeoMap map = MapViewer.this.geoMap;
				int zoom = map.getZoom();
				int marker_size = 4;
		    	Point mapposition = map.getMapPosition();
			    GC gc = e.gc;
			    Color foreground_before = gc.getForeground();
			    for ( MapMarker marker : MapViewer.this.markers.values()){
			        int x = GeoMapUtil.lon2position(marker.longitude, zoom);
			        int y = GeoMapUtil.lat2position(marker.latitude, zoom);
			        Image icon = marker.image;
			        if ( icon != null ) {
				        Rectangle bounds = icon.getBounds();
				        gc.drawImage(icon, 
				        		     x-mapposition.x-bounds.width/2, 
				        		     y-mapposition.y-bounds.height/2);
			        } else {
			        	gc.setForeground(marker.color);
			        	gc.drawOval(
			        			x-mapposition.x-marker_size/2, 
			        			y-mapposition.y-marker_size/2, 
			        			marker_size/2, 
			        			marker_size/2);
			        	
			        }
			    } // traverse the points to draw        
			    for ( MapPath path : MapViewer.this.paths.values()){
				    gc.setForeground(path.color);
				    gc.setLineWidth(6);
			    	for ( int i=0; i<path.points.length-1; i++) {
				        int x1 = GeoMapUtil.lon2position(path.points[i].x, zoom);
				        int y1 = GeoMapUtil.lat2position(path.points[i].y, zoom);
				        int x2 = GeoMapUtil.lon2position(path.points[i+1].x, zoom);
				        int y2 = GeoMapUtil.lat2position(path.points[i+1].y, zoom);
				        gc.drawLine(x1-mapposition.x, y1-mapposition.y, x2-mapposition.x, y2-mapposition.y);
			    	}
			    } // traverse the points to draw
			    gc.setForeground(foreground_before);
			}
		});

		super.hookControl(this.geoMap);
		
		TileServer server = this.geoMap.getTileServer();
		String serverAsString = server.toString();
		System.out.println("MapViewer, geoMap created, server "+serverAsString);        
		
		int zoom = this.geoMap.getZoom();
		int x = GeoMapUtil.lon2position(4.414d, zoom);
		int y = GeoMapUtil.lat2position(50.820d, zoom);
		this.geoMap.setCenterPosition(new Point(x,y));
	}
	
	@Override
	public Control getControl() {
		return this.geoMap;
	}
	
	// ******************************
	// selection management
	// ******************************
	private class MapViewerISeletionListener implements ISelectionChangedListener{
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
		this.refreshMarkers();
		this.refreshPaths();
		this.geoMap.redraw();
	}
	
	private void refreshMarkers() {
		// synch the location things to show with the state of the widget
		HashSet<Object> objectsToRemove = new HashSet<Object>(this.markers.keySet());
		ArrayList<Object> locations = new ArrayList<Object>();
		this.collectLocationProviders(locations, this.getInput() , 0); // 0 is the depth as start
		for ( Object location : locations) {
			ILocation location_object = this.getILocationProvider().getLocation(location);
			double longitude = location_object.getLongitude();
			double latitude  = location_object.getLatitude();
			Image image      = this.getILabelProvider()   .getImage(location);
			MapMarker marker = this.markers.get(location);
			// only mark location with image
			// this should be extended to object without images!
			if ( marker==null ) {
				// create
				marker = new MapMarker(location);
				this.markers.put(location, marker);
			} else {
				// keep
				objectsToRemove.remove(location);
			}
			// update
			Color  color = this.getIColorProvider().getForeground(location);
			marker.longitude = longitude; 
			marker.latitude  = latitude;  
			marker.image     = image;     
			marker.color     = color;
		}
		// delete
		for ( Object objectToRemove : objectsToRemove){
			this.markers.remove(objectToRemove);
		}
	}
	
	private void refreshPaths() {
		// synch the path things to show with the state of the widget
		HashSet<Object> objectsToRemove = new HashSet<Object>(this.paths.keySet());
		ArrayList<Object> paths = new ArrayList<Object>();
		this.collectPathProviders(paths, this.getInput() , 0); // 0 is the depth as start
		for ( Object path : paths) {
			MapPath map_path = this.paths.get(path);
			if ( map_path==null ) {
				// create
				map_path = new MapPath(path);
				this.paths.put(path, map_path);
			} else {
				// keep
				objectsToRemove.remove(path);
			}
			// update
			Color  color = this.getIColorProvider().getForeground(path);
			ILocation[] locations = this.getIPathProvider().getPathStops(path);
			map_path.points = new PointD[locations.length];
			map_path.color = color;
			for ( int i = 0; i< locations.length; i++) {
				ILocation location = locations[i];
				map_path.points[i] = new PointD(location.getLongitude(), location.getLatitude());
			}
		}
		// delete
		for ( Object objectToRemove : objectsToRemove){
			this.paths.remove(objectToRemove);
		}
	}
}
