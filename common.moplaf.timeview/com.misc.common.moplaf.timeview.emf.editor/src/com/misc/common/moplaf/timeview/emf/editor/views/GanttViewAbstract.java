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
package com.misc.common.moplaf.timeview.emf.editor.views;


import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ContentViewer;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;
import com.misc.common.moplaf.timeview.emf.editor.provider.AdapterFactoryIntervalEventProvider;
import com.misc.common.moplaf.timeview.viewers.GanttViewerAbstract;


public abstract class GanttViewAbstract extends ViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.views.GanttView";

	private GanttViewerAbstract viewer;

	@Override
	protected ContentViewer getViewer() {
		return this.viewer;
	}

	/**
	 * The constructor.
	 */
	public GanttViewAbstract() {
	}
	
	/**
	 * Create the viewer, abstract
	 */
	protected abstract GanttViewerAbstract createViewer(Composite parent);
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
        //GridData gd = new GridData(GridData.FILL_BOTH);
		AdapterFactoryIntervalEventProvider contentProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
		//this.intervalEventProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
        this.viewer = this.createViewer(parent);
		this.viewer.setIntervalEventProvider(contentProvider);
        this.viewer.setContentProvider      (contentProvider);
		this.viewer.setLabelProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		this.viewer.setColorProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));

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

}
