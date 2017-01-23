package com.misc.common.moplaf.kpiview.medusa.views;

import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.kpiview.emf.editor.views.KPIViewAbstract;
import com.misc.common.moplaf.kpiview.viewers.KPIViewerAbstract;

public class KPIView extends KPIViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.nebule.views.TimePlotView";

	/**
	 * The constructor.
	 */
	public KPIView() {
	}

	@Override
	protected KPIViewerAbstract createViewer(Composite parent) {
		return new KPIViewer(parent); 
	}

	
}