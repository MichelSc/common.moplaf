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
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage
 * @generated
 */
public interface SolverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverFactory eINSTANCE = com.misc.common.moplaf.solver.impl.SolverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generator Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Element</em>'.
	 * @generated
	 */
	GeneratorElement createGeneratorElement();

	/**
	 * Returns a new object of class '<em>Generator Lp Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Goal</em>'.
	 * @generated
	 */
	GeneratorLpGoal createGeneratorLpGoal();

	/**
	 * Returns a new object of class '<em>Generator Lp Linear</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Linear</em>'.
	 * @generated
	 */
	GeneratorLpLinear createGeneratorLpLinear();

	/**
	 * Returns a new object of class '<em>Lp Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Params</em>'.
	 * @generated
	 */
	SolverLpParams createSolverLpParams();

	/**
	 * Returns a new object of class '<em>Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Params</em>'.
	 * @generated
	 */
	SolverParams createSolverParams();

	/**
	 * Returns a new object of class '<em>Solution Provider Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Provider Params</em>'.
	 * @generated
	 */
	SolutionProviderParams createSolutionProviderParams();

	/**
	 * Returns a new object of class '<em>Generator Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Var Binder</em>'.
	 * @generated
	 */
	GeneratorVarBinder createGeneratorVarBinder();

	/**
	 * Returns a new object of class '<em>Generator Lp Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Var Binder</em>'.
	 * @generated
	 */
	GeneratorLpVarBinder createGeneratorLpVarBinder();

	/**
	 * Returns a new object of class '<em>Generator Lp Var Binder To Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Var Binder To Solution</em>'.
	 * @generated
	 */
	GeneratorLpVarBinderToSolution createGeneratorLpVarBinderToSolution();

	/**
	 * Returns a new object of class '<em>Generator Lp Var Binder To Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Var Binder To Value</em>'.
	 * @generated
	 */
	GeneratorLpVarBinderToValue createGeneratorLpVarBinderToValue();

	/**
	 * Returns a new object of class '<em>Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Binder</em>'.
	 * @generated
	 */
	SolverVarBinder createSolverVarBinder();

	/**
	 * Returns a new object of class '<em>Lp Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Var Binder</em>'.
	 * @generated
	 */
	SolverLpVarBinder createSolverLpVarBinder();

	/**
	 * Returns a new object of class '<em>Lp Var Binder To Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Var Binder To Solution</em>'.
	 * @generated
	 */
	SolverLpVarBinderToSolution createSolverLpVarBinderToSolution();

	/**
	 * Returns a new object of class '<em>Lp Var Binder To Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Var Binder To Value</em>'.
	 * @generated
	 */
	SolverLpVarBinderToValue createSolverLpVarBinderToValue();

	/**
	 * Returns a new object of class '<em>Generator Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Goal</em>'.
	 * @generated
	 */
	SolverGeneratorGoal createSolverGeneratorGoal();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Solution Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Element</em>'.
	 * @generated
	 */
	SolutionElement createSolutionElement();

	/**
	 * Returns a new object of class '<em>Solution Lp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Lp</em>'.
	 * @generated
	 */
	SolutionLp createSolutionLp();

	/**
	 * Returns a new object of class '<em>Generator Lp Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Var</em>'.
	 * @generated
	 */
	GeneratorLpVar createGeneratorLpVar();

	/**
	 * Returns a new object of class '<em>Generator Lp Cons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Cons</em>'.
	 * @generated
	 */
	GeneratorLpCons createGeneratorLpCons();

	/**
	 * Returns a new object of class '<em>Generator Lp Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Term</em>'.
	 * @generated
	 */
	GeneratorLpTerm createGeneratorLpTerm();

	/**
	 * Returns a new object of class '<em>Solution Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Var</em>'.
	 * @generated
	 */
	SolutionVar createSolutionVar();

	/**
	 * Returns a new object of class '<em>Solution Reader Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Reader Pattern</em>'.
	 * @generated
	 */
	SolutionReaderPattern createSolutionReaderPattern();

	/**
	 * Returns a new object of class '<em>Solution Lp Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Lp Var</em>'.
	 * @generated
	 */
	SolutionLpVar createSolutionLpVar();

	/**
	 * Returns a new object of class '<em>Solution Cons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Cons</em>'.
	 * @generated
	 */
	SolutionCons createSolutionCons();

	/**
	 * Returns a new object of class '<em>Solution Lp Cons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Lp Cons</em>'.
	 * @generated
	 */
	SolutionLpCons createSolutionLpCons();

	/**
	 * Returns a new object of class '<em>Solution Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Goal</em>'.
	 * @generated
	 */
	SolutionGoal createSolutionGoal();

	/**
	 * Returns a new object of class '<em>Solution Lp Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Lp Goal</em>'.
	 * @generated
	 */
	SolutionLpGoal createSolutionLpGoal();

	/**
	 * Returns a new object of class '<em>Generator Cp Linear</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Cp Linear</em>'.
	 * @generated
	 */
	GeneratorCpLinear createGeneratorCpLinear();

	/**
	 * Returns a new object of class '<em>Generator Cp Logical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Cp Logical</em>'.
	 * @generated
	 */
	GeneratorCpLogical createGeneratorCpLogical();

	/**
	 * Returns a new object of class '<em>Generator Cp Var Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Cp Var Atomic</em>'.
	 * @generated
	 */
	GeneratorCpVarAtomic createGeneratorCpVarAtomic();

	/**
	 * Returns a new object of class '<em>Generator Cp Linear Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Cp Linear Term</em>'.
	 * @generated
	 */
	GeneratorCpLinearTerm createGeneratorCpLinearTerm();

	/**
	 * Returns a new object of class '<em>Generator Cp Logical Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Cp Logical Term</em>'.
	 * @generated
	 */
	GeneratorCpLogicalTerm createGeneratorCpLogicalTerm();

	/**
	 * Returns a new object of class '<em>Solution Cp Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Cp Var</em>'.
	 * @generated
	 */
	SolutionCpVar createSolutionCpVar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverPackage getSolverPackage();

} //SolverFactory
