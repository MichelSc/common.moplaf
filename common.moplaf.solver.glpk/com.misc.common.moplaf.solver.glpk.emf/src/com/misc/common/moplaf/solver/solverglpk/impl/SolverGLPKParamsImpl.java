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
package com.misc.common.moplaf.solver.solverglpk.impl;

import com.misc.common.moplaf.solver.impl.SolverLpParamsImpl;

import com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver GLPK Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl#isEnablePresolve <em>Enable Presolve</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGLPKParamsImpl extends SolverLpParamsImpl implements SolverGLPKParams {
	/**
	 * The default value of the '{@link #isEnablePresolve() <em>Enable Presolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnablePresolve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_PRESOLVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnablePresolve() <em>Enable Presolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnablePresolve()
	 * @generated
	 * @ordered
	 */
	protected boolean enablePresolve = ENABLE_PRESOLVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableFeasibilityPump() <em>Enable Feasibility Pump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableFeasibilityPump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_FEASIBILITY_PUMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableFeasibilityPump() <em>Enable Feasibility Pump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableFeasibilityPump()
	 * @generated
	 * @ordered
	 */
	protected boolean enableFeasibilityPump = ENABLE_FEASIBILITY_PUMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableGomoryCuts() <em>Enable Gomory Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGomoryCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_GOMORY_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableGomoryCuts() <em>Enable Gomory Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGomoryCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableGomoryCuts = ENABLE_GOMORY_CUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableGeneratingCliqueCuts() <em>Enable Generating Clique Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingCliqueCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableGeneratingCliqueCuts() <em>Enable Generating Clique Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingCliqueCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableGeneratingCliqueCuts = ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableGeneratingMixedCoverCuts() <em>Enable Generating Mixed Cover Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingMixedCoverCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableGeneratingMixedCoverCuts() <em>Enable Generating Mixed Cover Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingMixedCoverCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableGeneratingMixedCoverCuts = ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableMixedIntegerRoundingCuts() <em>Enable Mixed Integer Rounding Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableMixedIntegerRoundingCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableMixedIntegerRoundingCuts() <em>Enable Mixed Integer Rounding Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableMixedIntegerRoundingCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableMixedIntegerRoundingCuts = ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGLPKParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableFeasibilityPump() {
		return enableFeasibilityPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableFeasibilityPump(boolean newEnableFeasibilityPump) {
		boolean oldEnableFeasibilityPump = enableFeasibilityPump;
		enableFeasibilityPump = newEnableFeasibilityPump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP, oldEnableFeasibilityPump, enableFeasibilityPump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableGomoryCuts() {
		return enableGomoryCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableGomoryCuts(boolean newEnableGomoryCuts) {
		boolean oldEnableGomoryCuts = enableGomoryCuts;
		enableGomoryCuts = newEnableGomoryCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS, oldEnableGomoryCuts, enableGomoryCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableGeneratingCliqueCuts() {
		return enableGeneratingCliqueCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableGeneratingCliqueCuts(boolean newEnableGeneratingCliqueCuts) {
		boolean oldEnableGeneratingCliqueCuts = enableGeneratingCliqueCuts;
		enableGeneratingCliqueCuts = newEnableGeneratingCliqueCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS, oldEnableGeneratingCliqueCuts, enableGeneratingCliqueCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableGeneratingMixedCoverCuts() {
		return enableGeneratingMixedCoverCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableGeneratingMixedCoverCuts(boolean newEnableGeneratingMixedCoverCuts) {
		boolean oldEnableGeneratingMixedCoverCuts = enableGeneratingMixedCoverCuts;
		enableGeneratingMixedCoverCuts = newEnableGeneratingMixedCoverCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS, oldEnableGeneratingMixedCoverCuts, enableGeneratingMixedCoverCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableMixedIntegerRoundingCuts() {
		return enableMixedIntegerRoundingCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableMixedIntegerRoundingCuts(boolean newEnableMixedIntegerRoundingCuts) {
		boolean oldEnableMixedIntegerRoundingCuts = enableMixedIntegerRoundingCuts;
		enableMixedIntegerRoundingCuts = newEnableMixedIntegerRoundingCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS, oldEnableMixedIntegerRoundingCuts, enableMixedIntegerRoundingCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnablePresolve() {
		return enablePresolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnablePresolve(boolean newEnablePresolve) {
		boolean oldEnablePresolve = enablePresolve;
		enablePresolve = newEnablePresolve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE, oldEnablePresolve, enablePresolve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE:
				return isEnablePresolve();
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP:
				return isEnableFeasibilityPump();
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS:
				return isEnableGomoryCuts();
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS:
				return isEnableGeneratingCliqueCuts();
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS:
				return isEnableGeneratingMixedCoverCuts();
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				return isEnableMixedIntegerRoundingCuts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE:
				setEnablePresolve((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP:
				setEnableFeasibilityPump((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS:
				setEnableGomoryCuts((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS:
				setEnableGeneratingCliqueCuts((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS:
				setEnableGeneratingMixedCoverCuts((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				setEnableMixedIntegerRoundingCuts((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE:
				setEnablePresolve(ENABLE_PRESOLVE_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP:
				setEnableFeasibilityPump(ENABLE_FEASIBILITY_PUMP_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS:
				setEnableGomoryCuts(ENABLE_GOMORY_CUTS_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS:
				setEnableGeneratingCliqueCuts(ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS:
				setEnableGeneratingMixedCoverCuts(ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				setEnableMixedIntegerRoundingCuts(ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE:
				return enablePresolve != ENABLE_PRESOLVE_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP:
				return enableFeasibilityPump != ENABLE_FEASIBILITY_PUMP_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS:
				return enableGomoryCuts != ENABLE_GOMORY_CUTS_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS:
				return enableGeneratingCliqueCuts != ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS:
				return enableGeneratingMixedCoverCuts != ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				return enableMixedIntegerRoundingCuts != ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (EnablePresolve: ");
		result.append(enablePresolve);
		result.append(", EnableFeasibilityPump: ");
		result.append(enableFeasibilityPump);
		result.append(", EnableGomoryCuts: ");
		result.append(enableGomoryCuts);
		result.append(", EnableGeneratingCliqueCuts: ");
		result.append(enableGeneratingCliqueCuts);
		result.append(", EnableGeneratingMixedCoverCuts: ");
		result.append(enableGeneratingMixedCoverCuts);
		result.append(", EnableMixedIntegerRoundingCuts: ");
		result.append(enableMixedIntegerRoundingCuts);
		result.append(')');
		return result.toString();
	}

} //SolverGLPKParamsImpl
