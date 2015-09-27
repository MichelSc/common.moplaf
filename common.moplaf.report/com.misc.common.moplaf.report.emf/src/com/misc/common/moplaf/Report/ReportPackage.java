/**
 */
package com.misc.common.moplaf.Report;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.misc.common.moplaf.Report.ReportFactory
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
	String eNAME = "Report";

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
	ReportPackage eINSTANCE = com.misc.common.moplaf.Report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.Report.impl.ReportAbstractImpl
	 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportAbstract()
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
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__GENERATED = 2;

	/**
	 * The feature id for the '<em><b>Output File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__OUTPUT_FILE = 3;

	/**
	 * The feature id for the '<em><b>Last Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__LAST_GENERATED = 4;

	/**
	 * The feature id for the '<em><b>Run Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__RUN_MODE = 5;

	/**
	 * The feature id for the '<em><b>May Be Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__MAY_BE_RUN = 6;

	/**
	 * The feature id for the '<em><b>May Be Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK = 7;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___GENERATE = 0;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___RENDER = 1;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___WRITE = 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___GET_CONTEXT = 3;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT___RUN = 4;

	/**
	 * The number of operations of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ABSTRACT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.Report.ReportEngine <em>Engine</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.Report.ReportEngine
	 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportEngine()
	 * @generated
	 */
	int REPORT_ENGINE = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.Report.ReportRenderFormat <em>Render Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.Report.ReportRenderFormat
	 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportRenderFormat()
	 * @generated
	 */
	int REPORT_RENDER_FORMAT = 2;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.Report.ReportRunMode <em>Run Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.Report.ReportRunMode
	 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportRunMode()
	 * @generated
	 */
	int REPORT_RUN_MODE = 3;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.Report.ReportAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract
	 * @generated
	 */
	EClass getReportAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getEngine()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_Engine();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getFormat()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_Format();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#isGenerated()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_Generated();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#getOutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getOutputFile()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_OutputFile();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#getLastGenerated <em>Last Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Generated</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getLastGenerated()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_LastGenerated();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#getRunMode <em>Run Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Mode</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getRunMode()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_RunMode();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#isMayBeRun <em>May Be Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Be Run</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#isMayBeRun()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_MayBeRun();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.Report.ReportAbstract#getMayBeRunFeedback <em>May Be Run Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>May Be Run Feedback</em>'.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getMayBeRunFeedback()
	 * @see #getReportAbstract()
	 * @generated
	 */
	EAttribute getReportAbstract_MayBeRunFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.Report.ReportAbstract#generate() <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#generate()
	 * @generated
	 */
	EOperation getReportAbstract__Generate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.Report.ReportAbstract#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#render()
	 * @generated
	 */
	EOperation getReportAbstract__Render();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.Report.ReportAbstract#write() <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#write()
	 * @generated
	 */
	EOperation getReportAbstract__Write();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.Report.ReportAbstract#getContext() <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context</em>' operation.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#getContext()
	 * @generated
	 */
	EOperation getReportAbstract__GetContext();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.Report.ReportAbstract#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.Report.ReportAbstract#run()
	 * @generated
	 */
	EOperation getReportAbstract__Run();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.Report.ReportEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Engine</em>'.
	 * @see com.misc.common.moplaf.Report.ReportEngine
	 * @generated
	 */
	EEnum getReportEngine();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.Report.ReportRenderFormat <em>Render Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Render Format</em>'.
	 * @see com.misc.common.moplaf.Report.ReportRenderFormat
	 * @generated
	 */
	EEnum getReportRenderFormat();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.Report.ReportRunMode <em>Run Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Run Mode</em>'.
	 * @see com.misc.common.moplaf.Report.ReportRunMode
	 * @generated
	 */
	EEnum getReportRunMode();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.Report.impl.ReportAbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.Report.impl.ReportAbstractImpl
		 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportAbstract()
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
		 * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__GENERATED = eINSTANCE.getReportAbstract_Generated();

		/**
		 * The meta object literal for the '<em><b>Output File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__OUTPUT_FILE = eINSTANCE.getReportAbstract_OutputFile();

		/**
		 * The meta object literal for the '<em><b>Last Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__LAST_GENERATED = eINSTANCE.getReportAbstract_LastGenerated();

		/**
		 * The meta object literal for the '<em><b>Run Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ABSTRACT__RUN_MODE = eINSTANCE.getReportAbstract_RunMode();

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
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___GENERATE = eINSTANCE.getReportAbstract__Generate();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___RENDER = eINSTANCE.getReportAbstract__Render();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___WRITE = eINSTANCE.getReportAbstract__Write();

		/**
		 * The meta object literal for the '<em><b>Get Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___GET_CONTEXT = eINSTANCE.getReportAbstract__GetContext();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPORT_ABSTRACT___RUN = eINSTANCE.getReportAbstract__Run();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.Report.ReportEngine <em>Engine</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.Report.ReportEngine
		 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportEngine()
		 * @generated
		 */
		EEnum REPORT_ENGINE = eINSTANCE.getReportEngine();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.Report.ReportRenderFormat <em>Render Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.Report.ReportRenderFormat
		 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportRenderFormat()
		 * @generated
		 */
		EEnum REPORT_RENDER_FORMAT = eINSTANCE.getReportRenderFormat();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.Report.ReportRunMode <em>Run Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.Report.ReportRunMode
		 * @see com.misc.common.moplaf.Report.impl.ReportPackageImpl#getReportRunMode()
		 * @generated
		 */
		EEnum REPORT_RUN_MODE = eINSTANCE.getReportRunMode();

	}

} //ReportPackage
