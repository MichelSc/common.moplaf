/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.common.EnabledFeedback;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A move is a small change to the solution.
 * Small meaning a limited (constant) number of deltas with respect to the solution . 
 * So the score a  move must be calculated in a constant time (with respect to the size of the solution).
 * A move is specific to a given solution (to a specific Action).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#getAction <em>Action</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#getNextMoves <em>Next Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#isCurrent <em>Current</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#getDoEnabledFeedback <em>Do Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Move#getUndoEnabledFeedback <em>Undo Enabled Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove()
 * @model abstract="true"
 * @generated
 */
public interface Move extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Moves</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Move}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Move#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Moves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Moves</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_NextMoves()
	 * @see com.misc.common.moplaf.localsearch.Move#getPrevious
	 * @model opposite="Previous" containment="true"
	 * @generated
	 */
	EList<Move> getNextMoves();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Move#getNextMoves <em>Next Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' container reference.
	 * @see #setPrevious(Move)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_Previous()
	 * @see com.misc.common.moplaf.localsearch.Move#getNextMoves
	 * @model opposite="NextMoves" transient="false"
	 * @generated
	 */
	Move getPrevious();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Move#getPrevious <em>Previous</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' container reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Move value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_Valid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Returns the value of the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Enabled Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Enabled Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_DoEnabledFeedback()
	 * @model dataType="com.misc.common.moplaf.localsearch.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getDoEnabledFeedback();

	/**
	 * Returns the value of the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undo Enabled Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undo Enabled Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_UndoEnabledFeedback()
	 * @model dataType="com.misc.common.moplaf.localsearch.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getUndoEnabledFeedback();

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Score)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_Score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Move#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_Action()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getMove_Current()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the CurrentSolution to the SelectedMove
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void do_();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revert all the changes performed by the Action, and the changes in the derived data, performed by the refresh.
	 * Note that the score has been saved in this.Score. The latter will not be undone.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String isValidFeedback();

} // Move
