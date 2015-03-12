/**
 */
package com.misc.common.moplaf.DatasetLoadOra.impl;

import com.misc.common.moplaf.DatasetLoadOra.*;

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
public class DatasetLoadOraFactoryImpl extends EFactoryImpl implements DatasetLoadOraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatasetLoadOraFactory init() {
		try {
			DatasetLoadOraFactory theDatasetLoadOraFactory = (DatasetLoadOraFactory)EPackage.Registry.INSTANCE.getEFactory(DatasetLoadOraPackage.eNS_URI);
			if (theDatasetLoadOraFactory != null) {
				return theDatasetLoadOraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasetLoadOraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadOraFactoryImpl() {
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
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN: return createDatasetLoadJdbcOraThin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadJdbcOraThin createDatasetLoadJdbcOraThin() {
		DatasetLoadJdbcOraThinImpl datasetLoadJdbcOraThin = new DatasetLoadJdbcOraThinImpl();
		return datasetLoadJdbcOraThin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadOraPackage getDatasetLoadOraPackage() {
		return (DatasetLoadOraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatasetLoadOraPackage getPackage() {
		return DatasetLoadOraPackage.eINSTANCE;
	}

} //DatasetLoadOraFactoryImpl
