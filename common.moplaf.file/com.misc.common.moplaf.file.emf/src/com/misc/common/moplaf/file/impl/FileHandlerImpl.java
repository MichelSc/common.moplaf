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
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileHandler;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.util.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileHandlerImpl#getSelectedFile <em>Selected File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileHandlerImpl#getHandledFile <em>Handled File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileHandlerImpl extends FileOwnerImpl implements FileHandler {
	/**
	 * The cached value of the '{@link #getSelectedFile() <em>Selected File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFile()
	 * @generated
	 * @ordered
	 */
	protected File selectedFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getSelectedFile() {
		if (selectedFile != null && selectedFile.eIsProxy()) {
			InternalEObject oldSelectedFile = (InternalEObject)selectedFile;
			selectedFile = (File)eResolveProxy(oldSelectedFile);
			if (selectedFile != oldSelectedFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FilePackage.FILE_HANDLER__SELECTED_FILE, oldSelectedFile, selectedFile));
			}
		}
		return selectedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetSelectedFile() {
		return selectedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedFile(File newSelectedFile) {
		File oldSelectedFile = selectedFile;
		selectedFile = newSelectedFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_HANDLER__SELECTED_FILE, oldSelectedFile, selectedFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getHandledFile() {
		File handledFile = basicGetHandledFile();
		return handledFile != null && handledFile.eIsProxy() ? (File)eResolveProxy((InternalEObject)handledFile) : handledFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public File basicGetHandledFile() {
		return Util.FileHandlerGetHandledFile(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.FILE_HANDLER__SELECTED_FILE:
				if (resolve) return getSelectedFile();
				return basicGetSelectedFile();
			case FilePackage.FILE_HANDLER__HANDLED_FILE:
				if (resolve) return getHandledFile();
				return basicGetHandledFile();
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
			case FilePackage.FILE_HANDLER__SELECTED_FILE:
				setSelectedFile((File)newValue);
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
			case FilePackage.FILE_HANDLER__SELECTED_FILE:
				setSelectedFile((File)null);
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
			case FilePackage.FILE_HANDLER__SELECTED_FILE:
				return selectedFile != null;
			case FilePackage.FILE_HANDLER__HANDLED_FILE:
				return basicGetHandledFile() != null;
		}
		return super.eIsSet(featureID);
	}

} //FileHandlerImpl
