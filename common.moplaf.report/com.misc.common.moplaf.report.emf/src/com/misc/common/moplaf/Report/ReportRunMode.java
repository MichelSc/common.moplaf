/**
 */
package com.misc.common.moplaf.Report;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Run Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.Report.ReportPackage#getReportRunMode()
 * @model
 * @generated
 */
public enum ReportRunMode implements Enumerator {
	/**
	 * The '<em><b>Enum Generate Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GENERATE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GENERATE_ONLY(0, "EnumGenerateOnly", "GenerateOnly"),

	/**
	 * The '<em><b>Enum Render Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RENDER_ONLY(1, "EnumRenderOnly", "RenderOnly"),

	/**
	 * The '<em><b>Enum Write Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WRITE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WRITE_ONLY(2, "EnumWriteOnly", "WriteOnly"),

	/**
	 * The '<em><b>Enum Generate And Render</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GENERATE_AND_RENDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GENERATE_AND_RENDER(3, "EnumGenerateAndRender", "GenerateAndRender"),

	/**
	 * The '<em><b>Enum Generate And Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GENERATE_AND_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GENERATE_AND_WRITE(4, "EnumGenerateAndWrite", "GenerateAndWrite");

	/**
	 * The '<em><b>Enum Generate Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Generate Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_GENERATE_ONLY
	 * @model name="EnumGenerateOnly" literal="GenerateOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GENERATE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Enum Render Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Render Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_ONLY
	 * @model name="EnumRenderOnly" literal="RenderOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RENDER_ONLY_VALUE = 1;

	/**
	 * The '<em><b>Enum Write Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Write Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_WRITE_ONLY
	 * @model name="EnumWriteOnly" literal="WriteOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WRITE_ONLY_VALUE = 2;

	/**
	 * The '<em><b>Enum Generate And Render</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Generate And Render</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_GENERATE_AND_RENDER
	 * @model name="EnumGenerateAndRender" literal="GenerateAndRender"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GENERATE_AND_RENDER_VALUE = 3;

	/**
	 * The '<em><b>Enum Generate And Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Generate And Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_GENERATE_AND_WRITE
	 * @model name="EnumGenerateAndWrite" literal="GenerateAndWrite"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GENERATE_AND_WRITE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Run Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReportRunMode[] VALUES_ARRAY =
		new ReportRunMode[] {
			ENUM_GENERATE_ONLY,
			ENUM_RENDER_ONLY,
			ENUM_WRITE_ONLY,
			ENUM_GENERATE_AND_RENDER,
			ENUM_GENERATE_AND_WRITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Run Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReportRunMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Run Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRunMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportRunMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Run Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRunMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportRunMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Run Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRunMode get(int value) {
		switch (value) {
			case ENUM_GENERATE_ONLY_VALUE: return ENUM_GENERATE_ONLY;
			case ENUM_RENDER_ONLY_VALUE: return ENUM_RENDER_ONLY;
			case ENUM_WRITE_ONLY_VALUE: return ENUM_WRITE_ONLY;
			case ENUM_GENERATE_AND_RENDER_VALUE: return ENUM_GENERATE_AND_RENDER;
			case ENUM_GENERATE_AND_WRITE_VALUE: return ENUM_GENERATE_AND_WRITE;
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
	private ReportRunMode(int value, String name, String literal) {
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
	
} //ReportRunMode
