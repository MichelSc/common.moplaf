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
 * A representation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetIndex <em>Sheet Index</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getTopRowsFrozen <em>Top Rows Frozen</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getBottomRowsFrozen <em>Bottom Rows Frozen</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getLeftColumnsFrozen <em>Left Columns Frozen</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Sheet#getRightColumnsFrozen <em>Right Columns Frozen</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet()
 * @model
 * @generated
 */
public interface Sheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Row}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Row#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_Rows()
	 * @see com.misc.common.moplaf.spreadsheet.Row#getSheet
	 * @model opposite="Sheet" containment="true"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Column}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Column#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_Columns()
	 * @see com.misc.common.moplaf.spreadsheet.Column#getSheet
	 * @model opposite="Sheet" containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

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
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet</em>' container reference.
	 * @see #setSpreadsheet(Spreadsheet)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_Spreadsheet()
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheets
	 * @model opposite="Sheets" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Top Rows Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Rows Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Rows Frozen</em>' attribute.
	 * @see #setTopRowsFrozen(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_TopRowsFrozen()
	 * @model
	 * @generated
	 */
	int getTopRowsFrozen();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getTopRowsFrozen <em>Top Rows Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Rows Frozen</em>' attribute.
	 * @see #getTopRowsFrozen()
	 * @generated
	 */
	void setTopRowsFrozen(int value);

	/**
	 * Returns the value of the '<em><b>Bottom Rows Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Rows Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Rows Frozen</em>' attribute.
	 * @see #setBottomRowsFrozen(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_BottomRowsFrozen()
	 * @model
	 * @generated
	 */
	int getBottomRowsFrozen();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getBottomRowsFrozen <em>Bottom Rows Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Rows Frozen</em>' attribute.
	 * @see #getBottomRowsFrozen()
	 * @generated
	 */
	void setBottomRowsFrozen(int value);

	/**
	 * Returns the value of the '<em><b>Left Columns Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Columns Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Columns Frozen</em>' attribute.
	 * @see #setLeftColumnsFrozen(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_LeftColumnsFrozen()
	 * @model
	 * @generated
	 */
	int getLeftColumnsFrozen();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getLeftColumnsFrozen <em>Left Columns Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Columns Frozen</em>' attribute.
	 * @see #getLeftColumnsFrozen()
	 * @generated
	 */
	void setLeftColumnsFrozen(int value);

	/**
	 * Returns the value of the '<em><b>Right Columns Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Columns Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Columns Frozen</em>' attribute.
	 * @see #setRightColumnsFrozen(int)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSheet_RightColumnsFrozen()
	 * @model
	 * @generated
	 */
	int getRightColumnsFrozen();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getRightColumnsFrozen <em>Right Columns Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Columns Frozen</em>' attribute.
	 * @see #getRightColumnsFrozen()
	 * @generated
	 */
	void setRightColumnsFrozen(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Column getColumn(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Column createColumn(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Column getOrCreateColumn(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Column addColumn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Row getRow(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Row createRow(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Row getOrCreateRow(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Row addRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCell(Row row, Column column);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell createCell(Row row, Column column);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getOrCreateCell(Row row, Column column);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void conformColumnIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void conformRowIndex();

} // Sheet
