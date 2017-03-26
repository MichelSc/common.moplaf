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
package com.misc.common.moplaf.report.birt.event;

import org.eclipse.birt.report.engine.api.script.IReportContext;
import org.eclipse.birt.report.engine.api.script.ScriptException;
import org.eclipse.birt.report.engine.api.script.eventadapter.DataSetEventAdapter;
import org.eclipse.birt.report.engine.api.script.instance.IDataSetInstance;

import com.misc.common.moplaf.report.birt.Plugin;

public class RootDataSetEventHandler extends DataSetEventAdapter {

	@Override
	public void beforeOpen(IDataSetInstance dataSet, IReportContext reportContext) throws ScriptException {
		super.beforeOpen(dataSet, reportContext);

		Object myObjectFromContext = reportContext.getAppContext().get(Plugin.APPCONTEXT_REPORTCONTEXTOBJECT_KEY);
		dataSet.setInputParameterValue("@target", myObjectFromContext);
		
	}
}
