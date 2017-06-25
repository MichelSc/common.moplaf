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
 * </ul>
 *
 * @generated
 */
public class SolverVarBinderImpl extends MinimalEObjectImpl.Container implements SolverVarBinder {
	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected Solver solver;

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
		if (solver != null && solver.eIsProxy()) {
			InternalEObject oldSolver = (InternalEObject)solver;
			solver = (Solver)eResolveProxy(oldSolver);
			if (solver != oldSolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_VAR_BINDER__SOLVER, oldSolver, solver));
			}
		}
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solver basicGetSolver() {
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolver(Solver newSolver, NotificationChain msgs) {
		Solver oldSolver = solver;
		solver = newSolver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_VAR_BINDER__SOLVER, oldSolver, newSolver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolver(Solver newSolver) {
		if (newSolver != solver) {
			NotificationChain msgs = null;
			if (solver != null)
				msgs = ((InternalEObject)solver).eInverseRemove(this, SolverPackage.SOLVER__VAR_BINDERS, Solver.class, msgs);
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				if (solver != null)
					msgs = ((InternalEObject)solver).eInverseRemove(this, SolverPackage.SOLVER__VAR_BINDERS, Solver.class, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_VAR_BINDER__SOLVER:
				if (resolve) return getSolver();
				return basicGetSolver();
			case SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER:
				if (resolve) return getVarBinder();
				return basicGetVarBinder();
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
				return solver != null;
			case SolverPackage.SOLVER_VAR_BINDER__VAR_BINDER:
				return varBinder != null;
		}
		return super.eIsSet(featureID);
	}

} //SolverVarBinderImpl
