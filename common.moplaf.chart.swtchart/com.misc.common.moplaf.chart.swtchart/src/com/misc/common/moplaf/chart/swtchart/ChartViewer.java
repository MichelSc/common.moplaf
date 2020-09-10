package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.swtchart.Chart;
import org.swtchart.IBarSeries;
import org.swtchart.ISeries;
import org.swtchart.ISeries.SeriesType;

import com.misc.common.moplaf.chart.swtchart.ChartViewer.BarChart.BarChartSerie;
//import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;

public class ChartViewer extends ChartViewerAbstract {
	
	private BarChart[] charts;
	private TabFolder tabFolder = null;

	public ChartViewer(Composite parent) {
		this.tabFolder = new TabFolder(parent, SWT.BOTTOM);
		super.hookControl(this.tabFolder);
	}

	class BarChart {
		class BarChartSerie {
			protected int serie_id;
			protected Object[] categories;			
		}
		protected Chart chart;
		protected BarChartSerie[] series;
		
		protected void init_series(int n) {
			for( int i = 0; i < n; i++ ) {
				series[i] = new BarChartSerie();
			}
		}
	}
	
	private Chart createChart( Composite parent ) {		
		Chart chart = new Chart(parent, SWT.NONE);
		// set titles
		chart.getTitle().setText("");
		chart.getAxisSet().getXAxis(0).getTitle().setText("");
		chart.getAxisSet().getYAxis(0).getTitle().setText("");
		
		//chart.addMouseListener(new ChartSelectionListener());
		Composite composite = chart.getPlotArea();
		composite.addMouseListener(new ChartSelectionListener());
		
		return chart;
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
		
		for( TabItem tab : this.tabFolder.getItems() ) {
			tab.dispose();
		}
		
		Object inputs = this.getInput(); // michel: this is the content to be displayed (if something to be displayed)
		if( !( inputs instanceof Object[] ) ) {
			return;
		}	
		//charts = new BarChart[((Object[])inputs).length];
		int nb_barcharts = 0;
		for( Object input : (Object[])inputs ) {
			nb_barcharts += this.getISeriesProvider().getSeriesProviders(input).length;
		}
		charts = new BarChart[nb_barcharts];
		int count = 0;
		for( Object input : (Object[])inputs ) {
			
			Object[] bar_charts = this.getISeriesProvider().getSeriesProviders(input);
			
			// michel: here follows all the call required to retrieve the bar chart information from the model
			for( Object bar_chart : bar_charts ) {
				Object[] all_series = this.getISeriesProvider().getSeries(input, bar_chart);
				
				BarChart chart = null;
				if ( all_series.length > 0 ) {					
					TabItem tabItem = new TabItem(this.tabFolder, SWT.NONE);
					Composite composite = new Composite(tabFolder, SWT.NONE);
				    composite.setLayout(new FillLayout());
					tabItem.setControl(composite);
					tabItem.setText(this.getILabelProvider().getText(bar_chart));
					chart = new BarChart();
					chart.chart = this.createChart(composite);
					tabItem.setData(chart);
					chart.chart.setVisible(false);
					chart.series = new BarChartSerie[all_series.length];
					chart.init_series(all_series.length);
				}
				
				for ( int i = 0; i < all_series.length; i++ ) {
					Object current_serie = all_series[i];
					String serie_name = this.getILabelProvider().getText(current_serie);
					Color serie_color = this.getIColorProvider().getBackground(current_serie);
					Object[] all_categories = this.getISeriesProvider().getCategories(input, bar_chart);
					chart.series[i].categories = new Object[all_categories.length];
					chart.series[i].serie_id = i;
					
					double[] ySeries = new double[all_categories.length];
					String[] xSeries = new String[all_categories.length];
									
					for ( int j = 0; j < all_categories.length; j++) {
						Object category = all_categories[j];
						chart.series[i].categories[j] = category;
						String category_name = this.getILabelProvider().getText(category);
						float category_value = this.getISeriesProvider().getCategoryAmount(input, bar_chart, current_serie, category);
						ySeries[j] = category_value;
						xSeries[j] = category_name;
					}
									
					if( all_categories.length > 0 ) {
						// create bar series
						IBarSeries barSeries = (IBarSeries) chart.chart.getSeriesSet()
						    .createSeries(SeriesType.BAR, serie_name);
						barSeries.setBarColor(serie_color);
						//barSeries.setXDateSeries(xSeries);
						//barSeries.setDescription("description");
						barSeries.setYSeries(ySeries);

						/*
						IAxisTick xTick = chart.getAxisSet().getXAxis(i).getTick();
						IAxisTick yTick = chart.getAxisSet().getYAxis(i).getTick();
						Color black = new Color(Display.getDefault(), 0, 0, 0);
						Color white = new Color(Display.getDefault(), 255, 255, 255);
						xTick.setForeground(black);
						yTick.setForeground(black);
						*/
						
						chart.chart.getAxisSet().getXAxis(0).enableCategory(true);
						chart.chart.getAxisSet().getXAxis(0).setCategorySeries(xSeries);
						chart.chart.setVisible(true);
					}
				}
				
				if ( all_series.length > 0 ) {
					// adjust the axis range
					chart.chart.getAxisSet().adjustRange();
					chart.chart.redraw();
					charts[count++] = chart;
				}
			}
		}
	}

	@Override
	public Control getControl() {
		return this.tabFolder;
	}
	
	private class ChartSelectionListener implements MouseListener {

		@Override
		public void mouseDoubleClick(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDown(MouseEvent e) {
			int tabIndex = ChartViewer.this.tabFolder.getSelectionIndex();
			String category_name = getCategoryName(tabIndex, e.x);
			if ( category_name!=null ) {
				for( BarChartSerie serie : charts[tabIndex].series ) {
					for( Object category : serie.categories ) {
						String cat_to_test = getILabelProvider().getText(category);
						if( cat_to_test.equals(category_name) ) {
							setSelectedElement(category);
						}
					}
				}
			}
		}

		@Override
		public void mouseUp(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private String getCategoryName(int tabIndex, int x) {
		String result = "";
		ISeries[] series = charts[tabIndex].chart.getSeriesSet().getSeries();
		for ( int i = 0; i < series.length; i++ ) {
			ISeries serie = series[i];
			if( serie instanceof IBarSeries ) {
				for ( int j = 0; j < ((IBarSeries)serie).getBounds().length; j++ ) {
					Rectangle r = ((IBarSeries)serie).getBounds()[j];
					if( x <= r.x + r.width && x >= r.x ) {
						result = charts[tabIndex].chart.getAxisSet().getXAxis(0).getCategorySeries()[j];
						return result;
					}
				}
			}
		}
		
		return result;
	}
}
