package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class StartCommand extends BaseCommand  {

	public StartCommand(){
		super("Start", "Start the object");
	}


	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(StartCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
