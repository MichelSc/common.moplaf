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
package com.misc.common.moplaf.gridview.emf.edit;

import java.util.Collection;

/**
 * <p>
 * This interface declares the method(s) to be supported by an object that provides a 
 * several sets of 2-dimensional data, for instance to be displayed in a grid.
 * <p>
 * The consumer (i.e. the component using the grid data, typically a table component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the grid(s) </li>
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
 * <li> the grid(s) supported by the element </li>
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
 *   <li>and add the following lines in the constructor
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

public interface IItemGridsProvider2 {
	static int NO_ALIGN = 0;
	static int HORIZONTAl_ALIGN_LEFT = 1;
	static int HORIZONTAl_ALIGN_RIGHT = 2;
	static int HORIZONTAl_ALIGN_CENTRE = 4;

	static int VERTICAL_ALIGN_TOP = 8;
	static int VERTICAL_ALIGN_BOTTOM = 16;
	static int VERTICAL_ALIGN_CENTRE = 32;

	static int DIECTION_ASCENDING = 1;
	static int DIECTION_DESCENDING = 2;
	
	static int CELL_TYPE_FLOAT = 1;
	static int CELL_TYPE_DATE = 2;
	static int CELL_TYPE_INT = 3;
	static int CELL_TYPE_STRING = 4;
	static int CELL_TYPE_BOOLEAN = 5;
	
	Collection<?> getGrids(Object element);
	String getText(Object element, Object grid);

	Collection<?> getRows(Object element, Object grid);
	int getNrRows(Object element, Object grid);
	String getRowText(Object element, Object grid, Object row);

	default int compareRow(Object element, Object grid, Object row1, Object row2, Object column, int direction) {
		int type1 = this.getCellType(element, grid, row1, column);
		int type2 = this.getCellType(element, grid, row2, column);
		if ( type1!=type2 ) {
			return 0;
		}
		switch (type1) {
		case CELL_TYPE_STRING:
			String string1 = (String)this.getCellValue(element, grid, row1, column);
			String string2 = (String)this.getCellValue(element, grid, row2, column);
			int sense = direction == DIECTION_ASCENDING ? +1 : -1;
			return sense *string1.compareTo(string2);
		default:
			return 0;
		}
	}
	
	Collection<?> getColumns(Object element, Object grid);
	default int getNrColumns(Object element, Object grid) {
		return 0;
	}
	String getColumnText(Object element, Object grid, Object column);
	
	Object getCellForeground(Object element, Object grid, Object row, Object column);
	Object getCellBackground(Object element, Object grid, Object row, Object column);
	Object getCellValue     (Object element, Object grid, Object row, Object column);

	default int getCellType(Object element, Object grid, Object row, Object column) {
		return CELL_TYPE_STRING;
	}

	default Object getCellImage     (Object element, Object grid, Object row, Object column) {
		return null;
	}

	default int getCellALignment (Object element, Object grid, Object row, Object column) {
		int type = this.getCellType(element, grid, row, column);
		switch ( type ) {
		case CELL_TYPE_STRING: 
			return HORIZONTAl_ALIGN_LEFT;
		case CELL_TYPE_FLOAT:
		case CELL_TYPE_INT:
			return HORIZONTAl_ALIGN_RIGHT;
		default: 
			return NO_ALIGN;
		}
	}
}


