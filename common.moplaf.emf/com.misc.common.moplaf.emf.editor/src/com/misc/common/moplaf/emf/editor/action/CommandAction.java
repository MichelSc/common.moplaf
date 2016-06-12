package com.misc.common.moplaf.emf.editor.action;

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


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;


/**
 * This class is used as a basis for implementing an {@link org.eclipse.jface.action.IAction} 
 * on the menubar, the toolbar, or a pop-up menu by delegating all required
 * behaviour to a {@link Command}, only when it is guaranteed that the
 * selection will not change during the life of the action.  In other words,
 * the action itself would be created based on the selection, and destroyed
 * when the selection changed.  All possible aspects of the action are
 * delegated to the command, namely the enablement state and, if it
 * implements {@link CommandActionDelegate}, the text, the toolbar icon, and
 * the tool tip text; however, this need only be done once, at the time the
 * action is created.
 *
 * <p>Subclasses must provide an implementation for {@link #createActionCommand} 
 * that creates the command to perform this action.
 * They may also override {@link #getDefaultImageDescriptor} to provide a
 * default icon and {@link #disable} to set the action's state when a command
 * cannot be created.
 */
public abstract class CommandAction extends BaseAction
{
  /**
   * This records the editing domain of the current editor or viewer.  For global
   * popups, we try to determine the editing domain from the selected
   * objects themselves.
   */
  protected EditingDomain editingDomain;

  /**
   * This records the command.
   */
  protected Command command;

  /**
   * This constructs an instance for a command to be executed via
   * workbenchPart's editing domain.
   * @since 2.1.0
   */
  public CommandAction(IWorkbenchPart workbenchPart, ISelection selection)
  {
    super(workbenchPart, selection);

    // try to get editing domain from workbench part
    if (workbenchPart instanceof IEditingDomainProvider)
    {
      editingDomain = ((IEditingDomainProvider)workbenchPart).getEditingDomain();
    }
    
    this.makeCommand();
    this.configureAction();
  }

  /**
   * This should be implemented to create a command that performs the action.
   */
  protected abstract Command createActionCommand(EditingDomain editingDomain, Collection<?> collection);

  /**
   * This invokes createActionCommand to create the command
   * and then configures the action based on the result.
   */
  private void makeCommand(){
	this.command = null;
	// make the command and setEnabled the action
    // only handle structured selections
    if (!(selection instanceof IStructuredSelection))
    {
      disable();
    }
    else
    {
      // convert the selection to a collection of the selected objects
      IStructuredSelection sselection = (IStructuredSelection) selection;
      List<?> list = sselection.toList();
      Collection<Object> collection = new ArrayList<Object>(list);
      
      // if the editing domain wasn't given by the workbench part, try to get
      // it from the selection
      if (editingDomain == null)
      {
        for (Object o : collection)
        {
          editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(o);
          if (editingDomain != null)
          {
            break;
          }
        }
      }

      // if we found an editing domain, create command
      if (editingDomain != null)
      {
        command = createActionCommand(editingDomain, collection);
        setEnabled(command.canExecute());
      }

      // give up if we couldn't create the command; otherwise, use a
      // CommandActionDelegate to set the action's text, tool-tip, icon,
      // etc. or just use the default icon
      if (command == null || command == UnexecutableCommand.INSTANCE)
      {
        disable();
      }
    }
  }
  
  /**
   * This configures the action based on the command, if any.
   */
  @Override
protected void configureAction(){
    // set the text fields of the action
    if (!(command instanceof CommandActionDelegate))
    {
      if (getDefaultImageDescriptor() != null)
      {
        setImageDescriptor(getDefaultImageDescriptor());
      }
    }
    else
    {
      CommandActionDelegate commandActionDelegate =
        (CommandActionDelegate) command;

      ImageDescriptor imageDescriptor =
        objectToImageDescriptor(commandActionDelegate.getImage());
      if (imageDescriptor != null)
      {
        setImageDescriptor(imageDescriptor);
      }
      else if (getDefaultImageDescriptor() != null)
      {
        setImageDescriptor(getDefaultImageDescriptor());
      }

      if (commandActionDelegate.getText() != null)
      {
        setText(commandActionDelegate.getText());
      }
      
      if (commandActionDelegate.getDescription() != null)
      {
        setDescription(commandActionDelegate.getDescription());
      }

      if (commandActionDelegate.getToolTipText() != null)
      {
        setToolTipText(commandActionDelegate.getToolTipText());
      }
    }
  }

  /**
   * This executes the command.
   */
  @Override
  public void run()
  {
    // this guard is for extra security, but should not be necessary
    if (editingDomain != null && command != null)
    {
      // use up the command
      editingDomain.getCommandStack().execute(command);
    }
    
    // re-set the selection
    //    this is done to trigger a "SelectionChanged" event
    //    so that the action are recreated
    //    actions enablements need te be recalculated
    //    as they may be different after running this action 
    if ( this.workbenchPart instanceof ISelectionProvider){
    	ISelectionProvider provider = (ISelectionProvider)this.workbenchPart;
    	provider.setSelection(selection);
    }
  }

}
