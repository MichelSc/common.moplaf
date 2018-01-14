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
package com.misc.common.moplaf.spreadsheet;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileReader;
import com.misc.common.moplaf.file.FileWriter;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheets <em>Sheets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet()
 * @model abstract="true"
 * @generated
 */
public interface Spreadsheet extends FileReader, FileWriter {
	/**
	 * Returns the value of the '<em><b>Sheets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Sheet}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet_Sheets()
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet
	 * @model opposite="Spreadsheet" containment="true" required="true"
	 * @generated
	 */
	EList<Sheet> getSheets();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.file.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Sheet getSheet(String sheetname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Sheet getSheet(int sheetindex);

} // Spreadsheet
