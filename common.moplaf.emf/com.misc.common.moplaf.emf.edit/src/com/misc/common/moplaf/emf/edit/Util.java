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
package com.misc.common.moplaf.emf.edit;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

public class Util {
	
	static public Adapter adapt(Object target, Object type){
		  if ( !(target instanceof Notifier)){ return null;	  }
		  
		  if ( !(type instanceof Class<?>) ) { return null; }
		  Notifier notifier = (Notifier)target;
		  for (Adapter adapter : notifier.eAdapters()){
			  if ( (((Class<?>)type).isInstance(adapter)) ){
				  return adapter;
	      }
	    }
	    return null;
	}
};
