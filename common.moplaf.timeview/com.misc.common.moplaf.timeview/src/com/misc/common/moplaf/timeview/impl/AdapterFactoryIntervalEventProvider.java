package com.misc.common.moplaf.timeview.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IIntervalEventProvider;

public class AdapterFactoryIntervalEventProvider implements
		IIntervalEventProvider {
	private AdapterFactory adapterFactory;
	
	// cached event
	private Object lastElement = null;
	private Date lastElementEventStart = null;
	private Date lastElementEventEnd = null;
//	private IItemIntervalEventProvider lastElementItemIntervalEventProvider = null;
	
	// cached events
	private Object   lastEventsElement = null;
	private Object[] lastEventsElementEvents;
	private boolean  lastEventsIsEvents = false;
	
	private void getIntervalEventItemProvider(Object element){
		if ( element == this.lastElement ) { return ; }
		IItemIntervalEventProvider intervalEventItemProvider = (IItemIntervalEventProvider) this.adapterFactory.adapt(element, IItemIntervalEventProvider.class);
		this.lastElement = element;
		this.lastElementEventStart = intervalEventItemProvider.getIntervalEventStart(element);
		this.lastElementEventEnd   = intervalEventItemProvider.getIntervalEventEnd(element);
	}
	
	private void getIntervalEventsItemProvider(Object element){
		if ( element == this.lastEventsElement ) { return ; }
		IItemIntervalEventsProvider intervalEventsItemProvider = (IItemIntervalEventsProvider) this.adapterFactory.adapt(element, IItemIntervalEventsProvider.class);
		this.lastEventsElement = element;
		if ( intervalEventsItemProvider==null ){
			this.lastEventsIsEvents = false;
			this.lastEventsElementEvents = null;
			return;
		}
		this.lastEventsIsEvents = true;
		this.lastEventsElementEvents = intervalEventsItemProvider.getIntervalEvents(element);
		return;
	}
	
	// constructor
	public AdapterFactoryIntervalEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	// dispose
	public void dispose(){
		this.lastElement = null;
		this.lastEventsElement = null;
		this.lastEventsElementEvents = null;
	}

	@Override
	public Date getIntervalEventStart(Object element) {
		this.getIntervalEventItemProvider(element);
		return this.lastElementEventStart;
	}

	@Override
	public Date getIntervalEventEnd(Object element) {
		this.getIntervalEventItemProvider(element);
		return this.lastElementEventEnd;
	}

	@Override
	public boolean isIntervalEvents(Object element){
		this.getIntervalEventsItemProvider(element);
		return this.lastEventsIsEvents;
	}
	@Override
	public Object[] getIntervalEvents(Object element) {
		this.getIntervalEventsItemProvider(element);
		return this.lastEventsElementEvents;
	}

}
