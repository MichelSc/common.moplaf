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
package com.misc.common.moplaf.job;

public class ProgressFeedback {
	
	private float work;
	private String task;
	
	public ProgressFeedback(float work, String task) {
		super();
		this.work = work;
		this.task = task;
	}
	
	public float getWork() {
		return this.work;
	}
	public String getTask() {
		return this.task;
	}

	@Override
	public String toString() {
		String string = String.format("%f: %s", this.work, this.task);
		return string;
	}
	
}
