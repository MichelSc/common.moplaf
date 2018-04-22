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
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getCells <em>Cells</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Column#getColumnIndex <em>Column Index</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Cell}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Cell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn_Cells()
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getColumn
	 * @model opposite="Column"
	 * @generated
	 */
	EList<Cell> getCells();

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Sheet#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' container reference.
	 * @see #setSheet(Sheet)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn_Sheet()
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getColumns
	 * @model opposite="Columns" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getColumn_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell lookUp(String value);

} // Column
