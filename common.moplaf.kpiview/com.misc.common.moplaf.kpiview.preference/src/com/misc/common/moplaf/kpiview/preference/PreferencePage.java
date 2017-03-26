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
package com.misc.common.moplaf.kpiview.preference;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
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
		this.addField(new IntegerFieldEditor(PREF_TILE_SIZE   ,        "Tile Sizes:"    ,       this.getFieldEditorParent()));
		this.addField(new IntegerFieldEditor(PREF_GRID_HORIZONTAL_GAP, "Grid Horizontal Gap:" , this.getFieldEditorParent()));
		this.addField(new IntegerFieldEditor(PREF_GRID_VERTICAL_GAP,   "Grid Vertical Gap:"   , this.getFieldEditorParent()));
		this.addField(new ColorFieldEditor  (PREF_COLOR_BACKGROUND,    "Background:"   ,        this.getFieldEditorParent()));
		this.addField(new ColorFieldEditor  (PREF_COLOR_TEXT,          "Text:"   ,              this.getFieldEditorParent()));
	}

}
