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
package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;

public class BaseCommand extends AbstractCommand  implements CommandActionDelegate{

	/*
	 * Constructor
	 */
	public BaseCommand(String label, String description){
		super(label, description);
	}

	/*
	 * The default prepare does not thing and set the command to executable
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare(){
		isExecutable = true;
		return isExecutable;
	}

	/*
	 * The default is canUndo = false
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	public boolean canUndo() { 
		return false; 
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	public void redo() {
		execute();		
	}

	@Override
	public void execute() {
		// to be implemented by the specializations
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getText()
	 */
	@Override
	public Object getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getText()
	 */
	@Override
	public String getText() {
		return this.getLabel();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getText()
	 */
	@Override
	public String getToolTipText() {
		return this.getDescription();
	}

}
