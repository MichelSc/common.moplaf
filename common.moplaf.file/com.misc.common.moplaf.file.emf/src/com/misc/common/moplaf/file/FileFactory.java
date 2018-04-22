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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.file.FilePackage
 * @generated
 */
public interface FileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileFactory eINSTANCE = com.misc.common.moplaf.file.impl.FileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local</em>'.
	 * @generated
	 */
	FileLocal createFileLocal();

	/**
	 * Returns a new object of class '<em>Remote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote</em>'.
	 * @generated
	 */
	FileRemote createFileRemote();

	/**
	 * Returns a new object of class '<em>In Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Memory</em>'.
	 * @generated
	 */
	FileInMemory createFileInMemory();

	/**
	 * Returns a new object of class '<em>Files</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Files</em>'.
	 * @generated
	 */
	Files createFiles();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilePackage getFilePackage();

} //FileFactory
