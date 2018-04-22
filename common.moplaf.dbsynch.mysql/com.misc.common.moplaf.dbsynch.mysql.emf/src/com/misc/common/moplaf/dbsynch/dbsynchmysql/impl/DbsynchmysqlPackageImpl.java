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
package com.misc.common.moplaf.dbsynch.dbsynchmysql.impl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql;
import com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlFactory;
import com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbsynchmysqlPackageImpl extends EPackageImpl implements DbsynchmysqlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceJdbcMySqlEClass = null;

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
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbsynchmysqlPackageImpl() {
		super(eNS_URI, DbsynchmysqlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DbsynchmysqlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbsynchmysqlPackage init() {
		if (isInited) return (DbsynchmysqlPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchmysqlPackage.eNS_URI);

		// Obtain or create and register package
		DbsynchmysqlPackageImpl theDbsynchmysqlPackage = (DbsynchmysqlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbsynchmysqlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbsynchmysqlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DbSynchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDbsynchmysqlPackage.createPackageContents();

		// Initialize created meta-data
		theDbsynchmysqlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbsynchmysqlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbsynchmysqlPackage.eNS_URI, theDbsynchmysqlPackage);
		return theDbsynchmysqlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceJdbcMySql() {
		return dataSourceJdbcMySqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcMySql_Host() {
		return (EAttribute)dataSourceJdbcMySqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcMySql_Port() {
		return (EAttribute)dataSourceJdbcMySqlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcMySql_DataBase() {
		return (EAttribute)dataSourceJdbcMySqlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchmysqlFactory getDbsynchmysqlFactory() {
		return (DbsynchmysqlFactory)getEFactoryInstance();
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
		dataSourceJdbcMySqlEClass = createEClass(DATA_SOURCE_JDBC_MY_SQL);
		createEAttribute(dataSourceJdbcMySqlEClass, DATA_SOURCE_JDBC_MY_SQL__HOST);
		createEAttribute(dataSourceJdbcMySqlEClass, DATA_SOURCE_JDBC_MY_SQL__PORT);
		createEAttribute(dataSourceJdbcMySqlEClass, DATA_SOURCE_JDBC_MY_SQL__DATA_BASE);
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
		DbSynchPackage theDbSynchPackage = (DbSynchPackage)EPackage.Registry.INSTANCE.getEPackage(DbSynchPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSourceJdbcMySqlEClass.getESuperTypes().add(theDbSynchPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceJdbcMySqlEClass, DataSourceJdbcMySql.class, "DataSourceJdbcMySql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbcMySql_Host(), ecorePackage.getEString(), "Host", "localshost", 0, 1, DataSourceJdbcMySql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcMySql_Port(), ecorePackage.getEInt(), "Port", "3306", 0, 1, DataSourceJdbcMySql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcMySql_DataBase(), ecorePackage.getEString(), "DataBase", null, 0, 1, DataSourceJdbcMySql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DbsynchmysqlPackageImpl
