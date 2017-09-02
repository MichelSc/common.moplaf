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

	public interface ColumnDelegate {
		Object getCellValue(Object row);
		String getColumnText();
	}
	
	private class ColumnFeature implements ColumnDelegate{
		
		private LinkedList<EReference> path;
		private EAttribute attribute;
		
		public ColumnFeature(LinkedList<EReference> path, EAttribute attribute) {
			this.path = (LinkedList<EReference>) path.clone();
			this.attribute = attribute;
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
	public GridColumnsProvider addColumn(EAttribute attribute) {
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path 
		this.add(new ColumnFeature(path, attribute));
		return this;
	}

	/*
	 * Convenience method for adding an path/attribute column
	 */
	public GridColumnsProvider addColumn(EReference reference, EAttribute attribute) {
		LinkedList<EReference> path = new LinkedList<EReference>(); // empty path
		path.add(reference);
		this.add(new ColumnFeature(path, attribute));
		return this;
	}

}
