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

import java.util.LinkedList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class GridColumnsProvider extends LinkedList<com.misc.common.moplaf.gridview.emf.edit.util.GridColumnsProvider.ColumnDelegate> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int DEFAULT_WIDTH = 200;

	public interface ColumnDelegate {
		Object getCellValue(Object row);
		String getColumnText();
		int getColumnWidth();
	}
	
	private class ColumnFeature implements ColumnDelegate{
		
		private EReference[] path;
		private EAttribute attribute;
		private int width;
		
		public ColumnFeature(EReference[] path, EAttribute attribute, int width) {
			this.path = path;
			this.attribute = attribute;
			this.width = width;
		}

		@Override
		public Object getCellValue(Object row) {
			EObject object = (EObject)row;
			for ( int i=0; i<this.path.length && object!=null; i++) {
				EReference ref = this.path[i];
				object  = (EObject) object.eGet(ref);
			}
			if ( object == null ) { return null; }
			return object.eGet(this.attribute);
		}

		@Override
		public String getColumnText() {
			return attribute.getName();
		}

		@Override
		public int getColumnWidth() {
			return this.width;
		}
		
	}
	
	private GridColumnsProvider() {
		super();
	}
	
	/*
	 * Convenience methods for constructing GridColumnProvider
	 */
	static public GridColumnsProvider constructGridColumnsProvider(){
		return new GridColumnsProvider();
	};

	/*
	 * Convenience method for adding an attribute column
	 */
	public GridColumnsProvider addColumn(EAttribute attribute, int width) {
		EReference[] empty_path = {};
		this.addColumn(empty_path , attribute, width);
		return this;
	}

	public GridColumnsProvider addColumn(EAttribute attribute) {
		return this.addColumn(attribute, DEFAULT_WIDTH);
	}


	/*
	 * Convenience method for adding an path/attribute column
	 */
	public GridColumnsProvider addColumn(EReference[] refs, EAttribute attribute, int width) {
		ColumnFeature column_provider = new ColumnFeature(refs, attribute, width);
		this.add(column_provider);
		return this;
	}
	public GridColumnsProvider addColumn(EReference[] refs, EAttribute attribute) {
		return this.addColumn(refs, attribute, DEFAULT_WIDTH);
	}
	

}
