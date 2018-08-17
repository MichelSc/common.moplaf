package com.misc.common.moplaf.emf.editor.views;

import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.ViewPart;

public abstract class ViewAbstract  extends ViewPart{
	protected IResourceChangeListener resourceListener;
	protected ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	protected Action pinAction;
	//private Action action2;
	protected ISelectionListener selectionListener;
		

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
		manager.add(pinAction);
		manager.add(new Separator());
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(pinAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}	

	protected void contributeToActionBars() {
		IViewSite site = getViewSite();
				
		if( site != null ) {
			IActionBars bars = site.getActionBars();
			fillLocalPullDown(bars.getMenuManager());
			fillLocalToolBar(bars.getToolBarManager());
		}
		else {
			System.out.println("** site is null !");
		}
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(pinAction);
		//manager.add(action2);
	}
	

	public void dispose(){
		// unregister the selection listener
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		window.getSelectionService().removeSelectionListener(this.selectionListener);
		this.selectionListener = null;
		
		// unregister the resource change listener
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this.resourceListener);
		this.resourceListener = null;
		
		// done, dispose other things
		super.dispose();
	}

}
