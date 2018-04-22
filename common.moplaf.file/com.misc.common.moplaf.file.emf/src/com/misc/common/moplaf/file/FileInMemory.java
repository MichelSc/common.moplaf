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
 * A representation of the model object '<em><b>In Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.FileInMemory#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFileInMemory()
 * @model
 * @generated
 */
public interface FileInMemory extends File {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see com.misc.common.moplaf.file.FilePackage#getFileInMemory_Content()
	 * @model default=""
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.FileInMemory#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // FileInMemory
