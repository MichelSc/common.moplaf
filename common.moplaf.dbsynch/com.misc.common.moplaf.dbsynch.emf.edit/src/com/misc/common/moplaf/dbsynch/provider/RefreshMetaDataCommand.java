package com.misc.common.moplaf.dbsynch.provider;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.misc.common.moplaf.emf.edit.command.BaseCommand;

public class RefreshMetaDataCommand extends BaseCommand {

	public RefreshMetaDataCommand (){
		super("Refresh Metadata", "Refresh the metadata");
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(RefreshMetaDataCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
