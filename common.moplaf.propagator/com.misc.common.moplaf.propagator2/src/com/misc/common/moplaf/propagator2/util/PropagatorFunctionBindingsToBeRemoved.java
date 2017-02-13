package com.misc.common.moplaf.propagator2.util;

import java.util.LinkedList;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.PropagatorFunction;


/**
 * The objet adapter used by the framework for a PropagatorFunction. 
 * Implements the binding with the data elements. 
 * There are two kinds of bindings: inbound and outbound binding. 
 * An inbound binding binds the PropagatorFunction to some 
 * input data element (input of the derivation) while an outbond binding 
 * binds the PropagatorFunction to some output data element (output of the derivation). 
 * <p>
 * Inbound bindings listen to changes in the target object of this adapter by implementing 
 * the method {@link InboundBinding#notifyChanged(Notification)}
 * and call {@link PropagatorFunctionBindingsToBeRemoved#touch} when some change in the bound 
 * feature occurred.
 * <p>
 * Outbound bindings implement the method {@link OutboundBinding#isOutboundBinding(Object)}, 
 * allowing the framework to query if some feature of this adapter is set (out-bound) 
 * by the PropagatorFunction.
 * <p>
 * Two standard inbound bindings are provided. A {@link InboundBindingFeature}, binding to 
 * some feature of this propagator's Notifier and an {@link InboundBindingNavigationFeature},
 * binding to some navigation feature , and propagating the binding to the referred object
 * by receiving a {@link Bindings}. These standards Inbound bindings can be added with the 
 * convenience methods {@link Bindings#addInboundBinding(org.eclipse.emf.ecore.EStructuralFeature)} and 
 * {@link Bindings#addInboundBinding(org.eclipse.emf.ecore.EReference, Bindings)} respectively.
 * <p>
 * One standard outbound binding is provided. An {@link OutboundBindingFeature}, binding to some feature of this
 * propagator's Notifier. This standards Outbound binding can be added with the convenience methods
 * {@link Bindings#addOutboundBinding(org.eclipse.emf.ecore.EStructuralFeature)}.
 * <p>
 * Registering the {@link PropagatorFunctionBindingsToBeRemoved}s is done by the method 
 * {@link PropagatorFunction#enable()}, called when listening begins, that is when the 
 * {@link PropagatorFunctionManagerAdapter} is added to the notifier. 
 * Unregistering the {@link PropagatorFunctionBindingsToBeRemoved}s is done by the method
 * {@link PropagatorFunction#disable()}, called when the adapter manager is removed from 
 * the Notifier.
 * 
 * @author michel
 *
 */
	public abstract class PropagatorFunctionBindingsToBeRemoved extends AdapterImpl implements PropagatorFunctionSource{
	
	protected Bindings bindings;
	
	// private members
	protected LinkedList<PropagatorFunctionSource> sources = new LinkedList<PropagatorFunctionSource>();

	/**
	 * interface PropagatorFunctionSource
	 * @param visitor
	 */
	@Override
	public void accept(PropagatorFunctionVisitor visitor) {
		for ( PropagatorFunctionSource source : this.sources){
			source.accept(visitor);
		}
	}
	

	// -------------------------------------
	// constructor, object management
	// -------------------------------------
	public PropagatorFunctionBindingsToBeRemoved(Bindings bindings) {
		super();
		this.bindings = bindings;
		assert bindings != null : "Bindings compulsory for a PropagatorFunctionBindings";
	}

	@Override
	public boolean isAdapterForType(Object type) {
		if ( !(type instanceof Bindings)  ) { return false;}
		if ( this.bindings != type) { return false; }
		return true;
	}
	
	public void addSource(PropagatorFunctionSource source){
		this.sources.add(source);
	}

	public void removeSource(PropagatorFunctionSource source){
		this.sources.remove(source);
	}
	
	public boolean sourcesSetEmpty(){
		return this.sources.isEmpty();
	}

	/**
	 * Informs the framework that the element is bound
	 * trough some outbound binding of this PropagatorAbstractAdapter  
	 */
	public boolean isOutboundBinding(Object element){
		return this.bindings.isOutboundBinding(this, element);
	}
	

	// -------------------------------------
	// dependency management
	// -------------------------------------

	void addDependency(Bindings bindings, Notifier target){
	
		PropagatorFunctionBindingsToBeRemoved dependency = (PropagatorFunctionBindingsToBeRemoved) Util.getAdapter(target, bindings);
		
		// create the dependency
		if ( dependency == null) {
//			dependency = new PropagatorFunctionBindings(bindings);
			target.eAdapters().add(dependency);
		}
		
		// add this adapter as source to the new one
		dependency.addSource(this);

		// activate the dependency
		if ( !((EObject)target).eIsProxy() ) {
			dependency.initDependencies();
		}
	}
		
	PropagatorFunctionBindingsToBeRemoved removeDependency(Bindings bindings, Notifier target){
		PropagatorFunctionBindingsToBeRemoved dependency = (PropagatorFunctionBindingsToBeRemoved) Util.getAdapter(target, bindings);
		if ( dependency != null){
			dependency.removeSource(this);
			if ( dependency.sourcesSetEmpty()){
				dependency.disposeDependencies();
				target.eAdapters().remove(dependency);
			}
		}
		return dependency;
	}
		
	// -------------------------------------
	// activate, deactivate
	// -------------------------------------

	public void initDependencies(){
		this.bindings.initDependencies(this);
	}
	
	public void disposeDependencies(){
		this.bindings.disposeDependencies(this);
	}
	

	/**
	 * Forward the notification to the inbound bindings, that detect if the bound derived element
	 * is changed. If it is changed, touch this Adapter. 
	 * @see com.misc.common.moplaf.propagator.AbstractAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		this.bindings.notifyChanged(this, msg);
	}
	
	class PropagatorFunctionToucher implements PropagatorFunctionVisitor{
		private EObject toucherObject;
		public PropagatorFunctionToucher(EObject toucher){
			this.toucherObject = toucher;
		}
		@Override
		public void visitPropagatorFunction(PropagatorFunction propagatorFunction) {
			propagatorFunction.touch(this.toucherObject);
		}
	}


	/**
	 * Ultimately, the inbound bindings call touch as a function of the notifications it receives
	 */
	public void touch(EObject toucher){
		// get target and Resource
		Notifier target = this.getTarget();
		
		if ( !Util.notifierIsEObjectActive(target) ){ return; }
		
		// ok we touch
		Plugin.INSTANCE.logTouch(this);
		this.accept(new PropagatorFunctionToucher((EObject)toucher));
	}
	
	class PropagatorFunctionCollector implements PropagatorFunctionVisitor{
		private EList<PropagatorFunction> collection;
		private Predicate<PropagatorFunction> doCollect;
		public PropagatorFunctionCollector(EList<PropagatorFunction> collection, Predicate<PropagatorFunction> doCollect){
			this.collection = collection;
			this.doCollect = doCollect;
		}
		@Override
		public void visitPropagatorFunction(PropagatorFunction propagatorFunction) {
			if ( this.doCollect==null || this.doCollect.test(propagatorFunction)){
				this.collection.add(propagatorFunction);
			}
		}
	}
	
	/**
	 * Retrieve all the PropagatorFunctionAdapters depending on this PropagatorAbstractAdapter.
	 * <p>
	 * Used to collect the PropagatorFunctionAdapters bound through an inbound binding to this 
	 * Adapter
	 * <p>
	 * Default implementation does nothing.
	 */
	public void collectPropagatorFunctions(EList<PropagatorFunction> propagatorFunctions, Predicate<PropagatorFunction> doCollect){
		this.accept(new PropagatorFunctionCollector(propagatorFunctions, doCollect));
	}
	
	/*
	 * Collect the antecedents of the inbound bindings of this adapter
	 * <p>
	 * Used by the framework to derive the antecedents of a given PropagatorFunctionAdapter
	 */
	public void collectAntecedents(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){
			this.bindings.collectAntecedents(this, antecedents, doCollect);
	}

}