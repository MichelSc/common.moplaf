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
		boolean onProgress(ProgressFeedback progress);
	
	} // RunContext
