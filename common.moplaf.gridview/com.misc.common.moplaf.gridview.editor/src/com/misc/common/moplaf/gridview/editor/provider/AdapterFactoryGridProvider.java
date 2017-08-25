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
package com.misc.common.moplaf.gridview.editor.provider;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedColorRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import com.misc.common.moplaf.gridview.edit.IItemGridsProvider;


/**
 * Implements the following interfaces
 * <ul>
 * <li> {@link IPropertySourceProvider}</li>
 * <li> {@link INotifyChangedListener}</li>
 * <li> {@link AdapterFactoryGridProvider}</li>
 * </ul>
 * <p>
 * @author MiSc
 *
 */
public class AdapterFactoryGridProvider extends AdapterFactoryContentProvider {
	

	// constructor
	public AdapterFactoryGridProvider(AdapterFactory adapterFactory){
		super(adapterFactory);
	}

	// dispose
	public void dispose(){
	}
	
	private Color getColorFromObject(Object object) {
		if ( object == null ) { return null; }
		Color color = ExtendedColorRegistry.INSTANCE.getColor
				(this.viewer.getControl().getForeground(), 
				 this.viewer.getControl().getBackground(), 
                 object);
		return color;
	}
	


	/**
	 * Return a collection of object extending the private class  {@link TimePlotProvider}, and implementing 
	 * the interfaces {@link IItemLabelProvider}, and {@link IItemColorProvider}
	 * <p>
	 */
	public ArrayList<TableProvider> getTableProviders(Object element){
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
	 * Helper class for the conversion of an IItemTimePlotsProvider (abstract) to an EventProvider
	 * @author michel
	 *
	 */
	public class TableProvider implements IStructuredContentProvider , ITableLabelProvider, ITableColorProvider {
		public abstract class TableColumnProvider  {
			public abstract String getColumnText(); 
			public abstract String getColumnText(Object rowObject);
			public abstract Color getColumnForeground(Object rowObject);
			public abstract Color getColumnBackground(Object rowObject); 
		};
		private class TableColumnHeader extends TableColumnProvider {
			public TableColumnHeader() {
				
			};
			@Override
			public String getColumnText() {
				return "grid";
			}
			@Override
			public String getColumnText(Object rowObject) {
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.getRowText(provider.element, provider.grid, rowObject);
			}
			@Override
			public Color getColumnForeground(Object rowObject) {
				return null;
			}
			@Override
			public Color getColumnBackground(Object rowObject) {
				return null;
			}
		};
		private class TableColumnData extends TableColumnProvider {
			public TableColumnData(Object gridColummn) {
				super();
				this.gridColummn = gridColummn;
			}
			private Object gridColummn;
			@Override
			public String getColumnText() {
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.getColumnText(provider.element, provider.grid, this.gridColummn);
			}
			@Override
			public String getColumnText(Object rowObject) {
				TableProvider provider = TableProvider.this; 
				return provider.gridsProvider.getCellText(provider.element, provider.grid, rowObject, this.gridColummn);
			}
			@Override
			public Color getColumnForeground(Object rowObject) {
				TableProvider provider = TableProvider.this; 
				Object color = provider.gridsProvider.getCellForeground(provider.element, provider.grid, rowObject, this.gridColummn);
				return AdapterFactoryGridProvider.this.getColorFromObject(color);
			}
			@Override
			public Color getColumnBackground(Object rowObject) {
				TableProvider provider = TableProvider.this; 
				Object color = provider.gridsProvider.getCellBackground(provider.element, provider.grid, rowObject, this.gridColummn);
				return AdapterFactoryGridProvider.this.getColorFromObject(color);
			}
		};
		protected IItemGridsProvider gridsProvider;
		protected Object element;
		protected Object grid;
		// maps the table column index to the grid column object (if any, or grid column index otherwise) 
		protected TableColumnProvider[] indexToColumn = null;
		
		/**
		 * 
		 * @param nativeObject
		 * @param timePlotKey
		 * @param timePlotsProvider
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
			return this.gridsProvider.getText(this.element, this.grid);
		}

		public TableColumnProvider[] getTableColumns() {
			return this.indexToColumn;
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

		@Override
		public String getColumnText(Object element, int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getColumnText(element);
		}

		public String getColumnText(int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getColumnText();
		}

		private AdapterFactoryGridProvider getOuterType() {
			return AdapterFactoryGridProvider.this;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return this.gridsProvider.getRows(this.element,  this.grid).toArray();
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			IStructuredContentProvider.super.dispose();
		}

		@Override
		public Color getForeground(Object element, int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getColumnForeground(element);
		}

		@Override
		public Color getBackground(Object element, int columnIndex) {
			TableColumnProvider column = this.indexToColumn[columnIndex];
			return column.getColumnBackground(element);
		}
	};
	
}
