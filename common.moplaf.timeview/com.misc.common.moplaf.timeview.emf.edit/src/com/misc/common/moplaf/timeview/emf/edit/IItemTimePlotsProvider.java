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
 * @author michel
 */

public interface IItemTimePlotsProvider {
	// collection of time plots
	Collection<?> getTimePlots(Object element); // return a collection of TimePlots for the element

	// time plot properties
	// if the timeplot Object implements IItemLabelProvider
	//    then timePlot will provider a Text and/or an image for the object being plotted
	Collection<?> getAmountEvents(Object element, Object timeplot); // return the events for the element and a TimePlot of this element
	float         getScale       (Object element, Object timeplot); // return the scale to be used for the element and a TimePlot of this element
	
	// event properties
	Date  getEventMoment      (Object element, Object timeplot, Object event); // the date of the event for the timePlot and for this element
	float getEventAmountBefore(Object element, Object timeplot, Object event); // the amount before of the event for the timePlot
	float getEventAmountAfter (Object element, Object timeplot, Object event);  // the amount after of the event for the time plot
}
