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
package com.misc.common.moplaf.common.util;

import java.lang.reflect.Constructor;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class Util {

	/** logic object has resource
	 * 
	 * @param target
	 * @return
	 */
	public static boolean hasResource(EObject object){
	
		Resource resource = object.eResource();
		if ( resource == null ) { return false; }
		
		return true;
	}

	/**
	 * 
	 * @param notifier
	 * @return
	 */
	public static boolean isLoading(Notifier notifier){
		if ( notifier instanceof Resource) { return isLoading((Resource)notifier); }
		else if ( notifier instanceof EObject) { return isLoading((EObject)notifier); }
		return false;
	}

	/**
	 * 
	 * @param resource
	 * @return
	 */
	public static boolean isLoading(Resource resource){
		if ( !(resource instanceof ResourceImpl)){ return false; }

		ResourceImpl resourceImpl = (ResourceImpl)resource;
		if ( !resourceImpl.isLoading()){ return false; }
		
		return true;
	}

	/** logic is object loading
	 * 
	 * @param object
	 * @return 
	 */
	public static boolean isLoading(EObject object){
		if ( !hasResource(object) ) { return false; }
		Resource resource = object.eResource();
		return isLoading(resource);
	}
	

	/**
	 * 
	 * @param notifier
	 * @return
	 */
	public static boolean isUnoading(Notifier notifier){
		if ( notifier instanceof Resource) { return isUnloading((Resource)notifier); }
		else if ( notifier instanceof EObject) { return isUnloading((EObject)notifier); }
		return false;
	}

	/**
	 * 
	 * @param resource
	 * @return
	 */
	public static boolean isUnloading(Resource resource){
		if ( !(resource instanceof ResourceImpl)){ return false; }

		ResourceImpl resourceImpl = (ResourceImpl)resource;
		if ( resourceImpl.isLoaded()){ return false; }
		
		return true;
	}

	/** logic is object loading
	 * 
	 * @param object
	 * @return 
	 */
	public static boolean isUnloading(EObject object){
		if ( !hasResource(object) ) { return false; }
		Resource resource = object.eResource();
		return isUnloading(resource);
	}
	

	/**
	 * 
	 * @param target
	 * @param type
	 * @return
	 */
	static public Adapter adapt(Object target, Object type, boolean create) {
		if ( !(target instanceof Notifier)){ return null;	  }
		Notifier notifier = (Notifier)target;

		if ( !(type instanceof Class<?>) ) { return null; }
		Class<?>theClass = (Class<?>)type;

		for (Adapter adapter : notifier.eAdapters()){
			if ( theClass.isInstance(adapter) ){
				return adapter;
			}
		} // traverse the adapater asis
		
		if ( !create) { return null; }
		
		// create
		try {
			Constructor<?> constructor = theClass.getDeclaredConstructor();
			Adapter newAdapter = (Adapter)constructor.newInstance();
			notifier.eAdapters().add(newAdapter);
			return newAdapter;
		} catch (Exception e) {
			CommonPlugin.INSTANCE.log("com.misc.common.moplaf.emf.util.adapt: no constructor for "+theClass.getName());
			return null;
		}
	}
	
	/**
	 * 
	 * @param target
	 * @param type
	 * @return
	 */
	static public Adapter adapt(Object target, Object type) {
		return adapt(target, type, false);
	}
}