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
package com.misc.common.moplaf.kpiview.emf.editor.views;

import org.eclipse.swt.widgets.Composite;

import java.util.Iterator;

import org.eclipse.jface.viewers.*;
import org.eclipse.ui.*;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;
import com.misc.common.moplaf.kpiview.emf.editor.provider.AdapterFactoryKPIProvider;
import com.misc.common.moplaf.kpiview.viewers.KPIViewerAbstract;


public abstract class KPIViewAbstract extends ViewAbstract {
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.views.KPIView";


	/**
	 * Implement the interface ISelectionListener
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	class SiteSelectionListener implements ISelectionListener {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			
			if (  KPIViewAbstract.this.getViewer() != null && part!= KPIViewAbstract.this) {
				if (  !selection.isEmpty() 
				  && selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection)selection;
					boolean setInput = false;
					Iterator iterator = structuredSelection.iterator();
					while ( iterator.hasNext() && !setInput ){
						Object selectedObject = iterator.next();
						if ( ((KPIViewerAbstract)KPIViewAbstract.this.getViewer()).getIKPIProvider().hasKPIs(selectedObject)){
							setInput = true;
						}
					}
					if( setInput){
						KPIViewAbstract.this.getViewer().setInput(structuredSelection.toArray());
					}
				} // there is a selection
			} // there is a viewer
		}
	}

	
	/**
	 * Create the viewer, abstract
	 */
	protected abstract KPIViewerAbstract createViewer(Composite parent);
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		KPIViewerAbstract viewer = this.createViewer(parent);
        viewer.setContentProvider   (new AdapterFactoryArrayContentProvider (this.adapterFactory));
		viewer.setLabelProvider     (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		viewer.setColorProvider     (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		viewer.setKPIProvider       (new AdapterFactoryKPIProvider          (this.adapterFactory));
		this.setViewer(viewer);
		
		this.setSelectionListener();
		this.contributeToActionBars();
		
	} // createControl method

}
