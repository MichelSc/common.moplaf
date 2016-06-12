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



import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;


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
public abstract class BaseAction extends Action
{
  /**
   * This records the workbench part.
   */
  protected IWorkbenchPart workbenchPart;

  /**
   * This records the selection
   */
  protected ISelection selection;

  /**
   * This constructs an instance for a command to be executed via
   * workbenchPart's editing domain.
   * @since 2.1.0
   */
  public BaseAction(IWorkbenchPart workbenchPart, ISelection selection)
  {
    super();
    this.workbenchPart = workbenchPart;
    this.selection = selection;

    this.configureAction();
  }

  
  /**
   * This configures the action.
   * Should be overriden by the concrete class
   */
  protected void configureAction(){
        setImageDescriptor(getDefaultImageDescriptor());
        setText       ("Action text - to be overriden");
        setDescription("Action description - to be overriden");
        setToolTipText("Action tooltip - to be overriden");
  }

  /**
   * This can be overridden to provide the image descriptor used when the
   * command does not provide one.  This implementation simply returns null.
   */
  protected ImageDescriptor getDefaultImageDescriptor()
  {
    return null;
  }


  /**
   * This gets invoked when the selection is inappropriate or the command
   * cannot be created.  It puts the action in the correct state for such
   * error conditions.  This implementation disables the action and sets its
   * icon to the default.
   */
  protected void disable()
  {
    setEnabled(false);
    if (getDefaultImageDescriptor() != null)
    {
      setImageDescriptor(getDefaultImageDescriptor());
    }
  }


  /**
   * If necessary, this converts any image representation into an image
   * descriptor.
   */
  protected ImageDescriptor objectToImageDescriptor(Object object)
  {
    return ExtendedImageRegistry.getInstance().getImageDescriptor(object);
  }
}
