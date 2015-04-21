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
	 * Returns a new object of class '<em>Generator Tuple Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Tuple Element</em>'.
	 * @generated
	 */
	GeneratorTupleElement createGeneratorTupleElement();

	/**
	 * Returns a new object of class '<em>Generator Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Element</em>'.
	 * @generated
	 */
	GeneratorElement createGeneratorElement();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

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
	 * Returns a new object of class '<em>Solution Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Provider</em>'.
	 * @generated
	 */
	SolutionProvider createSolutionProvider();

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
