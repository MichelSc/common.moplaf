package org.neos.client;

import java.util.Vector;

import org.apache.xmlrpc.XmlRpcException;

/**
 * Class for monitoring job status and notify when output is ready.
 * 
 * @author Thawan Kooburat
 * 
 */
public class ResultReceiver extends Thread {

	public static final String RETRIEVING = "retrieving";
	public static final String ERROR = "error";
	public static final String DONE = "done";

	private String status;

	private Integer jobNumber;
	private String password;
	private NeosXmlRpcClient client;
	private ResultCallback callback;

	private StringBuffer currentResult = new StringBuffer();

	private Exception e;

	public ResultReceiver(NeosXmlRpcClient client, ResultCallback callback,
			Integer job, String pass) {
		this.client = client;
		this.jobNumber = job;
		this.password = pass;
		this.callback = callback;
		
		if (callback != null) {
			callback.handleJobInfo(job, pass);
		}
	}

	public void run() {
		Vector params = new Vector();

		params.add(this.jobNumber);
		params.add(this.password);

		Vector offsetParams = new Vector();
		offsetParams.add(this.jobNumber);
		offsetParams.add(this.password);

		offsetParams.add(Integer.valueOf(0));
		String neosStatus;

		try {
			neosStatus = (String) client.execute("getJobStatus", params);
			this.status = RETRIEVING;
			while (!neosStatus.equals("Done")) {
				if (neosStatus.equals("Unknown Job")
						|| neosStatus.equals("Bad Password")) {
					this.status = ERROR;
					e = new Exception(neosStatus);
					return;
				}

				Object[] retval = (Object[]) client.execute(
						"getIntermediateResults", offsetParams);
				offsetParams.set(2, (Integer) retval[1]);
				Object output = (Object) retval[0];
				String newText;
				if (output instanceof String)
					newText = (String) output;
				else
					newText = new String((byte[]) output);
				currentResult.append(newText);

				neosStatus = (String) client.execute("getJobStatus", params);
			}

			Object retval = client.execute("getFinalResults", params);

			currentResult.setLength(0);
			if (retval instanceof String) {
				currentResult.append((String) retval);
			} else if (retval instanceof byte[]) {
				currentResult.append(new String((byte[]) retval));

			}
			// parent.tabs.setText(jobNumber, new String();
			this.status = DONE;
		} catch (XmlRpcException e) {
			this.e = e;
			this.status = ERROR;
		}

		if (callback != null) {
			callback.handleFinalResult(currentResult.toString());
		}
	}

	public String getResult() {
		return currentResult.toString();
	}

	public String getStatus() {
		return this.status;
	}

	public Exception getException() {
		return this.e;
	}
}
