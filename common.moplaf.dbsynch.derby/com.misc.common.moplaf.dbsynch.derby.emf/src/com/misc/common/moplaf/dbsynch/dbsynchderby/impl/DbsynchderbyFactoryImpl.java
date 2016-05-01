/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchderby.impl;

import com.misc.common.moplaf.dbsynch.dbsynchderby.*;

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
public class DbsynchderbyFactoryImpl extends EFactoryImpl implements DbsynchderbyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbsynchderbyFactory init() {
		try {
			DbsynchderbyFactory theDbsynchderbyFactory = (DbsynchderbyFactory)EPackage.Registry.INSTANCE.getEFactory(DbsynchderbyPackage.eNS_URI);
			if (theDbsynchderbyFactory != null) {
				return theDbsynchderbyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DbsynchderbyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchderbyFactoryImpl() {
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
			case DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED: return createDataSourceJdbcDerbyEmbedded();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceJdbcDerbyEmbedded createDataSourceJdbcDerbyEmbedded() {
		DataSourceJdbcDerbyEmbeddedImpl dataSourceJdbcDerbyEmbedded = new DataSourceJdbcDerbyEmbeddedImpl();
		return dataSourceJdbcDerbyEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchderbyPackage getDbsynchderbyPackage() {
		return (DbsynchderbyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DbsynchderbyPackage getPackage() {
		return DbsynchderbyPackage.eINSTANCE;
	}

} //DbsynchderbyFactoryImpl
