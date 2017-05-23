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

/**
 * The interface IAmountEventProvider specifies the interface to be supported
 * for providing a quantity (an Amount) depending on time.
 * <p>
 * This interface can then be consumed by a graphical component for plotting
 * the quantity against the time.
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
 * an amount depending on time, and will be recognized by the method {@link #isAmountEvents(Object)}. 
 * In this case, the method {@link #getAmountEvents(Object)} can be used to retrieve the events associated 
 * with the element. The methods {@link #getEventAmount(Object, Object)} and {@link #getEventMoment(Object, Object)}
 * can then be used to retrieve 
 * the pair (Amount:float, Moment:Date) of any event associated with the element. 
 * <p>
 * 
 * @author michel
 *
 */

public interface IAmountEventProvider {
	// collection of events
	boolean isAmountEvents  (Object element);
	Object[] getAmountEvents(Object element);
	// event properties
	float getEventAmount(Object element, Object event);
	Date  getEventMoment(Object element, Object event);
}
