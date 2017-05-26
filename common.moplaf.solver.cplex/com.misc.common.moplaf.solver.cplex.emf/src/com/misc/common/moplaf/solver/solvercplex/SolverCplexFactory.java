/**
 */
package com.misc.common.moplaf.solver.solvercplex;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage
 * @generated
 */
public interface SolverCplexFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverCplexFactory eINSTANCE = com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Cplex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Cplex</em>'.
	 * @generated
	 */
	SolverCplex createSolverCplex();

	/**
	 * Returns a new object of class '<em>Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Params</em>'.
	 * @generated
	 */
	SolverCplexParams createSolverCplexParams();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverCplexPackage getSolverCplexPackage();

} //SolverCplexFactory
