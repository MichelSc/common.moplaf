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
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.macroplanner.MacroPlannerDataElement;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getLPs <em>LPs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedDataElements <em>Selected Data Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioStart <em>Scenario Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioEnd <em>Scenario End</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>LPs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LPs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LPs</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_LPs()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<LPMacroPlanner> getLPs();

	/**
	 * Returns the value of the '<em><b>Selected Data Elements</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.MacroPlannerDataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Data Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Data Elements</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_SelectedDataElements()
	 * @model
	 * @generated
	 */
	EList<MacroPlannerDataElement> getSelectedDataElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenario Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Start</em>' attribute.
	 * @see #setScenarioStart(Date)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_ScenarioStart()
	 * @model
	 * @generated
	 */
	Date getScenarioStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioStart <em>Scenario Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Start</em>' attribute.
	 * @see #getScenarioStart()
	 * @generated
	 */
	void setScenarioStart(Date value);

	/**
	 * Returns the value of the '<em><b>Scenario End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario End</em>' attribute.
	 * @see #setScenarioEnd(Date)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_ScenarioEnd()
	 * @model
	 * @generated
	 */
	Date getScenarioEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioEnd <em>Scenario End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario End</em>' attribute.
	 * @see #getScenarioEnd()
	 * @generated
	 */
	void setScenarioEnd(Date value);

} // Scenario
