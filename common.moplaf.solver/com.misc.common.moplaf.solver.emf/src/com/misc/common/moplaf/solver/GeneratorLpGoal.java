/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getLpGoalTerm <em>Lp Goal Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getGoalWeight <em>Goal Weight</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal()
 * @model
 * @generated
 */
public interface GeneratorLpGoal extends GeneratorGoal {
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
	 * Returns the value of the '<em><b>Lp Goal Term</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getLpGoal <em>Lp Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Goal Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Goal Term</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_LpGoalTerm()
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getLpGoal
	 * @model opposite="LpGoal" containment="true"
	 * @generated
	 */
	EList<GeneratorLpGoalTerm> getLpGoalTerm();

	/**
	 * Returns the value of the '<em><b>Goal Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Weight</em>' attribute.
	 * @see #setGoalWeight(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_GoalWeight()
	 * @model required="true"
	 * @generated
	 */
	float getGoalWeight();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getGoalWeight <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Weight</em>' attribute.
	 * @see #getGoalWeight()
	 * @generated
	 */
	void setGoalWeight(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GeneratorLpGoalTerm constructTerm(GeneratorLpVar var, float coef);

} // GeneratorLpGoal
