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
package com.misc.common.moplaf.gridview.emf.edit;

import java.util.Collection;
import java.util.Date;

/**
 * The interface declares the method(s) to be supported by an object that provides one or 
 * several sets of 2-dimensional data, for instance to be displayed in a grid.
 * <p>
 * The consumer (i.e. the component using the grid data, typically a table component)
 * will provide, when relevant
 * <ul>
 * <li> an element:Object: the object owning the grid(s) </li>
 * <li> a grid:Object: an object identifying a grid for the owner element</li>
 * <li> 
 * a column:Object: an object identifying a column. 
 * The object can be an actual Object, or an Integer, if no collection of Column Objects is provided (see further).
 * In this latter case, the index is zero-based.
 *  </li>
 * <li> 
 * a row:Object: an object identifying a row. 
 * The object can be an actual Object, or an Integer, if no collection of Row Objects is provided (see further).
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
	
	// sheet traits are hints for the consumer how to best display the grid
	static int SHEET_TRAITS_NONE     = 0;
	static int SHEET_TRAITS_ROWS     = 1; // a bunch of rows with a few columns 
	static int SHEET_TRAITS_COLUMNS  = 2; // a bunch of columns with a few rows
	static int SHEET_TRAITS_GRID     = 4; // no dominant between rows and columns
	static int SHEET_TRAITS_BARCHART = 8; // rows are categories and columns are series
	
	static int HORIZONTAL_ALIGN_LEFT   = 1;
	static int HORIZONTAL_ALIGN_RIGHT  = 2;
	static int HORIZONTAL_ALIGN_CENTER = 4;

	static int VERTICAL_ALIGN_TOP    = 8;
	static int VERTICAL_ALIGN_BOTTOM = 16;
	static int VERTICAL_ALIGN_CENTER = 32;

	static int CELL_TYPE_UNKOWN  = 0;
	static int CELL_TYPE_STRING  = 1;
	static int CELL_TYPE_DATE    = 2;
	static int CELL_TYPE_FLOAT   = 3;
	static int CELL_TYPE_DOUBLE  = 4;
	static int CELL_TYPE_INT     = 5;
	static int CELL_TYPE_LONG    = 6;
	static int CELL_TYPE_BOOLEAN = 7;
	
	/**
	 * Returns the grids published by the element. 
	 * <p>
	 * The method may return 
	 * <ul>
	 * <li> null: no grid for the element </li>
	 * <li> IItemGridsProvider: an object implementing this interface; in this case all the calls to this interface will be made through this object</li>
	 * <li> Collection<?>: a collection of grids for the element</li>
	 * <li> otherwise an Object: a single grid for the element </li>
	 * </ul>
	 * @param element
	 * @return
	 */
	default Object getGrids(Object element){
		return null;
	}
	
	/**
	 * Return the text associated to a grid published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default String getGridText(Object element, Object grid) {
		return "";
	}

	/**
	 * Return the traits about the grid. These traits are hints for the consumer how to best display/exploit the grid data.
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getGridTraits(Object element, Object grid) {
		return IItemGridsProvider.SHEET_TRAITS_NONE;
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
	 * Return the height of a row of a grid published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getRowHeight(Object element, Object grid, Object row) {
		return 50;
	}

	/**
	 * Compares 2 rows according to a given column.
	 * @param element
	 * @param grid
	 * @param row1
	 * @param row2
	 * @param column
	 * @param ascending
	 * @return
	 */
	default int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		int type1 = this.getCellType(element, grid, row1, column);
		int type2 = this.getCellType(element, grid, row2, column);
		Object value1 = this.getCellValue(element, grid, row1, column);
		Object value2 = this.getCellValue(element, grid, row2, column);
		return IItemGridsProvider.defaultCompareValues(value1, type1, value2, type2, ascending);
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
	 * Return the width of a column of a grid published by the element.
	 * @param element
	 * @param grid
	 * @return
	 */
	default int getColumnWidth(Object element, Object grid, Object column) {
		return 200;
	}
	
	/**
	 * Compares 2 columns according to a given row.
	 * @param element
	 * @param grid
	 * @param column1
	 * @param column2
	 * @param row
	 * @param ascending
	 * @return
	 */
	default int compareColumn(Object element, Object grid, Object column1, Object column2, Object row, boolean ascending) {
		int type1 = this.getCellType(element, grid, row, column1);
		int type2 = this.getCellType(element, grid, row, column2);
		Object value1 = this.getCellValue(element, grid, row, column1);
		Object value2 = this.getCellValue(element, grid, row, column2);
		return IItemGridsProvider.defaultCompareValues(value1, type1, value2, type2, ascending);
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
		Object value = this.getCellValue(element, grid, row, column);
		if      ( value instanceof String )   { return CELL_TYPE_STRING; }
		else if ( value instanceof Date )     { return CELL_TYPE_DATE; }
		else if ( value instanceof Float )    { return CELL_TYPE_FLOAT; }
		else if ( value instanceof Double )   { return CELL_TYPE_DOUBLE; }
		else if ( value instanceof Integer )  { return CELL_TYPE_INT; }
		else if ( value instanceof Long )     { return CELL_TYPE_LONG; }
		else if ( value instanceof Boolean )  { return CELL_TYPE_BOOLEAN; }
		return CELL_TYPE_UNKOWN;
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
			return HORIZONTAL_ALIGN_LEFT;
		case CELL_TYPE_FLOAT:
		case CELL_TYPE_DOUBLE:
		case CELL_TYPE_INT:
		case CELL_TYPE_LONG:
			return HORIZONTAL_ALIGN_RIGHT;
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
		case CELL_TYPE_DOUBLE:
			return "%1$.2f";
		case CELL_TYPE_INT:
		case CELL_TYPE_LONG:
			return "%1$d";
		case CELL_TYPE_BOOLEAN:
			return "%1$b";
		default:
			return null;
		}
	}

	static int defaultCompareValues(Object value1, int type1, Object value2, int type2, boolean ascending) {
		int sense = ascending ? +1 : -1;
		if ( type1<type2 ) { 
			return sense; 
		} else if ( type1>type2) {
			return -sense; 
		}
		switch (type1) {
		case CELL_TYPE_BOOLEAN:
			Boolean boolean1 = (Boolean)value1;
			Boolean boolean2 = (Boolean)value2;
			return sense*boolean1.compareTo(boolean2);
		case CELL_TYPE_STRING:
			String string1 = (String)value1;
			String string2 = (String)value2;
			return sense *string1.compareTo(string2);
		case CELL_TYPE_DATE:
			Date date1 = (Date)value1;
			Date date2 = (Date)value2;
			return sense *date1.compareTo(date2);
		case CELL_TYPE_INT:
			Integer int1 = (Integer)value1;
			Integer int2 = (Integer)value2;
			return sense *int1.compareTo(int2);
		case CELL_TYPE_LONG:
			Long long1 = (Long)value1;
			Long long2 = (Long)value2;
			return sense *long1.compareTo(long2);
		case CELL_TYPE_FLOAT:
			Float float1 = (Float)value1;
			Float float2 = (Float)value2;
			return sense *float1.compareTo(float2);
		case CELL_TYPE_DOUBLE:
			Double double1 = (Double)value1;
			Double double2 = (Double)value2;
			return sense *double1.compareTo(double2);
		default:
			return 0;
		}
	}
}


