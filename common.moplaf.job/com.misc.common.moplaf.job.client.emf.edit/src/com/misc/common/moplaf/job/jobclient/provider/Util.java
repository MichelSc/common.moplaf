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
package com.misc.common.moplaf.job.jobclient.provider;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobSource;
import com.misc.common.moplaf.job.jobclient.util.JobEngineFactory;
import com.misc.common.moplaf.job.jobclient.util.JobSourceFactory;


public class Util {

	public static void collectNewChildJobEngineDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.client.emf.jobengine_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof JobEngineFactory) {
					JobEngine newJobEngine= ((JobEngineFactory)value).createJobEngine();
					if ( newJobEngine!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, newJobEngine));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.jobclient.provider.Util.collectNewChildJobEngineDescriptors exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildJobEngineDescriptors2

	public static void collectNewChildJobSourceDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.client.emf.jobsource_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof JobSourceFactory) {
					JobSource newJobSource = ((JobSourceFactory)value).createJobSource();
					if ( newJobSource!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, newJobSource));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.jobclient.provider.Util.collectNewChildJobSourceDescriptors exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildJobSourceDescriptors2
}
