package com.misc.common.moplaf.emf.editor.menus;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.editor.action.AcceptAction;
import com.misc.common.moplaf.emf.editor.action.CloseAction;
import com.misc.common.moplaf.emf.editor.action.ExportAction;
import com.misc.common.moplaf.emf.editor.action.FlushAction;
import com.misc.common.moplaf.emf.editor.action.GarbageCollectAction;
import com.misc.common.moplaf.emf.editor.action.ImportAction;
import com.misc.common.moplaf.emf.editor.action.ReadAction;
import com.misc.common.moplaf.emf.editor.action.RefreshAction;
import com.misc.common.moplaf.emf.editor.action.ResetAction;
import com.misc.common.moplaf.emf.editor.action.RunAction;
import com.misc.common.moplaf.emf.editor.action.RunBackgroundAction;
import com.misc.common.moplaf.emf.editor.action.TestAction;
import com.misc.common.moplaf.emf.editor.action.WriteAction;

public class ActionContributionMenu  extends ActionContributionItem {
	@Override
	public boolean isVisible() {
		return this.getAction().isEnabled();
	}

	public ActionContributionMenu(IAction action) {
		super(action);
	}
	
	public static void fillDefaultMenu(IMenuManager manager, IWorkbenchPart part, ISelection selection) {
		manager.add(new ActionContributionMenu(new ReadAction          	(part, selection)));
		manager.add(new ActionContributionMenu(new WriteAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new CloseAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new ImportAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new ExportAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new AcceptAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new RunAction           	(part, selection)));
		manager.add(new ActionContributionMenu(new RunBackgroundAction 	(part, selection)));
		manager.add(new ActionContributionMenu(new RefreshAction       	(part, selection)));
		manager.add(new ActionContributionMenu(new ResetAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new FlushAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new GarbageCollectAction	(part, selection)));
		
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		manager.add(new ActionContributionMenu(new TestAction			(part, selection)));
	}
}