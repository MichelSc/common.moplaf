package com.misc.common.moplaf.emf.editor.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.misc.common.moplaf.emf.edit.command.RefreshCommand;


public class Refresh extends AbstractHandler {
	private EditingDomain editingDomain = null;
	private Command command = null;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.refresh(event);
		if (editingDomain != null && command != null && command.canExecute() ){
			editingDomain.getCommandStack().execute(command);
		}
		return null;
	}
	
	void refresh(ExecutionEvent event) {
		this.editingDomain = null;
		this.command = null;

		// get the selection
		ISelection s = HandlerUtil.getCurrentSelection(event);
		if ( !(s instanceof IStructuredSelection) ) {
			return;
		}
		IStructuredSelection selection = (IStructuredSelection) s;
		List<?> list = selection.toList();
		if ( list.size()!=1 )  {
			return;
		}
		Object owner = list.get(0);

		// get the editing domain
		this.editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
		if (this.editingDomain == null) {
			return;
		}

		// get the command
		this.command = RefreshCommand.create(editingDomain, owner);
		if ( this.command==null ) {
			return;
		}
	} // method refresh

}
