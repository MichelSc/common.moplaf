/**
 */
package com.misc.common.moplaf.solver.solverjavailp.impl;

import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.solverjavailp.SolverJavaILP;
import com.misc.common.moplaf.solver.solverjavailp.SolverJavaILPType;
import com.misc.common.moplaf.solver.solverjavailp.SolverjavailpFactory;
import com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage;

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
public class SolverjavailpPackageImpl extends EPackageImpl implements SolverjavailpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverJavaILPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum solverJavaILPTypeEEnum = null;

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
	 * @see com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverjavailpPackageImpl() {
		super(eNS_URI, SolverjavailpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverjavailpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverjavailpPackage init() {
		if (isInited) return (SolverjavailpPackage)EPackage.Registry.INSTANCE.getEPackage(SolverjavailpPackage.eNS_URI);

		// Obtain or create and register package
		SolverjavailpPackageImpl theSolverjavailpPackage = (SolverjavailpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverjavailpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverjavailpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverjavailpPackage.createPackageContents();

		// Initialize created meta-data
		theSolverjavailpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverjavailpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverjavailpPackage.eNS_URI, theSolverjavailpPackage);
		return theSolverjavailpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverJavaILP() {
		return solverJavaILPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverJavaILP_Type() {
		return (EAttribute)solverJavaILPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSolverJavaILPType() {
		return solverJavaILPTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverjavailpFactory getSolverjavailpFactory() {
		return (SolverjavailpFactory)getEFactoryInstance();
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
		solverJavaILPEClass = createEClass(SOLVER_JAVA_ILP);
		createEAttribute(solverJavaILPEClass, SOLVER_JAVA_ILP__TYPE);

		// Create enums
		solverJavaILPTypeEEnum = createEEnum(SOLVER_JAVA_ILP_TYPE);
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
		solverJavaILPEClass.getESuperTypes().add(theSolverPackage.getSolverLp());
		solverJavaILPEClass.getESuperTypes().add(theSolverPackage.getILpWriter());

		// Initialize classes, features, and operations; add parameters
		initEClass(solverJavaILPEClass, SolverJavaILP.class, "SolverJavaILP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverJavaILP_Type(), this.getSolverJavaILPType(), "Type", "GLPK", 0, 1, SolverJavaILP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(solverJavaILPTypeEEnum, SolverJavaILPType.class, "SolverJavaILPType");
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.GLPK);
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.LP_SOLVE);
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.CPLEX);
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.GUROBI);
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.MINI_SAT);
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.MOSEK);
		addEEnumLiteral(solverJavaILPTypeEEnum, SolverJavaILPType.SAT4J);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverjavailpPackageImpl
