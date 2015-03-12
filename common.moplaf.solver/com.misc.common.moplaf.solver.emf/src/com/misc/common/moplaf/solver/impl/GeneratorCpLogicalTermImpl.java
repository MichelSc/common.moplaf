/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorCpCons;
import com.misc.common.moplaf.solver.GeneratorCpLogicalTerm;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Cp Logical Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl#isNot <em>Not</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl#getCpCons <em>Cp Cons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorCpLogicalTermImpl extends MinimalEObjectImpl.Container implements GeneratorCpLogicalTerm {
	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCpCons() <em>Cp Cons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCons()
	 * @generated
	 * @ordered
	 */
	protected GeneratorCpCons cpCons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLogicalTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_CP_LOGICAL_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LOGICAL_TERM__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpCons getCpCons() {
		if (cpCons != null && cpCons.eIsProxy()) {
			InternalEObject oldCpCons = (InternalEObject)cpCons;
			cpCons = (GeneratorCpCons)eResolveProxy(oldCpCons);
			if (cpCons != oldCpCons) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR_CP_LOGICAL_TERM__CP_CONS, oldCpCons, cpCons));
			}
		}
		return cpCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpCons basicGetCpCons() {
		return cpCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpCons(GeneratorCpCons newCpCons) {
		GeneratorCpCons oldCpCons = cpCons;
		cpCons = newCpCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LOGICAL_TERM__CP_CONS, oldCpCons, cpCons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__NOT:
				return isNot();
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__CP_CONS:
				if (resolve) return getCpCons();
				return basicGetCpCons();
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
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__NOT:
				setNot((Boolean)newValue);
				return;
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__CP_CONS:
				setCpCons((GeneratorCpCons)newValue);
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
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__CP_CONS:
				setCpCons((GeneratorCpCons)null);
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
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__NOT:
				return not != NOT_EDEFAULT;
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM__CP_CONS:
				return cpCons != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Not: ");
		result.append(not);
		result.append(')');
		return result.toString();
	}

} //GeneratorCpLogicalTermImpl
