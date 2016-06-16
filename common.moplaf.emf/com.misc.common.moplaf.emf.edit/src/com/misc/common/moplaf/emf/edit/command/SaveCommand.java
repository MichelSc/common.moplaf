package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SaveCommand extends BaseCommand {

	public SaveCommand(){
		super("Save", "Save the object");
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(SaveCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
