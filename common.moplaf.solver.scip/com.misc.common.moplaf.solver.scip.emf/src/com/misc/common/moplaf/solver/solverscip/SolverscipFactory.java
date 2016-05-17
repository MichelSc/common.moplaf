/**
 */
package com.misc.common.moplaf.solver.solverscip;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverscip.SolverscipPackage
 * @generated
 */
public interface SolverscipFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverscipFactory eINSTANCE = com.misc.common.moplaf.solver.solverscip.impl.SolverscipFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Scip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Scip</em>'.
	 * @generated
	 */
	SolverScip createSolverScip();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverscipPackage getSolverscipPackage();

} //SolverscipFactory
