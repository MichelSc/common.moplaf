package com.misc.common.moplaf.propagator2.util;

import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.propagator2.PropagatorFunction;

/**
 * The base class for implementing the inbound bindings for one PropagatorFunction
 * on one EObject.
 * <p>
 * Following features are supported by a PropagatorFunctionSource 
 * <ul>
 * <li> associated with one PropagatorFunction: the one that is binding </li>
 * <li> associated with one EObject: the object bound to the PropagatorFunction </li>
 * <li> listening to changes in the EObject and forwarding touch() to the PropagatorFunction</li>
 * <li> collecting the antecedents of the PropagatorFunction</li>
 * <li> managing the dependencies </li>
 * </ul>
 */

public abstract class PropagatorFunctionSource {
	private PropagatorFunction propagatorFunction;
	private EObject target; 
	
	// constructor
	public PropagatorFunctionSource( EObject target, PropagatorFunction propagatorFunction) {
		super();
		this.propagatorFunction = propagatorFunction;
		this.target = target;
	}
	
	// accessors
	public abstract boolean isSourceForBindings(Object keyBindings);
	
	public PropagatorFunction getPropagatorFunction(){
		return this.propagatorFunction;
	}
	
	public EObject getTarget(){
		return this.target;
	}
	
	/**
	 * outbound binding: return whether the feature feature of the target of this source is set 
	 * by the PropagatorFunction associated to this source
	 * @param feature
	 * @return
	 */
	
	public boolean isOutboundBinding(Object feature){
		return false;
	}
	
	// manage dependencies of this source on the notifier
	public void initDependencies(){}
	public void disposeDependencies(){}
	
	// listening and collecting
	public void notifyChanged(Notification notification) {}
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){}
	
	// touch
	public void touch(EObject toucher){
		//Plugin.INSTANCE.logTouch(this);
		this.propagatorFunction.touch(toucher);
	}
	
}
