/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionVar#getOptimalValue <em>Optimal Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionVar#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionVar#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar()
 * @model
 * @generated
 */
public interface SolutionVar extends EObject {
	/**
	 * Returns the value of the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimal Value</em>' attribute.
	 * @see #setOptimalValue(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar_OptimalValue()
	 * @model
	 * @generated
	 */
	float getOptimalValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionVar#getOptimalValue <em>Optimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimal Value</em>' attribute.
	 * @see #getOptimalValue()
	 * @generated
	 */
	void setOptimalValue(float value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solution#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' container reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar_Solution()
	 * @see com.misc.common.moplaf.solver.Solution#getVar
	 * @model opposite="Var" required="true" transient="false"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionVar#getSolution <em>Solution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' container reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorVar#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(GeneratorVar)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar_Var()
	 * @see com.misc.common.moplaf.solver.GeneratorVar#getSolution
	 * @model opposite="Solution" required="true"
	 * @generated
	 */
	GeneratorVar getVar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionVar#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(GeneratorVar value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOne();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isZero();

} // SolutionVar
