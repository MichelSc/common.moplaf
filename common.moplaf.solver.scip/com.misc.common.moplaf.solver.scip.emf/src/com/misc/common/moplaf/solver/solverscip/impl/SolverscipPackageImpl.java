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
package com.misc.common.moplaf.solver.solverscip.impl;

import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.solverscip.SolverScip;
import com.misc.common.moplaf.solver.solverscip.SolverscipFactory;
import com.misc.common.moplaf.solver.solverscip.SolverscipPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverscipPackageImpl extends EPackageImpl implements SolverscipPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverScipEClass = null;

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
	 * @see com.misc.common.moplaf.solver.solverscip.SolverscipPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverscipPackageImpl() {
		super(eNS_URI, SolverscipFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverscipPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverscipPackage init() {
		if (isInited) return (SolverscipPackage)EPackage.Registry.INSTANCE.getEPackage(SolverscipPackage.eNS_URI);

		// Obtain or create and register package
		SolverscipPackageImpl theSolverscipPackage = (SolverscipPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverscipPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverscipPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverscipPackage.createPackageContents();

		// Initialize created meta-data
		theSolverscipPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverscipPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverscipPackage.eNS_URI, theSolverscipPackage);
		return theSolverscipPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverScip() {
		return solverScipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverscipFactory getSolverscipFactory() {
		return (SolverscipFactory)getEFactoryInstance();
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
		solverScipEClass = createEClass(SOLVER_SCIP);
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
		SolverPackage theSolverPackage = (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		solverScipEClass.getESuperTypes().add(theSolverPackage.getSolverLp());
		solverScipEClass.getESuperTypes().add(theSolverPackage.getILpWriter());

		// Initialize classes, features, and operations; add parameters
		initEClass(solverScipEClass, SolverScip.class, "SolverScip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverscipPackageImpl
