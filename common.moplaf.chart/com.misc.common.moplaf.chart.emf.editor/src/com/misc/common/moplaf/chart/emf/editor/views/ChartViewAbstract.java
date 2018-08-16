package com.misc.common.moplaf.chart.emf.editor.views;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;

import com.misc.common.moplaf.chart.emf.editor.provider.AdapterFactorySeriesProvider;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.emf.editor.views.ViewAbstract;

public abstract class ChartViewAbstract extends ViewAbstract {
	
	private ChartViewerAbstract viewer;

	/**
	 * Create the viewer, abstract
	 */
	protected abstract ChartViewerAbstract createViewer(Composite parent);

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
        //GridData gd = new GridData(GridData.FILL_BOTH);
		AdapterFactorySeriesProvider contentProvider = new AdapterFactorySeriesProvider(this.adapterFactory, null, null);
		//this.intervalEventProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
        this.viewer = this.createViewer(parent);
		this.viewer.setSeriesProvider(contentProvider);
        this.viewer.setContentProvider      (contentProvider);
		this.viewer.setLabelProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));
		this.viewer.setColorProvider        (new AdapterFactoryArrayLabelProvider   (this.adapterFactory));

        //viewer.setLayoutData(gd);
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "com.misc.common.moplaf.timeview.jaret.viewer");
		//makeActions();
		//hookContextMenu();
		//hookDoubleClickAction();
		//contributeToActionBars();
		
		// register the selection listener
		this.selectionListener = new SiteSelectionListener();
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		window.getSelectionService().addSelectionListener(selectionListener);
		site.setSelectionProvider(this.viewer);

		// resource change listening
		this.resourceListener = new IResourceChangeListener() {
		      public void resourceChanged(IResourceChangeEvent event) {
		         System.out.println("Something changed in some resoure: "+event.toString());
		      }
		   };
	   ResourcesPlugin.getWorkspace().addResourceChangeListener(this.resourceListener);
	} // createControl method
	
	/**
	 * Implement the interface ISelectionListener
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	class SiteSelectionListener implements ISelectionListener {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			
			if (  ChartViewAbstract.this.viewer != null && part!= ChartViewAbstract.this) {
				if (  !selection.isEmpty() 
				  && selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection)selection;
					ChartViewAbstract.this.viewer.setInput(structuredSelection.getFirstElement());
				} // there is a selection
				else {
					ChartViewAbstract.this.viewer.setInput(null);
				}
			} // there is a viewer
		}
	}
	
}
