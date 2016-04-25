/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.SolverGoalLp;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Lp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGoalLpImpl#getGoalWeight <em>Goal Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGoalLpImpl extends SolverGoalImpl implements SolverGoalLp {
	/**
	 * The default value of the '{@link #getGoalWeight() <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float GOAL_WEIGHT_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getGoalWeight() <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalWeight()
	 * @generated
	 * @ordered
	 */
	protected float goalWeight = GOAL_WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGoalLpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_GOAL_LP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGoalWeight() {
		return goalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalWeight(float newGoalWeight) {
		float oldGoalWeight = goalWeight;
		goalWeight = newGoalWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GOAL_LP__GOAL_WEIGHT, oldGoalWeight, goalWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_GOAL_LP__GOAL_WEIGHT:
				return getGoalWeight();
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
			case SolverPackage.SOLVER_GOAL_LP__GOAL_WEIGHT:
				setGoalWeight((Float)newValue);
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
			case SolverPackage.SOLVER_GOAL_LP__GOAL_WEIGHT:
				setGoalWeight(GOAL_WEIGHT_EDEFAULT);
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
			case SolverPackage.SOLVER_GOAL_LP__GOAL_WEIGHT:
				return goalWeight != GOAL_WEIGHT_EDEFAULT;
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
		result.append(" (GoalWeight: ");
		result.append(goalWeight);
		result.append(')');
		return result.toString();
	}

} //SolverGoalLpImpl
