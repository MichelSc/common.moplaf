/**
 */
package com.misc.common.moplaf.report;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.report.ReportFactory
 * @model kind="package"
 * @generated
 */
public interface ReportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "report";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/report/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rpt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportPackage eINSTANCE = com.misc.common.moplaf.report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.report.impl.ReportAbstractImpl
	 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getReportAbstract()
	 * @generated
	 */
	int REPORT_ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__ENGINE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__OUTPUT_FILE_PATH = 2;

	/**
	 * The feature id for the '<em><b>Last Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__LAST_GENERATED = 3;

	/**
	 * The feature id for the '<em><b>May Be Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__MAY_BE_RUN = 4;

	/**
	 * The feature id for the '<em><b>May Be Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK = 5;

	/**
	 * The feature id for the '<em><b>Report Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__REPORT_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__DESCRIPTION = 7;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___RUN = 0;

	/**
	 * The operation id for the '<em>Get Report Design File URL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___GET_REPORT_DESIGN_FILE_URL = 1;

	/**
	 * The number of operations of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.report.ReportEngine <em>Engine</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.report.ReportEngine
	 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getReportEngine()
	 * @generated
	 */
	int REPORT_ENGINE = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.report.ReportRenderFormat <em>Render Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.report.ReportRenderFormat
	 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getReportRenderFormat()
	 * @generated
	 */
	int REPORT_RENDER_FORMAT = 2;


	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 3;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.report.ReportAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract
	 * @generated
	 */
	EClass getReportAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getEngine()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_Engine();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getFormat()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_Format();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#getOutputFilePath <em>Output File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File Path</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getOutputFilePath()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_OutputFilePath();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#getLastGenerated <em>Last Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Generated</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getLastGenerated()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_LastGenerated();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#isMayBeRun <em>May Be Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Be Run</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#isMayBeRun()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_MayBeRun();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#getMayBeRunFeedback <em>May Be Run Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Be Run Feedback</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getMayBeRunFeedback()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_MayBeRunFeedback();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.report.ReportAbstract#getReportContext <em>Report Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Report Context</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getReportContext()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EReference getReportAbstract_ReportContext();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.report.ReportAbstract#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getDescription()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.report.ReportAbstract#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.report.ReportAbstract#run()
	 * @generated
	 */
	EOperation getReportAbstract__Run();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.report.ReportAbstract#getReportDesignFileURL() <em>Get Report Design File URL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Report Design File URL</em>' operation.
	 * @see com.misc.common.moplaf.report.ReportAbstract#getReportDesignFileURL()
	 * @generated
	 */
	EOperation getReportAbstract__GetReportDesignFileURL();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.report.ReportEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Engine</em>'.
	 * @see com.misc.common.moplaf.report.ReportEngine
	 * @generated
	 */
	EEnum getReportEngine();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.report.ReportRenderFormat <em>Render Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Render Format</em>'.
	 * @see com.misc.common.moplaf.report.ReportRenderFormat
	 * @generated
	 */
	EEnum getReportRenderFormat();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportFactory getReportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.report.impl.ReportAbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.report.impl.ReportAbstractImpl
		 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getReportAbstract()
		 * @generated
		 */
		EClass REPORT_ABSTRACT = eINSTANCE.getReportAbstract();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__ENGINE = eINSTANCE.getReportAbstract_Engine();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__FORMAT = eINSTANCE.getReportAbstract_Format();

		/**
		 * The meta object literal for the '<em><b>Output File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__OUTPUT_FILE_PATH = eINSTANCE.getReportAbstract_OutputFilePath();

		/**
		 * The meta object literal for the '<em><b>Last Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__LAST_GENERATED = eINSTANCE.getReportAbstract_LastGenerated();

		/**
		 * The meta object literal for the '<em><b>May Be Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__MAY_BE_RUN = eINSTANCE.getReportAbstract_MayBeRun();

		/**
		 * The meta object literal for the '<em><b>May Be Run Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK = eINSTANCE.getReportAbstract_MayBeRunFeedback();

		/**
		 * The meta object literal for the '<em><b>Report Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_ABSTRACT__REPORT_CONTEXT = eINSTANCE.getReportAbstract_ReportContext();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__DESCRIPTION = eINSTANCE.getReportAbstract_Description();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___RUN = eINSTANCE.getReportAbstract__Run();

		/**
		 * The meta object literal for the '<em><b>Get Report Design File URL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___GET_REPORT_DESIGN_FILE_URL = eINSTANCE.getReportAbstract__GetReportDesignFileURL();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.report.ReportEngine <em>Engine</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.report.ReportEngine
		 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getReportEngine()
		 * @generated
		 */
		EEnum REPORT_ENGINE = eINSTANCE.getReportEngine();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.report.ReportRenderFormat <em>Render Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.report.ReportRenderFormat
		 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getReportRenderFormat()
		 * @generated
		 */
		EEnum REPORT_RENDER_FORMAT = eINSTANCE.getReportRenderFormat();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see com.misc.common.moplaf.report.impl.ReportPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

	}

} //ReportPackage
