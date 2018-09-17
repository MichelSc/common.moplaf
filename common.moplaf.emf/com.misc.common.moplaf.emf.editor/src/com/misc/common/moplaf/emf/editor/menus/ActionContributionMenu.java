package com.misc.common.moplaf.emf.editor.menus;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.editor.action.TestAction;

public class ActionContributionMenu  extends ActionContributionItem {
	@Override
	public boolean isVisible() {
		return this.getAction().isEnabled();
	}

	public ActionContributionMenu(IAction action) {
		super(action);
	}
	
	public static void fillDefaultMenu(IMenuManager manager, IWorkbenchPart part, ISelection selection) {
		manager.add(new ActionContributionMenu(new TestAction( part, selection)));
		
	}
}