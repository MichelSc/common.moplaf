package com.misc.common.moplaf.timeview.nebula.views;

import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.timeview.emf.editor.views.TimePlotViewAbstract;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;


public class TimePlotView extends TimePlotViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.nebule.views.TimePlotView";

	/**
	 * The constructor.
	 */
	public TimePlotView() {
	}

	@Override
	protected TimePlotViewerAbstract createViewer(Composite parent) {
		return new TimePlotViewer(parent); 
	}

	
}