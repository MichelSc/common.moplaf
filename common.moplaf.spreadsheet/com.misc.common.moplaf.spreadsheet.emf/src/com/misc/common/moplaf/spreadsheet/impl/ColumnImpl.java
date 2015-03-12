/**
 */
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.Cell;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.ColumnImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.ColumnImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.ColumnImpl#getColumnIndex <em>Column Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cell;

	/**
	 * The default value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected int columnIndex = COLUMN_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCell() {
		if (cell == null) {
			cell = new EObjectWithInverseResolvingEList<Cell>(Cell.class, this, SpreadsheetPackage.COLUMN__CELL, SpreadsheetPackage.CELL__COLUMN);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet getSheet() {
		if (eContainerFeatureID() != SpreadsheetPackage.COLUMN__SHEET) return null;
		return (Sheet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheet(Sheet newSheet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSheet, SpreadsheetPackage.COLUMN__SHEET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(Sheet newSheet) {
		if (newSheet != eInternalContainer() || (eContainerFeatureID() != SpreadsheetPackage.COLUMN__SHEET && newSheet != null)) {
			if (EcoreUtil.isAncestor(this, newSheet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSheet != null)
				msgs = ((InternalEObject)newSheet).eInverseAdd(this, SpreadsheetPackage.SHEET__COLUMN, Sheet.class, msgs);
			msgs = basicSetSheet(newSheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.COLUMN__SHEET, newSheet, newSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnIndex() {
		return columnIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnIndex(int newColumnIndex) {
		int oldColumnIndex = columnIndex;
		columnIndex = newColumnIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.COLUMN__COLUMN_INDEX, oldColumnIndex, columnIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell getCell(int rowindex) {
		for ( Cell cell : this.getCell()){
			if ( cell.getRow().getRowIndex()==rowindex){
				return cell;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Cell getCell(Row row) {
		return this.getCell(row.getRowIndex());
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
			case SpreadsheetPackage.COLUMN__CELL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCell()).basicAdd(otherEnd, msgs);
			case SpreadsheetPackage.COLUMN__SHEET:
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
			case SpreadsheetPackage.COLUMN__CELL:
				return ((InternalEList<?>)getCell()).basicRemove(otherEnd, msgs);
			case SpreadsheetPackage.COLUMN__SHEET:
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
			case SpreadsheetPackage.COLUMN__SHEET:
				return eInternalContainer().eInverseRemove(this, SpreadsheetPackage.SHEET__COLUMN, Sheet.class, msgs);
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
			case SpreadsheetPackage.COLUMN__CELL:
				return getCell();
			case SpreadsheetPackage.COLUMN__SHEET:
				return getSheet();
			case SpreadsheetPackage.COLUMN__COLUMN_INDEX:
				return getColumnIndex();
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
			case SpreadsheetPackage.COLUMN__CELL:
				getCell().clear();
				getCell().addAll((Collection<? extends Cell>)newValue);
				return;
			case SpreadsheetPackage.COLUMN__SHEET:
				setSheet((Sheet)newValue);
				return;
			case SpreadsheetPackage.COLUMN__COLUMN_INDEX:
				setColumnIndex((Integer)newValue);
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
			case SpreadsheetPackage.COLUMN__CELL:
				getCell().clear();
				return;
			case SpreadsheetPackage.COLUMN__SHEET:
				setSheet((Sheet)null);
				return;
			case SpreadsheetPackage.COLUMN__COLUMN_INDEX:
				setColumnIndex(COLUMN_INDEX_EDEFAULT);
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
			case SpreadsheetPackage.COLUMN__CELL:
				return cell != null && !cell.isEmpty();
			case SpreadsheetPackage.COLUMN__SHEET:
				return getSheet() != null;
			case SpreadsheetPackage.COLUMN__COLUMN_INDEX:
				return columnIndex != COLUMN_INDEX_EDEFAULT;
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
			case SpreadsheetPackage.COLUMN___GET_CELL__INT:
				return getCell((Integer)arguments.get(0));
			case SpreadsheetPackage.COLUMN___GET_CELL__ROW:
				return getCell((Row)arguments.get(0));
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
		result.append(" (ColumnIndex: ");
		result.append(columnIndex);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
