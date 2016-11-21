package com.misc.common.moplaf.common;

public class EnabledFeedback {
	
	private boolean mayExecute;
	private String feedback;
	
	static public EnabledFeedback NOFEEDBACK = new EnabledFeedback(true, "");
	
	public EnabledFeedback(boolean mayExecute, String feedback) {
		super();
		this.mayExecute = mayExecute;
		this.feedback = feedback;
	}
	
	public boolean isEnabled() {
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
