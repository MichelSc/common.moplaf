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
package com.misc.common.moplaf.spreadsheet.provider;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.file.Plugin;
import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import com.misc.common.moplaf.spreadsheet.util.ReaderWriterFactory;


public class Util {

	public static void collectNewChildRunDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.spreadsheet.emf.readerwriter_factory");
		for ( IConfigurationElement element : elements){                                                           
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof ReaderWriterFactory) {
					 SpreadsheetReaderWriter newFactory = ((ReaderWriterFactory)value).createReaderWriter();
					if ( newFactory!=null){
						newChildDescriptors.add(new CommandParameter(null, feature, newFactory));
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.spreadsheet.provider.Util.collectNewChildRunDescriptors exception caught "+e.getMessage());
			}
		}
	}  // method collectNewChildRunDescriptors2
}
