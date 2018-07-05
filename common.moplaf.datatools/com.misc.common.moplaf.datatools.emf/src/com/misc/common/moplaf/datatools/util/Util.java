package com.misc.common.moplaf.datatools.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.datatools.Extractor;


public class Util {

	static public EList<Extractor> getNewExtractors() {
		BasicEList<Extractor> list = new BasicEList<Extractor>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor("com.misc.common.moplaf.datatools.emf.extractor_factory");
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				value = element.createExecutableExtension("class");
				if ( value instanceof ExtractorFactory) {
					Extractor new_extractor = ((ExtractorFactory)value).createExtractor();
					if ( new_extractor!=null){
						list.add(new_extractor);
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.job.Util.getNewRuns: exception caught "+e.getMessage());
			}
		}
		return list;
	}
}
