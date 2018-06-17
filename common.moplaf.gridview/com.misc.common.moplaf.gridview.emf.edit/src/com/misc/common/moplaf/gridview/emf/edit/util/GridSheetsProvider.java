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
import java.util.Iterator;
import java.util.LinkedList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class GridSheetsProvider extends LinkedList<com.misc.common.moplaf.gridview.emf.edit.util.GridSheetsProvider.SheetDelegate> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public interface SheetDelegate {
		Collection<?> getRows(Object sheet);
		String getSheetText();
		GridColumnsProvider getColumns();
	}
	
	private class SheetFeature implements SheetDelegate{
		
		private EReference reference;
		private GridColumnsProvider columns;
		
		public SheetFeature(EReference path, GridColumnsProvider columns) {
			this.reference = path;
			this.columns = columns;
		}

		@Override
		public Collection<?> getRows(Object element) {
			if ( element instanceof EObject ) {
				EObject object = (EObject)element;
				if ( this.reference.isMany() ) {
					return (Collection<?>) object.eGet(this.reference);
				}
				return null;
			}
			return null;
		}
		
		public GridColumnsProvider getColumns() {
			return this.columns;
		}
		
		

		@Override
		public String getSheetText() {
			return this.reference.getName();
		}
		
	}
	
	private GridSheetsProvider() {
		super();
	}
	
	/*
	 * Convenience methods for constructing GridColumnProvider
	 */
	static public GridSheetsProvider constructGridSheetsProvider(){
		return new GridSheetsProvider();
	};

	/*
	 * Convenience method for adding a sheet in the grid
	 */
	public GridSheetsProvider addSheet(EReference reference, GridColumnsProvider columns) {
		this.add(new SheetFeature(reference, columns));
		return this;
	}
}
