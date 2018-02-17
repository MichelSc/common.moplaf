package com.misc.common.moplaf.gis.osrm.util;

import com.misc.common.moplaf.gis.osrm.GisOsrmFactory;
import com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest;
import com.misc.common.moplaf.gis.util.PinpointerFactory;

public class OsrmPinpointerFactory implements PinpointerFactory {

	@Override
	public GisPinpointerOsrmNearest createPinpointer() {
		return GisOsrmFactory.eINSTANCE.createGisPinpointerOsrmNearest();
	}

}
