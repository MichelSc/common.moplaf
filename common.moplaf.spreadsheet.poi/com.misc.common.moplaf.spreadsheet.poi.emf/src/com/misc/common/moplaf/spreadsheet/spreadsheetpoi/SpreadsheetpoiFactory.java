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
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetpoiPackage
 * @generated
 */
public interface SpreadsheetpoiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetpoiFactory eINSTANCE = com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetpoiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spreadsheet POI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spreadsheet POI</em>'.
	 * @generated
	 */
	SpreadsheetPOI createSpreadsheetPOI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpreadsheetpoiPackage getSpreadsheetpoiPackage();

} //SpreadsheetpoiFactory
