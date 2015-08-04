/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionCons#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionCons#getCons <em>Cons</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionCons()
 * @model
 * @generated
 */
public interface SolutionCons extends EObject {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solution#getCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' container reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionCons_Solution()
	 * @see com.misc.common.moplaf.solver.Solution#getCons
	 * @model opposite="Cons" required="true" transient="false"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionCons#getSolution <em>Solution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' container reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Cons</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorCons#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons</em>' reference.
	 * @see #setCons(GeneratorCons)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionCons_Cons()
	 * @see com.misc.common.moplaf.solver.GeneratorCons#getSolution
	 * @model opposite="Solution" required="true"
	 * @generated
	 */
	GeneratorCons getCons();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionCons#getCons <em>Cons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons</em>' reference.
	 * @see #getCons()
	 * @generated
	 */
	void setCons(GeneratorCons value);

} // SolutionCons
