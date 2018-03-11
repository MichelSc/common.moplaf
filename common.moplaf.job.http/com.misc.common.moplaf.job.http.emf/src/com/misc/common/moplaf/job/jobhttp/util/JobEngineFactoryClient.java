package com.misc.common.moplaf.job.jobhttp.util;

import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.util.JobEngineFactory;
import com.misc.common.moplaf.job.jobhttp.JobHttpFactory;

public class JobEngineFactoryClient implements JobEngineFactory {

	@Override
	public JobEngine createJobEngine() {
		return JobHttpFactory.eINSTANCE.createJobEngineClient();
	}
}
