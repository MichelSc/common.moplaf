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

import com.misc.common.moplaf.solver.solverneos.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverneosFactoryImpl extends EFactoryImpl implements SolverneosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolverneosFactory init() {
		try {
			SolverneosFactory theSolverneosFactory = (SolverneosFactory)EPackage.Registry.INSTANCE.getEFactory(SolverneosPackage.eNS_URI);
			if (theSolverneosFactory != null) {
				return theSolverneosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SolverneosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverneosFactoryImpl() {
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
			case SolverneosPackage.SOLVER_NEOS: return createSolverNeos();
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
			case SolverneosPackage.ENUM_NEOS_SOLVER_CATEGORY:
				return createEnumNeosSolverCategoryFromString(eDataType, initialValue);
			case SolverneosPackage.ENUM_NEOS_SOLVER_NAME:
				return createEnumNeosSolverNameFromString(eDataType, initialValue);
			case SolverneosPackage.ENUM_NEOS_SOLVER_INPUT:
				return createEnumNeosSolverInputFromString(eDataType, initialValue);
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
			case SolverneosPackage.ENUM_NEOS_SOLVER_CATEGORY:
				return convertEnumNeosSolverCategoryToString(eDataType, instanceValue);
			case SolverneosPackage.ENUM_NEOS_SOLVER_NAME:
				return convertEnumNeosSolverNameToString(eDataType, instanceValue);
			case SolverneosPackage.ENUM_NEOS_SOLVER_INPUT:
				return convertEnumNeosSolverInputToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverNeos createSolverNeos() {
		SolverNeosImpl solverNeos = new SolverNeosImpl();
		return solverNeos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNeosSolverCategory createEnumNeosSolverCategoryFromString(EDataType eDataType, String initialValue) {
		EnumNeosSolverCategory result = EnumNeosSolverCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumNeosSolverCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNeosSolverName createEnumNeosSolverNameFromString(EDataType eDataType, String initialValue) {
		EnumNeosSolverName result = EnumNeosSolverName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumNeosSolverNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNeosSolverInput createEnumNeosSolverInputFromString(EDataType eDataType, String initialValue) {
		EnumNeosSolverInput result = EnumNeosSolverInput.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumNeosSolverInputToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverneosPackage getSolverneosPackage() {
		return (SolverneosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SolverneosPackage getPackage() {
		return SolverneosPackage.eINSTANCE;
	}

} //SolverneosFactoryImpl
