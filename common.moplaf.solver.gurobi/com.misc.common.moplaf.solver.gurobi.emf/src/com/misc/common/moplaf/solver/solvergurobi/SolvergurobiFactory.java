/**
 */
package com.misc.common.moplaf.solver.solvergurobi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solvergurobi.SolvergurobiPackage
 * @generated
 */
public interface SolvergurobiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolvergurobiFactory eINSTANCE = com.misc.common.moplaf.solver.solvergurobi.impl.SolvergurobiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Gurobi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Gurobi</em>'.
	 * @generated
	 */
	SolverGurobi createSolverGurobi();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolvergurobiPackage getSolvergurobiPackage();

} //SolvergurobiFactory
