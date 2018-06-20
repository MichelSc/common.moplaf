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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;

public class ExternalJavaRun implements IExternalJavaAction {

	public ExternalJavaRun() {
	}
	
	private EList<Run> getRuns(Collection<? extends EObject> objects){
		
		BasicEList<Run> runs = new BasicEList<Run>();
		for ( EObject object : objects) {
			if ( object instanceof Run ) {
				Run run = (Run) object;
				if ( run.getRunFeedback().isEnabled()) {
					runs.add(run);
				}
			}
		}
		return runs;
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		EList<Run> runs = this.getRuns(arg0);
		return runs.size()>0;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		EList<Run> runs = this.getRuns(arg0);
		Plugin.INSTANCE.logInfo(String.format("ExternalJavaRun.execute: called %d/%d", runs.size(), arg0.size()));
		for ( Run run : runs) {
			ReturnFeedback feedback = run.run();
			Plugin.INSTANCE.logInfo(String.format("..run executed success%b feedback=%s", feedback.isSuccess(), feedback.getFeedback()));
		}
	}

}
