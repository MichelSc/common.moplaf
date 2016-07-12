package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class CancelCommand extends BaseCommand  {

	public CancelCommand(){
		super("Cancel", "Cancel object");
	}


	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(CancelCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
