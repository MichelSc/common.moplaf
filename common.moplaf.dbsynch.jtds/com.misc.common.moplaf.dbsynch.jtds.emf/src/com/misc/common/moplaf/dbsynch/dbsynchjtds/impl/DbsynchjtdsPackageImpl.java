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
package com.misc.common.moplaf.dbsynch.dbsynchjtds.impl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds;
import com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsFactory;
import com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage;
import com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbsynchjtdsPackageImpl extends EPackageImpl implements DbsynchjtdsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceJdbcJtdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumServerTypeEEnum = null;

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
	 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbsynchjtdsPackageImpl() {
		super(eNS_URI, DbsynchjtdsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DbsynchjtdsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbsynchjtdsPackage init() {
		if (isInited) return (DbsynchjtdsPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchjtdsPackage.eNS_URI);

		// Obtain or create and register package
		DbsynchjtdsPackageImpl theDbsynchjtdsPackage = (DbsynchjtdsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbsynchjtdsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbsynchjtdsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DbSynchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDbsynchjtdsPackage.createPackageContents();

		// Initialize created meta-data
		theDbsynchjtdsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbsynchjtdsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbsynchjtdsPackage.eNS_URI, theDbsynchjtdsPackage);
		return theDbsynchjtdsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceJdbcJtds() {
		return dataSourceJdbcJtdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcJtds_Host() {
		return (EAttribute)dataSourceJdbcJtdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcJtds_Port() {
		return (EAttribute)dataSourceJdbcJtdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcJtds_DataBase() {
		return (EAttribute)dataSourceJdbcJtdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcJtds_ServerType() {
		return (EAttribute)dataSourceJdbcJtdsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceJdbcJtds_UserDomain() {
		return (EAttribute)dataSourceJdbcJtdsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumServerType() {
		return enumServerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchjtdsFactory getDbsynchjtdsFactory() {
		return (DbsynchjtdsFactory)getEFactoryInstance();
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
		dataSourceJdbcJtdsEClass = createEClass(DATA_SOURCE_JDBC_JTDS);
		createEAttribute(dataSourceJdbcJtdsEClass, DATA_SOURCE_JDBC_JTDS__HOST);
		createEAttribute(dataSourceJdbcJtdsEClass, DATA_SOURCE_JDBC_JTDS__PORT);
		createEAttribute(dataSourceJdbcJtdsEClass, DATA_SOURCE_JDBC_JTDS__DATA_BASE);
		createEAttribute(dataSourceJdbcJtdsEClass, DATA_SOURCE_JDBC_JTDS__SERVER_TYPE);
		createEAttribute(dataSourceJdbcJtdsEClass, DATA_SOURCE_JDBC_JTDS__USER_DOMAIN);

		// Create enums
		enumServerTypeEEnum = createEEnum(ENUM_SERVER_TYPE);
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
		dataSourceJdbcJtdsEClass.getESuperTypes().add(theDbSynchPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceJdbcJtdsEClass, DataSourceJdbcJtds.class, "DataSourceJdbcJtds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceJdbcJtds_Host(), ecorePackage.getEString(), "Host", "localshost", 0, 1, DataSourceJdbcJtds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcJtds_Port(), ecorePackage.getEInt(), "Port", "1433", 0, 1, DataSourceJdbcJtds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcJtds_DataBase(), ecorePackage.getEString(), "DataBase", null, 0, 1, DataSourceJdbcJtds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcJtds_ServerType(), this.getEnumServerType(), "ServerType", null, 0, 1, DataSourceJdbcJtds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceJdbcJtds_UserDomain(), ecorePackage.getEString(), "UserDomain", null, 0, 1, DataSourceJdbcJtds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumServerTypeEEnum, EnumServerType.class, "EnumServerType");
		addEEnumLiteral(enumServerTypeEEnum, EnumServerType.ENUM_MODIFICATION_SQLSERVER);
		addEEnumLiteral(enumServerTypeEEnum, EnumServerType.ENUM_MODIFICATION_SYBASE);

		// Create resource
		createResource(eNS_URI);
	}

} //DbsynchjtdsPackageImpl
