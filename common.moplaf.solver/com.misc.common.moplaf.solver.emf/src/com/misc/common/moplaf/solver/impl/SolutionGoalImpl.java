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

import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl#isConstrained <em>Constrained</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl#isOptimized <em>Optimized</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionGoalImpl extends SolutionElementImpl implements SolutionGoal {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected GeneratorGoal goal;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrained()
	 * @generated
	 * @ordered
	 */
	protected boolean constrained = CONSTRAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptimized() <em>Optimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIMIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptimized() <em>Optimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimized()
	 * @generated
	 * @ordered
	 */
	protected boolean optimized = OPTIMIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final double BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected double bound = BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject)goal;
			goal = (GeneratorGoal)eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLUTION_GOAL__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(GeneratorGoal newGoal, NotificationChain msgs) {
		GeneratorGoal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_GOAL__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(GeneratorGoal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, SolverPackage.GENERATOR_GOAL__SOLUTION, GeneratorGoal.class, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, SolverPackage.GENERATOR_GOAL__SOLUTION, GeneratorGoal.class, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_GOAL__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		// TODO: implement this method to return the 'Label' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstrained() {
		return constrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrained(boolean newConstrained) {
		boolean oldConstrained = constrained;
		constrained = newConstrained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_GOAL__CONSTRAINED, oldConstrained, constrained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptimized() {
		return optimized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimized(boolean newOptimized) {
		boolean oldOptimized = optimized;
		optimized = newOptimized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_GOAL__OPTIMIZED, oldOptimized, optimized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(double newBound) {
		double oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_GOAL__BOUND, oldBound, bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void constructGoal(Solver solver)  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLUTION_GOAL__GOAL:
				if (goal != null)
					msgs = ((InternalEObject)goal).eInverseRemove(this, SolverPackage.GENERATOR_GOAL__SOLUTION, GeneratorGoal.class, msgs);
				return basicSetGoal((GeneratorGoal)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLUTION_GOAL__GOAL:
				return basicSetGoal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLUTION_GOAL__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
			case SolverPackage.SOLUTION_GOAL__LABEL:
				return getLabel();
			case SolverPackage.SOLUTION_GOAL__CONSTRAINED:
				return isConstrained();
			case SolverPackage.SOLUTION_GOAL__OPTIMIZED:
				return isOptimized();
			case SolverPackage.SOLUTION_GOAL__BOUND:
				return getBound();
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
			case SolverPackage.SOLUTION_GOAL__GOAL:
				setGoal((GeneratorGoal)newValue);
				return;
			case SolverPackage.SOLUTION_GOAL__CONSTRAINED:
				setConstrained((Boolean)newValue);
				return;
			case SolverPackage.SOLUTION_GOAL__OPTIMIZED:
				setOptimized((Boolean)newValue);
				return;
			case SolverPackage.SOLUTION_GOAL__BOUND:
				setBound((Double)newValue);
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
			case SolverPackage.SOLUTION_GOAL__GOAL:
				setGoal((GeneratorGoal)null);
				return;
			case SolverPackage.SOLUTION_GOAL__CONSTRAINED:
				setConstrained(CONSTRAINED_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_GOAL__OPTIMIZED:
				setOptimized(OPTIMIZED_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_GOAL__BOUND:
				setBound(BOUND_EDEFAULT);
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
			case SolverPackage.SOLUTION_GOAL__GOAL:
				return goal != null;
			case SolverPackage.SOLUTION_GOAL__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case SolverPackage.SOLUTION_GOAL__CONSTRAINED:
				return constrained != CONSTRAINED_EDEFAULT;
			case SolverPackage.SOLUTION_GOAL__OPTIMIZED:
				return optimized != OPTIMIZED_EDEFAULT;
			case SolverPackage.SOLUTION_GOAL__BOUND:
				return bound != BOUND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.SOLUTION_GOAL___REFRESH:
				refresh();
				return null;
			case SolverPackage.SOLUTION_GOAL___CONSTRUCT_GOAL__SOLVER:
				constructGoal((Solver)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Constrained: ");
		result.append(constrained);
		result.append(", Optimized: ");
		result.append(optimized);
		result.append(", Bound: ");
		result.append(bound);
		result.append(')');
		return result.toString();
	}

} //SolutionGoalImpl
