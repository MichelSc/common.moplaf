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

import com.misc.common.moplaf.emf.edit.command.AddCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;


/**
 * An add action  is implemented by creating a {@link AddCommand}.
 */
public class AddAction extends CommandAction
{
	  public final static String ID = "com.misc.common.moplaf.emf.editor.action.Add";


	public AddAction(IWorkbenchPart workbenchPart, ISelection selection){
	    super(workbenchPart, selection);
		this.setId(ID);
	}
  
	@Override
	protected String getImageFileName() {
		return "020-add.png";
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
      return AddCommand.create(editingDomain, owner);
    }
    return UnexecutableCommand.INSTANCE;
  }
}
