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
package com.misc.common.moplaf.solver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Solver Log Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage#getEnumSolverLogLevel()
 * @model
 * @generated
 */
public enum EnumSolverLogLevel implements Enumerator {
	/**
	 * The '<em><b>Enum None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NONE(0, "EnumNone", "None"), /**
	 * The '<em><b>Enum Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MIN(1, "EnumMin", "Min"), /**
	 * The '<em><b>Enum Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NORMAL(2, "EnumNormal", "Normal"), /**
	 * The '<em><b>Enum Full</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FULL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FULL(3, "EnumFull", "Full");

	/**
	 * The '<em><b>Enum None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_NONE
	 * @model name="EnumNone" literal="None"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NONE_VALUE = 0;

/**
	 * The '<em><b>Enum Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Min</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MIN
	 * @model name="EnumMin" literal="Min"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MIN_VALUE = 1;

/**
	 * The '<em><b>Enum Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Normal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_NORMAL
	 * @model name="EnumNormal" literal="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NORMAL_VALUE = 2;

/**
	 * The '<em><b>Enum Full</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Full</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_FULL
	 * @model name="EnumFull" literal="Full"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FULL_VALUE = 3;

/**
	 * An array of all the '<em><b>Enum Solver Log Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumSolverLogLevel[] VALUES_ARRAY =
		new EnumSolverLogLevel[] {
			ENUM_NONE,
			ENUM_MIN,
			ENUM_NORMAL,
			ENUM_FULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Solver Log Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumSolverLogLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Solver Log Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumSolverLogLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumSolverLogLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Solver Log Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumSolverLogLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumSolverLogLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Solver Log Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumSolverLogLevel get(int value) {
		switch (value) {
			case ENUM_NONE_VALUE: return ENUM_NONE;
			case ENUM_MIN_VALUE: return ENUM_MIN;
			case ENUM_NORMAL_VALUE: return ENUM_NORMAL;
			case ENUM_FULL_VALUE: return ENUM_FULL;
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
	private EnumSolverLogLevel(int value, String name, String literal) {
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
	
} //EnumSolverLogLevel
