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
package com.misc.common.moplaf.solver.solvercplex.impl;

import com.misc.common.moplaf.solver.solvercplex.*;

import org.eclipse.emf.ecore.EClass;
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
public class SolverCplexFactoryImpl extends EFactoryImpl implements SolverCplexFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolverCplexFactory init() {
		try {
			SolverCplexFactory theSolverCplexFactory = (SolverCplexFactory)EPackage.Registry.INSTANCE.getEFactory(SolverCplexPackage.eNS_URI);
			if (theSolverCplexFactory != null) {
				return theSolverCplexFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SolverCplexFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplexFactoryImpl() {
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
			case SolverCplexPackage.SOLVER_CPLEX: return createSolverCplex();
			case SolverCplexPackage.SOLVER_CPLEX_PARAMS: return createSolverCplexParams();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplex createSolverCplex() {
		SolverCplexImpl solverCplex = new SolverCplexImpl();
		return solverCplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplexParams createSolverCplexParams() {
		SolverCplexParamsImpl solverCplexParams = new SolverCplexParamsImpl();
		return solverCplexParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverCplexPackage getSolverCplexPackage() {
		return (SolverCplexPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SolverCplexPackage getPackage() {
		return SolverCplexPackage.eINSTANCE;
	}

} //SolverCplexFactoryImpl
