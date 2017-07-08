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
package com.misc.common.moplaf.dbsynch.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DataSourceImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DataSourceImpl#isAutoCommit <em>Auto Commit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataSourceImpl extends DbSynchUnitAbstractImpl implements DataSource {
	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoCommit() <em>Auto Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCommit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_COMMIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoCommit() <em>Auto Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCommit()
	 * @generated
	 * @ordered
	 */
	protected boolean autoCommit = AUTO_COMMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbSynchPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataSource basicGetDataSource() {
		return this;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.DATA_SOURCE__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoCommit() {
		return autoCommit;
	}

	/**
	 * 
	 */
	protected void onAutoCommitChange(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setAutoCommit(boolean newAutoCommit) {
		boolean oldAutoCommit = autoCommit;
		autoCommit = newAutoCommit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.DATA_SOURCE__AUTO_COMMIT, oldAutoCommit, autoCommit));
		if ( oldAutoCommit!=newAutoCommit){
			this.onAutoCommitChange();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback disconnect() {
		return new ReturnFeedback(false, "DataSource.disconnect: not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback commit() {
		return new ReturnFeedback(false, "DataSource.commit: not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback rollback() {
		return new ReturnFeedback(false, "DataSource.rollback: not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnFeedback synchDownTableImpl(Table table) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnFeedback synchUpTableImpl(Table table) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback connect() {
		return new ReturnFeedback(false, "DataSource.connect: not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.DATA_SOURCE__CONNECTED:
				return isConnected();
			case DbSynchPackage.DATA_SOURCE__AUTO_COMMIT:
				return isAutoCommit();
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
			case DbSynchPackage.DATA_SOURCE__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case DbSynchPackage.DATA_SOURCE__AUTO_COMMIT:
				setAutoCommit((Boolean)newValue);
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
			case DbSynchPackage.DATA_SOURCE__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case DbSynchPackage.DATA_SOURCE__AUTO_COMMIT:
				setAutoCommit(AUTO_COMMIT_EDEFAULT);
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
			case DbSynchPackage.DATA_SOURCE__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case DbSynchPackage.DATA_SOURCE__AUTO_COMMIT:
				return autoCommit != AUTO_COMMIT_EDEFAULT;
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
			case DbSynchPackage.DATA_SOURCE___CONNECT:
				return connect();
			case DbSynchPackage.DATA_SOURCE___DISCONNECT:
				return disconnect();
			case DbSynchPackage.DATA_SOURCE___COMMIT:
				return commit();
			case DbSynchPackage.DATA_SOURCE___ROLLBACK:
				return rollback();
			case DbSynchPackage.DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE:
				return synchDownTableImpl((Table)arguments.get(0));
			case DbSynchPackage.DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE:
				return synchUpTableImpl((Table)arguments.get(0));
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
		result.append(" (Connected: ");
		result.append(connected);
		result.append(", AutoCommit: ");
		result.append(autoCommit);
		result.append(')');
		return result.toString();
	}

} //DataSourceImpl
