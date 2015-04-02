package com.misc.common.moplaf.gisview.nebula.views;



import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.gisview.MapViewerAbstract;
import com.misc.common.moplaf.gisview.impl.MapViewAbstract;





public class MapView extends MapViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.jaret.views.GanttView";

	/**
	 * The constructor.
	 */
	public MapView() {
	}

	@Override
	protected MapViewerAbstract createViewer(Composite parent) {
		return new MapViewer(parent); 
	}

	
}