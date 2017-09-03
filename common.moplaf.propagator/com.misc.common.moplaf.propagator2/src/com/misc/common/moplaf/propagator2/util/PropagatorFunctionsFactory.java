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
import org.eclipse.emf.ecore.EReference;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;

/**
 * A PropagatorFunctionsFactory provides a standard implementation of {@link IPropagatorFunctionsConstructor}, 
 * that can be consumed by a {@link PropagatorFunctionManagerAdapter}, once set up, possibly statically.
 * <p>
 * The PropagatorFunctionsFactory is set up by registering {@link IPropagatorFunctionsConstructor} for TargetTypes.
 * <p> 
 * The method {@link #constructPropagatorFunctionsConstructors(EClass)} is available for registering 
 * a particular kind of PropagatorFunctionsConstructor, a {@link PropagatorFunctionsConstructors}, which is a simple list of 
 * {@link IPropagatorFunctionsConstructor}, with convenience methods for adding {@link PropagatorFunctionFactory}s.
 * <p>
 * The method {@link #addPropagatorFunctions(ObjectWithPropagatorFunctions)}, specified by {@link IPropagatorFunctionsConstructor} 
 * will look up the factories registered for the type of the ObjectWithPropagatorFunctions and for all
 * its super types.
 * <p> 
 * 
 * @author michel
 *
 */
public class PropagatorFunctionsFactory implements IPropagatorFunctionsFactory {

	private HashMap<EClass, PropagatorFunctionsConstructors> factories_type_indexed = new HashMap<EClass, PropagatorFunctionsConstructors>();
	private HashMap<EReference, PropagatorFunctionsConstructors> factories_owning_feature_indexed = new HashMap<EReference, PropagatorFunctionsConstructors>();
	private String factoryID;

	public String getFactoryID() {
		return this.factoryID;
	}

	public PropagatorFunctionsFactory(String factoryID) {
		this.factoryID = factoryID;
	}

	public PropagatorFunctionsFactory() {
		this.factoryID = PropagatorFunction.factoryID;
	}

	/*
	 * Convenience methods for constructing a Factory
	 */
	static public PropagatorFunctionsFactory constructPropagatorFunctionsFactory(String factoryID){
		return new PropagatorFunctionsFactory(factoryID);
	};
	

	public PropagatorFunctionsFactory copy(){
		PropagatorFunctionsFactory newFactory = new PropagatorFunctionsFactory(this.factoryID);
		for(  Entry<EClass, PropagatorFunctionsConstructors> entry : this.factories_type_indexed.entrySet()){
			newFactory.addPropagatorFunctionsConstructors(entry.getKey(), entry.getValue().copy());
		}
		for(  Entry<EReference, PropagatorFunctionsConstructors> entry : this.factories_owning_feature_indexed.entrySet()){
			newFactory.addPropagatorFunctionsConstructors(entry.getKey(), entry.getValue().copy());
		}
		return newFactory;
	}

	/**
	 * Construct and register a PropagatorFunctionsConstructors
	 * @param targetType
	 * @return
	 */
	public PropagatorFunctionsConstructors constructPropagatorFunctionsConstructors(EClass targetType){
		PropagatorFunctionsConstructors factory = this.factories_type_indexed.get(targetType);
		if ( factory == null ) {
			factory = new PropagatorFunctionsConstructors();
			this.addPropagatorFunctionsConstructors(targetType, factory);	
		}
		
		return factory;
	};
	
	/**
	 * Construct and register a PropagatorFunctionsConstructors2
	 * @param targetType
	 * @return
	 */
	public PropagatorFunctionsConstructors constructPropagatorFunctionsConstructors(EReference owningFeature){
		PropagatorFunctionsConstructors factory = this.factories_owning_feature_indexed.get(owningFeature);
		if ( factory==null) {
			factory = new PropagatorFunctionsConstructors();
			this.addPropagatorFunctionsConstructors(owningFeature, factory);
		}
		return factory;
	};
	
	/** 
	 * Register a Factory associated for a given TargetType
	 * 
	 * @param targetType
	 * @param factory
	 */
	private PropagatorFunctionsFactory addPropagatorFunctionsConstructors(EClass targetType, PropagatorFunctionsConstructors factory){
		this.factories_type_indexed.put(targetType, factory);
		return this;
	}
	

	/** 
	 * Register a Factory associated for a given owning feature
	 * 
	 * @param targetType
	 * @param factory
	 */
	private PropagatorFunctionsFactory addPropagatorFunctionsConstructors(EReference owningFeature, PropagatorFunctionsConstructors factory){
		this.factories_owning_feature_indexed.put(owningFeature, factory);
		return this;
	}
	

	/**
	 * Called by the framework for adding the PropagatorFunctions to the ObjectWithPropagatorFunctions
	 * <p>
	 * Specified by {@link IPropagatorFunctionsConstructor}
	 */
	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		EClass targetType = object.eClass();
		this.addPropagatorFunctions(targetType, object);
		EReference owningFeature = object.eContainmentFeature();
		this.addPropagatorFunctions(owningFeature, object);
	}
	
	private void addPropagatorFunctions(EClass targetType, ObjectWithPropagatorFunctions object){
		// traverse the inheritance hierarchy from most specific to less specific
		IPropagatorFunctionsConstructor factory = factories_type_indexed.get(targetType);
		if ( factory!=null){
			factory.addPropagatorFunctions(object);
		}
		for ( EClass superType : targetType.getESuperTypes()){
			this.addPropagatorFunctions(superType, object);
		}
	}
	
	private void addPropagatorFunctions(EReference owningFeature, ObjectWithPropagatorFunctions object){
		IPropagatorFunctionsConstructor factory = factories_owning_feature_indexed.get(owningFeature);
		if ( factory!=null){
			factory.addPropagatorFunctions(object);
		}
	}

	@Override
	public boolean handlePropagatorFunction(PropagatorFunction propagatorfunction) {
		return this.factoryID==propagatorfunction.getFactoryID();
	}
}
