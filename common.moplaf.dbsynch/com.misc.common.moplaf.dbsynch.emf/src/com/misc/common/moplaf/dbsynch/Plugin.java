/**
 */
package com.misc.common.moplaf.dbsynch;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;


/**
 * This is the central singleton for the dbsynch model plugin.
 * <!-- begin-user-doc -->
 * @implements PrefConstants
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin  {
	private boolean logOnInfo    = false;
	private boolean logOnWarning = false;
	private boolean logOnError   = false;
	private boolean showMetadata = false;

	public void setLogOnInfo(boolean logOnInfo) {
		this.logOnInfo = logOnInfo;
	}

	public void setLogOnWarning(boolean logOnWarning) {
		this.logOnWarning = logOnWarning;
	}

	public void setLogOnError(boolean logOnError) {
		this.logOnError = logOnError;
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

	public boolean getLogOnInfo(){
		return this.logOnInfo;
	}

	public boolean getLogOnWarning(){
		return this.logOnWarning;
	}

	public boolean getLogOnError(){
		return this.logOnError;
	}

	public boolean getShowMetadata(){
		return this.showMetadata;
	}

	protected void logMessage(String message, String level){
		String logLine = String.format("DbSynch: %2$s: %1$s" , 
				         		         message, 
				         		         level);
		CommonPlugin.INSTANCE.log( logLine);
	}
	
	public void logInfo(String message){
		if ( this.getLogOnInfo() ){
			this.logMessage(message, "info");
		}
	}
	
	public void logWarning(String message){
		if ( this.getLogOnWarning() ){
			this.logMessage(message, "warning");
		}
	}
	
	public void logError(String message){
		if ( this.getLogOnError() ){
			this.logMessage(message, "error");
		}
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
