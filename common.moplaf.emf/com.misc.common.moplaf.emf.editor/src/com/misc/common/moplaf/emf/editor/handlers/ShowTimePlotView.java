package com.misc.common.moplaf.emf.editor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.emf.editor.Util;

public class ShowTimePlotView extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		try {
			Util.showView(window.getActivePage(), "com.misc.common.moplaf.timeview.nebula.views.TimePlotView");
		}
		catch (PartInitException exception) {
			Plugin.INSTANCE.logError("ShowTimePlotView.execute: exception " + exception.getMessage());
		}

		return null;
	}

}
