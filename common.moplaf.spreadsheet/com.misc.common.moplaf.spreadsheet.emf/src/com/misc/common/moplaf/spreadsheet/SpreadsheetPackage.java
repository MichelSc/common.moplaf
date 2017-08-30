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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spreadsheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/spreadsheet/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spsh";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetPackage eINSTANCE = com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl <em>Spreadsheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getSpreadsheet()
	 * @generated
	 */
	int SPREADSHEET = 0;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET__SHEETS = 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET__FILE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Spreadsheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET___GET_SHEET__STRING = 0;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET___GET_SHEET__INT = 1;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET___READ_FILE = 2;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET___WRITE_FILE = 3;

	/**
	 * The number of operations of the '<em>Spreadsheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.impl.SheetImpl
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__ROWS = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__SHEET_NAME = 2;

	/**
	 * The feature id for the '<em><b>Sheet Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__SHEET_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Spreadsheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__SPREADSHEET = 4;

	/**
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET___GET_COLUMN__INT = 0;

	/**
	 * The operation id for the '<em>Get Or Create Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET___GET_OR_CREATE_COLUMN__INT = 1;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET___GET_ROW__INT = 2;

	/**
	 * The number of operations of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.impl.RowImpl
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 2;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Row Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ROW_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__FROZEN = 4;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_CELL__INT = 0;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_CELL__COLUMN = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.impl.ColumnImpl
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FROZEN = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN___GET_CELL__INT = 0;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN___GET_CELL__ROW = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.impl.CellImpl
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ROW = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Value Formatted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__VALUE_FORMATTED = 3;

	/**
	 * The feature id for the '<em><b>Cell Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELL_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DOUBLE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__STRING_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__BOOLEAN_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DATE_VALUE = 8;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.CellType <em>Cell Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.CellType
	 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getCellType()
	 * @generated
	 */
	int CELL_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet
	 * @generated
	 */
	EClass getSpreadsheet();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheets</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheets()
	 * @see #getSpreadsheet()
	 * @generated
	 */
	EReference getSpreadsheet_Sheets();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getFilePath()
	 * @see #getSpreadsheet()
	 * @generated
	 */
	EAttribute getSpreadsheet_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getName()
	 * @see #getSpreadsheet()
	 * @generated
	 */
	EAttribute getSpreadsheet_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet(java.lang.String) <em>Get Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sheet</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet(java.lang.String)
	 * @generated
	 */
	EOperation getSpreadsheet__GetSheet__String();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet(int) <em>Get Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sheet</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet(int)
	 * @generated
	 */
	EOperation getSpreadsheet__GetSheet__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#readFile() <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#readFile()
	 * @generated
	 */
	EOperation getSpreadsheet__ReadFile();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#writeFile() <em>Write File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write File</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#writeFile()
	 * @generated
	 */
	EOperation getSpreadsheet__WriteFile();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet
	 * @generated
	 */
	EClass getSheet();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.spreadsheet.Sheet#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getRows()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.spreadsheet.Sheet#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getColumns()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Columns();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetName <em>Sheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Name</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getSheetName()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_SheetName();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSheetIndex <em>Sheet Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Index</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getSheetIndex()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_SheetIndex();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Spreadsheet</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Spreadsheet();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getColumn(int) <em>Get Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Column</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getColumn(int)
	 * @generated
	 */
	EOperation getSheet__GetColumn__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getOrCreateColumn(int) <em>Get Or Create Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Column</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getOrCreateColumn(int)
	 * @generated
	 */
	EOperation getSheet__GetOrCreateColumn__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Sheet#getRow(int) <em>Get Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Row</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getRow(int)
	 * @generated
	 */
	EOperation getSheet__GetRow__int();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.spreadsheet.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.spreadsheet.Row#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sheet</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Row#getSheet()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Row#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Row#getDescription()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Row#getRowIndex <em>Row Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Index</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Row#getRowIndex()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_RowIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Row#isFrozen <em>Frozen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frozen</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Row#isFrozen()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Frozen();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Row#getCell(int) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Row#getCell(int)
	 * @generated
	 */
	EOperation getRow__GetCell__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Row#getCell(com.misc.common.moplaf.spreadsheet.Column) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Row#getCell(com.misc.common.moplaf.spreadsheet.Column)
	 * @generated
	 */
	EOperation getRow__GetCell__Column();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.spreadsheet.Column#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Column#getCells()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Cells();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.spreadsheet.Column#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sheet</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Column#getSheet()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Column#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Column#getDescription()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Column#getColumnIndex <em>Column Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Index</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Column#getColumnIndex()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Column#isFrozen <em>Frozen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frozen</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Column#isFrozen()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Frozen();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Column#getCell(int) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Column#getCell(int)
	 * @generated
	 */
	EOperation getColumn__GetCell__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.spreadsheet.Column#getCell(com.misc.common.moplaf.spreadsheet.Row) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see com.misc.common.moplaf.spreadsheet.Column#getCell(com.misc.common.moplaf.spreadsheet.Row)
	 * @generated
	 */
	EOperation getColumn__GetCell__Row();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.spreadsheet.Cell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getRow()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Row();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.spreadsheet.Cell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getColumn()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Column();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#getValueFormatted <em>Value Formatted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Formatted</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getValueFormatted()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ValueFormatted();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#getCellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Type</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getCellType()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_CellType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getDoubleValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_DoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getStringValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#isBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#isBooleanValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getDateValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_DateValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.Cell#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.Cell#getDescription()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Description();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.spreadsheet.CellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cell Type</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.CellType
	 * @generated
	 */
	EEnum getCellType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpreadsheetFactory getSpreadsheetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl <em>Spreadsheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetImpl
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getSpreadsheet()
		 * @generated
		 */
		EClass SPREADSHEET = eINSTANCE.getSpreadsheet();

		/**
		 * The meta object literal for the '<em><b>Sheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET__SHEETS = eINSTANCE.getSpreadsheet_Sheets();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET__FILE_PATH = eINSTANCE.getSpreadsheet_FilePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET__NAME = eINSTANCE.getSpreadsheet_Name();

		/**
		 * The meta object literal for the '<em><b>Get Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPREADSHEET___GET_SHEET__STRING = eINSTANCE.getSpreadsheet__GetSheet__String();

		/**
		 * The meta object literal for the '<em><b>Get Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPREADSHEET___GET_SHEET__INT = eINSTANCE.getSpreadsheet__GetSheet__int();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPREADSHEET___READ_FILE = eINSTANCE.getSpreadsheet__ReadFile();

		/**
		 * The meta object literal for the '<em><b>Write File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPREADSHEET___WRITE_FILE = eINSTANCE.getSpreadsheet__WriteFile();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.impl.SheetImpl <em>Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.impl.SheetImpl
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getSheet()
		 * @generated
		 */
		EClass SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__ROWS = eINSTANCE.getSheet_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__COLUMNS = eINSTANCE.getSheet_Columns();

		/**
		 * The meta object literal for the '<em><b>Sheet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__SHEET_NAME = eINSTANCE.getSheet_SheetName();

		/**
		 * The meta object literal for the '<em><b>Sheet Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__SHEET_INDEX = eINSTANCE.getSheet_SheetIndex();

		/**
		 * The meta object literal for the '<em><b>Spreadsheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__SPREADSHEET = eINSTANCE.getSheet_Spreadsheet();

		/**
		 * The meta object literal for the '<em><b>Get Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHEET___GET_COLUMN__INT = eINSTANCE.getSheet__GetColumn__int();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHEET___GET_OR_CREATE_COLUMN__INT = eINSTANCE.getSheet__GetOrCreateColumn__int();

		/**
		 * The meta object literal for the '<em><b>Get Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHEET___GET_ROW__INT = eINSTANCE.getSheet__GetRow__int();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.impl.RowImpl
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SHEET = eINSTANCE.getRow_Sheet();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__DESCRIPTION = eINSTANCE.getRow_Description();

		/**
		 * The meta object literal for the '<em><b>Row Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__ROW_INDEX = eINSTANCE.getRow_RowIndex();

		/**
		 * The meta object literal for the '<em><b>Frozen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__FROZEN = eINSTANCE.getRow_Frozen();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_CELL__INT = eINSTANCE.getRow__GetCell__int();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_CELL__COLUMN = eINSTANCE.getRow__GetCell__Column();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.impl.ColumnImpl
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CELLS = eINSTANCE.getColumn_Cells();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__SHEET = eINSTANCE.getColumn_Sheet();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DESCRIPTION = eINSTANCE.getColumn_Description();

		/**
		 * The meta object literal for the '<em><b>Column Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_INDEX = eINSTANCE.getColumn_ColumnIndex();

		/**
		 * The meta object literal for the '<em><b>Frozen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__FROZEN = eINSTANCE.getColumn_Frozen();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN___GET_CELL__INT = eINSTANCE.getColumn__GetCell__int();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN___GET_CELL__ROW = eINSTANCE.getColumn__GetCell__Row();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.impl.CellImpl
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__ROW = eINSTANCE.getCell_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__COLUMN = eINSTANCE.getCell_Column();

		/**
		 * The meta object literal for the '<em><b>Value Formatted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__VALUE_FORMATTED = eINSTANCE.getCell_ValueFormatted();

		/**
		 * The meta object literal for the '<em><b>Cell Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CELL_TYPE = eINSTANCE.getCell_CellType();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DOUBLE_VALUE = eINSTANCE.getCell_DoubleValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__STRING_VALUE = eINSTANCE.getCell_StringValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__BOOLEAN_VALUE = eINSTANCE.getCell_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DATE_VALUE = eINSTANCE.getCell_DateValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DESCRIPTION = eINSTANCE.getCell_Description();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.CellType <em>Cell Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.CellType
		 * @see com.misc.common.moplaf.spreadsheet.impl.SpreadsheetPackageImpl#getCellType()
		 * @generated
		 */
		EEnum CELL_TYPE = eINSTANCE.getCellType();

	}

} //SpreadsheetPackage
