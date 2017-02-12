package com.misc.common.moplaf.propagator2.util;

import org.eclipse.emf.common.notify.Notification;

public class PropagatorFunctionSourceBindings implements PropagatorFunctionSource {
	private Bindings bindings;
	private PropagatorFunctionSource source;
	
	public PropagatorFunctionSourceBindings(Bindings bindings, PropagatorFunctionSource from){
		this.bindings = bindings;
		this.source = source;
	}

	@Override
	public void accept(PropagatorFunctionVisitor visitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initDependencies() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disposeDependencies() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isSourceFor(Object key) {
		// TODO Auto-generated method stub

	}

}
