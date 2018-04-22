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
package com.misc.common.moplaf.gridview;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class Plugin extends AbstractUIPlugin {

	public Plugin() {
	}

	// The plug-in ID
	public static final String PLUGIN_ID = "com.misc.common.moplaf.gridview.emf.editor"; //$NON-NLS-1$

	// The shared instance
	private static Plugin plugin;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
//		Properties props = System.getProperties();
//		props.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
//		
//		CommonPlugin.INSTANCE.log("Plugin com.misc.common.moplaf.gridview.emf.editor: set system properties java.util.Arrays.useLegacyMergeSort to true");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

}
