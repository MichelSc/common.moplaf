package com.misc.common.moplaf.chart.emf.editor.views;

import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.ui.part.ViewPart;

import com.misc.common.moplaf.chart.emf.editor.provider.AdapterFactorySeriesProvider;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;

public abstract class ChartViewAbstract extends ViewPart {
	
	private ChartViewerAbstract viewer;
	private IResourceChangeListener resourceListener;
	private AdapterFactorySeriesProvider adapterFactory;
	//= new AdapterFactorySeriesProvider(AdapterFactorySeriesProvider.Descriptor.Registry.INSTANCE);
	

}
