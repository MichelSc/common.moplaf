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
package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Collection;

/**
 * <p>
 * This interface declare the method(s) to be supported by an object that supports a 
 * collections of time intervals, for instance to be displayed in a Gantt chart.
 * <p>
 * The consumer (i.e. the component using the TimeLine data, typically a gantt component)
 * will provide, when relevant
 * <ul>
 * <li> an element: Object: the object owning the time lines </li>
 * <li> a timeLine: Object: the time line for the owner element </li>
 * <li> an event: Object: the interval event for the time line and the owner element </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the timeLines supported by the element </li>
 * <li> the events belonging to a timeLine of an element </li>
 * <li> the start and end moments, the text and color of an event of a timeLine of an element </li>
 * </ul>
 * <p>
 * An element of the TimeLine, so a pair (start, end), is identified, either by an event object, or by a interval index, or by both.
 * Three specializations of this interface are defined for providing the events of a TimeLine:
 * <ul>
 * <li> {@link IItemTimeLinesEventsProvider}: object based, provides a collections of event objects, with for every event, a start and an end</li>
 * <li> {@link IItemTimeLinesIntervalsProvider}: index based, provides number of intervals, with for every interval index, a start and an end</li>
 * <li> {@link IItemTimeLinesEventsIntervalsProvider}: object and index based, provides a collection of event objects, with for every event a number
 *  of interval indexes, and for every interval index of an event object, a start and an end</li>
 * </ul>
 * <p>
 * To implement this interface by an {@link ItemProviderAdapter}, in the concrete class, do the following 
 * <ul>
 *   <li>add <code>@implements IItemTimeLinesProvider</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement the interface methods</li>
 *   <li>override {@link #isAdapterForType(Object)} and return true when the type is SomeInterface (apparently not)</li>
 * </ul> 
 * In the project's ProviderAdapterFactory, 
 * <ul>
 *   <li>you must to change the method {@link #isFactoryForType}</li>
 *   <li>or add the following lines in the constructors
 *     <ul>
 *     <li>	<code>supportedTypes.add(IItemTimeLinesProvider.class); // moplaf interface </code></li>
 *     </ul>
 * </ul> 
 * In the plugin.xml,  
 * <ul>
 *   <li>add the type IItemTimeLinesProvider in the field SupportedTypes for extension org.eclipse.emf.edit.itemProviderAdapterFactories </li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface IItemTimeLinesProvider {
	Collection<?> getTimeLines(Object element);
	String getText(Object element, Object timeline);
}


