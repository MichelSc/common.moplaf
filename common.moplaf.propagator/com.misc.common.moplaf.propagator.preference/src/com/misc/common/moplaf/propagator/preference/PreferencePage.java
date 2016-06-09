package com.misc.common.moplaf.propagator.preference;

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
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_TOUCH  , "Log touchs:"  , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_CALC   , "Log calcs:"   , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_INFO   , "Log infos:"   , this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_WARNING, "Log warnings:", this.getFieldEditorParent()));
		this.addField(new BooleanFieldEditor(PREF_LOG_ON_ERROR  , "Log errors:"  , this.getFieldEditorParent()));
	}

}
