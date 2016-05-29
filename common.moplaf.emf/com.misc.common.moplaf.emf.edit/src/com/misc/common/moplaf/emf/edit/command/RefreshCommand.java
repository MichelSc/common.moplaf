package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RefreshCommand extends BaseCommand {

	public RefreshCommand(){
		super("Refresh", "Refresh the object");
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(RefreshCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
