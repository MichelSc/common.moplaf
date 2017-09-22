/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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

import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getLpVar <em>Lp Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getLpLinear <em>Lp Linear</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpTermImpl extends MinimalEObjectImpl.Container implements GeneratorLpTerm {
	/**
	 * The cached value of the '{@link #getLpVar() <em>Lp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpVar()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar lpVar;

	/**
	 * The default value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected static final double COEFF_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected double coeff = COEFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getLpVar() {
		if (lpVar != null && lpVar.eIsProxy()) {
			InternalEObject oldLpVar = (InternalEObject)lpVar;
			lpVar = (GeneratorLpVar)eResolveProxy(oldLpVar);
			if (lpVar != oldLpVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR_LP_TERM__LP_VAR, oldLpVar, lpVar));
			}
		}
		return lpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar basicGetLpVar() {
		return lpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpVar(GeneratorLpVar newLpVar, NotificationChain msgs) {
		GeneratorLpVar oldLpVar = lpVar;
		lpVar = newLpVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__LP_VAR, oldLpVar, newLpVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpVar(GeneratorLpVar newLpVar) {
		if (newLpVar != lpVar) {
			NotificationChain msgs = null;
			if (lpVar != null)
				msgs = ((InternalEObject)lpVar).eInverseRemove(this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, GeneratorLpVar.class, msgs);
			if (newLpVar != null)
				msgs = ((InternalEObject)newLpVar).eInverseAdd(this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, GeneratorLpVar.class, msgs);
			msgs = basicSetLpVar(newLpVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__LP_VAR, newLpVar, newLpVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoeff() {
		return coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoeff(double newCoeff) {
		double oldCoeff = coeff;
		coeff = newCoeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__COEFF, oldCoeff, coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpLinear getLpLinear() {
		if (eContainerFeatureID() != SolverPackage.GENERATOR_LP_TERM__LP_LINEAR) return null;
		return (GeneratorLpLinear)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpLinear(GeneratorLpLinear newLpLinear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLpLinear, SolverPackage.GENERATOR_LP_TERM__LP_LINEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpLinear(GeneratorLpLinear newLpLinear) {
		if (newLpLinear != eInternalContainer() || (eContainerFeatureID() != SolverPackage.GENERATOR_LP_TERM__LP_LINEAR && newLpLinear != null)) {
			if (EcoreUtil.isAncestor(this, newLpLinear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLpLinear != null)
				msgs = ((InternalEObject)newLpLinear).eInverseAdd(this, SolverPackage.GENERATOR_LP_LINEAR__LP_TERM, GeneratorLpLinear.class, msgs);
			msgs = basicSetLpLinear(newLpLinear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__LP_LINEAR, newLpLinear, newLpLinear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		GeneratorLpVar var = this.getLpVar();
		double coefficient = this.getCoeff();
		String varcode = var==null ? "null" : var.getCode();
		String code = String.format("%2$.1f %1$s", varcode, coefficient);
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				if (lpVar != null)
					msgs = ((InternalEObject)lpVar).eInverseRemove(this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, GeneratorLpVar.class, msgs);
				return basicSetLpVar((GeneratorLpVar)otherEnd, msgs);
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLpLinear((GeneratorLpLinear)otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				return basicSetLpVar(null, msgs);
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				return basicSetLpLinear(null, msgs);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				return eInternalContainer().eInverseRemove(this, SolverPackage.GENERATOR_LP_LINEAR__LP_TERM, GeneratorLpLinear.class, msgs);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				if (resolve) return getLpVar();
				return basicGetLpVar();
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				return getCoeff();
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				return getLpLinear();
			case SolverPackage.GENERATOR_LP_TERM__DESCRIPTION:
				return getDescription();
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				setLpVar((GeneratorLpVar)newValue);
				return;
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				setCoeff((Double)newValue);
				return;
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				setLpLinear((GeneratorLpLinear)newValue);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				setLpVar((GeneratorLpVar)null);
				return;
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				setCoeff(COEFF_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				setLpLinear((GeneratorLpLinear)null);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				return lpVar != null;
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				return coeff != COEFF_EDEFAULT;
			case SolverPackage.GENERATOR_LP_TERM__LP_LINEAR:
				return getLpLinear() != null;
			case SolverPackage.GENERATOR_LP_TERM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
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
		result.append(" (Coeff: ");
		result.append(coeff);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpTermImpl
