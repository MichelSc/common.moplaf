/**
 */
package com.misc.common.moplaf.datasetload.impl;

import com.misc.common.moplaf.datasetload.DatasetloadPackage;
import com.misc.common.moplaf.datasetload.Table;
import com.misc.common.moplaf.datasetload.TableRow;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableRowImpl#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableRowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableRowImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableRowImpl#isNewRow <em>New Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TableRowImpl extends MinimalEObjectImpl.Container implements TableRow {
	/**
	 * The default value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected int rowNumber = ROW_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final TableRowKeyImpl KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isNewRow() <em>New Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewRow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_ROW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNewRow() <em>New Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewRow()
	 * @generated
	 * @ordered
	 */
	protected boolean newRow = NEW_ROW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetloadPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowNumber() {
		return rowNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowNumber(int newRowNumber) {
		int oldRowNumber = rowNumber;
		rowNumber = newRowNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.TABLE_ROW__ROW_NUMBER, oldRowNumber, rowNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		Table table = basicGetTable();
		return table != null && table.eIsProxy() ? (Table)eResolveProxy((InternalEObject)table) : table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Table basicGetTable() {
		if ( !(this.eContainer() instanceof Table) ){
			throw new RuntimeException("TableRow: the owner must be a Table");
		}
		return (Table)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableRowKeyImpl getKey() {
		Table table = this.getTable();
		EList<EAttribute> columnAttributes = table.getColumnTableRowAttributes();
		EList<Integer> keyColumns = table.getKeyColumns();
		Object[] key = new Object[keyColumns.size()];
		int keyindex = 0;
		for ( Integer columnIndex : keyColumns){
			EAttribute attribute = columnAttributes.get(columnIndex);
			Object attributeValue = this.eGet(attribute);
			key[keyindex] = attributeValue;
			keyindex++;
		}
		TableRowKeyImpl  thekey = new TableRowKeyImpl(key);
		  
		return thekey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNewRow() {
		return newRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRow(boolean newNewRow) {
		boolean oldNewRow = newRow;
		newRow = newNewRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.TABLE_ROW__NEW_ROW, oldNewRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetloadPackage.TABLE_ROW__ROW_NUMBER:
				return getRowNumber();
			case DatasetloadPackage.TABLE_ROW__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case DatasetloadPackage.TABLE_ROW__KEY:
				return getKey();
			case DatasetloadPackage.TABLE_ROW__NEW_ROW:
				return isNewRow();
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
			case DatasetloadPackage.TABLE_ROW__ROW_NUMBER:
				setRowNumber((Integer)newValue);
				return;
			case DatasetloadPackage.TABLE_ROW__NEW_ROW:
				setNewRow((Boolean)newValue);
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
			case DatasetloadPackage.TABLE_ROW__ROW_NUMBER:
				setRowNumber(ROW_NUMBER_EDEFAULT);
				return;
			case DatasetloadPackage.TABLE_ROW__NEW_ROW:
				setNewRow(NEW_ROW_EDEFAULT);
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
			case DatasetloadPackage.TABLE_ROW__ROW_NUMBER:
				return rowNumber != ROW_NUMBER_EDEFAULT;
			case DatasetloadPackage.TABLE_ROW__TABLE:
				return basicGetTable() != null;
			case DatasetloadPackage.TABLE_ROW__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case DatasetloadPackage.TABLE_ROW__NEW_ROW:
				return newRow != NEW_ROW_EDEFAULT;
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
			case DatasetloadPackage.TABLE_ROW___REFRESH:
				refresh();
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
		result.append(" (RowNumber: ");
		result.append(rowNumber);
		result.append(", NewRow: ");
		result.append(newRow);
		result.append(')');
		return result.toString();
	}

} //TableRowImpl
