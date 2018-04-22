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

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.PropagatorFunction;


/**
 *
 * A {@link Bindings} declares the Bindings of a special kind of {@link PropagatorFunction}, the 
 * {@link PropagatorFunctionBindings} and is
 * provided by {@link PropagatorFunctionBindings#doGetBindings()}.
 * <p>
 * A Bindings provides a collection of {@link InboundBinding}s and  collection of
 * {@link OutboundBinding}.
 * <p>
 * An inbound Bindings decides when a modication is binding by implementing the method
 * {@link InboundBinding#notifyChanged(PropagatorFunctionSource, Notification)}, that must call {@link PropagatorFunctionSource#touch(EObject)}
 * when there is inbound binding.
 * <p> 
 * An outbound Bindings decides when an adapter is setting an element by implementing
 * the method {@link OutboundBinding#isOutboundBinding(PropagatorFunctionSource, Object)}, 
 * that must return true when there is outbound binding.
 * 
 * @author michel
 *
 */
public class Bindings  {
	
	/**
	 * When the dependency is 'TrackToucher' - the Notifier(s) touching - the toucher(s) - 
	 * will be passed to the calculate method. When more than one toucher is involved, the
	 * calculate method is invoked for every toucher.  
	 */
	protected boolean isTrackToucher = false;
	
	public Bindings(boolean isTrackToucher){
		this.isTrackToucher = isTrackToucher;
	}
	/**
	 * Perfom a deep copy.
	 * @return
	 */
	public Bindings copy(){
		Bindings newBindings = new Bindings(this.isTrackToucher);
		for ( InboundBinding inboundBinding : this.inboundBindings){
			newBindings.inboundBindings.add(inboundBinding.copy());
		}
		for ( OutboundBinding outboundBinding : this.outboundBindings){
			newBindings.outboundBindings.add(outboundBinding.copy());
		}
		return newBindings;
	}

//	private EClass getTargettedClass_prvt(EClass currentType, EClass otherType){
//		EClass targettedClass = null;
//		if ( currentType == null || currentType.isSuperTypeOf(otherType)){
//			targettedClass = otherType;
//		} else if ( otherType.isSuperTypeOf(currentType)){
//			targettedClass = currentType;
//		} else {
//			throw new ClassCastException("Non comparable types "+otherType.getName()+" and "+currentType.getName()+ " are targetted by the same propagator Bindings");
//		}
//		return targettedClass;
//	}
//	
//	public EClass getTargettedClass(){
//		EClass targettedClass = null;
//		for ( InboundBinding inboundBinding : this.inboundBindings){
//			targettedClass = this.getTargettedClass_prvt(targettedClass, inboundBinding.getTargettedClass());
//		}
//		for ( OutboundBinding outboundBinding : this.outboundBindings){
//			targettedClass = this.getTargettedClass_prvt(targettedClass, outboundBinding.getTargettedClass());
//		}
//		return targettedClass;
//	}
	
	private void touch(PropagatorFunctionSource source, EObject toucher){
		if ( !this.isTrackToucher ) {
			toucher = null;
		}
		source.touch(toucher );
	}

	public void notifyChanged(PropagatorFunctionSource adapter, Notification msg) {
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.notifyChanged(adapter,  msg);
		}
	}
	public void initDependencies(PropagatorFunctionSource source) {
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.initDependencies(source);
		}
	}
	public void disposeDependencies(PropagatorFunctionSource source) {
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.disposeDependencies(source);
		}
	}
	public void collectAntecedents(PropagatorFunctionSource source, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.collectAntecedents(source, antecedents, doCollect);
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
					  ? ""
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
	protected abstract class InboundBinding {
		protected InboundBinding(){};
		/**
		 * must 1) call touch if the bound element is modified and 2) add/remove old/new bindings
		 */
		public abstract InboundBinding copy();
		
		protected void notifyChanged(PropagatorFunctionSource adapter, Notification msg) {};
		/**
		 * Return whether this inbound binding is tracking toucher
		 */
		public boolean isTrackingToucher(){
			return false;
		}
		
		public EClass getTargettedClass(){ return null; }
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
		void initDependencies(PropagatorFunctionSource source){}
		void disposeDependencies(PropagatorFunctionSource source){}
		public void collectAntecedents(PropagatorFunctionSource source, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect){}

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
	public boolean isOutboundBinding(PropagatorFunctionSource source, Object element){
		if ( this.outboundBindings!=null ){
			for ( OutboundBinding binding : this.outboundBindings){
				if ( binding.isOutboundBinding(source, element)){
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
	protected abstract class OutboundBinding {
		protected OutboundBinding(){};
		public abstract OutboundBinding copy();
		public EClass getTargettedClass(){ return null; }
		/*
		 * Return the element of target of this binding is (out)bound to the Propator function 
		 */
		public boolean isOutboundBinding(PropagatorFunctionSource adapter, Object element){
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
	static public Bindings constructBindings(){
		return new Bindings(false);
	};
	
	static public Bindings constructBindings(boolean isTrackToucher){
		return new Bindings(isTrackToucher);
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
		@Override
		public InboundBinding copy() {
			return new InboundBindingFeature(this.eFeature);
		}
		
		@Override
		public EClass getTargettedClass() {
			return this.eFeature.getEContainingClass();
		}
		/**
		 * method AsString
		 * @return
		 */
		@Override
		public String asStringImpl(){
			return this.getTargettedClass().getName()+":"+this.eFeature.getName();
		}
		@Override
		protected void notifyChanged(PropagatorFunctionSource source, Notification msg) {
			if ( msg.isTouch() ) { return ; }
			if ( msg.getFeature()!= this.eFeature)  { return ; }
			Bindings.this.touch(source, source.getTarget());
		}
		@Override
		public void collectAntecedents(PropagatorFunctionSource source, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
			EObject target = source.getTarget();
			PropagatorFunctionAdapter adapter = Util.getPropagatorFunctionAdapter(target);
			for ( PropagatorFunctionSource otherSource : adapter.getSources()){
				PropagatorFunction otherPropagatorFunction = otherSource.getPropagatorFunction();
				if ( otherSource.isOutboundBinding(this.eFeature) ){
					if ( doCollect==null || doCollect.test(otherPropagatorFunction)){
						antecedents.add(otherPropagatorFunction);
					}
				}
			}
		}
	}; // class InboundBindingFeature

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
		public InboundBinding copy() {
			return new InboundBindingNavigationFeature((EReference)this.eFeature, this.eBindings.copy());
		}
		
		@Override
		protected void notifyChanged(PropagatorFunctionSource source, Notification msg) {
			PropagatorFunction propagatorFunction = source.getPropagatorFunction();
					
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

			Bindings.this.touch(source, source.getTarget());

			// at this point, some change happened in the association
			// add/remove the dependency and touch
			Object newvalue = msg.getNewValue();
			Object oldvalue = msg.getOldValue();
			assert newvalue!=oldvalue;
			PropagatorFunctionAdapter adapter;
			if ( oldvalue instanceof EObject){
				EObject oldtarget = (EObject)oldvalue;
				adapter = Util.getPropagatorFunctionAdapter(oldtarget);
				PropagatorFunctionSource oldsource = adapter.removeSource(propagatorFunction, this.eBindings);
				this.eBindings.touch(oldsource, oldtarget);
			} else if ( oldvalue instanceof Collection<?> ){
				for ( Object element : (Collection<Object>)oldvalue){
					if ( element instanceof EObject) {
						EObject oldtarget = (EObject)element;
						adapter = Util.getPropagatorFunctionAdapter(oldtarget);
						PropagatorFunctionSource oldsource = adapter.removeSource(propagatorFunction, this.eBindings);
						this.eBindings.touch(oldsource, oldtarget);
					}
				}
			}
			if ( newvalue instanceof EObject){
				EObject newtarget = (EObject)newvalue;
				adapter = Util.getPropagatorFunctionAdapter(newtarget);
				PropagatorFunctionSourceBindings newsource = new PropagatorFunctionSourceBindings(newtarget, propagatorFunction, this.eBindings);
				adapter.addSource(newsource);
				this.eBindings.touch(newsource, newtarget);
			} else if ( newvalue instanceof Collection<?> ){
				for ( Object element : (Collection<Object>)newvalue){
					if ( element instanceof EObject) {
						EObject newtarget = (EObject)element;
						adapter = Util.getPropagatorFunctionAdapter(newtarget);
						PropagatorFunctionSourceBindings newsource = new PropagatorFunctionSourceBindings(newtarget, propagatorFunction, this.eBindings);
						adapter.addSource(newsource);
						this.eBindings.touch(newsource, newtarget);
					}
				}
			}
			return ;
		}
		/**
		 * 
		 */
		@Override
		void initDependencies(PropagatorFunctionSource source){
			PropagatorFunction propagatorFunction = source.getPropagatorFunction();
			EObject target = source.getTarget();
			Object featurevalue = target.eGet(this.eFeature, false ); // no resolve
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorFunctionAdapter otheradapter = Util.getPropagatorFunctionAdapter(referredobject);
					PropagatorFunctionSourceBindings newsource = new PropagatorFunctionSourceBindings(referredobject, propagatorFunction, this.eBindings);
					otheradapter.addSource(newsource);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject) featurevalue;
				PropagatorFunctionAdapter otheradapter = Util.getPropagatorFunctionAdapter(referredobject);
				PropagatorFunctionSourceBindings newsource = new PropagatorFunctionSourceBindings(referredobject, propagatorFunction, this.eBindings);
				otheradapter.addSource(newsource);
			}
		}

		@Override
		void disposeDependencies(PropagatorFunctionSource source){
			PropagatorFunction propagatorFunction = source.getPropagatorFunction();
			EObject target = source.getTarget();
			Object featurevalue = target.eGet(this.eFeature);
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorFunctionAdapter otheradapter = Util.getPropagatorFunctionAdapter(referredobject);
					otheradapter.removeSource(propagatorFunction, this.eBindings);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorFunctionAdapter otheradapter = Util.getPropagatorFunctionAdapter(referredobject);
				otheradapter.removeSource(propagatorFunction, this.eBindings);
			}
		}
		
		@Override
		public void collectAntecedents(PropagatorFunctionSource source, EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
			PropagatorFunction propagatorFunction = source.getPropagatorFunction();
			// this object
			super.collectAntecedents(source, antecedents, doCollect);
			// navigated to objects
			EObject target = source.getTarget();
			Object featurevalue = target.eGet(this.eFeature);
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorFunctionAdapter adapter = Util.getPropagatorFunctionAdapter(referredobject);
					PropagatorFunctionSource dependency = adapter.getSource(propagatorFunction, this.eBindings);
					if ( dependency == null ) {
						Plugin.INSTANCE.logError("No dependency", propagatorFunction);
					} else {
						dependency.collectAntecedents(antecedents, doCollect);
					}
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorFunctionAdapter adapter = Util.getPropagatorFunctionAdapter(referredobject);
				PropagatorFunctionSource dependency = adapter.getSource(propagatorFunction, this.eBindings);
				if ( dependency == null ) {
					Plugin.INSTANCE.logError("No dependency", propagatorFunction);
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
		@Override
		public EClass getTargettedClass() {
			return this.eFeature.getEContainingClass();
		}
		@Override
		public OutboundBinding copy() {
			return new OutboundBindingFeature(this.eFeature);
			
		}
		
		/**
		 * Return whether this inbound binding is binding the element of the target object
		 */
		@Override
		public boolean isOutboundBinding(PropagatorFunctionSource source, Object element) {
			return element == this.eFeature;
		}

	}
	
	public Bindings addOutboundBinding(EStructuralFeature feature){
		OutboundBinding binding = new OutboundBindingFeature(feature);
		this.addOutboundBinding(binding);
		return this;
	}
}
