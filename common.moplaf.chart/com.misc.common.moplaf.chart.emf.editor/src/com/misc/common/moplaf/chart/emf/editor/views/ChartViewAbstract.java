package com.misc.common.moplaf.chart.emf.editor.views;

import java.awt.Color;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.misc.common.moplaf.chart.emf.editor.provider.AdapterFactorySeriesProvider;
import com.misc.common.moplaf.chart.viewers.ChartViewerAbstract;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;

public abstract class ChartViewAbstract extends ViewPart {
	
	private ChartViewerAbstract viewer;
	private IResourceChangeListener resourceListener;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Action action1;
	private Action action2;

	
	public ChartViewAbstract() {
	}
	
	/**
	 * Create the viewer, abstract
	 */
	protected abstract ChartViewerAbstract createViewer(Composite parent);
	
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 
	public void createPartControl(Composite parent) {
        //GridData gd = new GridData(GridData.FILL_BOTH);
		AdapterFactoryIntervalEventProvider contentProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
		//this.intervalEventProvider = new AdapterFactoryIntervalEventProvider(this.adapterFactory);
        this.viewer = this.createViewer(parent);
		this.viewer.setIntervalEventProvider(contentProvider);
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
	*/

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		else {
			return super.getAdapter(key);
		}
	}
	*/

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			viewer.getControl().getShell(),
//			"Gantt View",
//			message);
	}
	


	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void dispose(){
		// unregister the selection listener
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		//window.getSelectionService().removeSelectionListener(this.selectionListener);
		//this.selectionListener = null;
		
		// unregister the resource change listener
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this.resourceListener);
		this.resourceListener = null;
		
		// done, dispose other things
		super.dispose();
	}

	/*
	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new PropertySheetPage();
		AdapterFactorySeriesProvider sourcePropertyProvider = new AdapterFactorySeriesProvider(this.adapterFactory, Color.BLACK, Color.WHITE);
		propertySheetPage.setPropertySourceProvider(sourcePropertyProvider);
		return propertySheetPage;
	}
	*/
}
