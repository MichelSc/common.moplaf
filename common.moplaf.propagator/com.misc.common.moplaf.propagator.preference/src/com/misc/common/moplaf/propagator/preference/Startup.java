package com.misc.common.moplaf.propagator.preference;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IStartup;

import com.misc.common.moplaf.propagator2.Plugin;

public class Startup implements IStartup, PrefConstants {

	@Override
	public void earlyStartup() {
		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		boolean logOnTouch   = prefStore.getBoolean(PREF_LOG_ON_TOUCH);
		boolean logOnCalc    = prefStore.getBoolean(PREF_LOG_ON_CALC);
		boolean logOnInfo    = prefStore.getBoolean(PREF_LOG_ON_INFO);
		boolean logOnWarning = prefStore.getBoolean(PREF_LOG_ON_WARNING);
		boolean logOnError   = prefStore.getBoolean(PREF_LOG_ON_ERROR);
		boolean showMetadata = prefStore.getBoolean(PREF_SHOW_METADATA);
		
		Plugin.INSTANCE.getLogger().setLogOnTouch  (logOnTouch);
		Plugin.INSTANCE.getLogger().setLogOnCalc   (logOnCalc);
		Plugin.INSTANCE.getLogger().setLogOnInfo   (logOnInfo);
		Plugin.INSTANCE.getLogger().setLogOnWarning(logOnWarning);
		Plugin.INSTANCE.getLogger().setLogOnError  (logOnError);
		Plugin.INSTANCE.setShowMetadata(showMetadata);
	
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
	      public void propertyChange(PropertyChangeEvent event) {
	    	  String property = event.getProperty();
	    	  Object newValue = event.getNewValue();
	    	  
	    	  Boolean newValueAsBoolean = false;
	    	  if ( newValue instanceof Boolean ){
	    		  newValueAsBoolean = (Boolean)newValue;
	    	  }

	    	  if ( property == PREF_LOG_ON_TOUCH ){
	    			Plugin.INSTANCE.getLogger().setLogOnTouch  (newValueAsBoolean);
	    	  } else if ( property == PREF_LOG_ON_CALC){
	    			Plugin.INSTANCE.getLogger().setLogOnCalc   (newValueAsBoolean);
	    	  } else if ( property == PREF_LOG_ON_INFO ){
	    			Plugin.INSTANCE.getLogger().setLogOnInfo   (newValueAsBoolean);
	    	  } else if ( property == PREF_LOG_ON_WARNING ){
	    			Plugin.INSTANCE.getLogger().setLogOnWarning(newValueAsBoolean);
	    	  } else if ( property == PREF_LOG_ON_ERROR ){
	    			Plugin.INSTANCE.getLogger().setLogOnError  (newValueAsBoolean);
	    	  } else if ( property.equals(PREF_SHOW_METADATA) ){
	    			Plugin.INSTANCE.setShowMetadata	           (newValueAsBoolean);
	    	  }
	       }});
	}
}
