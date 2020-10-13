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

import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.common.util.CompoundPropertiesProvider;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
/**
 * An implementation of the interface {@link IItemGridsProvider}
 * <p>
 * The implemented sheets are specified by  
 * <ul>
 *   <li>attributes</li>
 *   <ul>
 *     <li>the text associated with the sheet</li>
 *     <li>whether to show the aggregation line</li>
 *     <li>traits (see {@link com.misc.common.moplaf.common.Constants})</li>
 *   </ul>
 *   <li>a set of rows</li>
 *   <ul>
 *     <li>either the set of EMF objects reached via a specified path, i.e. a possibly empty sequence of EReference and an EAttribute</li>
 *     <li>or a given collection of objects</li>
 *   </ul>
 *   <li>a set of columns</li>
 *   <ul>
 *     <li>a set of properties specified by a PropertiesProvider (see {@link IPropertiesProvider })</li>
 *   </ul>
 * </ul>
 * </p>
 * 
 */
public class PropertiesProviderGridsProvider implements IItemGridsProvider {
	
	/**
	 * 
	 */
	private LinkedList<SheetDelegate> sheets;
	private static final long serialVersionUID = 1L;
	
	private Color highlight_color = Color.COLOR_YELLOW;

	public interface SheetDelegate {
		public SheetDelegate setSheetText(String text);
		public SheetDelegate setSheetTraits(int traits);
		public SheetDelegate setAggregation(boolean enabled);
		public String getSheetText();
		public int    getSheetTraits();
		public Collection<?> getSheetRows(Object element);
		public String getRowText(Object row);
		public Collection<?> getColumns();
		public int getNrColumns();
		public String getColumnText(Object column);
		public int getColumnWidth(Object column);
		public int getColumnTraits(Object column);
		public Object getColumnForegroundColor(Object column);
		public Object getColumnBackgroundColor(Object column);
		public int getCellType(Object row, Object column);
		public Object getCellValue(Object row, Object column);
		public Object getCellBackgroundColor(Object row, Object column);
		public Object getCellForegroundColor(Object row, Object column);
		public int compareRows(Object row1, Object row2, Object column, boolean ascending);
	}
	
	class SheetPropertiesProvider implements SheetDelegate{	
		private IPropertiesProvider provider;
		private int traits;
		private String sheet_name;
		private boolean aggregation = false;
		private Collection<?> objects = null;
		private Object element = null;
		private EAttribute attribute;
		
		public SheetPropertiesProvider(String sheet_name, IPropertiesProvider provider, EAttribute attribute, int traits) {
			this.provider = provider;
			this.traits = traits;
			this.sheet_name = sheet_name;
			this.attribute = attribute;
		}
		public SheetPropertiesProvider(String sheet_name, IPropertiesProvider[] providers, EAttribute attribute, int traits) {
			this.provider = new CompoundPropertiesProvider(providers);
			this.traits = traits;
			this.sheet_name = sheet_name;
			this.attribute = attribute;
		}
		@Override
		public SheetDelegate setSheetText(String text) {
			this.sheet_name = text;
			return this;
		};
		@Override
		public SheetDelegate setSheetTraits(int traits) {
			this.traits = traits;
			return this;
		}
		@Override
		public SheetDelegate setAggregation(boolean enabled) {
			this.aggregation = enabled;
			return this;
		}
		@Override
		public String getSheetText() {
			if ( this.sheet_name!=null ) {
				return this.sheet_name;
			}
			return null;
		}
		@Override
		public int    getSheetTraits() {
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
		public int getColumnWidth(Object column) {
			return this.provider.getPropertyDisplayWidth(column);
		}
		@Override
		public Object getColumnForegroundColor(Object column) {
			Color color = this.provider.getPropertyForegroundColor(column);
			if ( color==null ) {
				return null;
			}
			return color.toURI();
		}
		@Override
		public Object getColumnBackgroundColor(Object column) {
			Color color = this.provider.getPropertyBackgroundColor(column);
			if ( color==null ) {
				return null;
			}
			return color.toURI();
		}
		
		@Override
		public int getColumnTraits(Object column) {
			return this.provider.getPropertyTraits(column);
		}

		protected Collection<?> getObjects(Object element) {
			if ( this.element!=element) {
				this.element = element;
				this.objects =  this.doGetObjects(element);
			}
			return this.objects;
		}
		
		protected Collection<?> doGetObjects(Object element) {
			return null;
		}

		@Override
		public Collection<?> getSheetRows(Object element) {
			Collection<?> objects = this.getObjects(element);
			if ( objects==null ) {
				return null;
			}

			if ( !this.aggregation) {
				return objects;
			}
			LinkedList<Object> rows = new LinkedList<Object>();
			rows.addAll(objects);
			rows.add(this);
			return rows;
		}

		@Override
		public String getRowText(Object row) {
			if ( row == this) {
				return "aggregation";
			}
			return this.getObjectText(row);
		}
		
		public String getObjectText(Object object) {
			if ( this.attribute==null ) {
				return null;
			}
			if ( !(object instanceof EObject )) {
				return null;
			}
			EObject e_object = (EObject)object;
			return e_object.eGet(this.attribute).toString();
		}	
		
		@Override
		public Object getCellValue(Object row, Object column) {
			if ( row == this ) {
				return this.provider.getAggregationValue(this.objects, column);
			} else {
				return this.provider.getPropertyValue(row, column);
			}
		}
		
		@Override
		public int getCellType(Object row, Object column) {
			if ( row==this ) {
				return this.provider.getAggregationType(column);
			}
			return this.provider.getPropertyType(column);
		}
		@Override
		public int compareRows(Object row1, Object row2, Object column, boolean ascending) {
			if ( row1==this) { return +1; }
			if ( row2==this) { return -1; }
			return this.provider.compare(column, row1, row2, ascending);
		}
		@Override
		public Object getCellBackgroundColor(Object row, Object column) {
			Color color = null;
			if ( row != this && this.provider.isPropertyValueHighlightKey(row, column) ) {
				color = PropertiesProviderGridsProvider.this.highlight_color;
			} else  {
				color = this.provider.getPropertyBackgroundColor(column);
			}
			return color==null ? null : color.toURI();
		}
		@Override
		public Object getCellForegroundColor(Object row, Object column) {
			Color color = null;
			if ( row != this && this.provider.isPropertyValueHighlightKey(row, column) ) {
				color = PropertiesProviderGridsProvider.this.highlight_color;
			} else  {
				color = this.provider.getPropertyForegroundColor(column);
			}
			return color==null ? null : color.toURI();
		}
	}
	
	private class SheetFeature extends SheetPropertiesProvider{
		
		private EReference[] path;
		
		public SheetFeature(String sheet_name, EReference[] path, EAttribute attribute, IPropertiesProvider provider, int traits) {
			super(sheet_name, provider, attribute, traits);
			this.path = path;
		}
		public SheetFeature(String sheet_name, EReference[] path, EAttribute attribute, IPropertiesProvider[] providers, int traits) {
			super(sheet_name, providers, attribute, traits);
			this.path = path;
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
		protected Collection<?> doGetObjects(Object element) {
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
		
		

	}

	private class SheetCollection extends SheetPropertiesProvider{
		
		private Collection<?> rowSet;
		
		public SheetCollection(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider, EAttribute attribute, int traits) {
			super(sheet_name, provider, attribute, traits);
			this.rowSet = rowSet;
		}
		
		@Override
		protected Collection<?> doGetObjects(Object element) {
			return this.rowSet;
		}
	}

	public PropertiesProviderGridsProvider() {
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
	 * Convenience method for adding a sheets in the grid
	 */
	public SheetDelegate addSheet(String sheet_name, EReference[] references, EAttribute attribute, IPropertiesProvider[] providers) {
		SheetDelegate new_sheet = new SheetFeature(sheet_name, references,  attribute, providers, TRAITS_NONE);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider[] providers) {
		SheetDelegate new_sheet = new SheetFeature(sheet_name, new EReference[] {reference},  attribute, providers, TRAITS_NONE);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, EReference[] references, EAttribute attribute, IPropertiesProvider provider) {
		SheetDelegate new_sheet = new SheetFeature(sheet_name, references,  attribute, provider, TRAITS_NONE);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, EReference reference, EAttribute attribute, IPropertiesProvider provider) {
		SheetDelegate new_sheet = new SheetFeature(sheet_name, new EReference[] {reference},  attribute, provider, TRAITS_NONE);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider, EAttribute attribute, int traits) {
		SheetDelegate new_sheet = new SheetCollection(sheet_name, rowSet, provider, attribute, traits);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider, int traits) {
		SheetDelegate new_sheet = new SheetCollection(sheet_name, rowSet, provider, null, traits);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider,EAttribute attribute) {
		SheetDelegate new_sheet = new SheetCollection(sheet_name, rowSet, provider, attribute, TRAITS_NONE);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	public SheetDelegate addSheet(String sheet_name, Collection<?> rowSet, IPropertiesProvider provider) {
		SheetDelegate new_sheet = new SheetCollection(sheet_name, rowSet, provider, null, TRAITS_NONE);
		this.sheets.add(new_sheet);
		return new_sheet;
	}
	
	/*
	 * Specified by IItemGridsProvider
	 * @see com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider#getGrids(java.lang.Object)
	 */
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
		return delegate.getSheetTraits();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getSheetRows(element);
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
	public int getColumnTraits(Object element, Object grid, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getColumnTraits(column);
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getCellValue(row, column);
	}
	
	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getCellType(row, column);
	}

	@Override
	public int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.compareRows(row1, row2, column, ascending);
	}

	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		Object cell_color = delegate.getCellForegroundColor(row, column);
		if ( cell_color==null ) {  
			cell_color = delegate.getColumnForegroundColor(column);
		}
		return cell_color;
	}

	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		SheetDelegate delegate = (SheetDelegate)grid;
		Object cell_color = delegate.getCellBackgroundColor(row, column);
		if ( cell_color==null ) {  
			cell_color = delegate.getColumnBackgroundColor(column);
		}
		return cell_color;
	}
	
	
}
