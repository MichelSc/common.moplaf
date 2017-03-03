package com.misc.common.moplaf.propagator2.util;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;

public class PropagatorFunctionFactory implements PropagatorFunctionsConstructor {
	
	private EClass propagatorFunctionType;

	public PropagatorFunctionFactory(EClass propagatorFunctionType) {
		super();
		this.propagatorFunctionType = propagatorFunctionType;
	}

	@Override
	public PropagatorFunctionsConstructor copy() {
		PropagatorFunctionFactory newFactory = new PropagatorFunctionFactory(this.propagatorFunctionType);
		return newFactory;
	}
	
	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		EFactory factory = this.propagatorFunctionType.getEPackage().getEFactoryInstance();
		PropagatorFunction newPropagatorFunction = (PropagatorFunction) factory.create(this.propagatorFunctionType);
		object.addPropagatorFunction(newPropagatorFunction);
	}

	
}
