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

import org.eclipse.emf.common.CommonPlugin;

public class Logger {
	
	public Logger(String module){
		this.module = module;
	}
	
	private boolean logOnTouch   = true;
	private boolean logOnCalc    = true;
	private boolean logOnInfo    = true;
	private boolean logOnWarning = true;
	private boolean logOnError   = true;
	
	private String module;

	// Setters
	public void setLogOnTouch(boolean logOnTouch) {
		this.logOnTouch = logOnTouch;
	}

	public void setLogOnCalc(boolean logOnCalc) {
		this.logOnCalc = logOnCalc;
	}

	public void setLogOnInfo(boolean logOnInfo) {
		this.logOnInfo = logOnInfo;
	}

	public void setLogOnWarning(boolean logOnWarning) {
		this.logOnWarning = logOnWarning;
	}

	public void setLogOnError(boolean logOnError) {
		this.logOnError = logOnError;
	}

	public boolean getLogOnLevel(Level level){
		switch ( level){
		case TOUCH:   return this.logOnTouch;
		case CALC:    return this.logOnCalc;
		case INFO:    return this.logOnInfo;
		case WARNING: return this.logOnWarning;
		case ERROR:   return this.logOnError;
		default:      return false;
		}
	}

	public void setLogOnLevel(Level level, boolean logOnLevel){
		switch ( level){
		case TOUCH:   this.logOnTouch   = logOnLevel; break;
		case CALC:    this.logOnCalc    = logOnLevel; break;
		case INFO:    this.logOnInfo    = logOnLevel; break;
		case WARNING: this.logOnWarning = logOnLevel; break;
		case ERROR:   this.logOnError   = logOnLevel; break;
		default:
			break;
		}
	}

	/**
	 * The log method for the whole framework
	 * @param message
	 */
	private static void log(String message){
		CommonPlugin.INSTANCE.log(message);
	}
	
	public enum Level {
		TOUCH   ("touch"), 
		CALC    ("calc"), 
		INFO    ("info"), 
		WARNING ("warning"), 
		ERROR   ("error"), 
		FATAL   ("fatal");
		
		private String asString;
		
		private Level(String asString){
			this.asString = asString;
		}
		
		public String toString(){
			return this.asString;
		}
	}
	
	public void log(Level level, String message){
		if ( this.getLogOnLevel(level) ){
			String fullMessage = String.format("%s, %s: %s", this.module, level.asString, message);
			Logger.log(fullMessage);
		}
	}

}
