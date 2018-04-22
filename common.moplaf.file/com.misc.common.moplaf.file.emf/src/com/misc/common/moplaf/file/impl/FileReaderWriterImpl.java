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

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.FileReaderWriter;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reader Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getReadFeedback <em>Read Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl#getWriteFeedback <em>Write Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileReaderWriterImpl extends FileHandlerImpl implements FileReaderWriter {
	/**
	 * The default value of the '{@link #getReadFeedback() <em>Read Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback READ_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWriteFeedback() <em>Write Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback WRITE_FEEDBACK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileReaderWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_READER_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getReadFeedback() {
		return this.getReadFeedback(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getWriteFeedback() {
		return this.getWriteFeedback(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getReadFeedback(File file) {
		if ( file == null ) {
			return new EnabledFeedback(false, "No file to read from");
		}
		return this.getReadFeedbackImpl(file);
	}

	protected EnabledFeedback getReadFeedbackImpl(File file) {
		return new EnabledFeedback(false, "Read not supported");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getWriteFeedback(File file) {
		if ( file == null ) {
			return new EnabledFeedback(false, "No file to write to");
		}
		return this.getWriteFeedbackImpl(file);
	}

	protected EnabledFeedback getWriteFeedbackImpl(File file) {
		return new EnabledFeedback(false, "Write not supported");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readFile() {
		this.readFile(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeFile() {
		this.writeFile(this.getHandledFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void readFile(File file) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeFile(File file) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.FILE_READER_WRITER__READ_FEEDBACK:
				return getReadFeedback();
			case FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK:
				return getWriteFeedback();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FilePackage.FILE_READER_WRITER__READ_FEEDBACK:
				return READ_FEEDBACK_EDEFAULT == null ? getReadFeedback() != null : !READ_FEEDBACK_EDEFAULT.equals(getReadFeedback());
			case FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK:
				return WRITE_FEEDBACK_EDEFAULT == null ? getWriteFeedback() != null : !WRITE_FEEDBACK_EDEFAULT.equals(getWriteFeedback());
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
			case FilePackage.FILE_READER_WRITER___GET_READ_FEEDBACK__FILE:
				return getReadFeedback((File)arguments.get(0));
			case FilePackage.FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE:
				return getWriteFeedback((File)arguments.get(0));
			case FilePackage.FILE_READER_WRITER___READ_FILE:
				readFile();
				return null;
			case FilePackage.FILE_READER_WRITER___WRITE_FILE:
				writeFile();
				return null;
			case FilePackage.FILE_READER_WRITER___READ_FILE__FILE:
				readFile((File)arguments.get(0));
				return null;
			case FilePackage.FILE_READER_WRITER___WRITE_FILE__FILE:
				writeFile((File)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FileReaderWriterImpl
