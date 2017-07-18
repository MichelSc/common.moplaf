/**
 */
package com.misc.common.moplaf.replica.impl;

import com.misc.common.moplaf.replica.Replica;
import com.misc.common.moplaf.replica.ReplicaFactory;
import com.misc.common.moplaf.replica.ReplicaPackage;

import com.misc.common.moplaf.replica.Replicator;
import com.misc.common.moplaf.replica.ReplicatorReplica;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplicaPackageImpl extends EPackageImpl implements ReplicaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicatorReplicaEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicatorEClass = null;

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
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReplicaPackageImpl() {
		super(eNS_URI, ReplicaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReplicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReplicaPackage init() {
		if (isInited)
			return (ReplicaPackage) EPackage.Registry.INSTANCE.getEPackage(ReplicaPackage.eNS_URI);

		// Obtain or create and register package
		ReplicaPackageImpl theReplicaPackage = (ReplicaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ReplicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ReplicaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theReplicaPackage.createPackageContents();

		// Initialize created meta-data
		theReplicaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReplicaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReplicaPackage.eNS_URI, theReplicaPackage);
		return theReplicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplica() {
		return replicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplica_Exemplar() {
		return (EReference) replicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplica_Elements() {
		return (EReference) replicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplica_Container() {
		return (EReference) replicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__GetExemplarElements() {
		return replicaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__ConstructElement__EObject() {
		return replicaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__RefreshElements() {
		return replicaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__RefreshXRefs() {
		return replicaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__Refresh() {
		return replicaEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__Remove() {
		return replicaEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplica__GetReplica__EObject() {
		return replicaEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplicatorReplica() {
		return replicatorReplicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatorReplica_Exemplar() {
		return (EReference) replicatorReplicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatorReplica_Elements() {
		return (EReference) replicatorReplicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatorReplica_Container() {
		return (EReference) replicatorReplicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatorReplica_Replicator() {
		return (EReference) replicatorReplicaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicatorReplica__OnConstruct() {
		return replicatorReplicaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicatorReplica__OnRemove() {
		return replicatorReplicaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicatorReplica__OnRefresh() {
		return replicatorReplicaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicatorReplica__Refresh() {
		return replicatorReplicaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplicator() {
		return replicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicator_RootReplicas() {
		return (EReference) replicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicator__GetReplica__Object() {
		return replicatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicator__GetExemplarElements__ReplicatorReplica() {
		return replicatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicator__GetRootExemplarElements() {
		return replicatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicator__ConstructReplica__Object() {
		return replicatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicator__RefreshElements__EList_EList() {
		return replicatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplicator__Refresh() {
		return replicatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicaFactory getReplicaFactory() {
		return (ReplicaFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		replicaEClass = createEClass(REPLICA);
		createEReference(replicaEClass, REPLICA__EXEMPLAR);
		createEReference(replicaEClass, REPLICA__ELEMENTS);
		createEReference(replicaEClass, REPLICA__CONTAINER);
		createEOperation(replicaEClass, REPLICA___GET_EXEMPLAR_ELEMENTS);
		createEOperation(replicaEClass, REPLICA___CONSTRUCT_ELEMENT__EOBJECT);
		createEOperation(replicaEClass, REPLICA___REFRESH_ELEMENTS);
		createEOperation(replicaEClass, REPLICA___REFRESH_XREFS);
		createEOperation(replicaEClass, REPLICA___REFRESH);
		createEOperation(replicaEClass, REPLICA___REMOVE);
		createEOperation(replicaEClass, REPLICA___GET_REPLICA__EOBJECT);

		replicatorReplicaEClass = createEClass(REPLICATOR_REPLICA);
		createEReference(replicatorReplicaEClass, REPLICATOR_REPLICA__EXEMPLAR);
		createEReference(replicatorReplicaEClass, REPLICATOR_REPLICA__ELEMENTS);
		createEReference(replicatorReplicaEClass, REPLICATOR_REPLICA__CONTAINER);
		createEReference(replicatorReplicaEClass, REPLICATOR_REPLICA__REPLICATOR);
		createEOperation(replicatorReplicaEClass, REPLICATOR_REPLICA___ON_CONSTRUCT);
		createEOperation(replicatorReplicaEClass, REPLICATOR_REPLICA___ON_REFRESH);
		createEOperation(replicatorReplicaEClass, REPLICATOR_REPLICA___ON_REMOVE);
		createEOperation(replicatorReplicaEClass, REPLICATOR_REPLICA___REFRESH);

		replicatorEClass = createEClass(REPLICATOR);
		createEReference(replicatorEClass, REPLICATOR__ROOT_REPLICAS);
		createEOperation(replicatorEClass, REPLICATOR___GET_REPLICA__OBJECT);
		createEOperation(replicatorEClass, REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA);
		createEOperation(replicatorEClass, REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS);
		createEOperation(replicatorEClass, REPLICATOR___CONSTRUCT_REPLICA__OBJECT);
		createEOperation(replicatorEClass, REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST);
		createEOperation(replicatorEClass, REPLICATOR___REFRESH);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter replicatorReplicaEClass_T = addETypeParameter(replicatorReplicaEClass, "T");
		ETypeParameter replicatorEClass_T = addETypeParameter(replicatorEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(ecorePackage.getEObject());
		replicatorReplicaEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEObject());
		replicatorEClass_T.getEBounds().add(g1);

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(replicaEClass, Replica.class, "Replica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplica_Exemplar(), ecorePackage.getEObject(), null, "Exemplar", null, 0, 1, Replica.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplica_Elements(), this.getReplica(), this.getReplica_Container(), "Elements", null, 0, -1,
				Replica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplica_Container(), this.getReplica(), this.getReplica_Elements(), "Container", null, 0, 1,
				Replica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReplica__GetExemplarElements(), ecorePackage.getEObject(), "getExemplarElements", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getReplica__ConstructElement__EObject(), this.getReplica(), "constructElement",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "exemplar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplica__RefreshElements(), null, "refreshElements", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplica__RefreshXRefs(), null, "refreshXRefs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplica__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplica__Remove(), null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReplica__GetReplica__EObject(), this.getReplica(), "getReplica", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "exemplar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(replicatorReplicaEClass, ReplicatorReplica.class, "ReplicatorReplica", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(replicatorReplicaEClass_T);
		initEReference(getReplicatorReplica_Exemplar(), g1, null, "Exemplar", null, 0, 1, ReplicatorReplica.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getReplicatorReplica());
		EGenericType g2 = createEGenericType(replicatorReplicaEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getReplicatorReplica_Elements(), g1, this.getReplicatorReplica_Container(), "Elements", null, 0,
				-1, ReplicatorReplica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getReplicatorReplica());
		g2 = createEGenericType(replicatorReplicaEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getReplicatorReplica_Container(), g1, this.getReplicatorReplica_Elements(), "Container", null, 0,
				1, ReplicatorReplica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getReplicator());
		g2 = createEGenericType(replicatorReplicaEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getReplicatorReplica_Replicator(), g1, null, "Replicator", null, 1, 1, ReplicatorReplica.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReplicatorReplica__OnConstruct(), null, "onConstruct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplicatorReplica__OnRefresh(), null, "onRefresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplicatorReplica__OnRemove(), null, "onRemove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplicatorReplica__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(replicatorEClass, Replicator.class, "Replicator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getReplicatorReplica());
		g2 = createEGenericType(replicatorEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getReplicator_RootReplicas(), g1, null, "RootReplicas", null, 0, -1, Replicator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getReplicator__GetReplica__Object(), null, "getReplica", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(replicatorEClass_T);
		addEParameter(op, g1, "exemplar", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getReplicatorReplica());
		g2 = createEGenericType(replicatorEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getReplicator__GetExemplarElements__ReplicatorReplica(), null, "getExemplarElements", 0, -1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getReplicatorReplica());
		g2 = createEGenericType(replicatorEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "replica", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(replicatorEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getReplicator__GetRootExemplarElements(), null, "getRootExemplarElements", 0, -1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(replicatorEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getReplicator__ConstructReplica__Object(), null, "constructReplica", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(replicatorEClass_T);
		addEParameter(op, g1, "exemplar", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getReplicatorReplica());
		g2 = createEGenericType(replicatorEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getReplicator__RefreshElements__EList_EList(), null, "refreshElements", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(replicatorEClass_T);
		addEParameter(op, g1, "exemplarElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getReplicatorReplica());
		g2 = createEGenericType(replicatorEClass_T);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "replicaElements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReplicator__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReplicaPackageImpl
