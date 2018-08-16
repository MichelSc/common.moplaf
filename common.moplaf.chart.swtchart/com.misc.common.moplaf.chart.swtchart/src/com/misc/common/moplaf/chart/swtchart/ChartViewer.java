package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.swtchart.Chart;
import org.swtchart.IBarSeries;
import org.swtchart.ISeries.SeriesType;

import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;
public class ChartViewer extends ChartViewerAbstract {
	
	private Chart chart;

	public ChartViewer(Composite parent) {
		chart = new Chart(parent, SWT.NONE);
		// set titles
		chart.getTitle().setText("");
		chart.getAxisSet().getXAxis(0).getTitle().setText("");
		chart.getAxisSet().getYAxis(0).getTitle().setText("");
		
		super.hookControl(chart);

	}

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
		chart.setVisible(false);
		
		// michel: here follows all the call required to retrieve the bar chart information from the model
		if ( bar_charts.length>0 ) {
			Object first_bar_chart = bar_charts[0];
			Object[] all_series = this.getISeriesProvider().getSeries(input, first_bar_chart);
			if ( all_series.length>0 ) {
				Object first_series = all_series[0];
				String first_series_name = this.getILabelProvider().getText(first_series);
				Color first_series_color = this.getIColorProvider().getBackground(first_series);
				Object[] all_categories = this.getISeriesProvider().getCategories(input, first_bar_chart);
				
				double[] ySeries = new double[all_categories.length];
				String[] xSeries = new String[all_categories.length];
								
				for ( int i=0; i<all_categories.length; i++) {
					Object category = all_categories[i];
					String category_name = this.getILabelProvider().getText(category);
					float category_value = this.getISeriesProvider().getCategoryAmount(input, first_bar_chart, first_series, category);

					System.out.format("category %s, amount %f \n", category_name, category_value);
					
					ySeries[i] = category_value;
					xSeries[i] = category_name;

				}
				
				System.out.println("** first_series_name : " + first_series_name);
				
				if( all_categories.length > 0 ) {
					chart.setVisible(true);
					// create bar series
					IBarSeries barSeries = (IBarSeries) chart.getSeriesSet()
					    .createSeries(SeriesType.BAR, first_series_name);
					//barSeries.setXDateSeries(xSeries);
					//barSeries.setDescription("description");
					barSeries.setYSeries(ySeries);
	
					// adjust the axis range
					chart.getAxisSet().getXAxis(0).enableCategory(true);
					chart.getAxisSet().getXAxis(0).setCategorySeries(xSeries);
					chart.getAxisSet().adjustRange();
					chart.redraw();
				}
			}
		}
	}

	@Override
	public Control getControl() {
		return chart;
	}
}
