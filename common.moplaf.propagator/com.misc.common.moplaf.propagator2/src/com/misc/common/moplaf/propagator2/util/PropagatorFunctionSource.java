/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
 * Following features must be supported by a PropagatorFunctionSource 
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
	 * Outbound binding: return whether the feature feature of the target of this source is set 
	 * by the PropagatorFunction associated to this source
	 * <p>
	 * May be used by {@link  #collectAntecedents(EList, Predicate)}
	 * @param feature
	 * @return
	 */
	public boolean isOutboundBinding(Object feature){
		return false;
	}
	
	/**
	 * The method initializes the dependencies this PropagatorFunctionSource.
	 * <p>
	 * This will happen when the source is added to the adapter by
	 * {@link PropagatorFunctionAdapter#addSource(PropagatorFunctionSource)}
	 * <p>
	 * Sources are either primary sources or dependent sources. The former are created 
	 * by {@link PropagatorFunction#enable()}, while the latter are created when some
	 * relations is set, so in the {@link #touch(EObject)}
	 */
	public void initDependencies(){}

	/**
	 * The method disposes the dependencies this PropagatorFunctionSource.
	 * <p>
	 */
	public void disposeDependencies(){}
	
	/** Listens to changes occurring to the target of this PropagatorFunction Source.
	 * <p> 
	 * Decides if the change implies a refresh of the PropagatorFunction and call
	 * {@link #touch(EObject)} when it is the case, passing optionnally an object
	 * responsible of the change: the toucher
	 * @param notification
	 */
	public void notifyChanged(Notification notification) {}
	
	/** Collects the antecedents of the PropagatorFunction.
	 * 
	 * @param antecedents
	 * @param doCollect
	 */
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){}
	
	/** Convenience method: forward the touch event to the PropagatorFunction.
	 * 
	 * @param toucher
	 */
	public void touch(EObject toucher){
		//Plugin.INSTANCE.logTouch(this);
		this.propagatorFunction.touch(toucher);
	}
}
