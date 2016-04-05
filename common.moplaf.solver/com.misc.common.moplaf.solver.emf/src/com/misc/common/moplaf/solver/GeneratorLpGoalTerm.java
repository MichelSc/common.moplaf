/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Goal Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getLpVar <em>Lp Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getLpGoal <em>Lp Goal</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoalTerm()
 * @model
 * @generated
 */
public interface GeneratorLpGoalTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff</em>' attribute.
	 * @see #setCoeff(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoalTerm_Coeff()
	 * @model
	 * @generated
	 */
	float getCoeff();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getCoeff <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff</em>' attribute.
	 * @see #getCoeff()
	 * @generated
	 */
	void setCoeff(float value);

	/**
	 * Returns the value of the '<em><b>Lp Var</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getLpGoalTerm <em>Lp Goal Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Var</em>' reference.
	 * @see #setLpVar(GeneratorLpVar)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoalTerm_LpVar()
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getLpGoalTerm
	 * @model opposite="LpGoalTerm" required="true"
	 * @generated
	 */
	GeneratorLpVar getLpVar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getLpVar <em>Lp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Var</em>' reference.
	 * @see #getLpVar()
	 * @generated
	 */
	void setLpVar(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Lp Goal</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getLpGoalTerm <em>Lp Goal Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Goal</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Goal</em>' container reference.
	 * @see #setLpGoal(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoalTerm_LpGoal()
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal#getLpGoalTerm
	 * @model opposite="LpGoalTerm" required="true" transient="false"
	 * @generated
	 */
	GeneratorLpGoal getLpGoal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoalTerm#getLpGoal <em>Lp Goal</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Goal</em>' container reference.
	 * @see #getLpGoal()
	 * @generated
	 */
	void setLpGoal(GeneratorLpGoal value);

} // GeneratorLpGoalTerm
