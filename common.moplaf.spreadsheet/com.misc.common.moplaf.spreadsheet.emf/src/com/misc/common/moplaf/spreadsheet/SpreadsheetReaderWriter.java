/**
 */
package com.misc.common.moplaf.spreadsheet;

import com.misc.common.moplaf.file.FileReaderWriter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reader Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter#getSpreadsheet <em>Spreadsheet</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheetReaderWriter()
 * @model abstract="true"
 * @generated
 */
public interface SpreadsheetReaderWriter extends FileReaderWriter {
	/**
	 * Returns the value of the '<em><b>Spreadsheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet</em>' container reference.
	 * @see #setSpreadsheet(Spreadsheet)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheetReaderWriter_Spreadsheet()
	 * @see com.misc.common.moplaf.spreadsheet.Spreadsheet#getFiles
	 * @model opposite="Files" transient="false"
	 * @generated
	 */
	Spreadsheet getSpreadsheet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter#getSpreadsheet <em>Spreadsheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet</em>' container reference.
	 * @see #getSpreadsheet()
	 * @generated
	 */
	void setSpreadsheet(Spreadsheet value);

} // SpreadsheetReaderWriter
