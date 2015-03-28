package com.misc.common.moplaf.gisview.impl;


import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.gisview.ILocationProvider;

public class AdapterFactoryLocationProvider implements
		ILocationProvider {
	private AdapterFactory adapterFactory;
	
	private Object lastElement = null;
	private IItemLocationProvider lastElementItemLocationProvider = null;
	
	private IItemLocationProvider getLocationItemProvider(Object element){
		if ( element == this.lastElement ) { return this.lastElementItemLocationProvider; }
		IItemLocationProvider intervalEventItemProvider = (IItemLocationProvider) this.adapterFactory.adapt(element, IItemLocationProvider.class);
		this.lastElement = element;
		this.lastElementItemLocationProvider = intervalEventItemProvider;
		return intervalEventItemProvider;
	}
	
	public AdapterFactoryLocationProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	@Override
	public boolean isLocation(Object element){
		IItemLocationProvider locationProvider = this.getLocationItemProvider(element);
		if ( locationProvider==null ) { return false; }
		return true;
	}

	@Override
	public float getLongitude(Object element) {
		IItemLocationProvider locatonItemProvider = this.getLocationItemProvider(element);
		return locatonItemProvider.getLongitude(element);
	}

	@Override
	public float getLatitude(Object element) {
		IItemLocationProvider locatonItemProvider = this.getLocationItemProvider(element);
		return locatonItemProvider.getLatitude(element);
	}

	@Override
	public float getElevation(Object element) {
		IItemLocationProvider locatonItemProvider = this.getLocationItemProvider(element);
		return locatonItemProvider.getElevation(element);
	}
}
