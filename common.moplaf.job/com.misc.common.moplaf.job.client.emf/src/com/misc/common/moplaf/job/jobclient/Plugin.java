/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;


/**
 * This is the central singleton for the Jobclient model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Plugin extends EMFPlugin {
	public static final String JOB_FAMILY_JOBSCHEDULER_REFRESH = "com.misc.common.moplaf.job.client.jobfamily.jobscheduler.refresh"; 
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
		public void stop(BundleContext context) throws Exception {
			com.misc.common.moplaf.job.Plugin.INSTANCE.logInfo("Plugin com.misc.common.moplaf.job.client stopping jobs");
			IJobManager jobMan = Job.getJobManager();
			jobMan.cancel(JOB_FAMILY_JOBSCHEDULER_REFRESH);
			jobMan.join(JOB_FAMILY_JOBSCHEDULER_REFRESH, null);
			com.misc.common.moplaf.job.Plugin.INSTANCE.logInfo("Plugin com.misc.common.moplaf.job.client jobs stopped");
		    super.stop(context);
		}
		
		
	}

}
