/**
 */
package com.misc.common.moplaf.localsearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strategy Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategyLevel()
 * @model
 * @generated
 */
public enum StrategyLevel implements Enumerator {
	/**
	 * The '<em><b>Level None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_NONE(0, "LevelNone", "LevelNone"),

	/**
	 * The '<em><b>Level Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_PHASE(1, "LevelPhase", "LevelPhase"), /**
	 * The '<em><b>Level Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_STEP_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_STEP(2, "LevelStep", "LevelStep"),

	/**
	 * The '<em><b>Level Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_ACTION(3, "LevelAction", "LevelAction");

	/**
	 * The '<em><b>Level None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Level None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEVEL_NONE
	 * @model name="LevelNone"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_NONE_VALUE = 0;

	/**
	 * The '<em><b>Level Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Level Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEVEL_PHASE
	 * @model name="LevelPhase"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_PHASE_VALUE = 1;

	/**
	 * The '<em><b>Level Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Level Step</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEVEL_STEP
	 * @model name="LevelStep"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_STEP_VALUE = 2;

	/**
	 * The '<em><b>Level Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Level Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEVEL_ACTION
	 * @model name="LevelAction"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_ACTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Strategy Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StrategyLevel[] VALUES_ARRAY =
		new StrategyLevel[] {
			LEVEL_NONE,
			LEVEL_PHASE,
			LEVEL_STEP,
			LEVEL_ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Strategy Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StrategyLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Strategy Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrategyLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrategyLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strategy Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrategyLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrategyLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strategy Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrategyLevel get(int value) {
		switch (value) {
			case LEVEL_NONE_VALUE: return LEVEL_NONE;
			case LEVEL_PHASE_VALUE: return LEVEL_PHASE;
			case LEVEL_STEP_VALUE: return LEVEL_STEP;
			case LEVEL_ACTION_VALUE: return LEVEL_ACTION;
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
	private StrategyLevel(int value, String name, String literal) {
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
	
} //StrategyLevel
