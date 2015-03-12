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
