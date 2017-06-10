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
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getRow <em>Row</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getValueFormatted <em>Value Formatted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getCellType <em>Cell Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValueFormatted() <em>Value Formatted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormatted()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMATTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormatted() <em>Value Formatted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormatted()
	 * @generated
	 * @ordered
	 */
	protected String valueFormatted = VALUE_FORMATTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellType()
	 * @generated
	 * @ordered
	 */
	protected static final CellType CELL_TYPE_EDEFAULT = CellType.CELL_TYPE_NUMERIC;

	/**
	 * The cached value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellType()
	 * @generated
	 * @ordered
	 */
	protected CellType cellType = CELL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected double doubleValue = DOUBLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row getRow() {
		if (eContainerFeatureID() != SpreadsheetPackage.CELL__ROW) return null;
		return (Row)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(Row newRow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRow, SpreadsheetPackage.CELL__ROW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(Row newRow) {
		if (newRow != eInternalContainer() || (eContainerFeatureID() != SpreadsheetPackage.CELL__ROW && newRow != null)) {
			if (EcoreUtil.isAncestor(this, newRow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRow != null)
				msgs = ((InternalEObject)newRow).eInverseAdd(this, SpreadsheetPackage.ROW__CELLS, Row.class, msgs);
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__ROW, newRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (Column)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpreadsheetPackage.CELL__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, SpreadsheetPackage.COLUMN__CELLS, Column.class, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, SpreadsheetPackage.COLUMN__CELLS, Column.class, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFormatted() {
		return valueFormatted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFormatted(String newValueFormatted) {
		String oldValueFormatted = valueFormatted;
		valueFormatted = newValueFormatted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__VALUE_FORMATTED, oldValueFormatted, valueFormatted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellType getCellType() {
		return cellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellType(CellType newCellType) {
		CellType oldCellType = cellType;
		cellType = newCellType == null ? CELL_TYPE_EDEFAULT : newCellType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__CELL_TYPE, oldCellType, cellType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDoubleValue() {
		return doubleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleValue(double newDoubleValue) {
		double oldDoubleValue = doubleValue;
		doubleValue = newDoubleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__DOUBLE_VALUE, oldDoubleValue, doubleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.CELL__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("(%d,%d)", 
				                           this.getRow().getRowIndex(),
				                           this.getColumn().getColumnIndex());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpreadsheetPackage.CELL__ROW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRow((Row)otherEnd, msgs);
			case SpreadsheetPackage.CELL__COLUMN:
				if (column != null)
					msgs = ((InternalEObject)column).eInverseRemove(this, SpreadsheetPackage.COLUMN__CELLS, Column.class, msgs);
				return basicSetColumn((Column)otherEnd, msgs);
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
			case SpreadsheetPackage.CELL__ROW:
				return basicSetRow(null, msgs);
			case SpreadsheetPackage.CELL__COLUMN:
				return basicSetColumn(null, msgs);
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
			case SpreadsheetPackage.CELL__ROW:
				return eInternalContainer().eInverseRemove(this, SpreadsheetPackage.ROW__CELLS, Row.class, msgs);
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
			case SpreadsheetPackage.CELL__ROW:
				return getRow();
			case SpreadsheetPackage.CELL__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case SpreadsheetPackage.CELL__DESCRIPTION:
				return getDescription();
			case SpreadsheetPackage.CELL__VALUE_FORMATTED:
				return getValueFormatted();
			case SpreadsheetPackage.CELL__CELL_TYPE:
				return getCellType();
			case SpreadsheetPackage.CELL__DOUBLE_VALUE:
				return getDoubleValue();
			case SpreadsheetPackage.CELL__STRING_VALUE:
				return getStringValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpreadsheetPackage.CELL__ROW:
				setRow((Row)newValue);
				return;
			case SpreadsheetPackage.CELL__COLUMN:
				setColumn((Column)newValue);
				return;
			case SpreadsheetPackage.CELL__VALUE_FORMATTED:
				setValueFormatted((String)newValue);
				return;
			case SpreadsheetPackage.CELL__CELL_TYPE:
				setCellType((CellType)newValue);
				return;
			case SpreadsheetPackage.CELL__DOUBLE_VALUE:
				setDoubleValue((Double)newValue);
				return;
			case SpreadsheetPackage.CELL__STRING_VALUE:
				setStringValue((String)newValue);
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
			case SpreadsheetPackage.CELL__ROW:
				setRow((Row)null);
				return;
			case SpreadsheetPackage.CELL__COLUMN:
				setColumn((Column)null);
				return;
			case SpreadsheetPackage.CELL__VALUE_FORMATTED:
				setValueFormatted(VALUE_FORMATTED_EDEFAULT);
				return;
			case SpreadsheetPackage.CELL__CELL_TYPE:
				setCellType(CELL_TYPE_EDEFAULT);
				return;
			case SpreadsheetPackage.CELL__DOUBLE_VALUE:
				setDoubleValue(DOUBLE_VALUE_EDEFAULT);
				return;
			case SpreadsheetPackage.CELL__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
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
			case SpreadsheetPackage.CELL__ROW:
				return getRow() != null;
			case SpreadsheetPackage.CELL__COLUMN:
				return column != null;
			case SpreadsheetPackage.CELL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SpreadsheetPackage.CELL__VALUE_FORMATTED:
				return VALUE_FORMATTED_EDEFAULT == null ? valueFormatted != null : !VALUE_FORMATTED_EDEFAULT.equals(valueFormatted);
			case SpreadsheetPackage.CELL__CELL_TYPE:
				return cellType != CELL_TYPE_EDEFAULT;
			case SpreadsheetPackage.CELL__DOUBLE_VALUE:
				return doubleValue != DOUBLE_VALUE_EDEFAULT;
			case SpreadsheetPackage.CELL__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
		}
		return super.eIsSet(featureID);
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
		result.append(" (ValueFormatted: ");
		result.append(valueFormatted);
		result.append(", CellType: ");
		result.append(cellType);
		result.append(", DoubleValue: ");
		result.append(doubleValue);
		result.append(", StringValue: ");
		result.append(stringValue);
		result.append(')');
		return result.toString();
	}

} //CellImpl
