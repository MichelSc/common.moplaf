/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.emf.editor.action;


import java.util.Collection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.edit.command.CloneCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;


/**
 * A clone action  is implemented by creating a {@link CloneCommand}.
 */
public class CloneAction extends CommandAction
{
	public final static String ID = "com.misc.common.moplaf.emf.editor.action.Clone";

	/**
	 * This constructs an instance of an action that uses the given editing domain to create a clone command
	 * for the <code>selection</code> object.
	 * @since 2.4.0
	 */
	public CloneAction(IWorkbenchPart part, ISelection selection)
	{
		super(part, selection);
		this.setId(ID);
	}

	@Override
	protected String getImageFileName() {
		return "003-copy.png";
	}

	/**
	 * This creates the command for {@link StaticSelectionCommandAction#createActionCommand}.
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection)
	{
		if (collection.size() == 1)
		{
			Object owner = collection.iterator().next();
			return CloneCommand.create(editingDomain, owner);
		}
		return UnexecutableCommand.INSTANCE;
	}
}
