/**
 */
package com.misc.common.moplaf.time.discrete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bucket Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#getBucketType()
 * @model
 * @generated
 */
public enum BucketType implements Enumerator {
	/**
	 * The '<em><b>TL Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TL_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	TL_MONTH(0, "TLMonth", "Month"),

	/**
	 * The '<em><b>TL Week</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TL_WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	TL_WEEK(2, "TLWeek", "Week"),

	/**
	 * The '<em><b>TL Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TL_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	TL_DAY(1, "TLDay", "Day"),

	/**
	 * The '<em><b>TL Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TL_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	TL_HOUR(3, "TLHour", "Hour"),

	/**
	 * The '<em><b>TL Half Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TL_HALF_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	TL_HALF_HOUR(4, "TLHalfHour", "HalfHour"),

	/**
	 * The '<em><b>TL Quarter Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TL_QUARTER_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	TL_QUARTER_HOUR(5, "TLQuarterHour", "QuarterOfHour");

	/**
	 * The '<em><b>TL Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TL Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TL_MONTH
	 * @model name="TLMonth" literal="Month"
	 * @generated
	 * @ordered
	 */
	public static final int TL_MONTH_VALUE = 0;

	/**
	 * The '<em><b>TL Week</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TL Week</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TL_WEEK
	 * @model name="TLWeek" literal="Week"
	 * @generated
	 * @ordered
	 */
	public static final int TL_WEEK_VALUE = 2;

	/**
	 * The '<em><b>TL Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TL Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TL_DAY
	 * @model name="TLDay" literal="Day"
	 * @generated
	 * @ordered
	 */
	public static final int TL_DAY_VALUE = 1;

	/**
	 * The '<em><b>TL Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TL Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TL_HOUR
	 * @model name="TLHour" literal="Hour"
	 * @generated
	 * @ordered
	 */
	public static final int TL_HOUR_VALUE = 3;

	/**
	 * The '<em><b>TL Half Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TL Half Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TL_HALF_HOUR
	 * @model name="TLHalfHour" literal="HalfHour"
	 * @generated
	 * @ordered
	 */
	public static final int TL_HALF_HOUR_VALUE = 4;

	/**
	 * The '<em><b>TL Quarter Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TL Quarter Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TL_QUARTER_HOUR
	 * @model name="TLQuarterHour" literal="QuarterOfHour"
	 * @generated
	 * @ordered
	 */
	public static final int TL_QUARTER_HOUR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Bucket Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BucketType[] VALUES_ARRAY =
		new BucketType[] {
			TL_MONTH,
			TL_WEEK,
			TL_DAY,
			TL_HOUR,
			TL_HALF_HOUR,
			TL_QUARTER_HOUR,
		};

	/**
	 * A public read-only list of all the '<em><b>Bucket Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BucketType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bucket Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BucketType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bucket Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BucketType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bucket Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BucketType get(int value) {
		switch (value) {
			case TL_MONTH_VALUE: return TL_MONTH;
			case TL_WEEK_VALUE: return TL_WEEK;
			case TL_DAY_VALUE: return TL_DAY;
			case TL_HOUR_VALUE: return TL_HOUR;
			case TL_HALF_HOUR_VALUE: return TL_HALF_HOUR;
			case TL_QUARTER_HOUR_VALUE: return TL_QUARTER_HOUR;
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
	private BucketType(int value, String name, String literal) {
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
	
} //BucketType
