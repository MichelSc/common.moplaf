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
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage
 * @generated
 */
public interface DataextractorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataextractorFactory eINSTANCE = com.misc.common.moplaf.dataextractor.impl.DataextractorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Extractor</em>'.
	 * @generated
	 */
	DataExtractor createDataExtractor();

	/**
	 * Returns a new object of class '<em>Data Sorter Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Sorter Feature</em>'.
	 * @generated
	 */
	DataSorterFeature createDataSorterFeature();

	/**
	 * Returns a new object of class '<em>Data Extractor Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Extractor Reference</em>'.
	 * @generated
	 */
	DataExtractorReference createDataExtractorReference();

	/**
	 * Returns a new object of class '<em>Data Selector Big Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Selector Big Decimal</em>'.
	 * @generated
	 */
	DataSelectorBigDecimal createDataSelectorBigDecimal();

	/**
	 * Returns a new object of class '<em>Data Selector Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Selector Date</em>'.
	 * @generated
	 */
	DataSelectorDate createDataSelectorDate();

	/**
	 * Returns a new object of class '<em>Data Selector String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Selector String</em>'.
	 * @generated
	 */
	DataSelectorString createDataSelectorString();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataextractorPackage getDataextractorPackage();

} //DataextractorFactory
