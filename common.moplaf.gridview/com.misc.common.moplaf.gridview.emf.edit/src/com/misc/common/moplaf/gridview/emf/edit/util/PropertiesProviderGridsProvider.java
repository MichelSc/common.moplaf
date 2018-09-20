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
import com.misc.common.moplaf.common.util.CompoundPropertiesProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

public class PropertiesProviderGridsProvider implements IItemGridsProvider {
	
	/**
	 * 
	 */
	private LinkedList<SheetDelegate> sheets;
	private static final long serialVersionUID = 1L;

	public interface SheetDelegate {
		public String getSheetText();
		public int getTraits();
		public Collection<?> getRows(Object sheet);
		public String getRowText(Object row);
		public Collection<?> getColumns();
		public int getNrColumns();
		public String getColumnText(Object column);
		public int getColumnType(Object column);
		public int getColumnWidth(Object column);
		public Object getCellValue(Object row, Object column);
	}
	
	private abstract class SheetPropertiesProvider implements SheetDelegate{
		
		private IPropertiesProvider provider;
		private int traits;
		private String sheet_name;
		
		public SheetPropertiesProvider(String sheet_name, IPropertiesProvider provider, int traits) {
			this.provider = provider;
			this.traits = traits;
			this.sheet_name = sheet_name;
		}
		public SheetPropertiesProvider(String sheet_name, IPropertiesProvider[] providers, int traits) {
			this.provider = new CompoundPropertiesProvider(providers);
			this.traits = traits;
			this.sheet_name = sheet_name;
		}
		@Override
		public String getSheetText() {
			if ( this.sheet_name!=null ) {
				return this.sheet_name;
			}
			return null;
		}
		@Override
		public int getTraits() {
			return this.traits;
		}
		@Override
		public Collection<?> getColumns() {
			return this.provider.getProperties();
		}
		@Override
		public int getNrColumns() {
			return this.provider.getNrProperties();
		}
		@Override
		public String getColumnText(Object column) {
			return this.provider.getPropertyText(column);
		}
		@Override
		public int getColumnType(Object column) {
			return this.provider.getPropertyType(column);
		}
		@Override
		public int getColumnWidth(Object column) {
			return this.provider.getPropertyDisplayWidth(column);
		}
		@Override
		public Object getCellValue(Object row, Object column) {
			return this.provider.getPropertyValue(row,  column);
		}
	}
	
	private class SheetFeature extends SheetPropertiesProvider{
		
		private EReference[] path;
		private EAttribute attribute;
		
		public SheetFeature(String sheet_name, EReference[] path, EAttribute attribute, IPropertiesProvider provider, int traits) {
			super(sheet_name, provider, traits);
			this.path = path;
			this.attribute = attribute;
		}
		public SheetFeature(String sheet_name, EReference[] path, EAttribute attribute, IPropertiesProvider[] providers, int traits) {
			super(sheet_name, providers, traits);
			this.path = path;
			this.attribute = attribute;
		}
		@Override
		public String getSheetText() {
			String text = super.getSheetText();
			if ( text!=null ) {
				return text;
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

	}

	private class SheetCollection extends SheetPropertiesProvider{
		
		private Collection<?> rowSet;
		
		public SheetCollection(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider, int traits) {
			super(sheet_name, provider, traits);
			this.rowSet = rowSet;
		}
		@Override
		public Collection<?> getRows(Object element) {
			return this.rowSet;
		}
		
		@Override
		public String getRowText(Object row) {
			return null;
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
		this.sheets.add(new SheetFeature(sheet_name, references,  attribute, provider, traits));
		return this;
	}
	public PropertiesProviderGridsProvider addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider provider, int traits) {
		this.sheets.add(new SheetFeature(sheet_name, new EReference[] {reference},  attribute, provider, traits));
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
	
	public PropertiesProviderGridsProvider addSheet(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider, int traits) {
	  	this.sheets.add(new SheetCollection(sheet_name, rowSet, provider, traits));
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
	public int getNrColumns(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getNrColumns();
	}
	
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getColumnText(column);
	}
	
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getColumnWidth(column);
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getCellValue(row, column);
	}
	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getColumnType(column);
	}

}
