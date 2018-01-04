/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.SolverVarBinderToSolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Binder To Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverVarBinderToSolutionImpl#getSelectedSolution <em>Selected Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverVarBinderToSolutionImpl extends SolverVarBinderImpl implements SolverVarBinderToSolution {
	/**
	 * The cached value of the '{@link #getSelectedSolution() <em>Selected Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution selectedSolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverVarBinderToSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_VAR_BINDER_TO_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSelectedSolution() {
		if (selectedSolution != null && selectedSolution.eIsProxy()) {
			InternalEObject oldSelectedSolution = (InternalEObject)selectedSolution;
			selectedSolution = (Solution)eResolveProxy(oldSelectedSolution);
			if (selectedSolution != oldSelectedSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION, oldSelectedSolution, selectedSolution));
			}
		}
		return selectedSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetSelectedSolution() {
		return selectedSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedSolution(Solution newSelectedSolution) {
		Solution oldSelectedSolution = selectedSolution;
		selectedSolution = newSelectedSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION, oldSelectedSolution, selectedSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
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
			case SolverPackage.SOLVER_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
				setSelectedSolution((Solution)newValue);
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
			case SolverPackage.SOLVER_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
				setSelectedSolution((Solution)null);
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
			case SolverPackage.SOLVER_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION:
				return selectedSolution != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getLabel() {
		Solution solution = this.getSelectedSolution();
		String label = super.getLabel()+ "to solution "+(solution==null ? "null" : solution.getCode());
		return label;
	}
} //SolverVarBinderToSolutionImpl
