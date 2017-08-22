/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.gridview.editor.viewers;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IInputProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.gridview.editor.provider.AdapterFactoryGridProvider;



/**
 * A GridViewer displays a set of 2-dimensional data.
 * <p>
 * Implements the interfaces {@link IInputProvider} and {@link ISelectionProvider}
 * <p>
 * The viewer is instantiated in the createViewer(Composite parent) method of the GridView object, 
 * called from the void createPartControl(Composite parent) method. It will then take care of 
 * the display in the parent Composite.
 * <p>
 * The viewer receives its content from an input Object, as specified by the interface IContentProvider.
 * <p>
 * The viewer get text and color associated to object via a 
 * <p>
 * Finally, the viewer receives the data from a AdapterFactoryGridProvider. This latter recognizes
 * object providing 2-dimensional data and makes the data available to the viewer.  
 * <p>
 * @author MiSc
 *
 */
public class GridViewer extends ContentViewer {

	private Object                 selectedElement = null;
	private ISelection             currentSelection = null;
	private IColorProvider         colorProvider = null;
	private AdapterFactoryGridProvider gridProvider = null;
	
	public GridViewer(Composite parent) {
		// called in View.createViewer, himself called by View.createPartControl
		// create the control(s)
	}
	
	@Override
	public Control getControl() {
		return null;
	}
	


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
	
	public void setAdapterFactoryGridProvider(AdapterFactoryGridProvider eventProvider){
		this.gridProvider = eventProvider;
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
	
	protected IColorProvider getIColorProvider(){
		return this.colorProvider;
	}
	
	protected AdapterFactoryGridProvider getGridProvider(){
		return this.gridProvider;
	}
	
	// selection management
	/**
	 * Specified by ISelectionProvider.
	 * Get the selection for this provider
	 */
	@Override
	public ISelection getSelection() {
		return this.currentSelection;
	}

	/**
	 * Specified by ISelectionProvider.
	 * Get the selection for this provider
	 */
	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		this.currentSelection = selection;
	}
	
	/**
	 * Set the selection in the environment.
	 * Called by the concrete implementation when the selection must change
	 * @param selectedObject
	 */
	protected void setSelectedElement(Object selectedObject){
		if ( selectedObject!=this.selectedElement ){
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
		}
	}
	
	/**
	 * Methode declared in {@link Viewer}
	 */
	@Override
	public void refresh(){
	}
	

}
