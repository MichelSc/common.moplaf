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
		
		private EReference reference;
		private GridColumnsProvider columns;
		private int traits;
		
		public SheetFeature(EReference path, GridColumnsProvider columns) {
			this.reference = path;
			this.columns = columns;
			this.traits = IItemGridsProvider.SHEET_TRAITS_NONE;
		}
		public SheetFeature(EReference path, GridColumnsProvider columns, int traits) {
			this.reference = path;
			this.columns = columns;
			this.traits = traits;
		}

		@Override
		public Collection<?> getRows(Object element) {
			if ( this.reference==null || !this.reference.isMany()) {
				return null;
			}
			if ( !(element instanceof EObject) ) {
				return null;
			}
			EObject object = (EObject)element;
			return (Collection<?>) object.eGet(this.reference);
		}
		
		public GridColumnsProvider getColumns() {
			return this.columns;
		}
		
		@Override
		public String getSheetText() {
			if ( this.reference==null) {
				return "sheet";
			}
			return this.reference.getName();
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
	public GridSheetsProvider addSheet(EReference reference, GridColumnsProvider columns) {
		this.sheets.add(new SheetFeature(reference, columns));
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
