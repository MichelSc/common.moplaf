/**
 */
package com.misc.common.moplaf.solver.impl;


import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorVarImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorVarImpl#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorVarImpl extends GeneratorTupleMemberImpl implements GeneratorVar {
	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionVar> solution;

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
	protected GeneratorVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionVar> getSolution() {
		if (solution == null) {
			solution = new EObjectWithInverseResolvingEList<SolutionVar>(SolutionVar.class, this, SolverPackage.GENERATOR_VAR__SOLUTION, SolverPackage.SOLUTION_VAR__VAR);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSelectedSolutionValue() {
		Generator generator = this.getTuple().getGenerator();
		Solution solution = generator.getSelected();
		return this.getSolutionValue(solution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshSelectedSolution() {
		String code = this.getCode();
		float value = this.getSelectedSolutionValue();
		String suffix = "";
		if ( Math.abs(value)>0.001){
			suffix = String.format(" =%1$5.1f", value);
		}
		String selectedSolutionDisplay = String.format("%1$s %2$s", code, suffix);
		this.setSelectedSolutionDisplay(selectedSolutionDisplay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionVar getSolutionVar(Solution solutionprovider) {
		for(SolutionVar currentsol : this.getSolution()) {
			if ( currentsol.getSolution()==solutionprovider) {
				return currentsol;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSolutionOne(Solution solver) {
		SolutionVar solvar = this.getSolutionVar(solver);
		if ( solvar==null) { return false; }
		return solvar.getOptimalValue()>0.5f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSolutionZero(Solution solver) {
		SolutionVar solvar = this.getSolutionVar(solver);
		if ( solvar==null) { return false; }
		return solvar.getOptimalValue()<0.5f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSolutionValue(Solution solver) {
		if ( solver == null ) { return 0.0f; }
		SolutionVar solvar = this.getSolutionVar(solver);
		if ( solvar==null) { return 0.0f; }
		return solvar.getOptimalValue();
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
			case SolverPackage.GENERATOR_VAR__SOLUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolution()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_VAR__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_VAR__SOLUTION:
				return getSolution();
			case SolverPackage.GENERATOR_VAR__SELECTED_SOLUTION_VALUE:
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
			case SolverPackage.GENERATOR_VAR__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends SolutionVar>)newValue);
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
			case SolverPackage.GENERATOR_VAR__SOLUTION:
				getSolution().clear();
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
			case SolverPackage.GENERATOR_VAR__SOLUTION:
				return solution != null && !solution.isEmpty();
			case SolverPackage.GENERATOR_VAR__SELECTED_SOLUTION_VALUE:
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
			case SolverPackage.GENERATOR_VAR___GET_SOLUTION_VAR__SOLUTION:
				return getSolutionVar((Solution)arguments.get(0));
			case SolverPackage.GENERATOR_VAR___IS_SOLUTION_ONE__SOLUTION:
				return isSolutionOne((Solution)arguments.get(0));
			case SolverPackage.GENERATOR_VAR___IS_SOLUTION_ZERO__SOLUTION:
				return isSolutionZero((Solution)arguments.get(0));
			case SolverPackage.GENERATOR_VAR___GET_SOLUTION_VALUE__SOLUTION:
				return getSolutionValue((Solution)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneratorVarImpl
