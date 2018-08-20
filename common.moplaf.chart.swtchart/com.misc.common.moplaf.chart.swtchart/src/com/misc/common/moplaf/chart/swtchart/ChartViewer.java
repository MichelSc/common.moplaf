package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.swtchart.Chart;
import org.swtchart.IBarSeries;
import org.swtchart.ISeries.SeriesType;
import org.swtchart.internal.PlotArea;

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
		if( input instanceof Object[] ) {
			input = ((Object[])input)[0];
		}
		Object[] bar_charts = this.getISeriesProvider().getSeriesProviders(input);
		chart.setVisible(false);
		
		// michel: here follows all the call required to retrieve the bar chart information from the model
		if ( bar_charts.length>0 ) {
			Object first_bar_chart = bar_charts[0];
			Object[] all_series = this.getISeriesProvider().getSeries(input, first_bar_chart);
			for ( int i = 0; i < all_series.length; i++ ) {
				Object current_serie = all_series[i];
				String serie_name = this.getILabelProvider().getText(current_serie);
				Color serie_color = this.getIColorProvider().getBackground(current_serie);
				Object[] all_categories = this.getISeriesProvider().getCategories(input, first_bar_chart);
				
				double[] ySeries = new double[all_categories.length];
				String[] xSeries = new String[all_categories.length];
								
				for ( int j = 0; j < all_categories.length; j++) {
					Object category = all_categories[j];
					String category_name = this.getILabelProvider().getText(category);
					float category_value = this.getISeriesProvider().getCategoryAmount(input, first_bar_chart, current_serie, category);

					System.out.format("category %s, amount %f \n", category_name, category_value);
					
					ySeries[j] = category_value;
					xSeries[j] = category_name;
				}
								
				if( all_categories.length > 0 ) {
					chart.setVisible(true);
					// create bar series
					IBarSeries barSeries = (IBarSeries) chart.getSeriesSet()
					    .createSeries(SeriesType.BAR, serie_name);
					//barSeries.setXDateSeries(xSeries);
					//barSeries.setDescription("description");
					barSeries.setYSeries(ySeries);
					
					chart.addMouseListener(new ChartSelectionListener());
					Composite composite = chart.getPlotArea();
					composite.addMouseListener(new ChartSelectionListener());
					
					// adjust the axis range
					chart.getAxisSet().getXAxis(i).enableCategory(true);
					chart.getAxisSet().getXAxis(i).setCategorySeries(xSeries);
					chart.getAxisSet().adjustRange();
				}
			}
			if ( all_series.length > 0 ) {
				chart.redraw();
			}
		}
	}

	@Override
	public Control getControl() {
		return chart;
	}
	
	private class ChartSelectionListener implements MouseListener {

		@Override
		public void mouseDoubleClick(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDown(MouseEvent e) {
			// TODO Auto-generated method stub
			
			Object selection = e.getSource();
			//Object selectedObject = selection.getFirstElement();
			
			System.out.println("** selection type : " + selection.getClass().toString());
			
			if( selection instanceof PlotArea ) {
				PlotArea pa = (PlotArea)selection;
				System.out.println("** serie : " + pa.getSeriesSet().getSeries()[0].getId());
				
			}
			
		}

		@Override
		public void mouseUp(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	};

}
