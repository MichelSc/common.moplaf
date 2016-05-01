package com.misc.common.moplaf.dbsynch.provider;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SynchDownCommand extends AbstractCommand {

	protected boolean prepare(){
		isExecutable = true;
		return isExecutable;
	}

	public boolean canUndo() { 
		return false; 
	}

	@Override
	public void redo() {
		execute();		
	}

	@Override
	public void execute() {
		// to be implemented by the specializations
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(SynchDownCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
