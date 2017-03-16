package com.misc.common.moplaf.macroplanner.design;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ExternalJavaTest implements IExternalJavaAction {

	public ExternalJavaTest() {
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		CommonPlugin.INSTANCE.log("MacroPlanner.design: test"+ arg0 == null ? "null" : arg0.getClass().getName());
		Iterator<Object> paramIter = arg1.values().iterator();
		while ( paramIter.hasNext() ){
			Map.Entry<String, Object> next = (Map.Entry<String, Object>)paramIter.next();
			Object paramValue = next.getValue();
			CommonPlugin.INSTANCE.log("..param "+next.getKey()+":"+ paramValue  == null ? "null" : paramValue .getClass().getName());
		}
	}

}
