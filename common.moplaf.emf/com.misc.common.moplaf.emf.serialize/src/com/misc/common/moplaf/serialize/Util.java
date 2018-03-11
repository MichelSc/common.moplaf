package com.misc.common.moplaf.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


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
					// this is an error. We should report it instead of silently ignoring it.
					return null;
				}
				if ( value instanceof Scheme) {
					return (Scheme)value;
				} else {
					// this is an error. We should report it instead of silently ignoring it.
					return null;
				}
			}
		}
		return null;
	}
	
	static public boolean serialize(String scheme_id, EList<EObject> objects, StringWriter writer) throws IOException {
		Scheme scheme = Util.getScheme(scheme_id);
		if ( scheme == null ) {
			return false;
		}
		
		return scheme.serialize(objects,  writer);
	}

	static public boolean serialize(String scheme_id, EObject object, StringWriter writer) throws IOException {
		BasicEList<EObject> objects = new BasicEList<>();
		objects.add(object);
		return Util.serialize(scheme_id, objects, writer);
	}

	static public boolean serialize(Scheme scheme, EObject object, StringWriter writer) throws IOException {
		BasicEList<EObject> objects = new BasicEList<>();
		objects.add(object);
		return scheme.serialize(objects, writer);
	}

	static public boolean deserialize(String scheme_id, EList<EObject> objects, InputStream reader, String extension_id) throws IOException {
		Scheme scheme = Util.getScheme(scheme_id);
		if ( scheme == null ) {
			return false;
		}
		return scheme.deserialize(objects,  reader);
	}
	
	static public EObject deserialize(String scheme_id, InputStream reader, String extension_id) throws IOException {
		BasicEList<EObject> objects = new BasicEList<>();
		boolean serialized = Util.deserialize(scheme_id, objects, reader, extension_id);
		if ( !serialized ) {
			return null;
		}
		if ( objects.size()==0 ) {
			return null;
		}
		return objects.get(0);
	}
	
	static public EObject deserialize(Scheme scheme, InputStream reader, String extension_id) throws IOException {
		BasicEList<EObject> objects = new BasicEList<>();
		boolean serialized = scheme.deserialize(objects, reader);
		if ( !serialized ) {
			return null;
		}
		if ( objects.size()==0 ) {
			return null;
		}
		return objects.get(0);
	}
}
