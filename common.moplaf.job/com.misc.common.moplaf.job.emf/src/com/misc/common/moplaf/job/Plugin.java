/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.job.preference.Activator;

/**
 * This is the central singleton for the Job model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin {
//	private boolean logOnInfo    = false;
//	private boolean logOnWarning = false;
//	private boolean logOnError   = false;
	private boolean showMetadata = false;
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Plugin INSTANCE = new Plugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin() {
		super(new ResourceLocator [] {});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	public boolean getShowMetadata(){
		return this.showMetadata;
	}


	public void onStartUp(){
		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.job.Plugin.onStartUp: called");

		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
//		this.logOnInfo    = prefStore.getBoolean(com.misc.common.moplaf.dbsynch.preference.PrefConstants.PREF_LOG_ON_INFO);
//		this.logOnWarning = prefStore.getBoolean(com.misc.common.moplaf.dbsynch.preference.PrefConstants.PREF_LOG_ON_WARNING);
//		this.logOnError   = prefStore.getBoolean(com.misc.common.moplaf.dbsynch.preference.PrefConstants.PREF_LOG_ON_ERROR);
		this.showMetadata = prefStore.getBoolean(com.misc.common.moplaf.job.preference.PrefConstants.PREF_SHOW_METADATA);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  Boolean newValueAsBoolean = false;
		    	  if ( newValue instanceof Boolean ){
		    		  newValueAsBoolean = (Boolean)newValue;
		    	  }
//
//		    	  if ( property == com.misc.common.moplaf.dbsynch.preference.PrefConstants.PREF_LOG_ON_INFO ){
//				  		Plugin.this.logOnInfo = newValueAsBoolean;
//		    	  } else if ( property == com.misc.common.moplaf.dbsynch.preference.PrefConstants.PREF_LOG_ON_WARNING ){
//						Plugin.this.logOnWarning = newValueAsBoolean;
//		    	  } else if ( property == com.misc.common.moplaf.dbsynch.preference.PrefConstants.PREF_LOG_ON_ERROR ){
//						Plugin.this.logOnError = newValueAsBoolean;
//		    	  } else 
		    		  if ( property == com.misc.common.moplaf.job.preference.PrefConstants.PREF_SHOW_METADATA ){
						Plugin.this.showMetadata = newValueAsBoolean;
		    	  }
		       }});

		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.job.Plugin.onStartUp: done");
	}



	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
		/**
		 * Starts the plugin.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
			Plugin.INSTANCE.onStartUp();
		}
	}
	

}
