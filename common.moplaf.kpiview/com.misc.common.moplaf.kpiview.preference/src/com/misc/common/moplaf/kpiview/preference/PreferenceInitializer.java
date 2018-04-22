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
package com.misc.common.moplaf.kpiview.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PrefConstants{

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.setDefault(PREF_TILE_SIZE,            getDefaultTileSize());
		prefStore.setDefault(PREF_GRID_HORIZONTAL_GAP,  getDefaultHorizontalGap());
		prefStore.setDefault(PREF_GRID_VERTICAL_GAP,    getDefaultVerticalGap());
		prefStore.setDefault(PREF_COLOR_BACKGROUND,     StringConverter.asString(getDefaultBackgroundColor()));
		prefStore.setDefault(PREF_COLOR_TEXT,           StringConverter.asString(getDefaultTextColor()));
	}

	public static int getDefaultTileSize(){ return 172; }
	public static int getDefaultHorizontalGap(){ return 5; }
	public static int getDefaultVerticalGap(){ return 15; }
	public static RGB getDefaultBackgroundColor(){ return new RGB(130, 116, 133); }
	public static RGB getDefaultTextColor()      { return new RGB(150, 150, 150); }
	

}
