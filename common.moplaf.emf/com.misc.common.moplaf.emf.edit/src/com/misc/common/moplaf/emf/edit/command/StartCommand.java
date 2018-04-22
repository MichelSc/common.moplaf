/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
