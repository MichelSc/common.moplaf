package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class WriteCommand extends BaseCommand  {

	public WriteCommand(){
		super("Write", "Write the object");
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(WriteCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
