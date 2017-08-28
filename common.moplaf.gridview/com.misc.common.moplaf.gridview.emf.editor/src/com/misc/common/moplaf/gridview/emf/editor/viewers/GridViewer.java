/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.gridview.emf.editor.viewers;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IInputProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.misc.common.moplaf.gridview.Wrapper;
import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider;
import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider.TableProvider;
import com.misc.common.moplaf.gridview.emf.editor.provider.AdapterFactoryGridProvider.TableProvider.TableColumnProvider;



/**
 * A GridViewer displays a set of 2-dimensional data.
 * <p>
 * Implements the interfaces {@link IInputProvider} and {@link ISelectionProvider}
 * <p>
 * The viewer is instantiated in the createViewer(Composite parent) method of the GridView object, 
 * called from the void createPartControl(Composite parent) method. It will then take care of 
 * the display in the parent Composite.
 * <p>
 * The viewer receives its content from an input Object, as specified by the interface IContentProvider.
 * <p>
 * Finally, the viewer receives get grid data from the elements in the content implementing the interface {@link AdapterFactoryGridProvider.TableProvider}, 
 * providing 2-dimensional data and makes the data available to the viewer.  
 * <p>
 * @author michel
 *
 */
public class GridViewer extends ContentViewer {
	
	private class TableSelectionListener implements ISelectionChangedListener{
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			StructuredSelection selection = (StructuredSelection)event.getSelection();
			Object selectedObject = selection.getFirstElement();
			GridViewer.this.setSelectedElement(selectedObject);
		}
	};
	
	private class ColumnSelectionAdapter extends SelectionAdapter{
		private Grid grid;
		private int columnIndex;
		private TableColumn column;
		
		
        public ColumnSelectionAdapter(Grid grid, int columnIndex, TableColumn column) {
			super();
			this.columnIndex = columnIndex;
			this.column = column;
			this.grid = grid;
		}

		@Override
         public void widgetSelected(SelectionEvent e) {
			this.grid.getViewerComparator().setColumn(this.columnIndex);
			this.column.getParent().setSortColumn(this.column);
			this.grid.getTableViewer().refresh();
         }
	};

	private Object          selectedElement = null;
	private ISelection      currentSelection = null;
	private IColorProvider  colorProvider = null;
	private TabFolder       tabFolder = null;
	
	private class Grid  {
		
		public class GridViewerComparator extends ViewerComparator{
			private int columnIndex;
		    private boolean ascending;

		    public GridViewerComparator() {
		        this.columnIndex = 0;
		        this.ascending = true;
		    }

		    public boolean isAcending() {
		        return this.ascending;
		    }

		    public void setColumn(int column) {
		        if (column == this.columnIndex) {
		            // Same column as last sort; toggle the direction
		            this.ascending = !this.ascending;
		        } else {
		            // New column; do an ascending sort
		            this.columnIndex = column;
		            this.ascending = false;
		        }
		    }

		    @Override
		    public int compare(Viewer viewer, Object e1, Object e2) {
		    	return Grid.this.tableProvider.compareRows(e1, e2, columnIndex, this.ascending);
		    }
		}

		private TableProvider tableProvider;
		private TabItem tabItem;
		private TableViewer viewer;
		private GridViewerComparator comparator;
		public Grid(TableProvider tableProvider, TabItem tabItem, TableViewer viewer) {
			super();
			this.tableProvider = tableProvider;
			this.tabItem = tabItem;
			this.viewer = viewer;
			this.comparator = new GridViewerComparator();
		}
		public TableProvider getTableProvider() {
			return this.tableProvider;
		}
		public TabItem getTabItem() {
			return this.tabItem;
		}
		public TableViewer getTableViewer() {
			return this.viewer;
		}
		public GridViewerComparator getViewerComparator() {
			return this.comparator;
		}
	}
	
	public GridViewer(Composite parent) {
		// called in View.createViewer, himself called by View.createPartControl
		// create the control(s)
        parent.setLayout(new GridLayout());
        // SWT.BOTTOM to show at the bottom
        TabFolder folder = new TabFolder(parent, SWT.BOTTOM);
        GridData data = new GridData(SWT.FILL,
                SWT.FILL, true, true,
                2, 1);
        folder.setLayoutData(data);
//        folder.setSelectionForeground(display.getSystemColor(SWT.COLOR_RED));
//        CTabItem cTabItem1 = new CTabItem(folder, SWT.NONE);
//        cTabItem1.setText("Tab1Michel");
        
        this.tabFolder = folder;
    }
	
	@Override
	public Control getControl() {
		return this.tabFolder;
	}
	
	@Override
	protected void handleDispose(DisposeEvent event) {
		super.handleDispose(event);
		this.tabFolder.dispose();
		this.tabFolder = null;
	}

	// providers management
	@Override
	public void setContentProvider(IContentProvider provider) {
		assertContentProviderType(provider);
		super.setContentProvider(provider);
	}
	
	@Override
	public void setLabelProvider(IBaseLabelProvider provider) {
		assertLabelProviderType(provider);
		super.setLabelProvider(provider);
	}
	
	public void setColorProvider(IColorProvider provider) {
		this.colorProvider = provider;
	}
	
	/**
	 * Assert that the content provider is of one of the
	 * supported types.
	 * @param provider
	 */
	protected void assertContentProviderType(IContentProvider provider) {
		Assert.isTrue(provider instanceof ITreeContentProvider);
	}
	
	/**
	 * Assert that the label provider is of one of the
	 * supported types.
	 * @param provider
	 */
	protected void assertLabelProviderType(IBaseLabelProvider provider) {
		Assert.isTrue(provider instanceof ILabelProvider);
	}
	
	protected ITreeContentProvider getTreeContentProvider(){
		return (ITreeContentProvider)this.getContentProvider();
	}
	
	protected ILabelProvider getILabelProvider(){
		return (ILabelProvider)this.getLabelProvider();
	}
	
	protected IColorProvider getIColorProvider(){
		return this.colorProvider;
	}
	
	// selection management
	/**
	 * Specified by ISelectionProvider.
	 * Get the selection for this provider
	 */
	@Override
	public ISelection getSelection() {
		return this.currentSelection;
	}

	/**
	 * Specified by ISelectionProvider.
	 * Get the selection for this provider
	 */
	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		this.currentSelection = selection;
	}
	
	/**
	 * Set the selection in the environment.
	 * Called by the concrete implementation when the selection must change
	 * @param selectedObject
	 */
	protected void setSelectedElement(Object selectedObject){
		if ( selectedObject instanceof Wrapper) {
			Wrapper wrapper = (Wrapper) selectedObject;
			selectedObject = wrapper.unwrap();
		}
		if ( selectedObject!=this.selectedElement ){
			this.selectedElement = selectedObject;
			this.setSelection(new StructuredSelection(selectedObject), false);
			this.fireSelectionChanged(new SelectionChangedEvent(this, this.getSelection()));
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object input, Object oldInput) {
		super.inputChanged(input, oldInput);
		
		if ( input != oldInput){
			this.refresh();
		}
	}
	
	private void collectTableProviders(ArrayList<TableProvider> tables, Object element, int depth) {
		// the element
		if (element instanceof TableProvider ) {
			tables.add((TableProvider)element);
		}
		// the children
		if ( depth<3) {
			Object[] children_element= this.getTreeContentProvider().getChildren(element);
			for (Object child_element : children_element) {
				// the parent of child is modelElement, this is an actual child
				// this restriction avoids recursion
				if ( element.getClass().isArray() || this.getTreeContentProvider().getParent(child_element)==element){
					this.collectTableProviders(tables,  child_element, depth+1);
				}
			}
		}
	}
	
	/**
	 * Methode declared in {@link Viewer}
	 */
	@Override
	public void refresh(){
		// as is
		HashMap<TableProvider, Grid> grids_as_is = new HashMap<>();
		for ( int i=0; i<this.tabFolder.getItemCount(); i++) {
			TabItem item = this.tabFolder.getItem(i);
			Grid grid = (Grid)item.getData();
			grids_as_is.put(grid.getTableProvider(), grid);
		}
		// to be
		Object input = this.getInput();
		ArrayList<TableProvider> gridsToBe = new ArrayList<TableProvider>();
		this.collectTableProviders(gridsToBe, input, 0);
		// refresh
		for ( TableProvider grid_to_be : gridsToBe) {
			Grid as_is = grids_as_is.get(grid_to_be);
			if ( as_is==null) {
				// create
				// create the tab item
				TabItem cTabItem1 = new TabItem(this.tabFolder, SWT.NONE);
				TableViewer viewer = new TableViewer(this.tabFolder, SWT.VIRTUAL);
				viewer.addSelectionChangedListener(new TableSelectionListener());
				cTabItem1.setControl(viewer.getControl());
				viewer.setLabelProvider(grid_to_be);
				viewer.setContentProvider(grid_to_be);
				viewer.setInput(grid_to_be);
				viewer.getTable().setLinesVisible(true);
				viewer.getTable().setHeaderVisible(true);
//					viewer.getTable().setBackground(this.getControl().getDisplay().getSystemColor(SWT.COLOR_CYAN));
				Grid new_grid = new Grid(grid_to_be, cTabItem1, viewer);
				viewer.setComparator(new_grid.getViewerComparator());
				cTabItem1.setData(new_grid);
				this.refreshGrid(new_grid);
			} else {
				// update
				this.refreshGrid(as_is);
				grids_as_is.remove(grid_to_be);
			}
		}
		for ( Grid as_is : grids_as_is.values()) {
			// remove
			as_is.getTabItem().dispose();
		}
	}
	
	void refreshGrid(Grid grid) {
		TableViewer viewer = grid.getTableViewer();
		TabItem cTabItem = grid.getTabItem();
		TableProvider provider = grid.getTableProvider();
		Table table = viewer.getTable();
		
		// sheet name
		String sheetName = provider.getTableText();
		cTabItem.setText(sheetName);
		
		// refresh the columns
		int nof_columns_asis = table.getColumnCount();
		TableColumnProvider[] columns_tobe = grid.getTableProvider().getTableColumns();
		int nof_columns_tobe = columns_tobe.length;
		if ( nof_columns_asis>nof_columns_tobe) {
			for ( int i = nof_columns_tobe; i<nof_columns_asis; i++) {
				// delete
				table.getColumn(i).dispose();
			}
		} else if ( nof_columns_asis<nof_columns_tobe) {
			for ( int i = nof_columns_asis; i<nof_columns_tobe; i++) {
				// create
				//TableViewerColumn column_viewer = new TableViewerColumn(viewer, SWT.NONE);
				//TableColumn column = column_viewer.getColumn();
				TableColumn column = new TableColumn(viewer.getTable(),SWT.NONE);
				column.setWidth(200);
				column.addSelectionListener(new ColumnSelectionAdapter(grid, i, column));
			}
		}
		for ( int i = 0; i<nof_columns_tobe; i++) {
			// update
			TableColumn column = table.getColumn(i);
			TableColumnProvider column_provider = columns_tobe[i];
			String columnText = column_provider.getText(null);
			column.setText(columnText);
		}

		// viewer refresh
		viewer.refresh();
	}
}
