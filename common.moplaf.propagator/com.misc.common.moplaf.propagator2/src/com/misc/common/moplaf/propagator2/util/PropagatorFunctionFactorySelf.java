package com.misc.common.moplaf.propagator2.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;


public class PropagatorFunctionFactorySelf implements PropagatorFunctionsConstructor {

	private String factoryID;

	public PropagatorFunctionFactorySelf(String factoryID) {
		super();
		this.factoryID = factoryID;
	}

	@Override
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		object.addPropagatorFunctions(this.factoryID);
		
	}

	@Override
	public PropagatorFunctionsConstructor copy() {
		return new PropagatorFunctionFactorySelf(this.factoryID);
	}

	@Override
	public String getFactoryID() {
		// TODO Auto-generated method stub
		return null;
	}

}
