/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Var Binder To Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVarBinderToValue#getBoundValue <em>Bound Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarBinderToValue()
 * @model
 * @generated
 */
public interface GeneratorLpVarBinderToValue extends GeneratorLpVarBinder {
	/**
	 * Returns the value of the '<em><b>Bound Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Value</em>' attribute.
	 * @see #setBoundValue(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarBinderToValue_BoundValue()
	 * @model
	 * @generated
	 */
	float getBoundValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVarBinderToValue#getBoundValue <em>Bound Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Value</em>' attribute.
	 * @see #getBoundValue()
	 * @generated
	 */
	void setBoundValue(float value);

} // GeneratorLpVarBinderToValue
