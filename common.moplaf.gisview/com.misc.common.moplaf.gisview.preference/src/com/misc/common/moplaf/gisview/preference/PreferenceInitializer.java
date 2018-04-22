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
package com.misc.common.moplaf.gisview.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PrefConstants{

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.setDefault(PREF_MAP_MAX_DEPTH,        getDefaultMapMaxDepth());
		prefStore.setDefault(PREF_MAP_LOCATION_SIZE,    getDefaultMapLocationSize());
		prefStore.setDefault(PREF_MAP_PATH_WIDTH,       getDefaultMapPathWidth());
		prefStore.setDefault(PREF_MAP_SERVER_URL,       getDefaultMapServerUrl());
		prefStore.setDefault(PREF_MAP_SERVER_MAX_ZOOM,  getDefaultMapServerMaxZoom());
	}

	public static int    getDefaultMapMaxDepth()      { return 4; }
	public static int    getDefaultMapLocationSize()  { return 6; }
	public static int    getDefaultMapPathWidth()     { return 3; }
	public static String getDefaultMapServerUrl()     { return "http://a.tile.openstreetmap.org/"; }
	public static int    getDefaultMapServerMaxZoom() { return 18; }
}
