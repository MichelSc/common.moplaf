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
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getStepNr <em>Step Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getPhase <em>Phase</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends SolutionChange {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Action}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_Actions()
	 * @see com.misc.common.moplaf.localsearch.Action#getStep
	 * @model opposite="Step" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Step Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Nr</em>' attribute.
	 * @see #setStepNr(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_StepNr()
	 * @model
	 * @generated
	 */
	int getStepNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Step#getStepNr <em>Step Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Nr</em>' attribute.
	 * @see #getStepNr()
	 * @generated
	 */
	void setStepNr(int value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Phase#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' container reference.
	 * @see #setPhase(Phase)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_Phase()
	 * @see com.misc.common.moplaf.localsearch.Phase#getSteps
	 * @model opposite="Steps" required="true" transient="false"
	 * @generated
	 */
	Phase getPhase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Step#getPhase <em>Phase</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' container reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(Phase value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(String)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_Step()
	 * @model
	 * @generated
	 */
	String getStep();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Step#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doStep(Phase phase);

} // Step
