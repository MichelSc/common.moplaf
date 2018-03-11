package com.misc.common.moplaf.job.jobhttp.util;

import com.misc.common.moplaf.job.jobclient.JobSource;
import com.misc.common.moplaf.job.jobclient.util.JobSourceFactory;
import com.misc.common.moplaf.job.jobhttp.JobHttpFactory;

public class JobSourceFactoryServer implements JobSourceFactory {

	@Override
	public JobSource createJobSource() {
		return JobHttpFactory.eINSTANCE.createJobEngineServer();
	}
}
