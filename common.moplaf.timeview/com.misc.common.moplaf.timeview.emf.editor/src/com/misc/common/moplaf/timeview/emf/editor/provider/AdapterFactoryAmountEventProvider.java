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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
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

/**
 * An {@link AdapterFactoryAmountEventProvider} implements the interface {@link IAmountEventProvider} for different kind of providers:
 * @author MiSc
 *
 */
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
	
	/**
	 * Helper class for the conversion of an IItemDiscontinuousAmountEventProvider to an EventProvider
	 * @author michel
	 *
	 */
	private class DiscontinuousAmountEventProvider implements EventProvider {
		private IItemDiscontinuousAmountEventProvider eventProvider;
		private boolean isBefore;

		public DiscontinuousAmountEventProvider(IItemDiscontinuousAmountEventProvider eventProvider, boolean isBefore) {
			super();
			this.eventProvider = eventProvider;
			this.isBefore = isBefore;
		}

		@Override
		public Date getEventMoment(Object event) {
			return this.eventProvider.getEventMoment(event);
		}

		@Override
		public float getEventAmount(Object event) {
			if ( this.isBefore) {
				return this.eventProvider.getEventAmountBefore(event);
			} else {
				return this.eventProvider.getEventAmountAfter(event);
			}
		}
	}

	
	/**
	 * Helper class for the conversion of an IAmountEventProvider to an EventProvider
	 * @author michel
	 *
	 */
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
	
	private TimePlotProvider createTimePlotProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsProvider provider){
		if ( provider instanceof IItemTimePlotsEventsProvider){
			return new TimePlotEventsProvider(nativeObject,timePlotKey,(IItemTimePlotsEventsProvider)provider);
		}
		else if ( provider instanceof IItemTimePlotsMomentsProvider){
			return new TimePlotMomentsProvider(nativeObject,timePlotKey,(IItemTimePlotsMomentsProvider)provider);
		}
		else if ( provider instanceof IItemTimePlotsEventsMomentsProvider){
			return new TimePlotEventsMomentsProvider(nativeObject,timePlotKey,(IItemTimePlotsEventsMomentsProvider)provider);
		}
		return null;
	}

	
	/**
	 * Helper class for the conversion of an IItemTimePlotsProvider (abstract) to an EventProvider
	 * @author michel
	 *
	 */
	private abstract class TimePlotProvider implements EventProvider, IItemLabelProvider, IItemColorProvider {
		protected IItemTimePlotsProvider timePlotsProvider;
		protected Object element;
		protected Object timePlot;
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
			this.timePlot = timePlotKey;
			this.timePlotsProvider = timePlotsProvider;
		}

		@Override
		public String getText(Object object) {
			return this.timePlotsProvider.getText(this.element, this.timePlot);
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
			return this.timePlotsProvider.getForeground(this.element, this.timePlot);
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
			return this.timePlotsEventsProvider.getEvents(this.element, this.timePlot).toArray();
		}
		
		@Override
		public Date getEventMoment(Object event){
			return timePlotsEventsProvider.getMoment(this.element, this.timePlot, event);
		}
		@Override
		public float getEventAmount(Object event){
			float scale = timePlotsEventsProvider.getScale(this.element, this.timePlot);
			float amount = timePlotsEventsProvider.getAmount(this.element, this.timePlot, event);
			return scale*amount;
		}
	};
	
		/**
		 * 
		 * @param nativeObject
		 * @param timePlot
		 */
	private class TimePlotMomentsProvider extends TimePlotProvider {
		protected IItemTimePlotsMomentsProvider timePlotsMomentsProvider;

		TimePlotMomentsProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsMomentsProvider timePlotsProvider) {
			super(nativeObject, timePlotKey, timePlotsProvider);
			this.timePlotsMomentsProvider = timePlotsProvider;
		}
	
		public Object[] getAmountEvents() {
			int moments = this.timePlotsMomentsProvider.getMoments(this.element, this.timePlot);
			Integer[] events = new Integer[moments];
			for (int moment=0; moment<moments; moment++){
				events[moment] = moment;
			}
			return events;
		}
		
		@Override
		public Date getEventMoment(Object event){
			Integer moment = (Integer)event;
			Date eventMoment = this.timePlotsMomentsProvider.getMoment(this.element,  this.timePlot, moment);
			return eventMoment;
		}

		@Override
		public float getEventAmount(Object event){
			Integer moment = (Integer)event;
			float eventAmount = this.timePlotsMomentsProvider.getAmount(this.element,  this.timePlot, moment);
			return eventAmount;
		}
	}
	
	private class TimePlotEventsMomentsProvider extends TimePlotProvider {
		private IItemTimePlotsEventsMomentsProvider timePlotsEventsMomentsProvider;
		
		private class EventMoment {
			private Object event;
			private int moment;
			public EventMoment(Object event, int moment) {
				super();
				this.event = event;
				this.moment = moment;
			}
		}

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
			 Collection<?> events = this.timePlotsEventsMomentsProvider.getEventsMoments(this.element, this.timePlot);
			 ArrayList<EventMoment> eventsMoments = new ArrayList<EventMoment>();
			 Iterator<?> eventIterator = events.iterator();
			 while ( eventIterator.hasNext()){
				 Object event = eventIterator.next();
				 int moments = this.timePlotsEventsMomentsProvider.getMoments(this.element, this.timePlot, event);
				 for ( int moment = 0; moment<moments; moment++){
					 EventMoment eventMoment = new EventMoment(event, moment);
					 eventsMoments.add(eventMoment);
				 }
			 }
			return eventsMoments.toArray();
		}
		
		@Override
		public Date getEventMoment(Object event){
			EventMoment eventMoment = (EventMoment) event;
			Date moment = this.timePlotsEventsMomentsProvider.getMoment(this.element, this.timePlot, eventMoment.event, eventMoment.moment);
			return moment;
		}
		@Override
		public float getEventAmount(Object event){
			EventMoment eventMoment = (EventMoment) event;
			float amount = this.timePlotsEventsMomentsProvider.getAmount(this.element, this.timePlot, eventMoment.event, eventMoment.moment);
			return amount;
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
					TimePlotProvider provider = this.createTimePlotProvider(childElement, timePlot, timePlotsProvider);
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
