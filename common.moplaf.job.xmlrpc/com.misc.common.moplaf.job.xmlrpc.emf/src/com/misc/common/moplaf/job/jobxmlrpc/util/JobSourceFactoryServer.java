/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
