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
package com.misc.common.moplaf.dbsynch.dbsynchjtds;

import com.misc.common.moplaf.dbsynch.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdbc Jtds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getDataBase <em>Data Base</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getServerType <em>Server Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getUserDomain <em>User Domain</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getDataSourceJdbcJtds()
 * @model
 * @generated
 */
public interface DataSourceJdbcJtds extends DataSourceJdbc {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getDataSourceJdbcJtds_Host()
	 * @model default="localhost"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"1433"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getDataSourceJdbcJtds_Port()
	 * @model default="1433"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base</em>' attribute.
	 * @see #setDataBase(String)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getDataSourceJdbcJtds_DataBase()
	 * @model
	 * @generated
	 */
	String getDataBase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getDataBase <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' attribute.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(String value);

	/**
	 * Returns the value of the '<em><b>Server Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Type</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType
	 * @see #setServerType(EnumServerType)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getDataSourceJdbcJtds_ServerType()
	 * @model
	 * @generated
	 */
	EnumServerType getServerType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Type</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType
	 * @see #getServerType()
	 * @generated
	 */
	void setServerType(EnumServerType value);

	/**
	 * Returns the value of the '<em><b>User Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Domain</em>' attribute.
	 * @see #setUserDomain(String)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getDataSourceJdbcJtds_UserDomain()
	 * @model
	 * @generated
	 */
	String getUserDomain();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getUserDomain <em>User Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Domain</em>' attribute.
	 * @see #getUserDomain()
	 * @generated
	 */
	void setUserDomain(String value);

} // DataSourceJdbcJtds
