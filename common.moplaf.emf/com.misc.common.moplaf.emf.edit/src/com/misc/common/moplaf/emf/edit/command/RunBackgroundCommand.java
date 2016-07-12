package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RunBackgroundCommand extends BaseCommand {

	public RunBackgroundCommand(){
		super("Run in Background", "Run the object in the background");
	}

	
	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(RunBackgroundCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
