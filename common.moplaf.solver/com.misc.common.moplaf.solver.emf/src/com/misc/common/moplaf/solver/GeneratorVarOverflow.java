/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Var Overflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVarOverflow#getCostOverFlow <em>Cost Over Flow</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVarOverflow#isMaxEnforce <em>Max Enforce</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarOverflow()
 * @model
 * @generated
 */
public interface GeneratorVarOverflow extends GeneratorFeatureMode {
	/**
	 * Returns the value of the '<em><b>Cost Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Over Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Over Flow</em>' attribute.
	 * @see #setCostOverFlow(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarOverflow_CostOverFlow()
	 * @model
	 * @generated
	 */
	float getCostOverFlow();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorVarOverflow#getCostOverFlow <em>Cost Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Over Flow</em>' attribute.
	 * @see #getCostOverFlow()
	 * @generated
	 */
	void setCostOverFlow(float value);

	/**
	 * Returns the value of the '<em><b>Max Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Enforce</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Enforce</em>' attribute.
	 * @see #setMaxEnforce(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarOverflow_MaxEnforce()
	 * @model
	 * @generated
	 */
	boolean isMaxEnforce();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorVarOverflow#isMaxEnforce <em>Max Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Enforce</em>' attribute.
	 * @see #isMaxEnforce()
	 * @generated
	 */
	void setMaxEnforce(boolean value);

} // GeneratorVarOverflow
