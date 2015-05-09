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
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetpoiFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetpoiPackage extends EPackage {
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
	String eNS_URI = "http://com.misc.common.moplaf.spreadsheet.poi.emf";

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
	SpreadsheetpoiPackage eINSTANCE = com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetpoiPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIImpl <em>Spreadsheet POI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetPOIImpl
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetpoiPackageImpl#getSpreadsheetPOI()
	 * @generated
	 */
	int SPREADSHEET_POI = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI__SHEET = SpreadsheetPackage.SPREADSHEET__SHEET;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI__FILE_PATH = SpreadsheetPackage.SPREADSHEET__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI__LABEL = SpreadsheetPackage.SPREADSHEET__LABEL;

	/**
	 * The number of structural features of the '<em>Spreadsheet POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI_FEATURE_COUNT = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI___READ_FILE = SpreadsheetPackage.SPREADSHEET___READ_FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_POI___WRITE_FILE = SpreadsheetPackage.SPREADSHEET___WRITE_FILE;

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
	SpreadsheetpoiFactory getSpreadsheetpoiFactory();

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
		 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetpoiPackageImpl#getSpreadsheetPOI()
		 * @generated
		 */
		EClass SPREADSHEET_POI = eINSTANCE.getSpreadsheetPOI();

	}

} //SpreadsheetpoiPackage
