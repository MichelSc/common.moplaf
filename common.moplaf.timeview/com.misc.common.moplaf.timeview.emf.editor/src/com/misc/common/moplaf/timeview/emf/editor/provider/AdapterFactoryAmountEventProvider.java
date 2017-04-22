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
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsEventsMomentsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsMomentsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsProvider;

/**
 * An {@link AdapterFactoryAmountEventProvider} implements the interface {@link IAmountEventProvider} for different kind of providers:
 * <ul>
 * <li> {@link IItemTimePlotsEventsProvider}</li>
 * <li> {@link IItemTimePlotsMomentsProvider}</li>
 * <li> {@link IItemTimePlotsEventsMomentsProvider}</li>
 * </ul>
 * <p>
 * @author MiSc
 *
 */
public class AdapterFactoryAmountEventProvider implements
		IAmountEventProvider {

	private AdapterFactory adapterFactory;
	
	// constructor
	public AdapterFactoryAmountEventProvider(AdapterFactory adapterFactory){
		this.adapterFactory = adapterFactory;
	}

	// dispose
	public void dispose(){
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
	 * Return a collection of object extending the private class  {@link TimePlotProvider}, and implementing 
	 * the interfaces {@link EventProvider}, {@link IItemLabelProvider}, and {@link IItemColorProvider}
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
			} 
		} // traverse the children
		return inputs.toArray();
	}
	
	/**
	 * Specified by {@link IAmountEventProvider}
	 * 
	 */
	@Override
	public boolean isAmountEvents(Object element) {
		if ( element instanceof TimePlotProvider){
			return true;
		}
		return false;
	}

	/**
	 * Specified by {@link IAmountEventProvider}
	 * 
	 */
	@Override
	public Object[] getAmountEvents(Object element) {
		TimePlotProvider timePlot = (TimePlotProvider)element;
		return timePlot.getAmountEvents();
	}

	/**
	 * Specified by {@link IAmountEventProvider}
	 * 
	 */
	@Override
	public Date getEventMoment(Object element, Object event) {
		TimePlotProvider timePlot = (TimePlotProvider)element;
		return timePlot.getEventMoment(event);
	}

	/**
	 * Specified by {@link IAmountEventProvider}
	 * 
	 */
	@Override
	public float getEventAmount(Object element, Object event) {
		TimePlotProvider timePlot = (TimePlotProvider)element;
		return timePlot.getEventAmount(event);
	}
}
