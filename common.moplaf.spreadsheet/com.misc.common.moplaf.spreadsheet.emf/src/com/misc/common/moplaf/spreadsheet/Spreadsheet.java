/**
 */
package com.misc.common.moplaf.spreadsheet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet()
 * @model abstract="true"
 * @generated
 */
public interface Spreadsheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Sheet}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet <em>Spreadsheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' containment reference list.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet_Sheet()
	 * @see com.misc.common.moplaf.spreadsheet.Sheet#getSpreadsheet
	 * @model opposite="Spreadsheet" containment="true"
	 * @generated
	 */
	EList<Sheet> getSheet();

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet_FilePath()
	 * @model default=""
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getSpreadsheet_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Spreadsheet#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Sheet getSheet(String sheetname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Sheet getSheet(int sheetindex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeFile();

} // Spreadsheet
