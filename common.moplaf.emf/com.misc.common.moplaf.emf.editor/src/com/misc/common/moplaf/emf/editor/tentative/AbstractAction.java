/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

	public class AbstractAction implements IEditorActionDelegate {
	private Command command = null;
	private IEditorPart editorPart = null;
    private ISelection selection = null;
    
    protected AbstractAction(IEditorPart part, ISelection selection){
    	this.selection = selection;
    	this.editorPart = part;
    }

	protected Command constructCommand(){
		return null;
	}
	
	protected EditingDomain getEditingDomain(){
		IWorkbenchPart activePart = this.editorPart;

		if ( !(activePart instanceof IEditingDomainProvider)){ return null; }
		
		// get editing domain, if any
		IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)activePart;
		
		return editindomainprovider.getEditingDomain();
	}
	
	protected Object getSelectedObject(){
		ISelection selection = this.selection;
		
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
		this.selection = newSelection;

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
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editorPart = targetEditor;
		this.command = null;
		this.selection = null;
	}
	
}  // class body
