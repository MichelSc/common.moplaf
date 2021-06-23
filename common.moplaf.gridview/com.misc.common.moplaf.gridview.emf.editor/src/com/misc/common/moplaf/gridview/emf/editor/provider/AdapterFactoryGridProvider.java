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
package com.misc.common.moplaf.gridview.emf.editor.provider;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.provider.ExtendedColorRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import com.misc.common.moplaf.common.util.Util;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.gridview.TablesProvider;
import com.misc.common.moplaf.gridview.Wrapper;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.TableColumnProvider;
import com.misc.common.moplaf.gridview.TableRowProvider; 


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
public class AdapterFactoryGridProvider extends AdapterFactoryArrayContentProvider implements TablesProvider{
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
	
	/**
	 * Return a collection of object extending the private class  {@link TableProvider}, and implementing 
	 * the interfaces  {@link IStructuredContentProvider}, {@link ITableColorProvider}, {@link ITableLabelProvider}, 
	 * <p>
	 */
	@Override
	public ArrayList<com.misc.common.moplaf.gridview.TableProvider> getTableProviders(Object element){
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemGridsProvider gridsProvider = (IItemGridsProvider) adapterFactory.adapt(element, IItemGridsProvider.class);
		
		if ( gridsProvider == null ){ return null; }
		
		ArrayList<com.misc.common.moplaf.gridview.TableProvider> providers = new ArrayList<com.misc.common.moplaf.gridview.TableProvider>();
		
		Object grids_asobject = gridsProvider.getGrids(element);
		while ( grids_asobject instanceof IItemGridsProvider ) {
			// delegated to 
			gridsProvider = (IItemGridsProvider) grids_asobject;
			grids_asobject = gridsProvider.getGrids(element);
		} 
		if ( grids_asobject instanceof Collection<?> ) {
			// a collections of grids for the element
			Collection<?> grids = (Collection<?>)grids_asobject;
			for ( Object grid : grids){
				TableProvider provider = this.createTableProvider(element, grid, gridsProvider);
				providers.add(provider);
			}
		} else if ( grids_asobject!=null ){
			// a single grid for the element
			TableProvider provider = this.createTableProvider(element, grids_asobject, gridsProvider);
			providers.add(provider);
		} 
		
		return providers;
	}
	

	private TableProvider createTableProvider(Object element, Object grid, IItemGridsProvider provider){
			return new TableProvider(element, grid, provider);
	}


	
	/**
	 * Helper class for the conversion of an IItemGridsProvider (abstract) to jface providers 
	 * @author michel
	 *
	 */
	private class TableProvider implements com.misc.common.moplaf.gridview.TableProvider {
		public class TableRowData implements TableRowProvider, Wrapper {
			private Object gridRow;
			public TableRowData(Object gridRow) {
				super();
				this.gridRow= gridRow;
			}
			
			@Override
			public String getText(Object columnObject) {
				TableProvider provider = TableProvider.this; 
				if ( columnObject == null ){
					String text =  provider.gridsProvider.getRowText(provider.element, provider.grid, this.gridRow);
					return text==null ? "" : text;
				}
				Object cellValue  = provider.gridsProvider.getCellValue (provider.element, provider.grid, this.gridRow, columnObject);
				int    cellType   = provider.gridsProvider.getCellType  (provider.element, provider.grid, this.gridRow, columnObject);
				String cellFormat = provider.gridsProvider.getCellFormat(provider.element, provider.grid, this.gridRow, columnObject);
				return Util.getTextFromValue(cellValue, cellType, cellFormat);
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
		private class TableColumnHeader implements TableColumnProvider {
			public TableColumnHeader() {
				
			};
			@Override
			public String getText(TableRowProvider row) {
				if ( row!= null ) {
					return row.getText(null);
				}
				TableProvider provider = TableProvider.this; 
				String text = provider.gridsProvider.getGridText(provider.element, provider.grid);
				return text==null ? "" : text;
			}
			@Override
			public int getWidth() {
				return 100;
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
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.compareRow(provider.element,
   							                             provider.grid,
								                         row1.getRowObject(), 
												         row2.getRowObject(), 
												         ascending);
			}
			@Override
			public int getAlignemet() {
				return SWT.LEFT;
			}
		};
		private class TableColumnData implements TableColumnProvider {
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
				String text =  provider.gridsProvider.getColumnText(provider.element, provider.grid, this.gridColumn);
				return text==null ? "" : text;
				
			}
			public int getWidth() {
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.getColumnWidth(provider.element, provider.grid, this.gridColumn); 
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
			@Override
			public int getAlignemet() {
				TableProvider table = TableProvider.this;
				int nofRows = table.indexToRow.length;
				if ( nofRows==0 ) { return SWT.LEFT; } 
				TableRowProvider arbitrary_row = table.indexToRow[nofRows-1]; // last row is a better exemplar
				int alignemnt = table.gridsProvider.getCellALignment(table.element, table.grid, arbitrary_row.getRowObject(), this.gridColumn);
				switch ( alignemnt) {
				case IItemGridsProvider.HORIZONTAL_ALIGN_LEFT: return SWT.LEFT;
				case IItemGridsProvider.HORIZONTAL_ALIGN_CENTER: return SWT.CENTER;
				case IItemGridsProvider.HORIZONTAL_ALIGN_RIGHT: return SWT.RIGHT;
				}
				return 0;
			}
		};
		
		protected IItemGridsProvider gridsProvider;
		protected Object element;
		protected Object grid;
		// maps the table column index to the grid column object (if any, or grid column index otherwise) 
		protected TableColumnProvider[] indexToColumn = null;
		protected TableRowProvider[]    indexToRow = null;
		
		/**********************************************************************
		 * Constructor
		 **********************************************************************/
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
		
		
		/**********************************************************************
		 * Private methods
		 *********************************************************************/
		private AdapterFactoryGridProvider getOuterType() {
			return AdapterFactoryGridProvider.this;
		}

		/**********************************************************************
		 * Specified by Object
		 *********************************************************************/
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
		
		/**********************************************************************
		 * specified by IBaseLabelProvider
		 *********************************************************************/
		@Override
		public void addListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		/**********************************************************************
		 * Specified by IContentProvider
		 *********************************************************************/
		@Override
		public void dispose() {
			// TODO Auto-generated method stub
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
		}

		/**********************************************************************
		 * Specified by IStructuredContentProvider
		 *********************************************************************/
		@Override
		public Object[] getElements(Object inputElement) {
			return this.indexToRow;
		}

		/**********************************************************************
		 * Specified by ITableLabelProvider
		 *********************************************************************/
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
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		
		/**********************************************************************
		 * Called by GridViewer
		 * @return
		 *********************************************************************/
		public String getTableText() {
			String text = this.gridsProvider.getGridText(this.element, this.grid);
			return text == null ? "" : text;
		}

		public int compareRows(Object row1, Object row2, int columnIndex, boolean ascending) {
			TableRowProvider row1_provider = (TableRowProvider)row1;
			TableRowProvider row2_provider = (TableRowProvider)row2;
			TableColumnProvider columnProvider = this.indexToColumn[columnIndex];
			return columnProvider.compare(row1_provider, row2_provider, ascending);
		}

		public TableColumnProvider[] getTableColumns() {
			return this.indexToColumn;
		}

		public String getColumnText(int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getText(null);
		}

		public int getColumnWidth(int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getWidth();
		}

		public int getColumnAlignment(int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getAlignemet();
		}

	};
	
}
