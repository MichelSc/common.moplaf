/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.SolverGoal;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGoalImpl#getGoalToSolve <em>Goal To Solve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGoalImpl extends MinimalEObjectImpl.Container implements SolverGoal {
	/**
	 * The cached value of the '{@link #getGoalToSolve() <em>Goal To Solve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalToSolve()
	 * @generated
	 * @ordered
	 */
	protected GeneratorGoal goalToSolve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal getGoalToSolve() {
		if (goalToSolve != null && goalToSolve.eIsProxy()) {
			InternalEObject oldGoalToSolve = (InternalEObject)goalToSolve;
			goalToSolve = (GeneratorGoal)eResolveProxy(oldGoalToSolve);
			if (goalToSolve != oldGoalToSolve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_GOAL__GOAL_TO_SOLVE, oldGoalToSolve, goalToSolve));
			}
		}
		return goalToSolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal basicGetGoalToSolve() {
		return goalToSolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalToSolve(GeneratorGoal newGoalToSolve) {
		GeneratorGoal oldGoalToSolve = goalToSolve;
		goalToSolve = newGoalToSolve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GOAL__GOAL_TO_SOLVE, oldGoalToSolve, goalToSolve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_GOAL__GOAL_TO_SOLVE:
				if (resolve) return getGoalToSolve();
				return basicGetGoalToSolve();
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
			case SolverPackage.SOLVER_GOAL__GOAL_TO_SOLVE:
				setGoalToSolve((GeneratorGoal)newValue);
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
			case SolverPackage.SOLVER_GOAL__GOAL_TO_SOLVE:
				setGoalToSolve((GeneratorGoal)null);
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
			case SolverPackage.SOLVER_GOAL__GOAL_TO_SOLVE:
				return goalToSolve != null;
		}
		return super.eIsSet(featureID);
	}

} //SolverGoalImpl
