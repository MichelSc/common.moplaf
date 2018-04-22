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
package solverjacop.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import solverjacop.SolverJacop;
import solverjacop.SolverjacopFactory;
import solverjacop.SolverjacopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverjacopPackageImpl extends EPackageImpl implements SolverjacopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverJacopEClass = null;

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
	 * @see solverjacop.SolverjacopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverjacopPackageImpl() {
		super(eNS_URI, SolverjacopFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverjacopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverjacopPackage init() {
		if (isInited) return (SolverjacopPackage)EPackage.Registry.INSTANCE.getEPackage(SolverjacopPackage.eNS_URI);

		// Obtain or create and register package
		SolverjacopPackageImpl theSolverjacopPackage = (SolverjacopPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverjacopPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverjacopPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverjacopPackage.createPackageContents();

		// Initialize created meta-data
		theSolverjacopPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverjacopPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverjacopPackage.eNS_URI, theSolverjacopPackage);
		return theSolverjacopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverJacop() {
		return solverJacopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverjacopFactory getSolverjacopFactory() {
		return (SolverjacopFactory)getEFactoryInstance();
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
		solverJacopEClass = createEClass(SOLVER_JACOP);
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
		solverJacopEClass.getESuperTypes().add(theSolverPackage.getSolverCp());

		// Initialize classes, features, and operations; add parameters
		initEClass(solverJacopEClass, SolverJacop.class, "SolverJacop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverjacopPackageImpl
