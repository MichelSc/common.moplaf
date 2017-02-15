/**
 */
package com.misc.common.moplaf.propagator2;


import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import com.misc.common.moplaf.common.Logger;
import com.misc.common.moplaf.common.Logger.Level;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionSourceBindings;
import com.misc.common.moplaf.propagator2.util.Util;


/**
 * This is the central singleton for the Propagator model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin  {
	private Logger logger = new Logger("Propagator");
	private boolean showMetadata = false;

	public Logger getLogger(){
		return this.logger;
	}

	public boolean getShowMetadata(){
		return this.showMetadata;
	}

	public void setShowMetadata(boolean showMetadata) {
		this.showMetadata = showMetadata;
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
		String messageAsString = message!=null ? message+", ": "";
		
		PropagatorFunction propagatorFunction = null;
		ObjectWithPropagatorFunctions object = null;
		Bindings bindings = null;
		
		if ( adapter instanceof PropagatorFunctionSourceBindings){
			PropagatorFunctionSourceBindings sourceBindings = (PropagatorFunctionSourceBindings)adapter;
			bindings = sourceBindings.getBindings();
			propagatorFunction = sourceBindings.getPropagatorFunction();
			object = propagatorFunction.getObjectWithPropagatorFunctions();
		} else if  ( adapter instanceof PropagatorFunctionBindings){
			PropagatorFunctionBindings propagatorFunctionBindings = (PropagatorFunctionBindings)adapter;
			bindings = propagatorFunctionBindings.doGetBindings();
			propagatorFunction = propagatorFunctionBindings;
			object = propagatorFunction.getObjectWithPropagatorFunctions();
		}
		
		String objectAsString = String.format("object: %1$s(%2$d)", 
				object == null ? "No object" : Util.LastTokenDotSeparated(object.getClass().getName()),
				object == null ? 0 : (object.hashCode() % 1000 +1));
		
		String functionAsString = propagatorFunction == null
				               ? "No function"
				               : String.format("function: %1$s", Util.LastTokenDotSeparated(propagatorFunction.getClass().getName()));

		String bindingsAsString = bindings == null 
				               ? "No bindings"
				               : String.format("bindings: %1$s", bindings.asString());
		
		return  String.format("%1$s %2$s, %3$s, %4$s" , 
										messageAsString, 
								        objectAsString,
								        functionAsString,
								        bindingsAsString);
		
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
