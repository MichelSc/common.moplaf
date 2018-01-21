package com.misc.common.moplaf.gis.google.util;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.google.GisGoogleFactory;
import com.misc.common.moplaf.gis.util.GeocoderFactory;

public class GoogleGeocoderFactory implements GeocoderFactory {

	@Override
	public GisAddressGeocoder createGeocoder() {
		return GisGoogleFactory.eINSTANCE.createGisAddressGeocoderGoogleWS();
	}

}
