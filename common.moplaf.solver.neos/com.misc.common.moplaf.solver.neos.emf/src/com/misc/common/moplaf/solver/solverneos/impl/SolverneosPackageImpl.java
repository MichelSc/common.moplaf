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
package com.misc.common.moplaf.solver.solverneos.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory;
import com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput;
import com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName;
import com.misc.common.moplaf.solver.solverneos.SolverNeos;
import com.misc.common.moplaf.solver.solverneos.SolverneosFactory;
import com.misc.common.moplaf.solver.solverneos.SolverneosPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverneosPackageImpl extends EPackageImpl implements SolverneosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverNeosEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNeosSolverCategoryEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNeosSolverNameEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNeosSolverInputEEnum = null;
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
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverneosPackageImpl() {
		super(eNS_URI, SolverneosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverneosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverneosPackage init() {
		if (isInited) return (SolverneosPackage)EPackage.Registry.INSTANCE.getEPackage(SolverneosPackage.eNS_URI);

		// Obtain or create and register package
		SolverneosPackageImpl theSolverneosPackage = (SolverneosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverneosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverneosPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverneosPackage.createPackageContents();

		// Initialize created meta-data
		theSolverneosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverneosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverneosPackage.eNS_URI, theSolverneosPackage);
		return theSolverneosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverNeos() {
		return solverNeosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverNeos_LpWriter() {
		return (EReference)solverNeosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverNeos_SolReader() {
		return (EReference)solverNeosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_ServerHost() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_ServerPort() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_SolverCategory() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_SolverName() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_SolverInput() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_SolverPollDuration() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobSubmitted() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobDone() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobResultRetrieved() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobNumber() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobPassword() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobStatus() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobLastStatus() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobNeosStatus() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobSubmitterEmail() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverNeos_JobResult() {
		return (EAttribute)solverNeosEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolverNeos__RetrieveJobStatus() {
		return solverNeosEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolverNeos__RetrieveJobResult() {
		return solverNeosEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolverNeos__KillJob() {
		return solverNeosEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolverNeos__SubmitJob() {
		return solverNeosEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumNeosSolverCategory() {
		return enumNeosSolverCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumNeosSolverName() {
		return enumNeosSolverNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumNeosSolverInput() {
		return enumNeosSolverInputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverneosFactory getSolverneosFactory() {
		return (SolverneosFactory)getEFactoryInstance();
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
		solverNeosEClass = createEClass(SOLVER_NEOS);
		createEReference(solverNeosEClass, SOLVER_NEOS__LP_WRITER);
		createEReference(solverNeosEClass, SOLVER_NEOS__SOL_READER);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__SERVER_HOST);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__SERVER_PORT);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__SOLVER_CATEGORY);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__SOLVER_NAME);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__SOLVER_INPUT);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__SOLVER_POLL_DURATION);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_SUBMITTED);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_DONE);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_RESULT_RETRIEVED);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_NUMBER);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_PASSWORD);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_STATUS);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_LAST_STATUS);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_NEOS_STATUS);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_SUBMITTER_EMAIL);
		createEAttribute(solverNeosEClass, SOLVER_NEOS__JOB_RESULT);
		createEOperation(solverNeosEClass, SOLVER_NEOS___RETRIEVE_JOB_STATUS);
		createEOperation(solverNeosEClass, SOLVER_NEOS___RETRIEVE_JOB_RESULT);
		createEOperation(solverNeosEClass, SOLVER_NEOS___KILL_JOB);
		createEOperation(solverNeosEClass, SOLVER_NEOS___SUBMIT_JOB);

		// Create enums
		enumNeosSolverCategoryEEnum = createEEnum(ENUM_NEOS_SOLVER_CATEGORY);
		enumNeosSolverNameEEnum = createEEnum(ENUM_NEOS_SOLVER_NAME);
		enumNeosSolverInputEEnum = createEEnum(ENUM_NEOS_SOLVER_INPUT);
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
		solverNeosEClass.getESuperTypes().add(theSolverPackage.getSolverLp());

		// Initialize classes, features, and operations; add parameters
		initEClass(solverNeosEClass, SolverNeos.class, "SolverNeos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolverNeos_LpWriter(), theSolverPackage.getILpWriter(), null, "LpWriter", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolverNeos_SolReader(), theSolverPackage.getSolutionReader(), null, "SolReader", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_ServerHost(), ecorePackage.getEString(), "ServerHost", "www.neos-server.org", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_ServerPort(), ecorePackage.getEString(), "ServerPort", "3332", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_SolverCategory(), this.getEnumNeosSolverCategory(), "SolverCategory", "MILP", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_SolverName(), this.getEnumNeosSolverName(), "SolverName", "scip", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_SolverInput(), this.getEnumNeosSolverInput(), "SolverInput", "MPS", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_SolverPollDuration(), ecorePackage.getEInt(), "SolverPollDuration", "30", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobSubmitted(), ecorePackage.getEBoolean(), "JobSubmitted", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobDone(), ecorePackage.getEBoolean(), "JobDone", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobResultRetrieved(), ecorePackage.getEBoolean(), "JobResultRetrieved", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobNumber(), ecorePackage.getEInt(), "JobNumber", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobPassword(), ecorePackage.getEString(), "JobPassword", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobStatus(), ecorePackage.getEString(), "JobStatus", "created", 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobLastStatus(), ecorePackage.getEDate(), "JobLastStatus", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobNeosStatus(), ecorePackage.getEString(), "JobNeosStatus", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobSubmitterEmail(), ecorePackage.getEString(), "JobSubmitterEmail", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverNeos_JobResult(), ecorePackage.getEString(), "JobResult", null, 0, 1, SolverNeos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolverNeos__RetrieveJobStatus(), null, "retrieveJobStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolverNeos__RetrieveJobResult(), null, "retrieveJobResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolverNeos__KillJob(), null, "killJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolverNeos__SubmitJob(), null, "submitJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumNeosSolverCategoryEEnum, EnumNeosSolverCategory.class, "EnumNeosSolverCategory");
		addEEnumLiteral(enumNeosSolverCategoryEEnum, EnumNeosSolverCategory.MILP);
		addEEnumLiteral(enumNeosSolverCategoryEEnum, EnumNeosSolverCategory.LP);

		initEEnum(enumNeosSolverNameEEnum, EnumNeosSolverName.class, "EnumNeosSolverName");
		addEEnumLiteral(enumNeosSolverNameEEnum, EnumNeosSolverName.GUROBI);
		addEEnumLiteral(enumNeosSolverNameEEnum, EnumNeosSolverName.XPRESS_MP);
		addEEnumLiteral(enumNeosSolverNameEEnum, EnumNeosSolverName.SCIP);

		initEEnum(enumNeosSolverInputEEnum, EnumNeosSolverInput.class, "EnumNeosSolverInput");
		addEEnumLiteral(enumNeosSolverInputEEnum, EnumNeosSolverInput.GAMS);
		addEEnumLiteral(enumNeosSolverInputEEnum, EnumNeosSolverInput.CPLEX);
		addEEnumLiteral(enumNeosSolverInputEEnum, EnumNeosSolverInput.MPS);
		addEEnumLiteral(enumNeosSolverInputEEnum, EnumNeosSolverInput.AMPL);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverneosPackageImpl
