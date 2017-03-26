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
package com.misc.common.moplaf.job;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.JobPackage#getJobParameterType()
 * @model
 * @generated
 */
public enum JobParameterType implements Enumerator {
	/**
	 * The '<em><b>JOB PARAMETER TYPE INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_INT_VALUE
	 * @generated
	 * @ordered
	 */
	JOB_PARAMETER_TYPE_INT(0, "JOB_PARAMETER_TYPE_INT", "Int"),

	/**
	 * The '<em><b>JOB PARAMETER TYPE STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	JOB_PARAMETER_TYPE_STRING(1, "JOB_PARAMETER_TYPE_STRING", "String"),

	/**
	 * The '<em><b>JOB PARAMETER TYPE FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	JOB_PARAMETER_TYPE_FLOAT(2, "JOB_PARAMETER_TYPE_FLOAT", "Float"),

	/**
	 * The '<em><b>JOB PARAMETER TYPE DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	JOB_PARAMETER_TYPE_DATE(3, "JOB_PARAMETER_TYPE_DATE", "Date"),

	/**
	 * The '<em><b>JOB PARAMETER TYPE ENUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_ENUM_VALUE
	 * @generated
	 * @ordered
	 */
	JOB_PARAMETER_TYPE_ENUM(4, "JOB_PARAMETER_TYPE_ENUM", "Enum");

	/**
	 * The '<em><b>JOB PARAMETER TYPE INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOB PARAMETER TYPE INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_INT
	 * @model literal="Int"
	 * @generated
	 * @ordered
	 */
	public static final int JOB_PARAMETER_TYPE_INT_VALUE = 0;

	/**
	 * The '<em><b>JOB PARAMETER TYPE STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOB PARAMETER TYPE STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_STRING
	 * @model literal="String"
	 * @generated
	 * @ordered
	 */
	public static final int JOB_PARAMETER_TYPE_STRING_VALUE = 1;

	/**
	 * The '<em><b>JOB PARAMETER TYPE FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOB PARAMETER TYPE FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_FLOAT
	 * @model literal="Float"
	 * @generated
	 * @ordered
	 */
	public static final int JOB_PARAMETER_TYPE_FLOAT_VALUE = 2;

	/**
	 * The '<em><b>JOB PARAMETER TYPE DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOB PARAMETER TYPE DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_DATE
	 * @model literal="Date"
	 * @generated
	 * @ordered
	 */
	public static final int JOB_PARAMETER_TYPE_DATE_VALUE = 3;

	/**
	 * The '<em><b>JOB PARAMETER TYPE ENUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOB PARAMETER TYPE ENUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOB_PARAMETER_TYPE_ENUM
	 * @model literal="Enum"
	 * @generated
	 * @ordered
	 */
	public static final int JOB_PARAMETER_TYPE_ENUM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JobParameterType[] VALUES_ARRAY =
		new JobParameterType[] {
			JOB_PARAMETER_TYPE_INT,
			JOB_PARAMETER_TYPE_STRING,
			JOB_PARAMETER_TYPE_FLOAT,
			JOB_PARAMETER_TYPE_DATE,
			JOB_PARAMETER_TYPE_ENUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JobParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JobParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JobParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JobParameterType get(int value) {
		switch (value) {
			case JOB_PARAMETER_TYPE_INT_VALUE: return JOB_PARAMETER_TYPE_INT;
			case JOB_PARAMETER_TYPE_STRING_VALUE: return JOB_PARAMETER_TYPE_STRING;
			case JOB_PARAMETER_TYPE_FLOAT_VALUE: return JOB_PARAMETER_TYPE_FLOAT;
			case JOB_PARAMETER_TYPE_DATE_VALUE: return JOB_PARAMETER_TYPE_DATE;
			case JOB_PARAMETER_TYPE_ENUM_VALUE: return JOB_PARAMETER_TYPE_ENUM;
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
	private JobParameterType(int value, String name, String literal) {
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
	
} //JobParameterType
