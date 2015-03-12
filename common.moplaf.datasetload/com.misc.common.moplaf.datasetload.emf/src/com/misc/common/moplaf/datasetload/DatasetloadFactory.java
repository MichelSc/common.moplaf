/**
 */
package com.misc.common.moplaf.datasetload;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage
 * @generated
 */
public interface DatasetloadFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetloadFactory eINSTANCE = com.misc.common.moplaf.datasetload.impl.DatasetloadFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Source Jdbc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Jdbc</em>'.
	 * @generated
	 */
	DataSourceJdbc createDataSourceJdbc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasetloadPackage getDatasetloadPackage();

} //DatasetloadFactory
