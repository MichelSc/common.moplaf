package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.widgets.Composite;
import com.misc.common.moplaf.chart.emf.editor.views.ChartViewAbstract;
import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;

public class ChartView extends ChartViewAbstract {
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.chart.swtchart.views.ChartView";
	
	public ChartView() {
	}
	
	@Override
	protected ViewerAbstract createViewer(Composite parent) {
		return new ChartViewer(parent);
	}

}
