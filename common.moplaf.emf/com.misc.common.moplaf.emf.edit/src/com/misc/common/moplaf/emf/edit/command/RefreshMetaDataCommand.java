/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.emf.edit.command;

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
