/**
 */
package com.misc.common.moplaf.report.birt;

import java.util.Map;
import java.util.logging.Level;

import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.EngineConstants;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;


/**
 * This is the central singleton for the ReportBirt model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * This is the central singleton for the Report model plugin.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Start and stop the report engine:
	 * <ul>
	 *   <li>create and initialize the report enging config</li>
	 *   <li>start up the report engine at plugin start time</li>
	 *   <li>install the class loader in the engine run time; so that the event handlers of this package can be loaded by birt</li>
	 *   <li>reserves the key {@link #APPCONTEXT_REPORTCONTEXTOBJECT_KEY} in birt app context for storing the context object of the current report</li>
	 *   <li>shut down the report engine at plugin stop time</li>
	 * </ul>
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Plugin INSTANCE = new Plugin();

	private static EngineConfig engineConfig;
	
	private static IReportEngine engine;
	
	public static String APPCONTEXT_REPORTCONTEXTOBJECT_KEY = "com.misc.common.moplaf.report.birt.context_object_id";

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

	public static IReportEngine getReportEngine() {
		return Plugin.engine;
	}

	static void onStartUp(){
		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onStartUp: called");
		try{
			// config
			EngineConfig config = new EngineConfig( );
			//delete the following line if using BIRT 3.7 (or later) POJO runtime
			//As of 3.7.2, BIRT now provides an OSGi and a POJO Runtime.
			//config.setEngineHome( "C:\\birt-runtime-2_6_2\\birt-runtime-2_6_2\\ReportEngine" );
			//config.setLogConfig("c:/temp", Level.FINE);
			//CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.Plugin.onStartUp: WEBAPP_CLASSPATH_KEY "+ config.getProperty(EngineConstants.WEBAPP_CLASSPATH_KEY));
			//CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.Plugin.onStartUp: PROJECT_CLASSPATH_KEY "+ config.getProperty(EngineConstants.PROJECT_CLASSPATH_KEY));
			//CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.Plugin.onStartUp: WORKSPACE_CLASSPATH_KEY "+ config.getProperty(EngineConstants.WORKSPACE_CLASSPATH_KEY));
			//CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.Plugin.onStartUp: APPCONTEXT_CLASSLOADER_KEY "+ config.getProperty(EngineConstants.APPCONTEXT_CLASSLOADER_KEY));
			//config.setProperty(EngineConstants.WEBAPP_CLASSPATH_KEY, "/home/michel/workspacedt/workspace4birt/lib/test.jar");
			Platform.startup( config );

			// engine
			//If using RE API in Eclipse/RCP application this is not needed. */
			IReportEngineFactory factory = (IReportEngineFactory) Platform
						.createFactoryObject( IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY );
			IReportEngine engine = factory.createReportEngine( config );
			engine.changeLogLevel( Level.WARNING );

			Map<String, Object> appContext = engine.getConfig().getAppContext();
			Object myclassloaderkey = ReportBirt.class.getClassLoader();
			appContext.put(EngineConstants.APPCONTEXT_CLASSLOADER_KEY, myclassloaderkey);
			// done
			CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onStartUp: report engine created");
			Plugin.engineConfig = config;
			Plugin.engine = engine;
			}
		catch( Exception ex){
			CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onStartUp: exception "+ex.getMessage());
			ex.printStackTrace();
		}
		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onStartUp: done");
	}
	
	static void onShutDown(){
		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onShutDown: called");
		try
		{
			Plugin.engine.destroy();
			Platform.shutdown();
			//Bugzilla 351052
			//RegistryProviderFactory.releaseDefault();
		}catch ( Exception e ){
			CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onShutDown: excetion "+e.getMessage());
		}		
		CommonPlugin.INSTANCE.log("com.misc.common.moplaf.report.birt.Plugin.onShutDown: done");
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
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
			Plugin.onStartUp();
		}

		@Override
		public void stop(BundleContext context) throws Exception {
			Plugin.onShutDown();
			super.stop(context);
		}
	}

}
