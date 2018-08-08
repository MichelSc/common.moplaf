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
package com.misc.common.moplaf.analysis.provider;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;

import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolType;


public class Util {

	public static void collectNewChildRunDescriptors2(Collection<Object> newChildDescriptors, Object object, EStructuralFeature feature, DataToolType type) {
		EList<DataTool> tools = com.misc.common.moplaf.datatools.util.Util.getNewDataTools(type);
		for ( DataTool tool : tools) {
			newChildDescriptors.add(new CommandParameter(null, feature, tool));
		}
	}  // method collectNewChildRunDescriptors2
}
