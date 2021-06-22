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
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl#getRowName <em>Row Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends MinimalEObjectImpl.Container implements Row {
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

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
	 * The default value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected int rowIndex = ROW_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowName() <em>Row Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowName() <em>Row Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowName()
	 * @generated
	 * @ordered
	 */
	protected String rowName = ROW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentWithInverseEList<Cell>(Cell.class, this, SpreadsheetPackage.ROW__CELLS, SpreadsheetPackage.CELL__ROW);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sheet getSheet() {
		if (eContainerFeatureID() != SpreadsheetPackage.ROW__SHEET) return null;
		return (Sheet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheet(Sheet newSheet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSheet, SpreadsheetPackage.ROW__SHEET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSheet(Sheet newSheet) {
		if (newSheet != eInternalContainer() || (eContainerFeatureID() != SpreadsheetPackage.ROW__SHEET && newSheet != null)) {
			if (EcoreUtil.isAncestor(this, newSheet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSheet != null)
				msgs = ((InternalEObject)newSheet).eInverseAdd(this, SpreadsheetPackage.SHEET__ROWS, Sheet.class, msgs);
			msgs = basicSetSheet(newSheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.ROW__SHEET, newSheet, newSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String name = this.getRowName()== null ? "" : this.getRowName();
		String description = String.format("%s(%d)", name, this.getRowIndex());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRowIndex() {
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowIndex(int newRowIndex) {
		int oldRowIndex = rowIndex;
		rowIndex = newRowIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.ROW__ROW_INDEX, oldRowIndex, rowIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRowName() {
		return rowName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowName(String newRowName) {
		String oldRowName = rowName;
		rowName = newRowName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.ROW__ROW_NAME, oldRowName, rowName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell getCell(int columnindex) {
		return this.getCells()
				.stream()
				.filter(c -> c.getColumn().getColumnIndex()==columnindex)
				.findAny()
				.orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell getCell(Column column) {
		return this.getCells()
				.stream()
				.filter(c -> c.getColumn()==column)
				.findAny()
				.orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@Override
	public Cell getCell(String name) {
		return this.getCells()
				.stream()
				.filter(c -> c.getColumn().getColumnName().equals(name))
				.findAny()
				.orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell lookUp(String value) {
		for ( Cell cell : this.getCells()) {
			if ( cell.getCellType()==CellType.CELL_TYPE_STRING ){
				if ( cell.getStringValue().equals(value)) {
					return cell;
				}
			}
		}
		return null;
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
			case SpreadsheetPackage.ROW__CELLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCells()).basicAdd(otherEnd, msgs);
			case SpreadsheetPackage.ROW__SHEET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSheet((Sheet)otherEnd, msgs);
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
			case SpreadsheetPackage.ROW__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
			case SpreadsheetPackage.ROW__SHEET:
				return basicSetSheet(null, msgs);
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
			case SpreadsheetPackage.ROW__SHEET:
				return eInternalContainer().eInverseRemove(this, SpreadsheetPackage.SHEET__ROWS, Sheet.class, msgs);
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
			case SpreadsheetPackage.ROW__CELLS:
				return getCells();
			case SpreadsheetPackage.ROW__SHEET:
				return getSheet();
			case SpreadsheetPackage.ROW__DESCRIPTION:
				return getDescription();
			case SpreadsheetPackage.ROW__ROW_INDEX:
				return getRowIndex();
			case SpreadsheetPackage.ROW__ROW_NAME:
				return getRowName();
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
			case SpreadsheetPackage.ROW__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
				return;
			case SpreadsheetPackage.ROW__SHEET:
				setSheet((Sheet)newValue);
				return;
			case SpreadsheetPackage.ROW__ROW_INDEX:
				setRowIndex((Integer)newValue);
				return;
			case SpreadsheetPackage.ROW__ROW_NAME:
				setRowName((String)newValue);
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
			case SpreadsheetPackage.ROW__CELLS:
				getCells().clear();
				return;
			case SpreadsheetPackage.ROW__SHEET:
				setSheet((Sheet)null);
				return;
			case SpreadsheetPackage.ROW__ROW_INDEX:
				setRowIndex(ROW_INDEX_EDEFAULT);
				return;
			case SpreadsheetPackage.ROW__ROW_NAME:
				setRowName(ROW_NAME_EDEFAULT);
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
			case SpreadsheetPackage.ROW__CELLS:
				return cells != null && !cells.isEmpty();
			case SpreadsheetPackage.ROW__SHEET:
				return getSheet() != null;
			case SpreadsheetPackage.ROW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SpreadsheetPackage.ROW__ROW_INDEX:
				return rowIndex != ROW_INDEX_EDEFAULT;
			case SpreadsheetPackage.ROW__ROW_NAME:
				return ROW_NAME_EDEFAULT == null ? rowName != null : !ROW_NAME_EDEFAULT.equals(rowName);
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
			case SpreadsheetPackage.ROW___GET_CELL__INT:
				return getCell((Integer)arguments.get(0));
			case SpreadsheetPackage.ROW___GET_CELL__COLUMN:
				return getCell((Column)arguments.get(0));
			case SpreadsheetPackage.ROW___GET_CELL__STRING:
				return getCell((String)arguments.get(0));
			case SpreadsheetPackage.ROW___LOOK_UP__STRING:
				return lookUp((String)arguments.get(0));
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (RowIndex: ");
		result.append(rowIndex);
		result.append(", RowName: ");
		result.append(rowName);
		result.append(')');
		return result.toString();
	}

} //RowImpl
