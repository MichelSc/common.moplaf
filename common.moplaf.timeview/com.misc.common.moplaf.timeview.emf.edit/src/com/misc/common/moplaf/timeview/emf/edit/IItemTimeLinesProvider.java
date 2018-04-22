/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;
import java.util.Date;

/**
 * <p>
 * This interface declares the method(s) to be supported by an object that publishes a 
 * collections of time lines, for instance to be displayed in a Gantt chart.
 * <p>
 * The consumer (i.e. the component using the TimeLine data, typically a gantt component)
 * will provide, when relevant
 * <ul>
 * <li> an element: Object: the object owning the time lines </li>
 * <li> a timeLine: Object: the time line for the owner element </li>
 * <li> an event: Object: the event for the time line and the owner element </li>
 * <li> an interval: Object: a time interval of an event for the time line and the owner element </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the timeLines supported by the element </li>
 * <li> the events belonging to a timeLine of an element </li>
 * <li> the intervals of the events: an interval provides start and end moments, the text and color of an event of a timeLine of an element </li>
 * </ul>
 * <p>
 * An interval of the TimeLine, so a pair (start, end), is identified by an event and by an interval. 
 * <p>
 * The events of a timeline can be provided either by a collection or by a number.
 * According to the case, the event is identified , either by an event object of the collection or by an Integer.
 * <p>
 * The intervals of an event can be provided either by a collection or by a number.
 * According to the case, the interval is identified , either by an interval object of the collection or by an Integer.
 * <p>
 * To implement this interface by an {@link ItemProviderAdapter}, in the concrete class, do the following 
 * <ul>
 *   <li>add <code>@implements IItemTimeLinesProvider</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement the interface methods</li>
 * </ul> 
 * In the project's ProviderAdapterFactory, 
 * <ul>
 *     <li>	<code>supportedTypes.add(IItemTimeLinesProvider.class); // moplaf interface </code></li>
 * </ul> 
 * In the plugin.xml,  
 * <ul>
 *   <li>add the type IItemTimeLinesProvider in the field SupportedTypes for extension org.eclipse.emf.edit.itemProviderAdapterFactories </li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface IItemTimeLinesProvider {
	
	/**
	 * Return the timelines provides by the element. 
	 * <p>
	 * The method may return 
	 * <ul>
	 * <li> null: no timeline for the element </li>
	 * <li> Collection<?>: a collection of timelines for the element</li>
	 * <li> otherwise an Object: a single timeline for the element </li>
	 * </ul>
	 * @param element
	 * @return
	 */
	default Object getTimeLines(Object element){
		return null;
	}
	
	/**
	 * Return the text of a timeline.
	 * @param element
	 * @param timeline
	 * @return
	 */
	default String getText(Object element, Object timeline) {
		return "";
	}
	
	/**
	 * Return the events of a timeline. 
	 * <p>
	 * No collection may be returned. In that case, the consumer will call {@link #getNrEvents(Object, Object)}
	 * to get the number of events and the events will be identified by an Integer 0-based index.
	 * @param element
	 * @param timeline
	 * @return
	 */
	default Collection<?> getEvents(Object element, Object timeline){
		return null;
	}

	/** 
	 * Return the number of events
	 * <p>
	 * This method will be ignored when {@link #getEvents(Object, Object)} returns a collection.
	 * @param element
	 * @param timeline
	 * @return
	 */
	default int getNrEvents(Object element, Object timeline){
		return 1;
	}
	
	/**
	 * Return the intervals of an event of a timeline. 
	 * <p>
	 * No collection may be returned. In that case, the consumer will call {@link #getNrIntervals(Object, Object, Object)}
	 * to get the number of intervals and the intervals will be identified by an Integer 0-based index.
	 */
	default Collection<?>  getIntervals(Object element, Object timeline, Object event) {
		return null;
	}
	
	/**
	 * Return the number of intervals of an event.
	 * <p>
	 * This method will be ignored when {@link #getIntervals(Object, Object, Object)} returns a collection.
	 * 
	 * @param element
	 * @param timeline
	 * @param event
	 * @return
	 */
	default int getNrIntervals(Object element, Object timeline, Object event) {
		return 1;
	}
	
	/**
	 * Return the start moment of a time interval of an event of a timeline.
	 * @param element
	 * @param timeline
	 * @param event
	 * @param interval
	 * @return
	 */
	Date getStart(Object element, Object timeline, Object event, Object interval);

	/**
	 * Return the end moment of a time interval of an event of a timeline.
	 * @param element
	 * @param timeline
	 * @param event
	 * @param interval
	 * @return
	 */
	Date getEnd(Object element, Object timeline, Object event, Object interval);

	/**
	 * Return the text of a time interval of an event of a timeline.
	 * @param element
	 * @param timeline
	 * @param event
	 * @param interval
	 * @return
	 */
	default String getText(Object element, Object timeline, Object event, Object interval) {
		return null;
	}
	
	/**
	 * Return the foreground color of a time interval of an event of a timeline.
	 * @param element
	 * @param timeline
	 * @param event
	 * @param interval
	 * @return
	 */
	default Object getForeground(Object element, Object timeline, Object event, Object interval) {
		return null;
	}
	
	/**
	 * Return the background color of a time interval of an event of a timeline.
	 * @param element
	 * @param timeline
	 * @param event
	 * @param interval
	 * @return
	 */
	default Object getBackground(Object element, Object timeline, Object event, Object interval) {
		return null;
	}
}


