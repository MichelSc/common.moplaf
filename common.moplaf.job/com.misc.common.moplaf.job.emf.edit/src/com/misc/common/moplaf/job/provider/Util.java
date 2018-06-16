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
package com.misc.common.moplaf.job.provider;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.job.Run;


public class Util {

	public static void collectNewChildRunDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature) {
		EList<Run> runs = com.misc.common.moplaf.job.util.Util.getNewRuns();
		for ( Run run : runs) {
			newChildDescriptors.add(new CommandParameter(null, feature, run));
		}
	}  // method collectNewChildRunDescriptors2
}
