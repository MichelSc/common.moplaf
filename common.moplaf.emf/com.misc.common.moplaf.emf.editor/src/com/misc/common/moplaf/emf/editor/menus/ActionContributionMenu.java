package com.misc.common.moplaf.emf.editor.menus;

import java.util.ArrayList;
import java.util.Collection;

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
		return this.getAction().isEnabled() || this.getAction().getText() != null;
	}

	public ActionContributionMenu(IAction action) {
		super(action);
	}
	
	public static Collection<IAction> getDefaultActions(IWorkbenchPart part, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		actions.add(new AcceptAction        	(part, selection));
		actions.add(new AppendAction        	(part, selection));
		actions.add(new CancelAction        	(part, selection));
		actions.add(new ClearAction        		(part, selection));
		actions.add(new CloneAction         	(part, selection));
		actions.add(new CloseAction         	(part, selection));
		actions.add(new CommitAction        	(part, selection));
		actions.add(new ConnectAction       	(part, selection));
		actions.add(new DisableAction       	(part, selection));
		actions.add(new DisconnectAction    	(part, selection));
		actions.add(new DoAction         		(part, selection));
		actions.add(new EnableAction        	(part, selection));
		actions.add(new ExportAction        	(part, selection));
		actions.add(new FinalizeAction      	(part, selection));
		actions.add(new FlushAction         	(part, selection));
		actions.add(new GarbageCollectAction	(part, selection));
		actions.add(new ImportAction        	(part, selection));
		actions.add(new InitializeAction    	(part, selection));
		actions.add(new ReadAction          	(part, selection));
		actions.add(new RefreshAction       	(part, selection));
		actions.add(new RefreshMetaDataAction	(part, selection));
		actions.add(new ResetAction         	(part, selection));
		actions.add(new RollbackAction      	(part, selection));
		actions.add(new RunAction           	(part, selection));
		actions.add(new RunBackgroundAction 	(part, selection));
		actions.add(new SaveAction         		(part, selection));
		actions.add(new SelectAction        	(part, selection));
		actions.add(new SortAction         		(part, selection));
		actions.add(new StartAction         	(part, selection));
		actions.add(new StopAction				(part, selection));
		actions.add(new SynchDownAction			(part, selection));
		actions.add(new SynchUpAction			(part, selection));
		actions.add(new TestAction				(part, selection));
		actions.add(new UndoAction				(part, selection));
		actions.add(new WriteAction         	(part, selection));		
		return actions;
	}
	
	public static void fillDefaultMenu(IMenuManager manager, IWorkbenchPart part, ISelection selection) {
		Collection<IAction> actions = ActionContributionMenu.getDefaultActions(part, selection);
		for ( IAction action : actions) {
			manager.add(new ActionContributionMenu(action));
		}
	}
}