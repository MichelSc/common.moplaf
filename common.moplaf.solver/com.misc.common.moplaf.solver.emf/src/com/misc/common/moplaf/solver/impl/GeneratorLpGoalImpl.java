/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpGoalTerm;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;

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
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getObjectiveType <em>Objective Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getLpGoalTerm <em>Lp Goal Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getGoalWeight <em>Goal Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpGoalImpl extends GeneratorGoalImpl implements GeneratorLpGoal {
	/**
	 * The default value of the '{@link #getObjectiveType() <em>Objective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumObjectiveType OBJECTIVE_TYPE_EDEFAULT = EnumObjectiveType.MAXIMUM;

	/**
	 * The cached value of the '{@link #getObjectiveType() <em>Objective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveType()
	 * @generated
	 * @ordered
	 */
	protected EnumObjectiveType objectiveType = OBJECTIVE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLpGoalTerm() <em>Lp Goal Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpGoalTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpGoalTerm> lpGoalTerm;

	/**
	 * The default value of the '{@link #getGoalWeight() <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float GOAL_WEIGHT_EDEFAULT = 0.0F;

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
	public EnumObjectiveType getObjectiveType() {
		return objectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectiveType(EnumObjectiveType newObjectiveType) {
		EnumObjectiveType oldObjectiveType = objectiveType;
		objectiveType = newObjectiveType == null ? OBJECTIVE_TYPE_EDEFAULT : newObjectiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE, oldObjectiveType, objectiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpGoalTerm> getLpGoalTerm() {
		if (lpGoalTerm == null) {
			lpGoalTerm = new EObjectContainmentWithInverseEList<GeneratorLpGoalTerm>(GeneratorLpGoalTerm.class, this, SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM, SolverPackage.GENERATOR_LP_GOAL_TERM__LP_GOAL);
		}
		return lpGoalTerm;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_GOAL__GOAL_WEIGHT, oldGoalWeight, goalWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpGoalTerm constructTerm(GeneratorLpVar var, float coef) {
		GeneratorLpGoalTerm term = SolverFactory.eINSTANCE.createGeneratorLpGoalTerm();
		term.setCoeff(coef);
		term.setLpVar(var);
		this.getLpGoalTerm().add(term);
		return term;
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpGoalTerm()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM:
				return ((InternalEList<?>)getLpGoalTerm()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				return getObjectiveType();
			case SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM:
				return getLpGoalTerm();
			case SolverPackage.GENERATOR_LP_GOAL__GOAL_WEIGHT:
				return getGoalWeight();
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				setObjectiveType((EnumObjectiveType)newValue);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM:
				getLpGoalTerm().clear();
				getLpGoalTerm().addAll((Collection<? extends GeneratorLpGoalTerm>)newValue);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__GOAL_WEIGHT:
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				setObjectiveType(OBJECTIVE_TYPE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM:
				getLpGoalTerm().clear();
				return;
			case SolverPackage.GENERATOR_LP_GOAL__GOAL_WEIGHT:
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				return objectiveType != OBJECTIVE_TYPE_EDEFAULT;
			case SolverPackage.GENERATOR_LP_GOAL__LP_GOAL_TERM:
				return lpGoalTerm != null && !lpGoalTerm.isEmpty();
			case SolverPackage.GENERATOR_LP_GOAL__GOAL_WEIGHT:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_LP_GOAL___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT:
				return constructTerm((GeneratorLpVar)arguments.get(0), (Float)arguments.get(1));
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
		result.append(" (ObjectiveType: ");
		result.append(objectiveType);
		result.append(", GoalWeight: ");
		result.append(goalWeight);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpGoalImpl
