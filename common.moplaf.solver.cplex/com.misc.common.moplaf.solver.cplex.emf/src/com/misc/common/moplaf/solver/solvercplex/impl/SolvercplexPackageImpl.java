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

		// Create resource
		createResource(eNS_URI);
	}

} //SolvercplexPackageImpl
