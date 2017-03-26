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
package com.misc.common.moplaf.dbsynch.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchFactory;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnit;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.EnumColumnType;
import com.misc.common.moplaf.dbsynch.EnumModification;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.TableRowKey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
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
	private EClass dbSynchUnitEClass = null;

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
	private EClass dbSynchUnitAbstractEClass = null;

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
	private EEnum enumColumnTypeEEnum = null;

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
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enabledFeedbackEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType returnFeedbackEDataType = null;

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

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

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
	public EAttribute getDataSource_Connected() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
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
	public EClass getDbSynchUnit() {
		return dbSynchUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbSynchUnit_ParentUnit() {
		return (EReference)dbSynchUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnit__Refresh() {
		return dbSynchUnitEClass.getEOperations().get(0);
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
	public EReference getTable_SynchUnit() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_KeyColumns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_DataColumns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getTable_NumberOfRows() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_LastSynchDown() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_LastSynchUp() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Parent() {
		return (EReference)tableEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__GetColumn__String() {
		return tableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddColumn__boolean_String_EnumColumnType_EAttribute() {
		return tableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_TableColumn() {
		return tableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_String() {
		return tableEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_SelectSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_InsertSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_UpdateSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_DeleteSqlStatement() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ParamDbSynchUnitAttributes() {
		return (EReference)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__AddParam__EAttribute() {
		return tableEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__RefreshMetaData() {
		return tableEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__SynchDown() {
		return tableEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__SynchUp() {
		return tableEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__Refresh() {
		return tableEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__GetRow__TableRowKey() {
		return tableEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__ConstructRow() {
		return tableEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__IndexRow__TableRow() {
		return tableEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__UnindexRow__TableRow() {
		return tableEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__RefreshIndex() {
		return tableEClass.getEOperations().get(13);
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
	public EAttribute getTableRow_CurrentKey() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_IndexKey() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_LastSynchDownKey() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_LastSynchDownDeleted() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_ModificationLastSynchUp() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_ModificationNextSynchDown() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_Deleted() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(2);
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
	public EClass getTableColumn() {
		return tableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_Key() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_ColumnName() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableColumn_RowAttribute() {
		return (EReference)tableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableColumn_Table() {
		return (EReference)tableColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableColumn_ParentTableColumn() {
		return (EReference)tableColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_ColumnType() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbSynchUnitAbstract() {
		return dbSynchUnitAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbSynchUnitAbstract_Tables() {
		return (EReference)dbSynchUnitAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbSynchUnitAbstract_DataSource() {
		return (EReference)dbSynchUnitAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbSynchUnitAbstract_Name() {
		return (EAttribute)dbSynchUnitAbstractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbSynchUnitAbstract_ChildUnits() {
		return (EReference)dbSynchUnitAbstractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnitAbstract__RefreshMetaData() {
		return dbSynchUnitAbstractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnitAbstract__SynchUp() {
		return dbSynchUnitAbstractEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnitAbstract__SynchDown() {
		return dbSynchUnitAbstractEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnitAbstract__GetParamValue__EAttribute() {
		return dbSynchUnitAbstractEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnitAbstract__GetParamAttributes() {
		return dbSynchUnitAbstractEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDbSynchUnitAbstract__AddTable__EReference_EClass() {
		return dbSynchUnitAbstractEClass.getEOperations().get(5);
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
	public EEnum getEnumColumnType() {
		return enumColumnTypeEEnum;
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
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnabledFeedback() {
		return enabledFeedbackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReturnFeedback() {
		return returnFeedbackEDataType;
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
		createEAttribute(dataSourceEClass, DATA_SOURCE__CONNECTED);
		createEOperation(dataSourceEClass, DATA_SOURCE___CONNECT);
		createEOperation(dataSourceEClass, DATA_SOURCE___DISCONNECT);
		createEOperation(dataSourceEClass, DATA_SOURCE___SYNCH_DOWN_TABLE_IMPL__TABLE);
		createEOperation(dataSourceEClass, DATA_SOURCE___SYNCH_UP_TABLE_IMPL__TABLE);

		dataSourceJdbcEClass = createEClass(DATA_SOURCE_JDBC);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DATA_BASE_USER);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DATA_BASE_USER_PWD);
		createEAttribute(dataSourceJdbcEClass, DATA_SOURCE_JDBC__DEFAULT_SCHEMA);

		dbSynchUnitAbstractEClass = createEClass(DB_SYNCH_UNIT_ABSTRACT);
		createEReference(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT__TABLES);
		createEReference(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT__DATA_SOURCE);
		createEAttribute(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT__NAME);
		createEReference(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT__CHILD_UNITS);
		createEOperation(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT___REFRESH_META_DATA);
		createEOperation(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT___SYNCH_UP);
		createEOperation(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT___SYNCH_DOWN);
		createEOperation(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_VALUE__EATTRIBUTE);
		createEOperation(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT___GET_PARAM_ATTRIBUTES);
		createEOperation(dbSynchUnitAbstractEClass, DB_SYNCH_UNIT_ABSTRACT___ADD_TABLE__EREFERENCE_ECLASS);

		dbSynchUnitEClass = createEClass(DB_SYNCH_UNIT);
		createEReference(dbSynchUnitEClass, DB_SYNCH_UNIT__PARENT_UNIT);
		createEOperation(dbSynchUnitEClass, DB_SYNCH_UNIT___REFRESH);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__SYNCH_UNIT);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__KEY_COLUMNS);
		createEReference(tableEClass, TABLE__DATA_COLUMNS);
		createEAttribute(tableEClass, TABLE__TABLE_NAME);
		createEAttribute(tableEClass, TABLE__WHERE_CLAUSE);
		createEReference(tableEClass, TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES);
		createEReference(tableEClass, TABLE__ROWS);
		createEAttribute(tableEClass, TABLE__SELECT_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__INSERT_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__UPDATE_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__DELETE_SQL_STATEMENT);
		createEAttribute(tableEClass, TABLE__NUMBER_OF_ROWS);
		createEAttribute(tableEClass, TABLE__LAST_SYNCH_DOWN);
		createEAttribute(tableEClass, TABLE__LAST_SYNCH_UP);
		createEReference(tableEClass, TABLE__PARENT);
		createEOperation(tableEClass, TABLE___GET_COLUMN__STRING);
		createEOperation(tableEClass, TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE);
		createEOperation(tableEClass, TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_TABLECOLUMN);
		createEOperation(tableEClass, TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_STRING);
		createEOperation(tableEClass, TABLE___ADD_PARAM__EATTRIBUTE);
		createEOperation(tableEClass, TABLE___REFRESH_META_DATA);
		createEOperation(tableEClass, TABLE___SYNCH_DOWN);
		createEOperation(tableEClass, TABLE___SYNCH_UP);
		createEOperation(tableEClass, TABLE___REFRESH);
		createEOperation(tableEClass, TABLE___GET_ROW__TABLEROWKEY);
		createEOperation(tableEClass, TABLE___CONSTRUCT_ROW);
		createEOperation(tableEClass, TABLE___INDEX_ROW__TABLEROW);
		createEOperation(tableEClass, TABLE___UNINDEX_ROW__TABLEROW);
		createEOperation(tableEClass, TABLE___REFRESH_INDEX);

		tableColumnEClass = createEClass(TABLE_COLUMN);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__KEY);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__COLUMN_NAME);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__COLUMN_TYPE);
		createEReference(tableColumnEClass, TABLE_COLUMN__ROW_ATTRIBUTE);
		createEReference(tableColumnEClass, TABLE_COLUMN__TABLE);
		createEReference(tableColumnEClass, TABLE_COLUMN__PARENT_TABLE_COLUMN);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__TABLE);
		createEAttribute(tableRowEClass, TABLE_ROW__CURRENT_KEY);
		createEAttribute(tableRowEClass, TABLE_ROW__DELETED);
		createEAttribute(tableRowEClass, TABLE_ROW__INDEX_KEY);
		createEAttribute(tableRowEClass, TABLE_ROW__LAST_SYNCH_DOWN_KEY);
		createEAttribute(tableRowEClass, TABLE_ROW__LAST_SYNCH_DOWN_DELETED);
		createEAttribute(tableRowEClass, TABLE_ROW__MODIFICATION_LAST_SYNCH_UP);
		createEAttribute(tableRowEClass, TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN);
		createEOperation(tableRowEClass, TABLE_ROW___REFRESH);

		// Create enums
		enumModificationEEnum = createEEnum(ENUM_MODIFICATION);
		enumColumnTypeEEnum = createEEnum(ENUM_COLUMN_TYPE);

		// Create data types
		tableRowKeyEDataType = createEDataType(TABLE_ROW_KEY);
		objectEDataType = createEDataType(OBJECT);
		enabledFeedbackEDataType = createEDataType(ENABLED_FEEDBACK);
		returnFeedbackEDataType = createEDataType(RETURN_FEEDBACK);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSourceEClass.getESuperTypes().add(this.getDbSynchUnitAbstract());
		dataSourceJdbcEClass.getESuperTypes().add(this.getDataSource());
		dbSynchUnitEClass.getESuperTypes().add(this.getDbSynchUnitAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Connected(), ecorePackage.getEBoolean(), "Connected", null, 0, 1, DataSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataSource__Connect(), this.getReturnFeedback(), "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSource__Disconnect(), this.getReturnFeedback(), "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDataSource__SynchDownTableImpl__Table(), this.getReturnFeedback(), "synchDownTableImpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSource__SynchUpTableImpl__Table(), this.getReturnFeedback(), "synchUpTableImpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTable(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSourceJdbcEClass, DataSourceJdbc.class, "DataSourceJdbc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbc_DataBaseUser(), ecorePackage.getEString(), "DataBaseUser", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbc_DataBaseUserPwd(), ecorePackage.getEString(), "DataBaseUserPwd", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbc_DefaultSchema(), ecorePackage.getEString(), "DefaultSchema", null, 0, 1, DataSourceJdbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbSynchUnitAbstractEClass, DbSynchUnitAbstract.class, "DbSynchUnitAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDbSynchUnitAbstract_Tables(), this.getTable(), null, "Tables", null, 0, -1, DbSynchUnitAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDbSynchUnitAbstract_DataSource(), this.getDataSource(), null, "DataSource", null, 0, 1, DbSynchUnitAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbSynchUnitAbstract_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DbSynchUnitAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDbSynchUnitAbstract_ChildUnits(), this.getDbSynchUnitAbstract(), null, "ChildUnits", null, 0, -1, DbSynchUnitAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getDbSynchUnitAbstract__RefreshMetaData(), null, "refreshMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDbSynchUnitAbstract__SynchUp(), this.getReturnFeedback(), "synchUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDbSynchUnitAbstract__SynchDown(), this.getReturnFeedback(), "synchDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDbSynchUnitAbstract__GetParamValue__EAttribute(), this.getObject(), "getParamValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDbSynchUnitAbstract__GetParamAttributes(), this.getObject(), "getParamAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDbSynchUnitAbstract__AddTable__EReference_EClass(), null, "addTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEReference(), "reference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "class_", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dbSynchUnitEClass, DbSynchUnit.class, "DbSynchUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDbSynchUnit_ParentUnit(), this.getDbSynchUnitAbstract(), null, "ParentUnit", null, 1, 1, DbSynchUnit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getDbSynchUnit__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_SynchUnit(), this.getDbSynchUnitAbstract(), null, "SynchUnit", null, 1, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getTableColumn(), null, "Columns", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTable_KeyColumns(), this.getTableColumn(), null, "KeyColumns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_DataColumns(), this.getTableColumn(), null, "DataColumns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TableName(), ecorePackage.getEString(), "TableName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WhereClause(), ecorePackage.getEString(), "WhereClause", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_ParamDbSynchUnitAttributes(), ecorePackage.getEAttribute(), null, "ParamDbSynchUnitAttributes", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Rows(), this.getTableRow(), null, "Rows", null, 0, -1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SelectSqlStatement(), ecorePackage.getEString(), "SelectSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_InsertSqlStatement(), ecorePackage.getEString(), "InsertSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_UpdateSqlStatement(), ecorePackage.getEString(), "UpdateSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_DeleteSqlStatement(), ecorePackage.getEString(), "DeleteSqlStatement", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_NumberOfRows(), ecorePackage.getEInt(), "NumberOfRows", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_LastSynchDown(), ecorePackage.getEDate(), "LastSynchDown", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_LastSynchUp(), ecorePackage.getEDate(), "LastSynchUp", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Parent(), this.getTable(), null, "Parent", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTable__GetColumn__String(), this.getTableColumn(), "getColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__AddColumn__boolean_String_EnumColumnType_EAttribute(), this.getTableColumn(), "addColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "Key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnumColumnType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_TableColumn(), this.getTableColumn(), "addColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "Key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnumColumnType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableColumn(), "parentColumn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__AddColumn__boolean_String_EnumColumnType_EAttribute_String(), this.getTableColumn(), "addColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "Key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnumColumnType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "parentColumn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__AddParam__EAttribute(), null, "addParam", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "dbSynchAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__RefreshMetaData(), null, "refreshMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__SynchDown(), this.getReturnFeedback(), "synchDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__SynchUp(), this.getReturnFeedback(), "synchUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__GetRow__TableRowKey(), this.getTableRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRowKey(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__ConstructRow(), this.getTableRow(), "constructRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__IndexRow__TableRow(), null, "indexRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTable__UnindexRow__TableRow(), null, "unindexRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTable__RefreshIndex(), null, "refreshIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableColumnEClass, TableColumn.class, "TableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumn_Key(), ecorePackage.getEBoolean(), "Key", null, 0, 1, TableColumn.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_ColumnName(), ecorePackage.getEString(), "ColumnName", "", 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumn_ColumnType(), this.getEnumColumnType(), "ColumnType", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableColumn_RowAttribute(), ecorePackage.getEAttribute(), null, "RowAttribute", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableColumn_Table(), this.getTable(), null, "Table", null, 1, 1, TableColumn.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTableColumn_ParentTableColumn(), this.getTableColumn(), null, "ParentTableColumn", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Table(), this.getTable(), null, "Table", null, 0, 1, TableRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_CurrentKey(), this.getTableRowKey(), "CurrentKey", null, 0, 1, TableRow.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_Deleted(), ecorePackage.getEBoolean(), "Deleted", "true", 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_IndexKey(), this.getTableRowKey(), "IndexKey", null, 0, 1, TableRow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_LastSynchDownKey(), this.getTableRowKey(), "LastSynchDownKey", null, 0, 1, TableRow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_LastSynchDownDeleted(), ecorePackage.getEBoolean(), "LastSynchDownDeleted", null, 0, 1, TableRow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_ModificationLastSynchUp(), this.getEnumModification(), "ModificationLastSynchUp", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_ModificationNextSynchDown(), this.getEnumModification(), "ModificationNextSynchDown", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableRow__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumModificationEEnum, EnumModification.class, "EnumModification");
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_NONE);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_CREATE);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_UPDATE);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_DELETE);
		addEEnumLiteral(enumModificationEEnum, EnumModification.ENUM_MODIFICATION_MUTATEKEY);

		initEEnum(enumColumnTypeEEnum, EnumColumnType.class, "EnumColumnType");
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_BOOLEAN);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_INT);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_BIGINT);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_FLOAT);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_DOUBLE);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_BIGFLOAT);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_CHAR);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_DATE);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_TIME);
		addEEnumLiteral(enumColumnTypeEEnum, EnumColumnType.ENUM_COLUMN_TYPE_DATETIME);

		// Initialize data types
		initEDataType(tableRowKeyEDataType, TableRowKey.class, "TableRowKey", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enabledFeedbackEDataType, EnabledFeedback.class, "EnabledFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(returnFeedbackEDataType, ReturnFeedback.class, "ReturnFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DbSynchPackageImpl
