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
package com.misc.common.moplaf.solver.solverneos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Neos Solver Input</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getEnumNeosSolverInput()
 * @model
 * @generated
 */
public enum EnumNeosSolverInput implements Enumerator {
	/**
	 * The '<em><b>GAMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAMS_VALUE
	 * @generated
	 * @ordered
	 */
	GAMS(0, "GAMS", "GAMS"),

	/**
	 * The '<em><b>CPLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	CPLEX(1, "CPLEX", "CPLEX"),

	/**
	 * The '<em><b>MPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPS_VALUE
	 * @generated
	 * @ordered
	 */
	MPS(2, "MPS", "MPS"),

	/**
	 * The '<em><b>AMPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPL_VALUE
	 * @generated
	 * @ordered
	 */
	AMPL(3, "AMPL", "AMPL");

	/**
	 * The '<em><b>GAMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAMS_VALUE = 0;

	/**
	 * The '<em><b>CPLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPLEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPLEX_VALUE = 1;

	/**
	 * The '<em><b>MPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MPS_VALUE = 2;

	/**
	 * The '<em><b>AMPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMPL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Neos Solver Input</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumNeosSolverInput[] VALUES_ARRAY =
		new EnumNeosSolverInput[] {
			GAMS,
			CPLEX,
			MPS,
			AMPL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Neos Solver Input</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumNeosSolverInput> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Neos Solver Input</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumNeosSolverInput get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumNeosSolverInput result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Neos Solver Input</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumNeosSolverInput getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumNeosSolverInput result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Neos Solver Input</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumNeosSolverInput get(int value) {
		switch (value) {
			case GAMS_VALUE: return GAMS;
			case CPLEX_VALUE: return CPLEX;
			case MPS_VALUE: return MPS;
			case AMPL_VALUE: return AMPL;
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
	private EnumNeosSolverInput(int value, String name, String literal) {
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
	
} //EnumNeosSolverInput
