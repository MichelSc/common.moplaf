package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.PinPropertySheetAction;
import com.misc.common.moplaf.chart.emf.editor.views.ChartViewAbstract;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;

public class ChartView extends ChartViewAbstract {
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.chart.swtchart.ChartView";
	
	public ChartView() {
	}
	
	@Override
	protected ChartViewerAbstract createViewer(Composite parent) {
		return new ChartViewer(parent);
	}

}
