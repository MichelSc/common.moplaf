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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.FileOutput#getOutputFile <em>Output File</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFileOutput()
 * @model abstract="true"
 * @generated
 */
public interface FileOutput extends FileOwner {
	/**
	 * Returns the value of the '<em><b>Output File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File</em>' reference.
	 * @see #setOutputFile(File)
	 * @see com.misc.common.moplaf.file.FilePackage#getFileOutput_OutputFile()
	 * @model
	 * @generated
	 */
	File getOutputFile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.FileOutput#getOutputFile <em>Output File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File</em>' reference.
	 * @see #getOutputFile()
	 * @generated
	 */
	void setOutputFile(File value);

} // FileOutput
