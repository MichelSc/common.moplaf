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
package com.misc.common.moplaf.solver.solvercplex.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexFactory;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexParams;

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
public class SolverCplexPackageImpl extends EPackageImpl implements SolverCplexPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverCplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverCplexParamsEClass = null;

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
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverCplexPackageImpl() {
		super(eNS_URI, SolverCplexFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverCplexPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverCplexPackage init() {
		if (isInited) return (SolverCplexPackage)EPackage.Registry.INSTANCE.getEPackage(SolverCplexPackage.eNS_URI);

		// Obtain or create and register package
		SolverCplexPackageImpl theSolverCplexPackage = (SolverCplexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverCplexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverCplexPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverCplexPackage.createPackageContents();

		// Initialize created meta-data
		theSolverCplexPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverCplexPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverCplexPackage.eNS_URI, theSolverCplexPackage);
		return theSolverCplexPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverCplex() {
		return solverCplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverCplexParams() {
		return solverCplexParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsCliques() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsCovers() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsFlowCovers() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsGomory() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsGUBCovers() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsImplied() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsMIRCut() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipCutsPathCut() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipStrategyBacktrack() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipStrategyHeuristicFreq() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipStrategyProbe() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipStrategyPresolveNode() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplexParams_MipLimitsCutsFactor() {
		return (EAttribute)solverCplexParamsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplexFactory getSolverCplexFactory() {
		return (SolverCplexFactory)getEFactoryInstance();
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
		solverCplexEClass = createEClass(SOLVER_CPLEX);

		solverCplexParamsEClass = createEClass(SOLVER_CPLEX_PARAMS);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE);
		createEAttribute(solverCplexParamsEClass, SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR);
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
		solverCplexEClass.getESuperTypes().add(theSolverPackage.getSolverLp());
		solverCplexEClass.getESuperTypes().add(theSolverPackage.getILpWriter());
		solverCplexEClass.getESuperTypes().add(this.getSolverCplexParams());
		solverCplexParamsEClass.getESuperTypes().add(theSolverPackage.getSolverLpParams());

		// Initialize classes, features, and operations; add parameters
		initEClass(solverCplexEClass, SolverCplex.class, "SolverCplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solverCplexParamsEClass, SolverCplexParams.class, "SolverCplexParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverCplexParams_MipCutsCliques(), ecorePackage.getEInt(), "MipCutsCliques", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsCovers(), ecorePackage.getEInt(), "MipCutsCovers", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsFlowCovers(), ecorePackage.getEInt(), "MipCutsFlowCovers", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsGomory(), ecorePackage.getEInt(), "MipCutsGomory", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsGUBCovers(), ecorePackage.getEInt(), "MipCutsGUBCovers", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsImplied(), ecorePackage.getEInt(), "MipCutsImplied", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsMIRCut(), ecorePackage.getEInt(), "MipCutsMIRCut", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipCutsPathCut(), ecorePackage.getEInt(), "MipCutsPathCut", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipStrategyBacktrack(), ecorePackage.getEDouble(), "MipStrategyBacktrack", "0.9999 ", 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipStrategyHeuristicFreq(), ecorePackage.getEInt(), "MipStrategyHeuristicFreq", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipStrategyProbe(), ecorePackage.getEInt(), "MipStrategyProbe", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipStrategyPresolveNode(), ecorePackage.getEInt(), "MipStrategyPresolveNode", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplexParams_MipLimitsCutsFactor(), ecorePackage.getEInt(), "MipLimitsCutsFactor", null, 0, 1, SolverCplexParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverCplexPackageImpl
