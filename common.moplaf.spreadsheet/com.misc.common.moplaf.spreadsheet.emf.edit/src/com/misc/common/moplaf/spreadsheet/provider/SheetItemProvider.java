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
/**
 */
package com.misc.common.moplaf.spreadsheet.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.gridview.edit.IItemGridsProvider;
import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.spreadsheet.Sheet} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class SheetItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SheetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSheetNamePropertyDescriptor(object);
			addSheetIndexPropertyDescriptor(object);
			addSpreadsheetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sheet Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSheetNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sheet_SheetName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sheet_SheetName_feature", "_UI_Sheet_type"),
				 SpreadsheetPackage.Literals.SHEET__SHEET_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sheet Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSheetIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sheet_SheetIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sheet_SheetIndex_feature", "_UI_Sheet_type"),
				 SpreadsheetPackage.Literals.SHEET__SHEET_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spreadsheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadsheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sheet_Spreadsheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sheet_Spreadsheet_feature", "_UI_Sheet_type"),
				 SpreadsheetPackage.Literals.SHEET__SPREADSHEET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpreadsheetPackage.Literals.SHEET__ROWS);
			childrenFeatures.add(SpreadsheetPackage.Literals.SHEET__COLUMNS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Sheet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/documents7.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sheet)object).getSheetName();
		return label == null || label.length() == 0 ?
			getString("_UI_Sheet_type") :
			getString("_UI_Sheet_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Sheet.class)) {
			case SpreadsheetPackage.SHEET__SHEET_NAME:
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpreadsheetPackage.SHEET__ROWS:
			case SpreadsheetPackage.SHEET__COLUMNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpreadsheetPackage.Literals.SHEET__ROWS,
				 SpreadsheetFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(SpreadsheetPackage.Literals.SHEET__COLUMNS,
				 SpreadsheetFactory.eINSTANCE.createColumn()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpreadsheetEditPlugin.INSTANCE;
	}

	@Override
	public Collection<?> getGrids(Object element) {
		return null;
	}

	@Override
	public String getText(Object element, Object grid) {
		Sheet sheet = (Sheet)element;
		return sheet.getSheetName();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		Sheet sheet = (Sheet)element;
		return sheet.getRows();
	}

	@Override
	public int getNrRows(Object element, Object grid) {
		return 0; // not necessary, as we return the rows
	}

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		Row sheetRow = (Row)row;
		return sheetRow.getDescription();
	}

	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		Sheet sheet = (Sheet)element;
		return sheet.getColumns();
	}

	@Override
	public int getNrColumns(Object element, Object grid) {
		return 0; // not necessary, as we return the columns
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		Column sheetCol = (Column)column;
		return sheetCol.getDescription();
	}

	private static URI SPREADSHEET_CELL_FOREGROUND = Color.COLOR_BLACK.toURI();
	private static URI SPREADSHEET_CELL_BACKGROUND = Color.COLOR_WHITE.toURI();

	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		return SPREADSHEET_CELL_FOREGROUND;
	}

	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		return SPREADSHEET_CELL_BACKGROUND;
	}

	@Override
	public String getCellText(Object element, Object grid, Object row, Object column) {
		Column sheetCol = (Column)column;
		Row sheetRow = (Row)row;
		Cell sheetCell = sheetRow.getCell(sheetCol);
		return sheetCell == null ? "" : sheetCell.getValueFormatted();
	}

	@Override
	public Object getCellImage(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCellALignment(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return 0;
	}
}
