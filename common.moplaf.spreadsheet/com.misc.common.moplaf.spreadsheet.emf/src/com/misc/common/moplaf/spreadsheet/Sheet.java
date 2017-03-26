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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getRow <em>Row</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getColumn <em>Column</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetIndex <em>Sheet Index</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet <em>Spreadsheet</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet()
 * @model
 * @generated
 */
public interface Sheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Row}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Row#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_Row()
	 * @see com.misc.common.moplaf.spreadsheet.Row#getSheet
	 * @model opposite="Sheet" containment="true"
	 * @generated
	 */
	EList<Row> getRow();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Column}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Column#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_Column()
	 * @see com.misc.common.moplaf.spreadsheet.Column#getSheet
	 * @model opposite="Sheet" containment="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute.
	 * @see #setSheetName(String)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_SheetName()
	 * @model
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetName <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Name</em>' attribute.
	 * @see #getSheetName()
	 * @generated
	 */
	void setSheetName(String value);

	/**
	 * Returns the value of the '<em><b>Sheet Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Index</em>' attribute.
	 * @see #setSheetIndex(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_SheetIndex()
	 * @model
	 * @generated
	 */
	int getSheetIndex();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetIndex <em>Sheet Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Index</em>' attribute.
	 * @see #getSheetIndex()
	 * @generated
	 */
	void setSheetIndex(int value);

	/**
	 * Returns the value of the '<em><b>Spreadsheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet</em>' container reference.
	 * @see #setSpreadsheet(Spreadsheet)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_Spreadsheet()
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet
	 * @model opposite="Sheet" transient="false"
	 * @generated
	 */
	Spreadsheet getSpreadsheet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet <em>Spreadsheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet</em>' container reference.
	 * @see #getSpreadsheet()
	 * @generated
	 */
	void setSpreadsheet(Spreadsheet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Column getColumn(int columnindex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Row getRow(int rowindex);

} // Sheet
