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

import com.misc.common.moplaf.solver.GeneratorVarBinder;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.SolverVarBinder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Binder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverVarBinderImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverVarBinderImpl#getVarBinder <em>Var Binder</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverVarBinderImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverVarBinderImpl extends MinimalEObjectImpl.Container implements SolverVarBinder {
	/**
	 * The cached value of the '{@link #getVarBinder() <em>Var Binder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBinder()
	 * @generated
	 * @ordered
	 */
	protected GeneratorVarBinder varBinder;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverVarBinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_VAR_BINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solver getSolver() {
		if (eContainerFeatureID() != SolverPackage.SOLVER_VAR_BINDER__SOLVER) return null;
		return (Solver)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolver(Solver newSolver, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSolver, SolverPackage.SOLVER_VAR_BINDER__SOLVER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolver(Solver newSolver) {
		if (newSolver != eInternalContainer() || (eContainerFeatureID() != SolverPackage.SOLVER_VAR_BINDER__SOLVER && newSolver != null)) {
			if (EcoreUtil.isAncestor(this, newSolver))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSolver != null)
				msgs = ((InternalEObject)newSolver).eInverseAdd(this, SolverPackage.SOLVER__VAR_BINDERS, Solver.class, msgs);
			msgs = basicSetSolver(newSolver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_VAR_BINDER__SOLVER, newSolver, newSolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorVarBinder getVarBinder() {
		if (varBinder != null && varBinder.eIsProxy()) {
			InternalEObject oldVarBinder = (InternalEObject)varBinder;
			varBinder = (GeneratorVarBinder)eResolveProxy(oldVarBinder);
			if (varBinder != oldVarBinder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER, oldVarBinder, varBinder));
			}
		}
		return varBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorVarBinder basicGetVarBinder() {
		return varBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarBinder(GeneratorVarBinder newVarBinder) {
		GeneratorVarBinder oldVarBinder = varBinder;
		varBinder = newVarBinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER, oldVarBinder, varBinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLabel() {
		GeneratorVarBinder generator_binder = this.getVarBinder();
		return generator_binder.getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSolver((Solver)otherEnd, msgs);
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
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				return basicSetSolver(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				return eInternalContainer().eInverseRemove(this, SolverPackage.SOLVER__VAR_BINDERS, Solver.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				return getSolver();
			case SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER:
				if (resolve) return getVarBinder();
				return basicGetVarBinder();
			case SolverPackage.SOLVER_VAR_BINDER__LABEL:
				return getLabel();
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
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				setSolver((Solver)newValue);
				return;
			case SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER:
				setVarBinder((GeneratorVarBinder)newValue);
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
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				setSolver((Solver)null);
				return;
			case SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER:
				setVarBinder((GeneratorVarBinder)null);
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
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				return getSolver() != null;
			case SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER:
				return varBinder != null;
			case SolverPackage.SOLVER_VAR_BINDER__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
		}
		return super.eIsSet(featureID);
	}

} //SolverVarBinderImpl
