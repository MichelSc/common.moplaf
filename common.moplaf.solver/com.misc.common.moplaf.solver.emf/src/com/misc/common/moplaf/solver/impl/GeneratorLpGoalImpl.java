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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionLpGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getLpTerm <em>Lp Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getMinValueIndicative <em>Min Value Indicative</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getMaxValueIndicative <em>Max Value Indicative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpGoalImpl extends GeneratorGoalImpl implements GeneratorLpGoal {
	/**
	 * The cached value of the '{@link #getLpTerm() <em>Lp Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpTerm> lpTerm;

	/**
	 * The default value of the '{@link #getSelectedSolutionValue() <em>Selected Solution Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolutionValue()
	 * @generated
	 * @ordered
	 */
	protected static final double SELECTED_SOLUTION_VALUE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinValueIndicative() <em>Min Value Indicative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueIndicative()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_INDICATIVE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValueIndicative() <em>Min Value Indicative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueIndicative()
	 * @generated
	 * @ordered
	 */
	protected double minValueIndicative = MIN_VALUE_INDICATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValueIndicative() <em>Max Value Indicative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueIndicative()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_INDICATIVE_EDEFAULT = 1.0E11;

	/**
	 * The cached value of the '{@link #getMaxValueIndicative() <em>Max Value Indicative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueIndicative()
	 * @generated
	 * @ordered
	 */
	protected double maxValueIndicative = MAX_VALUE_INDICATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpTerm> getLpTerm() {
		if (lpTerm == null) {
			lpTerm = new EObjectContainmentWithInverseEList<GeneratorLpTerm>(GeneratorLpTerm.class, this, SolverPackage.GENERATOR_LP_GOAL__LP_TERM, SolverPackage.GENERATOR_LP_TERM__LP_LINEAR);
		}
		return lpTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNofTerms() {
		return this.getLpTerm().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getSelectedSolutionValue() {
		Generator generator = this.getGenerator();
		Solution solution = generator.getSelected();
		SolutionGoal solutionGoal = this.getSolutionGoal(solution);
		if ( solutionGoal instanceof SolutionLpGoal ) {
			SolutionLpGoal lpGoal = (SolutionLpGoal) solutionGoal;
			return lpGoal.getValue(); 
		} 
		
		return 0.0d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValueIndicative() {
		return minValueIndicative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueIndicative(double newMinValueIndicative) {
		double oldMinValueIndicative = minValueIndicative;
		minValueIndicative = newMinValueIndicative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE, oldMinValueIndicative, minValueIndicative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValueIndicative() {
		return maxValueIndicative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueIndicative(double newMaxValueIndicative) {
		double oldMaxValueIndicative = maxValueIndicative;
		maxValueIndicative = newMaxValueIndicative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE, oldMaxValueIndicative, maxValueIndicative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		String code = this.getCode();
		String suffix = "";
		double value = this.getSelectedSolutionValue();
		suffix = String.format(" =%1$5.1f", value);
		String selectedSolutionDisplay = String.format("%1$s %2$s", code, suffix);
		this.setSelectedSolutionDisplay(selectedSolutionDisplay);
	}


	/**
	 * Create an new term to the linear. Assume that the var is not yet present in the linear.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpTerm constructTerm(GeneratorLpVar var, double coef) {
		return Util.constructTerm(this, var, coef);
		}

	/**
	 * Contribute to a term in the linear.
	 * If there is already a term for this var in this linear, its coefficient is augmented with coef.
	 * Otherwise, a new term is constructed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpTerm contributeTerm(GeneratorLpVar var, double coef) {
		return Util.contributeTerm(this, var, coef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getSolutionValue(Solution solution) {
		SolutionLp solutionLp = (SolutionLp)solution;
		if ( solutionLp==null) { return 0.0f; }
		double goalValue = 0.0f;
		for ( GeneratorLpTerm term : this.getLpTerm()){
			double coeff = term.getCoeff();
			double varValue = term.getLpVar().getSolutionValue(solution);
			goalValue += coeff*varValue;
		}
		
		return goalValue;
	}
	

	/**
	 * Called by the framework when building the Solver model.
	 * Add this linear as a contribution to the objective function with the given weight
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void build(Solver builder, double weight) throws Exception {
		builder.buildLpGoal(this, weight);
	}

	/**
	 * Called by the framework when building the Solver model.
	 * Add this linear as a constraint with the given bound
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void buildCons(Solver builder, double rhs) throws Exception{
			
		GeneratorLpLinear linearExpr = this;
		EnumLpConsType direction = EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL;
		switch ( this.getObjectiveType().ordinal()){
		case EnumObjectiveType.MAXIMUM_VALUE:
			direction = EnumLpConsType.ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL;
			break;
		case EnumObjectiveType.MINIMUM_VALUE:
			direction = EnumLpConsType.ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL;
			break;
		}
		builder.buildLpCons(this, linearExpr, rhs,  direction);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpTerm()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				return ((InternalEList<?>)getLpTerm()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				return getLpTerm();
			case SolverPackage.GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE:
				return getSelectedSolutionValue();
			case SolverPackage.GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE:
				return getMinValueIndicative();
			case SolverPackage.GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE:
				return getMaxValueIndicative();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				getLpTerm().clear();
				getLpTerm().addAll((Collection<? extends GeneratorLpTerm>)newValue);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE:
				setMinValueIndicative((Double)newValue);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE:
				setMaxValueIndicative((Double)newValue);
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				getLpTerm().clear();
				return;
			case SolverPackage.GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE:
				setMinValueIndicative(MIN_VALUE_INDICATIVE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE:
				setMaxValueIndicative(MAX_VALUE_INDICATIVE_EDEFAULT);
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				return lpTerm != null && !lpTerm.isEmpty();
			case SolverPackage.GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE:
				return getSelectedSolutionValue() != SELECTED_SOLUTION_VALUE_EDEFAULT;
			case SolverPackage.GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE:
				return minValueIndicative != MIN_VALUE_INDICATIVE_EDEFAULT;
			case SolverPackage.GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE:
				return maxValueIndicative != MAX_VALUE_INDICATIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeneratorLpLinear.class) {
			switch (derivedFeatureID) {
				case SolverPackage.GENERATOR_LP_GOAL__LP_TERM: return SolverPackage.GENERATOR_LP_LINEAR__LP_TERM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeneratorLpLinear.class) {
			switch (baseFeatureID) {
				case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM: return SolverPackage.GENERATOR_LP_GOAL__LP_TERM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GeneratorLpLinear.class) {
			switch (baseOperationID) {
				case SolverPackage.GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE: return SolverPackage.GENERATOR_LP_GOAL___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE;
				case SolverPackage.GENERATOR_LP_LINEAR___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE: return SolverPackage.GENERATOR_LP_GOAL___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_LP_GOAL___GET_SOLUTION_VALUE__SOLUTION:
				return getSolutionValue((Solution)arguments.get(0));
			case SolverPackage.GENERATOR_LP_GOAL___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE:
				return constructTerm((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1));
			case SolverPackage.GENERATOR_LP_GOAL___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE:
				return contributeTerm((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1));
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
		result.append(" (MinValueIndicative: ");
		result.append(minValueIndicative);
		result.append(", MaxValueIndicative: ");
		result.append(maxValueIndicative);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpGoalImpl
