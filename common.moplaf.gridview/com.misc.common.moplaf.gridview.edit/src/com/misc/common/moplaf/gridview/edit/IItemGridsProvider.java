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
package com.misc.common.moplaf.gridview.edit;

import java.util.Collection;

/**
 * <p>
 * This interface declares the method(s) to be supported by an object that provides a 
 * one or several sets of 2-dimensional data, for instance to be displayed in a grid.
 * <p>
 * The consumer (i.e. the component using the grid data, typically a table component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the grids </li>
 * <li> a grid:Object: the grid for the owner element; the grid Object may be null if the object supports only one grid </li>
 * <li> 
 * a column:Object: object representing the column. 
 * The object can be an actual object, or an Integer, if the no collection of Column Objects is provided (see further).
 * In this latter case, the index is zero-based.
 *  </li>
 * <li> 
 * a row:Object: object representing the row. 
 * The object can be an actual object, or an Integer, if the no collection of Row Objects is provided (see further).
 * In this latter case, the index is zero-based.
 *  </li>
 * </ul>
 * in order to get
 * <ul>
 * <li> the grids supported by the element </li>
 * <li> the columns belonging to a grid of an element (their number or the actual set)</li>
 * <li> the rows belonging to a grid of an element (their number or the actual set)</li>
 * <li> properties to be displayed in a cell of the grid </li>
 * </ul>
 * <p>
 * <p>
 * To implement this interface by an {@link ItemProviderAdapter}, in the concrete class, do the following 
 * <ul>
 *   <li>add <code>@implements IItemGridsProvider</code> in the user doc</li>
 *   <li>regenerate the code</li>
 *   <li>add the unimplemented methods</li>
 *   <li>implement the interface methods</li>
 * </ul> 
 * In the project's ProviderAdapterFactory, 
 * <ul>
 *   <li>you must change the method {@link #isFactoryForType}</li>
 *   <li>and add the following lines in the constructors
 *     <ul>
 *     <li>	<code>supportedTypes.add(IItemGridsProvider.class); // moplaf interface </code></li>
 *     </ul>
 * </ul> 
 * In the plugin.xml,  
 * <ul>
 *   <li>add the type IItemGridsProvider in the field SupportedTypes for extension org.eclipse.emf.edit.itemProviderAdapterFactories </li>
 * </ul> 
 * <p>
 * @author michel
 */

public interface IItemGridsProvider {
	static int NO_ALIGN = 0;
	static int HORIZONTAl_ALIGN_LEFT = 1;
	static int HORIZONTAl_ALIGN_RIGHT = 2;
	static int HORIZONTAl_ALIGN_CENTRE = 4;
	static int VERTICAL_ALIGN_TOP = 8;
	static int VERTICAL_ALIGN_BOTTOM = 16;
	static int VERTICAL_ALIGN_CENTRE = 32;
	
	Collection<?> getGrids(Object element);
	String getText(Object element, Object grid);

	Collection<?> getRows(Object element, Object grid);
	int getNrRows(Object element, Object grid);
	String getRowText(Object element, Object grid, Object row);
	
	Collection<?> getColumns(Object element, Object grid);
	int getNrColumns(Object element, Object grid);
	String getColumnText(Object element, Object grid, Object column);
	
	Object getCellForeground(Object element, Object grid, Object row, Object column);
	Object getCellBackground(Object element, Object grid, Object row, Object column);
	String getCellText      (Object element, Object grid, Object row, Object column);
	Object getCellImage     (Object element, Object grid, Object row, Object column);
	int    getCellALignment (Object element, Object grid, Object row, Object column);
}


