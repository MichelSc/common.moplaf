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
/**
 */
package com.misc.common.moplaf.solver.solverscip;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Solverscip model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Plugin INSTANCE = new Plugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin() {
		super(new ResourceLocator [] {});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
		/**
		 * Starts the plugin.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			CommonPlugin.INSTANCE.log("com.misc.common.moplaf.solver.solverscip.Plugin.onStartUp: called");
			super.start(context);
			try {
				//System.loadLibrary("lib/x86_64-win/libjscip-0.1.mingw.x86_64.msvc.opt.spx.dll"); // this works on windows
//				System.loadLibrary("libjscip-0.1.linux.x86_64.gnu.opt.spx.so");  // this works on linux
				//System.loadLibrary("jscip-0.1.linux.x86_64.gnu.opt.spx");  // this works 
				System.loadLibrary("jscip");  // this works , on linux, it will load libjscip.so, on windows, jscip.dll
				
			} 
			catch(UnsatisfiedLinkError e ){
				com.misc.common.moplaf.solver.Plugin.INSTANCE.logError("SolverScip: unsatisfiedLinkError "+e.getMessage());
			}
		}

	}

}
