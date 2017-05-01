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

public interface IItemTimePlotsEventsProvider extends IItemTimePlotsProvider {
	// event properties
	/**
	 * Return the events for the element and a TimePlot of this element
	 * @param element
	 * @param timeplot
	 * @return
	 */
	Collection<?> getEvents(Object element, Object timeplot);
	/**
	 * Return the moment of the event for the timePlot and for this element
	 * @param element
	 * @param timeplot
	 * @param event
	 * @return
	 */
	Date  getMoment (Object element, Object timeplot, Object event); //
	/**
	 * Return the amount of the event for the timePlot
	 * @param element
	 * @param timeplot
	 * @param event
	 * @return
	 */
	float getAmount (Object element, Object timeplot, Object event); 
}