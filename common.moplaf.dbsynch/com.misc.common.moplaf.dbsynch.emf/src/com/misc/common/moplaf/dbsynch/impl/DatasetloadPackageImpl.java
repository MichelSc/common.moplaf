/**
 */
package com.misc.common.moplaf.dbsynch.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DatasetloadFactory;
import com.misc.common.moplaf.dbsynch.DatasetloadPackage;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableGroup;
import com.misc.common.moplaf.dbsynch.TableRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetloadPackageImpl extends EPackageImpl implements DatasetloadPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceJdbcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eAttributeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableRowKeyEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.dbsynch.DatasetloadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasetloadPackageImpl() {
		super(eNS_URI, DatasetloadFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatasetloadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasetloadPackage init() {
		if (isInited) return (DatasetloadPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetloadPackage.eNS_URI);

		// Obtain or create and register package
		DatasetloadPackageImpl theDatasetloadPackage = (DatasetloadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatasetloadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatasetloadPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDatasetloadPackage.createPackageContents();

		// Initialize created meta-data
		theDatasetloadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasetloadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasetloadPackage.eNS_URI, theDatasetloadPackage);
		return theDatasetloadPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Name() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Connected() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSource__Connect() {
		return dataSourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSource__Disconnect() {
		return dataSourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSource__LoadTableImpl__Table() {
		return dataSourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableGroup() {
		return tableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGroup_Name() {
		return (EAttribute)tableGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableGroup_Tables() {
		return (EReference)tableGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableGroup_DataSource() {
		return (EReference)tableGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableGroup__Load() {
		return tableGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableGroup__Refresh() {
		return tableGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ColumnTableRowAttributes() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_TableGroup() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_SQLStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ParamTableGroupAttributes() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_KeyColumns() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_LastLoad() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_NumberOfRows() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__Load() {
		return tableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__NewRow() {
		return tableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddRow__TableRow() {
		return tableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__GetRow__TableRowKeyImpl() {
		return tableEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__RemoveRow__TableRow() {
		return tableEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__Refresh() {
		return tableEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_RowNumber() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRow_Table() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_Key() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_NewRow() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableRow__Refresh() {
		return tableRowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceJdbc() {
		return dataSourceJdbcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbc_DataBaseUser() {
		return (EAttribute)dataSourceJdbcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbc_DataBaseUserPwd() {
		return (EAttribute)dataSourceJdbcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbc_DefaultSchema() {
		return (EAttribute)dataSourceJdbcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEAttribute() {
		return eAttributeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTableRowKey() {
		return tableRowKeyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetloadFactory getDatasetloadFactory() {
		return (DatasetloadFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__NAME);
		createEAttribute(dataSourceEClass, DATA_SOURCE__CONNECTED);
		createEOperation(dataSourceEClass, DATA_SOURCE___CONNECT);
		createEOperation(dataSourceEClass, DATA_SOURCE___DISCONNECT);
		createEOperation(dataSourceEClass, DATA_SOURCE___LOAD_TABLE_IMPL__TABLE);

		tableGroupEClass = createEClass(TABLE_GROUP);
		createEAttribute(tableGroupEClass, TABLE_GROUP__NAME);
		createEReference(tableGroupEClass, TABLE_GROUP__TABLES);
		createEReference(tableGroupEClass, TABLE_GROUP__DATA_SOURCE);
		createEOperation(tableGroupEClass, TABLE_GROUP___LOAD);
		createEOperation(tableGroupEClass, TABLE_GROUP___REFRESH);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NAME);
		createEReference(tableEClass, TABLE__TABLE_GROUP);
		createEReference(tableEClass, TABLE__ROWS);
		createEAttribute(tableEClass, TABLE__PARAM_TABLE_GROUP_ATTRIBUTES);
		createEAttribute(tableEClass, TABLE__SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__COLUMN_TABLE_ROW_ATTRIBUTES);
		createEAttribute(tableEClass, TABLE__KEY_COLUMNS);
		createEAttribute(tableEClass, TABLE__LAST_LOAD);
		createEAttribute(tableEClass, TABLE__NUMBER_OF_ROWS);
		createEOperation(tableEClass, TABLE___LOAD);
		createEOperation(tableEClass, TABLE___NEW_ROW);
		createEOperation(tableEClass, TABLE___ADD_ROW__TABLEROW);
		createEOperation(tableEClass, TABLE___GET_ROW__TABLEROWKEYIMPL);
		createEOperation(tableEClass, TABLE___REMOVE_ROW__TABLEROW);
		createEOperation(tableEClass, TABLE___REFRESH);

		tableRowEClass = createEClass(TABLE_ROW);
		createEAttribute(tableRowEClass, TABLE_ROW__ROW_NUMBER);
		createEReference(tableRowEClass, TABLE_ROW__TABLE);
		createEAttribute(tableRowEClass, TABLE_ROW__KEY);
		createEAttribute(tableRowEClass, TABLE_ROW__NEW_ROW);
		createEOperation(tableRowEClass, TABLE_ROW___REFRESH);

		dataSourceJdbcEClass = createEClass(DATA_SOURCE_JDBC);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DATA_BASE_USER);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DATA_BASE_USER_PWD);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DEFAULT_SCHEMA);

		// Create data types
		eAttributeEDataType = createEDataType(EATTRIBUTE);
		tableRowKeyEDataType = createEDataType(TABLE_ROW_KEY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSourceJdbcEClass.getESuperTypes().add(this.getDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Connected(), ecorePackage.getEBoolean(), "Connected", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataSource__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSource__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDataSource__LoadTableImpl__Table(), null, "loadTableImpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableGroupEClass, TableGroup.class, "TableGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableGroup_Name(), ecorePackage.getEString(), "Name", null, 0, 1, TableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableGroup_Tables(), this.getTable(), null, "Tables", null, 0, -1, TableGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTableGroup_DataSource(), this.getDataSource(), null, "DataSource", null, 0, 1, TableGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTableGroup__Load(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableGroup__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTable_TableGroup(), this.getTableGroup(), null, "TableGroup", null, 1, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Rows(), this.getTableRow(), null, "Rows", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ParamTableGroupAttributes(), this.getEAttribute(), "ParamTableGroupAttributes", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SQLStatement(), ecorePackage.getEString(), "SQLStatement", null, 0, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ColumnTableRowAttributes(), this.getEAttribute(), "ColumnTableRowAttributes", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_KeyColumns(), ecorePackage.getEInt(), "KeyColumns", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_LastLoad(), ecorePackage.getEDate(), "LastLoad", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_NumberOfRows(), ecorePackage.getEInt(), "NumberOfRows", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTable__Load(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__NewRow(), this.getTableRow(), "newRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__AddRow__TableRow(), null, "addRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__GetRow__TableRowKeyImpl(), this.getTableRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRowKey(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__RemoveRow__TableRow(), null, "removeRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableRow_RowNumber(), ecorePackage.getEInt(), "RowNumber", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableRow_Table(), this.getTable(), null, "Table", null, 0, 1, TableRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_Key(), this.getTableRowKey(), "Key", null, 0, 1, TableRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_NewRow(), ecorePackage.getEBoolean(), "NewRow", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableRow__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSourceJdbcEClass, DataSourceJdbc.class, "DataSourceJdbc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbc_DataBaseUser(), ecorePackage.getEString(), "DataBaseUser", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbc_DataBaseUserPwd(), ecorePackage.getEString(), "DataBaseUserPwd", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbc_DefaultSchema(), ecorePackage.getEString(), "DefaultSchema", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eAttributeEDataType, EAttribute.class, "EAttribute", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tableRowKeyEDataType, TableRowKeyImpl.class, "TableRowKey", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatasetloadPackageImpl
