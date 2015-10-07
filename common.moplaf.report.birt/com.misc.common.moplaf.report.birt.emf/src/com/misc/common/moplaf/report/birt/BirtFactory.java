/**
 */
package com.misc.common.moplaf.report.birt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.report.birt.BirtPackage
 * @generated
 */
public interface BirtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BirtFactory eINSTANCE = com.misc.common.moplaf.report.birt.impl.BirtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Report Birt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Birt</em>'.
	 * @generated
	 */
	ReportBirt createReportBirt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BirtPackage getBirtPackage();

} //BirtFactory
