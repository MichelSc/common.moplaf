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
