/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.ProgressFeedback;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobSource;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine In Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JobEngineInProcessImpl extends JobEngineImpl implements JobEngineInProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineInProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_ENGINE_IN_PROCESS;
	}

	@Override
	public EnabledFeedback getExecuteEnabledFeedback() {
		if ( this.getJobScheduled()!=null) {
			return new EnabledFeedback(false, "Job already scheduled on the engine");
		}
		return EnabledFeedback.NOFEEDBACK;
	}
	
	private class JobEngineRunContext implements RunContext{

		@Override
		public boolean onProgress(Run run, ProgressFeedback progress) {
			JobScheduled job = JobEngineInProcessImpl.this.getJobScheduled().stream()
					.filter(js -> js.getRun()==run)
					.findFirst()
					.orElse(null);
			JobSource source = job.getSource();
			boolean goOn = true;
			JobEngineInProcessImpl.this.getScheduler().setLastFeedback();
			
			if ( job.getStartTime()==null) {
				// the first onProgress is called by before start
				job.setRunning();
				if ( source!=null) {
					source.onJobRunning(job);
				}
				
			}
			if ( run.isReturned()) {
				// the run is finished
				ReturnFeedback feedback = run.getReturn();
				job.setReturn(feedback);
				// release the engine
				job.setScheduledOn(null);
				if ( source!=null) {
					source.onJobReturned(job, feedback);
				}
			} else {
				// report the progress
			}
			return goOn;
		}
	}

	/**
	 * 
	 */
	@Override
	protected void executeJobImpl(JobScheduled job) {
		Run run = job.getRun();
		boolean run_in_background = true; // no dialog to cancel
		run.runAsynch(new JobEngineRunContext(), run_in_background);
	}

} //JobEngineInProcessImpl
