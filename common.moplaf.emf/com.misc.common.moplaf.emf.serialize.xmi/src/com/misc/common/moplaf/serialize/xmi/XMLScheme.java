package com.misc.common.moplaf.serialize.xmi;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.xml.sax.InputSource;

import com.misc.common.moplaf.serialize.Scheme;

public class XMLScheme implements Scheme {

	public XMLScheme() {
	}

	public static Scheme INSTANCE = new XMLScheme();

	public static String SCHEME_ID = "com.misc.common.moplaf.emf.serialize.xmi.schemes.xml";

	@Override
	public boolean serialize(EList<EObject> objects, Writer writer) throws IOException {
	    XMLResource new_resource = new XMLResourceImpl();
	    
	    for ( EObject object : objects) {
		    EObject copyJob = EcoreUtil.copy(object);
		    new_resource.getContents().add(copyJob);
	    }
	    
		new_resource.save(writer, null);
		
		return true;
	}

	@Override
	public boolean deserialize(EList<EObject> objects, Reader reader) throws IOException {
	    XMLResource new_resource = new XMLResourceImpl();

	    new_resource.load(new InputSource(reader), null);

		Iterator<EObject> iterator = new_resource.getContents().iterator();
		while ( iterator.hasNext() ){
			EObject object = iterator.next();
			iterator.remove();
			objects.add(object);  
		}
		
		return true;
	}

}
