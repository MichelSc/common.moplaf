/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Action:
 *   plan this planUnit
 *   plan some planUnit:
 *      select a planUnit, or not
 *      construct the Moves
 *      estimate/score
 *      apply/revert
 *      repeat a given number of times
 * An action is the unit of execution with a given goal, that will be attained by considering a set of moves and evaluating them completly.
 * The result of an action is not the next current solution to be considered, but only a step in its direction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getRootMoves <em>Root Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getCurrentMove <em>Current Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getCurrentSolution <em>Current Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Moves</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Moves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Moves</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_RootMoves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getRootMoves();

	/**
	 * Returns the value of the '<em><b>Current Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Move</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Move</em>' reference.
	 * @see #setCurrentMove(Move)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_CurrentMove()
	 * @model
	 * @generated
	 */
	Move getCurrentMove();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Action#getCurrentMove <em>Current Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Move</em>' reference.
	 * @see #getCurrentMove()
	 * @generated
	 */
	void setCurrentMove(Move value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution</em>' reference.
	 * @see #setCurrentSolution(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_CurrentSolution()
	 * @model
	 * @generated
	 */
	Solution getCurrentSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Action#getCurrentSolution <em>Current Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution</em>' reference.
	 * @see #getCurrentSolution()
	 * @generated
	 */
	void setCurrentSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_Valid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Returns the value of the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_ValidFeedback()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getValidFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exectue all the moves and retain their scores
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Select one of the move, and aligne the solution to it
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finalize();

} // Action
