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
package com.misc.common.moplaf.propagator.impl;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.propagator.PropagatorFactory;
import com.misc.common.moplaf.propagator.PropagatorPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass objectWithPropagatorFunctionAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWithPropagatorFunctionAdapterScopeEClass = null;

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
	 * @see com.misc.common.moplaf.propagator.PropagatorPackage#eNS_URI
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
	public EClass getObjectWithPropagatorFunctionAdapter() {
		return objectWithPropagatorFunctionAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithPropagatorFunctionAdapter__AddPropagatorFunctionAdapter() {
		return objectWithPropagatorFunctionAdapterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWithPropagatorFunctionAdapterScope() {
		return objectWithPropagatorFunctionAdapterScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithPropagatorFunctionAdapterScope__Refresh() {
		return objectWithPropagatorFunctionAdapterScopeEClass.getEOperations().get(0);
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
		objectWithPropagatorFunctionAdapterEClass = createEClass(OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER);
		createEOperation(objectWithPropagatorFunctionAdapterEClass, OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER);

		objectWithPropagatorFunctionAdapterScopeEClass = createEClass(OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE);
		createEOperation(objectWithPropagatorFunctionAdapterScopeEClass, OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE___REFRESH);
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
		initEClass(objectWithPropagatorFunctionAdapterEClass, ObjectWithPropagatorFunctionAdapter.class, "ObjectWithPropagatorFunctionAdapter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObjectWithPropagatorFunctionAdapter__AddPropagatorFunctionAdapter(), null, "addPropagatorFunctionAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectWithPropagatorFunctionAdapterScopeEClass, ObjectWithPropagatorFunctionAdapterScope.class, "ObjectWithPropagatorFunctionAdapterScope", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObjectWithPropagatorFunctionAdapterScope__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PropagatorPackageImpl
