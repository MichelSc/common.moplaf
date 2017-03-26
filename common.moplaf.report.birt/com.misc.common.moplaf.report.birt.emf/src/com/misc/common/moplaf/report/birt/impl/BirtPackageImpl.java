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
package com.misc.common.moplaf.report.birt.impl;

import com.misc.common.moplaf.report.ReportPackage;

import com.misc.common.moplaf.report.birt.BirtFactory;
import com.misc.common.moplaf.report.birt.BirtPackage;
import com.misc.common.moplaf.report.birt.ReportBirt;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BirtPackageImpl extends EPackageImpl implements BirtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportBirtEClass = null;

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
	 * @see com.misc.common.moplaf.report.birt.BirtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BirtPackageImpl() {
		super(eNS_URI, BirtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BirtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BirtPackage init() {
		if (isInited) return (BirtPackage)EPackage.Registry.INSTANCE.getEPackage(BirtPackage.eNS_URI);

		// Obtain or create and register package
		BirtPackageImpl theBirtPackage = (BirtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BirtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BirtPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReportPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBirtPackage.createPackageContents();

		// Initialize created meta-data
		theBirtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBirtPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BirtPackage.eNS_URI, theBirtPackage);
		return theBirtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportBirt() {
		return reportBirtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirtFactory getBirtFactory() {
		return (BirtFactory)getEFactoryInstance();
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
		reportBirtEClass = createEClass(REPORT_BIRT);
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
		ReportPackage theReportPackage = (ReportPackage)EPackage.Registry.INSTANCE.getEPackage(ReportPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reportBirtEClass.getESuperTypes().add(theReportPackage.getReportAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(reportBirtEClass, ReportBirt.class, "ReportBirt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BirtPackageImpl
