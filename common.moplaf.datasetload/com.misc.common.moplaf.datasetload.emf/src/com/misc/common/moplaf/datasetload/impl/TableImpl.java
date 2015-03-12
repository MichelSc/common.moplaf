/**
 */
package com.misc.common.moplaf.datasetload.impl;

import com.misc.common.moplaf.datasetload.DatasetloadPackage;
import com.misc.common.moplaf.datasetload.DataSource;
import com.misc.common.moplaf.datasetload.Table;
import com.misc.common.moplaf.datasetload.TableGroup;
import com.misc.common.moplaf.datasetload.TableRow;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getTableGroup <em>Table Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getParamTableGroupAttributes <em>Param Table Group Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getSQLStatement <em>SQL Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes <em>Column Table Row Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getLastLoad <em>Last Load</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableImpl#getNumberOfRows <em>Number Of Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TableImpl extends MinimalEObjectImpl.Container implements Table {

	protected HashMap<TableRowKeyImpl, TableRow> rowIndex = null;
	
	protected Map<TableRowKeyImpl, TableRow> getRowIndex(){
		if ( this.rowIndex==null){
			this.rowIndex = new HashMap<TableRowKeyImpl, TableRow>();
			for ( TableRow row : this.getRows()){
				this.rowIndex.put(row.getKey(), row);
			}
		}
		return this.rowIndex;
	}

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSQLStatement() <em>SQL Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_STATEMENT_EDEFAULT = null;
	
	/**
	 * The default value of the '{@link #getLastLoad() <em>Last Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoad()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoad() <em>Last Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoad()
	 * @generated
	 * @ordered
	 */
	protected Date lastLoad = LAST_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRows() <em>Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRows()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRows() <em>Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRows()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRows = NUMBER_OF_ROWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetloadPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<TableRow> getRows() {
		EList<TableRow> newList = new EObjectEList<TableRow>(TableRow.class, this, DatasetloadPackage.TABLE__ROWS);
		for ( EObject element : this.eContents()){
			if ( element instanceof TableRow){
				newList.add((TableRow)element);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getColumnTableRowAttributes() {
		// TODO: implement this method to return the 'Column Table Row Attributes' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableGroup getTableGroup() {
		TableGroup tableGroup = basicGetTableGroup();
		return tableGroup != null && tableGroup.eIsProxy() ? (TableGroup)eResolveProxy((InternalEObject)tableGroup) : tableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableGroup basicGetTableGroup() {
		if ( !(this.eContainer() instanceof TableGroup) ){
			throw new RuntimeException("Table: the owner must be a TableGroup");
		}
		return (TableGroup)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSQLStatement() {
		// TODO: implement this method to return the 'SQL Statement' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getParamTableGroupAttributes()
	 */
	@Override
	public EList<EAttribute> getParamTableGroupAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		return columnAttributes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getKeyColumns() {
		// TODO: implement this method to return the 'Key Columns' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastLoad() {
		return lastLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLoad(Date newLastLoad) {
		Date oldLastLoad = lastLoad;
		lastLoad = newLastLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.TABLE__LAST_LOAD, oldLastLoad, lastLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRows() {
		return numberOfRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRows(int newNumberOfRows) {
		int oldNumberOfRows = numberOfRows;
		numberOfRows = newNumberOfRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.TABLE__NUMBER_OF_ROWS, oldNumberOfRows, numberOfRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow newRow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addRow(TableRow row) {
		if ( TableImpl.this.rowIndex!=null){
			TableImpl.this.getRowIndex().put(row.getKey(), row);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableRow getRow(TableRowKeyImpl key) {
		TableRow row = this.getRowIndex().get(key);
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeRow(TableRow row) {
		if ( TableImpl.this.rowIndex!=null){
			TableImpl.this.getRowIndex().remove(row.getKey());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		CommonPlugin.INSTANCE.log("Refresh table "+this.getName()+" started");
		for ( TableRow row : this.getRows()){
			row.refresh();
		}
		CommonPlugin.INSTANCE.log("Refresh table "+this.getName()+" complete");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void load() {
		TableGroup tableGroup = this.getTableGroup();
		DataSource dataSource = tableGroup.getDataSource();
		dataSource.loadTableImpl(this);
    }


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetloadPackage.TABLE__NAME:
				return getName();
			case DatasetloadPackage.TABLE__TABLE_GROUP:
				if (resolve) return getTableGroup();
				return basicGetTableGroup();
			case DatasetloadPackage.TABLE__ROWS:
				return getRows();
			case DatasetloadPackage.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES:
				return getParamTableGroupAttributes();
			case DatasetloadPackage.TABLE__SQL_STATEMENT:
				return getSQLStatement();
			case DatasetloadPackage.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES:
				return getColumnTableRowAttributes();
			case DatasetloadPackage.TABLE__KEY_COLUMNS:
				return getKeyColumns();
			case DatasetloadPackage.TABLE__LAST_LOAD:
				return getLastLoad();
			case DatasetloadPackage.TABLE__NUMBER_OF_ROWS:
				return getNumberOfRows();
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
			case DatasetloadPackage.TABLE__LAST_LOAD:
				setLastLoad((Date)newValue);
				return;
			case DatasetloadPackage.TABLE__NUMBER_OF_ROWS:
				setNumberOfRows((Integer)newValue);
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
			case DatasetloadPackage.TABLE__LAST_LOAD:
				setLastLoad(LAST_LOAD_EDEFAULT);
				return;
			case DatasetloadPackage.TABLE__NUMBER_OF_ROWS:
				setNumberOfRows(NUMBER_OF_ROWS_EDEFAULT);
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
			case DatasetloadPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DatasetloadPackage.TABLE__TABLE_GROUP:
				return basicGetTableGroup() != null;
			case DatasetloadPackage.TABLE__ROWS:
				return !getRows().isEmpty();
			case DatasetloadPackage.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES:
				return !getParamTableGroupAttributes().isEmpty();
			case DatasetloadPackage.TABLE__SQL_STATEMENT:
				return SQL_STATEMENT_EDEFAULT == null ? getSQLStatement() != null : !SQL_STATEMENT_EDEFAULT.equals(getSQLStatement());
			case DatasetloadPackage.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES:
				return !getColumnTableRowAttributes().isEmpty();
			case DatasetloadPackage.TABLE__KEY_COLUMNS:
				return !getKeyColumns().isEmpty();
			case DatasetloadPackage.TABLE__LAST_LOAD:
				return LAST_LOAD_EDEFAULT == null ? lastLoad != null : !LAST_LOAD_EDEFAULT.equals(lastLoad);
			case DatasetloadPackage.TABLE__NUMBER_OF_ROWS:
				return numberOfRows != NUMBER_OF_ROWS_EDEFAULT;
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
			case DatasetloadPackage.TABLE___LOAD:
				load();
				return null;
			case DatasetloadPackage.TABLE___NEW_ROW:
				return newRow();
			case DatasetloadPackage.TABLE___ADD_ROW__TABLEROW:
				addRow((TableRow)arguments.get(0));
				return null;
			case DatasetloadPackage.TABLE___GET_ROW__TABLEROWKEYIMPL:
				return getRow((TableRowKeyImpl)arguments.get(0));
			case DatasetloadPackage.TABLE___REMOVE_ROW__TABLEROW:
				removeRow((TableRow)arguments.get(0));
				return null;
			case DatasetloadPackage.TABLE___REFRESH:
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
		result.append(" (LastLoad: ");
		result.append(lastLoad);
		result.append(", NumberOfRows: ");
		result.append(numberOfRows);
		result.append(')');
		return result.toString();
	}

} //TableImpl
