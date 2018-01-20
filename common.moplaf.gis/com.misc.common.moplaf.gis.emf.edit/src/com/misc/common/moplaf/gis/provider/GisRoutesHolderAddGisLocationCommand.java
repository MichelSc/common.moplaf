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