/**
 */
package com.misc.common.moplaf.solver.solverneos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage
 * @generated
 */
public interface SolverneosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverneosFactory eINSTANCE = com.misc.common.moplaf.solver.solverneos.impl.SolverneosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Neos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Neos</em>'.
	 * @generated
	 */
	SolverNeos createSolverNeos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverneosPackage getSolverneosPackage();

} //SolverneosFactory
