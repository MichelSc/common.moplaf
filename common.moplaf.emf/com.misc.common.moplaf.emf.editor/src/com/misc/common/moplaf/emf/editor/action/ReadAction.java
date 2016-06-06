/**
 * Copyright (c) 2002-2007 IBM Corporation and others.
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

import com.misc.common.moplaf.emf.edit.command.ReadCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;


/**
 * A read action  is implemented by creating a {@link ReadCommand}.
 */
public class ReadAction extends BaseAction
{
  /**
   * This constructs an instance of an action that uses the given editing domain to create a run command
   * for the <code>selection</code> object.
   * @since 2.4.0
   */
  public ReadAction(IWorkbenchPart part, ISelection selection)
  {
    super(part, selection);
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
      return ReadCommand.create(editingDomain, owner);
    }
    return UnexecutableCommand.INSTANCE;
  }
}