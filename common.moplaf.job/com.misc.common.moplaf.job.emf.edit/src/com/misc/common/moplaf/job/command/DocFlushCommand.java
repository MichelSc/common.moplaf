package com.misc.common.moplaf.job.command;

import com.misc.common.moplaf.emf.edit.command.FlushCommand;
import com.misc.common.moplaf.job.Doc;

public class DocFlushCommand extends FlushCommand{
	private Doc doc;
	
	// constructor
	public DocFlushCommand(Doc doc)	{
		super();
		this.doc = doc;
	}

	@Override
	protected boolean prepare(){
		return true;
	}

	@Override
	public void execute() {
		this.doc.flush();
	}
} // class DocFlushCommand