package com.misc.common.moplaf.common;

public class EnabledFeedback {
	
	private boolean enabled;
	private String feedback;
	
	static public EnabledFeedback NOFEEDBACK = new EnabledFeedback(true, "");
	
	public EnabledFeedback(boolean enabled, String feedback) {
		super();
		this.enabled = enabled;
		this.feedback = feedback;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	public String getFeedback() {
		return feedback;
	}

	@Override
	public String toString() {
		if ( this.enabled) { return ""; }
		return "Not enabled, feedback=" + feedback + "";
	}
	
}
