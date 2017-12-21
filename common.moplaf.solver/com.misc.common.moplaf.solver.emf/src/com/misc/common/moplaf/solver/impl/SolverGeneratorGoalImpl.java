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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.Plugin;
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
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#getGoalBound <em>Goal Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#isOptimize <em>Optimize</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#isConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#getConstraintAbsoluteTolerance <em>Constraint Absolute Tolerance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl#getConstraintRelativeTolerance <em>Constraint Relative Tolerance</em>}</li>
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
	protected static final double GOAL_WEIGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getGoalWeight() <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalWeight()
	 * @generated
	 * @ordered
	 */
	protected double goalWeight = GOAL_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalBound() <em>Goal Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalBound()
	 * @generated
	 * @ordered
	 */
	protected static final double GOAL_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGoalBound() <em>Goal Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalBound()
	 * @generated
	 * @ordered
	 */
	protected double goalBound = GOAL_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptimize() <em>Optimize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIMIZE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOptimize() <em>Optimize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimize()
	 * @generated
	 * @ordered
	 */
	protected boolean optimize = OPTIMIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected boolean constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintAbsoluteTolerance() <em>Constraint Absolute Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintAbsoluteTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSTRAINT_ABSOLUTE_TOLERANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConstraintAbsoluteTolerance() <em>Constraint Absolute Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintAbsoluteTolerance()
	 * @generated
	 * @ordered
	 */
	protected double constraintAbsoluteTolerance = CONSTRAINT_ABSOLUTE_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintRelativeTolerance() <em>Constraint Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRelativeTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSTRAINT_RELATIVE_TOLERANCE_EDEFAULT = 1.0E-6;

	/**
	 * The cached value of the '{@link #getConstraintRelativeTolerance() <em>Constraint Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRelativeTolerance()
	 * @generated
	 * @ordered
	 */
	protected double constraintRelativeTolerance = CONSTRAINT_RELATIVE_TOLERANCE_EDEFAULT;

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
	 * Called by the framework when the solver is built, namely by method {@link Solver#buildGoals()}.
	 * <p>
	 * Add a constraint and/or a contribution to the objective accordingly to the settings of this SolverGoal
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
		if ( this.isOptimize()){
			double weight = this.getGoalWeight();
			goal.build(solver, weight);
		}
		if ( this.isConstraint()){
			double direction = 0.0d;
			switch ( goal.getObjectiveType().ordinal()){
			case EnumObjectiveType.MAXIMUM_VALUE:
				direction = -1.0d;
				break;
			case EnumObjectiveType.MINIMUM_VALUE:
				direction = 1.0d;
				break;
			}
			double rhs = this.getGoalBound()
					   + direction*(this.getConstraintAbsoluteTolerance()+this.getGoalBound()*this.getConstraintRelativeTolerance());
			goal.buildCons(solver, rhs);
		}
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
	 */
	@Override
	public String getLabel() {
		String mode = "Free";
		if ( this.isOptimize() ){
			mode = "Optimize";
		} else if ( this.isConstraint()){
			mode = "Constraint";
		}
		GeneratorGoal goal = this.getGoalToSolve();
		String label = mode + " " +(goal==null ? "null" : goal.getName());
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGoalWeight() {
		return goalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalWeight(double newGoalWeight) {
		double oldGoalWeight = goalWeight;
		goalWeight = newGoalWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT, oldGoalWeight, goalWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGoalBound() {
		return goalBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalBound(double newGoalBound) {
		double oldGoalBound = goalBound;
		goalBound = newGoalBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_BOUND, oldGoalBound, goalBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptimize() {
		return optimize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimize(boolean newOptimize) {
		boolean oldOptimize = optimize;
		optimize = newOptimize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__OPTIMIZE, oldOptimize, optimize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(boolean newConstraint) {
		boolean oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConstraintAbsoluteTolerance() {
		return constraintAbsoluteTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintAbsoluteTolerance(double newConstraintAbsoluteTolerance) {
		double oldConstraintAbsoluteTolerance = constraintAbsoluteTolerance;
		constraintAbsoluteTolerance = newConstraintAbsoluteTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_ABSOLUTE_TOLERANCE, oldConstraintAbsoluteTolerance, constraintAbsoluteTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConstraintRelativeTolerance() {
		return constraintRelativeTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRelativeTolerance(double newConstraintRelativeTolerance) {
		double oldConstraintRelativeTolerance = constraintRelativeTolerance;
		constraintRelativeTolerance = newConstraintRelativeTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_RELATIVE_TOLERANCE, oldConstraintRelativeTolerance, constraintRelativeTolerance));
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
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_BOUND:
				return getGoalBound();
			case SolverPackage.SOLVER_GENERATOR_GOAL__OPTIMIZE:
				return isOptimize();
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT:
				return isConstraint();
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_ABSOLUTE_TOLERANCE:
				return getConstraintAbsoluteTolerance();
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_RELATIVE_TOLERANCE:
				return getConstraintRelativeTolerance();
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
				setGoalWeight((Double)newValue);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_BOUND:
				setGoalBound((Double)newValue);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__OPTIMIZE:
				setOptimize((Boolean)newValue);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT:
				setConstraint((Boolean)newValue);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_ABSOLUTE_TOLERANCE:
				setConstraintAbsoluteTolerance((Double)newValue);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_RELATIVE_TOLERANCE:
				setConstraintRelativeTolerance((Double)newValue);
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
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_BOUND:
				setGoalBound(GOAL_BOUND_EDEFAULT);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__OPTIMIZE:
				setOptimize(OPTIMIZE_EDEFAULT);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_ABSOLUTE_TOLERANCE:
				setConstraintAbsoluteTolerance(CONSTRAINT_ABSOLUTE_TOLERANCE_EDEFAULT);
				return;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_RELATIVE_TOLERANCE:
				setConstraintRelativeTolerance(CONSTRAINT_RELATIVE_TOLERANCE_EDEFAULT);
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
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_BOUND:
				return goalBound != GOAL_BOUND_EDEFAULT;
			case SolverPackage.SOLVER_GENERATOR_GOAL__OPTIMIZE:
				return optimize != OPTIMIZE_EDEFAULT;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT:
				return constraint != CONSTRAINT_EDEFAULT;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_ABSOLUTE_TOLERANCE:
				return constraintAbsoluteTolerance != CONSTRAINT_ABSOLUTE_TOLERANCE_EDEFAULT;
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT_RELATIVE_TOLERANCE:
				return constraintRelativeTolerance != CONSTRAINT_RELATIVE_TOLERANCE_EDEFAULT;
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
		result.append(", GoalBound: ");
		result.append(goalBound);
		result.append(", Optimize: ");
		result.append(optimize);
		result.append(", Constraint: ");
		result.append(constraint);
		result.append(", ConstraintAbsoluteTolerance: ");
		result.append(constraintAbsoluteTolerance);
		result.append(", ConstraintRelativeTolerance: ");
		result.append(constraintRelativeTolerance);
		result.append(')');
		return result.toString();
	}

} //SolverGeneratorGoalImpl
