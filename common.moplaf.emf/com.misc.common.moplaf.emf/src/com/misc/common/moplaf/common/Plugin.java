package com.misc.common.moplaf.common;

import org.osgi.framework.BundleActivator;

import com.misc.common.moplaf.common.Logger.Level;

public class Plugin extends org.eclipse.core.runtime.Plugin implements BundleActivator {
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Plugin INSTANCE = new Plugin();

	private Logger logger = new Logger("Moplaf");
	
	private String temporaryFolder = "";

	public String getTemporaryFolder() {
		return temporaryFolder;
	}

	public void setTemporaryFolder(String temporaryFolder) {
		this.temporaryFolder = temporaryFolder;
	}

	public Logger getLogger(){
		return this.logger;
	}
	
	public void logInfo(String message){
		this.logger.log(Level.INFO, message);
	}
	
	public void logWarning(String message){
		this.logger.log(Level.WARNING, message);
	}
	
	public void logError(String message){
		this.logger.log(Level.ERROR, message);
	}

}
