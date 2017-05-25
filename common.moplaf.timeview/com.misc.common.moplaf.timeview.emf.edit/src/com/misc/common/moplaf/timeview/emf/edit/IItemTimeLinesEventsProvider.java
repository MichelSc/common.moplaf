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

public interface IItemTimeLinesEventsProvider extends IItemTimeLinesProvider{
	
	Collection<?> getEvents(Object element, Object timeline);

	Date   getStart     (Object element, Object timeline, Object event);
	Date   getEnd       (Object element, Object timeline, Object event);
	Object getForeground(Object element, Object timeline, Object event);
	Object getBackground(Object element, Object timeline, Object event);
	String getText      (Object element, Object timeline, Object event);
}
