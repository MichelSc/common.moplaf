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
package com.misc.common.moplaf.kpiview;

/**
 * The interface IKPIProvider specifies the interface to be supported
 * for providing a KPI's, thus quality indicators.
 * <p>
 * This interface can then be consumed by a graphical component like Gauges
 * to display these indicators
 * <p>
 * Other information to be used by the consumer will be provided by standard
 * jFace interfaces, namely
 * <ul>
 * <li> {@link org.eclipse.jface.viewers.ITreeContentProvider}, providing the content to be displayed; </li>
 * <li> {@link org.eclipse.jface.viewers.ILabelProvider}, providing labels for the elements of the content</li>
 * <li> {@link org.eclipse.jface.viewers.IColorProvider}, providing foreground and background colors for the elements of the content</li>
 * </ul>
 * 
 * <p>
 * Some of the element in the content may support
 * KPI's, and will be recognized by the method {@link #hasKPIs(Object element)}. 
 * In this case, the method {@link #getKPIs(Object element)} can be used to retrieve the kpi's associated 
 * with the element. The methods {@link #getAmount(Object element, Object kpi)},  
 *  {@link #getMinAmount(Object element, Object kpi)}
 *  and {@link #getMaxAmount(Object element, Object kpi)}
 * can then be used to retrieve 
 * the Amount:float, the MinAmount:float and the MaxAmount:float of any kpi associated with the element. 
 * <p>
 * A KPI may provide ranges, so a pair (LowAmount, HighAmount) with the method {@link #getKPIRanges(Object, Object)}. 
 * A name and/or a color may be associated to the range, next to the low and high amount.
 * 
 * @author michel
 *
 */

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
	String getKPIID(Object element, Object kpi);  

	// KPIValue properties, supported by a KPI
	float getAmount(Object element, Object kpi);
	float getMinAmount(Object element, Object kpi);
	float getMaxAmount(Object element, Object kpi);
	String getUnit(Object element, Object kpi);  

	// collection of KPIRanges
	//  e.g. CriticallyHigh 
	//  e.g. WarninglyHigh 
	//  e.g. Full Range 
	// supported by a KPI
	Object[] getKPIRanges(Object element, Object kpi);

	// KPIRange properties, supported by a KPIRange
	float getLowAmount(Object element, Object kpi, Object range);
	float getHighAmount(Object element, Object kpi, Object range);
}
