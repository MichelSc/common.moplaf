/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.SolutionCons;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Lp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionLpImpl#getGoalValue <em>Goal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionLpImpl extends SolutionImpl implements SolutionLp {
	/**
	 * The default value of the '{@link #getGoalValue() <em>Goal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float GOAL_VALUE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getGoalValue() <em>Goal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalValue()
	 * @generated
	 * @ordered
	 */
	protected float goalValue = GOAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionLpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_LP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGoalValue() {
		return goalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalValue(float newGoalValue) {
		float oldGoalValue = goalValue;
		goalValue = newGoalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_LP__GOAL_VALUE, oldGoalValue, goalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLUTION_LP__GOAL_VALUE:
				return getGoalValue();
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
			case SolverPackage.SOLUTION_LP__GOAL_VALUE:
				setGoalValue((Float)newValue);
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
			case SolverPackage.SOLUTION_LP__GOAL_VALUE:
				setGoalValue(GOAL_VALUE_EDEFAULT);
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
			case SolverPackage.SOLUTION_LP__GOAL_VALUE:
				return goalValue != GOAL_VALUE_EDEFAULT;
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
		result.append(" (GoalValue: ");
		result.append(goalValue);
		result.append(')');
		return result.toString();
	}

	@Override
	public SolutionVar solutionVarFactory() {
		SolutionVar newSolutionVar = SolverFactory.eINSTANCE.createSolutionLpVar();
		return newSolutionVar;
	}

	@Override
	public SolutionCons solutionConsFactory() {
		SolutionCons newSolutionCons = SolverFactory.eINSTANCE.createSolutionLpCons();
		return newSolutionCons;
	}


} //SolutionLpImpl
