package com.misc.common.moplaf.propagator2.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;


public class PropagatorFunctionFactorySelf implements IPropagatorFunctionsFactory{

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
	public IPropagatorFunctionsConstructor copy() {
		return new PropagatorFunctionFactorySelf(this.factoryID);
	}

	public String getFactoryID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean handlePropagatorFunction(PropagatorFunction propagatorfunction) {
		return this.factoryID==propagatorfunction.getFactoryID();
	}

}
