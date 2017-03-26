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
package com.misc.common.moplaf.gisview.nebula.views;



import org.eclipse.swt.widgets.Composite;

import com.misc.common.moplaf.gisview.MapViewerAbstract;
import com.misc.common.moplaf.gisview.impl.MapViewAbstract;





public class MapView extends MapViewAbstract {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.timeview.jaret.views.GanttView";

	/**
	 * The constructor.
	 */
	public MapView() {
	}

	@Override
	protected MapViewerAbstract createViewer(Composite parent) {
		return new MapViewer(parent); 
	}

	
}