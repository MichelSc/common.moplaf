/**
 */
package com.misc.common.moplaf.report.birt;

import com.misc.common.moplaf.report.ReportPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see com.misc.common.moplaf.report.birt.BirtFactory
 * @model kind="package"
 * @generated
 */
public interface BirtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "birt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/report/birt/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rptb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BirtPackage eINSTANCE = com.misc.common.moplaf.report.birt.impl.BirtPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.report.birt.impl.ReportBirtImpl <em>Report Birt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.report.birt.impl.ReportBirtImpl
	 * @see com.misc.common.moplaf.report.birt.impl.BirtPackageImpl#getReportBirt()
	 * @generated
	 */
	int REPORT_BIRT = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__FORMAT = ReportPackage.REPORT_ABSTRACT__FORMAT;

	/**
	 * The feature id for the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__OUTPUT_FILE_PATH = ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Last Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__LAST_GENERATED = ReportPackage.REPORT_ABSTRACT__LAST_GENERATED;

	/**
	 * The feature id for the '<em><b>May Be Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__MAY_BE_RUN = ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN;

	/**
	 * The feature id for the '<em><b>May Be Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__MAY_BE_RUN_FEEDBACK = ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Report Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__REPORT_CONTEXT = ReportPackage.REPORT_ABSTRACT__REPORT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT__DESCRIPTION = ReportPackage.REPORT_ABSTRACT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Report Birt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT_FEATURE_COUNT = ReportPackage.REPORT_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT___RUN = ReportPackage.REPORT_ABSTRACT___RUN;

	/**
	 * The operation id for the '<em>Get Report Design File URL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT___GET_REPORT_DESIGN_FILE_URL = ReportPackage.REPORT_ABSTRACT___GET_REPORT_DESIGN_FILE_URL;

	/**
	 * The number of operations of the '<em>Report Birt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_BIRT_OPERATION_COUNT = ReportPackage.REPORT_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.report.birt.ReportBirt <em>Report Birt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Birt</em>'.
	 * @see com.misc.common.moplaf.report.birt.ReportBirt
	 * @generated
	 */
	EClass getReportBirt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BirtFactory getBirtFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.report.birt.impl.ReportBirtImpl <em>Report Birt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.report.birt.impl.ReportBirtImpl
		 * @see com.misc.common.moplaf.report.birt.impl.BirtPackageImpl#getReportBirt()
		 * @generated
		 */
		EClass REPORT_BIRT = eINSTANCE.getReportBirt();

	}

} //BirtPackage
