/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumGoalType;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverGeneratorGoal;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#getGoalToSolve <em>Goal To Solve</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#getGoalWeight <em>Goal Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGeneratorGoalImpl extends SolverGoalImpl implements SolverGeneratorGoal {
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
	protected SolverGeneratorGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_GENERATOR_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void buildGoal() throws Exception {
		GeneratorGoal goal = this.getGoalToSolve();
		if ( goal==null){
			Plugin.INSTANCE.logWarning("Solver, buildGoal: no generator goal, goal ignored");
		}
		Solver solver = this.getSolver();
		float weight = this.getGoalWeight();
		goal.build(solver, weight);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE, oldGoalToSolve, goalToSolve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE, oldGoalToSolve, goalToSolve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT, oldGoalWeight, goalWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE:
				if (resolve) return getGoalToSolve();
				return basicGetGoalToSolve();
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT:
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
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE:
				setGoalToSolve((GeneratorGoal)newValue);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT:
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
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE:
				setGoalToSolve((GeneratorGoal)null);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT:
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
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE:
				return goalToSolve != null;
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT:
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

} //SolverGeneratorGoalImpl
