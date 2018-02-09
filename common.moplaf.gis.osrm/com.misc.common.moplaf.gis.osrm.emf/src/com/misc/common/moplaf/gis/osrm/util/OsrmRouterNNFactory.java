package com.misc.common.moplaf.gis.osrm.util;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany;
import com.misc.common.moplaf.gis.osrm.GisOsrmFactory;
import com.misc.common.moplaf.gis.util.RouterFactory;

public class OsrmRouterNNFactory implements RouterFactory {

	@Override
	public GisDistanceMatrixCalculatorOsrmManyToMany createRouter() {
		return GisOsrmFactory.eINSTANCE.createGisDistanceMatrixCalculatorOsrmManyToMany();
	}

}
