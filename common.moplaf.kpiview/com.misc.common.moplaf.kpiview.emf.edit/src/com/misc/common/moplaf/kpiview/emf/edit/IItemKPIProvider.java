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
package com.misc.common.moplaf.kpiview.emf.edit;

import java.util.Collection;

public interface IItemKPIProvider {
	float getKPIAmount(Object element);
	float getMinAmount(Object element);
	float getMaxAmount(Object element);
	String getKPIID(Object element);  
	String getUnit(Object element);  
	Collection<?> getKPIRanges(Object element);
}
