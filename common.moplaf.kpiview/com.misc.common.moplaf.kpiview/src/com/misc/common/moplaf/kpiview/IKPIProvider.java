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
package com.misc.common.moplaf.kpiview;

public interface IKPIProvider {
	// collection of KPI's
	//  e.g. a Solution
	//  e.g. a Scenario
	boolean hasKPIs(Object element);
	Object[] getKPIs(Object element);

	// identifies a KPI
	//   e.g. "projects.someclient.someapp.transport.efficiency"
	//   e.g. "projects.someclient.someapp.transport.cost"
	// allow to compare the same KPI of different objects
	String getKPIID(Object element);  

	// KPIValue properties, supported by a KPI
	float getAmount(Object element);
	float getMinAmount(Object element);
	float getMaxAmount(Object element);
	String getUnit(Object element);  

	// collection of KPIRanges
	//  e.g. CriticallyHigh 
	//  e.g. WarninglyHigh 
	//  e.g. Full Range 
	// supported by a KPI
	Object[] getKPIRanges(Object element);

	// KPIRange properties, supported by a KPIRange
	float getLowAmount(Object element);
	float getHighAmount(Object element);
}
