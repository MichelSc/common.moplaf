/**
 */
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
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
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getRow <em>Row</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getSheetIndex <em>Sheet Index</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SheetImpl extends MinimalEObjectImpl.Container implements Sheet {
	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> row;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

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
	public EList<Row> getRow() {
		if (row == null) {
			row = new EObjectContainmentWithInverseEList<Row>(Row.class, this, SpreadsheetPackage.SHEET__ROW, SpreadsheetPackage.ROW__SHEET);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentWithInverseEList<Column>(Column.class, this, SpreadsheetPackage.SHEET__COLUMN, SpreadsheetPackage.COLUMN__SHEET);
		}
		return column;
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
				msgs = ((InternalEObject)newSpreadsheet).eInverseAdd(this, SpreadsheetPackage.SPREADSHEET__SHEET, Spreadsheet.class, msgs);
			msgs = basicSetSpreadsheet(newSpreadsheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SHEET__SPREADSHEET, newSpreadsheet, newSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Column getColumn(int columnindex) {
		for ( Column column : this.getColumn()){
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
	public Row getRow(int rowindex) {
		for ( Row row : this.getRow()){
			if ( row.getRowIndex()==rowindex){
				return row;
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
			case SpreadsheetPackage.SHEET__ROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRow()).basicAdd(otherEnd, msgs);
			case SpreadsheetPackage.SHEET__COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumn()).basicAdd(otherEnd, msgs);
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
			case SpreadsheetPackage.SHEET__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
			case SpreadsheetPackage.SHEET__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, SpreadsheetPackage.SPREADSHEET__SHEET, Spreadsheet.class, msgs);
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
			case SpreadsheetPackage.SHEET__ROW:
				return getRow();
			case SpreadsheetPackage.SHEET__COLUMN:
				return getColumn();
			case SpreadsheetPackage.SHEET__SHEET_NAME:
				return getSheetName();
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				return getSheetIndex();
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				return getSpreadsheet();
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
			case SpreadsheetPackage.SHEET__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends Row>)newValue);
				return;
			case SpreadsheetPackage.SHEET__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
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
			case SpreadsheetPackage.SHEET__ROW:
				getRow().clear();
				return;
			case SpreadsheetPackage.SHEET__COLUMN:
				getColumn().clear();
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
			case SpreadsheetPackage.SHEET__ROW:
				return row != null && !row.isEmpty();
			case SpreadsheetPackage.SHEET__COLUMN:
				return column != null && !column.isEmpty();
			case SpreadsheetPackage.SHEET__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? sheetName != null : !SHEET_NAME_EDEFAULT.equals(sheetName);
			case SpreadsheetPackage.SHEET__SHEET_INDEX:
				return sheetIndex != SHEET_INDEX_EDEFAULT;
			case SpreadsheetPackage.SHEET__SPREADSHEET:
				return getSpreadsheet() != null;
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
			case SpreadsheetPackage.SHEET___GET_COLUMN__INT:
				return getColumn((Integer)arguments.get(0));
			case SpreadsheetPackage.SHEET___GET_ROW__INT:
				return getRow((Integer)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //SheetImpl
