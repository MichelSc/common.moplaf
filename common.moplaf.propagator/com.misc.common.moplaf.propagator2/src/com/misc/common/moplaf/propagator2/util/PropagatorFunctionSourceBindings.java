package com.misc.common.moplaf.propagator2.util;

import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.propagator2.PropagatorFunction;

public class PropagatorFunctionSourceBindings implements PropagatorFunctionSource {
	/** Bindings for this PropagatorFunctionSource
	 * 
	 */
	private Bindings bindings;

	/** Propagator function on behalf this PropagationFunctionSource is listening
	 */
	private PropagatorFunction propagatorFunction;

	/**
	 * the constructor
	 * @param bindings
	 * @param from
	 */
	public PropagatorFunctionSourceBindings(PropagatorFunction from, Bindings bindings){
		this.bindings = bindings;
		this.propagatorFunction = from;
	}

	/** accessors
	 * 
	 */
	@Override
	public PropagatorFunction getPropagatorFunction() {
		return this.propagatorFunction;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void disposeDependencies() {
		// TODO Auto-generated method stub

	}


	/** listening and collecting antecedents
	 * 
	 */
	@Override
	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
		// TODO Auto-generated method stub
		
	}


	// to be removed
	@Override
	public void accept(PropagatorFunctionVisitor visitor) {
		// TODO Auto-generated method stub

	}

}
