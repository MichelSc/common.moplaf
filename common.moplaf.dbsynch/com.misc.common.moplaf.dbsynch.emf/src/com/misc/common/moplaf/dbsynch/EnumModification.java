/**
 */
package com.misc.common.moplaf.dbsynch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Modification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getEnumModification()
 * @model
 * @generated
 */
public enum EnumModification implements Enumerator {
	/**
	 * The '<em><b>ENUM MODIFICATION NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_NONE(0, "ENUM_MODIFICATION_NONE", "None"),

	/**
	 * The '<em><b>ENUM MODIFICATION CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_CREATE(0, "ENUM_MODIFICATION_CREATE", "Create"), /**
	 * The '<em><b>ENUM MODIFICATION UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_UPDATE(0, "ENUM_MODIFICATION_UPDATE", "Update"),

	/**
	 * The '<em><b>ENUM MODIFICATION DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_DELETE(0, "ENUM_MODIFICATION_DELETE", "Delete"), /**
	 * The '<em><b>ENUM MODIFICATION MUTATEKEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_MUTATEKEY_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MODIFICATION_MUTATEKEY(4, "ENUM_MODIFICATION_MUTATEKEY", "MutateKey");

	/**
	 * The '<em><b>ENUM MODIFICATION NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_NONE
	 * @model literal="None"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_NONE_VALUE = 0;

	/**
	 * The '<em><b>ENUM MODIFICATION CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION CREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_CREATE
	 * @model literal="Create"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_CREATE_VALUE = 0;

	/**
	 * The '<em><b>ENUM MODIFICATION UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION UPDATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_UPDATE
	 * @model literal="Update"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_UPDATE_VALUE = 0;

	/**
	 * The '<em><b>ENUM MODIFICATION DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION DELETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_DELETE
	 * @model literal="Delete"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_DELETE_VALUE = 0;

	/**
	 * The '<em><b>ENUM MODIFICATION MUTATEKEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM MODIFICATION MUTATEKEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_MODIFICATION_MUTATEKEY
	 * @model literal="MutateKey"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MODIFICATION_MUTATEKEY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Enum Modification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumModification[] VALUES_ARRAY =
		new EnumModification[] {
			ENUM_MODIFICATION_NONE,
			ENUM_MODIFICATION_CREATE,
			ENUM_MODIFICATION_UPDATE,
			ENUM_MODIFICATION_DELETE,
			ENUM_MODIFICATION_MUTATEKEY,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Modification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumModification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Modification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumModification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumModification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Modification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumModification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumModification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Modification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumModification get(int value) {
		switch (value) {
			case ENUM_MODIFICATION_NONE_VALUE: return ENUM_MODIFICATION_NONE;
			case ENUM_MODIFICATION_MUTATEKEY_VALUE: return ENUM_MODIFICATION_MUTATEKEY;
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
	private EnumModification(int value, String name, String literal) {
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
	
} //EnumModification
