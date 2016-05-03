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
	String eNS_URI = "//www.misc.com/common/moplaf/dbsynch/model/0.1";

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
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.DataSourceImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CONNECTED = 1;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___CONNECT = 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___DISCONNECT = 1;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE = 2;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE = 3;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.TableGroupImpl <em>Table Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableGroupImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableGroup()
	 * @generated
	 */
	int TABLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP__TABLES = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP__DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Table Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP___REFRESH_META_DATA = 0;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP___SYNCH_DOWN = 1;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP___SYNCH_UP = 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP___REFRESH = 3;

	/**
	 * The number of operations of the '<em>Table Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__KEY_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATA_COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 3;

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
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUMBER_OF_ROWS = 6;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAST_SYNCH_DOWN = 7;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAST_SYNCH_UP = 8;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SELECT_SQL_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INSERT_SQL_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UPDATE_SQL_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DELETE_SQL_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Param Table Group Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARAM_TABLE_GROUP_ATTRIBUTES = 13;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 14;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 15;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_COLUMN__STRING_INT_INT_EATTRIBUTE = 0;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REFRESH_META_DATA = 1;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___SYNCH_DOWN = 2;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___SYNCH_UP = 3;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REFRESH = 4;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___GET_ROW__TABLEROWKEYIMPL = 5;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___CONSTRUCT_ROW = 6;

	/**
	 * The operation id for the '<em>Add Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_ROW__TABLEROW = 7;

	/**
	 * The operation id for the '<em>Remove Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REMOVE_ROW__TABLEROW = 8;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableRowImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__KEY = 1;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__MODIFICATION_LAST_SYNCH_UP = 2;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN = 3;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl <em>Data Source Jdbc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getDataSourceJdbc()
	 * @generated
	 */
	int DATA_SOURCE_JDBC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC__CONNECTED = DATA_SOURCE__CONNECTED;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.EnumModification <em>Enum Modification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnumModification()
	 * @generated
	 */
	int ENUM_MODIFICATION = 6;

	/**
	 * The meta object id for the '<em>EAttribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EAttribute
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 7;

	/**
	 * The meta object id for the '<em>Table Row Key</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRowKey()
	 * @generated
	 */
	int TABLE_ROW_KEY = 8;


	/**
	 * The meta object id for the '<em>Table Column Tentative</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.impl.TableColumnImpl
	 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableColumnTentative()
	 * @generated
	 */
	int TABLE_COLUMN_TENTATIVE = 9;

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
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__VOLATILE = 1;

	/**
	 * The feature id for the '<em><b>Row Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__ROW_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.dbsynch.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.TableGroup <em>Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Group</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup
	 * @generated
	 */
	EClass getTableGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#getName()
	 * @see #getTableGroup()
	 * @generated
	 */
	EAttribute getTableGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dbsynch.TableGroup#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#getTables()
	 * @see #getTableGroup()
	 * @generated
	 */
	EReference getTableGroup_Tables();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.TableGroup#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#getDataSource()
	 * @see #getTableGroup()
	 * @generated
	 */
	EReference getTableGroup_DataSource();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.TableGroup#refreshMetaData() <em>Refresh Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Meta Data</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#refreshMetaData()
	 * @generated
	 */
	EOperation getTableGroup__RefreshMetaData();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.TableGroup#synchDown() <em>Synch Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Down</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#synchDown()
	 * @generated
	 */
	EOperation getTableGroup__SynchDown();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.TableGroup#synchUp() <em>Synch Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synch Up</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#synchUp()
	 * @generated
	 */
	EOperation getTableGroup__SynchUp();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.TableGroup#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.TableGroup#refresh()
	 * @generated
	 */
	EOperation getTableGroup__Refresh();

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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dbsynch.Table#getTableGroup <em>Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Group</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getTableGroup()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableGroup();

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
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.dbsynch.Table#getParamTableGroupAttributes <em>Param Table Group Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Param Table Group Attributes</em>'.
	 * @see com.misc.common.moplaf.dbsynch.Table#getParamTableGroupAttributes()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ParamTableGroupAttributes();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#addColumn(java.lang.String, int, int, org.eclipse.emf.ecore.EAttribute) <em>Add Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Column</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#addColumn(java.lang.String, int, int, org.eclipse.emf.ecore.EAttribute)
	 * @generated
	 */
	EOperation getTable__AddColumn__String_int_int_EAttribute();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#addRow(com.misc.common.moplaf.dbsynch.TableRow) <em>Add Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#addRow(com.misc.common.moplaf.dbsynch.TableRow)
	 * @generated
	 */
	EOperation getTable__AddRow__TableRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#getRow(com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#getRow(com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl)
	 * @generated
	 */
	EOperation getTable__GetRow__TableRowKeyImpl();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dbsynch.Table#removeRow(com.misc.common.moplaf.dbsynch.TableRow) <em>Remove Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Row</em>' operation.
	 * @see com.misc.common.moplaf.dbsynch.Table#removeRow(com.misc.common.moplaf.dbsynch.TableRow)
	 * @generated
	 */
	EOperation getTable__RemoveRow__TableRow();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableRow#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableRow#getKey()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Key();

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
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.dbsynch.EnumModification <em>Enum Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Modification</em>'.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @generated
	 */
	EEnum getEnumModification();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EAttribute</em>'.
	 * @see org.eclipse.emf.ecore.EAttribute
	 * @model instanceClass="org.eclipse.emf.ecore.EAttribute"
	 * @generated
	 */
	EDataType getEAttribute();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl <em>Table Row Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table Row Key</em>'.
	 * @see com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl
	 * @model instanceClass="com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl"
	 * @generated
	 */
	EDataType getTableRowKey();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl <em>Table Column Tentative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table Column Tentative</em>'.
	 * @see com.misc.common.moplaf.dbsynch.impl.TableColumnImpl
	 * @model instanceClass="com.misc.common.moplaf.dbsynch.impl.TableColumnImpl"
	 * @generated
	 */
	EDataType getTableColumnTentative();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.TableColumn#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see com.misc.common.moplaf.dbsynch.TableColumn#isVolatile()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_Volatile();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__CONNECTED = eINSTANCE.getDataSource_Connected();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.impl.TableGroupImpl <em>Table Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.TableGroupImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableGroup()
		 * @generated
		 */
		EClass TABLE_GROUP = eINSTANCE.getTableGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GROUP__NAME = eINSTANCE.getTableGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_GROUP__TABLES = eINSTANCE.getTableGroup_Tables();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_GROUP__DATA_SOURCE = eINSTANCE.getTableGroup_DataSource();

		/**
		 * The meta object literal for the '<em><b>Refresh Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_GROUP___REFRESH_META_DATA = eINSTANCE.getTableGroup__RefreshMetaData();

		/**
		 * The meta object literal for the '<em><b>Synch Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_GROUP___SYNCH_DOWN = eINSTANCE.getTableGroup__SynchDown();

		/**
		 * The meta object literal for the '<em><b>Synch Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_GROUP___SYNCH_UP = eINSTANCE.getTableGroup__SynchUp();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_GROUP___REFRESH = eINSTANCE.getTableGroup__Refresh();

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
		 * The meta object literal for the '<em><b>Table Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_GROUP = eINSTANCE.getTable_TableGroup();

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
		 * The meta object literal for the '<em><b>Param Table Group Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__PARAM_TABLE_GROUP_ATTRIBUTES = eINSTANCE.getTable_ParamTableGroupAttributes();

		/**
		 * The meta object literal for the '<em><b>Key Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__KEY_COLUMNS = eINSTANCE.getTable_KeyColumns();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Add Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___ADD_COLUMN__STRING_INT_INT_EATTRIBUTE = eINSTANCE.getTable__AddColumn__String_int_int_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Refresh Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REFRESH_META_DATA = eINSTANCE.getTable__RefreshMetaData();

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
		 * The meta object literal for the '<em><b>Data Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DATA_COLUMNS = eINSTANCE.getTable_DataColumns();

		/**
		 * The meta object literal for the '<em><b>Number Of Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUMBER_OF_ROWS = eINSTANCE.getTable_NumberOfRows();

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
		 * The meta object literal for the '<em><b>Add Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___ADD_ROW__TABLEROW = eINSTANCE.getTable__AddRow__TableRow();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___GET_ROW__TABLEROWKEYIMPL = eINSTANCE.getTable__GetRow__TableRowKeyImpl();

		/**
		 * The meta object literal for the '<em><b>Construct Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___CONSTRUCT_ROW = eINSTANCE.getTable__ConstructRow();

		/**
		 * The meta object literal for the '<em><b>Remove Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REMOVE_ROW__TABLEROW = eINSTANCE.getTable__RemoveRow__TableRow();

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
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__KEY = eINSTANCE.getTableRow_Key();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.EnumModification <em>Enum Modification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.EnumModification
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEnumModification()
		 * @generated
		 */
		EEnum ENUM_MODIFICATION = eINSTANCE.getEnumModification();

		/**
		 * The meta object literal for the '<em>EAttribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EAttribute
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getEAttribute()
		 * @generated
		 */
		EDataType EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em>Table Row Key</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableRowKey()
		 * @generated
		 */
		EDataType TABLE_ROW_KEY = eINSTANCE.getTableRowKey();

		/**
		 * The meta object literal for the '<em>Table Column Tentative</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.impl.TableColumnImpl
		 * @see com.misc.common.moplaf.dbsynch.impl.DbSynchPackageImpl#getTableColumnTentative()
		 * @generated
		 */
		EDataType TABLE_COLUMN_TENTATIVE = eINSTANCE.getTableColumnTentative();

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
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__VOLATILE = eINSTANCE.getTableColumn_Volatile();

	}

} //DbSynchPackage
