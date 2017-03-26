/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.kpiview.medusa.views;

import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.kpiview.emf.editor.views.KPIViewAbstract;
import com.misc.common.moplaf.kpiview.viewers.KPIViewerAbstract;

public class KPIView extends KPIViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.nebule.views.TimePlotView";

	/**
	 * The constructor.
	 */
	public KPIView() {
	}

	@Override
	protected KPIViewerAbstract createViewer(Composite parent) {
		return new KPIViewer(parent); 
	}

	
}