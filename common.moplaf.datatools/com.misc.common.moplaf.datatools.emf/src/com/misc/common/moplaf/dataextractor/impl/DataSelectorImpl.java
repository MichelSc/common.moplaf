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
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataExtractorElement;
import com.misc.common.moplaf.dataextractor.DataSelector;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl#getExtractorElement <em>Extractor Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataSelectorImpl extends MinimalEObjectImpl.Container implements DataSelector {
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
	protected DataSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractorElement getExtractorElement() {
		if (eContainerFeatureID() != DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT) return null;
		return (DataExtractorElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractorElement(DataExtractorElement newExtractorElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExtractorElement, DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractorElement(DataExtractorElement newExtractorElement) {
		if (newExtractorElement != eInternalContainer() || (eContainerFeatureID() != DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT && newExtractorElement != null)) {
			if (EcoreUtil.isAncestor(this, newExtractorElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtractorElement != null)
				msgs = ((InternalEObject)newExtractorElement).eInverseAdd(this, DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS, DataExtractorElement.class, msgs);
			msgs = basicSetExtractorElement(newExtractorElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT, newExtractorElement, newExtractorElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected(EObject object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtractorElement((DataExtractorElement)otherEnd, msgs);
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
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				return basicSetExtractorElement(null, msgs);
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
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				return eInternalContainer().eInverseRemove(this, DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS, DataExtractorElement.class, msgs);
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
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				return getExtractorElement();
			case DataextractorPackage.DATA_SELECTOR__DESCRIPTION:
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
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				setExtractorElement((DataExtractorElement)newValue);
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
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				setExtractorElement((DataExtractorElement)null);
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
			case DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT:
				return getExtractorElement() != null;
			case DataextractorPackage.DATA_SELECTOR__DESCRIPTION:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataextractorPackage.DATA_SELECTOR___IS_SELECTED__EOBJECT:
				return isSelected((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataSelectorImpl
