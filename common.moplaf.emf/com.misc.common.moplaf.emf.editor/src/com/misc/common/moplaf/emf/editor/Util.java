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

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.swt.graphics.RGB;

import com.misc.common.moplaf.common.Color;

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

}
