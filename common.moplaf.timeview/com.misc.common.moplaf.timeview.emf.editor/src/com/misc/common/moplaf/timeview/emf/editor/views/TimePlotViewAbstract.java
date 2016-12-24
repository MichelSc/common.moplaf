package com.misc.common.moplaf.timeview.emf.editor.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.*;

import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayContentProvider;
import com.misc.common.moplaf.emf.editor.provider.AdapterFactoryArrayLabelProvider;
import com.misc.common.moplaf.timeview.emf.editor.provider.AdapterFactoryAmountEventProvider;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;

public abstract class TimePlotViewAbstract extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.views.GanttView";

	private TimePlotViewerAbstract viewer;
	private ISelectionListener selectionListener;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	/**
	 * Implement the interface ISelectionListener
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	class SiteSelectionListener implements ISelectionListener {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			
			if (  TimePlotViewAbstract.this.viewer != null && part!= TimePlotViewAbstract.this) {
				if (  !selection.isEmpty() 
				  && selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection)selection;
					TimePlotViewAbstract.this.viewer.setInput(structuredSelection.toArray());
				} // there is a selection
			} // there is a viewer
		}
	}

	/**
	 * The constructor.
	 */
	public TimePlotViewAbstract() {
	}
	
	/**
	 * Create the viewer, abstract
	 */
	protected abstract TimePlotViewerAbstract createViewer(Composite parent);
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
        this.viewer = this.createViewer(parent);
        this.viewer.setContentProvider    (new AdapterFactoryArrayContentProvider(this.adapterFactory));
		this.viewer.setLabelProvider      (new AdapterFactoryArrayLabelProvider  (this.adapterFactory));
		this.viewer.setColorProvider      (new AdapterFactoryArrayLabelProvider  (this.adapterFactory));
		this.viewer.setAmountEventProvider(new AdapterFactoryAmountEventProvider (this.adapterFactory));

		// register the selection listener
		this.selectionListener = new SiteSelectionListener();
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		
		window.getSelectionService().addSelectionListener(selectionListener);
		site.setSelectionProvider(this.viewer);
		
	} // createControl method

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
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

	/**
	 * This creates a property sheet. Question: should we cache it?
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new PropertySheetPage();
		AdapterFactoryContentProvider sourcePropertyProvider = new AdapterFactoryContentProvider(this.adapterFactory);
		propertySheetPage.setPropertySourceProvider(sourcePropertyProvider);
		return propertySheetPage;
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
		window.getSelectionService().removeSelectionListener(this.selectionListener);
		this.selectionListener = null;
		
		// done, dispose other things
		super.dispose();
	}

}