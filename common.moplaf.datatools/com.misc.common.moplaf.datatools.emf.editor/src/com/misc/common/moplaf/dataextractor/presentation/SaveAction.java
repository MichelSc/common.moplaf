package com.misc.common.moplaf.dataextractor.presentation;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.dataextractor.provider.SaveCommand;

public class SaveAction extends Action {
		public final static String ID = "com.misc.common.moplaf.datatools.SaveActionID";

		Command currentCommand = null;
		EditingDomain editingDomain = null;


		public SaveAction()	{
			setId(ID);
			setText("Save");
			setToolTipText("Save");
			//setImageDescriptor();
		}

		public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
			boolean enabled = false;
			String tooltip = "Save the object";
			currentCommand = null;
			editingDomain = null;
			if ( part != null  && incomingselection instanceof IStructuredSelection ) {
				IStructuredSelection structuredselection = (IStructuredSelection)incomingselection;
				if ( structuredselection.size()==1 ) {
					if ( part instanceof IEditingDomainProvider){
						IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)part;
						Object selection = structuredselection.getFirstElement();
						editingDomain = editindomainprovider.getEditingDomain();
						currentCommand = SaveCommand.create(editingDomain, selection);
						if ( currentCommand!=null){
							enabled = currentCommand.canExecute();
	     				}
					}
				}
			}
			setEnabled(enabled);
			setToolTipText(tooltip);
		} // selectionChanged method
		
		public void run()	{
			editingDomain.getCommandStack().execute(currentCommand);
		} // run method
	}  // class ConnectAction
