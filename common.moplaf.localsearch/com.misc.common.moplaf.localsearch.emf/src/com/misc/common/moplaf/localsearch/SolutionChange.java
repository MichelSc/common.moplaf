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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getStartSolution <em>Start Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getEndSolution <em>End Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getCurrentSolution <em>Current Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getPreviousChange <em>Previous Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getSubChanges <em>Sub Changes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getSuperChange <em>Super Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#isKeepSolutions <em>Keep Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#isNewSolution <em>New Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange()
 * @model abstract="true"
 * @generated
 */
public interface SolutionChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Solution</em>' containment reference.
	 * @see #setStartSolution(SolutionRef)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_StartSolution()
	 * @model containment="true"
	 * @generated
	 */
	SolutionRef getStartSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#getStartSolution <em>Start Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Solution</em>' containment reference.
	 * @see #getStartSolution()
	 * @generated
	 */
	void setStartSolution(SolutionRef value);

	/**
	 * Returns the value of the '<em><b>End Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Solution</em>' containment reference.
	 * @see #setEndSolution(SolutionRef)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_EndSolution()
	 * @model containment="true"
	 * @generated
	 */
	SolutionRef getEndSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#getEndSolution <em>End Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Solution</em>' containment reference.
	 * @see #getEndSolution()
	 * @generated
	 */
	void setEndSolution(SolutionRef value);

	/**
	 * Returns the value of the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Change</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_PreviousChange()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionChange getPreviousChange();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.localsearch.StrategyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.StrategyLevel
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_Level()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	StrategyLevel getLevel();

	/**
	 * Returns the value of the '<em><b>Sub Changes</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.SolutionChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Changes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Changes</em>' reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_SubChanges()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionChange> getSubChanges();

	/**
	 * Returns the value of the '<em><b>Current Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution</em>' containment reference.
	 * @see #setCurrentSolution(SolutionRef)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_CurrentSolution()
	 * @model containment="true"
	 * @generated
	 */
	SolutionRef getCurrentSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#getCurrentSolution <em>Current Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution</em>' containment reference.
	 * @see #getCurrentSolution()
	 * @generated
	 */
	void setCurrentSolution(SolutionRef value);

	/**
	 * Returns the value of the '<em><b>Keep Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Solutions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Solutions</em>' attribute.
	 * @see #setKeepSolutions(boolean)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_KeepSolutions()
	 * @model
	 * @generated
	 */
	boolean isKeepSolutions();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#isKeepSolutions <em>Keep Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Solutions</em>' attribute.
	 * @see #isKeepSolutions()
	 * @generated
	 */
	void setKeepSolutions(boolean value);

	/**
	 * Returns the value of the '<em><b>New Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Solution</em>' attribute.
	 * @see #setNewSolution(boolean)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_NewSolution()
	 * @model
	 * @generated
	 */
	boolean isNewSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#isNewSolution <em>New Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Solution</em>' attribute.
	 * @see #isNewSolution()
	 * @generated
	 */
	void setNewSolution(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCurrentSolution(Solution solution, Boolean copy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setStartSolution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEndSolution();

	/**
	 * Returns the value of the '<em><b>Super Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Change</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_SuperChange()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionChange getSuperChange();

} // SolutionChange
