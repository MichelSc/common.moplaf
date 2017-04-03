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
package com.misc.common.moplaf.timeview.emf.editor.provider;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.timeview.IAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemDiscontinuousAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsProvider;

public class AdapterFactoryAmountEventProvider implements
		IAmountEventProvider {

	private AdapterFactory adapterFactory;
	
	// cached event
	private Object  lastElement = null;
	private Date    lastElementEventMoment;
	private float   lastElementAmountBefore;
	private float   lastElementAmountAfter;
	
	// cached events
	private Object lastEventsElement = null;
	private IItemAmountEventsProvider lastEventsElementAmountProvider = null;
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
			this.lastEventsIsEvents = true;
			return;
		}
		
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
	}
	
	/**
	 * 
	 * @author michel
	 *
	 */
	private class TimePlotProvider {
		private IItemTimePlotsProvider timePlotsProvider;
		private Object element;
		private Object timePlotKey;

		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 */
		public TimePlotProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsProvider timePlotsProvider) {
			super();
			this.element = nativeObject;
			this.timePlotKey = timePlotKey;
			this.timePlotsProvider = timePlotsProvider;
		}

		public Collection<?> getAmountEvents() {
			return this.timePlotsProvider.getAmountEvents(this.element, this.timePlotKey);
		}
	}
	
	/**
	 * Return a collection of object implementing the interface IItemAmountEventsProvider
	 * <p>
	 * Return object will a
	 * <ul>
	 * <li/> Native objects implementing the interface
	 * <li/> TimePlotProviders, wrapping a native object and the key of the TimePlot for this object
	 * <ul/
	 * <p>
	 */
	public Object[]  getInputs(Object[] childrenModelElement){
		LinkedList<Object> inputs = new LinkedList<Object>();
		for ( Object childElement : childrenModelElement){
			IItemTimePlotsProvider timePlotsProvider = (IItemTimePlotsProvider) this.adapterFactory.adapt(childElement, IItemTimePlotsProvider.class);
			if ( timePlotsProvider != null ){
				Collection<?> timePlots = timePlotsProvider.getTimePlots(childElement);
				for ( Object timePlot : timePlots){
					TimePlotProvider provider = new TimePlotProvider(childElement, timePlot, timePlotsProvider);
					inputs.add(provider);
				}
			} else {
				this.getAmountEventItemProvider(childElement);
				if ( this.lastEventsIsEvents){
					inputs.add(childElement);
				}
			}
		} // traverse the children
		return inputs.toArray();
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

	/**
	 * 
	 */
	@Override
	public Object[] getAmountEvents(Object element) {
		if ( element instanceof TimePlotProvider){
			TimePlotProvider timePlot = (TimePlotProvider)element;
			return timePlot.getAmountEvents().toArray();
		}

		this.getAmountEventsItemProvider(element);
		return this.lastEventsElementAmountProvider.getAmountEvents(this.lastEventsElement).toArray();
	}

}
