package com.misc.common.moplaf.job.jobxmlrpc.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.misc.common.moplaf.job.Plugin;

public class Util {
	static public boolean serialize(EList<EObject> objects, StringWriter writer) {
	    XMLResource new_resource = new XMIResourceImpl();
	    for ( EObject object : objects) {
		    EObject copyJob = EcoreUtil.copy(object);
		    new_resource.getContents().add(copyJob);
	    }
		try {
			new_resource.save(writer, null);
		} catch (IOException e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("JobEngineClient.runJobImpl, serialize "+ e.getMessage());
			return false;
		}
		return true;
	}

	static public boolean deserialize(EList<EObject> objects, InputStream reader) {
	    XMLResource new_resource = new XMIResourceImpl();
	    try {
	    	new_resource.load(reader, null);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("ServerCallInterface.runJob: exception in load: "+e.getMessage());
			return false;
		}

		for (EObject object : new_resource.getContents()){
			objects.add(object);
		}
		new_resource.getContents().clear();
		return true;
	}
	
	static public EObject deserialize(InputStream reader) {
		BasicEList<EObject> objects = new BasicEList<>();
		boolean serialized = Util.deserialize(objects, reader);
		if ( !serialized ) {
			return null;
		}
		if ( objects.size()==0 ) {
			return null;
		}
		return objects.get(0);
	}
	
	static public boolean serialize(EObject object, StringWriter writer) {
		BasicEList<EObject> objects = new BasicEList<>();
		objects.add(object);
		return Util.serialize(objects, writer);
	}

}
