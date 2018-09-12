package com.misc.common.moplaf.emf.editor.menus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.misc.common.moplaf.emf.edit.command.TestCommand;


public class TestMenu extends ContributionItem {
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
	
	protected ISelection selection;
	
	public TestMenu(ISelection selection) {
		this.selection = selection;
		this.setId("com.misc.common.moplaf.emf.editor.menus.TestMenu");
		command = new TestCommand();
		makeCommand();
	}
	
	/**
	 * This invokes createActionCommand to create the command
	 */
	private void makeCommand() {
		this.command = null;
		// make the command and setVisible the action
		// only handle structured selections
		if (!(selection instanceof IStructuredSelection))
		{
			setVisible(false);
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
				setVisible(command.canExecute());
			}

			// give up if we couldn't create the command; otherwise, use a
			// CommandActionDelegate to set the action's text, tool-tip, icon,
			// etc. or just use the default icon
			if (command == null || command == UnexecutableCommand.INSTANCE)
			{
				setVisible(false);
			}
		}
	}	

	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection)
	{
		if (collection.size() == 1)
		{
			Object owner = collection.iterator().next();
			return TestCommand.create(editingDomain, owner);
		}
		return UnexecutableCommand.INSTANCE;
	}

}
