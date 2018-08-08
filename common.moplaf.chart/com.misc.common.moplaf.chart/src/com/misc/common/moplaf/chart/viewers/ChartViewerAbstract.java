package com.misc.common.moplaf.chart.viewers;

import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Control;

import com.misc.common.moplaf.chart.ISeriesProvider;

public class ChartViewerAbstract extends ContentViewer {

	private IColorProvider colorProvider = null;
	private ISeriesProvider seriesProvider = null;

	public void setSeriesProvider(ISeriesProvider provider){
		this.seriesProvider = provider;
	}

	protected ISeriesProvider getISeriesProvider(){
		return this.seriesProvider;
	}
	
	public void setColorProvider(IColorProvider provider) {
		this.colorProvider = provider;
	}

	protected ILabelProvider getILabelProvider(){
		return (ILabelProvider)this.getLabelProvider();
	}
	
	protected IColorProvider getIColorProvider(){
		return this.colorProvider;
	}
	
	@Override
	public Control getControl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		// TODO Auto-generated method stub
		
	}

}
