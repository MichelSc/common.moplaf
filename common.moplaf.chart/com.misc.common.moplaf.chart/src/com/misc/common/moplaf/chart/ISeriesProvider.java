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
 * An element may provide Series providers, and will return them by the method {@link #getSeriesProviders(Object)}. 
 * In this case
 * <ul>
 * <li> the method {@link #getSeries(Object, Object)} can be used to retrieve the Series associated with the element and the provider </li>
 * <li> the method the method {@link #getCategories(Object, Object)} can be used to retrieve the Categories associated the element and the provider </li> 
 * <li> the method {@link #getCategoryAmount(Object, Object, Object, Object)} can then be used to retrieve the amount:Float of a Category for a given Series and a given provider </li>
 * </ul> 
 * <p>
 * 
 * @author michel
 *
 */

public interface ISeriesProvider {
	// collection of series
	Object[] getSeriesProviders(Object element);
	Object[] getSeries(Object element, Object provider);
	Object[] getCategories(Object element, Object provider);
	// Category/Series properties
	float getCategoryAmount(Object element, Object provider, Object series, Object category);
}
