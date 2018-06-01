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
package com.misc.common.moplaf.file;

import com.misc.common.moplaf.common.EnabledFeedback;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reader Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getReadFeedback <em>Read Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getWriteFeedback <em>Write Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getCloseFeedback <em>Close Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#isOpen <em>Open</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter()
 * @model abstract="true"
 * @generated
 */
public interface FileReaderWriter extends FileHandler {
	/**
	 * Returns the value of the '<em><b>Read Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_ReadFeedback()
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getReadFeedback();

	/**
	 * Returns the value of the '<em><b>Write Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_WriteFeedback()
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getWriteFeedback();

	/**
	 * Returns the value of the '<em><b>Close Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_CloseFeedback()
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getCloseFeedback();

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(boolean)
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_Open()
	 * @model transient="true"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.FileReaderWriter#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback getReadFeedback(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback getWriteFeedback(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readFile(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeFile(File file);

} // FileReaderWriter
