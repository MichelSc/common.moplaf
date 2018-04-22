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
