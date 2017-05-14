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
 * This interface declares the method(s) to be supported by an object that the TimePlot must show as one or several lines
 * <p> 
 * The consumer (i.e. the component using the TimePlot data, typically a chart component)
 * will provide, when relevant
 * <ul>
 * <li> an element: Object: the object owning the plot </li>
 * <li> a timePlot: Object: the time plot for the owner element </li>
 * <li> an event: Object: the event for the time plot and the owner element </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the timePlots supported by the element </li>
 * <li> the scale for a timePlot supported by an element </li>
 * <li> the text and the color associated to a timePlot of an element </li>
 * <li> the events provided by a timePlot of an element </li>
 * <li> the moment(s) and amount(s) of an event of a timePlot of an element </li>
 * </ul>
 * <p>
 * A point of the TimePlot, so a pair (moment, amount) is identified, either by an event object, or by a moment index, or by both.
 * Three specializations of this interface are defined for providing the events of a TimpePlot:
 * <ul>
 * <li> {@link IItemTimePlotsEventsProvider}: object based, provides a collections of event objects, with for every event, a moment and an amount </li>
 * <li> {@link IItemTimePlotsMomentsProvider}: index based, provides number of moments, with for every moment index, a moment and an amount </li>
 * <li> {@link IItemTimePlotsEventsMomentsProvider}: object and index based, provides a collection of event objects, with for every event a number
 *  of moment indexes, and for every moment index of an event object, a moment and an amount </li>
 * </ul>
 * <p>
 * 
 * @author michel
 */

public interface IItemTimePlotsProvider {
	/**
	 * Return the collection of TimePlots provided by an element. 
	 * @param element
	 * @return
	 */
	Collection<?> getTimePlots(Object element); // return a collection of TimePlots for the element

	/**
	 * Return a scale for a TimePlot provided by an element. This scale can be used by the consumer to display several 
	 * TimePlots on the same graph, using a common y-axis.
	 */
	float getScale (Object element, Object timeplot); // return the scale to be used for the element and a TimePlot of this element
	
	/**
	 * Return the text of a TimePlot provided by an element.
	 * @param element
	 * @param timeplot
	 * @return
	 */
	String getText(Object element, Object timeplot); // return the text of a TimePlot for the element

	/**
	 * Return the color of a TimePlot provided by an element.
	 * @param element
	 * @param timeplot
	 * @return
	 */
	Object getForeground(Object element, Object timeplot); 
};


	

