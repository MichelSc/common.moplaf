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
