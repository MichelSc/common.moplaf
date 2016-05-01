package com.misc.common.moplaf.dbsynch.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PrefConstants{

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.setDefault(PREF_LOG_ON_INFO,    false);
		prefStore.setDefault(PREF_LOG_ON_WARNING, true);
		prefStore.setDefault(PREF_LOG_ON_ERROR,   true);
	}

}
