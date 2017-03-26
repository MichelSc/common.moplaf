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
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getCell <em>Cell</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getColumnIndex <em>Column Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Cell}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Cell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn_Cell()
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getColumn
	 * @model opposite="Column"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Sheet#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' container reference.
	 * @see #setSheet(Sheet)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn_Sheet()
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getColumn
	 * @model opposite="Column" required="true" transient="false"
	 * @generated
	 */
	Sheet getSheet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Column#getSheet <em>Sheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' container reference.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(Sheet value);

	/**
	 * Returns the value of the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Index</em>' attribute.
	 * @see #setColumnIndex(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn_ColumnIndex()
	 * @model
	 * @generated
	 */
	int getColumnIndex();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Column#getColumnIndex <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Index</em>' attribute.
	 * @see #getColumnIndex()
	 * @generated
	 */
	void setColumnIndex(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCell(int rowindex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCell(Row row);

} // Column
