/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Binder To Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinderToValue#getBoundValue <em>Bound Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinderToValue()
 * @model
 * @generated
 */
public interface SolverVarBinderToValue extends SolverVarBinder {
	/**
	 * Returns the value of the '<em><b>Bound Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Value</em>' attribute.
	 * @see #setBoundValue(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinderToValue_BoundValue()
	 * @model
	 * @generated
	 */
	double getBoundValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverVarBinderToValue#getBoundValue <em>Bound Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Value</em>' attribute.
	 * @see #getBoundValue()
	 * @generated
	 */
	void setBoundValue(double value);

} // SolverVarBinderToValue
