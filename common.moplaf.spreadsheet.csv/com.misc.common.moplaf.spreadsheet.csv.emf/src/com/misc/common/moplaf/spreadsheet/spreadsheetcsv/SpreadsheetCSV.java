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

import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter <em>Quote Character</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV()
 * @model
 * @generated
 */
public interface SpreadsheetCSV extends SpreadsheetReaderWriter {

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV
	 * @see #setFormat(FormatCSV)
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV_Format()
	 * @model
	 * @generated
	 */
	FormatCSV getFormat();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatCSV value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #isSetDelimiter()
	 * @see #unsetDelimiter()
	 * @see #setDelimiter(String)
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV_Delimiter()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #isSetDelimiter()
	 * @see #unsetDelimiter()
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Unsets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelimiter()
	 * @see #getDelimiter()
	 * @see #setDelimiter(String)
	 * @generated
	 */
	void unsetDelimiter();

	/**
	 * Returns whether the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getDelimiter <em>Delimiter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delimiter</em>' attribute is set.
	 * @see #unsetDelimiter()
	 * @see #getDelimiter()
	 * @see #setDelimiter(String)
	 * @generated
	 */
	boolean isSetDelimiter();

	/**
	 * Returns the value of the '<em><b>Quote Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Character</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Character</em>' attribute.
	 * @see #isSetQuoteCharacter()
	 * @see #unsetQuoteCharacter()
	 * @see #setQuoteCharacter(String)
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV_QuoteCharacter()
	 * @model unsettable="true"
	 * @generated
	 */
	String getQuoteCharacter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter <em>Quote Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Character</em>' attribute.
	 * @see #isSetQuoteCharacter()
	 * @see #unsetQuoteCharacter()
	 * @see #getQuoteCharacter()
	 * @generated
	 */
	void setQuoteCharacter(String value);

	/**
	 * Unsets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter <em>Quote Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuoteCharacter()
	 * @see #getQuoteCharacter()
	 * @see #setQuoteCharacter(String)
	 * @generated
	 */
	void unsetQuoteCharacter();

	/**
	 * Returns whether the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter <em>Quote Character</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quote Character</em>' attribute is set.
	 * @see #unsetQuoteCharacter()
	 * @see #getQuoteCharacter()
	 * @see #setQuoteCharacter(String)
	 * @generated
	 */
	boolean isSetQuoteCharacter();
} // SpreadsheetCSV
