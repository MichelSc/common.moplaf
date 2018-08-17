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
package com.misc.common.moplaf.gridview.emf.editor.views;


import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.*;

import com.misc.common.moplaf.emf.editor.views.ViewAbstract;
import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider;
//import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider;
import com.misc.common.moplaf.gridview.emf.editor.viewers.GridViewer;


public class GridView extends ViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.gridview.views.GridView";

	private GridViewer viewer;


	/**
	 * The constructor.
	 */
	public GridView() {
	}
	
	/**
	 * Create the viewer, abstract
	 */
	protected  GridViewer createViewer(Composite parent) {
		return new GridViewer(parent);
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		AdapterFactoryGridProvider contentProvider = new AdapterFactoryGridProvider(this.adapterFactory, parent.getForeground(), parent.getBackground());
        this.viewer = this.createViewer(parent);
        this.viewer.setContentProvider (contentProvider);
		this.viewer.setTablesProvider  (contentProvider);
		this.viewer.setLabelProvider   (new AdapterFactoryLabelProvider   (this.adapterFactory));
//		this.viewer.setColorProvider   (new AdapterFactoryLabelProvider   (this.adapterFactory));

		this.setSelectionListener();
		this.contributeToActionBars();
	} // createControl method

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This creates a property sheet. Question: should we cache it?
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new PropertySheetPage();
		AdapterFactoryContentProvider sourcePropertyProvider = new AdapterFactoryContentProvider(this.adapterFactory);
		propertySheetPage.setPropertySourceProvider(sourcePropertyProvider);
		return propertySheetPage;
	}


	@Override
	protected ContentViewer getViewer() {
		return viewer;
	}

}
