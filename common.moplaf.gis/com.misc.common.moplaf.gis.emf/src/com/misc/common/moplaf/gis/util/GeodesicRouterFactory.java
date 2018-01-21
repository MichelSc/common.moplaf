package com.misc.common.moplaf.gis.util;

import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisRouteCalculator;

public class GeodesicRouterFactory implements RouterFactory {

	@Override
	public GisRouteCalculator createRouter() {
		return GisFactory.eINSTANCE.createGisRouterGeodesic();
	}

}
