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
/**
 */
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getSheetIndex <em>Sheet Index</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getTopRowsFrozen <em>Top Rows Frozen</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getBottomRowsFrozen <em>Bottom Rows Frozen</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getLeftColumnsFrozen <em>Left Columns Frozen</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getRightColumnsFrozen <em>Right Columns Frozen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetImpl extends MinimalEObjectImpl.Container implements Sheet {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The default value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected String sheetName = SHEET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheetIndex() <em>Sheet Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int SHEET_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSheetIndex() <em>Sheet Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetIndex()
	 * @generated
	 * @ordered
	 */
	protected int sheetIndex = SHEET_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopRowsFrozen() <em>Top Rows Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopRowsFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_ROWS_FROZEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTopRowsFrozen() <em>Top Rows Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopRowsFrozen()
	 * @generated
	 * @ordered
	 */
	protected int topRowsFrozen = TOP_ROWS_FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottomRowsFrozen() <em>Bottom Rows Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRowsFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final int BOTTOM_ROWS_FROZEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBottomRowsFrozen() <em>Bottom Rows Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRowsFrozen()
	 * @generated
	 * @ordered
	 */
	protected int bottomRowsFrozen = BOTTOM_ROWS_FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftColumnsFrozen() <em>Left Columns Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftColumnsFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_COLUMNS_FROZEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftColumnsFrozen() <em>Left Columns Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftColumnsFrozen()
	 * @generated
	 * @ordered
	 */
	protected int leftColumnsFrozen = LEFT_COLUMNS_FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightColumnsFrozen() <em>Right Columns Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightColumnsFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_COLUMNS_FROZEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightColumnsFrozen() <em>Right Columns Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightColumnsFrozen()
	 * @generated
	 * @ordered
	 */
	protected int rightColumnsFrozen = RIGHT_COLUMNS_FROZEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPackage.Literals.SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<Row>(Row.class, this, SpreadsheetPackage.SHEET__ROWS, SpreadsheetPackage.ROW__SHEET);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<Column>(Column.class, this, SpreadsheetPackage.SHEET__COLUMNS, SpreadsheetPackage.COLUMN__SHEET);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetName(String newSheetName) {
		String oldSheetName = sheetName;
		sheetName = newSheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__SHEET_NAME, oldSheetName, sheetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSheetIndex() {
		return sheetIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetIndex(int newSheetIndex) {
		int oldSheetIndex = sheetIndex;
		sheetIndex = newSheetIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__SHEET_INDEX, oldSheetIndex, sheetIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spreadsheet getSpreadsheet() {
		if (eContainerFeatureID() != SpreadsheetPackage.SHEET__SPREADSHEET) return null;
		return (Spreadsheet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpreadsheet(Spreadsheet newSpreadsheet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpreadsheet, SpreadsheetPackage.SHEET__SPREADSHEET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheet(Spreadsheet newSpreadsheet) {
		if (newSpreadsheet != eInternalContainer() || (eContainerFeatureID() != SpreadsheetPackage.SHEET__SPREADSHEET && newSpreadsheet != null)) {
			if (EcoreUtil.isAncestor(this, newSpreadsheet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpreadsheet != null)
				msgs = ((InternalEObject)newSpreadsheet).eInverseAdd(this, SpreadsheetPackage.SPREADSHEET__SHEETS, Spreadsheet.class, msgs);
			msgs = basicSetSpreadsheet(newSpreadsheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__SPREADSHEET, newSpreadsheet, newSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTopRowsFrozen() {
		return topRowsFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopRowsFrozen(int newTopRowsFrozen) {
		int oldTopRowsFrozen = topRowsFrozen;
		topRowsFrozen = newTopRowsFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__TOP_ROWS_FROZEN, oldTopRowsFrozen, topRowsFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBottomRowsFrozen() {
		return bottomRowsFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRowsFrozen(int newBottomRowsFrozen) {
		int oldBottomRowsFrozen = bottomRowsFrozen;
		bottomRowsFrozen = newBottomRowsFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__BOTTOM_ROWS_FROZEN, oldBottomRowsFrozen, bottomRowsFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeftColumnsFrozen() {
		return leftColumnsFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftColumnsFrozen(int newLeftColumnsFrozen) {
		int oldLeftColumnsFrozen = leftColumnsFrozen;
		leftColumnsFrozen = newLeftColumnsFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__LEFT_COLUMNS_FROZEN, oldLeftColumnsFrozen, leftColumnsFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightColumnsFrozen() {
		return rightColumnsFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightColumnsFrozen(int newRightColumnsFrozen) {
		int oldRightColumnsFrozen = rightColumnsFrozen;
		rightColumnsFrozen = newRightColumnsFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__RIGHT_COLUMNS_FROZEN, oldRightColumnsFrozen, rightColumnsFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Column getColumn(int columnindex) {
		for ( Column column : this.getColumns()){
			if ( column.getColumnIndex()==columnindex){
				return column;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Column createColumn(int index) {
		Column column = SpreadsheetFactory.eINSTANCE.createColumn();
		column.setColumnIndex(index);
		this.getColumns().add(column);
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Column getOrCreateColumn(int index) {
		Column column = this.getColumn(index);
		if ( column == null ){
			column = this.createColumn(index);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Column addColumn() {
		Optional<Integer> max_index = this.getColumns().stream()
				.map(c -> c.getColumnIndex())
				.max(Comparator.naturalOrder());
		int new_index = max_index.isPresent() ? max_index.get()+1 : 0;
		Column new_column = this.createColumn(new_index);
		return new_column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Row getRow(int index) {
		for ( Row row : this.getRows()){
			if ( row.getRowIndex()==index){
				return row;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Row createRow(int index) {
		Row row = SpreadsheetFactory.eINSTANCE.createRow();
		row.setRowIndex(index);
		this.getRows().add(row);
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Row getOrCreateRow(int index) {
		Row row = this.getRow(index);
		if ( row != null ) {
			row = this.createRow(index);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Row addRow() {
		Optional<Integer> max_index = this.getRows().stream()
				.map(c -> c.getRowIndex())
				.max(Comparator.naturalOrder());
		int new_index = max_index.isPresent() ? max_index.get()+1 : 0;
		Row new_row = this.createRow(new_index);
		return new_row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell getCell(Row row, Column column) {
		return row.getCell(column);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell createCell(Row row, Column column) {
		Cell cell = SpreadsheetFactory.eINSTANCE.createCell();
		cell.setRow(row);
		cell.setColumn(column);
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell getOrCreateCell(Row row, Column column) {
		Cell cell = this.getCell(row,  column);
		if ( cell == null ) {
			cell = this.createCell(row, column);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getRows().clear();
		this.getColumns().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void conformColumnIndex() {
		int columnIndex = 0;
		for ( Column column : this.getColumns()) {
			column.setColumnIndex(columnIndex);
			columnIndex++;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void conformRowIndex() {
		int rowIndex = 0;
		for ( Row row : this.getRows()) {
			row.setRowIndex(rowIndex);
			rowIndex++;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpreadsheetPackage.SHEET__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
			case SpreadsheetPackage.SHEET__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpreadsheet((Spreadsheet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpreadsheetPackage.SHEET__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
			case SpreadsheetPackage.SHEET__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				return basicSetSpreadsheet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				return eInternalContainer().eInverseRemove(this, SpreadsheetPackage.SPREADSHEET__SHEETS, Spreadsheet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpreadsheetPackage.SHEET__ROWS:
				return getRows();
			case SpreadsheetPackage.SHEET__COLUMNS:
				return getColumns();
			case SpreadsheetPackage.SHEET__SHEET_NAME:
				return getSheetName();
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				return getSheetIndex();
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				return getSpreadsheet();
			case SpreadsheetPackage.SHEET__TOP_ROWS_FROZEN:
				return getTopRowsFrozen();
			case SpreadsheetPackage.SHEET__BOTTOM_ROWS_FROZEN:
				return getBottomRowsFrozen();
			case SpreadsheetPackage.SHEET__LEFT_COLUMNS_FROZEN:
				return getLeftColumnsFrozen();
			case SpreadsheetPackage.SHEET__RIGHT_COLUMNS_FROZEN:
				return getRightColumnsFrozen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpreadsheetPackage.SHEET__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case SpreadsheetPackage.SHEET__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SpreadsheetPackage.SHEET__SHEET_NAME:
				setSheetName((String)newValue);
				return;
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				setSheetIndex((Integer)newValue);
				return;
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				setSpreadsheet((Spreadsheet)newValue);
				return;
			case SpreadsheetPackage.SHEET__TOP_ROWS_FROZEN:
				setTopRowsFrozen((Integer)newValue);
				return;
			case SpreadsheetPackage.SHEET__BOTTOM_ROWS_FROZEN:
				setBottomRowsFrozen((Integer)newValue);
				return;
			case SpreadsheetPackage.SHEET__LEFT_COLUMNS_FROZEN:
				setLeftColumnsFrozen((Integer)newValue);
				return;
			case SpreadsheetPackage.SHEET__RIGHT_COLUMNS_FROZEN:
				setRightColumnsFrozen((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpreadsheetPackage.SHEET__ROWS:
				getRows().clear();
				return;
			case SpreadsheetPackage.SHEET__COLUMNS:
				getColumns().clear();
				return;
			case SpreadsheetPackage.SHEET__SHEET_NAME:
				setSheetName(SHEET_NAME_EDEFAULT);
				return;
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				setSheetIndex(SHEET_INDEX_EDEFAULT);
				return;
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				setSpreadsheet((Spreadsheet)null);
				return;
			case SpreadsheetPackage.SHEET__TOP_ROWS_FROZEN:
				setTopRowsFrozen(TOP_ROWS_FROZEN_EDEFAULT);
				return;
			case SpreadsheetPackage.SHEET__BOTTOM_ROWS_FROZEN:
				setBottomRowsFrozen(BOTTOM_ROWS_FROZEN_EDEFAULT);
				return;
			case SpreadsheetPackage.SHEET__LEFT_COLUMNS_FROZEN:
				setLeftColumnsFrozen(LEFT_COLUMNS_FROZEN_EDEFAULT);
				return;
			case SpreadsheetPackage.SHEET__RIGHT_COLUMNS_FROZEN:
				setRightColumnsFrozen(RIGHT_COLUMNS_FROZEN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpreadsheetPackage.SHEET__ROWS:
				return rows != null && !rows.isEmpty();
			case SpreadsheetPackage.SHEET__COLUMNS:
				return columns != null && !columns.isEmpty();
			case SpreadsheetPackage.SHEET__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? sheetName != null : !SHEET_NAME_EDEFAULT.equals(sheetName);
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				return sheetIndex != SHEET_INDEX_EDEFAULT;
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				return getSpreadsheet() != null;
			case SpreadsheetPackage.SHEET__TOP_ROWS_FROZEN:
				return topRowsFrozen != TOP_ROWS_FROZEN_EDEFAULT;
			case SpreadsheetPackage.SHEET__BOTTOM_ROWS_FROZEN:
				return bottomRowsFrozen != BOTTOM_ROWS_FROZEN_EDEFAULT;
			case SpreadsheetPackage.SHEET__LEFT_COLUMNS_FROZEN:
				return leftColumnsFrozen != LEFT_COLUMNS_FROZEN_EDEFAULT;
			case SpreadsheetPackage.SHEET__RIGHT_COLUMNS_FROZEN:
				return rightColumnsFrozen != RIGHT_COLUMNS_FROZEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpreadsheetPackage.SHEET___GET_ROW__INT:
				return getRow((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___CREATE_ROW__INT:
				return createRow((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___GET_OR_CREATE_ROW__INT:
				return getOrCreateRow((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___ADD_ROW:
				return addRow();
			case SpreadsheetPackage.SHEET___GET_COLUMN__INT:
				return getColumn((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___CREATE_COLUMN__INT:
				return createColumn((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___GET_OR_CREATE_COLUMN__INT:
				return getOrCreateColumn((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___ADD_COLUMN:
				return addColumn();
			case SpreadsheetPackage.SHEET___GET_CELL__ROW_COLUMN:
				return getCell((Row)arguments.get(0), (Column)arguments.get(1));
			case SpreadsheetPackage.SHEET___CREATE_CELL__ROW_COLUMN:
				return createCell((Row)arguments.get(0), (Column)arguments.get(1));
			case SpreadsheetPackage.SHEET___GET_OR_CREATE_CELL__ROW_COLUMN:
				return getOrCreateCell((Row)arguments.get(0), (Column)arguments.get(1));
			case SpreadsheetPackage.SHEET___FLUSH:
				flush();
				return null;
			case SpreadsheetPackage.SHEET___CONFORM_COLUMN_INDEX:
				conformColumnIndex();
				return null;
			case SpreadsheetPackage.SHEET___CONFORM_ROW_INDEX:
				conformRowIndex();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (SheetName: ");
		result.append(sheetName);
		result.append(", SheetIndex: ");
		result.append(sheetIndex);
		result.append(", TopRowsFrozen: ");
		result.append(topRowsFrozen);
		result.append(", BottomRowsFrozen: ");
		result.append(bottomRowsFrozen);
		result.append(", LeftColumnsFrozen: ");
		result.append(leftColumnsFrozen);
		result.append(", RightColumnsFrozen: ");
		result.append(rightColumnsFrozen);
		result.append(')');
		return result.toString();
	}

} //SheetImpl
