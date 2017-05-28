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
package com.misc.common.moplaf.solver.solverglpk.impl;

import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.solverglpk.SolverGLPK;
import com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkFactory;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;

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
public class SolverglpkPackageImpl extends EPackageImpl implements SolverglpkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverGLPKEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverGLPKParamsEClass = null;

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
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverglpkPackageImpl() {
		super(eNS_URI, SolverglpkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverglpkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverglpkPackage init() {
		if (isInited) return (SolverglpkPackage)EPackage.Registry.INSTANCE.getEPackage(SolverglpkPackage.eNS_URI);

		// Obtain or create and register package
		SolverglpkPackageImpl theSolverglpkPackage = (SolverglpkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverglpkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverglpkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverglpkPackage.createPackageContents();

		// Initialize created meta-data
		theSolverglpkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverglpkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverglpkPackage.eNS_URI, theSolverglpkPackage);
		return theSolverglpkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverGLPK() {
		return solverGLPKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverGLPKParams() {
		return solverGLPKParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGLPKParams_EnableFeasibilityPump() {
		return (EAttribute)solverGLPKParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGLPKParams_EnableGomoryCuts() {
		return (EAttribute)solverGLPKParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGLPKParams_EnableGeneratingCliqueCuts() {
		return (EAttribute)solverGLPKParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGLPKParams_EnableGeneratingMixedCoverCuts() {
		return (EAttribute)solverGLPKParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGLPKParams_EnableMixedIntegerRoundingCuts() {
		return (EAttribute)solverGLPKParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGLPKParams_EnablePresolve() {
		return (EAttribute)solverGLPKParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverglpkFactory getSolverglpkFactory() {
		return (SolverglpkFactory)getEFactoryInstance();
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
		solverGLPKEClass = createEClass(SOLVER_GLPK);

		solverGLPKParamsEClass = createEClass(SOLVER_GLPK_PARAMS);
		createEAttribute(solverGLPKParamsEClass, SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE);
		createEAttribute(solverGLPKParamsEClass, SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP);
		createEAttribute(solverGLPKParamsEClass, SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS);
		createEAttribute(solverGLPKParamsEClass, SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS);
		createEAttribute(solverGLPKParamsEClass, SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS);
		createEAttribute(solverGLPKParamsEClass, SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS);
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
		solverGLPKEClass.getESuperTypes().add(theSolverPackage.getSolverLp());
		solverGLPKEClass.getESuperTypes().add(theSolverPackage.getILpWriter());
		solverGLPKEClass.getESuperTypes().add(this.getSolverGLPKParams());
		solverGLPKParamsEClass.getESuperTypes().add(theSolverPackage.getSolverLpParams());

		// Initialize classes, features, and operations; add parameters
		initEClass(solverGLPKEClass, SolverGLPK.class, "SolverGLPK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solverGLPKParamsEClass, SolverGLPKParams.class, "SolverGLPKParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverGLPKParams_EnablePresolve(), ecorePackage.getEBoolean(), "EnablePresolve", "true", 0, 1, SolverGLPKParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGLPKParams_EnableFeasibilityPump(), ecorePackage.getEBoolean(), "EnableFeasibilityPump", null, 0, 1, SolverGLPKParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGLPKParams_EnableGomoryCuts(), ecorePackage.getEBoolean(), "EnableGomoryCuts", null, 0, 1, SolverGLPKParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGLPKParams_EnableGeneratingCliqueCuts(), ecorePackage.getEBoolean(), "EnableGeneratingCliqueCuts", null, 0, 1, SolverGLPKParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGLPKParams_EnableGeneratingMixedCoverCuts(), ecorePackage.getEBoolean(), "EnableGeneratingMixedCoverCuts", null, 0, 1, SolverGLPKParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGLPKParams_EnableMixedIntegerRoundingCuts(), ecorePackage.getEBoolean(), "EnableMixedIntegerRoundingCuts", null, 0, 1, SolverGLPKParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverglpkPackageImpl
