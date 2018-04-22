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
package com.misc.common.moplaf.propagator2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.misc.common.moplaf.propagator2.*;
import com.misc.common.moplaf.propagator2.util.Bindings;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagatorFactoryImpl extends EFactoryImpl implements PropagatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropagatorFactory init() {
		try {
			PropagatorFactory thePropagatorFactory = (PropagatorFactory)EPackage.Registry.INSTANCE.getEFactory(PropagatorPackage.eNS_URI);
			if (thePropagatorFactory != null) {
				return thePropagatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropagatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS: return createObjectWithPropagatorFunctions();
			case PropagatorPackage.PROPAGATOR_FUNCTION: return createPropagatorFunction();
			case PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS: return createPropagatorFunctionBindings();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PropagatorPackage.BINDINGS:
				return createBindingsFromString(eDataType, initialValue);
			case PropagatorPackage.REFRESHER:
				return createRefresherFromString(eDataType, initialValue);
			case PropagatorPackage.NOTIFICATION:
				return createNotificationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PropagatorPackage.BINDINGS:
				return convertBindingsToString(eDataType, instanceValue);
			case PropagatorPackage.REFRESHER:
				return convertRefresherToString(eDataType, instanceValue);
			case PropagatorPackage.NOTIFICATION:
				return convertNotificationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectWithPropagatorFunctions createObjectWithPropagatorFunctions() {
		ObjectWithPropagatorFunctionsImpl objectWithPropagatorFunctions = new ObjectWithPropagatorFunctionsImpl();
		return objectWithPropagatorFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunction createPropagatorFunction() {
		PropagatorFunctionImpl propagatorFunction = new PropagatorFunctionImpl();
		return propagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunctionBindings createPropagatorFunctionBindings() {
		PropagatorFunctionBindingsImpl propagatorFunctionBindings = new PropagatorFunctionBindingsImpl();
		return propagatorFunctionBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bindings createBindingsFromString(EDataType eDataType, String initialValue) {
		return (Bindings)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotificationFromString(EDataType eDataType, String initialValue) {
		return (Notification)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refresher createRefresherFromString(EDataType eDataType, String initialValue) {
		return (Refresher)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefresherToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorPackage getPropagatorPackage() {
		return (PropagatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropagatorPackage getPackage() {
		return PropagatorPackage.eINSTANCE;
	}

} //PropagatorFactoryImpl
