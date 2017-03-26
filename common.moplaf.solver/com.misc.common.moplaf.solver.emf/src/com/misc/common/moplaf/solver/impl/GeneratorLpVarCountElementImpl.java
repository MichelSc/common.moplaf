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

import com.misc.common.moplaf.solver.GeneratorLpVarCount;
import com.misc.common.moplaf.solver.GeneratorLpVarCountElement;
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
 * An implementation of the model object '<em><b>Generator Lp Var Count Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl#getELpVarCount <em>ELp Var Count</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl#getECount <em>ECount</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl#getEClass <em>EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpVarCountElementImpl extends MinimalEObjectImpl.Container implements GeneratorLpVarCountElement {
	/**
	 * The default value of the '{@link #getECount() <em>ECount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECount()
	 * @generated
	 * @ordered
	 */
	protected static final int ECOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getECount() <em>ECount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECount()
	 * @generated
	 * @ordered
	 */
	protected int eCount = ECOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEClass() <em>EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ECLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected String eClass = ECLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarCountElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_VAR_COUNT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVarCount getELpVarCount() {
		if (eContainerFeatureID() != SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT) return null;
		return (GeneratorLpVarCount)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELpVarCount(GeneratorLpVarCount newELpVarCount, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newELpVarCount, SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELpVarCount(GeneratorLpVarCount newELpVarCount) {
		if (newELpVarCount != eInternalContainer() || (eContainerFeatureID() != SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT && newELpVarCount != null)) {
			if (EcoreUtil.isAncestor(this, newELpVarCount))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newELpVarCount != null)
				msgs = ((InternalEObject)newELpVarCount).eInverseAdd(this, SolverPackage.GENERATOR_LP_VAR_COUNT__ELP_VAR_COUNT_ELEMENT, GeneratorLpVarCount.class, msgs);
			msgs = basicSetELpVarCount(newELpVarCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT, newELpVarCount, newELpVarCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getECount() {
		return eCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECount(int newECount) {
		int oldECount = eCount;
		eCount = newECount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT, oldECount, eCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(String newEClass) {
		String oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetELpVarCount((GeneratorLpVarCount)otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				return basicSetELpVarCount(null, msgs);
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
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				return eInternalContainer().eInverseRemove(this, SolverPackage.GENERATOR_LP_VAR_COUNT__ELP_VAR_COUNT_ELEMENT, GeneratorLpVarCount.class, msgs);
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
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				return getELpVarCount();
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT:
				return getECount();
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS:
				return getEClass();
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
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				setELpVarCount((GeneratorLpVarCount)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT:
				setECount((Integer)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS:
				setEClass((String)newValue);
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
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				setELpVarCount((GeneratorLpVarCount)null);
				return;
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT:
				setECount(ECOUNT_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS:
				setEClass(ECLASS_EDEFAULT);
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
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT:
				return getELpVarCount() != null;
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT:
				return eCount != ECOUNT_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS:
				return ECLASS_EDEFAULT == null ? eClass != null : !ECLASS_EDEFAULT.equals(eClass);
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
		result.append(" (ECount: ");
		result.append(eCount);
		result.append(", EClass: ");
		result.append(eClass);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpVarCountElementImpl
