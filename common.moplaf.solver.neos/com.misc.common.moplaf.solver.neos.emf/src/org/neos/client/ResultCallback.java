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
