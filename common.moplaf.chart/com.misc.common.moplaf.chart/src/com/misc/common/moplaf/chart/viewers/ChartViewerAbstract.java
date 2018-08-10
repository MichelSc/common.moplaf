package com.misc.common.moplaf.chart.viewers;

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
import com.misc.common.moplaf.chart.ISeriesProvider;
import com.misc.common.moplaf.chart.Wrapper;
import com.misc.common.moplaf.timeview.IIntervalEventProvider;

public abstract class ChartViewerAbstract extends ContentViewer {

	private Object                 selectedElement = null;
	private ISelection             currentSelection = null;
	private IColorProvider colorProvider = null;
	private ISeriesProvider seriesProvider = null;
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
	
	public void setColorProvider(IColorProvider provider) {
		this.colorProvider = provider;
	}
	
	public void setSeriesProvider(ISeriesProvider provider){
		this.seriesProvider = provider;
	}

	protected ISeriesProvider getISeriesProvider(){
		return this.seriesProvider;
	}
	
	protected ILabelProvider getILabelProvider(){
		return (ILabelProvider)this.getLabelProvider();
	}
	
	protected IColorProvider getIColorProvider(){
		return this.colorProvider;
	}
	

	@Override
	public ISelection getSelection() {
		return currentSelection;
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		this.currentSelection = selection;
	}
	
	protected ITreeContentProvider getTreeContentProvider(){
		return (ITreeContentProvider)this.getContentProvider();
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
		if ( selectedObject!=this.selectedElement ){
			this.selectedElement = selectedObject;
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}

	public void setIntervalEventProvider(IIntervalEventProvider eventProvider){
		this.intervalEventProvider = eventProvider;
	}

	protected IIntervalEventProvider getIIntervalEventProvider(){
		return this.intervalEventProvider;
	}

}
