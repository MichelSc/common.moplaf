package com.misc.common.moplaf.chart.swtchart;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.swtchart.Chart;
import org.swtchart.IAxisTick;
import org.swtchart.IBarSeries;
import org.swtchart.ISeries;
import org.swtchart.ISeries.SeriesType;

//import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;

public class ChartViewer extends ChartViewerAbstract {
	
	private Chart[] charts;
	private Object[] categories;
	private TabFolder tabFolder = null;

	private Chart createChart( Composite parent ) {		
		Chart chart = new Chart(parent, SWT.NONE);
		// set titles
		chart.getTitle().setText("");
		chart.getAxisSet().getXAxis(0).getTitle().setText("");
		chart.getAxisSet().getYAxis(0).getTitle().setText("");
		
		super.hookControl(chart);
		//chart.addMouseListener(new ChartSelectionListener());
		Composite composite = chart.getPlotArea();
		composite.addMouseListener(new ChartSelectionListener());
		
		return chart;
	}
	
	public ChartViewer(Composite parent) {
		this.tabFolder = new TabFolder(parent, SWT.BOTTOM);
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
		
		/*
		for( Chart chart : charts ) {
			for( Control tab : chart.getTabList() ) {
				tab.dispose();
			}
		}
		*/
		for( TabItem tab : this.tabFolder.getItems() ) {
			tab.dispose();
		}
		
		Object inputs = this.getInput(); // michel: this is the content to be displayed (if something to be displayed)
		if( inputs instanceof Object[] ) {
		charts = new Chart[((Object[])inputs).length];
		int count = 0;
		for( Object input : (Object[])inputs ) {
			
			Object[] bar_charts = this.getISeriesProvider().getSeriesProviders(input);
			
			// michel: here follows all the call required to retrieve the bar chart information from the model
			if ( bar_charts.length>0 ) {
				Object first_bar_chart = bar_charts[0];
				Object[] all_series = this.getISeriesProvider().getSeries(input, first_bar_chart);
				
				Chart chart = null;
				if ( all_series.length > 0 ) {					
					TabItem tabItem = new TabItem(this.tabFolder, SWT.NONE);
					Composite composite = new Composite(tabFolder, SWT.NONE);
				    composite.setLayout(new FillLayout());
					tabItem.setControl(composite);
					tabItem.setText(this.getILabelProvider().getText(first_bar_chart));
					chart = this.createChart(composite);
					tabItem.setData(chart);
					chart.setVisible(false);
				}
				
				for ( int i = 0; i < all_series.length; i++ ) {
					Object current_serie = all_series[i];
					String serie_name = this.getILabelProvider().getText(current_serie);
					//Color serie_color = this.getIColorProvider().getBackground(current_serie);
					Object[] all_categories = this.getISeriesProvider().getCategories(input, first_bar_chart);
					this.categories = new Object[all_categories.length];
					
					double[] ySeries = new double[all_categories.length];
					String[] xSeries = new String[all_categories.length];
									
					for ( int j = 0; j < all_categories.length; j++) {
						Object category = all_categories[j];
						categories[j] = category;
						String category_name = this.getILabelProvider().getText(category);
						float category_value = this.getISeriesProvider().getCategoryAmount(input, first_bar_chart, current_serie, category);
						ySeries[j] = category_value;
						xSeries[j] = category_name;
					}
									
					if( all_categories.length > 0 ) {
						for( ISeries serie : chart.getSeriesSet().getSeries() ) {
							String id = serie.getId();
							chart.getSeriesSet().deleteSeries(id);
						}
						// create bar series
						IBarSeries barSeries = (IBarSeries) chart.getSeriesSet()
						    .createSeries(SeriesType.BAR, serie_name);
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
						
						chart.getAxisSet().getXAxis(i).enableCategory(true);
						chart.getAxisSet().getXAxis(i).setCategorySeries(xSeries);
						chart.setVisible(true);
					}
				}
				
				if ( all_series.length > 0 ) {
					// adjust the axis range
					chart.getAxisSet().adjustRange();
					chart.redraw();
					charts[count++] = chart;
				}
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
			for( Object category : categories ) {
				if( getILabelProvider().getText(category) == category_name ) {
					setSelectedElement(category);
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
		for (ISeries serie : charts[tabIndex].getSeriesSet().getSeries()) {
			if( serie instanceof IBarSeries ) {
				for ( int i = 0; i < ((IBarSeries)serie).getBounds().length; i++ ) {
					Rectangle r = ((IBarSeries)serie).getBounds()[i];
					if( x <= r.x + r.width && x >= r.x ) {
						// TODO : adapt it for several series
						result = charts[tabIndex].getAxisSet().getXAxis(0).getCategorySeries()[i];
					}
				}
			}
		}
		
		return result;
	}
}
