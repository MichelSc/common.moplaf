/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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

import com.misc.common.moplaf.macroplanner.LocationResource;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Resource Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getMacroPlanner <em>Macro Planner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceSet()
 * @model
 * @generated
 */
public interface LPResourceSet extends LPTuple {
	/**
	 * Returns the value of the '<em><b>Macro Planner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Planner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Planner</em>' container reference.
	 * @see #setMacroPlanner(LPMacroPlanner)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceSet_MacroPlanner()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getResourceSet
	 * @model opposite="ResourceSet" required="true" transient="false"
	 * @generated
	 */
	LPMacroPlanner getMacroPlanner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getMacroPlanner <em>Macro Planner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro Planner</em>' container reference.
	 * @see #getMacroPlanner()
	 * @generated
	 */
	void setMacroPlanner(LPMacroPlanner value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceSet_Resources()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getResourceSet
	 * @model opposite="ResourceSet" containment="true"
	 * @generated
	 */
	EList<LPResource> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LPResource getResource(LocationResource locationResource);

} // LPResourceSet
