/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchderby;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage
 * @generated
 */
public interface DbsynchderbyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbsynchderbyFactory eINSTANCE = com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DbsynchderbyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Source Jdbc Derby Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Jdbc Derby Embedded</em>'.
	 * @generated
	 */
	DataSourceJdbcDerbyEmbedded createDataSourceJdbcDerbyEmbedded();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DbsynchderbyPackage getDbsynchderbyPackage();

} //DbsynchderbyFactory
