package com.misc.common.moplaf.emf.editor.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.internal.IWorkbenchGraphicConstants;
import org.eclipse.ui.internal.WorkbenchImages;

public class PinViewAction extends Action {
	private final static String text = "Pin this View to the current selection";
	
	public PinViewAction() {
		super(text, IAction.AS_CHECK_BOX);

		/*
		setId(PinPropertySheetAction.class.getName()
				+ "#" + Long.toString(System.currentTimeMillis())); //$NON-NLS-1$
				*/
		setToolTipText(text);
		setImageDescriptor(WorkbenchImages
				.getImageDescriptor(IWorkbenchGraphicConstants.IMG_ETOOL_PIN_EDITOR));
		setDisabledImageDescriptor(WorkbenchImages
				.getImageDescriptor(IWorkbenchGraphicConstants.IMG_ETOOL_PIN_EDITOR_DISABLED));		
	}
}
