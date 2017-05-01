/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.MacroPlannerData;
import com.misc.common.moplaf.macroplanner.MacroPlannerDataElement;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataElementImpl#getMacroPlannerData <em>Macro Planner Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MacroPlannerDataElementImpl extends MinimalEObjectImpl.Container implements MacroPlannerDataElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroPlannerDataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.MACRO_PLANNER_DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerData getMacroPlannerData() {
		if (eContainerFeatureID() != MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA) return null;
		return (MacroPlannerData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacroPlannerData(MacroPlannerData newMacroPlannerData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMacroPlannerData, MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacroPlannerData(MacroPlannerData newMacroPlannerData) {
		if (newMacroPlannerData != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA && newMacroPlannerData != null)) {
			if (EcoreUtil.isAncestor(this, newMacroPlannerData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMacroPlannerData != null)
				msgs = ((InternalEObject)newMacroPlannerData).eInverseAdd(this, MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS, MacroPlannerData.class, msgs);
			msgs = basicSetMacroPlannerData(newMacroPlannerData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA, newMacroPlannerData, newMacroPlannerData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMacroPlannerData((MacroPlannerData)otherEnd, msgs);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				return basicSetMacroPlannerData(null, msgs);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS, MacroPlannerData.class, msgs);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				return getMacroPlannerData();
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				setMacroPlannerData((MacroPlannerData)newValue);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				setMacroPlannerData((MacroPlannerData)null);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA:
				return getMacroPlannerData() != null;
		}
		return super.eIsSet(featureID);
	}

} //MacroPlannerDataElementImpl
