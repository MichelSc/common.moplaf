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
package com.misc.common.moplaf.gis.provider;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RefreshCommand extends AbstractCommand {

	protected boolean prepare(){
		isExecutable = true;
		return isExecutable;
	}

	public boolean canUndo() { 
		return false; 
	}

	@Override
	public void redo() {
		execute();		
	}

	@Override
	public void execute() {
		// to be implemented by the specializations
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(RefreshCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
