/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpGoalTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionLp;
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
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
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
	 * The default value of the '{@link #getSelectedSolutionValue() <em>Selected Solution Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolutionValue()
	 * @generated
	 * @ordered
	 */
	protected static final float SELECTED_SOLUTION_VALUE_EDEFAULT = 0.0F;

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
	 */
	public float getSelectedSolutionValue() {
		Generator generator = this.getGenerator();
		Solution solution = generator.getSelected();
		return this.getSolutionValue(solution);
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
	 */
	public float getSolutionValue(Solution solution) {
		SolutionLp solutionLp = (SolutionLp)solution;
		if ( solutionLp==null) { return 0.0f; }
		return solutionLp.getGoalValue();
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
			case SolverPackage.GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE:
				return getSelectedSolutionValue();
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
			case SolverPackage.GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE:
				return getSelectedSolutionValue() != SELECTED_SOLUTION_VALUE_EDEFAULT;
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
			case SolverPackage.GENERATOR_LP_GOAL___GET_SOLUTION_VALUE__SOLUTION:
				return getSolutionValue((Solution)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //GeneratorLpGoalImpl