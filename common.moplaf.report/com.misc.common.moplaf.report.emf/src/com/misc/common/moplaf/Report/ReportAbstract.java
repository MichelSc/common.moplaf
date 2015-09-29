/**
 */
package com.misc.common.moplaf.Report;

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
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#getEngine <em>Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#getFormat <em>Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#isGenerated <em>Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#getLastGenerated <em>Last Generated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#getRunMode <em>Run Mode</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#isMayBeRun <em>May Be Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.Report.ReportAbstract#getMayBeRunFeedback <em>May Be Run Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract()
 * @model abstract="true"
 * @generated
 */
public interface ReportAbstract extends EObject {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' attribute.
	 * The default value is <code>"Birt"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.Report.ReportEngine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' attribute.
	 * @see com.misc.common.moplaf.Report.ReportEngine
	 * @see #setEngine(ReportEngine)
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_Engine()
	 * @model default="Birt"
	 * @generated
	 */
	ReportEngine getEngine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.Report.ReportAbstract#getEngine <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' attribute.
	 * @see com.misc.common.moplaf.Report.ReportEngine
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(ReportEngine value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"Pdf"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.Report.ReportRenderFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.Report.ReportRenderFormat
	 * @see #setFormat(ReportRenderFormat)
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_Format()
	 * @model default="Pdf"
	 * @generated
	 */
	ReportRenderFormat getFormat();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.Report.ReportAbstract#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see com.misc.common.moplaf.Report.ReportRenderFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(ReportRenderFormat value);

	/**
	 * Returns the value of the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated</em>' attribute.
	 * @see #setGenerated(boolean)
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_Generated()
	 * @model
	 * @generated
	 */
	boolean isGenerated();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.Report.ReportAbstract#isGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see #isGenerated()
	 * @generated
	 */
	void setGenerated(boolean value);

	/**
	 * Returns the value of the '<em><b>Output File Path</b></em>' attribute.
	 * The default value is <code>"/home/michel/tmp/output.txt"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Path</em>' attribute.
	 * @see #setOutputFilePath(String)
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_OutputFilePath()
	 * @model default="/home/michel/tmp/output.txt"
	 * @generated
	 */
	String getOutputFilePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.Report.ReportAbstract#getOutputFilePath <em>Output File Path</em>}' attribute.
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
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_LastGenerated()
	 * @model
	 * @generated
	 */
	Date getLastGenerated();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.Report.ReportAbstract#getLastGenerated <em>Last Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Generated</em>' attribute.
	 * @see #getLastGenerated()
	 * @generated
	 */
	void setLastGenerated(Date value);

	/**
	 * Returns the value of the '<em><b>Run Mode</b></em>' attribute.
	 * The default value is <code>"GenerateAndRender"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.Report.ReportRunMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Mode</em>' attribute.
	 * @see com.misc.common.moplaf.Report.ReportRunMode
	 * @see #setRunMode(ReportRunMode)
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_RunMode()
	 * @model default="GenerateAndRender"
	 * @generated
	 */
	ReportRunMode getRunMode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.Report.ReportAbstract#getRunMode <em>Run Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Mode</em>' attribute.
	 * @see com.misc.common.moplaf.Report.ReportRunMode
	 * @see #getRunMode()
	 * @generated
	 */
	void setRunMode(ReportRunMode value);

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
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_MayBeRun()
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
	 * @see com.misc.common.moplaf.Report.ReportPackage#getReportAbstract_MayBeRunFeedback()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getMayBeRunFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void render();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void write();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EObject getContext();

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
