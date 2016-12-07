/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGoal#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGoal#getSolver <em>Solver</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoal()
 * @model abstract="true"
 * @generated
 */
public interface SolverGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoal_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Solver</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solver#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' container reference.
	 * @see #setSolver(Solver)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoal_Solver()
	 * @see com.misc.common.moplaf.solver.Solver#getGoals
	 * @model opposite="Goals" required="true" transient="false"
	 * @generated
	 */
	Solver getSolver();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGoal#getSolver <em>Solver</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' container reference.
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(Solver value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void buildGoal() throws Exception;

} // SolverGoal
