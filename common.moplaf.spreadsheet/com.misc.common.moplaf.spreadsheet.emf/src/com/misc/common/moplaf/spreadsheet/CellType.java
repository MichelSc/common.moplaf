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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cell Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetPackage#getCellType()
 * @model
 * @generated
 */
public enum CellType implements Enumerator {
	/**
	 * The '<em><b>Cell Type Numeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_TYPE_NUMERIC(0, "CellTypeNumeric", "CellTypeNumeric"),

	/**
	 * The '<em><b>Cell Type Formula</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_FORMULA_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_TYPE_FORMULA(1, "CellTypeFormula", "CellTypeFormula"),

	/**
	 * The '<em><b>Cell Type String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_TYPE_STRING(2, "CellTypeString", "CellTypeString"),

	/**
	 * The '<em><b>Cell Type Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_TYPE_DATE(3, "CellTypeDate", "CellTypeDate"), /**
	 * The '<em><b>Cell Type Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_TYPE_BOOLEAN(4, "CellTypeBoolean", "CellTypeBoolean");

	/**
	 * The '<em><b>Cell Type Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Type Numeric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_NUMERIC
	 * @model name="CellTypeNumeric"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_TYPE_NUMERIC_VALUE = 0;

	/**
	 * The '<em><b>Cell Type Formula</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Type Formula</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_FORMULA
	 * @model name="CellTypeFormula"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_TYPE_FORMULA_VALUE = 1;

	/**
	 * The '<em><b>Cell Type String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Type String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_STRING
	 * @model name="CellTypeString"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_TYPE_STRING_VALUE = 2;

	/**
	 * The '<em><b>Cell Type Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Type Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_DATE
	 * @model name="CellTypeDate"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_TYPE_DATE_VALUE = 3;

	/**
	 * The '<em><b>Cell Type Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Type Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_TYPE_BOOLEAN
	 * @model name="CellTypeBoolean"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_TYPE_BOOLEAN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cell Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CellType[] VALUES_ARRAY =
		new CellType[] {
			CELL_TYPE_NUMERIC,
			CELL_TYPE_FORMULA,
			CELL_TYPE_STRING,
			CELL_TYPE_DATE,
			CELL_TYPE_BOOLEAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Cell Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CellType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CellType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CellType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CellType get(int value) {
		switch (value) {
			case CELL_TYPE_NUMERIC_VALUE: return CELL_TYPE_NUMERIC;
			case CELL_TYPE_FORMULA_VALUE: return CELL_TYPE_FORMULA;
			case CELL_TYPE_STRING_VALUE: return CELL_TYPE_STRING;
			case CELL_TYPE_DATE_VALUE: return CELL_TYPE_DATE;
			case CELL_TYPE_BOOLEAN_VALUE: return CELL_TYPE_BOOLEAN;
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
	private CellType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //CellType
