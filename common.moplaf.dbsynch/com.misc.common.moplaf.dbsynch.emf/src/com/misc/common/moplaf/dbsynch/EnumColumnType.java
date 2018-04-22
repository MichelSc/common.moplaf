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
package com.misc.common.moplaf.dbsynch;

import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Column Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getEnumColumnType()
 * @model
 * @generated
 */
public enum EnumColumnType implements Enumerator {
	/**
	 * The '<em><b>ENUM COLUMN TYPE BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_BOOLEAN(1, "ENUM_COLUMN_TYPE_BOOLEAN", "Boolean"), /**
	 * The '<em><b>ENUM COLUMN TYPE INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_INT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_INT(2, "ENUM_COLUMN_TYPE_INT", "Int"),

	/**
	 * The '<em><b>ENUM COLUMN TYPE BIGINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_BIGINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_BIGINT(3, "ENUM_COLUMN_TYPE_BIGINT", "BigInt"), /**
	 * The '<em><b>ENUM COLUMN TYPE FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_FLOAT(4, "ENUM_COLUMN_TYPE_FLOAT", "Float"), /**
	 * The '<em><b>ENUM COLUMN TYPE DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_DOUBLE(5, "ENUM_COLUMN_TYPE_DOUBLE", "Double"), /**
	 * The '<em><b>ENUM COLUMN TYPE BIGFLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_BIGFLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_BIGFLOAT(6, "ENUM_COLUMN_TYPE_BIGFLOAT", "BigFloat"), /**
	 * The '<em><b>ENUM COLUMN TYPE CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_CHAR(7, "ENUM_COLUMN_TYPE_CHAR", "Char"),

	/**
	 * The '<em><b>ENUM COLUMN TYPE DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_DATE(8, "ENUM_COLUMN_TYPE_DATE", "Date"),

	/**
	 * The '<em><b>ENUM COLUMN TYPE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_TIME(9, "ENUM_COLUMN_TYPE_TIME", "Time"),

	/**
	 * The '<em><b>ENUM COLUMN TYPE DATETIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_COLUMN_TYPE_DATETIME(10, "ENUM_COLUMN_TYPE_DATETIME", "DateTime");

	/**
	 * The '<em><b>ENUM COLUMN TYPE BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_BOOLEAN
	 * @model literal="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>ENUM COLUMN TYPE INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_INT
	 * @model literal="Int"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_INT_VALUE = 2;

	/**
	 * The '<em><b>ENUM COLUMN TYPE BIGINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE BIGINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_BIGINT
	 * @model literal="BigInt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_BIGINT_VALUE = 3;

	/**
	 * The '<em><b>ENUM COLUMN TYPE FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_FLOAT
	 * @model literal="Float"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_FLOAT_VALUE = 4;

	/**
	 * The '<em><b>ENUM COLUMN TYPE DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_DOUBLE
	 * @model literal="Double"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_DOUBLE_VALUE = 5;

	/**
	 * The '<em><b>ENUM COLUMN TYPE BIGFLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE BIGFLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_BIGFLOAT
	 * @model literal="BigFloat"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_BIGFLOAT_VALUE = 6;

	/**
	 * The '<em><b>ENUM COLUMN TYPE CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_CHAR
	 * @model literal="Char"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_CHAR_VALUE = 7;

	/**
	 * The '<em><b>ENUM COLUMN TYPE DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_DATE
	 * @model literal="Date"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_DATE_VALUE = 8;

	/**
	 * The '<em><b>ENUM COLUMN TYPE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_TIME
	 * @model literal="Time"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_TIME_VALUE = 9;

	/**
	 * The '<em><b>ENUM COLUMN TYPE DATETIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM COLUMN TYPE DATETIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_COLUMN_TYPE_DATETIME
	 * @model literal="DateTime"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_COLUMN_TYPE_DATETIME_VALUE = 10;

	/**
	 * An array of all the '<em><b>Enum Column Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumColumnType[] VALUES_ARRAY =
		new EnumColumnType[] {
			ENUM_COLUMN_TYPE_BOOLEAN,
			ENUM_COLUMN_TYPE_INT,
			ENUM_COLUMN_TYPE_BIGINT,
			ENUM_COLUMN_TYPE_FLOAT,
			ENUM_COLUMN_TYPE_DOUBLE,
			ENUM_COLUMN_TYPE_BIGFLOAT,
			ENUM_COLUMN_TYPE_CHAR,
			ENUM_COLUMN_TYPE_DATE,
			ENUM_COLUMN_TYPE_TIME,
			ENUM_COLUMN_TYPE_DATETIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Column Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumColumnType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Column Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumColumnType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumColumnType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Column Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumColumnType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumColumnType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Column Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumColumnType get(int value) {
		switch (value) {
			case ENUM_COLUMN_TYPE_BOOLEAN_VALUE: return ENUM_COLUMN_TYPE_BOOLEAN;
			case ENUM_COLUMN_TYPE_INT_VALUE: return ENUM_COLUMN_TYPE_INT;
			case ENUM_COLUMN_TYPE_BIGINT_VALUE: return ENUM_COLUMN_TYPE_BIGINT;
			case ENUM_COLUMN_TYPE_FLOAT_VALUE: return ENUM_COLUMN_TYPE_FLOAT;
			case ENUM_COLUMN_TYPE_DOUBLE_VALUE: return ENUM_COLUMN_TYPE_DOUBLE;
			case ENUM_COLUMN_TYPE_BIGFLOAT_VALUE: return ENUM_COLUMN_TYPE_BIGFLOAT;
			case ENUM_COLUMN_TYPE_CHAR_VALUE: return ENUM_COLUMN_TYPE_CHAR;
			case ENUM_COLUMN_TYPE_DATE_VALUE: return ENUM_COLUMN_TYPE_DATE;
			case ENUM_COLUMN_TYPE_TIME_VALUE: return ENUM_COLUMN_TYPE_TIME;
			case ENUM_COLUMN_TYPE_DATETIME_VALUE: return ENUM_COLUMN_TYPE_DATETIME;
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
	private EnumColumnType(int value, String name, String literal) {
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
	
	public int getJdbcType(){
		switch ( this.getValue()){
		case EnumColumnType.ENUM_COLUMN_TYPE_BOOLEAN_VALUE:
			return Types.BOOLEAN;
		case EnumColumnType.ENUM_COLUMN_TYPE_INT_VALUE:
			return Types.INTEGER;
		case EnumColumnType.ENUM_COLUMN_TYPE_BIGINT_VALUE:
			return Types.BIGINT;
		case EnumColumnType.ENUM_COLUMN_TYPE_FLOAT_VALUE:
			return Types.FLOAT;
		case EnumColumnType.ENUM_COLUMN_TYPE_DOUBLE_VALUE:
			return Types.DOUBLE;
		case EnumColumnType.ENUM_COLUMN_TYPE_BIGFLOAT_VALUE:
			return Types.NUMERIC;
		case EnumColumnType.ENUM_COLUMN_TYPE_CHAR_VALUE:
			return Types.CHAR;
		case EnumColumnType.ENUM_COLUMN_TYPE_DATE_VALUE:
			return Types.DATE;
		case EnumColumnType.ENUM_COLUMN_TYPE_DATETIME_VALUE:
			return Types.TIMESTAMP;
		case EnumColumnType.ENUM_COLUMN_TYPE_TIME_VALUE:
			return Types.TIME;
		}
		return Types.OTHER;
	}
	
} //EnumColumnType
