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

public interface IItemGridsProvider {
	static int NO_ALIGN = 0;
	
	static int HORIZONTAl_ALIGN_LEFT = 1;
	static int HORIZONTAl_ALIGN_RIGHT = 2;
	static int HORIZONTAl_ALIGN_CENTRE = 4;

	static int VERTICAL_ALIGN_TOP = 8;
	static int VERTICAL_ALIGN_BOTTOM = 16;
	static int VERTICAL_ALIGN_CENTRE = 32;

	static int DIECTION_ASCENDING = 1;
	static int DIECTION_DESCENDING = 2;
	
	static int CELL_TYPE_STRING  = 1;
	static int CELL_TYPE_DATE    = 2;
	static int CELL_TYPE_FLOAT   = 3;
	static int CELL_TYPE_INT     = 4;
	static int CELL_TYPE_BOOLEAN = 5;
	
	/**
	 * Returns the grids published by the element. 
	 * <p>
	 * If null is returned, one grid is supported by the element, identified by a null grid key.
	 * @param element
	 * @return
	 */
	default Collection<?> getGrids(Object element){
		return null;
	}
	
	/**
	 * Return the text associated by a grid published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getGridText(Object element, Object grid) {
		return "";
	}

	/**
	 * Returns the collections of objects representing the rows of a grid published by an element.
	 * <p>
	 * If no collection is returned, then the number of rows is given by {@link #getNrRows(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default Collection<?> getRows(Object element, Object grid){
		return null;
	}
	
	/**
	 * Returns number of rows of a grid published by an element.
	 * <p>
	 * The return value may be ignored when the concrete class implements {@link #getRows(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getNrRows(Object element, Object grid) {
		return 0;
	}
	
	/**
	 * Return the text associated to a row of a grid published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getRowText(Object element, Object grid, Object row) {
		return "";
	}

	/**
	 * Compares 2 rows according to some column.
	 * @param element
	 * @param grid
	 * @param row1
	 * @param row2
	 * @param column
	 * @param direction
	 * @return
	 */
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
	
	/**
	 * Returns the collections of objects representing the columns of a grid published by an element.
	 * <p>
	 * If no collection is returned, then the number of columns is given by {@link #getNrColumns(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default Collection<?> getColumns(Object element, Object grid){
		return null; 
	}
	
	/**
	 * Returns number of columns of a grid published by an element.
	 * <p>
	 * The return value may be ignored when the concrete class implements {@link #getColumns(Object, Object)}
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getNrColumns(Object element, Object grid) {
		return 0;
	}

	/**
	 * Return the text associated to a column of a grid published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getColumnText(Object element, Object grid, Object column) {
		return "";
	}
	
	/**
	 * Compares 2 columns according to some row.
	 * @param element
	 * @param grid
	 * @param column1
	 * @param column2
	 * @param row
	 * @param direction
	 * @return
	 */
	default int compareColumn(Object element, Object grid, Object column1, Object column2, Object row, int direction) {
		int type1 = this.getCellType(element, grid, row, column1);
		int type2 = this.getCellType(element, grid, row, column2);
		if ( type1!=type2 ) {
			return 0;
		}
		switch (type1) {
		case CELL_TYPE_STRING:
			String string1 = (String)this.getCellValue(element, grid, row, column1);
			String string2 = (String)this.getCellValue(element, grid, row, column2);
			int sense = direction == DIECTION_ASCENDING ? +1 : -1;
			return sense *string1.compareTo(string2);
		default:
			return 0;
		}
	}
	

	/**
	 * 
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default Object getCellValue(Object element, Object grid, Object row, Object column) {
		return null;
	}

	/**
	 * 
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default int getCellType(Object element, Object grid, Object row, Object column) {
		return CELL_TYPE_STRING;
	}

	/**
	 * 
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default Object getCellForeground(Object element, Object grid, Object row, Object column) {
		return null;
	}
	
	/**
	 * 
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default Object getCellBackground(Object element, Object grid, Object row, Object column) {
		return null;
	}
	

	default Object getCellImage (Object element, Object grid, Object row, Object column) {
		return null;
	}

	/**
	 * Return the alignment to be used in a cell of a grid published by an element
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
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
	/**
	 * Return the format to be used for converting the value to a text. Uses {@link java.lang.String#format(String, Object...)} conversions. 
	 * <p>
	 * If no formating is to be applied, null can be returned.
	 * @param element
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
	default String getCellFormat(Object element, Object grid, Object row, Object column) {
		int type = this.getCellType(element, grid, row, column);
		switch ( type ) {
		case CELL_TYPE_STRING: 
			return "%1$s";
		case CELL_TYPE_DATE: 
			return "%1$tF %1$tT";
		case CELL_TYPE_FLOAT:
			return "%1$.2f";
		case CELL_TYPE_INT:
			return "%1$d";
		case CELL_TYPE_BOOLEAN:
			return "%1$bd";
		default:
			return null;
		}
	}
}


