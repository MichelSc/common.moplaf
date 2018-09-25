package com.misc.common.moplaf.emf.editor.menus;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.editor.action.AcceptAction;
import com.misc.common.moplaf.emf.editor.action.AppendAction;
import com.misc.common.moplaf.emf.editor.action.CancelAction;
import com.misc.common.moplaf.emf.editor.action.ClearAction;
import com.misc.common.moplaf.emf.editor.action.CloneAction;
import com.misc.common.moplaf.emf.editor.action.CloseAction;
import com.misc.common.moplaf.emf.editor.action.CommitAction;
import com.misc.common.moplaf.emf.editor.action.ConnectAction;
import com.misc.common.moplaf.emf.editor.action.DisableAction;
import com.misc.common.moplaf.emf.editor.action.DisconnectAction;
import com.misc.common.moplaf.emf.editor.action.DoAction;
import com.misc.common.moplaf.emf.editor.action.EnableAction;
import com.misc.common.moplaf.emf.editor.action.ExportAction;
import com.misc.common.moplaf.emf.editor.action.FinalizeAction;
import com.misc.common.moplaf.emf.editor.action.FlushAction;
import com.misc.common.moplaf.emf.editor.action.GarbageCollectAction;
import com.misc.common.moplaf.emf.editor.action.ImportAction;
import com.misc.common.moplaf.emf.editor.action.InitializeAction;
import com.misc.common.moplaf.emf.editor.action.ReadAction;
import com.misc.common.moplaf.emf.editor.action.RefreshAction;
import com.misc.common.moplaf.emf.editor.action.RefreshMetaDataAction;
import com.misc.common.moplaf.emf.editor.action.ResetAction;
import com.misc.common.moplaf.emf.editor.action.RollbackAction;
import com.misc.common.moplaf.emf.editor.action.RunAction;
import com.misc.common.moplaf.emf.editor.action.RunBackgroundAction;
import com.misc.common.moplaf.emf.editor.action.SaveAction;
import com.misc.common.moplaf.emf.editor.action.SelectAction;
import com.misc.common.moplaf.emf.editor.action.SortAction;
import com.misc.common.moplaf.emf.editor.action.StartAction;
import com.misc.common.moplaf.emf.editor.action.StopAction;
import com.misc.common.moplaf.emf.editor.action.SynchDownAction;
import com.misc.common.moplaf.emf.editor.action.SynchUpAction;
import com.misc.common.moplaf.emf.editor.action.TestAction;
import com.misc.common.moplaf.emf.editor.action.UndoAction;
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
		manager.add(new ActionContributionMenu(new AcceptAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new AppendAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new CancelAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new ClearAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new CloneAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new CloseAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new CommitAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new ConnectAction       	(part, selection)));
		manager.add(new ActionContributionMenu(new DisableAction       	(part, selection)));
		manager.add(new ActionContributionMenu(new DisconnectAction    	(part, selection)));
		manager.add(new ActionContributionMenu(new DoAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new EnableAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new ExportAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new FinalizeAction      	(part, selection)));
		manager.add(new ActionContributionMenu(new FlushAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new GarbageCollectAction	(part, selection)));
		manager.add(new ActionContributionMenu(new ImportAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new InitializeAction    	(part, selection)));
		manager.add(new ActionContributionMenu(new ReadAction          	(part, selection)));
		manager.add(new ActionContributionMenu(new RefreshAction       	(part, selection)));
		manager.add(new ActionContributionMenu(new RefreshMetaDataAction(part, selection)));
		manager.add(new ActionContributionMenu(new ResetAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new RollbackAction      	(part, selection)));
		manager.add(new ActionContributionMenu(new RunAction           	(part, selection)));
		manager.add(new ActionContributionMenu(new RunBackgroundAction 	(part, selection)));
		manager.add(new ActionContributionMenu(new SaveAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new SelectAction        	(part, selection)));
		manager.add(new ActionContributionMenu(new SortAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new StartAction         	(part, selection)));
		manager.add(new ActionContributionMenu(new StopAction			(part, selection)));
		manager.add(new ActionContributionMenu(new SynchDownAction		(part, selection)));
		manager.add(new ActionContributionMenu(new SynchUpAction		(part, selection)));
		manager.add(new ActionContributionMenu(new TestAction			(part, selection)));
		manager.add(new ActionContributionMenu(new UndoAction			(part, selection)));
		manager.add(new ActionContributionMenu(new WriteAction         	(part, selection)));		
	}
}