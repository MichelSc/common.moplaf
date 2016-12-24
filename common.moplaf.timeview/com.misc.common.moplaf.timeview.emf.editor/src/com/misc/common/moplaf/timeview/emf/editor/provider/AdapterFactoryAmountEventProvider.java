package com.misc.common.moplaf.timeview.emf.editor.provider;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemDiscontinuousAmountEventProvider;

public class AdapterFactoryAmountEventProvider implements
		IAmountEventProvider {

	private AdapterFactory adapterFactory;
	
	// cached event
	private Object  lastElement = null;
	private Date    lastElementEventMoment;
	private float   lastElementAmountBefore;
	private float   lastElementAmountAfter;
	
	// cached events
	private Object   lastEventsElement = null;
	private Collection<?> lastEventsElementEvents;
	private boolean  lastEventsIsEvents = false;
	
	private void getAmountEventItemProvider(Object element){
		if ( element == this.lastElement ) { return ; }

		this.lastElement = element;

		IItemDiscontinuousAmountEventProvider dicontinuousEventItemProvider = (IItemDiscontinuousAmountEventProvider) this.adapterFactory.adapt(element, IItemDiscontinuousAmountEventProvider.class);
		if ( dicontinuousEventItemProvider!= null) {
			this.lastElementEventMoment  = dicontinuousEventItemProvider.getEventMoment(element);
			this.lastElementAmountBefore = dicontinuousEventItemProvider.getEventAmountBefore(element);
			this.lastElementAmountAfter  = dicontinuousEventItemProvider.getEventAmountAfter(element);
			return;
		}
		
		IItemAmountEventProvider amountEventItemProvider = (IItemAmountEventProvider) this.adapterFactory.adapt(element, IItemAmountEventProvider.class);
		if ( amountEventItemProvider!= null) {
			this.lastElementEventMoment  = amountEventItemProvider.getEventMoment(element);
			this.lastElementAmountBefore = amountEventItemProvider.getEventAmount(element);
			this.lastElementAmountAfter  = this.lastElementAmountBefore;
			return;
		}
		
		return;
	}
	
	private void getAmountEventsItemProvider(Object element){
		if ( element == this.lastEventsElement ) { return ; }

		this.lastEventsElement = element;

		IItemAmountEventsProvider eventsItemProvider = (IItemAmountEventsProvider) this.adapterFactory.adapt(element, IItemAmountEventsProvider.class);
		if ( eventsItemProvider!= null) {
			this.lastEventsElementEvents  = eventsItemProvider.getAmountEvents(element);
			this.lastEventsIsEvents = true;
			return;
		}
		
		this.lastEventsElementEvents  = null;
		this.lastEventsIsEvents = false;
		return;
	}
	
	// constructor
	public AdapterFactoryAmountEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}

	// dispose
	public void dispose(){
		this.lastElement = null;
		this.lastEventsElement = null;
		this.lastEventsElementEvents = null;
	}
	
	// event properties getter
	@Override
	public Date getEventMoment(Object element) {
		this.getAmountEventItemProvider(element);
		return this.lastElementEventMoment;
	}

	@Override
	public float getEventAmountBefore(Object element) {
		this.getAmountEventItemProvider(element);
		return this.lastElementAmountBefore;
	}

	@Override
	public float getEventAmountAfter(Object element) {
		this.getAmountEventItemProvider(element);
		return this.lastElementAmountAfter;
	}

	// events collection getter
	@Override
	public boolean isAmountEvents(Object element) {
		this.getAmountEventsItemProvider(element);
		return this.lastEventsIsEvents;
	}

	@Override
	public Object[] getAmountEvents(Object element) {
		this.getAmountEventsItemProvider(element);
		return this.lastEventsElementEvents.toArray();
	}

}
