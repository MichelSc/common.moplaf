/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.timeview.emf.edit;

import java.util.Date;

public interface IItemTimePlotsMomentsProvider extends IItemTimePlotsProvider {
	// event properties
	int   getMoments(Object element, Object timeplot); // the number of moment for an event
	Date  getMoment (Object element, Object timeplot, int moment); // the date of the event for the timePlot and for this element
	float getAmount (Object element, Object timeplot, int moment); // the amount before of the event for the timePlot
}