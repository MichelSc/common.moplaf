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
package com.misc.common.moplaf.dbsynch.dbsynchora;

import com.misc.common.moplaf.dbsynch.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdbc Ora Thin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin#getDataBase <em>Data Base</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage#getDataSourceJdbcOraThin()
 * @model
 * @generated
 */
public interface DataSourceJdbcOraThin extends DataSourceJdbc {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"localshost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage#getDataSourceJdbcOraThin_Host()
	 * @model default="localshost"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"3306"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage#getDataSourceJdbcOraThin_Port()
	 * @model default="3306"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin#getPort <em>Port</em>}' attribute.
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
	 * @see com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage#getDataSourceJdbcOraThin_DataBase()
	 * @model
	 * @generated
	 */
	String getDataBase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin#getDataBase <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' attribute.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(String value);

} // DataSourceJdbcOraThin
