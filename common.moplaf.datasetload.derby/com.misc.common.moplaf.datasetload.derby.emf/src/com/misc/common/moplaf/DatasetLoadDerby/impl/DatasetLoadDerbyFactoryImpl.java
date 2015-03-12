/**
 */
package com.misc.common.moplaf.DatasetLoadDerby.impl;

import com.misc.common.moplaf.DatasetLoadDerby.*;

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
public class DatasetLoadDerbyFactoryImpl extends EFactoryImpl implements DatasetLoadDerbyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatasetLoadDerbyFactory init() {
		try {
			DatasetLoadDerbyFactory theDatasetLoadDerbyFactory = (DatasetLoadDerbyFactory)EPackage.Registry.INSTANCE.getEFactory(DatasetLoadDerbyPackage.eNS_URI);
			if (theDatasetLoadDerbyFactory != null) {
				return theDatasetLoadDerbyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasetLoadDerbyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadDerbyFactoryImpl() {
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
			case DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED: return createDataSourceJdbDerbyEmbedded();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceJdbDerbyEmbedded createDataSourceJdbDerbyEmbedded() {
		DataSourceJdbDerbyEmbeddedImpl dataSourceJdbDerbyEmbedded = new DataSourceJdbDerbyEmbeddedImpl();
		return dataSourceJdbDerbyEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadDerbyPackage getDatasetLoadDerbyPackage() {
		return (DatasetLoadDerbyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatasetLoadDerbyPackage getPackage() {
		return DatasetLoadDerbyPackage.eINSTANCE;
	}

} //DatasetLoadDerbyFactoryImpl
