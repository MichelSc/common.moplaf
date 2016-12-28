/**
 */
package com.misc.common.moplaf.dbsynch;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import com.misc.common.moplaf.common.Logger;
import com.misc.common.moplaf.common.Logger.Level;


/**
 * This is the central singleton for the dbsynch model plugin.
 * <!-- begin-user-doc -->
 * @implements PrefConstants
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin  {
	private Logger logger = new Logger();
	private boolean showMetadata = false;

	public Logger getLogger(){
		return this.logger;
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

	public boolean getShowMetadata(){
		return this.showMetadata;
	}

//	protected void logMessage(String message, String level){
//		String logLine = String.format("DbSynch: %2$s: %1$s" , 
//				         		         message, 
//				         		         level);
//		CommonPlugin.INSTANCE.log( logLine);
//	}
	
	public void logInfo(String message){
		this.logger.log(Level.INFO, message);
	}
	
	public void logWarning(String message){
		this.logger.log(Level.WARNING, message);
	}
	
	public void logError(String message){
		this.logger.log(Level.ERROR, message);
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
