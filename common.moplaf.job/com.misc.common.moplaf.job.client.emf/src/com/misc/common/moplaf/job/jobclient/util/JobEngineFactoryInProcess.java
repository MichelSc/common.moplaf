package com.misc.common.moplaf.job.jobclient.util;

import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobEngine;

public class JobEngineFactoryInProcess implements JobEngineFactory {

	@Override
	public JobEngine createJobEngine() {
		return JobClientFactory.eINSTANCE.createJobEngineInProcess();
	}
}
