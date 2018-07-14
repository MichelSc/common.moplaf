package com.misc.common.moplaf.datatools.provider;

import java.util.Collection;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

public class ColumnizerItemGridsProvider implements IItemGridsProvider {
	private IItemGridsProvider adapter;
	private Collection<?> rowSet;
	
	public ColumnizerItemGridsProvider(IItemGridsProvider columnizer, Collection<?> rowSet) {
		super();
		this.adapter = columnizer;
		this.rowSet = rowSet;
	}
	
	// grids
	@Override
	public Object getGrids(Object element) {
		return this.adapter.getGrids(element);
	}
	@Override
	public String getGridText(Object element, Object grid) {
		return this.adapter.getGridText(element, grid);
	}

	// rows
	@Override
	public String getRowText(Object element, Object grid, Object row) {
		return this.adapter.getRowText(element, grid, row);
	}
	@Override
	public Collection<?> getRows(Object element, Object grid) {
		// the very function of this class
		return this.rowSet;
	}
	@Override
	public int getRowHeight(Object element, Object grid, Object row) {
		return this.adapter.getRowHeight(element, grid, row);
	}
	@Override
	public int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		return this.adapter.compareRow(element, grid, row1, row2, column, ascending);
	}

	// columns
	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		return this.adapter.getColumns(element, grid);
	}
	@Override
	public int getNrColumns(Object element, Object grid) {
		return this.adapter.getNrColumns(element, grid);
	}
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		return this.adapter.getColumnText(element, grid, column);
	}
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		return this.adapter.getColumnWidth(element, grid, column);
	}
	@Override
	public int compareColumn(Object element, Object grid, Object column1, Object column2, Object row,
			boolean ascending) {
		return this.adapter.compareColumn(element, grid, column1, column2, row, ascending);
	}

	// cells
	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellValue(element, grid, row, column);
	}
	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellType(element, grid, row, column);
	}
	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellForeground(element, grid, row, column);
	}
	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellBackground(element, grid, row, column);
	}
	@Override
	public Object getCellImage(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellImage(element, grid, row, column);
	}
	@Override
	public int getCellALignment(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellALignment(element, grid, row, column);
	}
	@Override
	public String getCellFormat(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return this.adapter.getCellFormat(element, grid, row, column);
	}
}
