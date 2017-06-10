/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage
 * @generated
 */
public interface SpreadsheetCSVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetCSVFactory eINSTANCE = com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl.SpreadsheetCSVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spreadsheet CSV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spreadsheet CSV</em>'.
	 * @generated
	 */
	SpreadsheetCSV createSpreadsheetCSV();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpreadsheetCSVPackage getSpreadsheetCSVPackage();

} //SpreadsheetCSVFactory
