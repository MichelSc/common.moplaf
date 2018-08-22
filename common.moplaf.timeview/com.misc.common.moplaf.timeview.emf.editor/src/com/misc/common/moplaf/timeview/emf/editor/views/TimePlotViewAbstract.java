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
import org.eclipse.jface.viewers.*;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;
import com.misc.common.moplaf.timeview.emf.editor.provider.AdapterFactoryAmountEventProvider;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;

public abstract class TimePlotViewAbstract extends ViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.views.GanttView";

	private TimePlotViewerAbstract viewer;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	
	@Override
	protected ContentViewer getViewer() {
		// TODO Auto-generated method stub
		return this.viewer;
	}
	
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
        this.viewer = this.createViewer(parent);
		this.viewer.setAmountEventProvider(amountEventProvider);
        this.viewer.setContentProvider    (amountEventProvider);
		this.viewer.setLabelProvider      (new AdapterFactoryArrayLabelProvider  (this.adapterFactory));
		this.viewer.setColorProvider      (new AdapterFactoryArrayLabelProvider  (this.adapterFactory));

		this.setSelectionListener();
		this.contributeToActionBars();
	} // createControl method

}