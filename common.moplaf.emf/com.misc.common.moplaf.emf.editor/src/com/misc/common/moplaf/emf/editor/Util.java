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
package com.misc.common.moplaf.emf.editor;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.common.IMoplafObject;

public class Util {

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 */
	public static void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if ( action.isEnabled() || action.getText()!=null){
					if (contributionID != null) {
						manager.insertBefore(contributionID, action);
					}
					else {
						manager.add(action);
					}
				}
			}
		}
	}
	
	/**
	 * 
	 */
	public static RGB integerToRgb(int anInt){
		Color color = new Color(anInt);
		RGB rgb = new RGB(color.getR(), color.getG(), color.getB());
		return rgb; 
	}

	/**
	 * 
	 */
	public static int integerToRgb(RGB aRGB){
		Color color = new Color(aRGB.red, aRGB.green, aRGB.blue);
		int anInt = color.toInt();
		return anInt; 
	}

	/**
	 * Returns the objects in the selections.
	 * <p>
	 * If the selected objects can be adapted to a IMoplafObject, then this IMoplafObject is returned.
	 * @param selection
	 * @return
	 */
	public static Object[] getSelectedObjects(ISelection selection) {
		if (  !selection.isEmpty() && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			LinkedList<Object> objects_selected = new LinkedList<Object>();
			@SuppressWarnings("rawtypes")
			Iterator iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selected = iterator.next();
				Object adapted = Adapters.adapt(selected, IMoplafObject.class);
				if ( adapted != null ) {
					objects_selected.add(adapted);
				} else {
					objects_selected.add(selected);
				}
			}
			return objects_selected.toArray();
		} // there is a selection
		return null;
	}
	
	public static int getMaxSecondaryIdFromView(String viewId) {
		int result = 0;
		for ( IViewReference vr : PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences() )
		{
			if( vr.getView(false) != null ) {
				IViewSite vs = vr.getView(false).getViewSite();
				if( vs != null && vs.getId().equals(viewId) ) {
					int sec_id = 0;
					try {
						sec_id = Integer.parseInt( vs.getSecondaryId() );
					}
					catch ( NumberFormatException e ) {
						// do nothing
					}
					if( sec_id > result ) {
						result = sec_id;
					}
				}
			}
		}
		
		return result;
	}
	
	public static void showView(IWorkbenchPage page, String viewId) 
			throws PartInitException {
		int sec_id = Util.getMaxSecondaryIdFromView(viewId) + 1;
		page.showView(viewId, Integer.toString(sec_id), IWorkbenchPage.VIEW_VISIBLE);
	}
}
