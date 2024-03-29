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
package com.misc.common.moplaf.solver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Lp Var Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage#getEnumLpVarType()
 * @model
 * @generated
 */
public enum EnumLpVarType implements Enumerator {
	/**
	 * The '<em><b>Enum Literal Lp Var Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_LP_VAR_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_LP_VAR_INTEGER(0, "EnumLiteralLpVarInteger", "Integer"),

	/**
	 * The '<em><b>Enum Literal Lp Var Real</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_LP_VAR_REAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_LP_VAR_REAL(1, "EnumLiteralLpVarReal", "Real");

	/**
	 * The '<em><b>Enum Literal Lp Var Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Lp Var Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_LP_VAR_INTEGER
	 * @model name="EnumLiteralLpVarInteger" literal="Integer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_LP_VAR_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Enum Literal Lp Var Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Lp Var Real</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_LP_VAR_REAL
	 * @model name="EnumLiteralLpVarReal" literal="Real"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_LP_VAR_REAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Enum Lp Var Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumLpVarType[] VALUES_ARRAY =
		new EnumLpVarType[] {
			ENUM_LITERAL_LP_VAR_INTEGER,
			ENUM_LITERAL_LP_VAR_REAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Lp Var Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumLpVarType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Lp Var Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumLpVarType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLpVarType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Lp Var Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumLpVarType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLpVarType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Lp Var Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumLpVarType get(int value) {
		switch (value) {
			case ENUM_LITERAL_LP_VAR_INTEGER_VALUE: return ENUM_LITERAL_LP_VAR_INTEGER;
			case ENUM_LITERAL_LP_VAR_REAL_VALUE: return ENUM_LITERAL_LP_VAR_REAL;
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
	private EnumLpVarType(int value, String name, String literal) {
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
	
} //EnumLpVarType
