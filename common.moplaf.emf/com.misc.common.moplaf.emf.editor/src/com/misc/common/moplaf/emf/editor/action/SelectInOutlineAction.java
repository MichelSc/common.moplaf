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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class SelectInOutlineAction extends BaseAction {
	public final static String ID = "com.misc.common.moplaf.emf.editor.action.Run";
	
	public SelectInOutlineAction(IWorkbenchPart workbenchPart, ISelection selection) {
	super(workbenchPart, selection);
	this.setId(ID);
	}
	
	@Override
	protected void configureAction() {
		super.configureAction();
		setText("Select in Outline");
		setToolTipText("Select in Outilie");
		boolean enabled = this.selection != null && this.workbenchPart!=null;
		this.setEnabled(enabled);
	}
	
	public void run()	{
		IContentOutlinePage outlinepage = (IContentOutlinePage)this.workbenchPart.getAdapter(IContentOutlinePage.class);
		if ( outlinepage != null) {
			outlinepage.setSelection(this.selection);
		}
	} // run method
}  // class ConnectAction
