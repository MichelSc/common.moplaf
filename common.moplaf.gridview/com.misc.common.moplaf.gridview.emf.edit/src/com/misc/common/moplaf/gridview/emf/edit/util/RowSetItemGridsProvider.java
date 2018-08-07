package com.misc.common.moplaf.gridview.emf.edit.util;

import java.util.Collection;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

public class RowSetItemGridsProvider implements IItemGridsProvider {
	private Object delegated_element;
	private Collection<?> rowSet;
	private IItemGridsProvider adapter;
	
	public RowSetItemGridsProvider(IItemGridsProvider adapter, Object delegated_element, Collection<?> rowSet) {
		super();
		Object grids_asobject = adapter.getGrids(delegated_element);
		while ( grids_asobject instanceof IItemGridsProvider ) {
			// delegated to 
			adapter = (IItemGridsProvider) grids_asobject;
			grids_asobject = adapter.getGrids(delegated_element);
		} 
		this.delegated_element = delegated_element;
		this.rowSet = rowSet;
		this.adapter = adapter;
	}
	
	// grids
	@Override
	public Object getGrids(Object element) {
		
		return this.adapter.getGrids(this.delegated_element);
	}
	@Override
	public String getGridText(Object element, Object grid) {
		return this.adapter.getGridText(this.delegated_element, grid);
	}

	// rows
	@Override
	public String getRowText(Object element, Object grid, Object row) {
		return this.adapter.getRowText(this.delegated_element, grid, row);
	}
	@Override
	public Collection<?> getRows(Object element, Object grid) {
		// the very function of this class
		return this.rowSet;
	}
	@Override
	public int getRowHeight(Object element, Object grid, Object row) {
		return this.adapter.getRowHeight(this.delegated_element, grid, row);
	}
	@Override
	public int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		return this.adapter.compareRow(this.delegated_element, grid, row1, row2, column, ascending);
	}

	// columns
	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		return this.adapter.getColumns(this.delegated_element, grid);
	}
	@Override
	public int getNrColumns(Object element, Object grid) {
		return this.adapter.getNrColumns(this.delegated_element, grid);
	}
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		return this.adapter.getColumnText(this.delegated_element, grid, column);
	}
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		return this.adapter.getColumnWidth(this.delegated_element, grid, column);
	}
	@Override
	public int compareColumn(Object element, Object grid, Object column1, Object column2, Object row,
			boolean ascending) {
		return this.adapter.compareColumn(this.delegated_element, grid, column1, column2, row, ascending);
	}

	// cells
	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellValue(this.delegated_element, grid, row, column);
	}
	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellType(this.delegated_element, grid, row, column);
	}
	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellForeground(this.delegated_element, grid, row, column);
	}
	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellBackground(this.delegated_element, grid, row, column);
	}
	@Override
	public Object getCellImage(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellImage(this.delegated_element, grid, row, column);
	}
	@Override
	public int getCellALignment(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellALignment(this.delegated_element, grid, row, column);
	}
	@Override
	public String getCellFormat(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellFormat(this.delegated_element, grid, row, column);
	}
}
