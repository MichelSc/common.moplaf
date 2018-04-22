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
package com.misc.common.moplaf.propagator2.util;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;


/**
 * A PropagatorFunctionConstructors is a list of {@link IPropagatorFunctionsConstructor} that implements 
 * {@link IPropagatorFunctionsConstructor}
 */

public class PropagatorFunctionsConstructors  implements IPropagatorFunctionsConstructor {

	private LinkedList<IPropagatorFunctionsConstructor> constructors = new LinkedList<IPropagatorFunctionsConstructor>();

	public PropagatorFunctionsConstructors() {
		super();
	}
	
	@Override
	public PropagatorFunctionsConstructors copy() {
		PropagatorFunctionsConstructors newConstructors = new PropagatorFunctionsConstructors();
		for ( IPropagatorFunctionsConstructor constructor : this.constructors){
			newConstructors.addConstructor(constructor.copy());
		}
		return newConstructors;
	}

	
	public void addConstructor(IPropagatorFunctionsConstructor constructor){
		this.constructors.add(constructor);
	}
	
	/**
	 * Convenience method to add a {@link PropagatorFunctionFactory}.
	 * @param propagatorFunctionType
	 * @return
	 */
	public PropagatorFunctionsConstructors addConstructor(EClass propagatorFunctionType){
		PropagatorFunctionFactory constructor = new PropagatorFunctionFactory(propagatorFunctionType);
		this.addConstructor(constructor);
		return this;
	}
	
	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		for ( IPropagatorFunctionsConstructor factory : this.constructors){
			factory.addPropagatorFunctions(object);
		}
	}

}
