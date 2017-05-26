/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.job.impl.RunParamsImpl;

import com.misc.common.moplaf.solver.SolverLpParams;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverLpParamsImpl#getSolverOptimalityTolerance <em>Solver Optimality Tolerance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverLpParamsImpl#isSolverLinearRelaxation <em>Solver Linear Relaxation</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverLpParamsImpl#getSolOptimalityGap <em>Sol Optimality Gap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverLpParamsImpl extends RunParamsImpl implements SolverLpParams {
	/**
	 * The default value of the '{@link #getSolverOptimalityTolerance() <em>Solver Optimality Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverOptimalityTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final float SOLVER_OPTIMALITY_TOLERANCE_EDEFAULT = 0.05F;

	/**
	 * The cached value of the '{@link #getSolverOptimalityTolerance() <em>Solver Optimality Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverOptimalityTolerance()
	 * @generated
	 * @ordered
	 */
	protected float solverOptimalityTolerance = SOLVER_OPTIMALITY_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolverLinearRelaxation() <em>Solver Linear Relaxation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolverLinearRelaxation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLVER_LINEAR_RELAXATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolverLinearRelaxation() <em>Solver Linear Relaxation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolverLinearRelaxation()
	 * @generated
	 * @ordered
	 */
	protected boolean solverLinearRelaxation = SOLVER_LINEAR_RELAXATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolOptimalityGap() <em>Sol Optimality Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolOptimalityGap()
	 * @generated
	 * @ordered
	 */
	protected static final float SOL_OPTIMALITY_GAP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSolOptimalityGap() <em>Sol Optimality Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolOptimalityGap()
	 * @generated
	 * @ordered
	 */
	protected float solOptimalityGap = SOL_OPTIMALITY_GAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverLpParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_LP_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolverOptimalityTolerance() {
		return solverOptimalityTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverOptimalityTolerance(float newSolverOptimalityTolerance) {
		float oldSolverOptimalityTolerance = solverOptimalityTolerance;
		solverOptimalityTolerance = newSolverOptimalityTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE, oldSolverOptimalityTolerance, solverOptimalityTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolverLinearRelaxation() {
		return solverLinearRelaxation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverLinearRelaxation(boolean newSolverLinearRelaxation) {
		boolean oldSolverLinearRelaxation = solverLinearRelaxation;
		solverLinearRelaxation = newSolverLinearRelaxation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION, oldSolverLinearRelaxation, solverLinearRelaxation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolOptimalityGap() {
		return solOptimalityGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolOptimalityGap(float newSolOptimalityGap) {
		float oldSolOptimalityGap = solOptimalityGap;
		solOptimalityGap = newSolOptimalityGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_LP_PARAMS__SOL_OPTIMALITY_GAP, oldSolOptimalityGap, solOptimalityGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE:
				return getSolverOptimalityTolerance();
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION:
				return isSolverLinearRelaxation();
			case SolverPackage.SOLVER_LP_PARAMS__SOL_OPTIMALITY_GAP:
				return getSolOptimalityGap();
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
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE:
				setSolverOptimalityTolerance((Float)newValue);
				return;
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION:
				setSolverLinearRelaxation((Boolean)newValue);
				return;
			case SolverPackage.SOLVER_LP_PARAMS__SOL_OPTIMALITY_GAP:
				setSolOptimalityGap((Float)newValue);
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
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE:
				setSolverOptimalityTolerance(SOLVER_OPTIMALITY_TOLERANCE_EDEFAULT);
				return;
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION:
				setSolverLinearRelaxation(SOLVER_LINEAR_RELAXATION_EDEFAULT);
				return;
			case SolverPackage.SOLVER_LP_PARAMS__SOL_OPTIMALITY_GAP:
				setSolOptimalityGap(SOL_OPTIMALITY_GAP_EDEFAULT);
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
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE:
				return solverOptimalityTolerance != SOLVER_OPTIMALITY_TOLERANCE_EDEFAULT;
			case SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION:
				return solverLinearRelaxation != SOLVER_LINEAR_RELAXATION_EDEFAULT;
			case SolverPackage.SOLVER_LP_PARAMS__SOL_OPTIMALITY_GAP:
				return solOptimalityGap != SOL_OPTIMALITY_GAP_EDEFAULT;
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
		result.append(" (SolverOptimalityTolerance: ");
		result.append(solverOptimalityTolerance);
		result.append(", SolverLinearRelaxation: ");
		result.append(solverLinearRelaxation);
		result.append(", SolOptimalityGap: ");
		result.append(solOptimalityGap);
		result.append(')');
		return result.toString();
	}

} //SolverLpParamsImpl
