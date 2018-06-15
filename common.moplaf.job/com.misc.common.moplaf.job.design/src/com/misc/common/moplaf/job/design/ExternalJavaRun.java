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
package com.misc.common.moplaf.job.design;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ExternalJavaRun implements IExternalJavaAction {

	public ExternalJavaRun() {
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		CommonPlugin.INSTANCE.log("Task And docs.design: test method");
		Iterator<? extends EObject> iter = arg0.iterator();
		while (iter.hasNext()){
			EObject object = iter.next();	
			CommonPlugin.INSTANCE.log("..object "+object.eClass().getName());
		}
		Iterator<Object> paramIter = arg1.values().iterator();
		while ( paramIter.hasNext() ){
			Map.Entry<String, Object> next = (Map.Entry<String, Object>)paramIter.next();
			Object paramValue = next.getValue();
			CommonPlugin.INSTANCE.log("..param "+next.getKey()+":"+ paramValue  == null ? "null" : paramValue .getClass().getName());
		}
	}

}
