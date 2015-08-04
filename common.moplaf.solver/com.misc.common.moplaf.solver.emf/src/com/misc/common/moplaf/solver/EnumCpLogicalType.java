/**
 */
package com.misc.common.moplaf.solver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Cp Logical Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage#getEnumCpLogicalType()
 * @model
 * @generated
 */
public enum EnumCpLogicalType implements Enumerator {
	/**
	 * The '<em><b>Enum Literal Cp Logical Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CP_LOGICAL_OR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CP_LOGICAL_OR(0, "EnumLiteralCpLogicalOr", "Or"),

	/**
	 * The '<em><b>Enum Literal Cp Logical And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CP_LOGICAL_AND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL_CP_LOGICAL_AND(1, "EnumLiteralCpLogicalAnd", "And");

	/**
	 * The '<em><b>Enum Literal Cp Logical Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Cp Logical Or</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CP_LOGICAL_OR
	 * @model name="EnumLiteralCpLogicalOr" literal="Or"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CP_LOGICAL_OR_VALUE = 0;

	/**
	 * The '<em><b>Enum Literal Cp Logical And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal Cp Logical And</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_CP_LOGICAL_AND
	 * @model name="EnumLiteralCpLogicalAnd" literal="And"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_CP_LOGICAL_AND_VALUE = 1;

	/**
	 * An array of all the '<em><b>Enum Cp Logical Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumCpLogicalType[] VALUES_ARRAY =
		new EnumCpLogicalType[] {
			ENUM_LITERAL_CP_LOGICAL_OR,
			ENUM_LITERAL_CP_LOGICAL_AND,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Cp Logical Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumCpLogicalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Cp Logical Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumCpLogicalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumCpLogicalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Cp Logical Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumCpLogicalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumCpLogicalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Cp Logical Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumCpLogicalType get(int value) {
		switch (value) {
			case ENUM_LITERAL_CP_LOGICAL_OR_VALUE: return ENUM_LITERAL_CP_LOGICAL_OR;
			case ENUM_LITERAL_CP_LOGICAL_AND_VALUE: return ENUM_LITERAL_CP_LOGICAL_AND;
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
	private EnumCpLogicalType(int value, String name, String literal) {
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
	
} //EnumCpLogicalType
