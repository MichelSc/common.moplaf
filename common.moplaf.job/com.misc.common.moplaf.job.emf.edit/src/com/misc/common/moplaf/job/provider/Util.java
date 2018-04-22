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
package com.misc.common.moplaf.job.provider;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.util.RunFactory;


public class Util {

	public static void collectNewChildRunDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.emf.run_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof RunFactory) {
					Run newSolver = ((RunFactory)value).createRun();
					if ( newSolver!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, newSolver));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.provider.Util.collectNewChildRunDescriptors exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildRunDescriptors2
}
