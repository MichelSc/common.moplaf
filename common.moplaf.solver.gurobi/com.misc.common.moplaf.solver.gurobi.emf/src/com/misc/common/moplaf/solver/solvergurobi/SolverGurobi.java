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
package com.misc.common.moplaf.solver.solvergurobi;

import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.SolverLp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver Gurobi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getMaxNofThreads <em>Max Nof Threads</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getSolverLog <em>Solver Log</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.solvergurobi.SolvergurobiPackage#getSolverGurobi()
 * @model
 * @generated
 */
public interface SolverGurobi extends SolverLp, ILpWriter {
	/**
	 * Returns the value of the '<em><b>Max Nof Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nof Threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nof Threads</em>' attribute.
	 * @see #setMaxNofThreads(int)
	 * @see com.misc.common.moplaf.solver.solvergurobi.SolvergurobiPackage#getSolverGurobi_MaxNofThreads()
	 * @model
	 * @generated
	 */
	int getMaxNofThreads();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getMaxNofThreads <em>Max Nof Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nof Threads</em>' attribute.
	 * @see #getMaxNofThreads()
	 * @generated
	 */
	void setMaxNofThreads(int value);

	/**
	 * Returns the value of the '<em><b>Solver Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Log</em>' attribute.
	 * @see #setSolverLog(String)
	 * @see com.misc.common.moplaf.solver.solvergurobi.SolvergurobiPackage#getSolverGurobi_SolverLog()
	 * @model
	 * @generated
	 */
	String getSolverLog();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getSolverLog <em>Solver Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Log</em>' attribute.
	 * @see #getSolverLog()
	 * @generated
	 */
	void setSolverLog(String value);

} // SolverGurobi
