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
package com.misc.common.moplaf.dbsynch.dbsynchmysql;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlFactory
 * @model kind="package"
 * @generated
 */
public interface DbsynchmysqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbsynchmysql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/dbsynch/mysql/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbsynchmysqlPackage eINSTANCE = com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DbsynchmysqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DataSourceJdbcMySqlImpl <em>Data Source Jdbc My Sql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DataSourceJdbcMySqlImpl
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DbsynchmysqlPackageImpl#getDataSourceJdbcMySql()
	 * @generated
	 */
	int DATA_SOURCE_JDBC_MY_SQL = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__TABLES = DbSynchPackage.DATA_SOURCE_JDBC__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__DATA_SOURCE = DbSynchPackage.DATA_SOURCE_JDBC__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__NAME = DbSynchPackage.DATA_SOURCE_JDBC__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__CHILD_UNITS = DbSynchPackage.DATA_SOURCE_JDBC__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__CONNECTED = DbSynchPackage.DATA_SOURCE_JDBC__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__DATA_BASE_USER = DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__DATA_BASE_USER_PWD = DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__DEFAULT_SCHEMA = DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__HOST = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__PORT = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL__DATA_BASE = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source Jdbc My Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL_FEATURE_COUNT = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___REFRESH_META_DATA = DbSynchPackage.DATA_SOURCE_JDBC___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___SYNCH_UP = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___SYNCH_DOWN = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___GET_PARAM_VALUE__EATTRIBUTE = DbSynchPackage.DATA_SOURCE_JDBC___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___GET_PARAM_ATTRIBUTES = DbSynchPackage.DATA_SOURCE_JDBC___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___CONNECT = DbSynchPackage.DATA_SOURCE_JDBC___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___DISCONNECT = DbSynchPackage.DATA_SOURCE_JDBC___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___SYNCH_DOWN_TABLE_IMPL__TABLE = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL___SYNCH_UP_TABLE_IMPL__TABLE = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Data Source Jdbc My Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_MY_SQL_OPERATION_COUNT = DbSynchPackage.DATA_SOURCE_JDBC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql <em>Data Source Jdbc My Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Jdbc My Sql</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql
	 * @generated
	 */
	EClass getDataSourceJdbcMySql();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getHost()
	 * @see #getDataSourceJdbcMySql()
	 * @generated
	 */
	EAttribute getDataSourceJdbcMySql_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getPort()
	 * @see #getDataSourceJdbcMySql()
	 * @generated
	 */
	EAttribute getDataSourceJdbcMySql_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getDataBase()
	 * @see #getDataSourceJdbcMySql()
	 * @generated
	 */
	EAttribute getDataSourceJdbcMySql_DataBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbsynchmysqlFactory getDbsynchmysqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DataSourceJdbcMySqlImpl <em>Data Source Jdbc My Sql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DataSourceJdbcMySqlImpl
		 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DbsynchmysqlPackageImpl#getDataSourceJdbcMySql()
		 * @generated
		 */
		EClass DATA_SOURCE_JDBC_MY_SQL = eINSTANCE.getDataSourceJdbcMySql();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_MY_SQL__HOST = eINSTANCE.getDataSourceJdbcMySql_Host();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_MY_SQL__PORT = eINSTANCE.getDataSourceJdbcMySql_Port();
		/**
		 * The meta object literal for the '<em><b>Data Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_MY_SQL__DATA_BASE = eINSTANCE.getDataSourceJdbcMySql_DataBase();

	}

} //DbsynchmysqlPackage
