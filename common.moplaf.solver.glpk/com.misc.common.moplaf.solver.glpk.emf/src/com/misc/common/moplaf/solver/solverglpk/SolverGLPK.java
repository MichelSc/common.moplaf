/**
 */
package com.misc.common.moplaf.solver.solverglpk;

import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.SolverLp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver GLPK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPK()
 * @model
 * @generated
 */
public interface SolverGLPK extends SolverLp, ILpWriter {

	/**
	 * Returns the value of the '<em><b>Enable Feasibility Pump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Feasibility Pump</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Feasibility Pump</em>' attribute.
	 * @see #setEnableFeasibilityPump(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPK_EnableFeasibilityPump()
	 * @model
	 * @generated
	 */
	boolean isEnableFeasibilityPump();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Feasibility Pump</em>' attribute.
	 * @see #isEnableFeasibilityPump()
	 * @generated
	 */
	void setEnableFeasibilityPump(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Gomory Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Gomory Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Gomory Cuts</em>' attribute.
	 * @see #setEnableGomoryCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPK_EnableGomoryCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableGomoryCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Gomory Cuts</em>' attribute.
	 * @see #isEnableGomoryCuts()
	 * @generated
	 */
	void setEnableGomoryCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Generating Mixed Cover Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Generating Mixed Cover Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Generating Mixed Cover Cuts</em>' attribute.
	 * @see #setEnableGeneratingMixedCoverCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPK_EnableGeneratingMixedCoverCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableGeneratingMixedCoverCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Generating Mixed Cover Cuts</em>' attribute.
	 * @see #isEnableGeneratingMixedCoverCuts()
	 * @generated
	 */
	void setEnableGeneratingMixedCoverCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Generating Clique Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Generating Clique Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Generating Clique Cuts</em>' attribute.
	 * @see #setEnableGeneratingCliqueCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPK_EnableGeneratingCliqueCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableGeneratingCliqueCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Generating Clique Cuts</em>' attribute.
	 * @see #isEnableGeneratingCliqueCuts()
	 * @generated
	 */
	void setEnableGeneratingCliqueCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Mixed Integer Rounding Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Mixed Integer Rounding Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Mixed Integer Rounding Cuts</em>' attribute.
	 * @see #setEnableMixedIntegerRoundingCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPK_EnableMixedIntegerRoundingCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableMixedIntegerRoundingCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Mixed Integer Rounding Cuts</em>' attribute.
	 * @see #isEnableMixedIntegerRoundingCuts()
	 * @generated
	 */
	void setEnableMixedIntegerRoundingCuts(boolean value);
} // SolverGLPK
