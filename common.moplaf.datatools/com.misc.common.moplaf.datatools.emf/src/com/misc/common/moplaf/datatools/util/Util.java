package com.misc.common.moplaf.datatools.util;

import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.Plugin;


public class Util {

	static public EList<DataTool> getNewDataTools(DataToolType type) {
		BasicEList<DataTool> list = new BasicEList<DataTool>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor(Plugin.EXTENSION_DATATOOL_FACTORY);
		for ( IConfigurationElement element : elements){
			Object value;
			try {
				String type_as_string = element.getAttribute("type");
				if ( type_as_string.equals(type.getLiteral())) {
					value = element.createExecutableExtension("class");
					if ( value instanceof DataToolFactory) {
						DataTool new_tool = ((DataToolFactory)value).createDataTool();
						if ( new_tool!=null){
							list.add(new_tool);
						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("com.misc.common.moplaf.datatools.Util.getNewDataTools: exception caught "+e.getMessage());
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
