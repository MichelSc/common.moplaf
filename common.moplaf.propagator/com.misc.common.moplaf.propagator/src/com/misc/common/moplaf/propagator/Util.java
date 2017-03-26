/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.propagator;


import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

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
	
	public static PropagatorFunctionAdapter getPropagatorFunctionAdapter(Notifier target, Object type)	{
	    return (PropagatorFunctionAdapter) Util.getAdapter(target, type);
	}	
	
	public static Adapter adapt(Notifier target, Object type){
		if ( type instanceof Class ){
			Class adaptertype = (Class)type;
			Iterator<Adapter> currentAdapter = target.eAdapters().iterator();
			LinkedList<Adapter> toremove = new LinkedList<Adapter>();
			while ( currentAdapter.hasNext() ){
    			Adapter adapter = currentAdapter.next();
    			if (adaptertype.isAssignableFrom(adapter.getClass())) {
    				// adapter is a specialization 
    				return adapter;
    			}
    			else if ( adapter.getClass().isAssignableFrom(adaptertype)){
    				// adapter is more general and will be replaced
    				toremove.add(adapter);
    			}
		    } // traverse the adapters
			// no adpater found: remove the super types, and construct the required type
			target.eAdapters().removeAll(toremove);
			try {
				Constructor cons = adaptertype.getDeclaredConstructor();
				Adapter adapter = (Adapter) cons.newInstance();
				target.eAdapters().add(adapter);
				return adapter;
			} catch (Exception e) {
				CommonPlugin.INSTANCE.log("PropagatorLayer: no constructor for "+adaptertype.getName());
				return null;
			}
		}
	    return Util.getAdapter(target, type);
	}	
	
	public static void propagate(ResourceSet resource_set){
		for (Resource resource : resource_set.getResources()) {
			Util.propagate(resource);
		} 
	}

	public static void propagate(Resource resource){
		 for ( EObject object : resource.getContents()){
			 if ( object instanceof ObjectWithPropagatorFunctionAdapterScope ){
				 ObjectWithPropagatorFunctionAdapterScope scope = (ObjectWithPropagatorFunctionAdapterScope)object;
				 Plugin.INSTANCE.logInfo("refresh object "+ scope.toString(), null);
				 scope.refresh();
			 }  
		 }  // traverse the EObjects
	}

};
