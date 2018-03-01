package com.misc.common.moplaf.gisview.emf.editor.provider;
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


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.gisview.ILocation;
import com.misc.common.moplaf.gisview.ILocationProvider;
import com.misc.common.moplaf.gisview.IPathProvider;
import com.misc.common.moplaf.gisview.Wrapper;
import com.misc.common.moplaf.gisview.emf.edit.IItemLocationsProvider;
import com.misc.common.moplaf.gisview.emf.edit.IItemPathsProvider;

/**
 * An {@link AdapterFactoryGisProvider} implements the interface {@link ILocationProvider} for different kind of providers:
 * <ul>
 * <li> {@link IItemLocationsProvider}</li>
 * </ul>
 * <p>
 * @author MiSc
 *
 */
public class AdapterFactoryGisProvider extends AdapterFactoryArrayContentProvider implements ILocationProvider, IPathProvider {

	/**
	 * 
	 * @param adapterFactory
	 */
	public AdapterFactoryGisProvider(AdapterFactory adapterFactory){
		super(adapterFactory);
	}

	/**
	 * 
	 */
	public void dispose(){
		super.dispose();
	}
	
	@Override
	public Object[] getChildren(Object object) {
		IItemLocationsProvider locs_provider = this.getLocationsProvider(object);
		IItemPathsProvider paths_provider = this.getPathsProvider(object);
		Object[] children = super.getChildren(object);
		if ( locs_provider==null && paths_provider==null) {
			return children;
		}
		ArrayList<Object> providers = new ArrayList<Object>();
		for ( int i=0; i<children.length; i++){
			providers.add(children[i]);
		}
		if ( locs_provider!=null) {
			this.collectLocationProviders(object, locs_provider, providers);
		}
		if ( paths_provider!=null) {
			this.collectPathProviders(object, paths_provider, providers);
		}
		return providers.toArray();
	}
	
	@Override
	public Object getParent(Object object) {
		if ( object instanceof LocationProvider){
			LocationProvider provider = (LocationProvider) object;
			return provider.element;
		}
		if ( object instanceof PathProvider){
			PathProvider provider = (PathProvider) object;
			return provider.element;
		}
		return super.getParent(object);
	}

	private IItemLocationsProvider getLocationsProvider(Object element){
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemLocationsProvider locationsProvider = (IItemLocationsProvider) adapterFactory.adapt(element, IItemLocationsProvider.class);
		return locationsProvider;
	}
		
	private IItemPathsProvider getPathsProvider(Object element){
	AdapterFactory adapterFactory = this.getAdapterFactory();
	IItemPathsProvider pathsProvider = (IItemPathsProvider) adapterFactory.adapt(element, IItemPathsProvider.class);
	return pathsProvider;
	}
	
	/**
	 * Return a collection of object extending the private class  {@link LocationProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider} and specific methods for supporting {@link ILocationProvider}
	 * <p>
	 */
	private void collectLocationProviders(Object element, IItemLocationsProvider locationsProvider, ArrayList<Object> providers){
		Object locations = locationsProvider.getLocations(element);
		if ( locations == null ) {
			int nr_locations = locationsProvider.getNrLocations(element);
			for ( int location_index = 0; location_index<nr_locations; location_index++) {
				LocationProvider provider = this.createLocationProvider(element, location_index, locationsProvider);
				providers.add(provider);
			}
		} else if ( locations instanceof Collection<?>) {
			Collection<?> collection = (Collection<?>)locations;
			// the element HAS locations
			for ( Object location : collection){
				LocationProvider provider = this.createLocationProvider(element, location, locationsProvider);
				providers.add(provider);
			}
		} else {
			// the element HAS one location
			LocationProvider provider = this.createLocationProvider(element, locations, locationsProvider);
			providers.add(provider);
		}
	}
	
	/**
	 * Return a collection of object extending the private class  {@link PathProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider} and specific methods for supporting {@link IPathProvider}
	 * <p>
	 */
	private void collectPathProviders(Object element, IItemPathsProvider pathsProvider, ArrayList<Object> providers){
		Object paths = pathsProvider.getPaths(element);
		if ( paths == null ) {
			int nr_paths = pathsProvider.getNrPaths(element);
			for ( int path_index = 0; path_index<nr_paths; path_index++) {
				PathProvider provider = this.createPathProvider(element, path_index, pathsProvider);
				providers.add(provider);
			}
		} else if ( paths instanceof Collection<?>) {
			Collection<?> collection = (Collection<?>)paths;
			// the element HAS paths
			for ( Object path : collection){
				PathProvider provider = this.createPathProvider(element, path, pathsProvider);
				providers.add(provider);
			}
		} else {
			// the element HAS one path
			PathProvider provider = this.createPathProvider(element, paths, pathsProvider);
			providers.add(provider);
		}
	}

	/**
	 * 
	 * @param element
	 * @param location
	 * @param provider
	 * @return
	 */
	private LocationProvider createLocationProvider(Object element, Object location, IItemLocationsProvider provider){
		return new LocationProvider(element, location, provider);
	}

	
	/**
	 * 
	 * @param element
	 * @param path
	 * @param provider
	 * @return
	 */
	private PathProvider createPathProvider(Object element, Object path, IItemPathsProvider provider){
		return new PathProvider(element, path, provider);
	}

	/**
	 * Helper class for the conversion of an IItemLocationsProvider (abstract), represent a Location 
	 */
	private class LocationProvider implements IItemLabelProvider, IItemColorProvider, ILocation, Wrapper {
		protected IItemLocationsProvider locationsProvider;
		protected Object element;
		protected Object location;
		
		/**
		 * 
		 * @param nativeObject
		 * @param locationKey
		 * @param locationsProvider
		 */
		public LocationProvider(Object element, Object location, IItemLocationsProvider locationsProvider) {
			super();
			this.element = element;
			this.location = location;
			this.locationsProvider = locationsProvider;
		}

		public Object unwrap(){
			return element;
		}

		@Override
		public String getText(Object object) {
			return this.locationsProvider.getLocationText(this.element, this.location);
		}

		@Override
		public Object getForeground(Object object) {
			return this.locationsProvider.getLocationForeground(this.element, this.location);
		}

		@Override
		public Object getBackground(Object object) {
			return null;
		}

		@Override
		public Object getImage(Object object) {
			return this.locationsProvider.getLocationImage(this.element, this.location);
		}

		@Override
		public double getLongitude() {
			return this.locationsProvider.getLocationLongitude(this.element, this.location);
		}

		@Override
		public double getLatitude() {
			return this.locationsProvider.getLocationLatitude(this.element, this.location);
		}

		@Override
		public double getElevation() {
			return this.locationsProvider.getLocationElevation(this.element, this.location);
		}
	};
	
	/**
	 * Helper class for the conversion of an IItemLocationsProvider (abstract), represent a Location 
	 */
	private class PathProvider implements IItemLabelProvider, IItemColorProvider, Wrapper {
		protected IItemPathsProvider pathsProvider;
		protected Object element;
		protected Object path;
		
		private class PathStop implements ILocation {
			private Object stop;

			public PathStop(Object stop) {
				super();
				this.stop = stop;
			}

			@Override
			public double getLongitude() {
				IItemPathsProvider pathsProvider = PathProvider.this.pathsProvider;
				Object             element       = PathProvider.this.element;
				Object 			   path          = PathProvider.this.path;
				return pathsProvider.getPathStopLongitude(element, path, this.stop);
			}

			@Override
			public double getLatitude() {
				IItemPathsProvider pathsProvider = PathProvider.this.pathsProvider;
				Object             element       = PathProvider.this.element;
				Object 			   path          = PathProvider.this.path;
				return pathsProvider.getPathStopLatitude(element, path, this.stop);
			}

			@Override
			public double getElevation() {
				IItemPathsProvider pathsProvider = PathProvider.this.pathsProvider;
				Object             element       = PathProvider.this.element;
				Object 			   path          = PathProvider.this.path;
				return pathsProvider.getPathStopElevation(element, path, this.stop);
			}
			
		};
		
		
		/**
		 * 
		 * @param nativeObject
		 * @param locationKey
		 * @param locationsProvider
		 */
		public PathProvider(Object element, Object path, IItemPathsProvider pathsProvider) {
			super();
			this.element = element;
			this.path = path;
			this.pathsProvider = pathsProvider;
		}
		
	
		public Object unwrap(){
			return element;
		}
	
		@Override
		public String getText(Object object) {
			return this.pathsProvider.getPathText(this.element, this.path);
		}
	
		@Override
		public Object getForeground(Object object) {
			return this.pathsProvider.getPathForeground(this.element, this.path);
		}
	
		public ILocation[] getPathStops() {
			ILocation[] locations ;
			List<?> stops = this.pathsProvider.getPathStops(this.element, this.path);
			if ( stops !=null) {
				locations = new PathStop[stops.size()];
				int i = 0;
				for (Object stop : stops) {
					locations[i] = new PathStop(stop);
					i++;
				}
			} else {
				int nr_stops = this.pathsProvider.getNrPathStops(this.element,  this.path);
				locations = new PathStop[nr_stops];
				for (int i= 0; i<nr_stops; i++) {
					locations[i] = new PathStop(i);
				}
			}
			return locations;
		}

		@Override
		public Object getBackground(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getImage(Object object) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	/**
	 * Specified by {@link ILocationProvider}
	 * 
	 */
	@Override
	public boolean isLocation(Object element) {
		if ( element instanceof LocationProvider){
			return true;
		}
		return false;
	}

	/**
	 * Specified by {@link ILocationProvider}
	 * 
	 */
	@Override
	public ILocation getLocation(Object element) {
		LocationProvider provider = (LocationProvider) element;
		return provider;
	}

	/**
	 * Specified by {@link IPathProvider}
	 * 
	 */
	@Override
	public boolean isPath(Object element) {
		if ( element instanceof PathProvider){
			return true;
		}
		return false;
	}

	/**
	 * Specified by {@link IPathProvider}
	 * 
	 */
	@Override
	public ILocation[] getPathStops(Object element) {
		PathProvider provider = (PathProvider) element;
		return provider.getPathStops();
	}

}
