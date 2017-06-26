/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.timeview.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PrefConstants{

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.setDefault(PREF_GANTT_MAX_DEPTH,        getDefaultMaxDepth());
		prefStore.setDefault(PREF_GANTT_ROW_HEIGHT,       getDefaultRowHeight());
		prefStore.setDefault(PREF_GANTT_EMPTY_ROW_HEIGHT, getDefaultEmptyRowHeight());
	}

	public static int getDefaultMaxDepth()      { return 4; }
	public static int getDefaultRowHeight()     { return 5; }
	public static int getDefaultEmptyRowHeight(){ return 5; }
	

}
