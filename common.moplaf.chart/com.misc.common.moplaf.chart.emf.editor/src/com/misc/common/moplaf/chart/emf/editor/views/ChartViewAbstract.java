package com.misc.common.moplaf.chart.emf.editor.views;

import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.chart.emf.editor.provider.AdapterFactorySeriesProvider;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;

public abstract class ChartViewAbstract extends ViewAbstract {
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
        //GridData gd = new GridData(GridData.FILL_BOTH);
		AdapterFactorySeriesProvider contentProvider = new AdapterFactorySeriesProvider(this.adapterFactory, null, null);
		//this.intervalEventProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
		ChartViewerAbstract viewer = (ChartViewerAbstract)this.createViewer(parent);
		viewer.setSeriesProvider(contentProvider);
        viewer.setContentProvider      (contentProvider);
		viewer.setLabelProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		viewer.setColorProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		this.setViewer(viewer);

		this.setSelectionListener();
		this.contributeToActionBars();
	} // createControl method
	
}
