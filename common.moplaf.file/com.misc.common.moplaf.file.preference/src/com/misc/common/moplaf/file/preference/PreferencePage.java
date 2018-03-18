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
package com.misc.common.moplaf.file.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
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
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_INFO   , "Log infos:"    , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_WARNING, "Log warnings:" , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_ERROR  , "Log errors:"   , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_SHOW_METADATA , "Show metadata:", this.getFieldEditorParent()));
	}

}
