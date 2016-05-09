/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchjtds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Server Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage#getEnumServerType()
 * @model
 * @generated
 */
public enum EnumServerType implements Enumerator {
	/**
	 * The '<em><b>ENUM MODIFICATION SQLSERVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_SQLSERVER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_SQLSERVER(0, "ENUM_MODIFICATION_SQLSERVER", "SqlServer"),

	/**
	 * The '<em><b>ENUM MODIFICATION SYBASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_SYBASE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_SYBASE(0, "ENUM_MODIFICATION_SYBASE", "Sybase");

	/**
	 * The '<em><b>ENUM MODIFICATION SQLSERVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION SQLSERVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_SQLSERVER
	 * @model literal="SqlServer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_SQLSERVER_VALUE = 0;

	/**
	 * The '<em><b>ENUM MODIFICATION SYBASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION SYBASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_SYBASE
	 * @model literal="Sybase"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_SYBASE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Enum Server Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumServerType[] VALUES_ARRAY =
		new EnumServerType[] {
			ENUM_MODIFICATION_SQLSERVER,
			ENUM_MODIFICATION_SYBASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Server Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumServerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Server Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumServerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumServerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Server Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumServerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumServerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Server Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumServerType get(int value) {
		switch (value) {
			case ENUM_MODIFICATION_SQLSERVER_VALUE: return ENUM_MODIFICATION_SQLSERVER;
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
	private EnumServerType(int value, String name, String literal) {
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
	
} //EnumServerType
