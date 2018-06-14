package com.misc.common.moplaf.job.command;

import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.emf.edit.command.GarbageCollectCommand;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.Task;

public class TaskAddInputDocsCommand extends GarbageCollectCommand {
	
	public TaskAddInputDocsCommand(Task task, EList<Doc> docs) {
		super();
		this.task = task;
		this.docs = docs;
	}

	private Task task;
	private EList<Doc> docs;

	@Override
	protected boolean prepare() {
		boolean isExecutable = true;
		return isExecutable;
	}

	@Override
	public void execute() {
		this.task.addInputDocs(this.docs);
	}
}
