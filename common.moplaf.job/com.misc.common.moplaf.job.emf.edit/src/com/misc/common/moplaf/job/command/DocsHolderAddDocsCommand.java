package com.misc.common.moplaf.job.command;

import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.emf.edit.command.GarbageCollectCommand;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocsHolder;

public class DocsHolderAddDocsCommand extends GarbageCollectCommand {
	
	public DocsHolderAddDocsCommand(DocsHolder docs_hodler, EList<Doc> docs) {
		super();
		this.docs = docs;
		this.holder = docs_hodler;
	}

	private DocsHolder holder;
	private EList<Doc> docs;

	@Override
	protected boolean prepare() {
		boolean isExecutable = true;
		return isExecutable;
	}

	@Override
	public void execute() {
		this.holder.addDocs(this.docs);
	}
}
