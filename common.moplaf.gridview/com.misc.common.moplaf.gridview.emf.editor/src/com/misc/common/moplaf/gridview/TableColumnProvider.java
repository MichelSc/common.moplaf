package com.misc.common.moplaf.gridview;

import org.eclipse.swt.graphics.Color;


public interface TableColumnProvider {
		public abstract String getText(TableRowProvider row);
		public abstract int getWidth();
		public abstract Color getForeground(TableRowProvider row);
		public abstract Color getBackground(TableRowProvider row); 
		public abstract int compare(TableRowProvider row1, TableRowProvider row2, boolean ascending);
		public abstract int getAlignemet();
}
