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
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Reader Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getLinePattern <em>Line Pattern</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarNameGroup <em>Var Name Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarOptimalValueGroup <em>Var Optimal Value Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarObjectiveCoefGroup <em>Var Objective Coef Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getFirstLine <em>First Line</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionReaderPattern()
 * @model
 * @generated
 */
public interface SolutionReaderPattern extends SolutionReader {
	/**
	 * Returns the value of the '<em><b>Line Pattern</b></em>' attribute.
	 * The default value is <code>"(\\S+)\\s+(\\S+)\\s+\\(obj:(\\S+)\\)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Pattern</em>' attribute.
	 * @see #setLinePattern(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionReaderPattern_LinePattern()
	 * @model default="(\\S+)\\s+(\\S+)\\s+\\(obj:(\\S+)\\)"
	 * @generated
	 */
	String getLinePattern();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getLinePattern <em>Line Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Pattern</em>' attribute.
	 * @see #getLinePattern()
	 * @generated
	 */
	void setLinePattern(String value);

	/**
	 * Returns the value of the '<em><b>Var Name Group</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name Group</em>' attribute.
	 * @see #setVarNameGroup(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionReaderPattern_VarNameGroup()
	 * @model default="1"
	 * @generated
	 */
	int getVarNameGroup();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarNameGroup <em>Var Name Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name Group</em>' attribute.
	 * @see #getVarNameGroup()
	 * @generated
	 */
	void setVarNameGroup(int value);

	/**
	 * Returns the value of the '<em><b>Var Optimal Value Group</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Optimal Value Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Optimal Value Group</em>' attribute.
	 * @see #setVarOptimalValueGroup(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionReaderPattern_VarOptimalValueGroup()
	 * @model default="2"
	 * @generated
	 */
	int getVarOptimalValueGroup();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarOptimalValueGroup <em>Var Optimal Value Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Optimal Value Group</em>' attribute.
	 * @see #getVarOptimalValueGroup()
	 * @generated
	 */
	void setVarOptimalValueGroup(int value);

	/**
	 * Returns the value of the '<em><b>Var Objective Coef Group</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Objective Coef Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Objective Coef Group</em>' attribute.
	 * @see #setVarObjectiveCoefGroup(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionReaderPattern_VarObjectiveCoefGroup()
	 * @model default="3"
	 * @generated
	 */
	int getVarObjectiveCoefGroup();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarObjectiveCoefGroup <em>Var Objective Coef Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Objective Coef Group</em>' attribute.
	 * @see #getVarObjectiveCoefGroup()
	 * @generated
	 */
	void setVarObjectiveCoefGroup(int value);

	/**
	 * Returns the value of the '<em><b>First Line</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Line</em>' attribute.
	 * @see #setFirstLine(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionReaderPattern_FirstLine()
	 * @model default="2"
	 * @generated
	 */
	int getFirstLine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getFirstLine <em>First Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Line</em>' attribute.
	 * @see #getFirstLine()
	 * @generated
	 */
	void setFirstLine(int value);

} // SolutionReaderPattern
