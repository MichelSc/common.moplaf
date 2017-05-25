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

public interface IItemTimeLinesIntervalsProvider extends IItemTimeLinesProvider{
	
	int getIntervals(Object element, Object timeline);

	Date   getStart     (Object element, Object timeline, int interval);
	Date   getEnd       (Object element, Object timeline, int interval);
	Object getForeground(Object element, Object timeline, int interval);
	Object getBackground(Object element, Object timeline, int interval);
	String getText      (Object element, Object timeline, int interval);
}
