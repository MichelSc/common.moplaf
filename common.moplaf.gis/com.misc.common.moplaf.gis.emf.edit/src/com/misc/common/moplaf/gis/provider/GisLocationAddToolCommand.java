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