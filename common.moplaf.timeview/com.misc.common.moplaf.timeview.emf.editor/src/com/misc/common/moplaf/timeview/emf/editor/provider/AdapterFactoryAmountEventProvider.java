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
import org.eclipse.emf.edit.provider.IItemLabelProvider;

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
	private EventProvider lastElementEventProvider = null;
	
	// cached events
	private Object lastEventsElement = null;
	private IItemAmountEventsProvider lastEventsElementAmountProvider = null;
	private boolean  lastEventsIsEvents = false;
	
	private void getAmountEventItemProvider(Object element){
		if ( element == this.lastElement ) { return ; }

		this.lastElement = element;
		
		EventProvider eventProvider = null; 
		IItemDiscontinuousAmountEventProvider dicontinuousEventItemProvider = (IItemDiscontinuousAmountEventProvider) this.adapterFactory.adapt(element, IItemDiscontinuousAmountEventProvider.class);
		if ( dicontinuousEventItemProvider!= null) {
			eventProvider = new DiscontinuousAmountEventProvider(dicontinuousEventItemProvider);
		}
		IItemAmountEventProvider amountEventItemProvider = (IItemAmountEventProvider) this.adapterFactory.adapt(element, IItemAmountEventProvider.class);
		if ( amountEventItemProvider!= null) {
			eventProvider = new AmountEventProvider(amountEventItemProvider);
		}
		
		this.lastElementEventProvider = eventProvider;
	}
	
	private void getAmountEventsItemProvider(Object element){
		if ( element == this.lastEventsElement ) { return ; }

		this.lastEventsElement = element;
		
		IItemAmountEventsProvider eventsItemProvider = (IItemAmountEventsProvider) this.adapterFactory.adapt(element, IItemAmountEventsProvider.class);
		if ( eventsItemProvider!= null) {
			this.lastEventsIsEvents = true;
			this.lastEventsElementAmountProvider = eventsItemProvider;
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
		this.lastElementEventProvider = null;
		this.lastEventsElement = null;
		this.lastEventsElementAmountProvider = null;
	}
	
	/**
	 * 
	 * @author michel
	 *
	 */
	private abstract interface EventProvider {
		public Date getEventMoment(Object event);
		public float getEventAmountBefore(Object event);
		public float getEventAmountAfter(Object event);
	}
	
	private class DiscontinuousAmountEventProvider implements EventProvider {
		private IItemDiscontinuousAmountEventProvider eventProvider;

		
		public DiscontinuousAmountEventProvider(IItemDiscontinuousAmountEventProvider eventProvider) {
			super();
			this.eventProvider = eventProvider;
		}

		@Override
		public Date getEventMoment(Object event) {
			return this.eventProvider.getEventMoment(event);
		}

		@Override
		public float getEventAmountBefore(Object event) {
			return this.eventProvider.getEventAmountBefore(event);
		}

		@Override
		public float getEventAmountAfter(Object event) {
			return this.eventProvider.getEventAmountAfter(event);
		}
		
	}

	
	private class AmountEventProvider implements EventProvider {
		private IItemAmountEventProvider eventProvider;

		
		public AmountEventProvider(IItemAmountEventProvider eventProvider) {
			super();
			this.eventProvider = eventProvider;
		}

		@Override
		public Date getEventMoment(Object event) {
			return this.eventProvider.getEventMoment(event);
		}

		@Override
		public float getEventAmountBefore(Object event) {
			return this.eventProvider.getEventAmount(event);
		}

		@Override
		public float getEventAmountAfter(Object event) {
			return this.eventProvider.getEventAmount(event);
		}
		
	}

	
	/**
	 * 
	 * @author michel
	 *
	 */
	private class TimePlotProvider implements EventProvider, IItemLabelProvider{
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
		
		@Override
		public Date getEventMoment(Object event){
			return timePlotsProvider.getEventMoment(this.element, this.timePlotKey, event);
		}
		@Override
		public float getEventAmountBefore(Object event){
			float scale = timePlotsProvider.getScale(this.element, this.timePlotKey);
			float amount = timePlotsProvider.getEventAmountBefore(this.element, this.timePlotKey, event);
			return scale*amount;
		}
		@Override
		public float getEventAmountAfter(Object event){
			float scale = timePlotsProvider.getScale(this.element, this.timePlotKey);
			float amount = timePlotsProvider.getEventAmountAfter(this.element, this.timePlotKey, event);
			return scale*amount;
		}

		private IItemLabelProvider getLabelProvider(){
			if ( this.timePlotKey instanceof IItemLabelProvider ) {
				return (IItemLabelProvider)this.timePlotKey;
			}
			return null;
		}

		@Override
		public String getText(Object object) {
			// labelProvider is the logic return a label for this timePlot, so for this TimePlotKey
			// object it the thing being plotted, thus this TimePlotProvider
			IItemLabelProvider labelProvider = this.getLabelProvider();
			
			if ( labelProvider!=null){
				// labelProvider is the logic providing a label and associated to the TimePLot(key)
				// this.element is the object being plotted
				return labelProvider.getText(this.element);
			}
			return null;
		}

		@Override
		public Object getImage(Object object) {
			// labelProvider is the logic return a label for this timePlot, so for this TimePlotKey
			// object it the thing being plotted, thus this TimePlotProvider
			IItemLabelProvider labelProvider = this.getLabelProvider();
			
			if ( labelProvider!=null){
				// labelProvider is the logic providing a label and associated to the TimePLot(key)
				// this.element is the object being plotted
				return labelProvider.getImage(this.element);
			}
			return null;
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
				this.getAmountEventsItemProvider(childElement);
				if ( this.lastEventsIsEvents){
					inputs.add(childElement);
				}
			}
		} // traverse the children
		return inputs.toArray();
	}
	
	// events collection getter
	@Override
	public boolean isAmountEvents(Object element) {
		if ( element instanceof TimePlotProvider){
			return true;
		}
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

	// event properties getter
	private EventProvider getEventProvider(Object element, Object event) {
		if ( element instanceof TimePlotProvider){
			TimePlotProvider timePlot = (TimePlotProvider)element;
			return timePlot;
		}
		this.getAmountEventItemProvider(event);
		return this.lastElementEventProvider;
	}
		
	@Override
	public Date getEventMoment(Object element, Object event) {
		EventProvider eventProvider = this.getEventProvider(element, event);
		return eventProvider.getEventMoment(event);
	}

	@Override
	public float getEventAmountBefore(Object element, Object event) {
		EventProvider eventProvider = this.getEventProvider(element, event);
		return eventProvider.getEventAmountBefore(event);
	}

	@Override
	public float getEventAmountAfter(Object element, Object event) {
		EventProvider eventProvider = this.getEventProvider(element, event);
		return eventProvider.getEventAmountAfter(event);
	}

}
