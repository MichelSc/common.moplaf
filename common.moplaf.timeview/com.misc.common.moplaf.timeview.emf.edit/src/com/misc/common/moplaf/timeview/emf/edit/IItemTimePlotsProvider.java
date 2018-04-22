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
 * This interface declares the method(s) to be supported by an object that publishes one or several
 * amounts depending of time, called here timeplots.
 * <p>
 * These TimePlots can be shown as lines on a chart component for instance.
 * <p> 
 * The consumer (i.e. the component using the TimePlot data, typically a chart component)
 * will provide, when relevant
 * <ul>
 * <li> an element: Object: the object owning the timeplot(s) </li>
 * <li> a timePlot: Object: the time plot for the owner element </li>
 * <li> an event: Object: the event for the time plot and the owner element </li>
 * <li> a moment: Object: a pair (date, amount) to be plotted </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the timePlot(s) supported by the element </li>
 * <li> the scale for a timePlot supported by an element </li>
 * <li> the text and the color associated to a timePlot of an element </li>
 * <li> the events provided by a timePlot of an element </li>
 * <li> the moment(s) of an event of a timePlot of an element </li>
 * </ul>
 * <p>
 * A point of the TimePlot, so a pair (moment, amount) is identified by a pair of objects (event,moment).
 * <p>
 * 
 * @author michel
 */

public interface IItemTimePlotsProvider {
	/**
	 * Return the collection of TimePlots provided by an element. 
	 * <ul>
	 * <li> null: no timeplot for the element </li>
	 * <li> Collection<?>: a collection of timeplots for the element</li>
	 * <li> otherwise an Object: a single timeplots for the element </li>
	 * </ul>
	 * No collection may be returned. In that case, the consumer will expect one timeplot identified by the null object.
	 * @param element
	 * @return
	 */
	default Object getTimePlots(Object element){
		return null;
	}

	/**
	 * Return a scale for a TimePlot provided by an element. This scale can be used by the consumer to display several 
	 * TimePlots on the same graph, using a common y-axis.
	 */
	default float getScale (Object element, Object timeplot) {
		return 0.1f;
	}
	
	/**
	 * Return the text of a TimePlot provided by an element.
	 * @param element
	 * @param timeplot
	 * @return
	 */
	default String getText(Object element, Object timeplot) {
		return "";
	}

	/**
	 * Return the color of a TimePlot provided by an element.
	 * @param element
	 * @param timeplot
	 * @return
	 */
	default Object getForeground(Object element, Object timeplot) {
		return null;
	}


	/**
	 * Return the set of events object for a given TimePlot of a given element
	 * <p>
	 * No collection may be returned. In that case, the consumer will call {@link #getNrEvents(Object, Object)}
	 * to get the number of events and the event will be identified by an Integer 0-based index.
	 * @param element
	 * @param timeplot
	 * @return
	 */
	default Collection<?> getEvents(Object element, Object timeplot){
		return null;
	}

	/**
	 * Return the number of events object for a given TimePlot of a given element
	 * <p>
	 * The method will be ignored if {@link #getEvents(Object, Object)} returns a collection.
	 * @param element
	 * @param timeplot
	 * @return
	 */
	default int getNrEvents(Object element, Object timeplot){
		return 1;
	}

	/**
	 * Return the moments of a given event of a given TimePlot of a given element.
	 * <p>
	 * No collection may be returned. In that case, the consumer will call {@link #getNrMoments(Object, Object, Object)}
	 * to get the number of moments and the moment will be identified by an Integer 0-based index.
	 * @param element
	 * @param timeplot
	 * @param event
	 * @return
	 */
	default Collection<?> getMoments(Object element, Object timeplot, Object event){
		return null;
	}
	
	/**
	 * Return the number of moments for a given TimePlot of a given event
	 * <p>
	 * The method will be ignored if {@link #getMoments(Object, Object, Object)} returns a collection.
	 * 
	 * @param element
	 * @param timeplot
	 * @param event
	 * @return
	 */
	default int getNrMoments(Object element, Object timeplot, Object event){
		return 1;
	}


	/**
	 * Return the moment time of a moment of a given event
	 * @param element
	 * @param timeplot
	 * @param event
	 * @param moment
	 * @return
	 */
	Date getMoment (Object element, Object timeplot, Object event, Object moment); 
	
	/**
	 * Return the amount value of a given moment of a given event
	 * @param element
	 * @param timeplot
	 * @param event
	 * @param moment
	 * @return
	 */
	float getAmount (Object element, Object timeplot, Object event, Object moment); // the amount before of the event for the timePlot
};


	

