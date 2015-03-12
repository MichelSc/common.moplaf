/**
 */
package com.misc.common.moplaf.datasetload;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.misc.common.moplaf.datasetload.DatasetloadFactory
 * @model kind="package"
 * @generated
 */
public interface DatasetloadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datasetload";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.datasetload";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "load";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetloadPackage eINSTANCE = com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datasetload.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getDataSource()
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
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___LOAD_TABLE_IMPL__TABLE = 2;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datasetload.impl.TableGroupImpl <em>Table Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datasetload.impl.TableGroupImpl
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTableGroup()
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
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP___LOAD = 0;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP___REFRESH = 1;

	/**
	 * The number of operations of the '<em>Table Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GROUP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datasetload.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 2;

	/**
	 * The feature id for the '<em><b>Param Table Group Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARAM_TABLE_GROUP_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>SQL Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SQL_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Column Table Row Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN_TABLE_ROW_ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__KEY_COLUMNS = 6;

	/**
	 * The feature id for the '<em><b>Last Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAST_LOAD = 7;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUMBER_OF_ROWS = 8;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___LOAD = 0;

	/**
	 * The operation id for the '<em>New Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___NEW_ROW = 1;

	/**
	 * The operation id for the '<em>Add Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___ADD_ROW__TABLEROW = 2;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___GET_ROW__TABLEROWKEYIMPL = 3;

	/**
	 * The operation id for the '<em>Remove Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REMOVE_ROW__TABLEROW = 4;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___REFRESH = 5;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datasetload.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datasetload.impl.TableRowImpl
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 3;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ROW_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__KEY = 2;

	/**
	 * The feature id for the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__NEW_ROW = 3;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl <em>Data Source Jdbc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getDataSourceJdbc()
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
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC___LOAD_TABLE_IMPL__TABLE = DATA_SOURCE___LOAD_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Data Source Jdbc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '<em>EAttribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EAttribute
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 5;


	/**
	 * The meta object id for the '<em>Table Row Key</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl
	 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTableRowKey()
	 * @generated
	 */
	int TABLE_ROW_KEY = 6;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datasetload.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.DataSource#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSource#isConnected()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Connected();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.DataSource#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.DataSource#connect()
	 * @generated
	 */
	EOperation getDataSource__Connect();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.DataSource#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.DataSource#disconnect()
	 * @generated
	 */
	EOperation getDataSource__Disconnect();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.DataSource#loadTableImpl(com.misc.common.moplaf.datasetload.Table) <em>Load Table Impl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Table Impl</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.DataSource#loadTableImpl(com.misc.common.moplaf.datasetload.Table)
	 * @generated
	 */
	EOperation getDataSource__LoadTableImpl__Table();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datasetload.TableGroup <em>Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Group</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableGroup
	 * @generated
	 */
	EClass getTableGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.TableGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableGroup#getName()
	 * @see #getTableGroup()
	 * @generated
	 */
	EAttribute getTableGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.datasetload.TableGroup#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableGroup#getTables()
	 * @see #getTableGroup()
	 * @generated
	 */
	EReference getTableGroup_Tables();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datasetload.TableGroup#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableGroup#getDataSource()
	 * @see #getTableGroup()
	 * @generated
	 */
	EReference getTableGroup_DataSource();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.TableGroup#load() <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.TableGroup#load()
	 * @generated
	 */
	EOperation getTableGroup__Load();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.TableGroup#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.TableGroup#refresh()
	 * @generated
	 */
	EOperation getTableGroup__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datasetload.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.datasetload.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rows</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.datasetload.Table#getColumnTableRowAttributes <em>Column Table Row Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Table Row Attributes</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getColumnTableRowAttributes()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ColumnTableRowAttributes();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datasetload.Table#getTableGroup <em>Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Group</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getTableGroup()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.Table#getSQLStatement <em>SQL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SQL Statement</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getSQLStatement()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_SQLStatement();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.datasetload.Table#getParamTableGroupAttributes <em>Param Table Group Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Param Table Group Attributes</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getParamTableGroupAttributes()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ParamTableGroupAttributes();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.datasetload.Table#getKeyColumns <em>Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key Columns</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getKeyColumns()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_KeyColumns();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.Table#getLastLoad <em>Last Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Load</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getLastLoad()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_LastLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.Table#getNumberOfRows <em>Number Of Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rows</em>'.
	 * @see com.misc.common.moplaf.datasetload.Table#getNumberOfRows()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NumberOfRows();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.Table#load() <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.Table#load()
	 * @generated
	 */
	EOperation getTable__Load();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.Table#newRow() <em>New Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Row</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.Table#newRow()
	 * @generated
	 */
	EOperation getTable__NewRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.Table#addRow(com.misc.common.moplaf.datasetload.TableRow) <em>Add Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Row</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.Table#addRow(com.misc.common.moplaf.datasetload.TableRow)
	 * @generated
	 */
	EOperation getTable__AddRow__TableRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.Table#getRow(com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.Table#getRow(com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl)
	 * @generated
	 */
	EOperation getTable__GetRow__TableRowKeyImpl();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.Table#removeRow(com.misc.common.moplaf.datasetload.TableRow) <em>Remove Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Row</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.Table#removeRow(com.misc.common.moplaf.datasetload.TableRow)
	 * @generated
	 */
	EOperation getTable__RemoveRow__TableRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.Table#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.Table#refresh()
	 * @generated
	 */
	EOperation getTable__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datasetload.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.TableRow#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableRow#getRowNumber()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_RowNumber();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datasetload.TableRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableRow#getTable()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Table();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.TableRow#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableRow#getKey()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.TableRow#isNewRow <em>New Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Row</em>'.
	 * @see com.misc.common.moplaf.datasetload.TableRow#isNewRow()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_NewRow();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datasetload.TableRow#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.datasetload.TableRow#refresh()
	 * @generated
	 */
	EOperation getTableRow__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc <em>Data Source Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Jdbc</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSourceJdbc
	 * @generated
	 */
	EClass getDataSourceJdbc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUser <em>Data Base User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base User</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUser()
	 * @see #getDataSourceJdbc()
	 * @generated
	 */
	EAttribute getDataSourceJdbc_DataBaseUser();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUserPwd <em>Data Base User Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base User Pwd</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUserPwd()
	 * @see #getDataSourceJdbc()
	 * @generated
	 */
	EAttribute getDataSourceJdbc_DataBaseUserPwd();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDefaultSchema <em>Default Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Schema</em>'.
	 * @see com.misc.common.moplaf.datasetload.DataSourceJdbc#getDefaultSchema()
	 * @see #getDataSourceJdbc()
	 * @generated
	 */
	EAttribute getDataSourceJdbc_DefaultSchema();

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
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl <em>Table Row Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table Row Key</em>'.
	 * @see com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl
	 * @model instanceClass="com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl"
	 * @generated
	 */
	EDataType getTableRowKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasetloadFactory getDatasetloadFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.datasetload.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getDataSource()
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
		 * The meta object literal for the '<em><b>Load Table Impl</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___LOAD_TABLE_IMPL__TABLE = eINSTANCE.getDataSource__LoadTableImpl__Table();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datasetload.impl.TableGroupImpl <em>Table Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datasetload.impl.TableGroupImpl
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTableGroup()
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
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_GROUP___LOAD = eINSTANCE.getTableGroup__Load();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_GROUP___REFRESH = eINSTANCE.getTableGroup__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datasetload.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datasetload.impl.TableImpl
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Column Table Row Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__COLUMN_TABLE_ROW_ATTRIBUTES = eINSTANCE.getTable_ColumnTableRowAttributes();

		/**
		 * The meta object literal for the '<em><b>Table Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_GROUP = eINSTANCE.getTable_TableGroup();

		/**
		 * The meta object literal for the '<em><b>SQL Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SQL_STATEMENT = eINSTANCE.getTable_SQLStatement();

		/**
		 * The meta object literal for the '<em><b>Param Table Group Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__PARAM_TABLE_GROUP_ATTRIBUTES = eINSTANCE.getTable_ParamTableGroupAttributes();

		/**
		 * The meta object literal for the '<em><b>Key Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__KEY_COLUMNS = eINSTANCE.getTable_KeyColumns();

		/**
		 * The meta object literal for the '<em><b>Last Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__LAST_LOAD = eINSTANCE.getTable_LastLoad();

		/**
		 * The meta object literal for the '<em><b>Number Of Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUMBER_OF_ROWS = eINSTANCE.getTable_NumberOfRows();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___LOAD = eINSTANCE.getTable__Load();

		/**
		 * The meta object literal for the '<em><b>New Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___NEW_ROW = eINSTANCE.getTable__NewRow();

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
		 * The meta object literal for the '<em><b>Remove Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REMOVE_ROW__TABLEROW = eINSTANCE.getTable__RemoveRow__TableRow();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___REFRESH = eINSTANCE.getTable__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datasetload.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datasetload.impl.TableRowImpl
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Row Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__ROW_NUMBER = eINSTANCE.getTableRow_RowNumber();

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
		 * The meta object literal for the '<em><b>New Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__NEW_ROW = eINSTANCE.getTableRow_NewRow();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW___REFRESH = eINSTANCE.getTableRow__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl <em>Data Source Jdbc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getDataSourceJdbc()
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
		 * The meta object literal for the '<em>EAttribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EAttribute
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getEAttribute()
		 * @generated
		 */
		EDataType EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em>Table Row Key</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl
		 * @see com.misc.common.moplaf.datasetload.impl.DatasetloadPackageImpl#getTableRowKey()
		 * @generated
		 */
		EDataType TABLE_ROW_KEY = eINSTANCE.getTableRowKey();

	}

} //DatasetloadPackage
