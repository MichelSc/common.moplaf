package com.misc.common.moplaf.propagator2;

import org.eclipse.emf.ecore.EObject;

public interface Refresher {
	public void refresh(PropagatorFunction propagatorFunction, EObject toucher);
}
