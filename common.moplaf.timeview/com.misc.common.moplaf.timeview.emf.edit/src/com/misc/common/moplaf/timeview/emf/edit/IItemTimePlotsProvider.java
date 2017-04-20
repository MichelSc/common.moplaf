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
 * This interface declare the method(s) to be supported by an object that the TimePlot must show as several lines
 * <p> 
 * The consumer (i.e. the component using the TimePlot data, typically a chart component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the plot </li>
 * <li> a timePlot:Object: the time plot for the owner element </li>
 * <li> a event:Object: the event for the time plot and the owner element </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the timePlots supported by the element </li>
 * <li> the scale for a timePlot supported by an element </li>
 * <li> the text associated to a timePlot of an element </li>
 * <li> the events provided by a timePlot of an element </li>
 * <li> the moment(s) and amount(s) of an event of a timePlot of an element </li>
 * </ul>
 * <p>
 * A point of the TimePlot, so a pair (moment, amount) is identified, either by an event object, or by a moment index, or by both.
 * Three specializations of this interface are defined for providing the events of a TimpePlot
 * <ul>
 * <li> {@link IItemTimePlotsEventsProvider}: provides a collections of events, with for every event, a moment and an amount </li>
 * <li> {@link IItemTimePlotsMomentsProvider}: provides number of moments, with for every moment (identified by an index), a moment and an amount </li>
 * <li> {@link IItemTimePlotsEventsMomentsProvider}: provides a collection of events, with for every event a number
 *  of moments, and for every moment (identified by an indexof an event, a moment and an amount </li>
 * </ul>
 * <p>
 * 
 * @author michel
 */

public interface IItemTimePlotsProvider {
	// collection of time plots
	Collection<?> getTimePlots(Object element); // return a collection of TimePlots for the element

	// time plot properties
	float         getScale       (Object element, Object timeplot); // return the scale to be used for the element and a TimePlot of this element
	String        getText        (Object element, Object timeplot); // return the text of a TimePlot for the element
	Object        getForeground  (Object element, Object timeplot); 
};


	

