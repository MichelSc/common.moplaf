/**
 */
package com.misc.common.moplaf.DatasetLoadOra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage
 * @generated
 */
public interface DatasetLoadOraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetLoadOraFactory eINSTANCE = com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadOraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dataset Load Jdbc Ora Thin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Load Jdbc Ora Thin</em>'.
	 * @generated
	 */
	DatasetLoadJdbcOraThin createDatasetLoadJdbcOraThin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasetLoadOraPackage getDatasetLoadOraPackage();

} //DatasetLoadOraFactory
