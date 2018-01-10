/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi;

import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

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
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetPOIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spreadsheetpoi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/spreadsheet/poi/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spshpoi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetPOIPackage eINSTANCE = com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIImpl <em>Spreadsheet POI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIImpl
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIPackageImpl#getSpreadsheetPOI()
	 * @generated
	 */
	int SPREADSHEET_POI = 0;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI__SHEETS = SpreadsheetPackage.SPREADSHEET__SHEETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI__NAME = SpreadsheetPackage.SPREADSHEET__NAME;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI__FILES = SpreadsheetPackage.SPREADSHEET__FILES;

	/**
	 * The number of structural features of the '<em>Spreadsheet POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI_FEATURE_COUNT = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI___READ_FILE__FILE = SpreadsheetPackage.SPREADSHEET___READ_FILE__FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI___WRITE_FILE__FILE = SpreadsheetPackage.SPREADSHEET___WRITE_FILE__FILE;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI___GET_SHEET__STRING = SpreadsheetPackage.SPREADSHEET___GET_SHEET__STRING;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI___GET_SHEET__INT = SpreadsheetPackage.SPREADSHEET___GET_SHEET__INT;

	/**
	 * The number of operations of the '<em>Spreadsheet POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI_OPERATION_COUNT = SpreadsheetPackage.SPREADSHEET_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI <em>Spreadsheet POI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet POI</em>'.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI
	 * @generated
	 */
	EClass getSpreadsheetPOI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpreadsheetPOIFactory getSpreadsheetPOIFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIImpl <em>Spreadsheet POI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIImpl
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIPackageImpl#getSpreadsheetPOI()
		 * @generated
		 */
		EClass SPREADSHEET_POI = eINSTANCE.getSpreadsheetPOI();

	}

} //SpreadsheetPOIPackage
