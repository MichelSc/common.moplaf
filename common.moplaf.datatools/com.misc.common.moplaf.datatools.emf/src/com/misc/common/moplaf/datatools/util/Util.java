package com.misc.common.moplaf.datatools.util;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationPath;


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
	
	static public EClass NavigationPathGetTargetType(NavigationPath path) {
		int nb_elements = path.getPathElements().size();
		if ( nb_elements==0 ) {
			return path.getSourceType();
		}
		NavigationAxis last_element = path.getPathElements().get(nb_elements-1);
		return last_element.getTargetType();
		
	}
	
	static public String getNavigationPath(NavigationPath path) {
		String string = path.getPathElements()
				.stream()
	            .map( e -> e.getPathElement() )
	            .collect( Collectors.joining( "," ) );
			return string;
	}
	
	static public EObject navigate(NavigationPath path, EObject in) {
		EObject out = in;
		for ( NavigationAxis path_element : path.getPathElements()) {
			out = path_element.navigate(out);
		}
		return out;
	}
	
	static public ObjectSet navigate(NavigationPath path, ObjectSet ins, int max_elements) {
		if ( path.getPathElements().isEmpty() ) {
			return ins;
		}
		ObjectSet result = new ObjectSet();
		boolean ins_complete = ins.isComplete();
		for ( EObject in : ins) {
			Util.navigate(path.getPathElements().get(0), in, max_elements, result);
		}
		if ( !ins_complete ) {
			result.setComplete(false);
		}
		return result;
	}
	
	static private void navigate(NavigationAxis axis, EObject in, int max_elements, ObjectSet result) {
		EList<EObject> outs = axis.navigateMany(in);
		NavigationAxis next_axis = axis.getNext();
		for ( EObject out : outs) {
			if ( next_axis==null) {
				if ( result.size()>=max_elements) {
					result.setComplete(false);
					break;
				} else {
					result.add(out);
				}
			} else {
				Util.navigate(next_axis, out, max_elements, result);
			}
		}
	}
}
