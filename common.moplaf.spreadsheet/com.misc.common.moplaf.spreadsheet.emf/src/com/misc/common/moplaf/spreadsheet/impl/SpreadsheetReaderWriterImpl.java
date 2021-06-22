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
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.file.impl.FileReaderWriterImpl;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;
import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reader Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.impl.SpreadsheetReaderWriterImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpreadsheetReaderWriterImpl extends FileReaderWriterImpl implements SpreadsheetReaderWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetReaderWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpreadsheetPackage.Literals.SPREADSHEET_READER_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spreadsheet getSpreadsheet() {
		if (eContainerFeatureID() != SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET) return null;
		return (Spreadsheet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpreadsheet(Spreadsheet newSpreadsheet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpreadsheet, SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpreadsheet(Spreadsheet newSpreadsheet) {
		if (newSpreadsheet != eInternalContainer() || (eContainerFeatureID() != SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET && newSpreadsheet != null)) {
			if (EcoreUtil.isAncestor(this, newSpreadsheet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpreadsheet != null)
				msgs = ((InternalEObject)newSpreadsheet).eInverseAdd(this, SpreadsheetPackage.SPREADSHEET__FILES, Spreadsheet.class, msgs);
			msgs = basicSetSpreadsheet(newSpreadsheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET, newSpreadsheet, newSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpreadsheet((Spreadsheet)otherEnd, msgs);
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
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				return basicSetSpreadsheet(null, msgs);
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
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				return eInternalContainer().eInverseRemove(this, SpreadsheetPackage.SPREADSHEET__FILES, Spreadsheet.class, msgs);
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
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				return getSpreadsheet();
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
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				setSpreadsheet((Spreadsheet)newValue);
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
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				setSpreadsheet((Spreadsheet)null);
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
			case SpreadsheetPackage.SPREADSHEET_READER_WRITER__SPREADSHEET:
				return getSpreadsheet() != null;
		}
		return super.eIsSet(featureID);
	}

} //SpreadsheetReaderWriterImpl
