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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Geocoder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoder()
 * @model abstract="true"
 * @generated
 */
public interface GisAddressGeocoder extends GisToolLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void geocode(GisAddress address);

} // GisAddressGeocoder
