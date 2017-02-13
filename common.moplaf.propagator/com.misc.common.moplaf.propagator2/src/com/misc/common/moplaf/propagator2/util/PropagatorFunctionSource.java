package com.misc.common.moplaf.propagator2.util;

import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.propagator2.PropagatorFunction;

/**
 * The interface to be supported for implementing the inbound bindings for one PropagatorFunction
 * on one EObject.
 * <p>
 * Following features are supported by a PropagatorFunction** 
 * <ul>
 * <li> listening to changes and calling touch() </li>
 * <li> collecting the antecedents </li>
 * <li> managing the dependencies </li>
 * </ul>
 */

public interface PropagatorFunctionSource {

	// accessors
	public boolean isSourceForBindings(Object keyBindings);
	public PropagatorFunction getPropagatorFunction();
	
	// manage dependencies
	public void initDependencies();
	public void disposeDependencies();
	
	// listening and collecting
	public void notifyChanged(Notification notification);
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect);
	
	// to be removed
	public void accept(PropagatorFunctionVisitor visitor);
}
