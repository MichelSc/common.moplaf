/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorLpVarBinderCustom;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolverLpVarBinderCustom;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Var Binder Custom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverLpVarBinderCustomImpl#getSelectedSolution <em>Selected Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverLpVarBinderCustomImpl extends SolverLpVarBinderImpl implements SolverLpVarBinderCustom {
	/**
	 * The cached value of the '{@link #getSelectedSolution() <em>Selected Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected SolutionLp selectedSolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverLpVarBinderCustomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_LP_VAR_BINDER_CUSTOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLp getSelectedSolution() {
		if (selectedSolution != null && selectedSolution.eIsProxy()) {
			InternalEObject oldSelectedSolution = (InternalEObject)selectedSolution;
			selectedSolution = (SolutionLp)eResolveProxy(oldSelectedSolution);
			if (selectedSolution != oldSelectedSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_LP_VAR_BINDER_CUSTOM__SELECTED_SOLUTION, oldSelectedSolution, selectedSolution));
			}
		}
		return selectedSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLp basicGetSelectedSolution() {
		return selectedSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedSolution(SolutionLp newSelectedSolution) {
		SolutionLp oldSelectedSolution = selectedSolution;
		selectedSolution = newSelectedSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_LP_VAR_BINDER_CUSTOM__SELECTED_SOLUTION, oldSelectedSolution, selectedSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_LP_VAR_BINDER_CUSTOM__SELECTED_SOLUTION:
				if (resolve) return getSelectedSolution();
				return basicGetSelectedSolution();
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
			case SolverPackage.SOLVER_LP_VAR_BINDER_CUSTOM__SELECTED_SOLUTION:
				setSelectedSolution((SolutionLp)newValue);
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
			case SolverPackage.SOLVER_LP_VAR_BINDER_CUSTOM__SELECTED_SOLUTION:
				setSelectedSolution((SolutionLp)null);
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
			case SolverPackage.SOLVER_LP_VAR_BINDER_CUSTOM__SELECTED_SOLUTION:
				return selectedSolution != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public double getLowerBound(GeneratorLpVar var) {
		GeneratorLpVarBinderCustom binder = (GeneratorLpVarBinderCustom)this.getVarBinder();
		double bound = binder.getLowerBound(var, this.getSelectedSolution());
		return bound;
	}

	@Override
	public double getUpperBound(GeneratorLpVar var) {
		GeneratorLpVarBinderCustom binder = (GeneratorLpVarBinderCustom)this.getVarBinder();
		double bound = binder.getUpperBound(var, this.getSelectedSolution());
		return bound;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getLabel() {
		SolutionLp solution = this.getSelectedSolution();
		String label = super.getLabel()+ "to solution "+(solution==null ? "null" : solution.getCode());
		return label;
	}
} //SolverLpVarBinderCustomImpl
