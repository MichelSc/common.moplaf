/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.common.EnabledFeedback;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A delta is an elementary change to the solution, composed of  a limited (constant) number of modifications with respect to the solution 
 *  
 * So the score of a  move must be calculated in a limited time (with respect to the size of the solution).
 * 
 * A Delta is part of a tree structure, where the parent is the previous delta executed, and the children are alternative next moves to be executed after this delta..
 * 
 * A delta supports an undo operation. All the changes in the current solution that are carried out during the do are recorded and will be undone durring the undo. Note that the changes in the score of the current solution and the changes in the propagator functions will be undone as well, but the change in the score associated to this move will remain.
 * 
 * A Delta is specific to a given implementation (to a specific Action). The implementation must only provide logic for the do operation. The framework will iterate on the Deltas, and for every Delta, do the Delta, trigger the Score calculation, compare it to the best Score so far, and finally undo the Delta.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getAction <em>Action</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getPreviousDelta <em>Previous Delta</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getNextDeltas <em>Next Deltas</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getDoEnabledFeedback <em>Do Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getUndoEnabledFeedback <em>Undo Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getSelectEnabledFeedback <em>Select Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#isCurrent <em>Current</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Delta#isSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta()
 * @model abstract="true"
 * @generated
 */
public interface Delta extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_Action()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Score)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_Score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Delta#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Previous Delta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Delta#getNextDeltas <em>Next Deltas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Delta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Delta</em>' container reference.
	 * @see #setPreviousDelta(Delta)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_PreviousDelta()
	 * @see com.misc.common.moplaf.localsearch.Delta#getNextDeltas
	 * @model opposite="NextDeltas" transient="false"
	 * @generated
	 */
	Delta getPreviousDelta();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Delta#getPreviousDelta <em>Previous Delta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Delta</em>' container reference.
	 * @see #getPreviousDelta()
	 * @generated
	 */
	void setPreviousDelta(Delta value);

	/**
	 * Returns the value of the '<em><b>Next Deltas</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Delta}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Delta#getPreviousDelta <em>Previous Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Deltas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Deltas</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_NextDeltas()
	 * @see com.misc.common.moplaf.localsearch.Delta#getPreviousDelta
	 * @model opposite="PreviousDelta" containment="true"
	 * @generated
	 */
	EList<Delta> getNextDeltas();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_ValidFeedback()
	 * @model dataType="com.misc.common.moplaf.localsearch.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getValidFeedback();

	/**
	 * Returns the value of the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Enabled Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Enabled Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_DoEnabledFeedback()
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
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_UndoEnabledFeedback()
	 * @model dataType="com.misc.common.moplaf.localsearch.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getUndoEnabledFeedback();

	/**
	 * Returns the value of the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Enabled Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Enabled Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_SelectEnabledFeedback()
	 * @model dataType="com.misc.common.moplaf.localsearch.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getSelectEnabledFeedback();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_Current()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' attribute.
	 * @see #setSolution(boolean)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getDelta_Solution()
	 * @model
	 * @generated
	 */
	boolean isSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Delta#isSolution <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' attribute.
	 * @see #isSolution()
	 * @generated
	 */
	void setSolution(boolean value);

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

} // Delta
