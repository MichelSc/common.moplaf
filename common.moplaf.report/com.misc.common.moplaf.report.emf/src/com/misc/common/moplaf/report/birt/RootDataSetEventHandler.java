package com.misc.common.moplaf.report.birt;

import org.eclipse.birt.report.engine.api.script.IReportContext;
import org.eclipse.birt.report.engine.api.script.ScriptException;
import org.eclipse.birt.report.engine.api.script.eventadapter.DataSetEventAdapter;
import org.eclipse.birt.report.engine.api.script.instance.IDataSetInstance;

public class RootDataSetEventHandler extends DataSetEventAdapter {

	@Override
	public void beforeOpen(IDataSetInstance dataSet, IReportContext reportContext) throws ScriptException {
		// TODO Auto-generated method stub
		super.beforeOpen(dataSet, reportContext);

		Object myObjectFromContext = reportContext.getAppContext().get("michelid");
		dataSet.setInputParameterValue("@target", myObjectFromContext);
		
	}
}
