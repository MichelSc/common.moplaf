/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.emf.editor.tentative;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;

public class AbstractAction3 extends WorkbenchWindowActionDelegate {
	private Command command = null;

	protected Command constructCommand(){
		return null;
	}
	
	protected EditingDomain getEditingDomain(){
		IWorkbenchWindow window = this.getWindow();
		IWorkbenchPage activePage = window.getActivePage();
		IWorkbenchPart activePart = activePage.getActivePart();

		if ( !(activePart instanceof IEditingDomainProvider)){ return null; }
		
		// get editing domain, if any
		IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)activePart;
		
		return editindomainprovider.getEditingDomain();
	}
	
	protected Object getSelectedObject(){
		ISelection selection = this.getSelection();
		
		if( !(selection instanceof IStructuredSelection) ) { return null; }
		IStructuredSelection structuredselection = (IStructuredSelection)selection;

		if ( structuredselection.size()!=1 ) { return null; }

		return structuredselection.getFirstElement();
	}


	@Override
	public void run(IAction action) {
		this.command.execute();
	}  // run method
	
	@Override
	public void selectionChanged(IAction action, ISelection newSelection) {
		// change the selection
		//ISelection oldSelection = this.getSelection();
		super.selectionChanged(action, newSelection);
		
		// get the command object
		
		boolean enabled = false;
		Command  currentCommand = this.constructCommand();
		if ( currentCommand != null ){
			enabled = currentCommand.canExecute();
			if ( enabled) {
				this.command = currentCommand;
			}
		}
		action.setEnabled(enabled);

	}

	@Override
	public void dispose() {
		super.dispose();
		this.command = null;
	}
	
	
}  // class body
