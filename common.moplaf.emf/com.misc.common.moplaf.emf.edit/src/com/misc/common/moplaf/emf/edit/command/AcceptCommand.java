package com.misc.common.moplaf.emf.edit.command;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

public class AcceptCommand extends AbstractCommand  implements CommandActionDelegate{

	protected boolean prepare(){
		isExecutable = true;
		return isExecutable;
	}

	public boolean canUndo() { 
		return false; 
	}

	@Override
	public void redo() {
		execute();		
	}

	@Override
	public void execute() {
		// to be implemented by the specializations
	}

	@Override
	public Object getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		return "Accept";
	}

	@Override
	public String getToolTipText() {
		return "Accept the object";
	}

	public static Command create(EditingDomain domain, Object value)	  {
	    return domain.createCommand(AcceptCommand.class,
	                                new CommandParameter(value, 
	                                		             null, 
	                                		             null));
	}
}
