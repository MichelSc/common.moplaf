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
package org.neos.client;

/**
 * Interface for class which need to be notified when result is ready for processing 
 * @author Thawan Kooburat
 *
 */
public interface ResultCallback {
	
	/**
	 * This method will be called when job is submitted;
	 * @param results	output text from NEOS
	 * @param jobNo
	 * @param pass
	 */
	public void handleJobInfo(int jobNo, String pass);
	
	/**
	 * This method will be called when final result from NEOS is ready
	 * @param results	output text from NEOS
	 * @param jobNo
	 * @param pass
	 */
	
	public void handleFinalResult(String results);
}
