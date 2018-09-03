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
//import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ContentViewer;

//import com.misc.common.moplaf.emf.editor.action.TestAction;
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
		this.hookContextMenu();
	} // createControl method

	/*
	@Override	
	protected void fillContextMenu(IMenuManager manager) {
		super.fillContextMenu(manager);
		manager.add(new TestAction( this.getSite().getPart(), this.viewer.getSelection()));
	}	
	*/
}
