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

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

public class PropagatorFunctionsFactory implements PropagatorFunctionsConstructor {

	private HashMap<EClass, PropagatorFunctionsConstructor> propagatorFunctionsFactories = new HashMap<EClass, PropagatorFunctionsConstructor>();

	public PropagatorFunctionsFactory() {
		super();
	}
	
	public PropagatorFunctionsFactory copy(){
		PropagatorFunctionsFactory newFactory = new PropagatorFunctionsFactory();
		for(  Entry<EClass, PropagatorFunctionsConstructor> entry : this.propagatorFunctionsFactories.entrySet()){
			newFactory.addPropagatorFunctionsFactory(entry.getKey(), entry.getValue().copy());
		}
		return newFactory;
	}

	/*
	 * Convenience methods for constructing a Factory
	 */
	static public PropagatorFunctionsFactory constructPropagatorFunctionsFactory(){
		return new PropagatorFunctionsFactory();
	};
	
	static public PropagatorFunctionsConstructors constructPropagatorFunctionsConstructors(){
		return new PropagatorFunctionsConstructors();
	};

	/** 
	 * Add a Factory associated with a given TargetType
	 * 
	 * @param targetType
	 * @param factory
	 */
	public PropagatorFunctionsFactory addPropagatorFunctionsFactory(EClass targetType, PropagatorFunctionsConstructor factory){
		this.propagatorFunctionsFactories.put(targetType, factory);
		return this;
	}
	
	public PropagatorFunctionsFactory consructPropagatorFunctionFactory(EClass targetType){
		PropagatorFunctionsFactory factory = new PropagatorFunctionsFactory();
		this.addPropagatorFunctionsFactory(targetType, factory);
		return factory;
	};
	
	public PropagatorFunctionsConstructors consructPropagatorFunctionsConstructors(EClass targetType){
		PropagatorFunctionsConstructors factory = new PropagatorFunctionsConstructors();
		this.addPropagatorFunctionsFactory(targetType, factory);
		return factory;
	};
	
	/**
	 * Create a Factory for a given TargetType
	 * @param targetType
	 * @return
	 */
	public PropagatorFunctionsConstructors addPropagatorFunctionsConstructors(EClass targetType){
		PropagatorFunctionsConstructors constructors = new PropagatorFunctionsConstructors();
		this.addPropagatorFunctionsFactory(targetType, constructors);
		return constructors;
	}

	/**
	 * Called by the framework for adding the PropagatorFunctions to the ObjectWithPropagatorFunctions
	 */
	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		EClass targetType = object.eClass();
		this.addPropagatorFunctions(targetType, object);
	}
	
	private void addPropagatorFunctions(EClass targetType, ObjectWithPropagatorFunctions object){
		// traverse the inheritance hierarchy from most specific to less specific
		PropagatorFunctionsConstructor factory = propagatorFunctionsFactories.get(targetType);
		if ( factory!=null){
			factory.addPropagatorFunctions(object);
		}
		for ( EClass superType : targetType.getESuperTypes()){
			this.addPropagatorFunctions(superType, object);
		}
	}
}
