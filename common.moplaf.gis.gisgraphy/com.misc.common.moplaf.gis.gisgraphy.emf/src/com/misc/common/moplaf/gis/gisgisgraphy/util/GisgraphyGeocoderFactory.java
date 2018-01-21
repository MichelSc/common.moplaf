package com.misc.common.moplaf.gis.gisgisgraphy.util;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.gisgisgraphy.GisGisgraphyFactory;
import com.misc.common.moplaf.gis.util.GeocoderFactory;

public class GisgraphyGeocoderFactory implements GeocoderFactory{

	@Override
	public GisAddressGeocoder createGeocoder() {
		return GisGisgraphyFactory.eINSTANCE.createGisAddressGeocoderGisgraphy();
	}

}
