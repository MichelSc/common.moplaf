/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetpoiPackage
 * @generated
 */
public interface SpreadsheetpoiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetpoiFactory eINSTANCE = com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl.SpreadsheetpoiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spreadsheet POI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spreadsheet POI</em>'.
	 * @generated
	 */
	SpreadsheetPOI createSpreadsheetPOI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpreadsheetpoiPackage getSpreadsheetpoiPackage();

} //SpreadsheetpoiFactory
