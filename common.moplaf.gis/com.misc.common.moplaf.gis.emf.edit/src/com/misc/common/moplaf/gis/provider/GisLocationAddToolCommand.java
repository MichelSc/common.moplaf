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
package com.misc.common.moplaf.gis.provider;

import org.eclipse.emf.common.command.AbstractCommand;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisToolLocation;

public class GisLocationAddToolCommand extends AbstractCommand {
	
	private GisLocation location;
	private GisToolLocation tool;
	
	public GisLocationAddToolCommand(GisLocation location, GisToolLocation tool){
		this.location= location;
		this.tool = tool;
	}

	protected boolean prepare(){
		isExecutable = true;
		EnabledFeedback feedback = this.location.getAddToolFeedback(this.tool);
		if ( !feedback.isEnabled() ) {
			isExecutable = false;
			this.setDescription(feedback.getFeedback());
		}
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
		this.location.addTool(this.tool);
	}

} // class AddGisToolLocation command