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
 * A representation of the model object '<em><b>Byte File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.ByteFile#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getByteFile()
 * @model abstract="true"
 * @generated
 */
public interface ByteFile extends File {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"UTF-8"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.file.FileEncoding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see com.misc.common.moplaf.file.FileEncoding
	 * @see #setEncoding(FileEncoding)
	 * @see com.misc.common.moplaf.file.FilePackage#getByteFile_Encoding()
	 * @model default="UTF-8"
	 * @generated
	 */
	FileEncoding getEncoding();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.ByteFile#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see com.misc.common.moplaf.file.FileEncoding
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(FileEncoding value);

} // ByteFile
