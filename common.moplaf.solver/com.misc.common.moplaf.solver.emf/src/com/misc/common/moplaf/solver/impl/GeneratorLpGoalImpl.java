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
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getLpTerm <em>Lp Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getObjectiveType <em>Objective Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
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
	 */
	public float getSelectedSolutionValue() {
		Generator generator = this.getGenerator();
		Solution solution = generator.getSelected();
		SolutionGoal solutionGoal = this.getSolutionGoal(solution);
		if ( solutionGoal instanceof SolutionLpGoal ) {
			SolutionLpGoal lpGoal = (SolutionLpGoal) solutionGoal;
			return lpGoal.getValue(); 
		} 
		
		return 0.0f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		String code = this.getCode();
		String suffix = "";
		float value = this.getSelectedSolutionValue();
		suffix = String.format(" =%1$5.1f", value);
		String selectedSolutionDisplay = String.format("%1$s %2$s", code, suffix);
		this.setSelectedSolutionDisplay(selectedSolutionDisplay);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpTerm constructTerm(GeneratorLpVar var, float coef) {
		GeneratorLpTerm term = SolverFactory.eINSTANCE.createGeneratorLpTerm();
		term.setCoeff(coef);
		term.setLpVar(var);
		this.getLpTerm().add(term);
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSolutionValue(Solution solution) {
		SolutionLp solutionLp = (SolutionLp)solution;
		if ( solutionLp==null) { return 0.0f; }
		float goalValue = 0.0f;
		for ( GeneratorLpTerm term : this.getLpTerm()){
			float coeff = term.getCoeff();
			float varValue = term.getLpVar().getSolutionValue(solution);
			goalValue += coeff*varValue;
		}
		
		return goalValue;
	}
	

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void buildCons(SolutionGoal solutionGoal, Solver builder) throws Exception{
		if ( ! (solutionGoal instanceof SolutionLpGoal)){
			return;
		}
			
		SolutionLpGoal solutionLpGoal = (SolutionLpGoal)solutionGoal;
		float rhs = solutionLpGoal.getValue();
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				return getObjectiveType();
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
			case SolverPackage.GENERATOR_LP_GOAL__LP_TERM:
				getLpTerm().clear();
				getLpTerm().addAll((Collection<? extends GeneratorLpTerm>)newValue);
				return;
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				setObjectiveType((EnumObjectiveType)newValue);
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				setObjectiveType(OBJECTIVE_TYPE_EDEFAULT);
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
			case SolverPackage.GENERATOR_LP_GOAL__OBJECTIVE_TYPE:
				return objectiveType != OBJECTIVE_TYPE_EDEFAULT;
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
				case SolverPackage.GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT: return SolverPackage.GENERATOR_LP_GOAL___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT;
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
		result.append(')');
		return result.toString();
	}

} //GeneratorLpGoalImpl
