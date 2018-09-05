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


import org.eclipse.swt.widgets.Composite;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;
import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider;
import com.misc.common.moplaf.gridview.emf.editor.viewers.GridViewer;


public class GridView extends ViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.gridview.views.GridView";


	/**
	 * The constructor.
	 */
	public GridView() {
	}
	
	/**
	 * Create the viewer, abstract
	 */
	@Override
	protected ViewerAbstract createViewer(Composite parent) {
		return new GridViewer(parent);
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		AdapterFactoryGridProvider contentProvider = new AdapterFactoryGridProvider(this.adapterFactory, parent.getForeground(), parent.getBackground());
		GridViewer viewer = (GridViewer)this.createViewer(parent);
        viewer.setContentProvider (contentProvider);
		viewer.setTablesProvider  (contentProvider);
		viewer.setLabelProvider   (new AdapterFactoryLabelProvider   (this.adapterFactory));
//		this.viewer.setColorProvider   (new AdapterFactoryLabelProvider   (this.adapterFactory));
		this.setViewer(viewer);
		
		this.setSelectionListener();
		this.contributeToActionBars();
	} // createControl method

}
