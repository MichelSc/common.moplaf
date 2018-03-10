package com.misc.common.moplaf.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Scheme {
	
	public boolean serialize(EList<EObject> objects, StringWriter writer) throws IOException;

	public boolean deserialize(EList<EObject> objects, InputStream reader) throws IOException;
}
