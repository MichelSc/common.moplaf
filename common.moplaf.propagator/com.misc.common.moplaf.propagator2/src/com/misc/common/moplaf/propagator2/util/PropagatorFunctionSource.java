package com.misc.common.moplaf.propagator2.util;

import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.propagator2.Plugin;
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
	
	boolean isOutboundBinding(Object feature){
		return false;
	}
	
	// manage dependencies of this source on the notifier
	public void initDependencies(){}
	public void disposeDependencies(){}
	
	// listening and collecting
	public void notifyChanged(Notification notification) {}
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){}
	
	// touch
	void touch(EObject toucher){
		Plugin.INSTANCE.logTouch(this);
		this.propagatorFunction.touch(toucher);
	}
	
}
