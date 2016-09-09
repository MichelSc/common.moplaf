/**
 */
package com.misc.common.moplaf.propagator2.impl;

import com.misc.common.moplaf.propagator2.Bindings;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctionScope;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFactory;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagatorPackageImpl extends EPackageImpl implements PropagatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWithPropagatorFunctionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWithPropagatorFunctionScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bindingsEDataType = null;

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
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropagatorPackageImpl() {
		super(eNS_URI, PropagatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PropagatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropagatorPackage init() {
		if (isInited) return (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);

		// Obtain or create and register package
		PropagatorPackageImpl thePropagatorPackage = (PropagatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropagatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropagatorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePropagatorPackage.createPackageContents();

		// Initialize created meta-data
		thePropagatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePropagatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropagatorPackage.eNS_URI, thePropagatorPackage);
		return thePropagatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWithPropagatorFunctions() {
		return objectWithPropagatorFunctionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectWithPropagatorFunctions_PropagatorFunctions() {
		return (EReference)objectWithPropagatorFunctionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithPropagatorFunctions__OnOwned() {
		return objectWithPropagatorFunctionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithPropagatorFunctions__OnNotOwned() {
		return objectWithPropagatorFunctionsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWithPropagatorFunctionScope() {
		return objectWithPropagatorFunctionScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithPropagatorFunctionScope__Refresh() {
		return objectWithPropagatorFunctionScopeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithPropagatorFunctionScope__NewOperation2() {
		return objectWithPropagatorFunctionScopeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorFunction() {
		return propagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunction_Parent() {
		return (EReference)propagatorFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunction_Antecedents() {
		return (EReference)propagatorFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagatorFunction_Touched() {
		return (EAttribute)propagatorFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunction_TouchedChildren() {
		return (EReference)propagatorFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunction_Touchers() {
		return (EReference)propagatorFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagatorFunction_Enabled() {
		return (EAttribute)propagatorFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunction_ObjectWithPropagatorFunctions() {
		return (EReference)propagatorFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagatorFunction_Type() {
		return (EAttribute)propagatorFunctionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagatorFunction_Object() {
		return (EAttribute)propagatorFunctionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagatorFunction_Instance() {
		return (EAttribute)propagatorFunctionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagatorFunction_Description() {
		return (EAttribute)propagatorFunctionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__Touch__EObject() {
		return propagatorFunctionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__RefreshAntecedents() {
		return propagatorFunctionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__RefreshThis() {
		return propagatorFunctionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__RefreshChildrenAndThis() {
		return propagatorFunctionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__Refresh() {
		return propagatorFunctionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__DoGetParent() {
		return propagatorFunctionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__DoGetExplicitAntecedents() {
		return propagatorFunctionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__DoGetBindings() {
		return propagatorFunctionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__DoRefresh() {
		return propagatorFunctionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__DoRefresh__EObject() {
		return propagatorFunctionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__Enable() {
		return propagatorFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropagatorFunction__Disable() {
		return propagatorFunctionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBindings() {
		return bindingsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFactory getPropagatorFactory() {
		return (PropagatorFactory)getEFactoryInstance();
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
		objectWithPropagatorFunctionsEClass = createEClass(OBJECT_WITH_PROPAGATOR_FUNCTIONS);
		createEReference(objectWithPropagatorFunctionsEClass, OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS);
		createEOperation(objectWithPropagatorFunctionsEClass, OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_OWNED);
		createEOperation(objectWithPropagatorFunctionsEClass, OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_NOT_OWNED);

		objectWithPropagatorFunctionScopeEClass = createEClass(OBJECT_WITH_PROPAGATOR_FUNCTION_SCOPE);
		createEOperation(objectWithPropagatorFunctionScopeEClass, OBJECT_WITH_PROPAGATOR_FUNCTION_SCOPE___REFRESH);
		createEOperation(objectWithPropagatorFunctionScopeEClass, OBJECT_WITH_PROPAGATOR_FUNCTION_SCOPE___NEW_OPERATION2);

		propagatorFunctionEClass = createEClass(PROPAGATOR_FUNCTION);
		createEReference(propagatorFunctionEClass, PROPAGATOR_FUNCTION__PARENT);
		createEReference(propagatorFunctionEClass, PROPAGATOR_FUNCTION__ANTECEDENTS);
		createEAttribute(propagatorFunctionEClass, PROPAGATOR_FUNCTION__TOUCHED);
		createEReference(propagatorFunctionEClass, PROPAGATOR_FUNCTION__TOUCHED_CHILDREN);
		createEReference(propagatorFunctionEClass, PROPAGATOR_FUNCTION__TOUCHERS);
		createEAttribute(propagatorFunctionEClass, PROPAGATOR_FUNCTION__ENABLED);
		createEReference(propagatorFunctionEClass, PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS);
		createEAttribute(propagatorFunctionEClass, PROPAGATOR_FUNCTION__TYPE);
		createEAttribute(propagatorFunctionEClass, PROPAGATOR_FUNCTION__OBJECT);
		createEAttribute(propagatorFunctionEClass, PROPAGATOR_FUNCTION__INSTANCE);
		createEAttribute(propagatorFunctionEClass, PROPAGATOR_FUNCTION__DESCRIPTION);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___ENABLE);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___DISABLE);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___TOUCH__EOBJECT);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___REFRESH_THIS);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___REFRESH);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___DO_GET_PARENT);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___DO_GET_BINDINGS);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___DO_REFRESH);
		createEOperation(propagatorFunctionEClass, PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT);

		// Create data types
		bindingsEDataType = createEDataType(BINDINGS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(objectWithPropagatorFunctionsEClass, ObjectWithPropagatorFunctions.class, "ObjectWithPropagatorFunctions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectWithPropagatorFunctions_PropagatorFunctions(), this.getPropagatorFunction(), null, "PropagatorFunctions", null, 0, -1, ObjectWithPropagatorFunctions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getObjectWithPropagatorFunctions__OnOwned(), null, "onOwned", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectWithPropagatorFunctions__OnNotOwned(), null, "onNotOwned", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectWithPropagatorFunctionScopeEClass, ObjectWithPropagatorFunctionScope.class, "ObjectWithPropagatorFunctionScope", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObjectWithPropagatorFunctionScope__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectWithPropagatorFunctionScope__NewOperation2(), null, "newOperation2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propagatorFunctionEClass, PropagatorFunction.class, "PropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorFunction_Parent(), this.getPropagatorFunction(), null, "Parent", null, 0, 1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorFunction_Antecedents(), this.getPropagatorFunction(), null, "Antecedents", null, 0, -1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropagatorFunction_Touched(), ecorePackage.getEBoolean(), "Touched", null, 0, 1, PropagatorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorFunction_TouchedChildren(), this.getPropagatorFunction(), null, "TouchedChildren", null, 0, -1, PropagatorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorFunction_Touchers(), ecorePackage.getEObject(), null, "Touchers", null, 0, -1, PropagatorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropagatorFunction_Enabled(), ecorePackage.getEBoolean(), "Enabled", null, 0, 1, PropagatorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorFunction_ObjectWithPropagatorFunctions(), this.getObjectWithPropagatorFunctions(), null, "ObjectWithPropagatorFunctions", null, 1, 1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropagatorFunction_Type(), ecorePackage.getEString(), "Type", null, 0, 1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropagatorFunction_Object(), ecorePackage.getEString(), "Object", null, 0, 1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropagatorFunction_Instance(), ecorePackage.getEString(), "Instance", null, 0, 1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropagatorFunction_Description(), ecorePackage.getEString(), "Description", null, 0, 1, PropagatorFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getPropagatorFunction__Enable(), null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__Disable(), null, "disable", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPropagatorFunction__Touch__EObject(), null, "touch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "toucher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__RefreshAntecedents(), ecorePackage.getEBoolean(), "refreshAntecedents", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__RefreshThis(), ecorePackage.getEBoolean(), "refreshThis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__RefreshChildrenAndThis(), ecorePackage.getEBoolean(), "refreshChildrenAndThis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__Refresh(), ecorePackage.getEBoolean(), "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__DoGetParent(), this.getPropagatorFunction(), "doGetParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__DoGetExplicitAntecedents(), this.getPropagatorFunction(), "doGetExplicitAntecedents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__DoGetBindings(), this.getBindings(), "doGetBindings", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropagatorFunction__DoRefresh(), null, "doRefresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropagatorFunction__DoRefresh__EObject(), null, "doRefresh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "toucher", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(bindingsEDataType, Bindings.class, "Bindings", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PropagatorPackageImpl