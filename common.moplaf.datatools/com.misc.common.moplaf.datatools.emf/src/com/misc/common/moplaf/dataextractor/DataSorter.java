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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Sorter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSorter#getSequence <em>Sequence</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSorter#getSense <em>Sense</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSorter#getDataExtractor <em>Data Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSorter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorter()
 * @model abstract="true"
 * @generated
 */
public interface DataSorter extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorter_Sequence()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getSequence();

	/**
	 * Returns the value of the '<em><b>Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dataextractor.DataSorterSense}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sense</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataSorterSense
	 * @see #setSense(DataSorterSense)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorter_Sense()
	 * @model
	 * @generated
	 */
	DataSorterSense getSense();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataSorter#getSense <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sense</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataSorterSense
	 * @see #getSense()
	 * @generated
	 */
	void setSense(DataSorterSense value);

	/**
	 * Returns the value of the '<em><b>Data Extractor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSorters <em>Sorters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Extractor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Extractor</em>' container reference.
	 * @see #setDataExtractor(DataExtractor)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorter_DataExtractor()
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getSorters
	 * @model opposite="Sorters" required="true" transient="false"
	 * @generated
	 */
	DataExtractor getDataExtractor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataSorter#getDataExtractor <em>Data Extractor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Extractor</em>' container reference.
	 * @see #getDataExtractor()
	 * @generated
	 */
	void setDataExtractor(DataExtractor value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorter_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int compare(EObject object1, EObject object2);

} // DataSorter
