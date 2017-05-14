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
	// collection of events
	boolean isIntervalEvents(Object provider);
	Object[] getIntervalEvents(Object provider);
	// event properties
	Date getIntervalEventStart(Object provider, Object event);
	Date getIntervalEventEnd(Object provider, Object event);
}
