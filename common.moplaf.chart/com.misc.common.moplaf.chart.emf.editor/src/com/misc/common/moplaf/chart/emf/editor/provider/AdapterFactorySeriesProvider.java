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
package com.misc.common.moplaf.chart.emf.editor.provider;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.provider.ExtendedColorRegistry;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import com.misc.common.moplaf.chart.ISeriesProvider;
import com.misc.common.moplaf.chart.Wrapper;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.Util;


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
public class AdapterFactorySeriesProvider extends AdapterFactoryArrayContentProvider implements ISeriesProvider {
	private Color foregroundColor = null;
	private Color backgroundColor = null;

	// constructor
	public AdapterFactorySeriesProvider(AdapterFactory adapterFactory, Color foregroundColor, Color backgroundColor){
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
	


	private SeriesProvider createSeriesProvider(Object element, Object grid, IItemGridsProvider provider){
			return new SeriesProvider(element, grid, provider);
	}


	
	/**
	 * Helper class for the conversion of an IItemGridsProvider (abstract) to ISeriesProvider providers 
	 * @author michel
	 *
	 */
	private class SeriesProvider implements IItemLabelProvider {
		protected class Series implements IItemLabelProvider, IItemColorProvider, Wrapper {
			private Object series;
			
			public Series(Object series) {
				super();
				this.series = series;
			}
			
			public Object unwrap(){
				return series;
			}
			
			private SeriesProvider getOuterType() {
				return SeriesProvider.this;
			}

			@Override
			public Object getForeground(Object element) {
				SeriesProvider seriesprovider = this.getOuterType();
				IItemGridsProvider gridsprovider = seriesprovider.gridsProvider;
				return gridsprovider.getCellForeground(seriesprovider.element, seriesprovider.grid, null, this.series);
			}
			
			@Override
			public Object getBackground(Object element) {
				SeriesProvider seriesprovider = this.getOuterType();
				IItemGridsProvider gridsprovider = seriesprovider.gridsProvider;
				return gridsprovider.getCellBackground(seriesprovider.element, seriesprovider.grid, null, this.series);
			}
			
			@Override
			public Image getImage(Object element) {
				return null;
			}
			
			@Override
			public String getText(Object element) {
				SeriesProvider seriesprovider = this.getOuterType();
				IItemGridsProvider gridsprovider = seriesprovider.gridsProvider;
				return gridsprovider.getColumnText(seriesprovider.element, seriesprovider.grid, this.series);
			}
		};
		
		protected class Category implements IItemLabelProvider, Wrapper {
			private Object category;
			
			public Category(Object series) {
				super();
				this.category = series;
			}
			
			public Object unwrap(){
				return category;
			}
			
			private SeriesProvider getOuterType() {
				return SeriesProvider.this;
			}

			@Override
			public Image getImage(Object element) {
				return null;
			}
			
			@Override
			public String getText(Object element) {
				SeriesProvider seriesprovider = this.getOuterType();
				IItemGridsProvider gridsprovider = seriesprovider.gridsProvider;
				return gridsprovider.getRowText(seriesprovider.element, seriesprovider.grid, this.category);
			}
		};
		
		protected IItemGridsProvider gridsProvider;
		protected Object element;
		protected Object grid;
		
		/**********************************************************************
		 * Constructor
		 **********************************************************************/
		public SeriesProvider(Object element, Object grid, IItemGridsProvider gridsProvider) {
			super();
			this.gridsProvider = gridsProvider;
			this.element = element;
			this.grid = grid;
		}
		
		
		private AdapterFactorySeriesProvider getOuterType() {
			return AdapterFactorySeriesProvider.this;
		}

		public String getSeriesText() {
			String text = this.gridsProvider.getGridText(this.element, this.grid);
			return text == null ? "" : text;
		}
		
		public Series[] getSeries() {
			Collection<?> columns = this.gridsProvider.getColumns(this.element, this.grid);
			ArrayList<Series> series = new ArrayList<Series>();
			for ( Object column: columns) {
				if ( (this.gridsProvider.getColumnTraits(element, grid, column) & IItemGridsProvider.COLUMN_TRAITS_BARCHART) != 0){
					series.add(new Series(column));
				}
			}
			return series.toArray(new Series[series.size()]);
		}

		public Category[] getCategories() {
			Collection<?> rows = this.gridsProvider.getRows(this.element, this.grid);
			Category[] categories = new Category[rows.size()];
			int i = 0;
			for ( Object row: rows) {
				categories[i++] = new Category(row);
			}
			return categories;
		}
		
		public float getCategoryAmount(Series series, Category category) {
			Object value_as_object = this.gridsProvider.getCellValue(this.element, this.grid, category.category, series.series);
			int value_type         = this.gridsProvider.getCellType (this.element, this.grid, category.category, series.series);
			return Util.getFloatValue(value_as_object, value_type);
		}


		@Override
		public String getText(Object object) {
			return this.getSeriesText();
		}


		@Override
		public Object getImage(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

	}

	/**
	 * Return a collection of object extending the private class  {@link SeriesProvider} 
	 * <p>
	 * Specified by com.misc.common.moplaf.chart.ISeriesProvider
	 */
	@Override
	public Object[] getSeriesProviders(Object element){
		ArrayList<SeriesProvider> charts = new ArrayList<SeriesProvider>();
		
		AdapterFactory adapterFactory = this.getAdapterFactory();
		IItemGridsProvider gridsProvider = (IItemGridsProvider) adapterFactory.adapt(element, IItemGridsProvider.class);
		
		if ( gridsProvider != null ){ 
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
					if ( (gridsProvider.getGridTraits(element, grid) & IItemGridsProvider.SHEET_TRAITS_BARCHART) != 0) {
						SeriesProvider provider = this.createSeriesProvider(element, grid, gridsProvider);
						charts.add(provider);
					}
				}
			} else if ( grids_asobject!=null ){
				// a single grid for the element
				if ( (gridsProvider.getGridTraits(element, grids_asobject) & IItemGridsProvider.SHEET_TRAITS_BARCHART) != 0) {
					SeriesProvider provider = this.createSeriesProvider(element, grids_asobject, gridsProvider);
					charts.add(provider);
				}
			} 
		}
		
		Object[] array = charts.toArray();
		return array;
	}
	

	/**
	 * Specified by com.misc.common.moplaf.chart.ISeriesProvider
	 */
	@Override
	public Object[] getSeries(Object element, Object provider) {
		SeriesProvider series_provider = (SeriesProvider) provider;
		return series_provider.getSeries();
	}

	/**
	 * Specified by com.misc.common.moplaf.chart.ISeriesProvider
	 */
	@Override
	public Object[] getCategories(Object element, Object provider) {
		SeriesProvider series_provider = (SeriesProvider) provider;
		return series_provider.getCategories();
	}

	/**
	 * Specified by com.misc.common.moplaf.chart.ISeriesProvider
	 */
	@Override
	public float getCategoryAmount(Object element, Object provider, Object series, Object category) {
		SeriesProvider series_provider = (SeriesProvider) provider;
		return series_provider.getCategoryAmount((SeriesProvider.Series) series, (SeriesProvider.Category) category);
	}
	
}
