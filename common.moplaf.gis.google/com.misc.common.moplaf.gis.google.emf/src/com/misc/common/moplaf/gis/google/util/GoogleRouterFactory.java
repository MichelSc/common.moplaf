package com.misc.common.moplaf.gis.google.util;

import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.google.GisGoogleFactory;
import com.misc.common.moplaf.gis.util.RouterFactory;

public class GoogleRouterFactory implements RouterFactory {

	@Override
	public GisRouteCalculator createRouter() {
		return GisGoogleFactory.eINSTANCE.createGisDistanceMatrixCalculatorGoogleWS();
	}

}
