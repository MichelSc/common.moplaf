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

import com.misc.common.moplaf.dataextractor.DataExtractor;
import com.misc.common.moplaf.dataextractor.DataSorter;
import com.misc.common.moplaf.dataextractor.DataSorterSense;
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
 * An implementation of the model object '<em><b>Data Sorter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSorterImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSorterImpl#getSense <em>Sense</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSorterImpl#getDataExtractor <em>Data Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSorterImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataSorterImpl extends MinimalEObjectImpl.Container implements DataSorter {
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getSense() <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSense()
	 * @generated
	 * @ordered
	 */
	protected static final DataSorterSense SENSE_EDEFAULT = DataSorterSense.ASC;

	/**
	 * The cached value of the '{@link #getSense() <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSense()
	 * @generated
	 * @ordered
	 */
	protected DataSorterSense sense = SENSE_EDEFAULT;

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
	protected DataSorterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_SORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getSequence() {
		DataExtractor dataExtractor = this.getDataExtractor();
		int sequence = dataExtractor.getSorters().indexOf(this);
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSorterSense getSense() {
		return sense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSense(DataSorterSense newSense) {
		DataSorterSense oldSense = sense;
		sense = newSense == null ? SENSE_EDEFAULT : newSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_SORTER__SENSE, oldSense, sense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractor getDataExtractor() {
		if (eContainerFeatureID() != DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR) return null;
		return (DataExtractor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExtractor(DataExtractor newDataExtractor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataExtractor, DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExtractor(DataExtractor newDataExtractor) {
		if (newDataExtractor != eInternalContainer() || (eContainerFeatureID() != DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR && newDataExtractor != null)) {
			if (EcoreUtil.isAncestor(this, newDataExtractor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataExtractor != null)
				msgs = ((InternalEObject)newDataExtractor).eInverseAdd(this, DataextractorPackage.DATA_EXTRACTOR__SORTERS, DataExtractor.class, msgs);
			msgs = basicSetDataExtractor(newDataExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR, newDataExtractor, newDataExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%d/%s", this.getSequence(), this.sense.name());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compare(EObject object1, EObject object2) {
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
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataExtractor((DataExtractor)otherEnd, msgs);
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
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				return basicSetDataExtractor(null, msgs);
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
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				return eInternalContainer().eInverseRemove(this, DataextractorPackage.DATA_EXTRACTOR__SORTERS, DataExtractor.class, msgs);
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
			case DataextractorPackage.DATA_SORTER__SEQUENCE:
				return getSequence();
			case DataextractorPackage.DATA_SORTER__SENSE:
				return getSense();
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				return getDataExtractor();
			case DataextractorPackage.DATA_SORTER__DESCRIPTION:
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
			case DataextractorPackage.DATA_SORTER__SENSE:
				setSense((DataSorterSense)newValue);
				return;
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				setDataExtractor((DataExtractor)newValue);
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
			case DataextractorPackage.DATA_SORTER__SENSE:
				setSense(SENSE_EDEFAULT);
				return;
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				setDataExtractor((DataExtractor)null);
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
			case DataextractorPackage.DATA_SORTER__SEQUENCE:
				return getSequence() != SEQUENCE_EDEFAULT;
			case DataextractorPackage.DATA_SORTER__SENSE:
				return sense != SENSE_EDEFAULT;
			case DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR:
				return getDataExtractor() != null;
			case DataextractorPackage.DATA_SORTER__DESCRIPTION:
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
			case DataextractorPackage.DATA_SORTER___COMPARE__EOBJECT_EOBJECT:
				return compare((EObject)arguments.get(0), (EObject)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Sense: ");
		result.append(sense);
		result.append(')');
		return result.toString();
	}

} //DataSorterImpl
