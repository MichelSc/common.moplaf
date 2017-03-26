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
package com.misc.common.moplaf.dbsynch.dbsynchderby.impl;

import com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded;
import com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage;

import com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Jdbc Derby Embedded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DataSourceJdbcDerbyEmbeddedImpl#getDatabasePath <em>Database Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceJdbcDerbyEmbeddedImpl extends DataSourceJdbcImpl implements DataSourceJdbcDerbyEmbedded {
	/**
	 * The default value of the '{@link #getDatabasePath() <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePath() <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePath()
	 * @generated
	 * @ordered
	 */
	protected String databasePath = DATABASE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceJdbcDerbyEmbeddedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbsynchderbyPackage.Literals.DATA_SOURCE_JDBC_DERBY_EMBEDDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePath() {
		return databasePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePath(String newDatabasePath) {
		String oldDatabasePath = databasePath;
		databasePath = newDatabasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH, oldDatabasePath, databasePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH:
				return getDatabasePath();
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
			case DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH:
				setDatabasePath((String)newValue);
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
			case DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH:
				setDatabasePath(DATABASE_PATH_EDEFAULT);
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
			case DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH:
				return DATABASE_PATH_EDEFAULT == null ? databasePath != null : !DATABASE_PATH_EDEFAULT.equals(databasePath);
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
		result.append(" (DatabasePath: ");
		result.append(databasePath);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected Connection getConnectionImpl() throws ClassNotFoundException, SQLException{
		// load the driver
		//Class.forName(this.getDriver()).newInstance();
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		Class.forName(driver);
		
		// set the connection
		String databaseurl = "jdbc:derby:"
							+ this.getDatabasePath()
							+ ";create=true";
		Connection connection = DriverManager.getConnection (databaseurl, 
    										              this.getDataBaseUser(), 
											              this.getDataBaseUserPwd());
		return connection;
	}
} //DataSourceJdbcDerbyEmbeddedImpl
