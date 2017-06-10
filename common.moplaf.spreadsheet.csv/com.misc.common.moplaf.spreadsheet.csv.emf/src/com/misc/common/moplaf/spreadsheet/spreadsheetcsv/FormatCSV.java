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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Format CSV</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#getFormatCSV()
 * @model
 * @generated
 */
public enum FormatCSV implements Enumerator {
	/**
	 * The '<em><b>Enum Literal Csv Format DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CSV_FORMAT_DEFAULT(0, "EnumLiteralCsvFormat_DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>Enum Literal Csv Format EXCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_EXCEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CSV_FORMAT_EXCEL(1, "EnumLiteralCsvFormat_EXCEL", "EXCEL"),

	/**
	 * The '<em><b>Enum Literal Csv Format MYSQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_MYSQL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CSV_FORMAT_MYSQL(2, "EnumLiteralCsvFormat_MYSQL", "MYSQL"),

	/**
	 * The '<em><b>Enum Literal Csv Format RFC4180</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_RFC4180_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CSV_FORMAT_RFC4180(3, "EnumLiteralCsvFormat_RFC4180", "RFC4180"),

	/**
	 * The '<em><b>Enum Literal Csv Format TDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_TDF_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CSV_FORMAT_TDF(4, "EnumLiteralCsvFormat_TDF", "TDF");

	/**
	 * The '<em><b>Enum Literal Csv Format DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Csv Format DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_DEFAULT
	 * @model name="EnumLiteralCsvFormat_DEFAULT" literal="DEFAULT"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CSV_FORMAT_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Enum Literal Csv Format EXCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Csv Format EXCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_EXCEL
	 * @model name="EnumLiteralCsvFormat_EXCEL" literal="EXCEL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CSV_FORMAT_EXCEL_VALUE = 1;

	/**
	 * The '<em><b>Enum Literal Csv Format MYSQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Csv Format MYSQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_MYSQL
	 * @model name="EnumLiteralCsvFormat_MYSQL" literal="MYSQL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CSV_FORMAT_MYSQL_VALUE = 2;

	/**
	 * The '<em><b>Enum Literal Csv Format RFC4180</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Csv Format RFC4180</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_RFC4180
	 * @model name="EnumLiteralCsvFormat_RFC4180" literal="RFC4180"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CSV_FORMAT_RFC4180_VALUE = 3;

	/**
	 * The '<em><b>Enum Literal Csv Format TDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Csv Format TDF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CSV_FORMAT_TDF
	 * @model name="EnumLiteralCsvFormat_TDF" literal="TDF"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CSV_FORMAT_TDF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Format CSV</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatCSV[] VALUES_ARRAY =
		new FormatCSV[] {
			ENUM_LITERAL_CSV_FORMAT_DEFAULT,
			ENUM_LITERAL_CSV_FORMAT_EXCEL,
			ENUM_LITERAL_CSV_FORMAT_MYSQL,
			ENUM_LITERAL_CSV_FORMAT_RFC4180,
			ENUM_LITERAL_CSV_FORMAT_TDF,
		};

	/**
	 * A public read-only list of all the '<em><b>Format CSV</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormatCSV> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format CSV</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatCSV get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatCSV result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format CSV</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatCSV getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatCSV result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format CSV</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatCSV get(int value) {
		switch (value) {
			case ENUM_LITERAL_CSV_FORMAT_DEFAULT_VALUE: return ENUM_LITERAL_CSV_FORMAT_DEFAULT;
			case ENUM_LITERAL_CSV_FORMAT_EXCEL_VALUE: return ENUM_LITERAL_CSV_FORMAT_EXCEL;
			case ENUM_LITERAL_CSV_FORMAT_MYSQL_VALUE: return ENUM_LITERAL_CSV_FORMAT_MYSQL;
			case ENUM_LITERAL_CSV_FORMAT_RFC4180_VALUE: return ENUM_LITERAL_CSV_FORMAT_RFC4180;
			case ENUM_LITERAL_CSV_FORMAT_TDF_VALUE: return ENUM_LITERAL_CSV_FORMAT_TDF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FormatCSV(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FormatCSV
