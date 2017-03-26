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
package com.misc.common.moplaf.gis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.GisPackage
 * @generated
 */
public interface GisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisFactory eINSTANCE = com.misc.common.moplaf.gis.impl.GisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	GisCoordinates createGisCoordinates();

	/**
	 * Returns a new object of class '<em>Distance Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Matrix</em>'.
	 * @generated
	 */
	GisDistanceMatrix createGisDistanceMatrix();

	/**
	 * Returns a new object of class '<em>Distance Matrix Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Matrix Element</em>'.
	 * @generated
	 */
	GisDistanceMatrixElement createGisDistanceMatrixElement();

	/**
	 * Returns a new object of class '<em>Distance Matrix From Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Matrix From Location</em>'.
	 * @generated
	 */
	GisDistanceMatrixFromLocation createGisDistanceMatrixFromLocation();

	/**
	 * Returns a new object of class '<em>Distance Matrix To Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Matrix To Location</em>'.
	 * @generated
	 */
	GisDistanceMatrixToLocation createGisDistanceMatrixToLocation();

	/**
	 * Returns a new object of class '<em>Address Geocoded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Geocoded</em>'.
	 * @generated
	 */
	GisAddressGeocoded createGisAddressGeocoded();

	/**
	 * Returns a new object of class '<em>Address Geocoder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Geocoder</em>'.
	 * @generated
	 */
	GisAddressGeocoder createGisAddressGeocoder();

	/**
	 * Returns a new object of class '<em>Address Structured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Structured</em>'.
	 * @generated
	 */
	GisAddressStructured createGisAddressStructured();

	/**
	 * Returns a new object of class '<em>Address Unstructured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Unstructured</em>'.
	 * @generated
	 */
	GisAddressUnstructured createGisAddressUnstructured();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GisPackage getGisPackage();

} //GisFactory
