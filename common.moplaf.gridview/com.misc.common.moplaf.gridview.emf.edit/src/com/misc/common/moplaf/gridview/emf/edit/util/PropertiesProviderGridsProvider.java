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
package com.misc.common.moplaf.gridview.emf.edit.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.common.util.PropertiesProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.PropertiesProviderGridsProvider.SheetDelegate;

public class PropertiesProviderGridsProvider implements IItemGridsProvider {
	
	/**
	 * 
	 */
	private LinkedList<SheetDelegate> sheets;
	private static final long serialVersionUID = 1L;

	public interface SheetDelegate {
		public String getSheetText();
		public Collection<?> getRows(Object sheet);
		public String getRowText(Object row);
		public Collection<?> getColumns();
		public int getTraits();
	}
	
	private class IPropertiesProviderProperty{
		private IPropertiesProvider provider;
		private Object property;
		public IPropertiesProviderProperty(IPropertiesProvider provider, Object property) {
			super();
			this.provider = provider;
			this.property = property;
		}
	}
	
	private class SheetFeature implements SheetDelegate{
		
		private EReference[] path;
		private EAttribute attribute;
		private IPropertiesProvider[] providers;
		private int traits;
		private String sheet_name;
		
		public SheetFeature(String sheet_name, EReference[] path, EAttribute attribute, IPropertiesProvider[] columns, int traits) {
			this.path = path;
			this.attribute = attribute;
			this.providers = columns;
			this.traits = traits;
			this.sheet_name = sheet_name;
		}
		@Override
		public Collection<?> getRows(Object element) {
			if ( this.path.length==0 ) {
				return null;
			}
			if ( !(element instanceof EObject) ) {
				return null;
			}
			
			EObject object = (EObject)element;
			HashSet<EObject> result = new HashSet<EObject>();
			this.collectRows(object, result, 0);
			
			return result;
		}
		
		private void collectRows(EObject from, HashSet<EObject> result, int level) {
			EReference reference = this.path[level];
			if ( reference.getEContainingClass().isSuperTypeOf(from.eClass())) {
				if ( reference.isMany() ) {
					Collection<EObject> tos = (Collection<EObject>)from.eGet(reference);
					if ( level<this.path.length-1) {
						for ( EObject to : tos) {
							collectRows(to, result, level+1);
						}
					} else {
						result.addAll(tos);
					}
				} else {
					EObject object = (EObject)from.eGet(reference);
					if ( object!=null ) {
						if ( level<this.path.length-1) {
							collectRows((EObject)object, result, level+1);
						} else {
							result.add(object);
						}
					}
				}
			}
		}
		
		@Override
		public String getRowText(Object row) {
			if ( this.attribute==null ) {
				return null;
			}
			if ( !(row instanceof EObject )) {
				return null;
			}
			EObject object = (EObject)row;
			return object.eGet(this.attribute).toString();
		}
	
		@Override
		public Collection<?> getColumns() {
			LinkedList<Object> columns = new LinkedList<>();
			for ( int i=0; i<this.providers.length; i++) {
				IPropertiesProvider provider = this.providers[i];
				Collection<?> properties = provider.getProperties();
				if ( properties!=null) {
					for ( Object property : properties) {
						columns.add(new IPropertiesProviderProperty(provider, property));
					}
				} else {
					int nr_properties = provider.getNrProperties();
					for (int property=0; property<nr_properties; property++) {
						columns.add(new IPropertiesProviderProperty(provider, property));
					}
				}
			}
			return columns;
		}
		
		@Override
		public String getSheetText() {
			if ( this.sheet_name!=null ) {
				return this.sheet_name;
			}
			
			// compose a name from the refs at hand
			String path_asstring = "";
			for ( int i=0; i<this.path.length; i++) {
				if ( path_asstring.length()>0 ) {
					path_asstring += "/";
				}
				path_asstring+= this.path[i].getName();  
			}
			return path_asstring;
		}
	
		@Override
		public int getTraits() {
			return this.traits;
		}
	}

	private PropertiesProviderGridsProvider() {
		super();
		this.sheets = new LinkedList<SheetDelegate>();
	}
	
	/*
	 * Convenience methods for constructing PropertiesProviderGridsProvider
	 */
	static public PropertiesProviderGridsProvider constructPropertiesProviderGridsProvider(){
		PropertiesProviderGridsProvider provider = new PropertiesProviderGridsProvider();
		return provider;
	};

	/*
	 * Convenience method for adding a sheet in the grid
	 */
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference[] references, EAttribute attribute, IPropertiesProvider[] providers, int traits) {
		this.sheets.add(new SheetFeature(sheet_name, references,  attribute, providers, traits));
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider[] providers, int traits) {
		this.sheets.add(new SheetFeature(sheet_name, new EReference[] {reference},  attribute, providers, traits));
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference[] references, EAttribute attribute, IPropertiesProvider provider, int traits) {
		this.sheets.add(new SheetFeature(sheet_name, references,  attribute, new IPropertiesProvider[] {provider}, traits));
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider provider, int traits) {
		this.sheets.add(new SheetFeature(sheet_name, new EReference[] {reference},  attribute, new IPropertiesProvider[] {provider}, traits));
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference[] references, EAttribute attribute, IPropertiesProvider[] providers) {
		this.addSheet(sheet_name, references,  attribute, providers, SHEET_TRAITS_NONE);
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider[] providers) {
		this.addSheet(sheet_name, reference,  attribute, providers, SHEET_TRAITS_NONE);
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference[] references, EAttribute attribute, IPropertiesProvider provider) {
		this.addSheet(sheet_name, references,  attribute, provider, SHEET_TRAITS_NONE);
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider provider) {
		this.addSheet(sheet_name, reference,  attribute, provider, SHEET_TRAITS_NONE);
		return this;
	}

	
	// delegated methods
	@Override 
	public Object getGrids(Object element) {
		return this.sheets;
	}
	@Override
	public String getGridText(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getSheetText();
	}
	@Override
	public int getGridTraits(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getTraits();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getRows(element);
	}

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getRowText(row);
	}

	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getColumns();
	}
	
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		IPropertiesProviderProperty property_column = (IPropertiesProviderProperty)column;
		IPropertiesProvider provider = property_column.provider;
		Object property = property_column.property;
		return provider.getPropertyText(property);
	}
	
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		IPropertiesProviderProperty property_column = (IPropertiesProviderProperty)column;
		IPropertiesProvider provider = property_column.provider;
		Object property = property_column.property;
		return provider.getPropertyDisplayWidth(property);
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		IPropertiesProviderProperty property_column = (IPropertiesProviderProperty)column;
		IPropertiesProvider provider = property_column.provider;
		Object property = property_column.property;
		return provider.getPropertyValue(row, property);
	}

}
