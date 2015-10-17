package com.misc.common.moplaf.timeview.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IDiscontinuousAmountEventProvider;

public class AdapterFactoryDiscontinuousAmountEventProvider implements
		IDiscontinuousAmountEventProvider {

	private AdapterFactory adapterFactory;
	
	private Object  lastElement = null;
	private Date    lastElementEventMoment;
	private float   lastElementAmountBefore;
	private float   lastElementAmountAfter;
	private boolean lastElementIsAmountEventProvider;
	
	private void getamountEventItemProvider(Object element){
		if ( element == this.lastElement ) { return ; }

		this.lastElement = element;

		IItemDiscontinuousAmountEventProvider dicontinuousEventItemProvider = (IItemDiscontinuousAmountEventProvider) this.adapterFactory.adapt(element, IItemDiscontinuousAmountEventProvider.class);
		if ( dicontinuousEventItemProvider!= null) {
			this.lastElementEventMoment  = dicontinuousEventItemProvider.getEventMoment(element);
			this.lastElementAmountBefore = dicontinuousEventItemProvider.getEventAmountBefore(element);
			this.lastElementAmountAfter  = dicontinuousEventItemProvider.getEventAmountAfter(element);
			this.lastElementIsAmountEventProvider = true;
			return;
		}
		
		IItemAmountEventProvider amountEventItemProvider = (IItemAmountEventProvider) this.adapterFactory.adapt(element, IItemAmountEventProvider.class);
		if ( amountEventItemProvider!= null) {
			this.lastElementEventMoment  = amountEventItemProvider.getEventMoment(element);
			this.lastElementAmountBefore = amountEventItemProvider.getEventAmount(element);
			this.lastElementAmountAfter  = this.lastElementAmountBefore;
			this.lastElementIsAmountEventProvider = true;
			return;
		}
		
		this.lastElementIsAmountEventProvider = false;
		return;
	}
	
	// constructor
	public AdapterFactoryDiscontinuousAmountEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}
	
	@Override
	public boolean isDiscontinuousAmountEvent(Object element){
		this.getamountEventItemProvider(element);
		return this.lastElementIsAmountEventProvider;
	}

	@Override
	public Date getEventMoment(Object element) {
		this.getamountEventItemProvider(element);
		return this.lastElementEventMoment;
	}

	@Override
	public float getEventAmountBefore(Object element) {
		this.getamountEventItemProvider(element);
		return this.lastElementAmountBefore;
	}

	@Override
	public float getEventAmountAfter(Object element) {
		this.getamountEventItemProvider(element);
		return this.lastElementAmountAfter;
	}

}
