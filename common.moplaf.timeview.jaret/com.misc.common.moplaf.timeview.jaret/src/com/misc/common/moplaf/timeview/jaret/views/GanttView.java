package com.misc.common.moplaf.timeview.jaret.views;



import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.timeview.GanttViewerAbstract;
import com.misc.common.moplaf.timeview.impl.GanttViewAbstract;




public class GanttView extends GanttViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.jaret.views.GanttView";

	/**
	 * The constructor.
	 */
	public GanttView() {
	}

	@Override
	protected GanttViewerAbstract createViewer(Composite parent) {
		return new GanttViewer(parent); 
	}

	
}