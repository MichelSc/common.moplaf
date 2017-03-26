/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DataextractorFactoryImpl extends EFactoryImpl implements DataextractorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataextractorFactory init() {
		try {
			DataextractorFactory theDataextractorFactory = (DataextractorFactory)EPackage.Registry.INSTANCE.getEFactory(DataextractorPackage.eNS_URI);
			if (theDataextractorFactory != null) {
				return theDataextractorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataextractorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataextractorFactoryImpl() {
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
			case DataextractorPackage.DATA_EXTRACTOR: return createDataExtractor();
			case DataextractorPackage.DATA_SORTER_FEATURE: return createDataSorterFeature();
			case DataextractorPackage.DATA_EXTRACTOR_REFERENCE: return createDataExtractorReference();
			case DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL: return createDataSelectorBigDecimal();
			case DataextractorPackage.DATA_SELECTOR_DATE: return createDataSelectorDate();
			case DataextractorPackage.DATA_SELECTOR_STRING: return createDataSelectorString();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataextractorPackage.DATA_SORTER_SENSE:
				return createDataSorterSenseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataextractorPackage.DATA_SORTER_SENSE:
				return convertDataSorterSenseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractor createDataExtractor() {
		DataExtractorImpl dataExtractor = new DataExtractorImpl();
		return dataExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSorterFeature createDataSorterFeature() {
		DataSorterFeatureImpl dataSorterFeature = new DataSorterFeatureImpl();
		return dataSorterFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractorReference createDataExtractorReference() {
		DataExtractorReferenceImpl dataExtractorReference = new DataExtractorReferenceImpl();
		return dataExtractorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSelectorBigDecimal createDataSelectorBigDecimal() {
		DataSelectorBigDecimalImpl dataSelectorBigDecimal = new DataSelectorBigDecimalImpl();
		return dataSelectorBigDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSelectorDate createDataSelectorDate() {
		DataSelectorDateImpl dataSelectorDate = new DataSelectorDateImpl();
		return dataSelectorDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSelectorString createDataSelectorString() {
		DataSelectorStringImpl dataSelectorString = new DataSelectorStringImpl();
		return dataSelectorString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSorterSense createDataSorterSenseFromString(EDataType eDataType, String initialValue) {
		DataSorterSense result = DataSorterSense.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSorterSenseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataextractorPackage getDataextractorPackage() {
		return (DataextractorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataextractorPackage getPackage() {
		return DataextractorPackage.eINSTANCE;
	}

} //DataextractorFactoryImpl
