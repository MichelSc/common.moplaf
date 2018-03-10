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
	static public String getDefaultExtensionID() {
		return "com.misc.common.moplaf.emf.serialize.xmi.schemes";
	}
	
	static public Scheme getScheme(String extension_id, String scheme_id) {
		String the_extention_id = extension_id==null ? Util.getDefaultExtensionID() : extension_id;
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.emf.serialize.scheme");
		for ( IConfigurationElement element : elements){
			// check the extension id 
			String element_extension = element.getDeclaringExtension().getUniqueIdentifier();
			if ( !element_extension.equals(the_extention_id)) {
				continue;
			}
			// check the scheme id
			if ( scheme_id!=null && !element.getAttribute("id").equals(scheme_id) ) {
				continue;
			}
			Object value;
			try {
				value = element.createExecutableExtension("class");
			} catch (CoreException e) {
				continue;
			}
			if ( value instanceof Scheme) {
				return (Scheme)value;
			}
		}
		return null;
	}
	
	static public Scheme getScheme(String extension_id) {
		return Util.getScheme(extension_id, null);
	}
	
	static public boolean serialize(EList<EObject> objects, StringWriter writer, String extension_id, String scheme_id) throws IOException {
		Scheme scheme = Util.getScheme(extension_id, scheme_id);
		if ( scheme == null ) {
			return false;
		}
		
		return scheme.serialize(objects,  writer);
	}

	static public boolean serialize(EObject object, StringWriter writer, String extension_id, String scheme_id) throws IOException {
		BasicEList<EObject> objects = new BasicEList<>();
		objects.add(object);
		return Util.serialize(objects, writer, extension_id, scheme_id);
	}

	static public boolean deserialize(EList<EObject> objects, InputStream reader, String extension_id, String scheme_id) throws IOException {
		Scheme scheme = Util.getScheme(extension_id, scheme_id);
		if ( scheme == null ) {
			return false;
		}
		return scheme.deserialize(objects,  reader);
	}
	
	static public EObject deserialize(InputStream reader, String extension_id, String scheme_id) throws IOException {
		BasicEList<EObject> objects = new BasicEList<>();
		boolean serialized = Util.deserialize(objects, reader, extension_id, scheme_id);
		if ( !serialized ) {
			return null;
		}
		if ( objects.size()==0 ) {
			return null;
		}
		return objects.get(0);
	}

}
