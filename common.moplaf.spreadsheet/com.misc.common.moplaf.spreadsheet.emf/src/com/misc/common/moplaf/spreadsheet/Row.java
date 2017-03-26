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
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Row#getCell <em>Cell</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Row#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Row#getRowIndex <em>Row Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Cell}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Cell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getRow_Cell()
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getRow
	 * @model opposite="Row" containment="true"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Sheet#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' container reference.
	 * @see #setSheet(Sheet)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getRow_Sheet()
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getRow
	 * @model opposite="Row" required="true" transient="false"
	 * @generated
	 */
	Sheet getSheet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Row#getSheet <em>Sheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' container reference.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(Sheet value);

	/**
	 * Returns the value of the '<em><b>Row Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Index</em>' attribute.
	 * @see #setRowIndex(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getRow_RowIndex()
	 * @model
	 * @generated
	 */
	int getRowIndex();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Row#getRowIndex <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Index</em>' attribute.
	 * @see #getRowIndex()
	 * @generated
	 */
	void setRowIndex(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCell(int columnindex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCell(Column column);

} // Row
