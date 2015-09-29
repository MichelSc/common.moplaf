/**
 */
package com.misc.common.moplaf.Report;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Render Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.Report.ReportPackage#getReportRenderFormat()
 * @model
 * @generated
 */
public enum ReportRenderFormat implements Enumerator {
	/**
	 * The '<em><b>Enum Render Format Pdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_FORMAT_PDF_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RENDER_FORMAT_PDF(0, "EnumRenderFormatPdf", "Pdf"),

	/**
	 * The '<em><b>Enum Reder Format Html</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_REDER_FORMAT_HTML_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_REDER_FORMAT_HTML(1, "EnumRederFormatHtml", "Html"), /**
	 * The '<em><b>Enum Render Format Excel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_FORMAT_EXCEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RENDER_FORMAT_EXCEL(2, "EnumRenderFormatExcel", "Excel"), /**
	 * The '<em><b>Enum Render Format Docx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_FORMAT_DOCX_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RENDER_FORMAT_DOCX(3, "EnumRenderFormatDocx", "Docx");

	/**
	 * The '<em><b>Enum Render Format Pdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Render Format Pdf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_FORMAT_PDF
	 * @model name="EnumRenderFormatPdf" literal="Pdf"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RENDER_FORMAT_PDF_VALUE = 0;

	/**
	 * The '<em><b>Enum Reder Format Html</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Reder Format Html</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_REDER_FORMAT_HTML
	 * @model name="EnumRederFormatHtml" literal="Html"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_REDER_FORMAT_HTML_VALUE = 1;

	/**
	 * The '<em><b>Enum Render Format Excel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Render Format Excel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_FORMAT_EXCEL
	 * @model name="EnumRenderFormatExcel" literal="Excel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RENDER_FORMAT_EXCEL_VALUE = 2;

	/**
	 * The '<em><b>Enum Render Format Docx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Render Format Docx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_RENDER_FORMAT_DOCX
	 * @model name="EnumRenderFormatDocx" literal="Docx"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RENDER_FORMAT_DOCX_VALUE = 3;

	/**
	 * An array of all the '<em><b>Render Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReportRenderFormat[] VALUES_ARRAY =
		new ReportRenderFormat[] {
			ENUM_RENDER_FORMAT_PDF,
			ENUM_REDER_FORMAT_HTML,
			ENUM_RENDER_FORMAT_EXCEL,
			ENUM_RENDER_FORMAT_DOCX,
		};

	/**
	 * A public read-only list of all the '<em><b>Render Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReportRenderFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Render Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRenderFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportRenderFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Render Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRenderFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportRenderFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Render Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRenderFormat get(int value) {
		switch (value) {
			case ENUM_RENDER_FORMAT_PDF_VALUE: return ENUM_RENDER_FORMAT_PDF;
			case ENUM_REDER_FORMAT_HTML_VALUE: return ENUM_REDER_FORMAT_HTML;
			case ENUM_RENDER_FORMAT_EXCEL_VALUE: return ENUM_RENDER_FORMAT_EXCEL;
			case ENUM_RENDER_FORMAT_DOCX_VALUE: return ENUM_RENDER_FORMAT_DOCX;
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
	private ReportRenderFormat(int value, String name, String literal) {
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
	
} //ReportRenderFormat
