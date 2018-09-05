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
package com.misc.common.moplaf.kpiview.viewers;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;
import com.misc.common.moplaf.kpiview.IKPIProvider;



public abstract class KPIViewerAbstract extends ViewerAbstract {
	
	private Object          selectedElement = null;
	private IKPIProvider    KPIProvider = null;

	
	public void setKPIProvider(IKPIProvider KPIProvider){
		this.KPIProvider = KPIProvider;
	}
	
	
	public IKPIProvider getIKPIProvider(){
		return this.KPIProvider;
	}
	
	
	/**
	 * Set the selection in the environment.
	 * Called by the concrete implementation when the selection must change
	 * @param selectedObject
	 */
	protected void setSelectedElement(Object selectedObject){
		if ( selectedObject!=this.selectedElement && selectedObject != null ){
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}
	
	@Override
	public void refresh(){
		System.out.format("KPIViewerAbstract refresh (%s)", "blabla");
	}

}
