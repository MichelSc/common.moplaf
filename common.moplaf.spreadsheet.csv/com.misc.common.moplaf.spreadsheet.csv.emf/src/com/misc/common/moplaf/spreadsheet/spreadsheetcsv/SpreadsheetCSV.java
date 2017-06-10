/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;

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
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getRecordSeparator <em>Record Separator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getQuoteCharacter <em>Quote Character</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV()
 * @model
 * @generated
 */
public interface SpreadsheetCSV extends Spreadsheet {

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.CSVFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.CSVFormat
	 * @see #setFormat(CSVFormat)
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV_Format()
	 * @model
	 * @generated
	 */
	CSVFormat getFormat();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.CSVFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(CSVFormat value);

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
	 * Returns the value of the '<em><b>Escape Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape Character</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Character</em>' attribute.
	 * @see #isSetEscapeCharacter()
	 * @see #unsetEscapeCharacter()
	 * @see #setEscapeCharacter(String)
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV_EscapeCharacter()
	 * @model unsettable="true"
	 * @generated
	 */
	String getEscapeCharacter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getEscapeCharacter <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Character</em>' attribute.
	 * @see #isSetEscapeCharacter()
	 * @see #unsetEscapeCharacter()
	 * @see #getEscapeCharacter()
	 * @generated
	 */
	void setEscapeCharacter(String value);

	/**
	 * Unsets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getEscapeCharacter <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEscapeCharacter()
	 * @see #getEscapeCharacter()
	 * @see #setEscapeCharacter(String)
	 * @generated
	 */
	void unsetEscapeCharacter();

	/**
	 * Returns whether the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getEscapeCharacter <em>Escape Character</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Escape Character</em>' attribute is set.
	 * @see #unsetEscapeCharacter()
	 * @see #getEscapeCharacter()
	 * @see #setEscapeCharacter(String)
	 * @generated
	 */
	boolean isSetEscapeCharacter();

	/**
	 * Returns the value of the '<em><b>Record Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Separator</em>' attribute.
	 * @see #isSetRecordSeparator()
	 * @see #unsetRecordSeparator()
	 * @see #setRecordSeparator(String)
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getSpreadsheetCSV_RecordSeparator()
	 * @model unsettable="true"
	 * @generated
	 */
	String getRecordSeparator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getRecordSeparator <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Separator</em>' attribute.
	 * @see #isSetRecordSeparator()
	 * @see #unsetRecordSeparator()
	 * @see #getRecordSeparator()
	 * @generated
	 */
	void setRecordSeparator(String value);

	/**
	 * Unsets the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getRecordSeparator <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecordSeparator()
	 * @see #getRecordSeparator()
	 * @see #setRecordSeparator(String)
	 * @generated
	 */
	void unsetRecordSeparator();

	/**
	 * Returns whether the value of the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV#getRecordSeparator <em>Record Separator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Record Separator</em>' attribute is set.
	 * @see #unsetRecordSeparator()
	 * @see #getRecordSeparator()
	 * @see #setRecordSeparator(String)
	 * @generated
	 */
	boolean isSetRecordSeparator();

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
