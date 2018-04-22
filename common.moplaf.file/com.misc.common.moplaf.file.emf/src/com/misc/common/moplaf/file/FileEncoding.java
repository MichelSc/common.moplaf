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
package com.misc.common.moplaf.file;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encoding</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.file.FilePackage#getFileEncoding()
 * @model
 * @generated
 */
public enum FileEncoding implements Enumerator {
	/**
	 * The '<em><b>US ASCII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US_ASCII_VALUE
	 * @generated
	 * @ordered
	 */
	US_ASCII(1, "US_ASCII", "US-ASCII"),

	/**
	 * The '<em><b>ISO 8859 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_8859_1_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_8859_1(2, "ISO_8859_1", "ISO-8859-1"),

	/**
	 * The '<em><b>UTF 8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF_8_VALUE
	 * @generated
	 * @ordered
	 */
	UTF_8(3, "UTF_8", "UTF-8"),

	/**
	 * The '<em><b>UTF 16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF_16_VALUE
	 * @generated
	 * @ordered
	 */
	UTF_16(4, "UTF_16", "UTF-16"),

	/**
	 * The '<em><b>UTF 16BE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF_16BE_VALUE
	 * @generated
	 * @ordered
	 */
	UTF_16BE(5, "UTF_16BE", "UTF-16BE"),

	/**
	 * The '<em><b>UTF 16LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF_16LE_VALUE
	 * @generated
	 * @ordered
	 */
	UTF_16LE(6, "UTF_16LE", "UTF-16LE");

	/**
	 * The '<em><b>US ASCII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>US ASCII</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #US_ASCII
	 * @model literal="US-ASCII"
	 * @generated
	 * @ordered
	 */
	public static final int US_ASCII_VALUE = 1;

	/**
	 * The '<em><b>ISO 8859 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISO 8859 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISO_8859_1
	 * @model literal="ISO-8859-1"
	 * @generated
	 * @ordered
	 */
	public static final int ISO_8859_1_VALUE = 2;

	/**
	 * The '<em><b>UTF 8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF 8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF_8
	 * @model literal="UTF-8"
	 * @generated
	 * @ordered
	 */
	public static final int UTF_8_VALUE = 3;

	/**
	 * The '<em><b>UTF 16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF 16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF_16
	 * @model literal="UTF-16"
	 * @generated
	 * @ordered
	 */
	public static final int UTF_16_VALUE = 4;

	/**
	 * The '<em><b>UTF 16BE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF 16BE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF_16BE
	 * @model literal="UTF-16BE"
	 * @generated
	 * @ordered
	 */
	public static final int UTF_16BE_VALUE = 5;

	/**
	 * The '<em><b>UTF 16LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF 16LE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF_16LE
	 * @model literal="UTF-16LE"
	 * @generated
	 * @ordered
	 */
	public static final int UTF_16LE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Encoding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileEncoding[] VALUES_ARRAY =
		new FileEncoding[] {
			US_ASCII,
			ISO_8859_1,
			UTF_8,
			UTF_16,
			UTF_16BE,
			UTF_16LE,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileEncoding> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileEncoding get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileEncoding result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileEncoding getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileEncoding result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileEncoding get(int value) {
		switch (value) {
			case US_ASCII_VALUE: return US_ASCII;
			case ISO_8859_1_VALUE: return ISO_8859_1;
			case UTF_8_VALUE: return UTF_8;
			case UTF_16_VALUE: return UTF_16;
			case UTF_16BE_VALUE: return UTF_16BE;
			case UTF_16LE_VALUE: return UTF_16LE;
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
	private FileEncoding(int value, String name, String literal) {
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
	
} //FileEncoding
