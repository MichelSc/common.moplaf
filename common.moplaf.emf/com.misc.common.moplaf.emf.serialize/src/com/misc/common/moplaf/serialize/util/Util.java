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
package com.misc.common.moplaf.serialize.util;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.file.Plugin;
import com.misc.common.moplaf.serialize.Scheme;


public class Util {
	
	static public Scheme getScheme(String scheme_id) {
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.emf.serialize.scheme");
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
			if ( this_element_full_id.contentEquals(scheme_id)) {
				Object value;
				try {
					value = element.createExecutableExtension("class");
				} catch (CoreException e) {
					String message = String.format("Extension %s, creating the class, exception %s", scheme_id, e.getMessage());
					Plugin.INSTANCE.logError(message);
					return null;
				}
				if ( value instanceof Scheme) {
					return (Scheme)value;
				} else {
					String message = String.format("Extension %s returned no Scheme, but a %s", scheme_id, value.getClass().getName());
					Plugin.INSTANCE.logError(message);
					return null;
				}
			}
		}
		return null;
	}
	
	static public boolean serialize(String scheme_id, EList<EObject> objects, Writer writer){
		Scheme scheme = Util.getScheme(scheme_id);
		if ( scheme == null ) {
			Plugin.INSTANCE.logError("Serialize no scheme");
		}
		
		try {
			return scheme.serialize(objects,  writer);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("Serialize exception "+e.getMessage());
			return false;
		}
	}

	static public boolean serialize(String scheme_id, EObject object, Writer writer) {
		BasicEList<EObject> objects = new BasicEList<>();
		objects.add(object);
		return Util.serialize(scheme_id, objects, writer);
	}

	static public boolean serialize(Scheme scheme, EObject object, Writer writer) {
		BasicEList<EObject> objects = new BasicEList<>();
		objects.add(object);
		try {
			return scheme.serialize(objects, writer);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("Serialize exception "+e.getMessage());
			return false;
		}
	}

	static public boolean deserialize(String scheme_id, EList<EObject> objects, Reader reader)  {
		Scheme scheme = Util.getScheme(scheme_id);
		if ( scheme == null ) {
			return false;
		}
		try {
			return scheme.deserialize(objects,  reader);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("Deserialize exception "+e.getMessage());
			return false;
		}
	}
	
	static public EObject deserialize(String scheme_id, Reader reader)  {
		BasicEList<EObject> objects = new BasicEList<>();
		boolean serialized = Util.deserialize(scheme_id, objects, reader);
		if ( !serialized ) {
			return null;
		}
		if ( objects.size()==0 ) {
			return null;
		}
		return objects.get(0);
	}
	
	static public EObject deserialize(Scheme scheme, Reader reader, String extension_id)  {
		BasicEList<EObject> objects = new BasicEList<>();
		boolean serialized;
		try {
			serialized = scheme.deserialize(objects, reader);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("Deserialize exception "+e.getMessage());
			return null;
		}
		if ( !serialized ) {
			return null;
		}
		if ( objects.size()==0 ) {
			return null;
		}
		return objects.get(0);
	}
}
