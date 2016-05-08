/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchmysql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage
 * @generated
 */
public interface DbsynchmysqlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbsynchmysqlFactory eINSTANCE = com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DbsynchmysqlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Source Jdbc My Sql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Jdbc My Sql</em>'.
	 * @generated
	 */
	DataSourceJdbcMySql createDataSourceJdbcMySql();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DbsynchmysqlPackage getDbsynchmysqlPackage();

} //DbsynchmysqlFactory
