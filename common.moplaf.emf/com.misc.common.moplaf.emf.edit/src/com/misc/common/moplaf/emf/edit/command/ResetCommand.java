package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class ResetCommand extends BaseCommand {

	public ResetCommand(){
		super("Reset", "Reset the object");
	}


	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(ResetCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
