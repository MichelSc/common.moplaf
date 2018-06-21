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
package com.misc.common.moplaf.job.util;

import java.util.Date;
import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.file.Plugin;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.Docs;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.KeyIndicator;
import com.misc.common.moplaf.job.KeyIndicatorDate;
import com.misc.common.moplaf.job.KeyIndicatorDouble;
import com.misc.common.moplaf.job.KeyIndicatorInt;
import com.misc.common.moplaf.job.KeyIndicatorString;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.Task;

public class Util {
	static public RunFactory getRunFactory(String factory_id) {
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.emf.run_factory");
		for ( IConfigurationElement element : elements){
			// check the extension id 
			String extension_id = element.getDeclaringExtension().getUniqueIdentifier();
			String element_id = element.getAttribute("id");
			String this_element_full_id = extension_id == null ? "" : extension_id;
			if ( element_id != null ) {
				if ( this_element_full_id.length()>0 ) {
					this_element_full_id += ".";
				}
				this_element_full_id += element_id;
			}
			if ( this_element_full_id.contentEquals(factory_id)) {
				Object value;
				try {
					value = element.createExecutableExtension("class");
				} catch (CoreException e) {
					String message = String.format("Extension %s, creating the class, exception %s", factory_id, e.getMessage());
					Plugin.INSTANCE.logError(message);
					return null;
				}
				if ( value instanceof RunFactory) {
					return (RunFactory)value;
				} else {
					String message = String.format("Extension %s returned no RunFactory, but a %s", factory_id, value.getClass().getName());
					Plugin.INSTANCE.logError(message);
					return null;
				}
			}
		}
		return null;
	}
	
	static public EList<Run> getNewRuns() {
		BasicEList<Run> list = new BasicEList<Run>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.emf.run_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof RunFactory) {
					Run newRun = ((RunFactory)value).createRun();
					if ( newRun!=null){
						list.add(newRun);
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.Util.getNewRuns: exception caught "+e.getMessage());
			}
		}
		return list;
	}

	static public EList<Task> getNewTasks() {
		BasicEList<Task> list = new BasicEList<Task>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.emf.run_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof RunFactory) {
					Run newRun = ((RunFactory)value).createRun();
					if ( newRun instanceof Task ){
						list.add((Task)newRun);
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.Util.getNewTasks: exception caught "+e.getMessage());
			}
		}
		return list;
	}

	
	static public void docsGarbageCollect(Docs docs) {
		Iterator<Doc> iterator = docs.getDocs().iterator();
		while ( iterator.hasNext()) {
			Doc doc = iterator.next();
			if ( doc.getRefs().size()==0 ) {
				iterator.remove();
			}
		}
	}
	
	public static void updateKeyIndicatorDouble(EList<KeyIndicator> indicators, String name, double value) {
		// get 
		KeyIndicatorDouble indicator = indicators
				.stream()
				.filter(i -> i instanceof KeyIndicatorDouble)
				.map(i -> (KeyIndicatorDouble)i)
				.filter(i -> i.getName().equals(name))
				.findAny()
				.orElse(null);
		
		// create
		if ( indicator == null ) {
			indicator = JobFactory.eINSTANCE.createKeyIndicatorDouble();
			indicator.setName(name);
			indicators.add(indicator);
		}
		
		// update
		indicator.setValue(value);
	}
	
	public static void updateKeyIndicatorInt(EList<KeyIndicator> indicators, String name, int value) {
		// get 
		KeyIndicatorInt indicator = indicators
				.stream()
				.filter(i -> i instanceof KeyIndicatorInt)
				.map(i -> (KeyIndicatorInt)i)
				.filter(i -> i.getName().equals(name))
				.findAny()
				.orElse(null);
		
		// create
		if ( indicator == null ) {
			indicator = JobFactory.eINSTANCE.createKeyIndicatorInt();
			indicator.setName(name);
			indicators.add(indicator);
		}
		
		// update
		indicator.setValue(value);
	}
	
	public static void updateKeyIndicatorString(EList<KeyIndicator> indicators, String name, String value) {
		// get 
		KeyIndicatorString indicator = indicators
				.stream()
				.filter(i -> i instanceof KeyIndicatorString)
				.map(i -> (KeyIndicatorString)i)
				.filter(i -> i.getName().equals(name))
				.findAny()
				.orElse(null);
		
		// create
		if ( indicator == null ) {
			indicator = JobFactory.eINSTANCE.createKeyIndicatorString();
			indicator.setName(name);
			indicators.add(indicator);
		}
		
		// update
		indicator.setValue(value);
	}

	public static void updateKeyIndicatorDate(EList<KeyIndicator> indicators, String name, Date date, String format) {
		// get 
		KeyIndicatorDate indicator = indicators
				.stream()
				.filter(i -> i instanceof KeyIndicatorDate)
				.map(i -> (KeyIndicatorDate)i)
				.filter(i -> i.getName().equals(name))
				.findAny()
				.orElse(null);
		
		// create
		if ( indicator == null ) {
			indicator = JobFactory.eINSTANCE.createKeyIndicatorDate();
			indicator.setName(name);
			indicators.add(indicator);
		}
		
		// update
		indicator.setDate(date);
		indicator.setFormat(format);
	}
}
