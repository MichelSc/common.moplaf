/**
 */
package com.misc.common.moplaf.solver.solverjavailp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage
 * @generated
 */
public interface SolverjavailpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverjavailpFactory eINSTANCE = com.misc.common.moplaf.solver.solverjavailp.impl.SolverjavailpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Java ILP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Java ILP</em>'.
	 * @generated
	 */
	SolverJavaILP createSolverJavaILP();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverjavailpPackage getSolverjavailpPackage();

} //SolverjavailpFactory
