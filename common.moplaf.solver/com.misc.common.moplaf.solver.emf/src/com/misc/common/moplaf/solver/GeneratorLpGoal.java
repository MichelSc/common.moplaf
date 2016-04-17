/**
 */
package com.misc.common.moplaf.solver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getObjectiveType <em>Objective Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal()
 * @model
 * @generated
 */
public interface GeneratorLpGoal extends GeneratorGoal, GeneratorLpLinear {
	/**
	 * Returns the value of the '<em><b>Objective Type</b></em>' attribute.
	 * The default value is <code>"Maximum"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see #setObjectiveType(EnumObjectiveType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_ObjectiveType()
	 * @model default="Maximum"
	 * @generated
	 */
	EnumObjectiveType getObjectiveType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getObjectiveType <em>Objective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see #getObjectiveType()
	 * @generated
	 */
	void setObjectiveType(EnumObjectiveType value);

	/**
	 * Returns the value of the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution Value</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_SelectedSolutionValue()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getSelectedSolutionValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getSolutionValue(Solution solution);

} // GeneratorLpGoal
