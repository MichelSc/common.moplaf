package com.misc.common.moplaf.timeview.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IIntervalEventProvider;

public class AdapterFactoryIntervalEventProvider implements
		IIntervalEventProvider {
	private AdapterFactory adapterFactory;
	
	private Object lastElement = null;
	private IItemIntervalEventProvider lastElementItemIntervalEventProvider = null;
	
	private IItemIntervalEventProvider getIntervalEventItemProvider(Object element){
		if ( element == this.lastElement ) { return this.lastElementItemIntervalEventProvider; }
		IItemIntervalEventProvider intervalEventItemProvider = (IItemIntervalEventProvider) this.adapterFactory.adapt(element, IItemIntervalEventProvider.class);
		this.lastElement = element;
		this.lastElementItemIntervalEventProvider = intervalEventItemProvider;
		return intervalEventItemProvider;
	}
	
	public AdapterFactoryIntervalEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	@Override
	public boolean isIntervalEvent(Object element){
		IItemIntervalEventProvider intervalEventItemProvider = this.getIntervalEventItemProvider(element);
		if ( intervalEventItemProvider==null ) { return false; }
		return true;
	}

	@Override
	public Date getIntervalEventStart(Object element) {
		IItemIntervalEventProvider intervalEventItemProvider = this.getIntervalEventItemProvider(element);
		return intervalEventItemProvider.getIntervalEventStart(element);
	}

	@Override
	public Date getIntervalEventEnd(Object element) {
		IItemIntervalEventProvider intervalEventItemProvider = this.getIntervalEventItemProvider(element);
		return intervalEventItemProvider.getIntervalEventEnd(element);
	}

}
