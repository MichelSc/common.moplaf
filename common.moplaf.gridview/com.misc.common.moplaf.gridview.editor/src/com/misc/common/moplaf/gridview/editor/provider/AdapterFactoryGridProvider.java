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
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
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
	public class TableProvider implements IContentProvider, ITableLabelProvider {
		protected IItemGridsProvider gridsProvider;
		protected Object element;
		protected Object grid;
		
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
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			IContentProvider.super.dispose();
		}
	};
	
}
