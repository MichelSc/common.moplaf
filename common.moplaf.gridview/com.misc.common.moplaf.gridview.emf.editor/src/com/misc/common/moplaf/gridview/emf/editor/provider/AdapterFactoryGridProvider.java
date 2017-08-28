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
package com.misc.common.moplaf.gridview.emf.editor.provider;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.provider.ExtendedColorRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.gridview.Wrapper;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;


/**
 * Implements the following interfaces
 * <ul>
 * <li> {@link IPropertySourceProvider}</li>
 * <li> {@link INotifyChangedListener}</li>
 * <li> {@link ITreeContentProvider}</li>
 * </ul>
 * <p>
 * @author michel
 *
 */
public class AdapterFactoryGridProvider extends AdapterFactoryArrayContentProvider {
	private Color foregroundColor = null;
	private Color backgroundColor = null;

	// constructor
	public AdapterFactoryGridProvider(AdapterFactory adapterFactory, Color foregroundColor, Color backgroundColor){
		super(adapterFactory);
		this.foregroundColor = foregroundColor;
		this.backgroundColor = backgroundColor;
	}

	@Override
	public void dispose(){
	}
	
	/** 
	 * Helper function for getting an swt.Color
	 * @param object
	 * @return
	 */
	private Color getColorFromObject(Object object) {
		if ( object == null ) { return null; }
		Color color = ExtendedColorRegistry.INSTANCE.getColor(this.foregroundColor, this.backgroundColor, object);
		return color;
	}
	
	private String getTextFromValue(Object cellValue, int cellType, String format) {
		if ( format!=null) {
			return String.format(format, cellValue);
		} else {
			switch ( cellType ) {
			case IItemGridsProvider.CELL_TYPE_STRING: 
				return (String)cellValue;
			case IItemGridsProvider.CELL_TYPE_DATE: 
				return String.format("%1$tF %1$tT", cellValue);
			case IItemGridsProvider.CELL_TYPE_FLOAT:
				return String.format("%1$.2f", cellValue);
			case IItemGridsProvider.CELL_TYPE_INT:
				return String.format("%1$d", cellValue);
			case IItemGridsProvider.CELL_TYPE_BOOLEAN:
				return String.format("%1$b", cellValue);
			default: 
				return null;
			}
		}
	}

	/**
	 * Specified by ITreeContentProvider 
	 */
	@Override
	public Object[] getChildren(Object object) {
		// super children
		Object[] super_children = super.getChildren(object);
		int nof_super_children = super_children.length;
		// providers
		ArrayList<?> providers = this.getTableProviders(object);
		if ( providers==null){
			return super_children;
		}
		// concatenate
		Object[] children = new Object[providers.size()+nof_super_children];
		System.arraycopy(super_children, 0, children, 0, nof_super_children);
		int i = nof_super_children;
		for ( Object provider : providers) {
			children[i]= provider;
			i++;
		}
		return children;
	}

	/**
	 * Specified by ITreeContentProvider 
	 */
	@Override
	public Object getParent(Object object) {
		if ( object instanceof TableProvider){
			TableProvider provider = (TableProvider) object;
			return provider.element;
		}
			
		return super.getParent(object);
	}
	
	/**
	 * Return a collection of object extending the private class  {@link TimePlotProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider}, and {@link IItemColorProvider}
	 * <p>
	 */
	private ArrayList<TableProvider> getTableProviders(Object element){
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemGridsProvider gridsProvider = (IItemGridsProvider) adapterFactory.adapt(element, IItemGridsProvider.class);
		
		if ( gridsProvider == null ){ return null; }
		
		ArrayList<TableProvider> providers = new ArrayList<TableProvider>();
		
		Collection<?> grids = gridsProvider.getGrids(element);
		if ( grids==null ){
				TableProvider provider = this.createTableProvider(element, null, gridsProvider);
				providers.add(provider);
		} else {
			for ( Object grid : grids){
				TableProvider provider = this.createTableProvider(element, grid, gridsProvider);
				providers.add(provider);
			}
		} 
		
		return providers;
	}
	

	private TableProvider createTableProvider(Object nativeObject, Object timePlotKey, IItemGridsProvider provider){
			return new TableProvider(nativeObject, timePlotKey, provider);
	}


	
	/**
	 * Helper class for the conversion of an IItemGridsProvider (abstract) to jface providers 
	 * @author michel
	 *
	 */
	public class TableProvider implements IStructuredContentProvider , ITableLabelProvider, ITableColorProvider {
		/**
		 * 
		 * @author michel
		 *
		 */
		public abstract class TableRowProvider  {
			public abstract String getText(Object columnObject);
			public abstract Object getForeground(Object columnObject);
			public abstract Object getBackground(Object columnObject); 
			public abstract Object getRowObject();
		};
		public class TableRowData extends TableRowProvider implements Wrapper {
			private Object gridRow;
			public TableRowData(Object gridRow) {
				super();
				this.gridRow= gridRow;
			}
			
			@Override
			public String getText(Object columnObject) {
				TableProvider provider = TableProvider.this; 
				if ( columnObject == null ){
					return provider.gridsProvider.getRowText(provider.element, provider.grid, this.gridRow);
				}
				Object cellValue  = provider.gridsProvider.getCellValue(provider.element, provider.grid, this.gridRow, columnObject);
				int    cellType   = provider.gridsProvider.getCellType(provider.element, provider.grid, this.gridRow, columnObject);
				String cellFormat = provider.gridsProvider.getCellFormat(provider.element, provider.grid, this.gridRow, columnObject);
				return AdapterFactoryGridProvider.this.getTextFromValue(cellValue, cellType, cellFormat);
			}
			
			@Override
			public Object getForeground(Object columnObject) {
				TableProvider provider = TableProvider.this;
				AdapterFactoryGridProvider factoryProvider = AdapterFactoryGridProvider.this; 
				Object color = columnObject == null 
						? factoryProvider.foregroundColor 
						: provider.gridsProvider.getCellForeground(provider.element, provider.grid, this.gridRow, columnObject);
				return factoryProvider.getColorFromObject(color);
			}
			
			@Override
			public Object getBackground(Object columnObject) {
				TableProvider provider = TableProvider.this;
				AdapterFactoryGridProvider factoryProvider = AdapterFactoryGridProvider.this; 
				Object color = columnObject == null 
						? factoryProvider.backgroundColor 
						: provider.gridsProvider.getCellBackground(provider.element, provider.grid, this.gridRow, columnObject);
				return factoryProvider.getColorFromObject(color);
			}

			@Override
			public Object unwrap() {
				return this.gridRow;
			}

			@Override
			public Object getRowObject() {
				return this.gridRow;
			}
			
		}
		/**
		 * 
		 * @author michel
		 *
		 */
		public abstract class TableColumnProvider  {
			public abstract String getText(TableRowProvider row);
			public abstract Color getForeground(TableRowProvider row);
			public abstract Color getBackground(TableRowProvider row); 
			public abstract int compare(TableRowProvider row1, TableRowProvider row2, boolean ascending);
		};
		private class TableColumnHeader extends TableColumnProvider {
			public TableColumnHeader() {
				
			};
			@Override
			public String getText(TableRowProvider row) {
				if ( row!= null ) {
					return row.getText(null);
				}
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.getGridText(provider.element, provider.grid); 
			}
			@Override
			public Color getForeground(TableRowProvider row) {
				AdapterFactoryGridProvider factoryProvider = AdapterFactoryGridProvider.this; 
				Object color = factoryProvider.foregroundColor;
				return factoryProvider.getColorFromObject(color);
			}
			@Override
			public Color getBackground(TableRowProvider row) {
				AdapterFactoryGridProvider factoryProvider = AdapterFactoryGridProvider.this; 
				Object color = factoryProvider.backgroundColor;
				return factoryProvider.getColorFromObject(color);
			}
			@Override
			public int compare(TableRowProvider row1, TableRowProvider row2, boolean ascending) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		private class TableColumnData extends TableColumnProvider {
			private Object gridColumn;
			public TableColumnData(Object gridColummn) {
				super();
				this.gridColumn = gridColummn;
			}
			@Override
			public String getText(TableRowProvider row) {
				if ( row!= null ) {
					return row.getText(this.gridColumn);
				}
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.getColumnText(provider.element, provider.grid, this.gridColumn); 
				
			}
			@Override
			public Color getForeground(TableRowProvider row) {
				AdapterFactoryGridProvider factoryProvider = AdapterFactoryGridProvider.this; 
				Object color = row==null
						     ? factoryProvider.foregroundColor
						     : row.getForeground(this.gridColumn);
				return factoryProvider.getColorFromObject(color);
				
			}
			@Override
			public Color getBackground(TableRowProvider row) {
				AdapterFactoryGridProvider factoryProvider = AdapterFactoryGridProvider.this; 
				Object color = row==null
						     ? factoryProvider.backgroundColor
						     : row.getBackground(this.gridColumn);
				return factoryProvider.getColorFromObject(color);
			}
			@Override
			public int compare(TableRowProvider row1, TableRowProvider row2, boolean ascending) {
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.compareRow(provider.element,
   							                             provider.grid,
								                         row1.getRowObject(), 
												         row2.getRowObject(), 
												         this.gridColumn,
												         ascending);
			}
		};
		
		protected IItemGridsProvider gridsProvider;
		protected Object element;
		protected Object grid;
		// maps the table column index to the grid column object (if any, or grid column index otherwise) 
		protected TableColumnProvider[] indexToColumn = null;
		protected TableRowProvider[]    indexToRow = null;
		
		/**
		 * 
		 */
		public TableProvider(Object element, Object grid, IItemGridsProvider gridsProvider) {
			super();
			this.gridsProvider = gridsProvider;
			this.element = element;
			this.grid = grid;
			// initialize the columns
			Collection<?> gridColumns = this.gridsProvider.getColumns(this.element, this.grid);
			int nofColumns = gridColumns==null 
					       ? this.gridsProvider.getNrColumns(this.element,  this.grid)
					       : gridColumns.size();
            this.indexToColumn = new TableColumnProvider[nofColumns+1];
            this.indexToColumn[0] = new TableColumnHeader();
			if ( gridColumns==null) {
				for (int i=1; i<=nofColumns; i++) {
					this.indexToColumn[i] = new TableColumnData(i-1);
				}
            } else {
    			int i = 1;
				for ( Object gridColumn : gridColumns) {
					this.indexToColumn[i++] = new TableColumnData(gridColumn);
				}
            }
			// initialize the rows
			Collection<?> gridRows= this.gridsProvider.getRows(this.element, this.grid);
			int nofRows = gridRows==null 
					       ? this.gridsProvider.getNrRows(this.element,  this.grid)
					       : gridRows.size();
            this.indexToRow = new TableRowProvider[nofRows];
			if ( gridRows==null) {
				for (int i=0; i<nofRows; i++) {
					this.indexToRow[i] = new TableRowData(i-1);
				}
            } else {
    			int i = 0;
				for ( Object gridRow : gridRows) {
					this.indexToRow[i++] = new TableRowData(gridRow);
				}
            }
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((element == null) ? 0 : element.hashCode());
			result = prime * result + ((grid == null) ? 0 : grid.hashCode());
			result = prime * result + ((gridsProvider == null) ? 0 : gridsProvider.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TableProvider other = (TableProvider) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (element == null) {
				if (other.element != null)
					return false;
			} else if (!element.equals(other.element))
				return false;
			if (grid == null) {
				if (other.grid != null)
					return false;
			} else if (!grid.equals(other.grid))
				return false;
			if (gridsProvider == null) {
				if (other.gridsProvider != null)
					return false;
			} else if (!gridsProvider.equals(other.gridsProvider))
				return false;
			return true;
		}
		
		public String getTableText() {
			return this.gridsProvider.getGridText(this.element, this.grid);
		}

		/**
		 * specified by IBaseLabelProvider
		 */
		@Override
		public void addListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * specified by IBaseLabelProvider
		 */
		@Override
		public boolean isLabelProperty(Object element, String property) {
			// TODO Auto-generated method stub
			return false;
		}

		/**
		 * specified by IBaseLabelProvider
		 */
		@Override
		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int compareRows(Object row1, Object row2, int columnIndex, boolean ascending) {
			TableRowProvider row1_provider = (TableRowProvider)row1;
			TableRowProvider row2_provider = (TableRowProvider)row2;
			TableColumnProvider columnProvider = this.indexToColumn[columnIndex];
			return columnProvider.compare(row1_provider, row2_provider, ascending);
		}

		private AdapterFactoryGridProvider getOuterType() {
			return AdapterFactoryGridProvider.this;
		}

		public TableColumnProvider[] getTableColumns() {
			return this.indexToColumn;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return this.indexToRow;
		}

		public String getColumnText(int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getText(null);
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			TableRowProvider row = (TableRowProvider)element;
			return column.getText(row);
		}

		@Override
		public Color getForeground(Object element, int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			TableRowProvider row = (TableRowProvider)element;
			return column.getForeground(row);
		}

		@Override
		public Color getBackground(Object element, int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			TableRowProvider row = (TableRowProvider)element;
			return column.getBackground(row);
		}
		
		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			IStructuredContentProvider.super.dispose();
		}

	};
	
}
