package com.misc.common.moplaf.report.birt;

import org.eclipse.birt.report.engine.api.script.IReportContext;
import org.eclipse.birt.report.engine.api.script.ScriptException;
import org.eclipse.birt.report.engine.api.script.eventadapter.DataSetEventAdapter;
import org.eclipse.birt.report.engine.api.script.instance.IDataSetInstance;

import com.misc.common.moplaf.report.Plugin;

public class RootDataSetEventHandler extends DataSetEventAdapter {

	@Override
	public void beforeOpen(IDataSetInstance dataSet, IReportContext reportContext) throws ScriptException {
		super.beforeOpen(dataSet, reportContext);

		Object myObjectFromContext = reportContext.getAppContext().get(Plugin.APPCONTEXT_REPORTCONTEXTOBJECT_KEY);
		dataSet.setInputParameterValue("@target", myObjectFromContext);
		
	}
}
