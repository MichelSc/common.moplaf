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

import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.solver.GeneratorTuple;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Product Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getMacroPlanner <em>Macro Planner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductSet()
 * @model
 * @generated
 */
public interface LPProductSet extends GeneratorTuple, LPTuple {
	/**
	 * Returns the value of the '<em><b>Macro Planner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getProductSet <em>Product Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Planner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Planner</em>' container reference.
	 * @see #setMacroPlanner(LPMacroPlanner)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductSet_MacroPlanner()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getProductSet
	 * @model opposite="ProductSet" required="true" transient="false"
	 * @generated
	 */
	LPMacroPlanner getMacroPlanner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getMacroPlanner <em>Macro Planner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro Planner</em>' container reference.
	 * @see #getMacroPlanner()
	 * @generated
	 */
	void setMacroPlanner(LPMacroPlanner value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProductSet <em>Product Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductSet_Products()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getProductSet
	 * @model opposite="ProductSet" containment="true"
	 * @generated
	 */
	EList<LPProduct> getProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LPProduct getProduct(LocationProduct locationProduct);

} // LPProductSet
