package com.misc.common.moplaf.datatools.provider;

import java.util.Collection;

import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProviderBase;

public class ColumnizerItemGridsProvider implements IItemGridsProvider {
	private Columnizer columnizer;
	private Collection<?> rowSet;
	private IItemGridsProviderBase adapter;
	
	public ColumnizerItemGridsProvider(Columnizer columnizer, Collection<?> rowSet) {
		super();
		this.columnizer = columnizer;
		this.rowSet = rowSet;
		this.adapter = (IItemGridsProviderBase)com.misc.common.moplaf.common.util.Util.adapt(columnizer, IItemGridsProviderBase.class);
	}
	
	// grids
	@Override
	public Object getGrids(Object element) {
		return this.adapter.getGrids(this.columnizer);
	}
	@Override
	public String getGridText(Object element, Object grid) {
		return this.adapter.getGridText(this.columnizer, grid);
	}

	// rows
	@Override
	public String getRowText(Object element, Object grid, Object row) {
		return this.adapter.getRowText(this.columnizer, grid, row);
	}
	@Override
	public Collection<?> getRows(Object element, Object grid) {
		// the very function of this class
		return this.rowSet;
	}
	@Override
	public int getRowHeight(Object element, Object grid, Object row) {
		return this.adapter.getRowHeight(this.columnizer, grid, row);
	}
	@Override
	public int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		return this.adapter.compareRow(this.columnizer, grid, row1, row2, column, ascending);
	}

	// columns
	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		return this.adapter.getColumns(this.columnizer, grid);
	}
	@Override
	public int getNrColumns(Object element, Object grid) {
		return this.adapter.getNrColumns(this.columnizer, grid);
	}
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		return this.adapter.getColumnText(this.columnizer, grid, column);
	}
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		return this.adapter.getColumnWidth(this.columnizer, grid, column);
	}
	@Override
	public int compareColumn(Object element, Object grid, Object column1, Object column2, Object row,
			boolean ascending) {
		return this.adapter.compareColumn(this.columnizer, grid, column1, column2, row, ascending);
	}

	// cells
	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellValue(this.columnizer, grid, row, column);
	}
	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellType(this.columnizer, grid, row, column);
	}
	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellForeground(this.columnizer, grid, row, column);
	}
	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellBackground(this.columnizer, grid, row, column);
	}
	@Override
	public Object getCellImage(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellImage(this.columnizer, grid, row, column);
	}
	@Override
	public int getCellALignment(Object element, Object grid, Object row, Object column) {
		return this.adapter.getCellALignment(this.columnizer, grid, row, column);
	}
	@Override
	public String getCellFormat(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return this.adapter.getCellFormat(this.columnizer, grid, row, column);
	}
}
