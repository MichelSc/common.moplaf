package com.misc.common.moplaf.gis.osrm.util;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne;
import com.misc.common.moplaf.gis.osrm.GisOsrmFactory;
import com.misc.common.moplaf.gis.util.RouterFactory;

public class OsrmRouterFactory implements RouterFactory {

	@Override
	public GisDistanceMatrixCalculatorOsrmOneToOne createRouter() {
		return GisOsrmFactory.eINSTANCE.createGisDistanceMatrixCalculatorOsrmOneToOne();
	}

}
