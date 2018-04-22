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
*
* A {@link PropagatorFunctionSourceBindings} implements a {@link PropagatorFunctionSource} by
* delegating all its functionality to an instance of a {@link Bindings}.
* <p>
* A {@link Bindings} instance is associated to a specialization of a 
* {@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings}. It is 
* provided by the latter thanks to the method 
* {@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings#doGetBindings}, to 
* be implemented by the concrete class.
* <p> 
* The Bindings allows to declare all the model elements the PropagatorFunctionBindings is depending on. 
* This is typically static information, as it does not depends on the particular instance at hand. 
* <p> 
* The Bindings implements all the functionality needed by the PropagatorFunctionSource: logic for
* touching, logic for collections the antecedents, managing the dependencies. It is not designed to 
* be derived.
*/
public class PropagatorFunctionSourceBindings extends PropagatorFunctionSource {
	/** Bindings for this PropagatorFunctionSource
	 * 
	 */
	private Bindings bindings;

	/**
	 * the constructor
	 * @param bindings
	 * @param from
	 */
	public PropagatorFunctionSourceBindings(EObject target, PropagatorFunction from, Bindings bindings){
		super(target, from);
		this.bindings = bindings;
	}

	@Override
	public boolean isSourceForBindings(Object keyBindings) {
		return this.bindings==keyBindings;
	}
	
	public Bindings getBindings() {
		return this.bindings;
	}

	/** manage dependencies
	 * 
	 */
	@Override
	public void initDependencies() {
		this.bindings.initDependencies(this);
	}

	@Override
	public void disposeDependencies() {
		this.bindings.disposeDependencies(this);
	}

	/** listening and collecting antecedents
	 * 
	 */
	@Override
	public void notifyChanged(Notification notification) {
		this.bindings.notifyChanged(this, notification);
	}

	@Override
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
		this.bindings.collectAntecedents(this,  antecedents,  doCollect);
	}

	@Override
	public boolean isOutboundBinding(Object feature) {
		return this.bindings.isOutboundBinding(this, feature);
	}
}
