package com.misc.common.moplaf.serialize.xmi;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.misc.common.moplaf.serialize.Scheme;

public class XMLScheme implements Scheme {

	public XMLScheme() {
	}

	@Override
	public boolean serialize(EList<EObject> objects, StringWriter writer) throws IOException {
	    XMLResource new_resource = new XMLResourceImpl();
	    
	    for ( EObject object : objects) {
		    EObject copyJob = EcoreUtil.copy(object);
		    new_resource.getContents().add(copyJob);
	    }
	    
		new_resource.save(writer, null);
		
		return true;
	}

	@Override
	public boolean deserialize(EList<EObject> objects, InputStream reader) throws IOException {
	    XMLResource new_resource = new XMLResourceImpl();

	    new_resource.load(reader, null);

		for (EObject object : new_resource.getContents()){
			objects.add(object);
		}
		new_resource.getContents().clear();
		
		return true;
	}

}
