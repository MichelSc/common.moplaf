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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;
import com.misc.common.moplaf.timeview.emf.editor.provider.AdapterFactoryAmountEventProvider;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;

public abstract class TimePlotViewAbstract extends ViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.views.GanttView";

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		
	/**
	 * Create the viewer, abstract
	 */
	protected abstract TimePlotViewerAbstract createViewer(Composite parent);
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		AdapterFactoryAmountEventProvider amountEventProvider = new AdapterFactoryAmountEventProvider (this.adapterFactory);
		TimePlotViewerAbstract viewer = (TimePlotViewerAbstract)this.createViewer(parent);
		viewer.setAmountEventProvider(amountEventProvider);
        viewer.setContentProvider    (amountEventProvider);
		viewer.setLabelProvider      (new AdapterFactoryArrayLabelProvider  (this.adapterFactory));
		viewer.setColorProvider      (new AdapterFactoryArrayLabelProvider  (this.adapterFactory));
		this.setViewer(viewer);

		this.setSelectionListener();
		this.contributeToActionBars();
	} // createControl method

	@Override
	protected void setViewer(ViewerAbstract viewer) {
		super.setViewer(viewer);
		this.getViewer().refresh();
	}

}