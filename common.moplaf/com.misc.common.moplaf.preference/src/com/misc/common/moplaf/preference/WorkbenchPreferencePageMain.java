package com.misc.common.moplaf.preference;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class WorkbenchPreferencePageMain extends PreferencePage implements IWorkbenchPreferencePage {

	public WorkbenchPreferencePageMain() {
		// TODO Auto-generated constructor stub
	}

	public WorkbenchPreferencePageMain(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public WorkbenchPreferencePageMain(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
