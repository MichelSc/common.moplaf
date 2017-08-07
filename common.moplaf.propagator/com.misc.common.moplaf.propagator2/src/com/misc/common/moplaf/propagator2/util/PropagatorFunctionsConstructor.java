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
package com.misc.common.moplaf.propagator2.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * A PropagatorFunctionsConstructor will initialize an {@link ObjectWithPropagatorFunctions} 
 * with its PropagatoryFunctions
 * <p>
 * The method {@link #addPropagatorFunctions(ObjectWithPropagatorFunctions)} is called by the 
 * {@link PropagatorFunctionManagerAdapter} when the PropagatorFunctions must be added to the object.
 * The method is responsible for creating the PropagatorFunctions for this object.
 * <p> The factory ID is used to recognize which PropagatorFunction is managed by which
 * PropagatorFunctionManagerAdapter. The PropagatorFunctionsConstructor may only create PropagatorFunctions
 * of this factory ID.
 * <p>  
 * @author michel
 *
 */
public interface PropagatorFunctionsConstructor {
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object);
	public PropagatorFunctionsConstructor copy();
	public String getFactoryID();
}
