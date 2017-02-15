package com.misc.common.moplaf.propagator2.util;

import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.propagator2.PropagatorFunction;

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
