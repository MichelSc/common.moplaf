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
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	GisAddress createGisAddress();

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
	 * Returns a new object of class '<em>Distance From Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance From Location</em>'.
	 * @generated
	 */
	GisDistanceFromLocation createGisDistanceFromLocation();

	/**
	 * Returns a new object of class '<em>Distance To Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance To Location</em>'.
	 * @generated
	 */
	GisDistanceToLocation createGisDistanceToLocation();

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
	 * Returns a new object of class '<em>Distance Matrix Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Matrix Calculator</em>'.
	 * @generated
	 */
	GisDistanceMatrixCalculator createGisDistanceMatrixCalculator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GisPackage getGisPackage();

} //GisFactory
