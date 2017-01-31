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
