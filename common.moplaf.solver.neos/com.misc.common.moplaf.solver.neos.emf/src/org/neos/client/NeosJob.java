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
package org.neos.client;

public class NeosJob {
	private int jobNo;
	private String jobPass;
	private String result;

	public int getJobNo() {
		return jobNo;
	}

	void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public String getJobPass() {
		return jobPass;
	}

	void setJobPass(String jobPass) {
		this.jobPass = jobPass;
	}

	public String getResult() {
		return result;
	}

	void setResult(String result) {
		this.result = result;
	}

}
