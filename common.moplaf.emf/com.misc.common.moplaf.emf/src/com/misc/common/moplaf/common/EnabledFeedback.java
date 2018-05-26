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
	
	static private String ENABLED_PREFIX = "";
	static private String NOT_ENABLED_PREFIX = "Not enabled, feedback=";
	
	public EnabledFeedback(String fromString) {
		super();
		
		if ( fromString.startsWith(ENABLED_PREFIX)) {
			this.enabled = true;
			this.feedback = fromString.substring(ENABLED_PREFIX.length());
		} else if ( fromString.startsWith(NOT_ENABLED_PREFIX)) {
			this.enabled = false;
			this.feedback = fromString.substring(NOT_ENABLED_PREFIX.length());
		} else {
			throw new IllegalArgumentException("Cannot instantiate EnabledFeedback from string \""+fromString+"\"");
		}
	}
	
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
		String prefix = NOT_ENABLED_PREFIX;
		if ( this.enabled ) {
			prefix = ENABLED_PREFIX;
		}
		return  prefix + this.getFeedback();
	}

	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof EnabledFeedback) ) {
			return false;
		}
		
		EnabledFeedback other = (EnabledFeedback)obj;
		if ( other.isEnabled()!=this.isEnabled()) {
			return false;
		}
		
		if ( !this.getFeedback().equals(other.getFeedback())) {
			return false;
		}
		return true;
	}
	
}
