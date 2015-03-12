/**
 */
package com.misc.common.moplaf.DatasetLoadMariaDb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage
 * @generated
 */
public interface DatasetLoadMariaDbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetLoadMariaDbFactory eINSTANCE = com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadMariaDbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dataset Load Jdbc Maria Db</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Load Jdbc Maria Db</em>'.
	 * @generated
	 */
	DatasetLoadJdbcMariaDb createDatasetLoadJdbcMariaDb();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasetLoadMariaDbPackage getDatasetLoadMariaDbPackage();

} //DatasetLoadMariaDbFactory
