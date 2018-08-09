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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.gridview.emf.edit.util.GridColumnsProvider.ColumnDelegate;

public class GridSheetsProvider implements IItemGridsProvider {
	
	/**
	 * 
	 */
	private LinkedList<SheetDelegate> sheets;
	private static final long serialVersionUID = 1L;

	public interface SheetDelegate {
		public Collection<?> getRows(Object sheet);
		public String getSheetText();
		public GridColumnsProvider getColumns();
		public int getTraits();
	}
	
	private class SheetFeature implements SheetDelegate{
		
		private EReference[] path;
		private GridColumnsProvider columns;
		private int traits;
		
		public SheetFeature(EReference[] path, GridColumnsProvider columns, int traits) {
			this.path = path;
			this.columns = columns;
			this.traits = traits;
		}
		public SheetFeature(EReference path, GridColumnsProvider columns, int traits) {
			this.path = new EReference[] { path };
			this.columns = columns;
			this.traits = traits;
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
		
		public GridColumnsProvider getColumns() {
			return this.columns;
		}
		
		@Override
		public String getSheetText() {
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
	
	private GridSheetsProvider() {
		super();
		this.sheets = new LinkedList<com.misc.common.moplaf.gridview.emf.edit.util.GridSheetsProvider.SheetDelegate>();
	}
	
	/*
	 * Convenience methods for constructing GridColumnProvider
	 */
	static public GridSheetsProvider constructGridSheetsProvider(){
		GridSheetsProvider provider = new GridSheetsProvider();
		return provider;
	};

	/*
	 * Convenience method for adding a sheet in the grid
	 */
	public GridSheetsProvider addSheet(GridColumnsProvider columns) {
		this.sheets.add(new SheetFeature(new EReference[] {}, columns, IItemGridsProvider.SHEET_TRAITS_NONE));
		return this;
	}
	public GridSheetsProvider addSheet(EReference[] path, GridColumnsProvider columns) {
		this.sheets.add(new SheetFeature(path, columns, IItemGridsProvider.SHEET_TRAITS_NONE));
		return this;
	}
	public GridSheetsProvider addSheet(EReference reference, GridColumnsProvider columns) {
		this.sheets.add(new SheetFeature(reference, columns, IItemGridsProvider.SHEET_TRAITS_NONE));
		return this;
	}
	public GridSheetsProvider addSheet(EReference[] path, GridColumnsProvider columns, int traits) {
		this.sheets.add(new SheetFeature(path, columns, traits));
		return this;
	}
	public GridSheetsProvider addSheet(GridColumnsProvider columns, int traits) {
		this.sheets.add(new SheetFeature(new EReference[] {}, columns, traits));
		return this;
	}
	public GridSheetsProvider addSheet(EReference reference, GridColumnsProvider columns, int traits) {
		this.sheets.add(new SheetFeature(reference, columns, traits));
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
	public Collection<?> getColumns(Object element, Object grid) {
		SheetDelegate delegate = (SheetDelegate)grid;
		return delegate.getColumns();
	}
	
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		ColumnDelegate delegate = (ColumnDelegate)column;
		return delegate.getColumnText();
	}
	
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		ColumnDelegate delegate = (ColumnDelegate)column;
		return delegate.getColumnWidth();
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		ColumnDelegate delegate = (ColumnDelegate)column;
		return delegate.getCellValue(row);
	}

}
