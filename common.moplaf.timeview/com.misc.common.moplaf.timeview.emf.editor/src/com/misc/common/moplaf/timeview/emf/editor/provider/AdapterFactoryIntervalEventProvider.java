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
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesEventsIntervalsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesEventsProvider;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesIntervalsProvider;
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
		if ( provider instanceof IItemTimeLinesEventsProvider){
			return new TimeLineEventsProvider(element, timeline, (IItemTimeLinesEventsProvider)provider);
		}
		else if ( provider instanceof IItemTimeLinesIntervalsProvider){
			return new TimeLineIntervalsProvider(element, timeline, (IItemTimeLinesIntervalsProvider)provider);
		}
		else if ( provider instanceof IItemTimeLinesEventsIntervalsProvider){
			return new TimeLineEventsIntervalsProvider(element, timeline,(IItemTimeLinesEventsIntervalsProvider)provider);
		}
		return null;
	}

	
	/**
	 * Helper class for the conversion of an IItemTimeLinesProvider (abstract), represent a TimeLine 
	 */
	private abstract class TimeLineProvider implements IItemLabelProvider {
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
	
	private class TimeLineEventsProvider extends TimeLineProvider {
		private IItemTimeLinesEventsProvider timeLinesEventsProvider;

		private class Event implements IItemLabelProvider, IItemColorProvider{
			private Object event;
			
			public Event(Object event){
				this.event = event;
			}
			
			@Override
			public Object getForeground(Object element) {
				return TimeLineEventsProvider.this.timeLinesEventsProvider.getForeground
						(TimeLineEventsProvider.this.element, 
						TimeLineEventsProvider.this.timeLine, 
						this.event); 
			}
			
			@Override
			public Object getBackground(Object element) {
				return TimeLineEventsProvider.this.timeLinesEventsProvider.getBackground
						(TimeLineEventsProvider.this.element, 
						TimeLineEventsProvider.this.timeLine, 
						this.event); 
			}
			
			@Override
			public Image getImage(Object element) {
				return null;
			}
			
			@Override
			public String getText(Object element) {
				return TimeLineEventsProvider.this.timeLinesEventsProvider.getText
						(TimeLineEventsProvider.this.element, 
						TimeLineEventsProvider.this.timeLine, 
						this.event); 
			}
		}

		/**
		 * 
		 * @param element
		 * @param timeline
		 */
		public TimeLineEventsProvider(Object element, Object timeline, IItemTimeLinesEventsProvider timeLinesProvider) {
			super(element, timeline, timeLinesProvider);
			this.timeLinesEventsProvider = timeLinesProvider;
		}

		@Override
		public Object[] getIntervalEvents() {
			 Collection<?> events = this.timeLinesEventsProvider.getEvents(this.element, this.timeLine);
			 ArrayList<Event> events2 = new ArrayList<Event>();
			 Iterator<?> eventIterator = events.iterator();
			 while ( eventIterator.hasNext()){
				 Event event = new Event(eventIterator.next());
				 events2.add(event);
			 }
			return events2.toArray();
		}
		
		@Override
		public Date getEventStart(Object event) {
			Event objectEvent = (Event) event;
			return this.timeLinesEventsProvider.getStart(this.element,  this.timeLine, objectEvent.event);
		}

		@Override
		public Date getEventEnd(Object event) {
			Event objectEvent = (Event) event;
			return this.timeLinesEventsProvider.getEnd(this.element,  this.timeLine, objectEvent.event);
		}

	};
	
		/**
		 * 
		 * @param nativeObject
		 * @param timePlot
		 */
	private class TimeLineIntervalsProvider extends TimeLineProvider {
		protected IItemTimeLinesIntervalsProvider timeLinesIntervalsProvider;

		private class Interval implements IItemLabelProvider, IItemColorProvider{
			private int interval;
			
			@Override
			public Object getForeground(Object element) {
				return TimeLineIntervalsProvider.this.timeLinesIntervalsProvider.getForeground
						(TimeLineIntervalsProvider.this.element, 
						TimeLineIntervalsProvider.this.timeLine, 
						this.interval); 
			}
			
			@Override
			public Object getBackground(Object element) {
				return TimeLineIntervalsProvider.this.timeLinesIntervalsProvider.getBackground
						(TimeLineIntervalsProvider.this.element, 
						TimeLineIntervalsProvider.this.timeLine, 
						this.interval); 
			}
			
			@Override
			public Image getImage(Object element) {
				return null;
			}
			
			@Override
			public String getText(Object element) {
				return TimeLineIntervalsProvider.this.timeLinesIntervalsProvider.getText
						(TimeLineIntervalsProvider.this.element, 
						TimeLineIntervalsProvider.this.timeLine, 
						this.interval); 
			}
		}

		TimeLineIntervalsProvider(Object element, Object timeline, IItemTimeLinesIntervalsProvider provider) {
			super(element, timeline, provider);
			this.timeLinesIntervalsProvider = provider;
		}
	
		@Override
		public Object[] getIntervalEvents() {
			int intervals = this.timeLinesIntervalsProvider.getIntervals(this.element, this.timeLine);
			Interval[] events = new Interval[intervals];
			for (int interval=0; interval<intervals; interval++){
				events[interval].interval = interval;
			}
			return events;
		}
		
		@Override
		public Date getEventStart(Object event) {
			Interval interval = (Interval)event;
			Date start = this.timeLinesIntervalsProvider.getStart(this.element,  this.timeLine, interval.interval);
			return start;
		}

		@Override
		public Date getEventEnd(Object event) {
			Interval interval = (Interval)event;
			Date end = this.timeLinesIntervalsProvider.getEnd(this.element,  this.timeLine, interval.interval);
			return end;
		}
	}
	
	private class TimeLineEventsIntervalsProvider extends TimeLineProvider {
		private IItemTimeLinesEventsIntervalsProvider timeLinesEventsIntervalsProvider;
		
		private class EventInterval implements IItemLabelProvider, IItemColorProvider{
			private Object event;
			private int interval;
			
			public EventInterval(Object event, int interval) {
				super();
				this.event = event;
				this.interval = interval;
			}
			
			@Override
			public Object getForeground(Object element) {
				return TimeLineEventsIntervalsProvider.this.timeLinesEventsIntervalsProvider.getForeground
						(TimeLineEventsIntervalsProvider.this.element, 
						TimeLineEventsIntervalsProvider.this.timeLine, 
						this.event, 
						this.interval); 
			}
			
			@Override
			public Object getBackground(Object element) {
				return TimeLineEventsIntervalsProvider.this.timeLinesEventsIntervalsProvider.getBackground
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
				return TimeLineEventsIntervalsProvider.this.timeLinesEventsIntervalsProvider.getText
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
		public TimeLineEventsIntervalsProvider(Object element, Object timeline, IItemTimeLinesEventsIntervalsProvider provider) {
			super(element, timeline, provider);
			this.timeLinesEventsIntervalsProvider = provider;
		}

		@Override
		public Object[] getIntervalEvents() {
			 Collection<?> events = this.timeLinesEventsIntervalsProvider.getEvents(this.element, this.timeLine);
			 ArrayList<EventInterval> eventsIntervals = new ArrayList<EventInterval>();
			 Iterator<?> eventIterator = events.iterator();
			 while ( eventIterator.hasNext()){
				 Object event = eventIterator.next();
				 int intervals = this.timeLinesEventsIntervalsProvider.getIntervals(this.element, this.timeLine, event);
				 for ( int interval = 0; interval<intervals; interval++){
					 EventInterval eventInterval = new EventInterval(event, interval);
					 eventsIntervals.add(eventInterval);
				 }
			 }
			return eventsIntervals.toArray();
		}
		
		@Override
		public Date getEventStart(Object event) {
			EventInterval eventInterval = (EventInterval) event;
			Date start = this.timeLinesEventsIntervalsProvider.getStart(this.element, this.timeLine, eventInterval.event, eventInterval.interval);
			return start;
		}

		@Override
		public Date getEventEnd(Object event) {
			EventInterval eventInterval = (EventInterval) event;
			Date end = this.timeLinesEventsIntervalsProvider.getEnd(this.element, this.timeLine, eventInterval.event, eventInterval.interval);
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
