package com.misc.common.moplaf.propagator2.util;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.PropagatorFunction;

public class Util {
	/**
	 * Retrieve the last token of the input string for a given delimeter
	 * @param inputstring
	 * @param regexdelim
	 * @return the last token
	 */
	public static String LastToken(String inputstring, String regexdelim){
		String[] tokens = inputstring.split(regexdelim);
		int noftokens = tokens.length;
		if ( noftokens==0){ return "";}
		String lasttoken = tokens[noftokens-1];
		return lasttoken;
	}

	/**
	 * Retrieve the last token of a dot separated string
	 * @param inputstring
	 * @return the last token
	 */
	public static String LastTokenDotSeparated(String inputstring){
		// first \ to escape the \ of the java string literal
		// second \ to escape the dot of the regex
		// so this represents the string "." as a regex
		String dotdelim = "\\."; 
		return LastToken(inputstring, dotdelim);
	}
	
	/**
	 * Format a notification received by a given adapter
	 * @param adapter
	 * @param msg
	 * @return the formated notification
	 */
	public static String FormatNotification(Adapter adapter, Notification msg){
		Object target   = (adapter==null ? null : adapter.getTarget());
		Object feature  = msg.getFeature();
		Object notifier = msg.getNotifier();
		Object oldvalue = msg.getOldValue();
		Object newvalue = msg.getNewValue();
		String asstring = "Adpt, "
     		         + (adapter==null?  "null": Util.LastTokenDotSeparated(adapter.getClass().getName()))
	                 + ", ntf "
	                 + (notifier==null? "null": Util.LastTokenDotSeparated(notifier.getClass().getName()))
	                 + ", tgt "
	                 + (target==null?   "null": Util.LastTokenDotSeparated(target.getClass().getName()))
	                 + ", ftr "
                     + (feature instanceof ENamedElement? ((ENamedElement)feature).getName(): "null")
                     + ", typ "+ getNotificationEventTypeAsString(msg.getEventType())
                     + ", old "+ (oldvalue==null ? "null": oldvalue.toString())
                     + ", new "+ (newvalue==null ? "null": newvalue.toString())
                     + ", touch "+ msg.isTouch();
        return asstring;
	}
	
	/**
	 * Convert a event type as number into a string
	 * @param eventtype
	 * @return the event type formated as string
	 */
	protected static String getNotificationEventTypeAsString(int eventtype){
		switch ( eventtype){
		case Notification.NO_FEATURE_ID:    return "NO_FEATURE_ID";
		case Notification.CREATE:           return "CREATE";
		case Notification.SET:              return "SET";
		case Notification.UNSET:            return "UNSET";
		case Notification.ADD:              return "ADD";
		case Notification.REMOVE:           return "REMOVE";
		case Notification.ADD_MANY:         return "ADD_MANY";
		case Notification.REMOVE_MANY:      return "REMOVE_MANY";
		case Notification.MOVE:             return "MOVE";
		case Notification.REMOVING_ADAPTER: return "REMOVING_ADAPTER";
		case Notification.RESOLVE:          return "RESOLVE";
		case Notification.EVENT_TYPE_COUNT: return "EVENT_TYPE_COUNT";
		}
		return "unknown";
	}
	
	/**
	 * getContainer 
	 * @param object
	 * @param paramclass
	 * @return
	 */
	public static EObject getContainer(EObject object, EClass paramclass){
		EObject current = object;
		while ( current!=null){
			if ( paramclass.isSuperTypeOf(current.eClass())){
				return current;
			}
			current = current.eContainer();
		}
		return null;
	}
	
	/**
	 * 
	 * @param target
	 * @return
	 */
	public static PropagatorFunctionAdapter getPropagatorFunctionAdapter(Notifier target){
		PropagatorFunctionAdapter propagatorFunctionAdapter = (PropagatorFunctionAdapter) com.misc.common.moplaf.common.util.Util.adapt(target, PropagatorFunctionAdapter.class, true);
		return propagatorFunctionAdapter;
	}
	/**
	 * 
	 * @param target
	 * @param type
	 * @return
	 */
	public static Adapter getAdapter(Notifier target, Object type)	{
		if ( target == null ){
			return null;
		}
	    for (Adapter adapter : target.eAdapters()) {
	      if (adapter.isAdapterForType(type)) {
	        return adapter;
	      }
	    }
	    return null;
	}	
	
//	/**
//	 * 
//	 * @param target
//	 * @param type
//	 * @return
//	 */
//	public static Adapter adapt(Notifier target, Object type){
//		if ( type instanceof Class ){
//			Class adaptertype = (Class)type;
//			Iterator<Adapter> currentAdapter = target.eAdapters().iterator();
//			LinkedList<Adapter> toremove = new LinkedList<Adapter>();
//			while ( currentAdapter.hasNext() ){
//    			Adapter adapter = currentAdapter.next();
//    			if (adaptertype.isAssignableFrom(adapter.getClass())) {
//    				// adapter is a specialization 
//    				return adapter;
//    			}
//    			else if ( adapter.getClass().isAssignableFrom(adaptertype)){
//    				// adapter is more general and will be replaced
//    				toremove.add(adapter);
//    			}
//		    } // traverse the adapters
//			// no adpater found: remove the super types, and construct the required type
//			target.eAdapters().removeAll(toremove);
//			try {
//				Constructor cons = adaptertype.getDeclaredConstructor();
//				Adapter adapter = (Adapter) cons.newInstance();
//				target.eAdapters().add(adapter);
//				return adapter;
//			} catch (Exception e) {
//				CommonPlugin.INSTANCE.log("PropagatorLayer: no constructor for "+adaptertype.getName());
//				return null;
//			}
//		}
//		else if ( type instanceof Bindings ){
//			Bindings adaptertype = (Bindings)type;
//			Iterator<Adapter> currentAdapter = target.eAdapters().iterator();
//			while ( currentAdapter.hasNext() ){
//    			Adapter adapter = currentAdapter.next();
//    			if ( adapter.isAdapterForType(adaptertype)){
//    				return adapter;
//    			}
//    		return new PropagatorFunctionBindings(adaptertype);
//		    } // traverse the adapters
//		}
//	    return Util.getAdapter(target, type);
//	}	
	
	/** propagate on the whole resource
	 * 
	 * @param resource_set
	 */
	public static void propagate(ResourceSet resource_set){
		for (Resource resource : resource_set.getResources()) {
			Util.propagate(resource);
		} 
	}

	/** propagate a resource
	 * 
	 * @param resource
	 */
	public static void propagate(Resource resource){
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()){
			EObject object = iterator.next();
			 if ( object instanceof ObjectWithPropagatorFunctions ){
				 ObjectWithPropagatorFunctions scope = (ObjectWithPropagatorFunctions)object;
				 Plugin.INSTANCE.logInfo("refresh object "+ scope.toString(), null);
				 propagate(scope);
				 iterator.prune();
			 }  // the object is a propagator scope
		} // traverse the objects
	}
	
	/**
	 * Get the propagation scope for the object
	 * @param object
	 * @return
	 */
	public static PropagatorFunction getScope(ObjectWithPropagatorFunctions object){
		for ( PropagatorFunction propagatorFunction : object.getPropagatorFunctions()){
			PropagatorFunction pf = propagatorFunction.getScope();
			if ( pf!=null){
				return pf;
			}
		}
		return null;
	}
	
	/**
	 * Propagate an object
	 * @param object
	 */
	public static void propagate(ObjectWithPropagatorFunctions object){
		PropagatorFunction scope = getScope(object);
		if ( scope!=null){
			scope.refresh();
		}
	}
	

};
