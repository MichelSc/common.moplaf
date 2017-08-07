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

import java.util.LinkedList;

import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;


public class PropagatorFunctionsConstructors  implements PropagatorFunctionsConstructor {

	private LinkedList<PropagatorFunctionsConstructor> constructors = new LinkedList<PropagatorFunctionsConstructor>();
	private String factoryID = null;

	public PropagatorFunctionsConstructors(String factoryID) {
		super();
		this.factoryID = factoryID;
	}
	
	@Override
	public PropagatorFunctionsConstructor copy() {
		PropagatorFunctionsConstructors newConstructors = new PropagatorFunctionsConstructors(this.factoryID);
		for ( PropagatorFunctionsConstructor constructor : this.constructors){
			newConstructors.addConstructor(constructor.copy());
		}
		return newConstructors;
	}

	
	public void addConstructor(PropagatorFunctionsConstructor constructor){
		this.constructors.add(constructor);
	}
	
	public PropagatorFunctionsConstructors addConstructor(EClass propagatorFunctionType){
		PropagatorFunctionFactory constructor = new PropagatorFunctionFactory(propagatorFunctionType, this.factoryID);
		this.addConstructor(constructor);
		return this;
	}
	
	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		for ( PropagatorFunctionsConstructor factory : this.constructors){
			factory.addPropagatorFunctions(object);
		}
	}

	@Override
	public String getFactoryID() {
		return this.factoryID;
	}

}
