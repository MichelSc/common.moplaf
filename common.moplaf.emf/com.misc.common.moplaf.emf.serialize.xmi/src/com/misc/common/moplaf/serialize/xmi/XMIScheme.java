package com.misc.common.moplaf.serialize.xmi;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.misc.common.moplaf.serialize.Scheme;


public class XMIScheme implements Scheme {
	
	public XMIScheme() {
	}

	public static Scheme INSTANCE = new XMIScheme();
	
	public static String SCHEME_ID = "com.misc.common.moplaf.emf.serialize.xmi.schemes.xmi";

	@Override
	public boolean serialize(EList<EObject> objects, StringWriter writer) throws IOException {
	    XMLResource new_resource = new XMIResourceImpl();
	    
	    for ( EObject object : objects) {
		    EObject copyJob = EcoreUtil.copy(object);
		    new_resource.getContents().add(copyJob);
	    }
	    
		new_resource.save(writer, null);
		
		return true;
	}

	@Override
	public boolean deserialize(EList<EObject> objects, InputStream reader) throws IOException {
	    XMLResource new_resource = new XMIResourceImpl();

	    new_resource.load(reader, null);

		for (EObject object : new_resource.getContents()){
			objects.add(object);
		}
		new_resource.getContents().clear();
		
		return true;
	}

}
