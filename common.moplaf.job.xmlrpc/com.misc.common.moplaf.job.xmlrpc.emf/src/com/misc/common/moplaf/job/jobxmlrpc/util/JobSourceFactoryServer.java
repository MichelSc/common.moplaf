package com.misc.common.moplaf.job.jobxmlrpc.util;

import com.misc.common.moplaf.job.jobclient.JobSource;
import com.misc.common.moplaf.job.jobclient.util.JobSourceFactory;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcFactory;

// com.misc.common.moplaf.job.jobxmlrpc.util.JobSourceFactoryServer
public class JobSourceFactoryServer implements JobSourceFactory {

	@Override
	public JobSource createJobSource() {
		return JobXmlRpcFactory.eINSTANCE.createJobEngineServer();
	}
}
