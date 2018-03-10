package com.misc.common.moplaf.job.jobxmlrpc.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.job.Plugin;

public class Util {
	static public boolean serialize(EList<EObject> objects, StringWriter writer) {
		try {
			return com.misc.common.moplaf.serialize.Util.serialize(objects, writer, null, "xmi");
		} catch (IOException e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("JobEngineClient.runJobImpl, serialize "+ e.getMessage());
			return false;
		}
	}

	static public boolean deserialize(EList<EObject> objects, InputStream reader) {
	    try {
	    	return com.misc.common.moplaf.serialize.Util.deserialize(objects,  reader,  null, "xmi");
	    	} 
	    catch (IOException e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("ServerCallInterface.runJob: exception in load: "+e.getMessage());
			return false;
		}
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
