/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchmysql.impl;

import com.misc.common.moplaf.dbsynch.dbsynchmysql.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbsynchmysqlFactoryImpl extends EFactoryImpl implements DbsynchmysqlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbsynchmysqlFactory init() {
		try {
			DbsynchmysqlFactory theDbsynchmysqlFactory = (DbsynchmysqlFactory)EPackage.Registry.INSTANCE.getEFactory(DbsynchmysqlPackage.eNS_URI);
			if (theDbsynchmysqlFactory != null) {
				return theDbsynchmysqlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DbsynchmysqlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchmysqlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL: return createDataSourceJdbcMySql();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceJdbcMySql createDataSourceJdbcMySql() {
		DataSourceJdbcMySqlImpl dataSourceJdbcMySql = new DataSourceJdbcMySqlImpl();
		return dataSourceJdbcMySql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchmysqlPackage getDbsynchmysqlPackage() {
		return (DbsynchmysqlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DbsynchmysqlPackage getPackage() {
		return DbsynchmysqlPackage.eINSTANCE;
	}

} //DbsynchmysqlFactoryImpl
