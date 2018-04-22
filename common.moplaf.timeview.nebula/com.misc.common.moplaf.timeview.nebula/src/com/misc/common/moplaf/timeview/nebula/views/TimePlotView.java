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
package com.misc.common.moplaf.timeview.nebula.views;

import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.timeview.emf.editor.views.TimePlotViewAbstract;
import com.misc.common.moplaf.timeview.viewers.TimePlotViewerAbstract;


public class TimePlotView extends TimePlotViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.nebule.views.TimePlotView";

	/**
	 * The constructor.
	 */
	public TimePlotView() {
	}

	@Override
	protected TimePlotViewerAbstract createViewer(Composite parent) {
		return new TimePlotViewer(parent); 
	}

	
}