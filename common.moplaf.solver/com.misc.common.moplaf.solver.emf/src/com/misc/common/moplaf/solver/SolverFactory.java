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
	 * Returns a new object of class '<em>Generator Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Goal</em>'.
	 * @generated
	 */
	SolverGeneratorGoal createSolverGeneratorGoal();

	/**
	 * Returns a new object of class '<em>Goal Previous Solver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Previous Solver</em>'.
	 * @generated
	 */
	SolverGoalPreviousSolver createSolverGoalPreviousSolver();

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
	 * Returns a new object of class '<em>Generator Lp Cons Count Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Cons Count Element</em>'.
	 * @generated
	 */
	GeneratorLpConsCountElement createGeneratorLpConsCountElement();

	/**
	 * Returns a new object of class '<em>Generator Lp Var Count Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Var Count Element</em>'.
	 * @generated
	 */
	GeneratorLpVarCountElement createGeneratorLpVarCountElement();

	/**
	 * Returns a new object of class '<em>Generator Lp Var Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Var Count</em>'.
	 * @generated
	 */
	GeneratorLpVarCount createGeneratorLpVarCount();

	/**
	 * Returns a new object of class '<em>Generator Lp Cons Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Lp Cons Count</em>'.
	 * @generated
	 */
	GeneratorLpConsCount createGeneratorLpConsCount();

	/**
	 * Returns a new object of class '<em>Generator Feature Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Feature Mode</em>'.
	 * @generated
	 */
	GeneratorFeatureMode createGeneratorFeatureMode();

	/**
	 * Returns a new object of class '<em>Generator Constraint Enabler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Constraint Enabler</em>'.
	 * @generated
	 */
	GeneratorConstraintEnabler createGeneratorConstraintEnabler();

	/**
	 * Returns a new object of class '<em>Generator Var Overflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Var Overflow</em>'.
	 * @generated
	 */
	GeneratorVarOverflow createGeneratorVarOverflow();

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
