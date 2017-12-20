package com.misc.common.moplaf.job.jobxmlrpc.util;

import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.util.JobEngineFactory;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcFactory;

public class JobEngineFactoryClient implements JobEngineFactory {

	@Override
	public JobEngine createJobEngine() {
		return JobXmlRpcFactory.eINSTANCE.createJobEngineClient();
	}
}
