/**
 */
package com.misc.common.moplaf.gis.gisgisgraphy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisGisgraphyPackage
 * @generated
 */
public interface GisGisgraphyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisGisgraphyFactory eINSTANCE = com.misc.common.moplaf.gis.gisgisgraphy.impl.GisGisgraphyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gis Address Geocoder Gisgraphy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gis Address Geocoder Gisgraphy</em>'.
	 * @generated
	 */
	GisAddressGeocoderGisgraphy createGisAddressGeocoderGisgraphy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GisGisgraphyPackage getGisGisgraphyPackage();

} //GisGisgraphyFactory
