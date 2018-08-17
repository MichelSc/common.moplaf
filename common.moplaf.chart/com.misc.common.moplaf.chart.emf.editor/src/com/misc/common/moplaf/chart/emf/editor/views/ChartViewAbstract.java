package com.misc.common.moplaf.chart.emf.editor.views;

import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.chart.emf.editor.provider.AdapterFactorySeriesProvider;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;

public abstract class ChartViewAbstract extends ViewAbstract {
	
	private ChartViewerAbstract viewer;
	

	@Override
	protected ContentViewer getViewer() {
		// TODO Auto-generated method stub
		return this.viewer;
	}

	/**
	 * Create the viewer, abstract
	 */
	protected abstract ChartViewerAbstract createViewer(Composite parent);

	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
        //GridData gd = new GridData(GridData.FILL_BOTH);
		AdapterFactorySeriesProvider contentProvider = new AdapterFactorySeriesProvider(this.adapterFactory, null, null);
		//this.intervalEventProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
        this.viewer = this.createViewer(parent);
		this.viewer.setSeriesProvider(contentProvider);
        this.viewer.setContentProvider      (contentProvider);
		this.viewer.setLabelProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		this.viewer.setColorProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));

		this.setSelectionListener();
		this.contributeToActionBars();
	} // createControl method
	
}
