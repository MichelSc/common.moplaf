package com.misc.common.moplaf.emf.editor.tentative;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.misc.common.moplaf.emf.edit.command.RunCommand;

public class RunAction extends AbstractAction3 {

	public RunAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Command constructCommand() {
		Object selectedObject = this.getSelectedObject();
		if ( selectedObject == null ) { return null; }
		
		EditingDomain editingDomain = this.getEditingDomain();
		if ( editingDomain == null ) { return null; }
		
		Command command = RunCommand.create(editingDomain, selectedObject);
		return command; 
		}

	
	
}  // class body
