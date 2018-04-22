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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * The method refresh() is called by the framework when changed by the framework, so when changed after a read action
 * <!-- end-model-doc -->
 * @see com.misc.common.moplaf.dbsynch.DbSynchFactory
 * @model kind="package"
 * @generated
 */
public interface DbSynchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbsynch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/dbsynch/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbSynchPackage eINSTANCE = com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl <em>Unit Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDbSynchUnitAbstract()
	 * @generated
	 */
	int DB_SYNCH_UNIT_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT__TABLES = 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS = 3;

	/**
	 * The number of structural features of the '<em>Unit Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT___REFRESH_META_DATA = 0;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT___SYNCH_UP = 1;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT___SYNCH_DOWN = 2;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_VALUE__EATTRIBUTE = 3;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_ATTRIBUTES = 4;

	/**
	 * The operation id for the '<em>Add Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT___ADD_TABLE__EREFERENCE_ECLASS = 5;

	/**
	 * The number of operations of the '<em>Unit Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.DataSourceImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TABLES = DB_SYNCH_UNIT_ABSTRACT__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_SOURCE = DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = DB_SYNCH_UNIT_ABSTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CHILD_UNITS = DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CONNECTED = DB_SYNCH_UNIT_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__AUTO_COMMIT = DB_SYNCH_UNIT_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = DB_SYNCH_UNIT_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___REFRESH_META_DATA = DB_SYNCH_UNIT_ABSTRACT___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___SYNCH_UP = DB_SYNCH_UNIT_ABSTRACT___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___SYNCH_DOWN = DB_SYNCH_UNIT_ABSTRACT___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_PARAM_VALUE__EATTRIBUTE = DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_PARAM_ATTRIBUTES = DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___ADD_TABLE__EREFERENCE_ECLASS = DB_SYNCH_UNIT_ABSTRACT___ADD_TABLE__EREFERENCE_ECLASS;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___CONNECT = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___DISCONNECT = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___COMMIT = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___ROLLBACK = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchUnitImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDbSynchUnit()
	 * @generated
	 */
	int DB_SYNCH_UNIT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableRowImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl <em>Data Source Jdbc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDataSourceJdbc()
	 * @generated
	 */
	int DATA_SOURCE_JDBC = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__TABLES = DATA_SOURCE__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__DATA_SOURCE = DATA_SOURCE__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__CHILD_UNITS = DATA_SOURCE__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__CONNECTED = DATA_SOURCE__CONNECTED;

	/**
	 * The feature id for the '<em><b>Auto Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__AUTO_COMMIT = DATA_SOURCE__AUTO_COMMIT;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__DATA_BASE_USER = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__DATA_BASE_USER_PWD = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__DEFAULT_SCHEMA = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source Jdbc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___REFRESH_META_DATA = DATA_SOURCE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___SYNCH_UP = DATA_SOURCE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___SYNCH_DOWN = DATA_SOURCE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___GET_PARAM_VALUE__EATTRIBUTE = DATA_SOURCE___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___GET_PARAM_ATTRIBUTES = DATA_SOURCE___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___ADD_TABLE__EREFERENCE_ECLASS = DATA_SOURCE___ADD_TABLE__EREFERENCE_ECLASS;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___CONNECT = DATA_SOURCE___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___DISCONNECT = DATA_SOURCE___DISCONNECT;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___COMMIT = DATA_SOURCE___COMMIT;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___ROLLBACK = DATA_SOURCE___ROLLBACK;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___SYNCH_DOWN_TABLE_IMPL__TABLE = DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___SYNCH_UP_TABLE_IMPL__TABLE = DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Data Source Jdbc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT__TABLES = DB_SYNCH_UNIT_ABSTRACT__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT__DATA_SOURCE = DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT__NAME = DB_SYNCH_UNIT_ABSTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT__CHILD_UNITS = DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT__PARENT_UNIT = DB_SYNCH_UNIT_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_FEATURE_COUNT = DB_SYNCH_UNIT_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___REFRESH_META_DATA = DB_SYNCH_UNIT_ABSTRACT___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___SYNCH_UP = DB_SYNCH_UNIT_ABSTRACT___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___SYNCH_DOWN = DB_SYNCH_UNIT_ABSTRACT___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___GET_PARAM_VALUE__EATTRIBUTE = DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___GET_PARAM_ATTRIBUTES = DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___ADD_TABLE__EREFERENCE_ECLASS = DB_SYNCH_UNIT_ABSTRACT___ADD_TABLE__EREFERENCE_ECLASS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT___REFRESH = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SYNCH_UNIT_OPERATION_COUNT = DB_SYNCH_UNIT_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SYNCH_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__KEY_COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATA_COLUMNS = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WHERE_CLAUSE = 5;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = 6;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 7;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SELECT_SQL_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INSERT_SQL_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UPDATE_SQL_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DELETE_SQL_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUMBER_OF_ROWS = 12;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAST_SYNCH_DOWN = 13;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAST_SYNCH_UP = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARENT = 15;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 16;

	/**
	 * The operation id for the '<em>Get Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___GET_COLUMN__STRING = 0;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_TABLECOLUMN = 2;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_STRING = 3;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_PARAM__EATTRIBUTE = 4;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REFRESH_META_DATA = 5;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___SYNCH_DOWN = 6;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___SYNCH_UP = 7;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REFRESH = 8;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___GET_ROW__TABLEROWKEY = 9;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___CONSTRUCT_ROW = 10;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___INDEX_ROW__TABLEROW = 11;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___UNINDEX_ROW__TABLEROW = 12;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REFRESH_INDEX = 13;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableColumnImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableColumn()
	 * @generated
	 */
	int TABLE_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__KEY = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__COLUMN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Row Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__ROW_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__TABLE = 4;

	/**
	 * The feature id for the '<em><b>Parent Table Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__PARENT_TABLE_COLUMN = 5;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CURRENT_KEY = 1;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__DELETED = 2;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__INDEX_KEY = 3;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__LAST_SYNCH_DOWN_KEY = 4;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__LAST_SYNCH_DOWN_DELETED = 5;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__MODIFICATION_LAST_SYNCH_UP = 6;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN = 7;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW___REFRESH = 0;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.EnumModification <em>Enum Modification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnumModification()
	 * @generated
	 */
	int ENUM_MODIFICATION = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.EnumColumnType <em>Enum Column Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.EnumColumnType
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnumColumnType()
	 * @generated
	 */
	int ENUM_COLUMN_TYPE = 8;

	/**
	 * The meta object id for the '<em>Table Row Key</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.TableRowKey
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRowKey()
	 * @generated
	 */
	int TABLE_ROW_KEY = 9;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 10;


	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 11;

	/**
	 * The meta object id for the '<em>Return Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getReturnFeedback()
	 * @generated
	 */
	int RETURN_FEEDBACK = 12;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DataSource#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#isConnected()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Connected();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DataSource#isAutoCommit <em>Auto Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Commit</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#isAutoCommit()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_AutoCommit();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DataSource#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#connect()
	 * @generated
	 */
	EOperation getDataSource__Connect();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DataSource#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#disconnect()
	 * @generated
	 */
	EOperation getDataSource__Disconnect();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DataSource#commit() <em>Commit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commit</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#commit()
	 * @generated
	 */
	EOperation getDataSource__Commit();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DataSource#rollback() <em>Rollback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rollback</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#rollback()
	 * @generated
	 */
	EOperation getDataSource__Rollback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DataSource#synchDownTableImpl(com.misc.common.moplaf.dbsynch.Table) <em>Synch Down Table Impl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Down Table Impl</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#synchDownTableImpl(com.misc.common.moplaf.dbsynch.Table)
	 * @generated
	 */
	EOperation getDataSource__SynchDownTableImpl__Table();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DataSource#synchUpTableImpl(com.misc.common.moplaf.dbsynch.Table) <em>Synch Up Table Impl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Up Table Impl</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#synchUpTableImpl(com.misc.common.moplaf.dbsynch.Table)
	 * @generated
	 */
	EOperation getDataSource__SynchUpTableImpl__Table();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.DbSynchUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnit
	 * @generated
	 */
	EClass getDbSynchUnit();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.DbSynchUnit#getParentUnit <em>Parent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Unit</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnit#getParentUnit()
	 * @see #getDbSynchUnit()
	 * @generated
	 */
	EReference getDbSynchUnit_ParentUnit();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnit#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnit#refresh()
	 * @generated
	 */
	EOperation getDbSynchUnit__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.Table#getSynchUnit <em>Synch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synch Unit</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getSynchUnit()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_SynchUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.dbsynch.Table#getKeyColumns <em>Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Columns</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getKeyColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_KeyColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.dbsynch.Table#getDataColumns <em>Data Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Columns</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getDataColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_DataColumns();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dbsynch.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rows</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getTableName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableName();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getWhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where Clause</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getWhereClause()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WhereClause();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getNumberOfRows <em>Number Of Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rows</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getNumberOfRows()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NumberOfRows();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchDown <em>Last Synch Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Synch Down</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getLastSynchDown()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_LastSynchDown();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchUp <em>Last Synch Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Synch Up</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getLastSynchUp()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_LastSynchUp();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.Table#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getParent()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Parent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#getColumn(java.lang.String) <em>Get Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Column</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#getColumn(java.lang.String)
	 * @generated
	 */
	EOperation getTable__GetColumn__String();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#addColumn(boolean, java.lang.String, com.misc.common.moplaf.dbsynch.EnumColumnType, org.eclipse.emf.ecore.EAttribute) <em>Add Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Column</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#addColumn(boolean, java.lang.String, com.misc.common.moplaf.dbsynch.EnumColumnType, org.eclipse.emf.ecore.EAttribute)
	 * @generated
	 */
	EOperation getTable__AddColumn__boolean_String_EnumColumnType_EAttribute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#addColumn(boolean, java.lang.String, com.misc.common.moplaf.dbsynch.EnumColumnType, org.eclipse.emf.ecore.EAttribute, com.misc.common.moplaf.dbsynch.TableColumn) <em>Add Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Column</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#addColumn(boolean, java.lang.String, com.misc.common.moplaf.dbsynch.EnumColumnType, org.eclipse.emf.ecore.EAttribute, com.misc.common.moplaf.dbsynch.TableColumn)
	 * @generated
	 */
	EOperation getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_TableColumn();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#addColumn(boolean, java.lang.String, com.misc.common.moplaf.dbsynch.EnumColumnType, org.eclipse.emf.ecore.EAttribute, java.lang.String) <em>Add Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Column</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#addColumn(boolean, java.lang.String, com.misc.common.moplaf.dbsynch.EnumColumnType, org.eclipse.emf.ecore.EAttribute, java.lang.String)
	 * @generated
	 */
	EOperation getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_String();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getSelectSqlStatement <em>Select Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Sql Statement</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getSelectSqlStatement()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_SelectSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getInsertSqlStatement <em>Insert Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Sql Statement</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getInsertSqlStatement()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_InsertSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getUpdateSqlStatement <em>Update Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Sql Statement</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getUpdateSqlStatement()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_UpdateSqlStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.Table#getDeleteSqlStatement <em>Delete Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Sql Statement</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getDeleteSqlStatement()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_DeleteSqlStatement();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dbsynch.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dbsynch.Table#getParamDbSynchUnitAttributes <em>Param Db Synch Unit Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Param Db Synch Unit Attributes</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getParamDbSynchUnitAttributes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ParamDbSynchUnitAttributes();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#addParam(org.eclipse.emf.ecore.EAttribute) <em>Add Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Param</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#addParam(org.eclipse.emf.ecore.EAttribute)
	 * @generated
	 */
	EOperation getTable__AddParam__EAttribute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#refreshMetaData() <em>Refresh Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Meta Data</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#refreshMetaData()
	 * @generated
	 */
	EOperation getTable__RefreshMetaData();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#synchDown() <em>Synch Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Down</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#synchDown()
	 * @generated
	 */
	EOperation getTable__SynchDown();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#synchUp() <em>Synch Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Up</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#synchUp()
	 * @generated
	 */
	EOperation getTable__SynchUp();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#refresh()
	 * @generated
	 */
	EOperation getTable__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#getRow(com.misc.common.moplaf.dbsynch.TableRowKey) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#getRow(com.misc.common.moplaf.dbsynch.TableRowKey)
	 * @generated
	 */
	EOperation getTable__GetRow__TableRowKey();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#constructRow() <em>Construct Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#constructRow()
	 * @generated
	 */
	EOperation getTable__ConstructRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#indexRow(com.misc.common.moplaf.dbsynch.TableRow) <em>Index Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Index Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#indexRow(com.misc.common.moplaf.dbsynch.TableRow)
	 * @generated
	 */
	EOperation getTable__IndexRow__TableRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#unindexRow(com.misc.common.moplaf.dbsynch.TableRow) <em>Unindex Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unindex Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#unindexRow(com.misc.common.moplaf.dbsynch.TableRow)
	 * @generated
	 */
	EOperation getTable__UnindexRow__TableRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#refreshIndex() <em>Refresh Index</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Index</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#refreshIndex()
	 * @generated
	 */
	EOperation getTable__RefreshIndex();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.TableRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getTable()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Table();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#getCurrentKey <em>Current Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getCurrentKey()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_CurrentKey();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#getIndexKey <em>Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getIndexKey()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_IndexKey();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#getLastSynchDownKey <em>Last Synch Down Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Synch Down Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getLastSynchDownKey()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_LastSynchDownKey();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#isLastSynchDownDeleted <em>Last Synch Down Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Synch Down Deleted</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#isLastSynchDownDeleted()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_LastSynchDownDeleted();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp <em>Modification Last Synch Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Last Synch Up</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_ModificationLastSynchUp();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown <em>Modification Next Synch Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Next Synch Down</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_ModificationNextSynchDown();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#isDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#isDeleted()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Deleted();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.TableRow#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#refresh()
	 * @generated
	 */
	EOperation getTableRow__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc <em>Data Source Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Jdbc</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSourceJdbc
	 * @generated
	 */
	EClass getDataSourceJdbc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUser <em>Data Base User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base User</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUser()
	 * @see #getDataSourceJdbc()
	 * @generated
	 */
	EAttribute getDataSourceJdbc_DataBaseUser();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUserPwd <em>Data Base User Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base User Pwd</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDataBaseUserPwd()
	 * @see #getDataSourceJdbc()
	 * @generated
	 */
	EAttribute getDataSourceJdbc_DataBaseUserPwd();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDefaultSchema <em>Default Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Schema</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSourceJdbc#getDefaultSchema()
	 * @see #getDataSourceJdbc()
	 * @generated
	 */
	EAttribute getDataSourceJdbc_DefaultSchema();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn
	 * @generated
	 */
	EClass getTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableColumn#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#isKey()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#getColumnName()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_ColumnName();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.TableColumn#getRowAttribute <em>Row Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Row Attribute</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#getRowAttribute()
	 * @see #getTableColumn()
	 * @generated
	 */
	EReference getTableColumn_RowAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.TableColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#getTable()
	 * @see #getTableColumn()
	 * @generated
	 */
	EReference getTableColumn_Table();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.TableColumn#getParentTableColumn <em>Parent Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Table Column</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#getParentTableColumn()
	 * @see #getTableColumn()
	 * @generated
	 */
	EReference getTableColumn_ParentTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Type</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#getColumnType()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_ColumnType();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract <em>Unit Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Abstract</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract
	 * @generated
	 */
	EClass getDbSynchUnitAbstract();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getTables()
	 * @see #getDbSynchUnitAbstract()
	 * @generated
	 */
	EReference getDbSynchUnitAbstract_Tables();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getDataSource()
	 * @see #getDbSynchUnitAbstract()
	 * @generated
	 */
	EReference getDbSynchUnitAbstract_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getName()
	 * @see #getDbSynchUnitAbstract()
	 * @generated
	 */
	EAttribute getDbSynchUnitAbstract_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getChildUnits <em>Child Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Units</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getChildUnits()
	 * @see #getDbSynchUnitAbstract()
	 * @generated
	 */
	EReference getDbSynchUnitAbstract_ChildUnits();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#refreshMetaData() <em>Refresh Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Meta Data</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#refreshMetaData()
	 * @generated
	 */
	EOperation getDbSynchUnitAbstract__RefreshMetaData();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#synchUp() <em>Synch Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Up</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#synchUp()
	 * @generated
	 */
	EOperation getDbSynchUnitAbstract__SynchUp();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#synchDown() <em>Synch Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Down</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#synchDown()
	 * @generated
	 */
	EOperation getDbSynchUnitAbstract__SynchDown();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getParamValue(org.eclipse.emf.ecore.EAttribute) <em>Get Param Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Param Value</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getParamValue(org.eclipse.emf.ecore.EAttribute)
	 * @generated
	 */
	EOperation getDbSynchUnitAbstract__GetParamValue__EAttribute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getParamAttributes() <em>Get Param Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Param Attributes</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getParamAttributes()
	 * @generated
	 */
	EOperation getDbSynchUnitAbstract__GetParamAttributes();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#addTable(org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EClass) <em>Add Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Table</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#addTable(org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getDbSynchUnitAbstract__AddTable__EReference_EClass();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.dbsynch.EnumModification <em>Enum Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Modification</em>'.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @generated
	 */
	EEnum getEnumModification();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.dbsynch.EnumColumnType <em>Enum Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Column Type</em>'.
	 * @see com.misc.common.moplaf.dbsynch.EnumColumnType
	 * @generated
	 */
	EEnum getEnumColumnType();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.dbsynch.TableRowKey <em>Table Row Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table Row Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRowKey
	 * @model instanceClass="com.misc.common.moplaf.dbsynch.TableRowKey"
	 * @generated
	 */
	EDataType getTableRowKey();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.EnabledFeedback <em>Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.EnabledFeedback"
	 * @generated
	 */
	EDataType getEnabledFeedback();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.ReturnFeedback <em>Return Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Return Feedback</em>'.
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.ReturnFeedback"
	 * @generated
	 */
	EDataType getReturnFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbSynchFactory getDbSynchFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.DataSourceImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__CONNECTED = eINSTANCE.getDataSource_Connected();

		/**
		 * The meta object literal for the '<em><b>Auto Commit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__AUTO_COMMIT = eINSTANCE.getDataSource_AutoCommit();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___CONNECT = eINSTANCE.getDataSource__Connect();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___DISCONNECT = eINSTANCE.getDataSource__Disconnect();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___COMMIT = eINSTANCE.getDataSource__Commit();

		/**
		 * The meta object literal for the '<em><b>Rollback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___ROLLBACK = eINSTANCE.getDataSource__Rollback();

		/**
		 * The meta object literal for the '<em><b>Synch Down Table Impl</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE = eINSTANCE.getDataSource__SynchDownTableImpl__Table();

		/**
		 * The meta object literal for the '<em><b>Synch Up Table Impl</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE = eINSTANCE.getDataSource__SynchUpTableImpl__Table();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchUnitImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDbSynchUnit()
		 * @generated
		 */
		EClass DB_SYNCH_UNIT = eINSTANCE.getDbSynchUnit();

		/**
		 * The meta object literal for the '<em><b>Parent Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_SYNCH_UNIT__PARENT_UNIT = eINSTANCE.getDbSynchUnit_ParentUnit();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT___REFRESH = eINSTANCE.getDbSynchUnit__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.TableImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Synch Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__SYNCH_UNIT = eINSTANCE.getTable_SynchUnit();

		/**
		 * The meta object literal for the '<em><b>Key Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__KEY_COLUMNS = eINSTANCE.getTable_KeyColumns();

		/**
		 * The meta object literal for the '<em><b>Data Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DATA_COLUMNS = eINSTANCE.getTable_DataColumns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_NAME = eINSTANCE.getTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Where Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WHERE_CLAUSE = eINSTANCE.getTable_WhereClause();

		/**
		 * The meta object literal for the '<em><b>Number Of Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUMBER_OF_ROWS = eINSTANCE.getTable_NumberOfRows();

		/**
		 * The meta object literal for the '<em><b>Last Synch Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__LAST_SYNCH_DOWN = eINSTANCE.getTable_LastSynchDown();

		/**
		 * The meta object literal for the '<em><b>Last Synch Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__LAST_SYNCH_UP = eINSTANCE.getTable_LastSynchUp();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PARENT = eINSTANCE.getTable_Parent();

		/**
		 * The meta object literal for the '<em><b>Get Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___GET_COLUMN__STRING = eINSTANCE.getTable__GetColumn__String();

		/**
		 * The meta object literal for the '<em><b>Add Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = eINSTANCE.getTable__AddColumn__boolean_String_EnumColumnType_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Add Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_TABLECOLUMN = eINSTANCE.getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_TableColumn();

		/**
		 * The meta object literal for the '<em><b>Add Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_STRING = eINSTANCE.getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_String();

		/**
		 * The meta object literal for the '<em><b>Select Sql Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SELECT_SQL_STATEMENT = eINSTANCE.getTable_SelectSqlStatement();

		/**
		 * The meta object literal for the '<em><b>Insert Sql Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__INSERT_SQL_STATEMENT = eINSTANCE.getTable_InsertSqlStatement();

		/**
		 * The meta object literal for the '<em><b>Update Sql Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__UPDATE_SQL_STATEMENT = eINSTANCE.getTable_UpdateSqlStatement();

		/**
		 * The meta object literal for the '<em><b>Delete Sql Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__DELETE_SQL_STATEMENT = eINSTANCE.getTable_DeleteSqlStatement();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = eINSTANCE.getTable_ParamDbSynchUnitAttributes();

		/**
		 * The meta object literal for the '<em><b>Add Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___ADD_PARAM__EATTRIBUTE = eINSTANCE.getTable__AddParam__EAttribute();

		/**
		 * The meta object literal for the '<em><b>Refresh Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REFRESH_META_DATA = eINSTANCE.getTable__RefreshMetaData();

		/**
		 * The meta object literal for the '<em><b>Synch Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___SYNCH_DOWN = eINSTANCE.getTable__SynchDown();

		/**
		 * The meta object literal for the '<em><b>Synch Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___SYNCH_UP = eINSTANCE.getTable__SynchUp();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REFRESH = eINSTANCE.getTable__Refresh();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___GET_ROW__TABLEROWKEY = eINSTANCE.getTable__GetRow__TableRowKey();

		/**
		 * The meta object literal for the '<em><b>Construct Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___CONSTRUCT_ROW = eINSTANCE.getTable__ConstructRow();

		/**
		 * The meta object literal for the '<em><b>Index Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___INDEX_ROW__TABLEROW = eINSTANCE.getTable__IndexRow__TableRow();

		/**
		 * The meta object literal for the '<em><b>Unindex Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___UNINDEX_ROW__TABLEROW = eINSTANCE.getTable__UnindexRow__TableRow();

		/**
		 * The meta object literal for the '<em><b>Refresh Index</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REFRESH_INDEX = eINSTANCE.getTable__RefreshIndex();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.TableRowImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__TABLE = eINSTANCE.getTableRow_Table();

		/**
		 * The meta object literal for the '<em><b>Current Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__CURRENT_KEY = eINSTANCE.getTableRow_CurrentKey();

		/**
		 * The meta object literal for the '<em><b>Index Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__INDEX_KEY = eINSTANCE.getTableRow_IndexKey();

		/**
		 * The meta object literal for the '<em><b>Last Synch Down Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__LAST_SYNCH_DOWN_KEY = eINSTANCE.getTableRow_LastSynchDownKey();

		/**
		 * The meta object literal for the '<em><b>Last Synch Down Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__LAST_SYNCH_DOWN_DELETED = eINSTANCE.getTableRow_LastSynchDownDeleted();

		/**
		 * The meta object literal for the '<em><b>Modification Last Synch Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__MODIFICATION_LAST_SYNCH_UP = eINSTANCE.getTableRow_ModificationLastSynchUp();

		/**
		 * The meta object literal for the '<em><b>Modification Next Synch Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN = eINSTANCE.getTableRow_ModificationNextSynchDown();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__DELETED = eINSTANCE.getTableRow_Deleted();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW___REFRESH = eINSTANCE.getTableRow__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl <em>Data Source Jdbc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDataSourceJdbc()
		 * @generated
		 */
		EClass DATA_SOURCE_JDBC = eINSTANCE.getDataSourceJdbc();

		/**
		 * The meta object literal for the '<em><b>Data Base User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC__DATA_BASE_USER = eINSTANCE.getDataSourceJdbc_DataBaseUser();

		/**
		 * The meta object literal for the '<em><b>Data Base User Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC__DATA_BASE_USER_PWD = eINSTANCE.getDataSourceJdbc_DataBaseUserPwd();

		/**
		 * The meta object literal for the '<em><b>Default Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC__DEFAULT_SCHEMA = eINSTANCE.getDataSourceJdbc_DefaultSchema();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.TableColumnImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableColumn()
		 * @generated
		 */
		EClass TABLE_COLUMN = eINSTANCE.getTableColumn();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__KEY = eINSTANCE.getTableColumn_Key();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__COLUMN_NAME = eINSTANCE.getTableColumn_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Row Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN__ROW_ATTRIBUTE = eINSTANCE.getTableColumn_RowAttribute();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN__TABLE = eINSTANCE.getTableColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Parent Table Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN__PARENT_TABLE_COLUMN = eINSTANCE.getTableColumn_ParentTableColumn();

		/**
		 * The meta object literal for the '<em><b>Column Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__COLUMN_TYPE = eINSTANCE.getTableColumn_ColumnType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl <em>Unit Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchUnitAbstractImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDbSynchUnitAbstract()
		 * @generated
		 */
		EClass DB_SYNCH_UNIT_ABSTRACT = eINSTANCE.getDbSynchUnitAbstract();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_SYNCH_UNIT_ABSTRACT__TABLES = eINSTANCE.getDbSynchUnitAbstract_Tables();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE = eINSTANCE.getDbSynchUnitAbstract_DataSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SYNCH_UNIT_ABSTRACT__NAME = eINSTANCE.getDbSynchUnitAbstract_Name();

		/**
		 * The meta object literal for the '<em><b>Child Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS = eINSTANCE.getDbSynchUnitAbstract_ChildUnits();

		/**
		 * The meta object literal for the '<em><b>Refresh Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT_ABSTRACT___REFRESH_META_DATA = eINSTANCE.getDbSynchUnitAbstract__RefreshMetaData();

		/**
		 * The meta object literal for the '<em><b>Synch Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT_ABSTRACT___SYNCH_UP = eINSTANCE.getDbSynchUnitAbstract__SynchUp();

		/**
		 * The meta object literal for the '<em><b>Synch Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT_ABSTRACT___SYNCH_DOWN = eINSTANCE.getDbSynchUnitAbstract__SynchDown();

		/**
		 * The meta object literal for the '<em><b>Get Param Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_VALUE__EATTRIBUTE = eINSTANCE.getDbSynchUnitAbstract__GetParamValue__EAttribute();

		/**
		 * The meta object literal for the '<em><b>Get Param Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_ATTRIBUTES = eINSTANCE.getDbSynchUnitAbstract__GetParamAttributes();

		/**
		 * The meta object literal for the '<em><b>Add Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_SYNCH_UNIT_ABSTRACT___ADD_TABLE__EREFERENCE_ECLASS = eINSTANCE.getDbSynchUnitAbstract__AddTable__EReference_EClass();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.EnumModification <em>Enum Modification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.EnumModification
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnumModification()
		 * @generated
		 */
		EEnum ENUM_MODIFICATION = eINSTANCE.getEnumModification();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.EnumColumnType <em>Enum Column Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.EnumColumnType
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnumColumnType()
		 * @generated
		 */
		EEnum ENUM_COLUMN_TYPE = eINSTANCE.getEnumColumnType();

		/**
		 * The meta object literal for the '<em>Table Row Key</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.TableRowKey
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRowKey()
		 * @generated
		 */
		EDataType TABLE_ROW_KEY = eINSTANCE.getTableRowKey();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Enabled Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.EnabledFeedback
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnabledFeedback()
		 * @generated
		 */
		EDataType ENABLED_FEEDBACK = eINSTANCE.getEnabledFeedback();

		/**
		 * The meta object literal for the '<em>Return Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.ReturnFeedback
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getReturnFeedback()
		 * @generated
		 */
		EDataType RETURN_FEEDBACK = eINSTANCE.getReturnFeedback();

	}

} //DbSynchPackage
