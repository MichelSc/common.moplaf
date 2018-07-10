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
	
	static public EObject naviguate(NavigationPath path, EObject in) {
		EObject out = in;
		for ( NavigationAxis path_element : path.getPathElements()) {
			out = path_element.naviguate(out);
		}
		return out;
	}
	
	static public Set<EObject> naviguate(NavigationPath path, Set<EObject> ins) {
		Set<EObject> ins_current = ins;
		for ( NavigationAxis path_element : path.getPathElements()) {
			HashSet<EObject> outs_current = new HashSet<EObject>();
			for ( EObject in_current : ins_current) {
				EList<EObject> outs_list = path_element.naviguateMany(in_current);
				if ( outs_list!=null ) {
					outs_current.addAll(outs_list);
				}
			}
			ins_current = outs_current;
		}
		return ins_current;
	}
	
	static public BasicEList<EObject> naviguate(NavigationPath path, BasicEList<EObject> ins) {
		Set<EObject> ins_set = new HashSet<EObject>(ins);
		Set<EObject> outs_set = Util.naviguate(path,  ins_set);
		BasicEList<EObject> outs_list = new BasicEList<EObject>(outs_set);
		return outs_list;
	}
}
