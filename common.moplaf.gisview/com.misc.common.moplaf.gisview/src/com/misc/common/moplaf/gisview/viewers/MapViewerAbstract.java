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
package com.misc.common.moplaf.gisview.viewers;

import java.util.ArrayList;

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

import com.misc.common.moplaf.gisview.ILocationProvider;
import com.misc.common.moplaf.gisview.IPathProvider;
import com.misc.common.moplaf.gisview.Plugin;

public abstract class MapViewerAbstract extends ContentViewer {

	private Object selectedElement = null;
	private ISelection currentSelection = null;
	private IColorProvider colorProvider = null;
	private ILocationProvider locationProvider = null;
	private IPathProvider pathProvider = null;

	// providers management
	@Override
	public void setContentProvider(IContentProvider provider) {
		assertContentProviderType(provider);
		super.setContentProvider(provider);
	}
	
	public void setColorProvider(IColorProvider provider) {
		this.colorProvider = provider;
	}
	
	@Override
	public void setLabelProvider(IBaseLabelProvider provider) {
		assertLabelProviderType(provider);
		super.setLabelProvider(provider);
	}
	
	public void setLocationProvider(ILocationProvider locationProvider){
		this.locationProvider = locationProvider;
	}
	
	public void setPathProvider(IPathProvider pathProvider){
		this.pathProvider = pathProvider;
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
	
	protected ILocationProvider getILocationProvider(){
		return this.locationProvider;
	}
	
	protected IPathProvider getIPathProvider(){
		return this.pathProvider;
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
	
	protected void collectLocationProviders(ArrayList<Object> locations, Object element, int depth) {
		
		if ( this.locationProvider==null ) {
			return;
		}
		// the element
		if ( this.locationProvider.isLocation(element)) {
			locations.add(element);
		}
		// the children
		int max_depth = Plugin.getDefault().getMapMaxDepth();
		if ( depth<max_depth) {
			Object[] children_element= this.getTreeContentProvider().getChildren(element);
			for (Object child_element : children_element) {
				// the parent of child is modelElement, this is an actual child
				// this restriction avoids recursion
				if ( element.getClass().isArray() || this.getTreeContentProvider().getParent(child_element)==element){
					this.collectLocationProviders(locations,  child_element, depth+1);
				}
			}
		}
	}
	protected void collectPathProviders(ArrayList<Object> paths, Object element, int depth) {
		
		if ( this.pathProvider==null ) {
			return;
		}
		// the element
		if ( this.pathProvider.isPath(element)) {
			paths.add(element);
		}
		// the children
		int max_depth = Plugin.getDefault().getMapMaxDepth();
		if ( depth<max_depth ) {
			Object[] children_element= this.getTreeContentProvider().getChildren(element);
			for (Object child_element : children_element) {
				// the parent of child is modelElement, this is an actual child
				// this restriction avoids recursion
				if ( element.getClass().isArray() || this.getTreeContentProvider().getParent(child_element)==element){
					this.collectPathProviders(paths,  child_element, depth+1);
				}
			}
		}
	}


}
