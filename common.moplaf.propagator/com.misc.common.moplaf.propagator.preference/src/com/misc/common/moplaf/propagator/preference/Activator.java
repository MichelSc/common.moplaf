package com.misc.common.moplaf.propagator.preference;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.propagator2.Plugin;


import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements PrefConstants{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.misc.common.moplaf.propagator.preference"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		this.onStartUp();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	public void onStartUp(){

		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		boolean logOnTouch   = prefStore.getBoolean(PREF_LOG_ON_TOUCH);
		boolean logOnCalc    = prefStore.getBoolean(PREF_LOG_ON_CALC);
		boolean logOnInfo    = prefStore.getBoolean(PREF_LOG_ON_INFO);
		boolean logOnWarning = prefStore.getBoolean(PREF_LOG_ON_WARNING);
		boolean logOnError   = prefStore.getBoolean(PREF_LOG_ON_ERROR);
		
		Plugin.INSTANCE.getLogger().setLogOnTouch  (logOnTouch);
		Plugin.INSTANCE.getLogger().setLogOnCalc   (logOnCalc);
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
	    	  }
	       }});
	}


	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
