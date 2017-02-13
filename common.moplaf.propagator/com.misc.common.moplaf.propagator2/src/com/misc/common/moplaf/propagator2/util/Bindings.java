package com.misc.common.moplaf.propagator2.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.PropagatorFunction;


/**
 *
 * A {@link Bindings} declares the Bindings of a {@link PropagatorFunction} and is
 * provided by {@link PropagatorFunction#doGetBindings()}.
 * <p>
 * A Bindings provides a collection of {@link InboundBinding}s and  collection of
 * {@link OutboundBinding}.
 * <p>
 * An inbound Bindings decides when a modication is binding by implementing the method
 * {@link InboundBinding#notifyChanged(PropagatorFunctionBindingsToBeRemoved, Notification)}, that must call {@link PropagatorFunctionBindingsToBeRemoved#touch(EObject)}
 * when there is inbound binding.
 * <p> 
 * An outbound Bindings decides when an adapter is setting an element by implementing
 * the method {@link OutboundBinding#isOutboundBinding(PropagatorFunctionBindingsToBeRemoved, Object)}, 
 * that must return true when there is outbound binding.
 * 
 * @author michel
 *
 */
public class Bindings {
	
	/**
	 * When the dependency is 'TrackToucher' - the Notifier(s) touching - the toucher(s) - 
	 * will be passed to the calculate method. When more than one toucher is involved, the
	 * calculate method is invoked for every toucher.  
	 */
	protected boolean isTrackToucher = false;
	
	private boolean touchWithToucher(PropagatorFunctionBindingsToBeRemoved adapter, Notifier toucher){
		if ( !this.isTrackToucher )  { return false; }
		if ( !(toucher instanceof EObject)){ return false; }
		adapter.touch((EObject)toucher);
		return true;
	}

	public void notifyChanged(PropagatorFunctionBindingsToBeRemoved adapter, Notification msg) {
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.notifyChanged(adapter,  msg);
		}
	}
	public void initDependencies(PropagatorFunctionBindingsToBeRemoved adapter) {
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.initDependencies(adapter);
		}
	}
	public void disposeDependencies(PropagatorFunctionBindingsToBeRemoved adapter) {
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.disposeDependencies(adapter);
		}
	}
	public void collectAntecedents(PropagatorFunctionBindingsToBeRemoved adapter, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.collectAntecedents(adapter, antecedents, doCollect);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String asString(){
		String toReturn = "";
		for ( InboundBinding inboundBinding : this.inboundBindings){
			toReturn += toReturn.length()==0
					  ? this.asStringImpl()+":"
					  : ",";
			toReturn += inboundBinding.asStringImpl();
		}
		return toReturn;
	}

	/**
	 * 
	 * @return
	 */
	public String asStringImpl(){
		return "Abstract bindings";
	}

	/*
	 * Inbound binding
	 */
	
	private LinkedList<InboundBinding> inboundBindings = new LinkedList<InboundBinding>();
	/**
	 * Base class for inbound bindings
	 */
	protected class InboundBinding {
		protected InboundBinding(){};
		/**
		 * must 1) call touch if the bound element is modified and 2) add/remove old/new bindings
		 */
		protected void notifyChanged(PropagatorFunctionBindingsToBeRemoved adapter, Notification msg) {};
		/**
		 * Return whether this inbound binding is tracking toucher
		 */
		public boolean isTrackingToucher(){
			return false;
		}
		/**
		 * 
		 * @return
		 */
		public String asStringImpl(){
			return "Abstract Inbound Binding";
		}

		/**
		 * 
		 */
		void initDependencies(PropagatorFunctionBindingsToBeRemoved adapter){}
		void disposeDependencies(PropagatorFunctionBindingsToBeRemoved adapter){}
		public void collectAntecedents(PropagatorFunctionBindingsToBeRemoved adapter, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){}

	}

	/**
	 * Add inbound binding
	 * @param binding
	 */
	public Bindings addInboundBinding(InboundBinding binding){
		this.inboundBindings.add(binding);
		return this;
	}
	
			
	/*
	 * Outbound binding
	 */
	
	/**
	 * Informs the framework that the element is bound
	 * trough some outbound binding of this PropagatorAbstractAdapter  
	 */
	public boolean isOutboundBinding(PropagatorFunctionBindingsToBeRemoved adapter, Object element){
		if ( this.outboundBindings!=null ){
			for ( OutboundBinding binding : this.outboundBindings){
				if ( binding.isOutboundBinding(adapter, element)){
					return true;
				}
			}
		}
		return false;
	}
	


	private LinkedList<OutboundBinding> outboundBindings = new LinkedList<OutboundBinding>();
	
	/**
	 * Base class for outbound bindings
	 */
	protected class OutboundBinding {
		protected OutboundBinding(){
		};
		/*
		 * Return the element of target of this binding is (out)bound to the Propator function 
		 */
		public boolean isOutboundBinding(PropagatorFunctionBindingsToBeRemoved adapter, Object element){
			return false;
		}
	}

	/**
	 * Add outbound binding
	 * @param binding
	 */
	public Bindings addOutboundBinding(OutboundBinding binding){
		this.outboundBindings.add(binding);
		return this;
	}
	
	
	/*
	 * Convenience methods for constructing bindings, and ecore implementations
	 */
	/**
	 * An implementation of Bindings based on EClass
	 */
	protected static class BindingsEClass extends Bindings{
		/*
		 * Fields
		 */
		private EClass eClass;
		/*
		 * Constructors
		 */
		public BindingsEClass(EClass eClass, boolean isTrackToucher){
			this.eClass = eClass;
			this.isTrackToucher = isTrackToucher;
		}
		/**
		 * method AsString
		 * @return
		 */
		@Override
		public String asStringImpl(){
			return this.eClass.getName();
		}

	}


	static public Bindings constructEClassBindings(EClass aclass){
		return new BindingsEClass(aclass, false);
	};
	
	static public Bindings constructEClassBindings(EClass aclass, boolean isTrackToucher){
		return new BindingsEClass(aclass, isTrackToucher);
	};
	
	/**
	 * An implementation of inbound binding based on a structural feature
	 */
	protected class InboundBindingFeature extends InboundBinding {
		protected EStructuralFeature eFeature;
		public InboundBindingFeature(EStructuralFeature feature){
			super();
			this.eFeature = feature;
		}
		/**
		 * method AsString
		 * @return
		 */
		@Override
		public String asStringImpl(){
			return this.eFeature.getName();
		}
		@Override
		protected void notifyChanged(PropagatorFunctionBindingsToBeRemoved adapter, Notification msg) {
			if ( msg.isTouch() ) { return ; }
			if ( msg.getFeature()!= this.eFeature)  { return ; }
			boolean touched = Bindings.this.touchWithToucher(adapter, adapter.getTarget());
			if ( !touched ) {
				adapter.touch(null);
			}
		}
		@Override
		public void collectAntecedents(PropagatorFunctionBindingsToBeRemoved adapter, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
			Notifier notifier = adapter.getTarget();
			for (Adapter otherAdapter : notifier.eAdapters()) {
				if (otherAdapter instanceof PropagatorFunctionBindingsToBeRemoved) {
					PropagatorFunctionBindingsToBeRemoved otherpropagator = (PropagatorFunctionBindingsToBeRemoved) otherAdapter;
					if ( otherpropagator.isOutboundBinding(this.eFeature)){
						otherpropagator.collectPropagatorFunctions(antecedents, doCollect);
					}
				}
			}
		}	
	}


	public Bindings addInboundBinding(EStructuralFeature feature){
		InboundBinding binding = new InboundBindingFeature(feature);
		this.addInboundBinding(binding);
		return this;
	}

	/**
	 * An implementation of inbound binding based on a structural feature
	 */
	protected class InboundBindingNavigationFeature extends InboundBindingFeature {
		protected Bindings eBindings;
		public InboundBindingNavigationFeature(EReference feature, Bindings bindings){
			super(feature);
			this.eBindings = bindings;
		}
		@Override
		protected void notifyChanged(PropagatorFunctionBindingsToBeRemoved adapter, Notification msg) {
			if ( msg.isTouch() ) { return ; 
			}
			if ( msg.getFeature()!= this.eFeature)  { return ; 
			}
			if ( msg.getEventType()!=Notification.ADD 
			  && msg.getEventType()!=Notification.REMOVE
			  && msg.getEventType()!=Notification.ADD_MANY		
			  && msg.getEventType()!=Notification.REMOVE_MANY		
			  && msg.getEventType()!=Notification.SET) { return; 
			}

			boolean touched = Bindings.this.touchWithToucher(adapter, adapter.getTarget());

			// at this point, some change happened in the association
			// add/remove the dependency and touch
			Object newvalue = msg.getNewValue();
			Object oldvalue = msg.getOldValue();
			assert newvalue!=oldvalue;
			if ( oldvalue instanceof EObject){
				EObject oldtarget = (EObject)oldvalue;
				touched = this.eBindings.touchWithToucher(adapter, oldtarget) || touched;
				adapter.removeDependency(this.eBindings, oldtarget);
			} else if ( oldvalue instanceof Collection<?> ){
				for ( Object element : (Collection<Object>)oldvalue){
					if ( element instanceof EObject) {
						EObject oldtarget = (EObject)element;
						touched = this.eBindings.touchWithToucher(adapter, oldtarget) || touched;
						adapter.removeDependency(this.eBindings, oldtarget);
					}
				}
				
			}
			if ( newvalue instanceof EObject){
				EObject newtarget = (EObject)newvalue;
				adapter.addDependency(this.eBindings, newtarget);
				touched = this.eBindings.touchWithToucher(adapter, newtarget) || touched;
			} else if ( newvalue instanceof Collection<?> ){
				for ( Object element : (Collection<Object>)newvalue){
					if ( element instanceof EObject) {
						EObject newtarget = (EObject)element;
						adapter.addDependency(this.eBindings, newtarget);
						touched = this.eBindings.touchWithToucher(adapter, newtarget) || touched;
					}
				}
			}
			if ( ! touched ) {
				adapter.touch(null);
			}
			return ;
		}
		/**
		 * 
		 */
		@Override
		void initDependencies(PropagatorFunctionBindingsToBeRemoved adapter){
			EObject object = (EObject) adapter.getTarget();
			Object featurevalue = object.eGet((EStructuralFeature) this.eFeature, false ); // no resolve
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					adapter.addDependency(this.eBindings, referredobject);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				adapter.addDependency(this.eBindings, referredobject);
			}
		}

		@Override
		void disposeDependencies(PropagatorFunctionBindingsToBeRemoved adapter){
			EObject object = (EObject) adapter.getTarget();
			Object featurevalue = object.eGet((EStructuralFeature) this.eFeature);
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					adapter.removeDependency(this.eBindings, referredobject);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				adapter.removeDependency(this.eBindings, referredobject);
			}
		}
		@Override
		public void collectAntecedents(PropagatorFunctionBindingsToBeRemoved adapter, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
			// this object
			super.collectAntecedents(adapter, antecedents, doCollect);
			// navigated to objects
			EObject object = (EObject) adapter.getTarget();
			Object featurevalue = object.eGet((EStructuralFeature) this.eFeature);
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorFunctionBindingsToBeRemoved dependency = (PropagatorFunctionBindingsToBeRemoved) Util.getAdapter(referredobject, this.eBindings);
					if ( dependency == null ) {
						Plugin.INSTANCE.logError("No dependency", adapter);
					} else {
						dependency.collectAntecedents(antecedents, doCollect);
					}
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorFunctionBindingsToBeRemoved dependency = (PropagatorFunctionBindingsToBeRemoved) Util.getAdapter(referredobject, this.eBindings);
				if ( dependency == null ) {
					Plugin.INSTANCE.logError("No dependency", adapter);
				} else {
					dependency.collectAntecedents(antecedents, doCollect);
				}
			}
		}
	}

	public Bindings addInboundBinding(EReference feature, Bindings bindings){
		InboundBinding binding = new InboundBindingNavigationFeature(feature, bindings);
		this.addInboundBinding(binding);
		return this;
	}

	
	/**
	 * An implementation of inbound binding based on a structural feature
	 */
	protected class OutboundBindingFeature extends OutboundBinding {
		protected EStructuralFeature eFeature;
		public OutboundBindingFeature(EStructuralFeature feature){
			super();
			this.eFeature = feature;
		}
		
		/**
		 * Return whether this inbound binding is binding the element of the target object
		 */
		@Override
		public boolean isOutboundBinding(PropagatorFunctionBindingsToBeRemoved adapter, Object element) {
			return element == this.eFeature;
		}
		
	}
	
	public Bindings addOutboundBinding(EStructuralFeature feature){
		OutboundBinding binding = new OutboundBindingFeature(feature);
		this.addOutboundBinding(binding);
		return this;
	}
}
