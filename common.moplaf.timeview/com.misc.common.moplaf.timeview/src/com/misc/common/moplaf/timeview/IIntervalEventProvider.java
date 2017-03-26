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
package com.misc.common.moplaf.timeview;

import java.util.Date;

public interface IIntervalEventProvider {
	// event properties
	Date getIntervalEventStart(Object element);
	Date getIntervalEventEnd(Object element);
	// collection of events
	boolean isIntervalEvents(Object element);
	Object[] getIntervalEvents(Object element);
}
