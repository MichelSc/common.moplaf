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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.timeview.IAmountEventProvider;
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
public class AdapterFactoryAmountEventProvider extends AdapterFactoryArrayContentProvider implements
		IAmountEventProvider {

	// constructor
	public AdapterFactoryAmountEventProvider(AdapterFactory adapterFactory){
		super(adapterFactory);
	}

	// dispose
	public void dispose(){
	}
	
	@Override
	public Object[] getChildren(Object object) {
		ArrayList<Object> providers = this.getTimePlotProviders(object);
		if ( providers==null){
			return super.getChildren(object);
		}
		Object[] children = super.getChildren(object);
		for ( int i=0; i<children.length; i++){
			providers.add(children[i]);
		}
		return providers.toArray();
	}

	@Override
	public Object getParent(Object object) {
		if ( object instanceof TimePlotProvider){
			TimePlotProvider provider = (TimePlotProvider) object;
			return provider.element;
		}
			
		return super.getParent(object);
	}


	/**
	 * Return a collection of object extending the private class  {@link TimePlotProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider}, and {@link IItemColorProvider}
	 * <p>
	 */
	private ArrayList<Object> getTimePlotProviders(Object element){
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemTimePlotsProvider timePlotsProvider = (IItemTimePlotsProvider) adapterFactory.adapt(element, IItemTimePlotsProvider.class);
		
		if ( timePlotsProvider == null ){ return null; }
		
		ArrayList<Object> providers = new ArrayList<Object>();
		
		Collection<?> timePlots = timePlotsProvider.getTimePlots(element);
		if ( timePlots==null ){
				TimePlotProvider provider = this.createTimePlotProvider(element, null, timePlotsProvider);
				providers.add(provider);
		} else {
			for ( Object timePlot : timePlots){
				TimePlotProvider provider = this.createTimePlotProvider(element, timePlot, timePlotsProvider);
				providers.add(provider);
			}
		} 
		
		return providers;
	}
	

	private TimePlotProvider createTimePlotProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsProvider provider){
		return new TimePlotEventsMomentsProvider(nativeObject,timePlotKey,provider);
	}

	
	/**
	 * Helper class for the conversion of an IItemTimePlotsProvider (abstract) to an EventProvider
	 * @author michel
	 *
	 */
	private abstract class TimePlotProvider implements IItemLabelProvider, IItemColorProvider {
		protected IItemTimePlotsProvider timePlotsProvider;
		protected Object element;
		protected Object timePlot;
		
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

		/**
		 * 
		 * @return
		 */
		public abstract Object[] getAmountEvents();
		
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

		public abstract Date getEventMoment(Object event);

		public abstract float getEventAmount(Object event);
	};
	
	private class TimePlotEventsMomentsProvider extends TimePlotProvider {
		
		private class EventMoment {
			private Object event;
			private Object moment;
			public EventMoment(Object event, Object moment) {
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
		public TimePlotEventsMomentsProvider(Object nativeObject, Object timePlotKey, IItemTimePlotsProvider timePlotsProvider) {
			super(nativeObject, timePlotKey, timePlotsProvider);
		}

		public Object[] getAmountEvents() {
			 Collection<?> events = this.timePlotsProvider.getEvents(this.element, this.timePlot);
			 if ( events==null) {
				 ArrayList<Integer> eventsAsNumbers= new ArrayList<Integer>();
				 int nrEvents = this.timePlotsProvider.getNrEvents(this.element, this.timePlot);
				 for(int i=0; i>nrEvents; i++) {
					 eventsAsNumbers.add(i);
				 }
				 events = eventsAsNumbers;
			 }
			 ArrayList<EventMoment> eventMoments = new ArrayList<EventMoment>();
			 Iterator<?> eventIterator = events.iterator();
			 while ( eventIterator.hasNext()){
				 Object event = eventIterator.next();
				 Collection<?>  moments = this.timePlotsProvider.getMoments(this.element, this.timePlot, event);
				 if ( moments==null) {
					 int nrMoments = this.timePlotsProvider.getNrMoments(this.element, this.timePlot, event);
					 for ( int moment = 0; moment<nrMoments; moment++){
						 EventMoment eventMoment = new EventMoment(event, moment);
						 eventMoments.add(eventMoment);
					 }
				 } else {
					for (  Object moment : moments){
						 EventMoment eventMoment = new EventMoment(event, moment);
						 eventMoments.add(eventMoment);
					 }
				 } 
			 }
			return eventMoments.toArray();
		}
		
		@Override
		public Date getEventMoment(Object event){
			EventMoment eventMoment = (EventMoment) event;
			Date moment = this.timePlotsProvider.getMoment(this.element, this.timePlot, eventMoment.event, eventMoment.moment);
			return moment;
		}
		@Override
		public float getEventAmount(Object event){
			EventMoment eventMoment = (EventMoment) event;
			float amount = this.timePlotsProvider.getAmount(this.element, this.timePlot, eventMoment.event, eventMoment.moment);
			return amount;
		}
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
