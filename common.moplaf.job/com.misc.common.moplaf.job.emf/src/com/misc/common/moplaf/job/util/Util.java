package com.misc.common.moplaf.job.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.misc.common.moplaf.file.Plugin;

public class Util {
	static public RunFactory getRunFactory(String factory_id) {
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.job.emf.scheme.run_factory");
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
			if ( this_element_full_id.contentEquals(factory_id)) {
				Object value;
				try {
					value = element.createExecutableExtension("class");
				} catch (CoreException e) {
					String message = String.format("Extension %s, creating the class, exception %s", factory_id, e.getMessage());
					Plugin.INSTANCE.logError(message);
					return null;
				}
				if ( value instanceof RunFactory) {
					return (RunFactory)value;
				} else {
					String message = String.format("Extension %s returned no RunFactory, but a %s", factory_id, value.getClass().getName());
					Plugin.INSTANCE.logError(message);
					return null;
				}
			}
		}
		return null;
	}

}
