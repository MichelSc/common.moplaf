/**
 */
package com.misc.common.moplaf.propagator2;


import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;

import com.misc.common.moplaf.common.Logger;
import com.misc.common.moplaf.common.Logger.Level;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionBindings;
import com.misc.common.moplaf.propagator2.util.Util;


/**
 * This is the central singleton for the Propagator model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin  {
	private Logger logger = new Logger("Propagator");
	
	public Logger getLogger(){
		return this.logger;
	}
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
	
	private String formatLogMessage(String message, Object adapter){
		String adapterAsString = "";
		String objectAsString ="";
		String messageAsString = message==null ? message+", ": "";
		if ( adapter instanceof PropagatorFunctionBindings){
			PropagatorFunctionBindings propagatorFunctionAdapter = (PropagatorFunctionBindings)adapter;
			Notifier target = propagatorFunctionAdapter == null ? null : propagatorFunctionAdapter.getTarget();
			objectAsString = String.format("object: %1$s(%2$d)", 
											target == null ? "null" : Util.LastTokenDotSeparated(target.getClass().getName()),
											target == null ? 0 : (target.hashCode() % 1000 +1));
			adapterAsString = String.format("bindings: %1$s", 
											propagatorFunctionAdapter.bindings.asString());
		} else if ( adapter instanceof PropagatorFunction){
			PropagatorFunction propagatorFunction = (PropagatorFunction)adapter;
			ObjectWithPropagatorFunctions object = propagatorFunction.getObjectWithPropagatorFunctions();
			objectAsString = String.format("object: %1$s(%2$d)", 
					object == null ? "null" : Util.LastTokenDotSeparated(object.getClass().getName()),
					object == null ? 0 : (object.hashCode() % 1000 +1));
			adapterAsString = String.format("function: %1$s", 
											Util.LastTokenDotSeparated(propagatorFunction.getClass().getName()));
		}
		return  String.format("%1$s %2$s, %3$s" , 
										messageAsString, 
								        objectAsString,
								        adapterAsString);
		
	}
	
	public void logTouch(Object adapter){
		this.logger.log(Level.TOUCH, this.formatLogMessage(null, adapter));
	}

	public void logCalc(Object adapter){
		this.logger.log(Level.CALC, this.formatLogMessage(null, adapter));
	}
	
	public void logInfo(String message, Object adapter){
		this.logger.log(Level.INFO, this.formatLogMessage(message, adapter));
	}
	
	public void logWarning(String message, Object adapter){
		this.logger.log(Level.WARNING, this.formatLogMessage(message, adapter));
	}
	
	public void logError(String message, Object adapter){
		this.logger.log(Level.ERROR, this.formatLogMessage(message, adapter));
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

	}

}
