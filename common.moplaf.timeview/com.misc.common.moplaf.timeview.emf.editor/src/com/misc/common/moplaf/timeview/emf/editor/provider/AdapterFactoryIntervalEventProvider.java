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
import org.eclipse.swt.graphics.Image;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.timeview.IIntervalEventProvider;
import com.misc.common.moplaf.timeview.Wrapper;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesProvider;

/**
 * An {@link AdapterFactoryIntervalEventProvider} implements the interface {@link IIntervalEventProvider} for different kind of providers:
 * <ul>
 * <li> {@link IItemTimeLinesEventsProvider}</li>
 * <li> {@link IItemTimeLinesIntervalsProvider}</li>
 * <li> {@link IItemTimeLinesEventsIntervalsProvider}</li>
 * </ul>
 * <p>
 * @author MiSc
 *
 */
public class AdapterFactoryIntervalEventProvider extends AdapterFactoryArrayContentProvider implements IIntervalEventProvider {

	/**
	 * 
	 * @param adapterFactory
	 */
	public AdapterFactoryIntervalEventProvider(AdapterFactory adapterFactory){
		super(adapterFactory);
	}

	/**
	 * 
	 */
	public void dispose(){
		super.dispose();
	}
	
	@Override
	public Object[] getChildren(Object object) {
		ArrayList<Object> providers = this.getTimeLineProviders(object);
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
		if ( object instanceof TimeLineProvider){
			TimeLineProvider provider = (TimeLineProvider) object;
			return provider.element;
		}
			
		return super.getParent(object);
	}

	/**
	 * Return a collection of object extending the private class  {@link TimeLineProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider} and specific methods for supporting {@link IIntervalEventProvider}
	 * <p>
	 */
	private ArrayList<Object> getTimeLineProviders(Object element){
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemTimeLinesProvider timeLinesProvider = (IItemTimeLinesProvider) adapterFactory.adapt(element, IItemTimeLinesProvider.class);
		
		if ( timeLinesProvider==null ) { return null; }
		
		ArrayList<Object> providers = new ArrayList<Object>();
		Collection<?> timeLines= timeLinesProvider.getTimeLines(element);
		if ( timeLines == null ) {
			// the element IS a time line
			TimeLineProvider provider = this.createTimeLineProvider(element, null, timeLinesProvider);
			providers.add(provider);
		} else {
			// the element HAS time lines
			for ( Object timeLine : timeLines){
				TimeLineProvider provider = this.createTimeLineProvider(element, timeLine, timeLinesProvider);
				providers.add(provider);
			}
		}
		return providers;
	}
	

	/**
	 * 
	 * @param element
	 * @param timeline
	 * @param provider
	 * @return
	 */
	private TimeLineProvider createTimeLineProvider(Object element, Object timeline, IItemTimeLinesProvider provider){
		return new TimeLineEventsIntervalsProvider(element, timeline,provider);
	}

	
	/**
	 * Helper class for the conversion of an IItemTimeLinesProvider (abstract), represent a TimeLine 
	 */
	private abstract class TimeLineProvider implements IItemLabelProvider, Wrapper {
		protected IItemTimeLinesProvider timeLinesProvider;
		protected Object element;
		protected Object timeLine;
		
		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 * @param timePlotsProvider
		 */
		public TimeLineProvider(Object element, Object timeline, IItemTimeLinesProvider timeLinesProvider) {
			super();
			this.element = element;
			this.timeLine = timeline;
			this.timeLinesProvider = timeLinesProvider;
		}

		public Object unwrap(){
			return element;
		}

		/**
		 * 
		 * @return
		 */
		public abstract Object[] getIntervalEvents();
		
		@Override
		public String getText(Object object) {
			return this.timeLinesProvider.getText(this.element, this.timeLine);
		}

		@Override
		public Object getImage(Object object) {
			return null;
		}

		public abstract Date getEventStart(Object event);
		
		public abstract Date getEventEnd(Object event);
	};
	
	
	private class TimeLineEventsIntervalsProvider extends TimeLineProvider {
		
		private class EventInterval implements IItemLabelProvider, IItemColorProvider, Wrapper {
			private Object event;
			private Object interval;
			
			public EventInterval(Object event, Object interval) {
				super();
				this.event = event;
				this.interval = interval;
			}
			
			public Object unwrap(){
				return event;
			}

			
			@Override
			public Object getForeground(Object element) {
				return TimeLineEventsIntervalsProvider.this.timeLinesProvider.getForeground
						(TimeLineEventsIntervalsProvider.this.element, 
						TimeLineEventsIntervalsProvider.this.timeLine, 
						this.event, 
						this.interval); 
			}
			
			@Override
			public Object getBackground(Object element) {
				return TimeLineEventsIntervalsProvider.this.timeLinesProvider.getBackground
						(TimeLineEventsIntervalsProvider.this.element, 
						TimeLineEventsIntervalsProvider.this.timeLine, 
						this.event, 
						this.interval); 
			}
			
			@Override
			public Image getImage(Object element) {
				return null;
			}
			
			@Override
			public String getText(Object element) {
				return TimeLineEventsIntervalsProvider.this.timeLinesProvider.getText
						(TimeLineEventsIntervalsProvider.this.element, 
						TimeLineEventsIntervalsProvider.this.timeLine, 
						this.event, 
						this.interval); 
			}
		}

		/**
		 * 
		 * @param element
		 * @param timeline
		 * @param provider
		 */
		public TimeLineEventsIntervalsProvider(Object element, Object timeline, IItemTimeLinesProvider provider) {
			super(element, timeline, provider);
		}

		@Override
		public Object[] getIntervalEvents() {
			// get the events
			 Collection<?> events = this.timeLinesProvider.getEvents(this.element, this.timeLine);
			 if ( events==null ) {
				 ArrayList<Integer> eventsAsNumbers= new ArrayList<Integer>();
				 int nrEvents = this.timeLinesProvider.getNrEvents(this.element, this.timeLine);
				 for(int i=0; i>nrEvents; i++) {
					 eventsAsNumbers.add(i);
				 }
				 events = eventsAsNumbers;
			 }
			 // get the intervals
			 ArrayList<EventInterval> eventsIntervals = new ArrayList<EventInterval>();
			 Iterator<?> eventIterator = events.iterator();
			 while ( eventIterator.hasNext()){
				 Object event = eventIterator.next();
				 Collection<?> intervals = this.timeLinesProvider.getIntervals(this.element, this.timeLine, event);
				 if ( intervals==null) {
					 int nrIntervals = this.timeLinesProvider.getNrIntervals(this.element, this.timeLine, event);
					 for ( int interval = 0; interval<nrIntervals; interval++){
						 EventInterval eventInterval = new EventInterval(event, interval);
						 eventsIntervals.add(eventInterval);
					 }
				 } else {
					for (  Object interval : intervals){
						 EventInterval eventInterval = new EventInterval(event, interval);
						 eventsIntervals.add(eventInterval);
					 }
				 } 
			 }
			return eventsIntervals.toArray();
		}
		
		@Override
		public Date getEventStart(Object event) {
			EventInterval eventInterval = (EventInterval) event;
			Date start = this.timeLinesProvider.getStart(this.element, this.timeLine, eventInterval.event, eventInterval.interval);
			return start;
		}

		@Override
		public Date getEventEnd(Object event) {
			EventInterval eventInterval = (EventInterval) event;
			Date end = this.timeLinesProvider.getEnd(this.element, this.timeLine, eventInterval.event, eventInterval.interval);
			return end;
		}
	}
	
	/**
	 * Specified by {@link IIntervalEventProvider}
	 * 
	 */
	@Override
	public boolean isIntervalEvents(Object element) {
		if ( element instanceof TimeLineProvider){
			return true;
		}
		return false;
	}

	/**
	 * Specified by {@link IIntervalEventProvider}
	 * 
	 */
	@Override
	public Object[] getIntervalEvents(Object element) {
		TimeLineProvider timeLine = (TimeLineProvider)element;
		return timeLine.getIntervalEvents();
	}

	/**
	 * Specified by {@link IIntervalEventProvider}
	 * 
	 */
	@Override
	public Date getIntervalEventStart(Object element, Object event) {
		TimeLineProvider timeLine= (TimeLineProvider)element;
		return timeLine.getEventStart(event);
	}

	/**
	 * Specified by {@link IIntervalEventProvider}
	 * 
	 */
	@Override
	public Date getIntervalEventEnd(Object element, Object event) {
		TimeLineProvider timeLine= (TimeLineProvider)element;
		return timeLine.getEventEnd(event);
	}

}
