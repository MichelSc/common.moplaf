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
import com.misc.common.moplaf.file.FileOutput;
import com.misc.common.moplaf.file.FilePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileOutputImpl#getOutputFile <em>Output File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileOutputImpl extends FileOwnerImpl implements FileOutput {
	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected File outputFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getOutputFile() {
		if (outputFile != null && outputFile.eIsProxy()) {
			InternalEObject oldOutputFile = (InternalEObject)outputFile;
			outputFile = (File)eResolveProxy(oldOutputFile);
			if (outputFile != oldOutputFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FilePackage.FILE_OUTPUT__OUTPUT_FILE, oldOutputFile, outputFile));
			}
		}
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetOutputFile() {
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFile(File newOutputFile) {
		File oldOutputFile = outputFile;
		outputFile = newOutputFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_OUTPUT__OUTPUT_FILE, oldOutputFile, outputFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.FILE_OUTPUT__OUTPUT_FILE:
				if (resolve) return getOutputFile();
				return basicGetOutputFile();
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
			case FilePackage.FILE_OUTPUT__OUTPUT_FILE:
				setOutputFile((File)newValue);
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
			case FilePackage.FILE_OUTPUT__OUTPUT_FILE:
				setOutputFile((File)null);
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
			case FilePackage.FILE_OUTPUT__OUTPUT_FILE:
				return outputFile != null;
		}
		return super.eIsSet(featureID);
	}

} //FileOutputImpl
