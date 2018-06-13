package com.misc.common.moplaf.job.command;

import com.misc.common.moplaf.emf.edit.command.GarbageCollectCommand;
import com.misc.common.moplaf.job.Docs;
import com.misc.common.moplaf.job.util.Util;

public class DocsGarbageCollectCommand extends GarbageCollectCommand {
	
	public DocsGarbageCollectCommand(Docs docs) {
		super();
		this.docs = docs;
	}

	private Docs docs;

	@Override
	protected boolean prepare() {
		boolean isExecutable = true;
		return isExecutable;
	}

	@Override
	public void execute() {
		Util.docsGarbageCollect(this.docs);
	}
}
