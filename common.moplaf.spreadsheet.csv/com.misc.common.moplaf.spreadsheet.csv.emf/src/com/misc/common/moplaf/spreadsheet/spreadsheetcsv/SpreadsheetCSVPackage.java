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
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv;

import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetCSVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spreadsheetcsv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/spreadsheet/csv/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spshcsv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetCSVPackage eINSTANCE = com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl <em>Spreadsheet CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVPackageImpl#getSpreadsheetCSV()
	 * @generated
	 */
	int SPREADSHEET_CSV = 0;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__SHEETS = SpreadsheetPackage.SPREADSHEET__SHEETS;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__FILE_PATH = SpreadsheetPackage.SPREADSHEET__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__NAME = SpreadsheetPackage.SPREADSHEET__NAME;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__FORMAT = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__DELIMITER = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Escape Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__ESCAPE_CHARACTER = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Record Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__RECORD_SEPARATOR = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__QUOTE_CHARACTER = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Spreadsheet CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV_FEATURE_COUNT = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___GET_SHEET__STRING = SpreadsheetPackage.SPREADSHEET___GET_SHEET__STRING;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___GET_SHEET__INT = SpreadsheetPackage.SPREADSHEET___GET_SHEET__INT;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___READ_FILE = SpreadsheetPackage.SPREADSHEET___READ_FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___WRITE_FILE = SpreadsheetPackage.SPREADSHEET___WRITE_FILE;

	/**
	 * The number of operations of the '<em>Spreadsheet CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV_OPERATION_COUNT = SpreadsheetPackage.SPREADSHEET_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV <em>Format CSV</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVPackageImpl#getFormatCSV()
	 * @generated
	 */
	int FORMAT_CSV = 1;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV <em>Spreadsheet CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet CSV</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV
	 * @generated
	 */
	EClass getSpreadsheetCSV();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getFormat()
	 * @see #getSpreadsheetCSV()
	 * @generated
	 */
	EAttribute getSpreadsheetCSV_Format();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getDelimiter()
	 * @see #getSpreadsheetCSV()
	 * @generated
	 */
	EAttribute getSpreadsheetCSV_Delimiter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getEscapeCharacter <em>Escape Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape Character</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getEscapeCharacter()
	 * @see #getSpreadsheetCSV()
	 * @generated
	 */
	EAttribute getSpreadsheetCSV_EscapeCharacter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getRecordSeparator <em>Record Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Separator</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getRecordSeparator()
	 * @see #getSpreadsheetCSV()
	 * @generated
	 */
	EAttribute getSpreadsheetCSV_RecordSeparator();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter <em>Quote Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Character</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter()
	 * @see #getSpreadsheetCSV()
	 * @generated
	 */
	EAttribute getSpreadsheetCSV_QuoteCharacter();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV <em>Format CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format CSV</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV
	 * @generated
	 */
	EEnum getFormatCSV();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpreadsheetCSVFactory getSpreadsheetCSVFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl <em>Spreadsheet CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVImpl
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVPackageImpl#getSpreadsheetCSV()
		 * @generated
		 */
		EClass SPREADSHEET_CSV = eINSTANCE.getSpreadsheetCSV();
		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_CSV__FORMAT = eINSTANCE.getSpreadsheetCSV_Format();
		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_CSV__DELIMITER = eINSTANCE.getSpreadsheetCSV_Delimiter();
		/**
		 * The meta object literal for the '<em><b>Escape Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_CSV__ESCAPE_CHARACTER = eINSTANCE.getSpreadsheetCSV_EscapeCharacter();
		/**
		 * The meta object literal for the '<em><b>Record Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_CSV__RECORD_SEPARATOR = eINSTANCE.getSpreadsheetCSV_RecordSeparator();
		/**
		 * The meta object literal for the '<em><b>Quote Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_CSV__QUOTE_CHARACTER = eINSTANCE.getSpreadsheetCSV_QuoteCharacter();
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV <em>Format CSV</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVPackageImpl#getFormatCSV()
		 * @generated
		 */
		EEnum FORMAT_CSV = eINSTANCE.getFormatCSV();

	}

} //SpreadsheetCSVPackage
