package com.misc.common.moplaf.propagator2.util;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
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
 * and call {@link PropagatorFunctionAdapter#touch} when some change in the bound 
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
 * Registering the {@link PropagatorFunctionAdapter}s is done by the method 
 * {@link PropagatorFunction#enable()}, called when listening begins, that is when the 
 * {@link PropagatorFunctionManagerAdapter} is added to the notifier. 
 * Unregistering the {@link PropagatorFunctionAdapter}s is done by the method
 * {@link PropagatorFunction#disable()}, called when the adapter manager is removed from 
 * the Notifier.
 * 
 * @author michel
 *
 */
	public class PropagatorFunctionAdapter extends AdapterImpl {
	
	// private members
	protected LinkedList<PropagatorFunctionSource> sources = new LinkedList<PropagatorFunctionSource>();

	// -------------------------------------
	// constructor, object management
	// -------------------------------------
	public PropagatorFunctionAdapter() {
		super();
	}

	public void addSource(PropagatorFunctionSource source){
		this.sources.add(source);
		source.initDependencies();
	}

	public void removeSource(PropagatorFunctionSource source){
		source.disposeDependencies();
		this.sources.remove(source);
	}
	
	public boolean sourcesSetEmpty(){
		return this.sources.isEmpty();
	}
	
	public LinkedList<PropagatorFunctionSource> getSources(){
		return this.sources;
	}
	
	public PropagatorFunctionSource getSource(PropagatorFunction propagatorFunction, Object keyBindigs){
		for ( PropagatorFunctionSource source : this.sources){
			if ( source.getPropagatorFunction()== propagatorFunction && source.isSourceForBindings(keyBindigs)){
				return source;
			}
		}
		return null;
	}
	
	public PropagatorFunctionSource removeSource(PropagatorFunction propagatorFunction, Object keyBindigs){
		PropagatorFunctionSource source = this.getSource(propagatorFunction, keyBindigs);
		this.removeSource(source);
		return source;
	}


	/**
	 * Forward the notification to the inbound bindings, that detect if the bound derived element
	 * is changed. If it is changed, touch this Adapter. 
	 * @see com.misc.common.moplaf.propagator.AbstractAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		for ( PropagatorFunctionSource source : this.sources){
			source.notifyChanged(msg);
		}
	}
}