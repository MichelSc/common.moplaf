package com.misc.common.moplaf.propagator2.util;

import org.eclipse.emf.common.notify.Notification;

public interface PropagatorFunctionSource {
	
	public void accept(PropagatorFunctionVisitor visitor);
	public void notifyChanged(Notification notification);
	public void initDependencies();
	public void disposeDependencies();
	public void isSourceFor(Object key);

}
