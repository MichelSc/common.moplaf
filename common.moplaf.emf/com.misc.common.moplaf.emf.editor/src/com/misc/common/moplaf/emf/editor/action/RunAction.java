/**
 * Copyright (c) 2002-2016 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package com.misc.common.moplaf.emf.editor.action;


import java.util.Collection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.edit.command.RunCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;


/**
 * A run action  is implemented by creating a {@link RunCommand}.
 */
public class RunAction extends CommandAction
{
	  public final static String ID = "com.misc.common.moplaf.emf.editor.action.Run";


	public RunAction(IWorkbenchPart workbenchPart, ISelection selection){
	    super(workbenchPart, selection);
		this.setId(ID);
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
      return RunCommand.create(editingDomain, owner);
    }
    return UnexecutableCommand.INSTANCE;
  }
}
