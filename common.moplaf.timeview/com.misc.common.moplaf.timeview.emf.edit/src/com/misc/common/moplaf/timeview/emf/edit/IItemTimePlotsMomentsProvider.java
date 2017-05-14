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

import java.util.Date;

public interface IItemTimePlotsMomentsProvider extends IItemTimePlotsProvider {
	/**
	 * Return the number of moments of a given TimePlot object of a given element
	 * @param element
	 * @param timeplot
	 * @return
	 */
	int   getMoments(Object element, Object timeplot); 
	
	/** 
	 * Return the moment time of an event (identified by its index) of a given TimePlot of a given element
	 * @param element
	 * @param timeplot
	 * @param moment
	 * @return
	 */
	Date  getMoment (Object element, Object timeplot, int moment); // the date of the event for the timePlot and for this element
	
	/**
	 * Return the amount value of an event (identified by its index) of a given TimePlot of a given element
	 * @param element
	 * @param timeplot
	 * @param moment
	 * @return
	 */
	float getAmount (Object element, Object timeplot, int moment); // the amount before of the event for the timePlot
}