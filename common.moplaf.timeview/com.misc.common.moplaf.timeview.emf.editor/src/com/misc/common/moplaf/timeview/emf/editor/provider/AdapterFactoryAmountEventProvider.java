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
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import com.misc.common.moplaf.timeview.IAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemDiscontinuousAmountEventProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsEventsMomentsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsMomentsProvider;
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
		public Date  getEventMoment(Object event);
		public float getEventAmount(Object event);
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
		public float getEventAmount(Object event) {
			return this.eventProvider.getEventAmountBefore(event);
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
		public float getEventAmount(Object event) {
			return this.eventProvider.getEventAmount(event);
		}
		
	}

	
	/**
	 * 
	 * @author michel
	 *
	 */
	private abstract class TimePlotProvider implements EventProvider, IItemLabelProvider, IItemColorProvider {
		protected IItemTimePlotsProvider timePlotsProvider;
		protected Object element;
		protected Object timePlotKey;
		public abstract Object[] getAmountEvents();
		
		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 * @param timePlotsProvider
		 */
		public TimePlotProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsProvider timePlotsProvider) {
			super();
			this.element = nativeObject;
			this.timePlotKey = timePlotKey;
			this.timePlotsProvider = timePlotsProvider;
		}

		@Override
		public String getText(Object object) {
			return this.timePlotsProvider.getText(this.element, this.timePlotKey);
		}

		@Override
		public Object getImage(Object object) {
			return null;
		}

		@Override
		public Object getBackground(Object object) {
			return null;
		}
		@Override
		public Object getForeground(Object object) {
			return this.timePlotsProvider.getForeground(this.element, this.timePlotKey);
		}

	};
	
	private class TimePlotEventsProvider extends TimePlotProvider {
		private IItemTimePlotsEventsProvider timePlotsEventsProvider;

		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 */
		public TimePlotEventsProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsEventsProvider timePlotsProvider) {
			super(nativeObject, timePlotKey, timePlotsProvider);
			this.timePlotsEventsProvider = timePlotsProvider;
		}

		public Object[] getAmountEvents() {
			return this.timePlotsEventsProvider.getAmountEvents(this.element, this.timePlotKey).toArray();
		}
		
		@Override
		public Date getEventMoment(Object event){
			return timePlotsEventsProvider.getEventMoment(this.element, this.timePlotKey, event);
		}
		@Override
		public float getEventAmount(Object event){
			float scale = timePlotsEventsProvider.getScale(this.element, this.timePlotKey);
			float amount = timePlotsEventsProvider.getEventAmount(this.element, this.timePlotKey, event);
			return scale*amount;
		}
	}
	
	private class TimePlotMomentsProvider extends TimePlotProvider {
		private IItemTimePlotsMomentsProvider timePlotsMomentsProvider;

		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 */
		public TimePlotMomentsProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsMomentsProvider timePlotsProvider) {
			super(nativeObject, timePlotKey, timePlotsProvider);
			this.timePlotsMomentsProvider = timePlotsProvider;
		}

		public Object[] getAmountEvents() {
			return null;
		}
		
		@Override
		public Date getEventMoment(Object event){
			return null;
		}
		@Override
		public float getEventAmount(Object event){
			return 0.0f;
		}
	}
	
	private class TimePlotEventsMomentsProvider extends TimePlotProvider {
		private IItemTimePlotsEventsMomentsProvider timePlotsEventsMomentsProvider;

		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 */
		public TimePlotEventsMomentsProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsEventsMomentsProvider timePlotsProvider) {
			super(nativeObject, timePlotKey, timePlotsProvider);
			this.timePlotsEventsMomentsProvider = timePlotsProvider;
		}

		public Object[] getAmountEvents() {
			return null;
		}
		
		@Override
		public Date getEventMoment(Object event){
			return null;
		}
		@Override
		public float getEventAmount(Object event){
			return 0.0f;
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
			IItemTimePlotsEventsProvider timePlotsProvider = (IItemTimePlotsEventsProvider) this.adapterFactory.adapt(childElement, IItemTimePlotsEventsProvider.class);
			if ( timePlotsProvider != null ){
				Collection<?> timePlots = timePlotsProvider.getTimePlots(childElement);
				for ( Object timePlot : timePlots){
					TimePlotEventsProvider provider = new TimePlotEventsProvider(childElement, timePlot, timePlotsProvider);
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
	
	// event properties getter
	private EventProvider getEventProvider(Object element, Object event) {
		if ( element instanceof TimePlotProvider){
			TimePlotProvider timePlot = (TimePlotProvider)element;
			return timePlot;
		}
		this.getAmountEventItemProvider(event);
		return this.lastElementEventProvider;
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
			return timePlot.getAmountEvents();
		}

		this.getAmountEventsItemProvider(element);
		return this.lastEventsElementAmountProvider.getAmountEvents(this.lastEventsElement).toArray();
	}

	@Override
	public Date getEventMoment(Object element, Object event) {
		EventProvider eventProvider = this.getEventProvider(element, event);
		return eventProvider.getEventMoment(event);
	}

	@Override
	public float getEventAmount(Object element, Object event) {
		EventProvider eventProvider = this.getEventProvider(element, event);
		return eventProvider.getEventAmount(event);
	}

}
