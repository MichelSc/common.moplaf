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


import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, PrefConstants {

	public PreferencePage() {
		super(GRID);
	}
	
	@Override
	public void init(IWorkbench workbench) {
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		this.addField(new IntegerFieldEditor(PREF_MAP_MAX_DEPTH,        "Map Max Depth:"       , this.getFieldEditorParent()));
		this.addField(new IntegerFieldEditor(PREF_MAP_LOCATION_SIZE,    "Map Location Size:"   , this.getFieldEditorParent()));
		this.addField(new IntegerFieldEditor(PREF_MAP_PATH_WIDTH,       "Map Path Width:"      , this.getFieldEditorParent()));
		this.addField(new StringFieldEditor (PREF_MAP_SERVER_URL,       "MapServer Url:"       , this.getFieldEditorParent()));
		this.addField(new IntegerFieldEditor(PREF_MAP_SERVER_MAX_ZOOM,  "MapServer Max Zoom:"  , this.getFieldEditorParent()));
	}

}
