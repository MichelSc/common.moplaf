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
import org.eclipse.ui.part.*;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.*;

import com.misc.common.moplaf.emf.editor.Util;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.timeview.emf.editor.provider.AdapterFactoryAmountEventProvider;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;

public abstract class TimePlotViewAbstract extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.views.GanttView";

	private TimePlotViewerAbstract viewer;
	private ISelectionListener selectionListener;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

//	private AdapterFactoryAmountEventProvider amountEventProvider;

	/**
	 * Implement the interface ISelectionListener
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	class SiteSelectionListener implements ISelectionListener {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			TimePlotViewerAbstract viewer = TimePlotViewAbstract.this.viewer;
			
			if (  viewer != null && part!= TimePlotViewAbstract.this) {
				if (  !selection.isEmpty() 
				  && selection instanceof IStructuredSelection) {
					TimePlotViewAbstract.this.viewer.setInput(Util.getSelectedObjects(selection));
				} // there is a selection
				else {
					TimePlotViewAbstract.this.viewer.setInput(null);
				}
			} // there is a viewer
		}
	}

	/**
	 * The constructor.
	 */
	public TimePlotViewAbstract() {
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

		// register the selection listener
		this.selectionListener = new SiteSelectionListener();
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		
		window.getSelectionService().addSelectionListener(selectionListener);
		site.setSelectionProvider(this.viewer);
		
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


	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void dispose(){
		// unregister the selection listener
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		window.getSelectionService().removeSelectionListener(this.selectionListener);
		this.selectionListener = null;
		
		// done, dispose other things
		super.dispose();
	}

}