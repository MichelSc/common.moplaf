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

import com.misc.common.moplaf.timeview.IIntervalEventProvider;
import com.misc.common.moplaf.timeview.Wrapper;


/**
 * A GanttViewer displays a collection of time related object into a Gantt chart.
 * <p>
 * The viewer is instantiated in the createViewer(Composite parent) method of the GanttView object, 
 * called from the void createPartControl(Composite parent) method. It will then take care of 
 * the display in the parent Composite.
 * <p>
 * The viewer receives its content from an input Object and from a ITreeContentProvider, 
 * providing methods getChildren, getParent, getElements.
 * <p>
 * The viewer get text and color associated to object via a IColorProvider and an ILabelProvider.
 * <p>
 * Finally, the viewer receives time related informations from a IIntervalEventProvider. This latter recognizes
 * object providing Interval events and makes the start and end time of Interval events available.  
 * <p>
 * @author MiSc
 *
 */
public abstract class GanttViewerAbstract extends ContentViewer {

	private Object                 selectedElement = null;
	private ISelection             currentSelection = null;
	private IColorProvider         colorProvider = null;
	private IIntervalEventProvider intervalEventProvider = null;

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
	
	public void setIntervalEventProvider(IIntervalEventProvider eventProvider){
		this.intervalEventProvider = eventProvider;
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
	
	protected IIntervalEventProvider getIIntervalEventProvider(){
		return this.intervalEventProvider;
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

	@Override
	/**
	 * Specified by ISelectionProvider.
	 * Get the selection for this provider
	 */
	public void setSelection(ISelection selection, boolean reveal) {
		this.currentSelection = selection;
	}
	
	/**
	 * Set the selection in the environment.
	 * Called by the concrete implementation when the selection must change
	 * @param selectedObject
	 */
	protected void setSelectedElement(Object selectedObject){
		if ( selectedObject instanceof Wrapper ){
			selectedObject = ((Wrapper)selectedObject).unwrap();
		}
		if ( selectedObject!=this.selectedElement && selectedObject != null ){
			this.selectedElement = selectedObject;
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}
	
	@Override
	public void refresh(){
	}

}
