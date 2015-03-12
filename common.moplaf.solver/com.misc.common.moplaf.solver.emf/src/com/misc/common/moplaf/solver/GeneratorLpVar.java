/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVar#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVar#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVar#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVar#getObjectiveCoeff <em>Objective Coeff</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVar()
 * @model
 * @generated
 */
public interface GeneratorLpVar extends GeneratorVar {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumLpVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpVarType
	 * @see #setType(EnumLpVarType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVar_Type()
	 * @model required="true"
	 * @generated
	 */
	EnumLpVarType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpVarType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumLpVarType value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVar_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	float getLowerBound();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(float value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVar_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	float getUpperBound();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(float value);

	/**
	 * Returns the value of the '<em><b>Objective Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Coeff</em>' attribute.
	 * @see #setObjectiveCoeff(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVar_ObjectiveCoeff()
	 * @model required="true"
	 * @generated
	 */
	float getObjectiveCoeff();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getObjectiveCoeff <em>Objective Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Coeff</em>' attribute.
	 * @see #getObjectiveCoeff()
	 * @generated
	 */
	void setObjectiveCoeff(float value);

} // GeneratorLpVar
