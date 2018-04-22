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
