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
import java.util.Date;

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
 * <li> the text and the image associated to a timePlot of an element (via the interface IItemLabelProvider, to be supported by the timePlot)</li>
 * <li> the events provided by a timePlot of an element </li>
 * <li> the moment and amounts of an event of a timePlot of an element </li>
 * </ul>
 * <p>
 * @author michel
 */

public interface IItemTimePlotsProvider {
	// collection of time plots
	Collection<?> getTimePlots(Object element); // return a collection of TimePlots for the element

	// time plot properties
	// if the timeplot Object implements IItemLabelProvider
	//    then timePlot will provide a Text and/or an image for the object being plotted
	//    object timePlot is the Provider
	//    object being plotted is the Providing, or provided
	Collection<?> getAmountEvents(Object element, Object timeplot); // return the events for the element and a TimePlot of this element
	float         getScale       (Object element, Object timeplot); // return the scale to be used for the element and a TimePlot of this element
	
	// event properties
	Date  getEventMoment      (Object element, Object timeplot, Object event); // the date of the event for the timePlot and for this element
	float getEventAmountBefore(Object element, Object timeplot, Object event); // the amount before of the event for the timePlot
	float getEventAmountAfter (Object element, Object timeplot, Object event);  // the amount after of the event for the time plot
}
