package com.misc.common.moplaf.datatools.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Category;
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
	
	/**
	 * 
	 * @param tobes: new set elements, input of the update
	 * @param categorizers: sequence of Categorizers to be used
	 * @param level: level of Categorizer used in this call
	 * @param elements: set of elements to be updated by this call
	 * @param categories: set of Categories to be updated by this call
	 */
	public static void refreshCategories(ObjectSet tobes, 
			                             EList<Categorizer> categorizers, 
			                             int level, 
			                             EList<EObject> elements, 
			                             EList<Category> categories) {
		// update the elements of this category
		Iterator<EObject> iterator_asis = elements.iterator();
		while ( iterator_asis.hasNext()) {
			EObject asis = iterator_asis.next();
			if ( !tobes.remove(asis)) {
				// the asis is not tobe
				iterator_asis.remove();
			}
		}
		elements.addAll(tobes);
		
		// update the subcategories
		if ( categorizers.size()<=level ) {
			// there are no deeper levels
			categories.clear();
		} else {
			// there are deeper levels than the current level
			Categorizer criteria = categorizers.get(level);
			HashMap<Object, ObjectSet> cats_tobe  = new HashMap<>();
			// collect the cats
			for ( EObject element : elements) {
				Object cat_value = criteria.getCategoryValue(element);
				if ( cat_value!=null ) {
					ObjectSet cat_set = cats_tobe.get(cat_value);
					if ( cat_set==null ) {
						cat_set = new ObjectSet();
						cats_tobe.put(cat_value, cat_set);
					}
					cat_set.add(element);
				}
			}
			// traverse the cats asis
			Iterator<Category> cat_iterator_asis = categories.iterator();
			while ( cat_iterator_asis.hasNext()){
				Category cat_asis = cat_iterator_asis.next();
				Object cat_value = cat_asis.getCategoryValue();
				ObjectSet cat_tobe = cats_tobe.remove(cat_value);
				if ( cat_tobe==null ) {
					// category no longer populated
					// delete
					cat_iterator_asis.remove();
				} else {
					// update
					Util.refreshCategories(cat_tobe, categorizers, level+1, cat_asis.getElements(), cat_asis.getSubCategories());
				}
			}
			for (  Entry<Object, ObjectSet> cat_tobe : cats_tobe.entrySet()) {
				// create the cat
				Category new_cat = criteria.constructCategory();
				new_cat.setCategoryValue(cat_tobe.getKey());
				new_cat.setCategoryLabel(criteria.getCategoryLabel(cat_tobe.getKey()));
				categories.add(new_cat); // owning
				// fill the cat, recursive
				Util.refreshCategories(cat_tobe.getValue(), categorizers, level+1, new_cat.getElements(), new_cat.getSubCategories());
			}
		}
	}
}
