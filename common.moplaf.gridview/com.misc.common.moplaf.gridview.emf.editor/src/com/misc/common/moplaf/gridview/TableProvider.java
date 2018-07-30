package com.misc.common.moplaf.gridview;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;

public interface TableProvider extends IStructuredContentProvider, ITableLabelProvider, ITableColorProvider {

	@Override
	default void dispose() {
		// TODO Auto-generated method stub
		
	}
	public String getTableText();
	
	public int compareRows(Object row1, Object row2, int columnIndex, boolean ascending);
	
	public TableColumnProvider[] getTableColumns();

	public int getColumnAlignment(int columnIndex);
	public int getColumnWidth(int columnIndex);

};
