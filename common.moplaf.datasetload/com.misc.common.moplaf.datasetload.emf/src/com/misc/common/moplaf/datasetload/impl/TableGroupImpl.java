/**
 */
package com.misc.common.moplaf.datasetload.impl;

import com.misc.common.moplaf.datasetload.DataSource;
import com.misc.common.moplaf.datasetload.DatasetloadPackage;
import com.misc.common.moplaf.datasetload.Table;
import com.misc.common.moplaf.datasetload.TableGroup;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableGroupImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.TableGroupImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TableGroupImpl extends MinimalEObjectImpl.Container implements TableGroup {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetloadPackage.Literals.TABLE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.TABLE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Table> getTables() {
		EList<Table> newList = new EObjectEList<Table>(Table.class, this, DatasetloadPackage.TABLE_GROUP__TABLES);
		for ( EObject element : this.eContents()){
			if ( element instanceof Table){
				newList.add((Table)element);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		DataSource dataSource = basicGetDataSource();
		return dataSource != null && dataSource.eIsProxy() ? (DataSource)eResolveProxy((InternalEObject)dataSource) : dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataSource basicGetDataSource() {
		if ( !(this.eContainer() instanceof DataSource) ){
			throw new RuntimeException("Table: the owner must be a DataSource, or the specialisation must implement the navigation to the datasource");
		}
		return (DataSource)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void load() {
		for ( Table table : this.getTables()){
			table.load();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		for ( Table table : this.getTables()){
			table.refresh();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetloadPackage.TABLE_GROUP__NAME:
				return getName();
			case DatasetloadPackage.TABLE_GROUP__TABLES:
				return getTables();
			case DatasetloadPackage.TABLE_GROUP__DATA_SOURCE:
				if (resolve) return getDataSource();
				return basicGetDataSource();
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
			case DatasetloadPackage.TABLE_GROUP__NAME:
				setName((String)newValue);
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
			case DatasetloadPackage.TABLE_GROUP__NAME:
				setName(NAME_EDEFAULT);
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
			case DatasetloadPackage.TABLE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatasetloadPackage.TABLE_GROUP__TABLES:
				return !getTables().isEmpty();
			case DatasetloadPackage.TABLE_GROUP__DATA_SOURCE:
				return basicGetDataSource() != null;
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
			case DatasetloadPackage.TABLE_GROUP___LOAD:
				load();
				return null;
			case DatasetloadPackage.TABLE_GROUP___REFRESH:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableGroupImpl
