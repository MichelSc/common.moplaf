package com.misc.common.moplaf.serialize;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Scheme {
	
	public boolean serialize(EList<EObject> objects, Writer writer) throws IOException;

	public boolean deserialize(EList<EObject> objects, Reader reader) throws IOException;
}
