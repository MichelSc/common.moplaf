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
package com.misc.common.moplaf.dbsynch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdbc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUser <em>Data Base User</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUserPwd <em>Data Base User Pwd</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDefaultSchema <em>Default Schema</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSourceJdbc()
 * @model
 * @generated
 */
public interface DataSourceJdbc extends DataSource {
	/**
	 * Returns the value of the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base User</em>' attribute.
	 * @see #setDataBaseUser(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSourceJdbc_DataBaseUser()
	 * @model
	 * @generated
	 */
	String getDataBaseUser();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUser <em>Data Base User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base User</em>' attribute.
	 * @see #getDataBaseUser()
	 * @generated
	 */
	void setDataBaseUser(String value);

	/**
	 * Returns the value of the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base User Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base User Pwd</em>' attribute.
	 * @see #setDataBaseUserPwd(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSourceJdbc_DataBaseUserPwd()
	 * @model
	 * @generated
	 */
	String getDataBaseUserPwd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUserPwd <em>Data Base User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base User Pwd</em>' attribute.
	 * @see #getDataBaseUserPwd()
	 * @generated
	 */
	void setDataBaseUserPwd(String value);

	/**
	 * Returns the value of the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Schema</em>' attribute.
	 * @see #setDefaultSchema(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSourceJdbc_DefaultSchema()
	 * @model
	 * @generated
	 */
	String getDefaultSchema();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDefaultSchema <em>Default Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Schema</em>' attribute.
	 * @see #getDefaultSchema()
	 * @generated
	 */
	void setDefaultSchema(String value);

} // DataSourceJdbc
