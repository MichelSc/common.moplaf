package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.graphics.Color;

import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;
public class ChartViewer extends ChartViewerAbstract {

	@Override
	protected void inputChanged(Object input, Object oldInput) {
		if ( input != oldInput){
			// michel: the input object is the content to be displayed
			// michel: it has changed
			// michel: update internal state accordingly
			// michel: minimally, nothing to do, the internal state is the input object 
			
			this.refresh();
		}
	}

	@Override
	public void refresh() {
		// michel: receive the control when bar chart must be redrawn
		// michel: this might be triggered, either by an input changed (see above), or by some other event
		
		Object input = this.getInput(); // michel: this is the content to be displayed (if something to be displayed)
		
		Object[] bar_charts = this.getISeriesProvider().getSeriesProviders(input);

		// michel: here follows all the call required to retrieve the bar chart information from the model
		if ( bar_charts.length>0 ) {
			Object first_bar_chart = bar_charts[0];
			Object[] all_series = this.getISeriesProvider().getSeries(input, first_bar_chart);
			if ( all_series.length>0 ) {
				Object first_series = all_series[0];
				String first_series_name = this.getILabelProvider().getText(first_series);
				Color first_series_color = this.getIColorProvider().getBackground(first_series);
				Object[] all_categories = this.getISeriesProvider().getCategories(input, first_series);
				for ( int i=0; i<all_categories.length; i++) {
					Object category = all_categories[i];
					String category_name = this.getILabelProvider().getText(category);
					float category_value = this.getISeriesProvider().getCategoryAmount(input, first_bar_chart, first_series, category);
				}
			}
		}
	}
}
