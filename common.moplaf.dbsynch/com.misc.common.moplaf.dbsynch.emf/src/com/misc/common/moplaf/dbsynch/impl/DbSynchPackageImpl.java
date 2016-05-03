/**
 */
package com.misc.common.moplaf.dbsynch.impl;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchFactory;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.EnumModification;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;
import com.misc.common.moplaf.dbsynch.TableGroup;
import com.misc.common.moplaf.dbsynch.TableRow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbSynchPackageImpl extends EPackageImpl implements DbSynchPackage {
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
	private EClass tableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumModificationEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableColumnTentativeEDataType = null;

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
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbSynchPackageImpl() {
		super(eNS_URI, DbSynchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DbSynchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbSynchPackage init() {
		if (isInited) return (DbSynchPackage)EPackage.Registry.INSTANCE.getEPackage(DbSynchPackage.eNS_URI);

		// Obtain or create and register package
		DbSynchPackageImpl theDbSynchPackage = (DbSynchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbSynchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbSynchPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDbSynchPackage.createPackageContents();

		// Initialize created meta-data
		theDbSynchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbSynchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbSynchPackage.eNS_URI, theDbSynchPackage);
		return theDbSynchPackage;
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
	public EOperation getDataSource__SynchDownTableImpl__Table() {
		return dataSourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSource__SynchUpTableImpl__Table() {
		return dataSourceEClass.getEOperations().get(3);
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
	public EOperation getTableGroup__RefreshMetaData() {
		return tableGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableGroup__SynchDown() {
		return tableGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableGroup__SynchUp() {
		return tableGroupEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableGroup__Refresh() {
		return tableGroupEClass.getEOperations().get(3);
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
	public EReference getTable_TableGroup() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_TableName() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_WhereClause() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_SelectSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_InsertSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_UpdateSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_DeleteSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ParamTableGroupAttributes() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_KeyColumns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddColumn__String_int_int_EAttribute() {
		return tableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__RefreshMetaData() {
		return tableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_LastSynchDown() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_LastSynchUp() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_DataColumns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_NumberOfRows() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__SynchDown() {
		return tableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__SynchUp() {
		return tableEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__Refresh() {
		return tableEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddRow__TableRow() {
		return tableEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__GetRow__TableRowKeyImpl() {
		return tableEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__ConstructRow() {
		return tableEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__RemoveRow__TableRow() {
		return tableEClass.getEOperations().get(8);
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
	public EReference getTableRow_Table() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_Key() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_ModificationLastSynchUp() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_ModificationNextSynchDown() {
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
	public EEnum getEnumModification() {
		return enumModificationEEnum;
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
	public EDataType getTableColumnTentative() {
		return tableColumnTentativeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumn() {
		return tableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_ColumnName() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_RowAttribute() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_Volatile() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbSynchFactory getDbSynchFactory() {
		return (DbSynchFactory)getEFactoryInstance();
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
		createEOperation(dataSourceEClass, DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE);
		createEOperation(dataSourceEClass, DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE);

		tableGroupEClass = createEClass(TABLE_GROUP);
		createEAttribute(tableGroupEClass, TABLE_GROUP__NAME);
		createEReference(tableGroupEClass, TABLE_GROUP__TABLES);
		createEReference(tableGroupEClass, TABLE_GROUP__DATA_SOURCE);
		createEOperation(tableGroupEClass, TABLE_GROUP___REFRESH_META_DATA);
		createEOperation(tableGroupEClass, TABLE_GROUP___SYNCH_DOWN);
		createEOperation(tableGroupEClass, TABLE_GROUP___SYNCH_UP);
		createEOperation(tableGroupEClass, TABLE_GROUP___REFRESH);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TABLE_GROUP);
		createEReference(tableEClass, TABLE__KEY_COLUMNS);
		createEReference(tableEClass, TABLE__DATA_COLUMNS);
		createEReference(tableEClass, TABLE__ROWS);
		createEAttribute(tableEClass, TABLE__TABLE_NAME);
		createEAttribute(tableEClass, TABLE__WHERE_CLAUSE);
		createEAttribute(tableEClass, TABLE__NUMBER_OF_ROWS);
		createEAttribute(tableEClass, TABLE__LAST_SYNCH_DOWN);
		createEAttribute(tableEClass, TABLE__LAST_SYNCH_UP);
		createEAttribute(tableEClass, TABLE__SELECT_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__INSERT_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__UPDATE_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__DELETE_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__PARAM_TABLE_GROUP_ATTRIBUTES);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEOperation(tableEClass, TABLE___ADD_COLUMN__STRING_INT_INT_EATTRIBUTE);
		createEOperation(tableEClass, TABLE___REFRESH_META_DATA);
		createEOperation(tableEClass, TABLE___SYNCH_DOWN);
		createEOperation(tableEClass, TABLE___SYNCH_UP);
		createEOperation(tableEClass, TABLE___REFRESH);
		createEOperation(tableEClass, TABLE___GET_ROW__TABLEROWKEYIMPL);
		createEOperation(tableEClass, TABLE___CONSTRUCT_ROW);
		createEOperation(tableEClass, TABLE___ADD_ROW__TABLEROW);
		createEOperation(tableEClass, TABLE___REMOVE_ROW__TABLEROW);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__TABLE);
		createEAttribute(tableRowEClass, TABLE_ROW__KEY);
		createEAttribute(tableRowEClass, TABLE_ROW__MODIFICATION_LAST_SYNCH_UP);
		createEAttribute(tableRowEClass, TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN);
		createEOperation(tableRowEClass, TABLE_ROW___REFRESH);

		dataSourceJdbcEClass = createEClass(DATA_SOURCE_JDBC);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DATA_BASE_USER);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DATA_BASE_USER_PWD);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DEFAULT_SCHEMA);

		tableColumnEClass = createEClass(TABLE_COLUMN);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__COLUMN_NAME);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__ROW_ATTRIBUTE);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__VOLATILE);

		// Create enums
		enumModificationEEnum = createEEnum(ENUM_MODIFICATION);

		// Create data types
		eAttributeEDataType = createEDataType(EATTRIBUTE);
		tableRowKeyEDataType = createEDataType(TABLE_ROW_KEY);
		tableColumnTentativeEDataType = createEDataType(TABLE_COLUMN_TENTATIVE);
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

		EOperation op = initEOperation(getDataSource__SynchDownTableImpl__Table(), null, "synchDownTableImpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSource__SynchUpTableImpl__Table(), null, "synchUpTableImpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableGroupEClass, TableGroup.class, "TableGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableGroup_Name(), ecorePackage.getEString(), "Name", null, 0, 1, TableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableGroup_Tables(), this.getTable(), null, "Tables", null, 0, -1, TableGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTableGroup_DataSource(), this.getDataSource(), null, "DataSource", null, 0, 1, TableGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTableGroup__RefreshMetaData(), null, "refreshMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableGroup__SynchDown(), null, "synchDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableGroup__SynchUp(), null, "synchUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableGroup__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_TableGroup(), this.getTableGroup(), null, "TableGroup", null, 1, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTable_KeyColumns(), this.getTableColumn(), null, "KeyColumns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_DataColumns(), this.getTableColumn(), null, "DataColumns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Rows(), this.getTableRow(), null, "Rows", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TableName(), ecorePackage.getEString(), "TableName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WhereClause(), ecorePackage.getEString(), "WhereClause", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_NumberOfRows(), ecorePackage.getEInt(), "NumberOfRows", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_LastSynchDown(), ecorePackage.getEDate(), "LastSynchDown", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_LastSynchUp(), ecorePackage.getEDate(), "LastSynchUp", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SelectSqlStatement(), ecorePackage.getEString(), "SelectSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_InsertSqlStatement(), ecorePackage.getEString(), "InsertSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_UpdateSqlStatement(), ecorePackage.getEString(), "UpdateSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_DeleteSqlStatement(), ecorePackage.getEString(), "DeleteSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ParamTableGroupAttributes(), this.getEAttribute(), "ParamTableGroupAttributes", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getTableColumn(), null, "Columns", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTable__AddColumn__String_int_int_EAttribute(), null, "addColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "columnNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "keyNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__RefreshMetaData(), null, "refreshMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__SynchDown(), null, "synchDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__SynchUp(), null, "synchUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__GetRow__TableRowKeyImpl(), this.getTableRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRowKey(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__ConstructRow(), this.getTableRow(), "constructRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__AddRow__TableRow(), null, "addRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__RemoveRow__TableRow(), null, "removeRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Table(), this.getTable(), null, "Table", null, 0, 1, TableRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_Key(), this.getTableRowKey(), "Key", null, 0, 1, TableRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_ModificationLastSynchUp(), this.getEnumModification(), "ModificationLastSynchUp", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_ModificationNextSynchDown(), this.getEnumModification(), "ModificationNextSynchDown", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableRow__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSourceJdbcEClass, DataSourceJdbc.class, "DataSourceJdbc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbc_DataBaseUser(), ecorePackage.getEString(), "DataBaseUser", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbc_DataBaseUserPwd(), ecorePackage.getEString(), "DataBaseUserPwd", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbc_DefaultSchema(), ecorePackage.getEString(), "DefaultSchema", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnEClass, TableColumn.class, "TableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumn_ColumnName(), ecorePackage.getEString(), "ColumnName", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_RowAttribute(), this.getEAttribute(), "RowAttribute", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_Volatile(), ecorePackage.getEBoolean(), "Volatile", "false", 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumModificationEEnum, EnumModification.class, "EnumModification");
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_NONE);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_INSERT);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_UPDATE);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_DELETE);

		// Initialize data types
		initEDataType(eAttributeEDataType, EAttribute.class, "EAttribute", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tableRowKeyEDataType, TableRowKeyImpl.class, "TableRowKey", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tableColumnTentativeEDataType, TableColumnImpl.class, "TableColumnTentative", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DbSynchPackageImpl
