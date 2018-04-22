/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.gridview.emf.editor.views;


import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider;
//import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider;
import com.misc.common.moplaf.gridview.emf.editor.viewers.GridViewer;


public class GridView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.gridview.views.GridView";

	private GridViewer viewer;
	private Action action1;
	private Action action2;
	//private Action doubleClickAction;
	private ISelectionListener selectionListener;
//	private IResourceChangeListener resourceListener;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * Implement the interface ISelectionListener
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	class SiteSelectionListener implements ISelectionListener {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			
			if (  GridView.this.viewer != null && part!= GridView.this) {
				if (  !selection.isEmpty() 
				  && selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection)selection;
					GridView.this.viewer.setInput(structuredSelection.toArray());
				} // there is a selection
				else {
					GridView.this.viewer.setInput(null);
				}
			} // there is a viewer
		}
	}

	/**
	 * The constructor.
	 */
	public GridView() {
	}
	
	/**
	 * Create the viewer, abstract
	 */
	protected  GridViewer createViewer(Composite parent) {
		return new GridViewer(parent);
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		AdapterFactoryGridProvider contentProvider = new AdapterFactoryGridProvider(this.adapterFactory, parent.getForeground(), parent.getBackground());
        this.viewer = this.createViewer(parent);
        this.viewer.setContentProvider           (contentProvider);
		this.viewer.setLabelProvider        (new AdapterFactoryLabelProvider   (this.adapterFactory));
//		this.viewer.setColorProvider        (new AdapterFactoryLabelProvider   (this.adapterFactory));

 		// register the selection listener
		this.selectionListener = new SiteSelectionListener();
		IWorkbenchPartSite site = getSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		window.getSelectionService().addSelectionListener(selectionListener);
		site.setSelectionProvider(this.viewer); // this way the environment will listen to selections in my viewer

//		// resource change listening
//		this.resourceListener = new IResourceChangeListener() {
//		      public void resourceChanged(IResourceChangeEvent event) {
//		         System.out.println("Something changed in some resoure: "+event.toString());
//		      }
//		   };
//	   ResourcesPlugin.getWorkspace().addResourceChangeListener(this.resourceListener);
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

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GridView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

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

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//		doubleClickAction = new Action() {
//		
//			public void run() {
//				ISelection selection = viewer.getSelection();
//				Object obj = ((IStructuredSelection)selection).getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
//			}
//		};
	}

	private void hookDoubleClickAction() {
//		viewer.addDoubleClickListener(new IDoubleClickListener() {
//			public void doubleClick(DoubleClickEvent event) {
//				doubleClickAction.run();
//			}
//		});
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
		window.getSelectionService().removeSelectionListener(this.selectionListener);
		this.selectionListener = null;
		
		// done, dispose other things
		super.dispose();
	}

}
