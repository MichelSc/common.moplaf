package com.misc.common.moplaf.timeview;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;


public abstract class TimePlotViewerAbstract extends ContentViewer {

	private Object selectedElement = null;
	private ISelection currentSelection = null;
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
	
	protected IAmountEventProvider getIAmountEventProvider(){
		return this.amountEventProvider;
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