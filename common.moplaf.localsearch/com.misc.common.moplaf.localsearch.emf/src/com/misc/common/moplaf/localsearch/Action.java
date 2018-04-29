/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Action receives a Solution and modifies it in order to achieve some specific goal. For this, it considers a number of Moves, and retain the Move giving the best Solution.
 * 
 * The specific logic of the Action is provided by the Action specialization, in the method createMovesImpl, that must create the Moves to be considered while executing the Action.
 * 
 * The flow of an Action is thus 1) to receive a Solution in the reference CurrentSolution, 2) to create all the Moves to be considered, 3) to select the Move giving the best Score, 3) to leave the CurrentSolution as the solution corresponding to the best Move.
 * 
 * Note that the system will select a Move, even if all of them result in worst Solution. If it is desired to consider the received solution as a candidate for the resulting Solution, it is then necessary to provides a Move doing nothing (a no-op Move).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getStartDeltas <em>Start Deltas</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getCurrentDelta <em>Current Delta</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getActionNr <em>Action Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Action#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends SolutionChange {
	/**
	 * Returns the value of the '<em><b>Start Deltas</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Delta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Deltas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Deltas</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_StartDeltas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delta> getStartDeltas();

	/**
	 * Returns the value of the '<em><b>Current Delta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Delta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Delta</em>' reference.
	 * @see #setCurrentDelta(Delta)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_CurrentDelta()
	 * @model
	 * @generated
	 */
	Delta getCurrentDelta();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Action#getCurrentDelta <em>Current Delta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Delta</em>' reference.
	 * @see #getCurrentDelta()
	 * @generated
	 */
	void setCurrentDelta(Delta value);

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
	 * Returns the value of the '<em><b>Action Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Nr</em>' attribute.
	 * @see #setActionNr(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_ActionNr()
	 * @model
	 * @generated
	 */
	int getActionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Action#getActionNr <em>Action Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Nr</em>' attribute.
	 * @see #getActionNr()
	 * @generated
	 */
	void setActionNr(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Step#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' container reference.
	 * @see #setStep(Step)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getAction_Step()
	 * @see com.misc.common.moplaf.localsearch.Step#getActions
	 * @model opposite="Actions" required="true" transient="false"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Action#getStep <em>Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' container reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void select(Delta target_move);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doAction(Phase phase, Step step);

} // Action
