/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal()
 * @model
 * @generated
 */
public interface SolutionGoal extends SolutionElement {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(GeneratorGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Goal()
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getSolution
	 * @model opposite="Solution" required="true"
	 * @generated
	 */
	GeneratorGoal getGoal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(GeneratorGoal value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumGoalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumGoalType
	 * @see #setType(EnumGoalType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Type()
	 * @model
	 * @generated
	 */
	EnumGoalType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionGoal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumGoalType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumGoalType value);

} // SolutionGoal
