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
package com.misc.common.moplaf.solver.solvercplex.impl;

import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexFactory;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage;

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
public class SolvercplexPackageImpl extends EPackageImpl implements SolvercplexPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverCplexEClass = null;

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
	 * @see com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolvercplexPackageImpl() {
		super(eNS_URI, SolvercplexFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolvercplexPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolvercplexPackage init() {
		if (isInited) return (SolvercplexPackage)EPackage.Registry.INSTANCE.getEPackage(SolvercplexPackage.eNS_URI);

		// Obtain or create and register package
		SolvercplexPackageImpl theSolvercplexPackage = (SolvercplexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolvercplexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolvercplexPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolvercplexPackage.createPackageContents();

		// Initialize created meta-data
		theSolvercplexPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolvercplexPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolvercplexPackage.eNS_URI, theSolvercplexPackage);
		return theSolvercplexPackage;
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
	public EAttribute getSolverCplex_MipCutsCliques() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsCovers() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsFlowCovers() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsGomory() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsGUBCovers() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsImplied() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsMIRCut() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipCutsPathCut() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipStrategyBacktrack() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipStrategyHeuristicFreq() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipStrategyPresolveNode() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipStrategyProbe() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCplex_MipLimitsCutsFactor() {
		return (EAttribute)solverCplexEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvercplexFactory getSolvercplexFactory() {
		return (SolvercplexFactory)getEFactoryInstance();
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
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_CLIQUES);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_COVERS);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_GOMORY);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_GUB_COVERS);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_IMPLIED);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_MIR_CUT);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_CUTS_PATH_CUT);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_STRATEGY_PROBE);
		createEAttribute(solverCplexEClass, SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(solverCplexEClass, SolverCplex.class, "SolverCplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverCplex_MipCutsCliques(), ecorePackage.getEInt(), "MipCutsCliques", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsCovers(), ecorePackage.getEInt(), "MipCutsCovers", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsFlowCovers(), ecorePackage.getEInt(), "MipCutsFlowCovers", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsGomory(), ecorePackage.getEInt(), "MipCutsGomory", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsGUBCovers(), ecorePackage.getEInt(), "MipCutsGUBCovers", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsImplied(), ecorePackage.getEInt(), "MipCutsImplied", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsMIRCut(), ecorePackage.getEInt(), "MipCutsMIRCut", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipCutsPathCut(), ecorePackage.getEInt(), "MipCutsPathCut", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipStrategyBacktrack(), ecorePackage.getEFloat(), "MipStrategyBacktrack", "0.9999 ", 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipStrategyHeuristicFreq(), ecorePackage.getEInt(), "MipStrategyHeuristicFreq", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipStrategyPresolveNode(), ecorePackage.getEInt(), "MipStrategyPresolveNode", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipStrategyProbe(), ecorePackage.getEInt(), "MipStrategyProbe", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverCplex_MipLimitsCutsFactor(), ecorePackage.getEInt(), "MipLimitsCutsFactor", null, 0, 1, SolverCplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SolvercplexPackageImpl
