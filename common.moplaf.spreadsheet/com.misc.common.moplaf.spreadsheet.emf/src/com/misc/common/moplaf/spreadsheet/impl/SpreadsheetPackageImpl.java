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
package com.misc.common.moplaf.spreadsheet.impl;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.spreadsheet.Cell;
import com.misc.common.moplaf.spreadsheet.CellType;
import com.misc.common.moplaf.spreadsheet.Column;
import com.misc.common.moplaf.spreadsheet.Row;
import com.misc.common.moplaf.spreadsheet.Sheet;
import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.common.moplaf.spreadsheet.SpreadsheetFactory;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetPackageImpl extends EPackageImpl implements SpreadsheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetReaderWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cellTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpreadsheetPackageImpl() {
		super(eNS_URI, SpreadsheetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpreadsheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpreadsheetPackage init() {
		if (isInited) return (SpreadsheetPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpreadsheetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpreadsheetPackageImpl theSpreadsheetPackage = registeredSpreadsheetPackage instanceof SpreadsheetPackageImpl ? (SpreadsheetPackageImpl)registeredSpreadsheetPackage : new SpreadsheetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		FilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpreadsheetPackage.createPackageContents();

		// Initialize created meta-data
		theSpreadsheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpreadsheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpreadsheetPackage.eNS_URI, theSpreadsheetPackage);
		return theSpreadsheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpreadsheet() {
		return spreadsheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpreadsheet_Sheets() {
		return (EReference)spreadsheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpreadsheet_Name() {
		return (EAttribute)spreadsheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpreadsheet_Files() {
		return (EReference)spreadsheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__GetSheet__String() {
		return spreadsheetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__GetSheet__int() {
		return spreadsheetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__CreateSheet__int() {
		return spreadsheetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__GetOrCreateSheet__int() {
		return spreadsheetEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__GetOrCreateSheet__String() {
		return spreadsheetEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__AddSheet() {
		return spreadsheetEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__Flush() {
		return spreadsheetEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__ConformSheetIndex() {
		return spreadsheetEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpreadsheet__ConformAllIndices() {
		return spreadsheetEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSheet() {
		return sheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSheet_Rows() {
		return (EReference)sheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSheet_Columns() {
		return (EReference)sheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_SheetName() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_SheetIndex() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSheet_Spreadsheet() {
		return (EReference)sheetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_TopRowsFrozen() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_BottomRowsFrozen() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_LeftColumnsFrozen() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_RightColumnsFrozen() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetColumn__int() {
		return sheetEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetColumn__String() {
		return sheetEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__CreateColumn__int() {
		return sheetEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__CreateColumn__int_String() {
		return sheetEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetOrCreateColumn__int() {
		return sheetEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetOrCreateColumn__String() {
		return sheetEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__AddColumn() {
		return sheetEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetRow__int() {
		return sheetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__CreateRow__int() {
		return sheetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetOrCreateRow__int() {
		return sheetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__AddRow() {
		return sheetEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetCell__Row_Column() {
		return sheetEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__CreateCell__Row_Column() {
		return sheetEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__GetOrCreateCell__Row_Column() {
		return sheetEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__Flush() {
		return sheetEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__ConformColumnIndex() {
		return sheetEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSheet__ConformRowIndex() {
		return sheetEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRow_Cells() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRow_Sheet() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRow_Description() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRow_RowIndex() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRow__GetCell__int() {
		return rowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRow__GetCell__Column() {
		return rowEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRow__GetCell__String() {
		return rowEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRow__LookUp__String() {
		return rowEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Cells() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Sheet() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_Description() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnIndex() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnName() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getColumn__GetCell__int() {
		return columnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getColumn__GetCell__Row() {
		return columnEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getColumn__LookUp__String() {
		return columnEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCell_Row() {
		return (EReference)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCell_Column() {
		return (EReference)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_ValueFormatted() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_CellType() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_DoubleValue() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_StringValue() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_BooleanValueSet() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_DateValue() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpreadsheetReaderWriter() {
		return spreadsheetReaderWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpreadsheetReaderWriter_Spreadsheet() {
		return (EReference)spreadsheetReaderWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_Description() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCellType() {
		return cellTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpreadsheetFactory getSpreadsheetFactory() {
		return (SpreadsheetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		spreadsheetEClass = createEClass(SPREADSHEET);
		createEReference(spreadsheetEClass, SPREADSHEET__SHEETS);
		createEAttribute(spreadsheetEClass, SPREADSHEET__NAME);
		createEReference(spreadsheetEClass, SPREADSHEET__FILES);
		createEOperation(spreadsheetEClass, SPREADSHEET___GET_SHEET__STRING);
		createEOperation(spreadsheetEClass, SPREADSHEET___GET_SHEET__INT);
		createEOperation(spreadsheetEClass, SPREADSHEET___CREATE_SHEET__INT);
		createEOperation(spreadsheetEClass, SPREADSHEET___GET_OR_CREATE_SHEET__INT);
		createEOperation(spreadsheetEClass, SPREADSHEET___GET_OR_CREATE_SHEET__STRING);
		createEOperation(spreadsheetEClass, SPREADSHEET___ADD_SHEET);
		createEOperation(spreadsheetEClass, SPREADSHEET___FLUSH);
		createEOperation(spreadsheetEClass, SPREADSHEET___CONFORM_SHEET_INDEX);
		createEOperation(spreadsheetEClass, SPREADSHEET___CONFORM_ALL_INDICES);

		sheetEClass = createEClass(SHEET);
		createEReference(sheetEClass, SHEET__ROWS);
		createEReference(sheetEClass, SHEET__COLUMNS);
		createEAttribute(sheetEClass, SHEET__SHEET_NAME);
		createEAttribute(sheetEClass, SHEET__SHEET_INDEX);
		createEReference(sheetEClass, SHEET__SPREADSHEET);
		createEAttribute(sheetEClass, SHEET__TOP_ROWS_FROZEN);
		createEAttribute(sheetEClass, SHEET__BOTTOM_ROWS_FROZEN);
		createEAttribute(sheetEClass, SHEET__LEFT_COLUMNS_FROZEN);
		createEAttribute(sheetEClass, SHEET__RIGHT_COLUMNS_FROZEN);
		createEOperation(sheetEClass, SHEET___GET_ROW__INT);
		createEOperation(sheetEClass, SHEET___CREATE_ROW__INT);
		createEOperation(sheetEClass, SHEET___GET_OR_CREATE_ROW__INT);
		createEOperation(sheetEClass, SHEET___ADD_ROW);
		createEOperation(sheetEClass, SHEET___GET_COLUMN__INT);
		createEOperation(sheetEClass, SHEET___GET_COLUMN__STRING);
		createEOperation(sheetEClass, SHEET___CREATE_COLUMN__INT);
		createEOperation(sheetEClass, SHEET___CREATE_COLUMN__INT_STRING);
		createEOperation(sheetEClass, SHEET___GET_OR_CREATE_COLUMN__INT);
		createEOperation(sheetEClass, SHEET___GET_OR_CREATE_COLUMN__STRING);
		createEOperation(sheetEClass, SHEET___ADD_COLUMN);
		createEOperation(sheetEClass, SHEET___GET_CELL__ROW_COLUMN);
		createEOperation(sheetEClass, SHEET___CREATE_CELL__ROW_COLUMN);
		createEOperation(sheetEClass, SHEET___GET_OR_CREATE_CELL__ROW_COLUMN);
		createEOperation(sheetEClass, SHEET___FLUSH);
		createEOperation(sheetEClass, SHEET___CONFORM_COLUMN_INDEX);
		createEOperation(sheetEClass, SHEET___CONFORM_ROW_INDEX);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__CELLS);
		createEReference(rowEClass, ROW__SHEET);
		createEAttribute(rowEClass, ROW__DESCRIPTION);
		createEAttribute(rowEClass, ROW__ROW_INDEX);
		createEOperation(rowEClass, ROW___GET_CELL__INT);
		createEOperation(rowEClass, ROW___GET_CELL__COLUMN);
		createEOperation(rowEClass, ROW___GET_CELL__STRING);
		createEOperation(rowEClass, ROW___LOOK_UP__STRING);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__CELLS);
		createEReference(columnEClass, COLUMN__SHEET);
		createEAttribute(columnEClass, COLUMN__DESCRIPTION);
		createEAttribute(columnEClass, COLUMN__COLUMN_INDEX);
		createEAttribute(columnEClass, COLUMN__COLUMN_NAME);
		createEOperation(columnEClass, COLUMN___GET_CELL__INT);
		createEOperation(columnEClass, COLUMN___GET_CELL__ROW);
		createEOperation(columnEClass, COLUMN___LOOK_UP__STRING);

		cellEClass = createEClass(CELL);
		createEReference(cellEClass, CELL__ROW);
		createEReference(cellEClass, CELL__COLUMN);
		createEAttribute(cellEClass, CELL__DESCRIPTION);
		createEAttribute(cellEClass, CELL__VALUE_FORMATTED);
		createEAttribute(cellEClass, CELL__CELL_TYPE);
		createEAttribute(cellEClass, CELL__DOUBLE_VALUE);
		createEAttribute(cellEClass, CELL__STRING_VALUE);
		createEAttribute(cellEClass, CELL__BOOLEAN_VALUE_SET);
		createEAttribute(cellEClass, CELL__DATE_VALUE);

		spreadsheetReaderWriterEClass = createEClass(SPREADSHEET_READER_WRITER);
		createEReference(spreadsheetReaderWriterEClass, SPREADSHEET_READER_WRITER__SPREADSHEET);

		// Create enums
		cellTypeEEnum = createEEnum(CELL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FilePackage theFilePackage = (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spreadsheetReaderWriterEClass.getESuperTypes().add(theFilePackage.getFileReaderWriter());

		// Initialize classes, features, and operations; add parameters
		initEClass(spreadsheetEClass, Spreadsheet.class, "Spreadsheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpreadsheet_Sheets(), this.getSheet(), this.getSheet_Spreadsheet(), "Sheets", null, 1, -1, Spreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheet_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Spreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheet_Files(), this.getSpreadsheetReaderWriter(), this.getSpreadsheetReaderWriter_Spreadsheet(), "Files", null, 0, -1, Spreadsheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSpreadsheet__GetSheet__String(), this.getSheet(), "getSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sheetname", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpreadsheet__GetSheet__int(), this.getSheet(), "getSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sheetindex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpreadsheet__CreateSheet__int(), this.getSheet(), "createSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpreadsheet__GetOrCreateSheet__int(), this.getSheet(), "getOrCreateSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpreadsheet__GetOrCreateSheet__String(), this.getSheet(), "getOrCreateSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sheetname", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSpreadsheet__AddSheet(), this.getSheet(), "addSheet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSpreadsheet__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSpreadsheet__ConformSheetIndex(), null, "conformSheetIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSpreadsheet__ConformAllIndices(), null, "conformAllIndices", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sheetEClass, Sheet.class, "Sheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSheet_Rows(), this.getRow(), this.getRow_Sheet(), "Rows", null, 0, -1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSheet_Columns(), this.getColumn(), this.getColumn_Sheet(), "Columns", null, 0, -1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheet_SheetName(), ecorePackage.getEString(), "SheetName", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheet_SheetIndex(), ecorePackage.getEInt(), "SheetIndex", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSheet_Spreadsheet(), this.getSpreadsheet(), this.getSpreadsheet_Sheets(), "Spreadsheet", null, 1, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheet_TopRowsFrozen(), ecorePackage.getEInt(), "TopRowsFrozen", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheet_BottomRowsFrozen(), ecorePackage.getEInt(), "BottomRowsFrozen", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheet_LeftColumnsFrozen(), ecorePackage.getEInt(), "LeftColumnsFrozen", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheet_RightColumnsFrozen(), ecorePackage.getEInt(), "RightColumnsFrozen", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSheet__GetRow__int(), this.getRow(), "getRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__CreateRow__int(), this.getRow(), "createRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetOrCreateRow__int(), this.getRow(), "getOrCreateRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSheet__AddRow(), this.getRow(), "addRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetColumn__int(), this.getColumn(), "getColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetColumn__String(), this.getColumn(), "getColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__CreateColumn__int(), this.getColumn(), "createColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__CreateColumn__int_String(), this.getColumn(), "createColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetOrCreateColumn__int(), this.getColumn(), "getOrCreateColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetOrCreateColumn__String(), this.getColumn(), "getOrCreateColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSheet__AddColumn(), this.getColumn(), "addColumn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetCell__Row_Column(), this.getCell(), "getCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColumn(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__CreateCell__Row_Column(), this.getCell(), "createCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColumn(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSheet__GetOrCreateCell__Row_Column(), this.getCell(), "getOrCreateCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColumn(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSheet__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSheet__ConformColumnIndex(), null, "conformColumnIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSheet__ConformRowIndex(), null, "conformRowIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Cells(), this.getCell(), this.getCell_Row(), "Cells", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRow_Sheet(), this.getSheet(), this.getSheet_Rows(), "Sheet", null, 1, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Row.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_RowIndex(), ecorePackage.getEInt(), "RowIndex", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRow__GetCell__int(), this.getCell(), "getCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "columnindex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRow__GetCell__Column(), this.getCell(), "getCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColumn(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRow__GetCell__String(), this.getCell(), "getCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRow__LookUp__String(), this.getCell(), "lookUp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Cells(), this.getCell(), this.getCell_Column(), "Cells", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Sheet(), this.getSheet(), this.getSheet_Columns(), "Sheet", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Column.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnIndex(), ecorePackage.getEInt(), "ColumnIndex", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnName(), ecorePackage.getEString(), "ColumnName", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getColumn__GetCell__int(), this.getCell(), "getCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "rowindex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColumn__GetCell__Row(), this.getCell(), "getCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRow(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColumn__LookUp__String(), this.getCell(), "lookUp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCell_Row(), this.getRow(), this.getRow_Cells(), "Row", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_Column(), this.getColumn(), this.getColumn_Cells(), "Column", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Cell.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_ValueFormatted(), ecorePackage.getEString(), "ValueFormatted", null, 0, 1, Cell.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_CellType(), this.getCellType(), "CellType", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_DoubleValue(), ecorePackage.getEDouble(), "DoubleValue", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_StringValue(), ecorePackage.getEString(), "StringValue", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_BooleanValueSet(), ecorePackage.getEBoolean(), "BooleanValueSet", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_DateValue(), ecorePackage.getEDate(), "DateValue", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spreadsheetReaderWriterEClass, SpreadsheetReaderWriter.class, "SpreadsheetReaderWriter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpreadsheetReaderWriter_Spreadsheet(), this.getSpreadsheet(), this.getSpreadsheet_Files(), "Spreadsheet", null, 1, 1, SpreadsheetReaderWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cellTypeEEnum, CellType.class, "CellType");
		addEEnumLiteral(cellTypeEEnum, CellType.CELL_TYPE_NUMERIC);
		addEEnumLiteral(cellTypeEEnum, CellType.CELL_TYPE_FORMULA);
		addEEnumLiteral(cellTypeEEnum, CellType.CELL_TYPE_STRING);
		addEEnumLiteral(cellTypeEEnum, CellType.CELL_TYPE_DATE);
		addEEnumLiteral(cellTypeEEnum, CellType.CELL_TYPE_BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //SpreadsheetPackageImpl
