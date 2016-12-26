package com.misc.common.moplaf.job.preference;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.job.Plugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements PrefConstants{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.misc.common.moplaf.job.preference"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	public void onStartUp(){
		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		boolean showMetadata = prefStore.getBoolean(PREF_SHOW_METADATA);
		
		Plugin.INSTANCE.setShowMetadata(showMetadata);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  Boolean newValueAsBoolean = false;
		    	  if ( newValue instanceof Boolean ){
		    		  newValueAsBoolean = (Boolean)newValue;
		    	  }

		    	  if ( property == PREF_SHOW_METADATA ){
		    			Plugin.INSTANCE.setShowMetadata(newValueAsBoolean);
		    	  }
		       }});
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

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
