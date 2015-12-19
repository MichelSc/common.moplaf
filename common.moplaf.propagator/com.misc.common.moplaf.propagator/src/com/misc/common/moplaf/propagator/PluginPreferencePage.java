package com.misc.common.moplaf.propagator;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class PluginPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, PrefConstants {
	
	private IPreferenceStore preferenceStore = null;
	
	public PluginPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		this.preferenceStore = PlatformUI.getPreferenceStore();
		this.setPreferenceStore(this.preferenceStore);
	}

	@Override
	protected void createFieldEditors() {
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_INFO   , "Log infos:"   , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_WARNING, "Log warnings:", this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_ERROR  , "Log errors:"  , this.getFieldEditorParent()));
	}
}
