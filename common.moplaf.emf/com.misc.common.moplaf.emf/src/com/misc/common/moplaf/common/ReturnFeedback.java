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
package com.misc.common.moplaf.common;

public class ReturnFeedback {
	
	private boolean success;
	private String feedback;
	private String information;	
	static public ReturnFeedback SUCCESS = new ReturnFeedback(true, "");
	static public ReturnFeedback FAILURE = new ReturnFeedback(false, "");
	
	public ReturnFeedback(boolean success, String feedback) {
		super();
		this.success     = success;
		this.feedback    = feedback;
		this.information = "";
	}
	
	public ReturnFeedback(boolean success, String feedback, String information) {
		super();
		this.success     = success;
		this.feedback    = feedback;
		this.information = information;
	}
	
	public ReturnFeedback(String context, Throwable exception) {
		super();
		this.success     = false;
		this.feedback    = context + ": " + exception.getClass().getSimpleName();
		this.information = exception.toString();
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public boolean isFailure() {
		return !success;
	}
	
	public String getFeedback() {
		return feedback;
	}

	public String getInformation() {
		return information;
	}

	@Override
	public String toString() {
		String toString = "Return ("
			 + (this.success ? "success" : "failure")
			 + ")"; 
	    if ( this.feedback!=null && this.feedback.length()>0 ) {
	    	toString += ", feedback="+this.feedback;
	    }
		return toString;
	}
	
}
