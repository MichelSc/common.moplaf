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

	/** logic is object loading
	 * 
	 * @param object
	 * @return 
	 */
	public static boolean isLoading(EObject object){
		
		if ( !hasResource(object) ) { return false; }
	
		Resource resource = object.eResource();

		if ( !(resource instanceof ResourceImpl)){ return false; }

		ResourceImpl resourceImpl = (ResourceImpl)resource;
		if ( !resourceImpl.isLoading()){ return false; }
		
		return true;
	}
}
