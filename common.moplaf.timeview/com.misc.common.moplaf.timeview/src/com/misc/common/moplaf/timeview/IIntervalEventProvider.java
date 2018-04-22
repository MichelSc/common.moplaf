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
package com.misc.common.moplaf.timeview;

import java.util.Date;

/**
 * The interface IIntervalEventProvider specifies the interface to be supported
 * for providing a time line (a set of time intervals) for some object.
 * <p>
 * This interface can then be consumed by a graphical component displaying 
 * the different time lines in a Gantt chart.
 * <p>
 * Other information to be used by the consumer will be provided by standard
 * jFace interfaces, namely
 * <ul>
 * <li> {@link org.eclipse.jface.viewers.ITreeContentProvider}, providing the content to be displayed; </li>
 * <li> {@link org.eclipse.jface.viewers.ILabelProvider}, providing labels for the elements of the content</li>
 * <li> {@link org.eclipse.jface.viewers.IColorProvider}, providing foreground and background colors for the elements of the content</li>
 * </ul>
 * 
 * <p>
 * Some of the element in the content may support
 * a time line, and will be recognized by the method {@link #isIntervalEvents(Object)}. 
 * In this case, the method {@link #getIntervalEvents(Object)} can be used to retrieve the events associated 
 * with the element. The methods {@link #getInteervalEventStart(Object, Object)} and {@link #getIntervalEventEnd(Object, Object)}
 * can then be used to retrieve 
 * the pair (Start:Date, End:Date) of any interval event associated with the element. 
 * <p>
 */

public interface IIntervalEventProvider {
	// collection of events
	boolean isIntervalEvents(Object provider);
	Object[] getIntervalEvents(Object provider);
	// event properties
	Date getIntervalEventStart(Object provider, Object event);
	Date getIntervalEventEnd(Object provider, Object event);
}
