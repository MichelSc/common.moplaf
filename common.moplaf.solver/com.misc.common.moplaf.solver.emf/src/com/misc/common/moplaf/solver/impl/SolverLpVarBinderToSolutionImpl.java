/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolverLpVarBinderToSolution;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Var Binder To Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverLpVarBinderToSolutionImpl#getSelectedSolution <em>Selected Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverLpVarBinderToSolutionImpl extends SolverLpVarBinderImpl implements SolverLpVarBinderToSolution {
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
	protected SolverLpVarBinderToSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_LP_VAR_BINDER_TO_SOLUTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION, oldSelectedSolution, selectedSolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION, oldSelectedSolution, selectedSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
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
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
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
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
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
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
				return selectedSolution != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public float getLowerBound(GeneratorLpVar var) {
		float bound = var.getSolutionValue(this.basicGetSelectedSolution());
		return bound;
	}

	@Override
	public float getUpperBound(GeneratorLpVar var) {
		float bound = var.getSolutionValue(this.basicGetSelectedSolution());
		return bound;
	}
	
	

} //SolverLpVarBinderToSolutionImpl
