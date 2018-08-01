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
package com.misc.common.moplaf.chart;


/**
 * The interface ISeriesProvider specifies the interface to be supported
 * for providing Series of values.
 * <p>
 * This interface can then be consumed by a graphical component for Series values.
 * <p>
 * Other information to be used by the consumer will be provided by standard
 * jFace interfaces, namely
 * <ul>
 * <li> {@link org.eclipse.jface.viewers.IStructuredContentProvider}, providing the content to be displayed, namely the categories </li>
 * <li> {@link org.eclipse.jface.viewers.ILabelProvider}, providing labels for the elements of the content</li>
 * <li> {@link org.eclipse.jface.viewers.IColorProvider}, providing foreground and background colors for the elements of the content</li>
 * </ul>
 * 
 * <p>
 * An element may provide Series, and will be recognized by the method {@link #isSeriesProvider(Object)}. 
 * In this case, the method {@link #getSeries(Object)} can be used to retrieve the Series associated 
 * with the element and the method the method {@link #getCategories(Object)} can be used to retrieve the Categories associated 
 * with the element. The method {@link #getCategoryAmount(Object, Object, Object)}
 * can then be used to retrieve the amount:Float of a Category for a given Series. 
 * <p>
 * 
 * @author michel
 *
 */

public interface ISeriesProvider {
	// collection of series
	boolean isSeriesProvider(Object element);
	Object[] getSeries(Object element);
	Object[] getCategories(Object element);
	// Category/Series properties
	float getCategoryAmount(Object element, Object series, Object category);
}
