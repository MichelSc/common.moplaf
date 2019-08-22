package com.misc.common.moplaf.gridview;

public interface TableRowProvider {
	public abstract String getText(Object columnObject);
	public abstract Object getForeground(Object columnObject);
	public abstract Object getBackground(Object columnObject); 
	public abstract Object getRowObject();
}
