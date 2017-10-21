/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Solve the problem.
 * Manage a pool of solutions.
 * Carry out the improvment stetps one be one.
 * For every improvment step:
 *   - iterate a number of times (limited in number or in time)
 *  - select a solution in the pool
 *  - do the improvment
 *  - decide if the new solutions makes it to the pool or not
 *    is this not too early?
 *    should we not iterate a little bit before deciding copy or not copy?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getImprovments <em>Improvments</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getBestSolution <em>Best Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy()
 * @model abstract="true"
 * @generated
 */
public interface Strategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Improvments</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Improvment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Improvments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improvments</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_Improvments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Improvment> getImprovments();

	/**
	 * Returns the value of the '<em><b>Best Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Solution</em>' reference.
	 * @see #setBestSolution(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_BestSolution()
	 * @model
	 * @generated
	 */
	Solution getBestSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getBestSolution <em>Best Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Solution</em>' reference.
	 * @see #getBestSolution()
	 * @generated
	 */
	void setBestSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Solution}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Solution#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_Solutions()
	 * @see com.misc.common.moplaf.localsearch.Solution#getStrategy
	 * @model opposite="Strategy" containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #setCurrentSolutionNr(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_CurrentSolutionNr()
	 * @model
	 * @generated
	 */
	int getCurrentSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getCurrentSolutionNr <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #getCurrentSolutionNr()
	 * @generated
	 */
	void setCurrentSolutionNr(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void selectSolutionsToImprove();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pruneSolution();

} // Strategy
