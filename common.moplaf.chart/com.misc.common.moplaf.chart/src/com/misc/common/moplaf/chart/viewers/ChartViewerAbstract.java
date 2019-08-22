package com.misc.common.moplaf.chart.viewers;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import com.misc.common.moplaf.chart.ISeriesProvider;
import com.misc.common.moplaf.chart.Wrapper;
import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;

public abstract class ChartViewerAbstract extends ViewerAbstract {
	private ISeriesProvider seriesProvider = null;
	private Object          selectedElement = null;

	public void setSeriesProvider(ISeriesProvider provider){
		this.seriesProvider = provider;
	}

	protected ISeriesProvider getISeriesProvider(){
		return this.seriesProvider;
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
}
