package com.misc.common.moplaf.propagator2.util;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EClass;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;


public class PropagatorFunctionsConstructors  implements PropagatorFunctionsConstructor {

	private LinkedList<PropagatorFunctionsConstructor> constructors = new LinkedList<PropagatorFunctionsConstructor>();

	public PropagatorFunctionsConstructors() {
		super();
	}
	
	@Override
	public PropagatorFunctionsConstructor copy() {
		PropagatorFunctionsConstructors newConstructors = new PropagatorFunctionsConstructors();
		for ( PropagatorFunctionsConstructor constructor : this.constructors){
			newConstructors.addConstructor(constructor.copy());
		}
		return newConstructors;
	}

	
	public void addConstructor(PropagatorFunctionsConstructor constructor){
		this.constructors.add(constructor);
	}
	
	public PropagatorFunctionsConstructors addConstructor(EClass propagatorFunctionType){
		PropagatorFunctionFactory constructor = new PropagatorFunctionFactory(propagatorFunctionType);
		this.addConstructor(constructor);
		return this;
	}
	
	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		for ( PropagatorFunctionsConstructor factory : this.constructors){
			factory.addPropagatorFunctions(object);
		}
	}

}
