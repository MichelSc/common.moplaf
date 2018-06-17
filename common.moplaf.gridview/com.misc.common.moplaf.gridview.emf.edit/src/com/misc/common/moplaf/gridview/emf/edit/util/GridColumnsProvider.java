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

import java.util.Iterator;
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
		
		private LinkedList<EReference> path;
		private EAttribute attribute;
		private int width;
		
		public ColumnFeature(LinkedList<EReference> path, EAttribute attribute, int width) {
			this.path = (LinkedList<EReference>) path.clone();
			this.attribute = attribute;
			this.width = width;
		}

		@Override
		public Object getCellValue(Object row) {
			EObject object = (EObject)row;
			Iterator<EReference> iterator = this.path.iterator();
			while ( iterator.hasNext() && object!=null) {
				object  = (EObject) object.eGet(iterator.next());
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
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path 
		this.add(new ColumnFeature(path, attribute, width));
		return this;
	}

	public GridColumnsProvider addColumn(EAttribute attribute) {
		return this.addColumn(attribute, DEFAULT_WIDTH);
	}


	/*
	 * Convenience method for adding an path/attribute column
	 */
	public GridColumnsProvider addColumn(EReference ref1, EAttribute attribute, int width) {
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path
		path.add(ref1);
		this.add(new ColumnFeature(path, attribute, width));
		return this;
	}
	public GridColumnsProvider addColumn(EReference ref1, EAttribute attribute) {
		return this.addColumn(ref1, attribute, DEFAULT_WIDTH);
	}
	
	public GridColumnsProvider addColumn(EReference ref1, EReference ref2, EAttribute attribute, int width) {
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path
		path.add(ref1);
		path.add(ref2);
		this.add(new ColumnFeature(path, attribute, width));
		return this;
	}
	
	public GridColumnsProvider addColumn(EReference ref1, EReference ref2, EAttribute attribute) {
		return this.addColumn(ref1, ref2, attribute);
	}
	
	public GridColumnsProvider addColumn(EReference ref1, EReference ref2, EReference ref3, EAttribute attribute, int width) {
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path
		path.add(ref1);
		path.add(ref2);
		path.add(ref3);
		this.add(new ColumnFeature(path, attribute, width));
		return this;
	}

	public GridColumnsProvider addColumn(EReference ref1, EReference ref2, EReference ref3, EAttribute attribute) {
		return this.addColumn(ref1, ref2, ref3, attribute, DEFAULT_WIDTH);
	}
	
	public GridColumnsProvider addColumn(EReference ref1, EReference ref2, EReference ref3, EReference ref4, EAttribute attribute, int width) {
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path
		path.add(ref1);
		path.add(ref2);
		path.add(ref3);
		path.add(ref4);
		this.add(new ColumnFeature(path, attribute, width));
		return this;
	}

	public GridColumnsProvider addColumn(EReference ref1, EReference ref2, EReference ref3, EReference ref4, EAttribute attribute) {
		return this.addColumn(ref1, ref2, ref3, ref4, attribute, DEFAULT_WIDTH);
	}

}
