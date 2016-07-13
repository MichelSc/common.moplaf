package com.misc.common.moplaf.common;

public class CommandFeedback {
	
	private boolean mayExecute;
	private String feedback;
	
	static public CommandFeedback NOFEEDBACK = new CommandFeedback(true, "");
	
	public CommandFeedback(boolean mayExecute, String feedback) {
		super();
		this.mayExecute = mayExecute;
		this.feedback = feedback;
	}
	
	public boolean isMayExecute() {
		return mayExecute;
	}
	public String getFeedback() {
		return feedback;
	}

	@Override
	public String toString() {
		if ( this.mayExecute) { return ""; }
		return "May not execute, feedback=" + feedback + "";
	}
	
}
