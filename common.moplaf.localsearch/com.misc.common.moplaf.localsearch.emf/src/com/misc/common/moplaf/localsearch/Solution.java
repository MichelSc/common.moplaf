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

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Solution#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Solution#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Solution#getStep <em>Step</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Solution#getReferences <em>References</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Solution#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution()
 * @model abstract="true"
 * @generated
 */
public interface Solution extends ObjectWithPropagatorFunctions {
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
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution_Score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Solution#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Nr</em>' attribute.
	 * @see #setSolutionNr(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution_SolutionNr()
	 * @model
	 * @generated
	 */
	int getSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Solution#getSolutionNr <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Nr</em>' attribute.
	 * @see #getSolutionNr()
	 * @generated
	 */
	void setSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Strategy#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' container reference.
	 * @see #setStrategy(Strategy)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution_Strategy()
	 * @see com.misc.common.moplaf.localsearch.Strategy#getSolutions
	 * @model opposite="Solutions" required="true" transient="false"
	 * @generated
	 */
	Strategy getStrategy();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Solution#getStrategy <em>Strategy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' container reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Strategy value);

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
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution_Step()
	 * @model
	 * @generated
	 */
	String getStep();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Solution#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.SolutionRef}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.SolutionRef#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution_References()
	 * @see com.misc.common.moplaf.localsearch.SolutionRef#getSolution
	 * @model opposite="Solution"
	 * @generated
	 */
	EList<SolutionRef> getReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionRef clone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionRef constructSolutionRef();

} // Solution
