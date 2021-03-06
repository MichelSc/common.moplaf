package com.misc.common.moplaf.emf.editor.views;

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
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.misc.common.moplaf.emf.editor.Util;
import com.misc.common.moplaf.emf.editor.action.PinViewAction;
import com.misc.common.moplaf.emf.editor.menus.ActionContributionMenu;
import com.misc.common.moplaf.emf.editor.viewers.ViewerAbstract;

public abstract class ViewAbstract extends ViewPart implements IPropertyChangeListener {

	protected IResourceChangeListener resourceListener;
	protected ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	protected Action pinAction;
	protected ISelectionListener selectionListener;
	private ISelection selection;
	
	private ViewerAbstract viewer;
	

	protected ViewerAbstract getViewer() {
		// TODO Auto-generated method stub
		return this.viewer;
	}
	
	protected void setViewer(ViewerAbstract viewer) {
		this.viewer = viewer;
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	    if (window != null)
	    {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			if( selection != null ) {
				this.viewer.setInput(Util.getSelectedObjects(selection));
			}
	    }
		
	}
		
	/**
	 * Create the viewer, abstract
	 */
	protected abstract ViewerAbstract createViewer(Composite parent);

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		if( event.getSource().equals(this.pinAction) ) {
			if( !this.pinAction.isChecked() && this.selection != null ) {
				this.getViewer().setInput(Util.getSelectedObjects(this.selection));
			}
		}
	}


	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(pinAction);
		manager.add(new Separator());
	}

	protected void fillContextMenu(IMenuManager manager) {
		manager.add(pinAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		ActionContributionMenu.fillDefaultMenu(manager, this.getSite().getPart(), this.getViewer().getSelection());
	}
	
	protected void contributeToActionBars() {
		IViewSite site = getViewSite();
				
		if( site != null ) {
			pinAction = new PinViewAction();
			IActionBars bars = site.getActionBars();
			fillLocalPullDown(bars.getMenuManager());
			fillLocalToolBar(bars.getToolBarManager());
			pinAction.addPropertyChangeListener(this);
		}
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(pinAction);
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

	/**
	 * Implement the interface ISelectionListener
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	class SiteSelectionListener implements ISelectionListener {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			ViewAbstract.this.selection = selection; 
			if( !pinAction.isChecked() ) {
				if (  ViewAbstract.this.getViewer() != null && part!= ViewAbstract.this) {
					if (  !selection.isEmpty() ) {
						//IStructuredSelection structuredSelection = (IStructuredSelection)selection;
						ViewAbstract.this.getViewer().setInput(Util.getSelectedObjects(selection));
					} // there is a selection
					else {
						ViewAbstract.this.getViewer().setInput(null);
					}
				} // there is a viewer
			}
		}
	}

	protected void setSelectionListener() {
		// register the selection listener
		this.selectionListener = new SiteSelectionListener();
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		window.getSelectionService().addSelectionListener(selectionListener);
		site.setSelectionProvider(this.getViewer());

		// resource change listening
		this.resourceListener = new IResourceChangeListener() {
		      public void resourceChanged(IResourceChangeEvent event) {
		         System.out.println("Something changed in some resoure: "+event.toString());
		      }
		   };
	    ResourcesPlugin.getWorkspace().addResourceChangeListener(this.resourceListener);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		this.getViewer().getControl().setFocus();
	}
	
	protected void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ViewAbstract.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(this.getViewer().getControl());
		getViewer().getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, this.getViewer());
	}
	
	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
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

}
