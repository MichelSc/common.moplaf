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
package com.misc.common.moplaf.timeview.viewers;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;
import com.misc.common.moplaf.timeview.IAmountEventProvider;


public abstract class TimePlotViewerAbstract extends ViewerAbstract {

	private Object               selectedElement = null;
	private IAmountEventProvider amountEventProvider = null;

	
	public void setAmountEventProvider(IAmountEventProvider eventProvider){
		this.amountEventProvider = eventProvider;
	}
		
	public IAmountEventProvider getIAmountEventProvider(){
		return this.amountEventProvider;
	}
	
	
	protected void setSelectedElement(Object selectedObject){
		if ( selectedObject!=this.selectedElement && selectedObject != null ){
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}

	
}
