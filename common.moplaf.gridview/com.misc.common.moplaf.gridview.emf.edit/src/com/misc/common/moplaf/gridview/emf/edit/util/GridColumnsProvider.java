package com.misc.common.moplaf.gridview.emf.edit.util;

import java.util.LinkedList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class GridColumnsProvider extends LinkedList<com.misc.common.moplaf.gridview.emf.edit.util.GridColumnsProvider.ColumnDelegate> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public interface ColumnDelegate {
		Object getCellValue(Object element, Object grid, Object row);
		String getColumnText(Object element, Object grid);
	}
	
	private class ColumnFeature implements ColumnDelegate{
		
		private EAttribute attribute;
		
		public ColumnFeature(EAttribute attribute) {
			this.attribute = attribute;
		}

		@Override
		public Object getCellValue(Object element, Object grid, Object row) {
			EObject object = (EObject)row;
			return object.eGet(this.attribute);
		}

		@Override
		public String getColumnText(Object element, Object grid) {
			return this.attribute.getName();
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
	public GridColumnsProvider addAttribute(EAttribute attribute) {
		this.add(new ColumnFeature(attribute));
		return this;
	}

}
