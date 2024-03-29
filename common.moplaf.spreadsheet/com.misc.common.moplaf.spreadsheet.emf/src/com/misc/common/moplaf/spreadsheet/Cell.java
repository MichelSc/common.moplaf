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

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getRow <em>Row</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getColumn <em>Column</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getValueFormatted <em>Value Formatted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getCellType <em>Cell Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getStringValue <em>String Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#isBooleanValueSet <em>Boolean Value Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.spreadsheet.Cell#getDateValue <em>Date Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(Row)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_Row()
	 * @see com.misc.common.moplaf.spreadsheet.Row#getCells
	 * @model opposite="Cells" required="true" transient="false"
	 * @generated
	 */
	Row getRow();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(Row value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.spreadsheet.Column#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_Column()
	 * @see com.misc.common.moplaf.spreadsheet.Column#getCells
	 * @model opposite="Cells" required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Value Formatted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Formatted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Formatted</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_ValueFormatted()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getValueFormatted();

	/**
	 * Returns the value of the '<em><b>Cell Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.spreadsheet.CellType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Type</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.CellType
	 * @see #setCellType(CellType)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_CellType()
	 * @model
	 * @generated
	 */
	CellType getCellType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#getCellType <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Type</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.CellType
	 * @see #getCellType()
	 * @generated
	 */
	void setCellType(CellType value);

	/**
	 * Returns the value of the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Value</em>' attribute.
	 * @see #setDoubleValue(double)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_DoubleValue()
	 * @model
	 * @generated
	 */
	double getDoubleValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#getDoubleValue <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Value</em>' attribute.
	 * @see #getDoubleValue()
	 * @generated
	 */
	void setDoubleValue(double value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Boolean Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value Set</em>' attribute.
	 * @see #setBooleanValueSet(boolean)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_BooleanValueSet()
	 * @model
	 * @generated
	 */
	boolean isBooleanValueSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#isBooleanValueSet <em>Boolean Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value Set</em>' attribute.
	 * @see #isBooleanValueSet()
	 * @generated
	 */
	void setBooleanValueSet(boolean value);

	/**
	 * Returns the value of the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Value</em>' attribute.
	 * @see #setDateValue(Date)
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_DateValue()
	 * @model
	 * @generated
	 */
	Date getDateValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.spreadsheet.Cell#getDateValue <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Value</em>' attribute.
	 * @see #getDateValue()
	 * @generated
	 */
	void setDateValue(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCell_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // Cell
