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
package com.misc.common.moplaf.dbsynch.dbsynchora.impl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import com.misc.common.moplaf.dbsynch.dbsynchora.DataSourceJdbcOraThin;
import com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraFactory;
import com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage;

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
public class DbsynchoraPackageImpl extends EPackageImpl implements DbsynchoraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceJdbcOraThinEClass = null;

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
	 * @see com.misc.common.moplaf.dbsynch.dbsynchora.DbsynchoraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbsynchoraPackageImpl() {
		super(eNS_URI, DbsynchoraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DbsynchoraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbsynchoraPackage init() {
		if (isInited) return (DbsynchoraPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchoraPackage.eNS_URI);

		// Obtain or create and register package
		DbsynchoraPackageImpl theDbsynchoraPackage = (DbsynchoraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbsynchoraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbsynchoraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DbSynchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDbsynchoraPackage.createPackageContents();

		// Initialize created meta-data
		theDbsynchoraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbsynchoraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbsynchoraPackage.eNS_URI, theDbsynchoraPackage);
		return theDbsynchoraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceJdbcOraThin() {
		return dataSourceJdbcOraThinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcOraThin_Host() {
		return (EAttribute)dataSourceJdbcOraThinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcOraThin_Port() {
		return (EAttribute)dataSourceJdbcOraThinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcOraThin_DataBase() {
		return (EAttribute)dataSourceJdbcOraThinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchoraFactory getDbsynchoraFactory() {
		return (DbsynchoraFactory)getEFactoryInstance();
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
		dataSourceJdbcOraThinEClass = createEClass(DATA_SOURCE_JDBC_ORA_THIN);
		createEAttribute(dataSourceJdbcOraThinEClass, DATA_SOURCE_JDBC_ORA_THIN__HOST);
		createEAttribute(dataSourceJdbcOraThinEClass, DATA_SOURCE_JDBC_ORA_THIN__PORT);
		createEAttribute(dataSourceJdbcOraThinEClass, DATA_SOURCE_JDBC_ORA_THIN__DATA_BASE);
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
		dataSourceJdbcOraThinEClass.getESuperTypes().add(theDbSynchPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceJdbcOraThinEClass, DataSourceJdbcOraThin.class, "DataSourceJdbcOraThin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbcOraThin_Host(), ecorePackage.getEString(), "Host", "localshost", 0, 1, DataSourceJdbcOraThin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcOraThin_Port(), ecorePackage.getEInt(), "Port", "3306", 0, 1, DataSourceJdbcOraThin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcOraThin_DataBase(), ecorePackage.getEString(), "DataBase", null, 0, 1, DataSourceJdbcOraThin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DbsynchoraPackageImpl
