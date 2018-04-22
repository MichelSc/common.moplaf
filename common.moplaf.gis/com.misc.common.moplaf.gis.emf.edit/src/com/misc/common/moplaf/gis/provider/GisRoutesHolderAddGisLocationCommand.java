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

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisRoutesHolder;

public class GisRoutesHolderAddGisLocationCommand extends AbstractCommand {
	
	private GisRoutesHolder matrix;
	private GisLocation location;
	private boolean from;
	private boolean to;
	
	public GisRoutesHolderAddGisLocationCommand(GisRoutesHolder aMatrix, GisLocation aLocation, boolean from, boolean to){
		this.matrix= aMatrix;
		this.location = aLocation;
		this.from = from;
		this.to = to;
	}

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
		if ( this.from){
			this.matrix.addFromLocation(location);
		}
		if ( this.to){
			this.matrix.addToLocation(location);
		}
	}

} // class AddGisLocation command