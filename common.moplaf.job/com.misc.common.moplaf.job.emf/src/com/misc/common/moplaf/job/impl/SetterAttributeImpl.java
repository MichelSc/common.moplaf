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
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.SetterAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setter Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterAttributeImpl#getAttributeToSet <em>Attribute To Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SetterAttributeImpl extends SetterStructuralFeatureImpl implements SetterAttribute {
	/**
	 * The cached value of the '{@link #getAttributeToSet() <em>Attribute To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToSet()
	 * @generated
	 * @ordered
	 */
	protected EAttribute attributeToSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.SETTER_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeToSet() {
		if (attributeToSet != null && attributeToSet.eIsProxy()) {
			InternalEObject oldAttributeToSet = (InternalEObject)attributeToSet;
			attributeToSet = (EAttribute)eResolveProxy(oldAttributeToSet);
			if (attributeToSet != oldAttributeToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobPackage.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET, oldAttributeToSet, attributeToSet));
			}
		}
		return attributeToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAttributeToSet() {
		return attributeToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToSet(EAttribute newAttributeToSet) {
		EAttribute oldAttributeToSet = attributeToSet;
		attributeToSet = newAttributeToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET, oldAttributeToSet, attributeToSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET:
				if (resolve) return getAttributeToSet();
				return basicGetAttributeToSet();
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
			case JobPackage.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET:
				setAttributeToSet((EAttribute)newValue);
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
			case JobPackage.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET:
				setAttributeToSet((EAttribute)null);
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
			case JobPackage.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET:
				return attributeToSet != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EStructuralFeature basicGetFeatureToSet() {
		return this.getAttributeToSet();
	}
} //SetterAttributeImpl
