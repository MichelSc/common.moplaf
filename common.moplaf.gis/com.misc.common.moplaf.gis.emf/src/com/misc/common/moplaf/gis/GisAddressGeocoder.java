/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Geocoder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoder()
 * @model
 * @generated
 */
public interface GisAddressGeocoder extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void geocode(GisAddress address);

} // GisAddressGeocoder
