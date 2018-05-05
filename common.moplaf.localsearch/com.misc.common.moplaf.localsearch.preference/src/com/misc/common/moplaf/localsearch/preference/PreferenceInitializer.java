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
package com.misc.common.moplaf.localsearch.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PrefConstants{

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
//		prefStore.setDefault(PREF_LOG_ON_INFO,    false);
//		prefStore.setDefault(PREF_LOG_ON_WARNING, true);
//		prefStore.setDefault(PREF_LOG_ON_ERROR,   true);
		prefStore.setDefault(PREF_MODE_DEBUG,     false);
	}

}
