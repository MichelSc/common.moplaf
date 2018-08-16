package com.misc.common.moplaf.gridview.emf.edit.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

public class CompoundItemGridsProvider implements IItemGridsProvider {
	private Collection<IItemGridsProvider> providers;
	private HashMap<Object, IItemGridsProvider> map_grip_to_provider = new HashMap<>();
			
	
	private void initProviders() {
		this.providers = new LinkedList<IItemGridsProvider>();
	}
	
	public CompoundItemGridsProvider(Collection<IItemGridsProvider> providers) {
		super();
		this.providers = providers;
	}

	public CompoundItemGridsProvider(IItemGridsProvider provider) {
		super();
		this.initProviders();
		this.providers.add(provider);
	}
	
	public CompoundItemGridsProvider(IItemGridsProvider provider1, IItemGridsProvider provider2) {
		super();
		this.initProviders();
		this.providers.add(provider1);
		this.providers.add(provider2);
	}
	
	
	// grids
	@Override
	public Object getGrids(Object element) {
		this.map_grip_to_provider.clear();
		for ( IItemGridsProvider provider: this.providers) {
			Object grids_asobject = provider.getGrids(element);
//			while ( grids_asobject instanceof IItemGridsProvider ) {
//				// delegated to 
//				provider = (IItemGridsProvider) grids_asobject;
//				grids_asobject = provider.getGrids(element);
//			} 
			if ( grids_asobject instanceof Collection<?> ) {
				// a collections of grids for the element
				Collection<?> grids = (Collection<?>)grids_asobject;
				for ( Object grid : grids){
					this.map_grip_to_provider.put(grid, provider);
				}
			} else if ( grids_asobject!=null ){
				// a single grid for the element
				this.map_grip_to_provider.put(grids_asobject, provider);
			} 
		}
		//return all_grids;
		return this.map_grip_to_provider.keySet();
	}
	
	@Override
	public String getGridText(Object element, Object grid) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getGridText(element, grid);
	}
	
	@Override
	public int getGridTraits(Object element, Object grid) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getGridTraits(element, grid);
	}

	// rows
	@Override
	public String getRowText(Object element, Object grid, Object row) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getRowText(element, grid, row);
	}
	@Override
	public Collection<?> getRows(Object element, Object grid) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getRows(element, grid);
	}
	@Override
	public int getRowHeight(Object element, Object grid, Object row) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getRowHeight(element, grid, row);
	}
	@Override
	public int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.compareRow(element, grid, row1, row2, column, ascending);
	}

	// columns
	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getColumns(element, grid);
	}
	@Override
	public int getNrColumns(Object element, Object grid) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getNrColumns(element, grid);
	}
	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getColumnText(element, grid, column);
	}
	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getColumnWidth(element, grid, column);
	}
	@Override
	public int compareColumn(Object element, Object grid, Object column1, Object column2, Object row,
			boolean ascending) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.compareColumn(element, grid, column1, column2, row, ascending);
	}

	// cells
	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellValue(element, grid, row, column);
	}
	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellType(element, grid, row, column);
	}
	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellForeground(element, grid, row, column);
	}
	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellBackground(element, grid, row, column);
	}
	@Override
	public Object getCellImage(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellImage(element, grid, row, column);
	}
	@Override
	public int getCellALignment(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellALignment(element, grid, row, column);
	}
	@Override
	public String getCellFormat(Object element, Object grid, Object row, Object column) {
		IItemGridsProvider provider = this.map_grip_to_provider.get(grid);
		return provider.getCellFormat(element, grid, row, column);
	}
}
