package com.misc.common.moplaf.kpiview.viewers;

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

import com.misc.common.moplaf.kpiview.IKPIProvider;



public abstract class KPIViewerAbstract extends ContentViewer {
	
	protected int BACKGROUND_COLOR_R = 130;
	protected int BACKGROUND_COLOR_G = 116;
	protected int BACKGROUND_COLOR_B = 133;

	protected int TEXT_COLOR_R = 150;
	protected int TEXT_COLOR_G = 150;
	protected int TEXT_COLOR_B = 150;

	private Object          selectedElement = null;
	private ISelection      currentSelection = null;
	private IColorProvider  colorProvider = null;
	private IKPIProvider    KPIProvider = null;

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
	
	public void setKPIProvider(IKPIProvider KPIProvider){
		this.KPIProvider = KPIProvider;
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
	
	public ITreeContentProvider getTreeContentProvider(){
		return (ITreeContentProvider)this.getContentProvider();
	}
	
	public ILabelProvider getILabelProvider(){
		return (ILabelProvider)this.getLabelProvider();
	}
	
	public IColorProvider getIColorProvider(){
		return this.colorProvider;
	}
	
	public IKPIProvider getIKPIProvider(){
		return this.KPIProvider;
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
		if ( selectedObject!=this.selectedElement ){
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}
	
	@Override
	public void refresh(){
		System.out.format("KPIViewerAbstract refresh (%s)", "blabla");
	}

}
