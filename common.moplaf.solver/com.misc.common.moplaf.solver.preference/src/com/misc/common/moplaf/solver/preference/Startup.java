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
package com.misc.common.moplaf.solver.preference;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IStartup;

import com.misc.common.moplaf.solver.Plugin;

public class Startup implements IStartup, PrefConstants {

	@Override
	public void earlyStartup() {
		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		boolean logOnInfo    = prefStore.getBoolean(PREF_LOG_ON_INFO);
		boolean logOnWarning = prefStore.getBoolean(PREF_LOG_ON_WARNING);
		boolean logOnError   = prefStore.getBoolean(PREF_LOG_ON_ERROR);
		
		Plugin.INSTANCE.getLogger().setLogOnInfo   (logOnInfo);
		Plugin.INSTANCE.getLogger().setLogOnWarning(logOnWarning);
		Plugin.INSTANCE.getLogger().setLogOnError  (logOnError);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  Boolean newValueAsBoolean = false;
		    	  if ( newValue instanceof Boolean ){
		    		  newValueAsBoolean = (Boolean)newValue;
		    	  }

		    	  if        ( property.equals(PREF_LOG_ON_INFO) ){
		    			Plugin.INSTANCE.getLogger().setLogOnInfo   (newValueAsBoolean);
		    	  } else if ( property.equals(PREF_LOG_ON_WARNING) ){
		    			Plugin.INSTANCE.getLogger().setLogOnWarning(newValueAsBoolean);
		    	  } else if ( property.equals(PREF_LOG_ON_ERROR) ){
		    			Plugin.INSTANCE.getLogger().setLogOnError  (newValueAsBoolean);
		    	  }
		       }});

	}

}
