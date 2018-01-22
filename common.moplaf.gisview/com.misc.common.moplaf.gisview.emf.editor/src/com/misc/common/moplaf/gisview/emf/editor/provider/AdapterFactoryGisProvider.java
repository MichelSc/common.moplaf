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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.gisview.ILocationProvider;
import com.misc.common.moplaf.gisview.Wrapper;
import com.misc.common.moplaf.gisview.emf.edit.IItemLocationsProvider;

/**
 * An {@link AdapterFactoryGisProvider} implements the interface {@link IIntervalEventProvider} for different kind of providers:
 * <ul>
 * <li> {@link IItemTimeLinesEventsProvider}</li>
 * <li> {@link IItemTimeLinesIntervalsProvider}</li>
 * <li> {@link IItemTimeLinesEventsIntervalsProvider}</li>
 * </ul>
 * <p>
 * @author MiSc
 *
 */
public class AdapterFactoryGisProvider extends AdapterFactoryArrayContentProvider implements ILocationProvider {

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
		ArrayList<Object> providers = this.getLocationProviders(object);
		if ( providers==null){
			return super.getChildren(object);
		}
		Object[] children = super.getChildren(object);
		for ( int i=0; i<children.length; i++){
			providers.add(children[i]);
		}
		return providers.toArray();
	}
	
	@Override
	public Object getParent(Object object) {
		if ( object instanceof LocationProvider){
			LocationProvider provider = (LocationProvider) object;
			return provider.element;
		}
			
		return super.getParent(object);
	}

	/**
	 * Return a collection of object extending the private class  {@link TimeLineProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider} and specific methods for supporting {@link IIntervalEventProvider}
	 * <p>
	 */
	private ArrayList<Object> getLocationProviders(Object element){
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemLocationsProvider locationsProvider = (IItemLocationsProvider) adapterFactory.adapt(element, IItemLocationsProvider.class);
		
		if ( locationsProvider==null ) { return null; }
		
		ArrayList<Object> providers = new ArrayList<Object>();
		Collection<?> locations = locationsProvider.getLocations(element);
		if ( locations == null ) {
			// the element IS a location
			LocationProvider provider = this.createLocationProvider(element, null, locationsProvider);
			providers.add(provider);
		} else {
			// the element HAS time lines
			for ( Object timeLine : locations){
				LocationProvider provider = this.createLocationProvider(element, timeLine, locationsProvider);
				providers.add(provider);
			}
		}
		return providers;
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
	 * Helper class for the conversion of an IItemLocationsProvider (abstract), represent a Location 
	 */
	private class LocationProvider implements IItemLabelProvider, IItemColorProvider, Wrapper {
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

		public double getLongitude() {
			return this.locationsProvider.getLocationLongitude(this.element, this.location);
		}

		public double getLatitude() {
			return this.locationsProvider.getLocationLatitude(this.element, this.location);
		}

		public double getElevation() {
			return this.locationsProvider.getLocationElevation(this.element, this.location);
		}
	};
	
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
	public double getLongitude(Object element) {
		LocationProvider provider = (LocationProvider) element;
		return provider.getLongitude();
	}

	/**
	 * Specified by {@link ILocationProvider}
	 * 
	 */
	@Override
	public double getLatitude(Object element) {
		LocationProvider provider = (LocationProvider) element;
		return provider.getLatitude();
	}

	/**
	 * Specified by {@link ILocationProvider}
	 * 
	 */
	@Override
	public double getElevation(Object element) {
		LocationProvider provider = (LocationProvider) element;
		return provider.getElevation();
	}

}
