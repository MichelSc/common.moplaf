/**
 */
package com.misc.common.moplaf.report;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#getLastGenerated <em>Last Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#isMayBeRun <em>May Be Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#getMayBeRunFeedback <em>May Be Run Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#getReportContext <em>Report Context</em>}</li>
 *   <li>{@link com.misc.common.moplaf.report.ReportAbstract#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract()
 * @model abstract="true"
 * @generated
 */
public interface ReportAbstract extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"pdf"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.report.ReportRenderFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.report.ReportRenderFormat
	 * @see #setFormat(ReportRenderFormat)
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_Format()
	 * @model default="pdf"
	 * @generated
	 */
	ReportRenderFormat getFormat();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.report.ReportAbstract#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.report.ReportRenderFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(ReportRenderFormat value);

	/**
	 * Returns the value of the '<em><b>Output File Path</b></em>' attribute.
	 * The default value is <code>"/home/michel/tmp/output"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Path</em>' attribute.
	 * @see #setOutputFilePath(String)
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_OutputFilePath()
	 * @model default="/home/michel/tmp/output"
	 * @generated
	 */
	String getOutputFilePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.report.ReportAbstract#getOutputFilePath <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File Path</em>' attribute.
	 * @see #getOutputFilePath()
	 * @generated
	 */
	void setOutputFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Last Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Generated</em>' attribute.
	 * @see #setLastGenerated(Date)
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_LastGenerated()
	 * @model
	 * @generated
	 */
	Date getLastGenerated();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.report.ReportAbstract#getLastGenerated <em>Last Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Generated</em>' attribute.
	 * @see #getLastGenerated()
	 * @generated
	 */
	void setLastGenerated(Date value);

	/**
	 * Returns the value of the '<em><b>May Be Run</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Be Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Be Run</em>' attribute.
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_MayBeRun()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMayBeRun();

	/**
	 * Returns the value of the '<em><b>May Be Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Be Run Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Be Run Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_MayBeRunFeedback()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getMayBeRunFeedback();

	/**
	 * Returns the value of the '<em><b>Report Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Context</em>' reference.
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_ReportContext()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EObject getReportContext();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.report.ReportPackage#getReportAbstract_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL for the report file.
	 * Use for instance platform:/plugin/<bundleID>/<path_in_bundle>/<file_Name>
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getReportDesignFileURL();

} // ReportAbstract
