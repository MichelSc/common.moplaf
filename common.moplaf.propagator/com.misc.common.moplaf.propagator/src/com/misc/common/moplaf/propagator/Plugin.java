/**
 */
package com.misc.common.moplaf.propagator;


import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.osgi.framework.BundleContext;

import com.misc.common.moplaf.propagator.preference.Activator;
import com.misc.common.moplaf.propagator.preference.PrefConstants;


/**
 * This is the central singleton for the Propagator model plugin.
 * <!-- begin-user-doc -->
 * @implements PrefConstants
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin implements PrefConstants{
	private boolean logOnTouch   = false;
	private boolean logOnCalc    = false;
	private boolean logOnInfo    = false;
	private boolean logOnWarning = false;
	private boolean logOnError   = false;
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
	
	public boolean getLogOnTouch(){
		return this.logOnTouch;
	}

	public boolean getLogOnCalc(){
		return this.logOnCalc;
	}

	public boolean getLogOnInfo(){
		return this.logOnInfo;
	}

	public boolean getLogOnWarning(){
		return this.logOnWarning;
	}

	public boolean getLogOnError(){
		return this.logOnError;
	}

	public void onStartUp(){
		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.propagator.Plugin.onStartUp: called");

		final IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		this.logOnTouch   = prefStore.getBoolean(PREF_LOG_ON_TOUCH);
		this.logOnCalc    = prefStore.getBoolean(PREF_LOG_ON_CALC);
		this.logOnInfo    = prefStore.getBoolean(PREF_LOG_ON_INFO);
		this.logOnWarning = prefStore.getBoolean(PREF_LOG_ON_WARNING);
		this.logOnError   = prefStore.getBoolean(PREF_LOG_ON_ERROR);
		
		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {
		      public void propertyChange(PropertyChangeEvent event) {
		    	  String property = event.getProperty();
		    	  Object newValue = event.getNewValue();
		    	  
		    	  Boolean newValueAsBoolean = false;
		    	  if ( newValue instanceof Boolean ){
		    		  newValueAsBoolean = (Boolean)newValue;
		    	  }

		    	  if ( property == PREF_LOG_ON_TOUCH ){
				  		Plugin.this.logOnTouch = newValueAsBoolean;
		    	  } else if ( property == PREF_LOG_ON_CALC){
				  		Plugin.this.logOnCalc = newValueAsBoolean;
		    	  } else if ( property == PREF_LOG_ON_INFO ){
				  		Plugin.this.logOnInfo = newValueAsBoolean;
		    	  } else if ( property == PREF_LOG_ON_WARNING ){
						Plugin.this.logOnWarning = newValueAsBoolean;
		    	  } else if ( property == PREF_LOG_ON_ERROR ){
						Plugin.this.logOnError = newValueAsBoolean;
		    	  }
		       }});

		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.propagator.Plugin.onStartUp: done");
	}
	
	public enum LogLevel {
	    LOG_LEVEL_TOUCH, 
	    LOG_LEVEL_CALC, 
	    LOG_LEVEL_INFO, 
	    LOG_LEVEL_WARNING, 
	    LOG_LEVEL_ERROR
	}
	
	private boolean doLog(LogLevel level){
		switch (level){
		case LOG_LEVEL_TOUCH:   return this.getLogOnTouch();
		case LOG_LEVEL_CALC:    return this.getLogOnCalc();
		case LOG_LEVEL_INFO:    return this.getLogOnInfo();
		case LOG_LEVEL_WARNING: return this.getLogOnWarning();
		case LOG_LEVEL_ERROR:   return this.getLogOnError();
		}
		return false;
	}
	
	private String getLevelAsString(LogLevel level){
		switch (level){
		case LOG_LEVEL_TOUCH:   return "Touch";
		case LOG_LEVEL_CALC:    return "Calc";
		case LOG_LEVEL_INFO:    return "Info";
		case LOG_LEVEL_WARNING: return "Warning";
		case LOG_LEVEL_ERROR:   return "Error";
		}
		return "Unknown";
	}
	
	public void logMessage(LogLevel level, String message, PropagatorFunctionAdapter adapter){
		if ( this.doLog(level)){
			String levelAsString = this.getLevelAsString(level);
			Notifier target = adapter.getTarget();
			String fullMessage = String.format("Propagator: %5$s: %3$s, object: %1$s, function: %2$s, object %4$s" , 
	                Util.LastTokenDotSeparated(target.getClass().getName()),
			        Util.LastTokenDotSeparated(adapter.getClass().getName()),
			        message, 
			        target,
			        levelAsString);

			CommonPlugin.INSTANCE.log( fullMessage);
		}
	}
	
	public void logInfo(String message, PropagatorFunctionAdapter adapter){
		this.logMessage(LogLevel.LOG_LEVEL_INFO, message, adapter);
	}
	
	public void logWarning(String message){
		this.logMessage(LogLevel.LOG_LEVEL_WARNING, message, adapter);
	}
	
	public void logError(String message){
		this.logMessage(LogLevel.LOG_LEVEL_ERROR, message, adapter);
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
