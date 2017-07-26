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
package com.misc.common.moplaf.dbsynch.dbsynchjtds;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsFactory
 * @model kind="package"
 * @generated
 */
public interface DbsynchjtdsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbsynchjtds";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/dbsynch/jtds/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbsj";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbsynchjtdsPackage eINSTANCE = com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DbsynchjtdsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl <em>Data Source Jdbc Jtds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DbsynchjtdsPackageImpl#getDataSourceJdbcJtds()
	 * @generated
	 */
	int DATA_SOURCE_JDBC_JTDS = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__TABLES = DbSynchPackage.DATA_SOURCE_JDBC__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__DATA_SOURCE = DbSynchPackage.DATA_SOURCE_JDBC__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__NAME = DbSynchPackage.DATA_SOURCE_JDBC__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__CHILD_UNITS = DbSynchPackage.DATA_SOURCE_JDBC__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__CONNECTED = DbSynchPackage.DATA_SOURCE_JDBC__CONNECTED;

	/**
	 * The feature id for the '<em><b>Auto Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__AUTO_COMMIT = DbSynchPackage.DATA_SOURCE_JDBC__AUTO_COMMIT;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__DATA_BASE_USER = DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__DATA_BASE_USER_PWD = DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__DEFAULT_SCHEMA = DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__HOST = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__PORT = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__DATA_BASE = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__SERVER_TYPE = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS__USER_DOMAIN = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Source Jdbc Jtds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS_FEATURE_COUNT = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___REFRESH_META_DATA = DbSynchPackage.DATA_SOURCE_JDBC___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___SYNCH_UP = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___SYNCH_DOWN = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___GET_PARAM_VALUE__EATTRIBUTE = DbSynchPackage.DATA_SOURCE_JDBC___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___GET_PARAM_ATTRIBUTES = DbSynchPackage.DATA_SOURCE_JDBC___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___ADD_TABLE__EREFERENCE_ECLASS = DbSynchPackage.DATA_SOURCE_JDBC___ADD_TABLE__EREFERENCE_ECLASS;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___CONNECT = DbSynchPackage.DATA_SOURCE_JDBC___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___DISCONNECT = DbSynchPackage.DATA_SOURCE_JDBC___DISCONNECT;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___COMMIT = DbSynchPackage.DATA_SOURCE_JDBC___COMMIT;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___ROLLBACK = DbSynchPackage.DATA_SOURCE_JDBC___ROLLBACK;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___SYNCH_DOWN_TABLE_IMPL__TABLE = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS___SYNCH_UP_TABLE_IMPL__TABLE = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Data Source Jdbc Jtds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_JTDS_OPERATION_COUNT = DbSynchPackage.DATA_SOURCE_JDBC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType <em>Enum Server Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DbsynchjtdsPackageImpl#getEnumServerType()
	 * @generated
	 */
	int ENUM_SERVER_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds <em>Data Source Jdbc Jtds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Jdbc Jtds</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds
	 * @generated
	 */
	EClass getDataSourceJdbcJtds();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getHost()
	 * @see #getDataSourceJdbcJtds()
	 * @generated
	 */
	EAttribute getDataSourceJdbcJtds_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getPort()
	 * @see #getDataSourceJdbcJtds()
	 * @generated
	 */
	EAttribute getDataSourceJdbcJtds_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getDataBase()
	 * @see #getDataSourceJdbcJtds()
	 * @generated
	 */
	EAttribute getDataSourceJdbcJtds_DataBase();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Type</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getServerType()
	 * @see #getDataSourceJdbcJtds()
	 * @generated
	 */
	EAttribute getDataSourceJdbcJtds_ServerType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getUserDomain <em>User Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Domain</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds#getUserDomain()
	 * @see #getDataSourceJdbcJtds()
	 * @generated
	 */
	EAttribute getDataSourceJdbcJtds_UserDomain();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType <em>Enum Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Server Type</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType
	 * @generated
	 */
	EEnum getEnumServerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbsynchjtdsFactory getDbsynchjtdsFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl <em>Data Source Jdbc Jtds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl
		 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DbsynchjtdsPackageImpl#getDataSourceJdbcJtds()
		 * @generated
		 */
		EClass DATA_SOURCE_JDBC_JTDS = eINSTANCE.getDataSourceJdbcJtds();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_JTDS__HOST = eINSTANCE.getDataSourceJdbcJtds_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_JTDS__PORT = eINSTANCE.getDataSourceJdbcJtds_Port();

		/**
		 * The meta object literal for the '<em><b>Data Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_JTDS__DATA_BASE = eINSTANCE.getDataSourceJdbcJtds_DataBase();

		/**
		 * The meta object literal for the '<em><b>Server Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_JTDS__SERVER_TYPE = eINSTANCE.getDataSourceJdbcJtds_ServerType();

		/**
		 * The meta object literal for the '<em><b>User Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_JTDS__USER_DOMAIN = eINSTANCE.getDataSourceJdbcJtds_UserDomain();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType <em>Enum Server Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType
		 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DbsynchjtdsPackageImpl#getEnumServerType()
		 * @generated
		 */
		EEnum ENUM_SERVER_TYPE = eINSTANCE.getEnumServerType();

	}

} //DbsynchjtdsPackage
