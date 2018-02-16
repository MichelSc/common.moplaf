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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.Plugin;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void geocode(GisAddress address) {
		if ( address == null )  return;
		address.setSelectedGeocodedLocation(null);
		Plugin.INSTANCE.logInfo("GisGeocoder.geocode: called");
		this.geocodeImpl(address);
		if ( address.getGeocodedAddresses().size()>0 ) {
			address.setSelectedGeocodedLocation(address.getGeocodedAddresses().get(0));
		}
		Plugin.INSTANCE.logInfo("GisGeocoder.geocode: done");
	}
	
	protected void geocodeImpl(GisAddress address) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GisPackage.GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS:
				geocode((GisAddress)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisAddressGeocoderImpl
