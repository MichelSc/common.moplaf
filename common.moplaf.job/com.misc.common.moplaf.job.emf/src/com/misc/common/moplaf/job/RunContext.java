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
/**
 */
package com.misc.common.moplaf.job;
	/**
	 * Interface to be imported by the context running the run
	 *
	 */
	public interface RunContext  {
		/**
		 * Call back by the applicative logic to report progress of the task
		 * 
		 * @return true if the run may continue, false if the run must abort
		 */
		boolean onProgress(Run run, ProgressFeedback progress);
	
	} // RunContext
