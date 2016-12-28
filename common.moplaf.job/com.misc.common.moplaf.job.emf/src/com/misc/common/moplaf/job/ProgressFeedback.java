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
