/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.GeneratorVarBinder;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Var Binder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorVarBinderImpl#getBoundVars <em>Bound Vars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorVarBinderImpl extends MinimalEObjectImpl.Container implements GeneratorVarBinder {
	/**
	 * The cached value of the '{@link #getBoundVars() <em>Bound Vars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundVars()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorVar> boundVars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorVarBinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_VAR_BINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorVar> getBoundVars() {
		if (boundVars == null) {
			boundVars = new EObjectResolvingEList<GeneratorVar>(GeneratorVar.class, this, SolverPackage.GENERATOR_VAR_BINDER__BOUND_VARS);
		}
		return boundVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_VAR_BINDER__BOUND_VARS:
				return getBoundVars();
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
			case SolverPackage.GENERATOR_VAR_BINDER__BOUND_VARS:
				getBoundVars().clear();
				getBoundVars().addAll((Collection<? extends GeneratorVar>)newValue);
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
			case SolverPackage.GENERATOR_VAR_BINDER__BOUND_VARS:
				getBoundVars().clear();
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
			case SolverPackage.GENERATOR_VAR_BINDER__BOUND_VARS:
				return boundVars != null && !boundVars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneratorVarBinderImpl
