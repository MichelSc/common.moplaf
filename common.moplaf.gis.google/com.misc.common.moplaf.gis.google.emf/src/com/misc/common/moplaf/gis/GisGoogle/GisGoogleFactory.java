/**
 */
package com.misc.common.moplaf.gis.GisGoogle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage
 * @generated
 */
public interface GisGoogleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisGoogleFactory eINSTANCE = com.misc.common.moplaf.gis.GisGoogle.impl.GisGoogleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gis Distance Matrix Calculator Google WS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gis Distance Matrix Calculator Google WS</em>'.
	 * @generated
	 */
	GisDistanceMatrixCalculatorGoogleWS createGisDistanceMatrixCalculatorGoogleWS();

	/**
	 * Returns a new object of class '<em>Gis Address Geocoder Google WS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gis Address Geocoder Google WS</em>'.
	 * @generated
	 */
	GisAddressGeocoderGoogleWS createGisAddressGeocoderGoogleWS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GisGooglePackage getGisGooglePackage();

} //GisGoogleFactory
