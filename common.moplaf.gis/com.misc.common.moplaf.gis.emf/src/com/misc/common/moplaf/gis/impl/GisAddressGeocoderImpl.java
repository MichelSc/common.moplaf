/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Geocoder</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GisAddressGeocoderImpl extends GisToolLocationImpl implements GisAddressGeocoder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocoderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ADDRESS_GEOCODER;
	}

	@Override
	protected void handleImpl(GisLocationTool location) {
		
		assert location.getLocation() instanceof GisAddress;
		GisAddress address = (GisAddress) location.getLocation();
		address.setGeocodedSelected(null);
		location.flushResults();
		
		this.geocodeImpl(location);
	}
	
	protected void geocodeImpl(GisLocationTool address) {
		
	}
	
	

} //GisAddressGeocoderImpl
