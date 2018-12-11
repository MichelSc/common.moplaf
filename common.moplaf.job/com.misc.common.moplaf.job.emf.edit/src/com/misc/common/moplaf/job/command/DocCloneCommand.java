package com.misc.common.moplaf.job.command;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.CloneCommand;
import com.misc.common.moplaf.job.Doc;

public class DocCloneCommand extends CloneCommand{
	private Doc doc;
	
	// constructor
	public DocCloneCommand(Doc doc)	{
		super();
		this.doc = doc;
	}

	@Override
	protected boolean prepare(){
		boolean isExecutable = true;
		EnabledFeedback feedback = this.doc.getCloneFeedback();
		if ( !feedback.isEnabled() ) {
			isExecutable = false;
			this.setDescription(feedback.getFeedback());
		}
		return isExecutable;
	}

	@Override
	public void execute() {
		this.doc.clone();
	}
} // class DocFlushCommand