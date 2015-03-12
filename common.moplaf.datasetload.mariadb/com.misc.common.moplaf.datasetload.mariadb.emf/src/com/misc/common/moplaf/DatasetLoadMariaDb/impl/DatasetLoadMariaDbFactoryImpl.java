/**
 */
package com.misc.common.moplaf.DatasetLoadMariaDb.impl;

import com.misc.common.moplaf.DatasetLoadMariaDb.*;

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
public class DatasetLoadMariaDbFactoryImpl extends EFactoryImpl implements DatasetLoadMariaDbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatasetLoadMariaDbFactory init() {
		try {
			DatasetLoadMariaDbFactory theDatasetLoadMariaDbFactory = (DatasetLoadMariaDbFactory)EPackage.Registry.INSTANCE.getEFactory(DatasetLoadMariaDbPackage.eNS_URI);
			if (theDatasetLoadMariaDbFactory != null) {
				return theDatasetLoadMariaDbFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasetLoadMariaDbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadMariaDbFactoryImpl() {
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
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB: return createDatasetLoadJdbcMariaDb();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadJdbcMariaDb createDatasetLoadJdbcMariaDb() {
		DatasetLoadJdbcMariaDbImpl datasetLoadJdbcMariaDb = new DatasetLoadJdbcMariaDbImpl();
		return datasetLoadJdbcMariaDb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadMariaDbPackage getDatasetLoadMariaDbPackage() {
		return (DatasetLoadMariaDbPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatasetLoadMariaDbPackage getPackage() {
		return DatasetLoadMariaDbPackage.eINSTANCE;
	}

} //DatasetLoadMariaDbFactoryImpl
