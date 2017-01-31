package com.misc.common.moplaf.kpiview.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PrefConstants{

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.setDefault(PREF_TILE_SIZE,           172);
		prefStore.setDefault(PREF_GRID_HORIZONTAL_GAP,   5);
		prefStore.setDefault(PREF_GRID_VERTICAL_GAP,    15);
	}

}
