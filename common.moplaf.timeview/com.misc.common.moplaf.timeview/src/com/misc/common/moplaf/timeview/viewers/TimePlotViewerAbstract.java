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

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import com.misc.common.moplaf.timeview.IAmountEventProvider;


public abstract class TimePlotViewerAbstract extends ContentViewer {

	private Object               selectedElement = null;
	private ISelection           currentSelection = null;
	private IColorProvider       colorProvider = null;
	private IAmountEventProvider amountEventProvider = null;

	// providers management
	@Override
	public void setContentProvider(IContentProvider provider) {
		assertContentProviderType(provider);
		super.setContentProvider(provider);
	}
	
	@Override
	public void setLabelProvider(IBaseLabelProvider provider) {
		assertLabelProviderType(provider);
		super.setLabelProvider(provider);
	}
	
	public void setColorProvider(IColorProvider provider) {
		this.colorProvider = provider;
	}
	
	public void setAmountEventProvider(IAmountEventProvider eventProvider){
		this.amountEventProvider = eventProvider;
	}
	
	/**
	 * Assert that the content provider is of one of the
	 * supported types.
	 * @param provider
	 */
	protected void assertContentProviderType(IContentProvider provider) {
		Assert.isTrue(provider instanceof ITreeContentProvider);
	}
	
	/**
	 * Assert that the label provider is of one of the
	 * supported types.
	 * @param provider
	 */
	protected void assertLabelProviderType(IBaseLabelProvider provider) {
		Assert.isTrue(provider instanceof ILabelProvider);
	}
	
	protected ITreeContentProvider getTreeContentProvider(){
		return (ITreeContentProvider)this.getContentProvider();
	}
	
	protected ILabelProvider getILabelProvider(){
		return (ILabelProvider)this.getLabelProvider();
	}
	
	public IAmountEventProvider getIAmountEventProvider(){
		return this.amountEventProvider;
	}
	
	protected IColorProvider getIColorProvider(){
		return this.colorProvider;
	}
	
	// selection management
	@Override
	public ISelection getSelection() {
		return this.currentSelection;
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		this.currentSelection = selection;
	}
	
	protected void setSelectedElement(Object selectedObject){
		if ( selectedObject!=this.selectedElement ){
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}

	
}
