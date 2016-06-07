package com.misc.common.moplaf.propagator;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The base class of the propagators used by theframework. Listens to notifications 
 * and triggers changes by calling touch().
 * <p>
 * Delegate listening to a collection of listeners (target object of this propagator) or to  {@link 
 * PropagatorDependencyAdapter}s (other emf objects naviguable from the target object of this propagator).
 * <p>
 * Two standard Listeners are provided. A {@link InboundBindingFeature}, listening to changes of some feature of this
 * propagator's Notifier and a {@link InboundBindingNavigationFeature}, listening to changes of some reference held by this
 * propagator's Notifier, and allowing to listen to changes in the referred object by receiving a 
 * {@link PropagatorDependencyAdapter}. These standards Listeners can be added with the convenience methods
 * {@link #addInboundBindingFeature(Object)} and {@link #addInboundBindingNavigationFeature(Object, Object)} respectively.
 * <p>
 * Registering the {@link PropagatorDependencyAdapter}s is done by the method {@link InboundBinding#addPropagatorFunctionAdapters}, called
 * when this adapter is added to the notifier. Unregistering the {@link PropagatorDependencyAdapter}s is done by the method
 * {@link InboundBinding#disposePropagatorFunctionAdapters()}, called when the adapter is removed from the Notifier.
 * <p>
 * Unregistering the propagatorFunctionAdapters is done by the method {@link #disposePropagatorFunctionAdapters}.
 * 
 * @author michel
 *
 */
public class PropagatorAbstractAdapter extends AbstractAdapter {
	
	private LinkedList<OutboundBinding> outboundBindings;

	/**
	* The base class of all outbound bindings.
	* <p>
	* An outbound binding informs the framework if some feature of the target of this PropagatorFunctionAdapter
	*  is set by this PropagatorFunctionAdapter, and consequently, to inform the framework if the feature
	*  is derived. 
	* <p>
	* When the feature is derived, the framework will then be able to retrieve the inbound binding of this 
	* PropagatorFunctionAdapter, and to enforce them to be update before refreshing the feature.
	*/
	class OutboundBinding{
		public OutboundBinding(){
		}
		boolean isOutboundBindingFeature(EStructuralFeature feature){
			return false;
		}
		protected void addPropagatorFunctionAdapters(){};
		protected void disposePropagatorFunctionAdapters(){};
	}

	class OutboundBindingFeature extends OutboundBinding{
		protected Object feature;
		public OutboundBindingFeature(Object feature){
			this.feature = feature;
		}
		@Override
		boolean isOutboundBindingFeature(EStructuralFeature feature){
			return this.feature==feature;
		}
	}
	
	protected void addOutboundBindings(){
	}
	
	protected void addOutboundBinding(OutboundBinding binding){
		if ( this.outboundBindings==null){
			this.outboundBindings = new LinkedList<OutboundBinding>();
		}
		this.outboundBindings.add(binding);
	}
	
	protected void addOutboundBindingFeature(Object feature){
		this.addOutboundBinding(new OutboundBindingFeature(feature));
	}
	
	/**
	* The base class of all inbound bindings.
	* <p>
	* An inbound binding listens to changes in this PropagatorFunctionAdapter. If some change 
	* occurred that must trigger a refresh (i.e. binds the changed feature to the propagator, i.e.
	* an inbound binding feature has changed), touch is called.
	* <p>
	* The very function of an inbound binding is thus to call touch() appropriately as a function 
	* of changes in this PropagatorFunctionAdapter. 
	*/
	class InboundBinding{
		public InboundBinding(){
		}
		protected void touch(){
			PropagatorAbstractAdapter.this.touch(null);
		};
		protected void addPropagatorFunctionAdapters(){};
		protected void disposePropagatorFunctionAdapters(){};
		protected void notifyChanged(Notification msg) {};
		protected void collectAntecedents(PropagatorFunctionAdapters antecedents){}
	}
	
	class InboundBindingFeature extends InboundBinding{
		protected Object feature;
		public InboundBindingFeature(Object feature){
			this.feature = feature;
		}
		@Override
		protected void notifyChanged(Notification msg) {
			if ( msg.isTouch() ) { return ; }
			if ( msg.getFeature()!= feature)  { return ; }
			this.touch();
		}
		@Override
		protected void collectAntecedents(PropagatorFunctionAdapters antecedents){
		// to do
		}
	}
	
	class InboundBindingNavigationFeature extends InboundBindingFeature{
		
		protected Object adapterFunctionType;
		
		public InboundBindingNavigationFeature(Object feature, Object adapterfunctiontype) {
			super(feature);
			this.adapterFunctionType = adapterfunctiontype;
		}

		@Override
		protected void notifyChanged(Notification msg) {
			if ( msg.isTouch() ) { return ; 
			}
			if ( msg.getFeature()!= feature)  { return ; 
			}
			if ( msg.getEventType()!=Notification.ADD 
			  && msg.getEventType()!=Notification.REMOVE
			  && msg.getEventType()!=Notification.ADD_MANY		
			  && msg.getEventType()!=Notification.REMOVE_MANY		
			  && msg.getEventType()!=Notification.SET) { return; 
			}
			// at this point, some change happened in the association
			// add/remove the dependency and touch
			PropagatorAbstractAdapter.this.addRemoveDependency(msg, this.adapterFunctionType, true);
			//PropagatorAbstractAdapter.this.touch(); // touching done by the dependency
		}
		
		@Override
		protected void addPropagatorFunctionAdapters(){
			EObject object = (EObject) PropagatorAbstractAdapter.this.getTarget();
			Object featurevalue = object.eGet((EStructuralFeature) this.feature, false ); // no resolve
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorAbstractAdapter.this.addDependency(referredobject, this.adapterFunctionType, false);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorAbstractAdapter.this.addDependency(referredobject, this.adapterFunctionType,false);
			}
		}
		@Override
		protected void disposePropagatorFunctionAdapters(){
			EObject object = (EObject) PropagatorAbstractAdapter.this.getTarget();
			Object featurevalue = object.eGet((EStructuralFeature) this.feature);
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorAbstractAdapter.this.removeDependency(referredobject, this.adapterFunctionType, false);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorAbstractAdapter.this.removeDependency(referredobject, this.adapterFunctionType, false);
			}
		}
		@Override
		protected void collectAntecedents(PropagatorFunctionAdapters antecedents){
			// this object
			super.collectAntecedents(antecedents);
			// navigated to objects
			EObject object = (EObject) PropagatorAbstractAdapter.this.getTarget();
			Object featurevalue = object.eGet((EStructuralFeature) this.feature);
			if ( featurevalue instanceof Collection<?>){
				Collection<EObject> referredobjects = (Collection<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorDependencyAdapter dependency = (PropagatorDependencyAdapter) Util.getAdapter(referredobject, this.adapterFunctionType);
					dependency.collectAntecedents(antecedents);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorDependencyAdapter dependency = (PropagatorDependencyAdapter) Util.getAdapter(referredobject, this.adapterFunctionType);
				dependency.collectAntecedents(antecedents);
			}
		}
	}
	
	protected LinkedList<InboundBinding> inboundBindings;
	
	protected void addInboundBindings(){
	}
	
	protected void addInboundBinding(InboundBinding binding){
		if ( this.inboundBindings==null){
			this.inboundBindings = new LinkedList<InboundBinding>();
		}
		this.inboundBindings.add(binding);
	}
	
	protected void addInboundBindingFeature(Object feature){
		this.addInboundBinding(new InboundBindingFeature(feature));
	}
	
	protected void addInboundBindingNavigationFeature(Object feature, Object adapterdependencytype){
		this.addInboundBinding(new InboundBindingNavigationFeature(feature, adapterdependencytype));
	}
	
	protected void logMessage(String message, String level){
		String logLine = String.format("Propagator, %4$s: %3$s, object: %1$s, function: %2$s, object %5$s" , 
		                 Util.LastTokenDotSeparated(this.target.getClass().getName()),
         		         Util.LastTokenDotSeparated(this.getClass().getName()),
         		         message, 
         		         level, 
         		         this.target);
		CommonPlugin.INSTANCE.log( logLine);
	}
	
	protected void logInfo(String message){
		if ( Plugin.INSTANCE.getLogOnInfo() ){
			this.logMessage(message, "info");
		}
	}
	
	protected void logWarning(String message){
		if ( Plugin.INSTANCE.getLogOnWarning() ){
			this.logMessage(message, "warning");
		}
	}
	
	protected void logError(String message){
		if ( Plugin.INSTANCE.getLogOnError() ){
			this.logMessage(message, "error");
		}
	}
	
	// -------------------------------------
	// activate, deactivate
	// -------------------------------------
	public void addPropagatorFunctionAdapters(){
		//this.logMessage("Activated");
		
		
		if ( this.inboundBindings!=null){
			for (InboundBinding listener : this.inboundBindings){
				listener.addPropagatorFunctionAdapters();
			}
		}
	}
	
	public void disposePropagatorFunctionAdapters(){
		//this.logMessage("Deactivated");

		if ( this.inboundBindings!=null){
			for (InboundBinding listener : this.inboundBindings){
				listener.disposePropagatorFunctionAdapters();
			}
		}
	}
	

	// -------------------------------------
	// constructor, object management
	// -------------------------------------
	public PropagatorAbstractAdapter() {
		super();
		this.addInboundBindings();
		this.addOutboundBindings();
	}

	@Override
	public boolean isAdapterForType(Object type) {
		if ( !(type instanceof Class)  ) { return false;}
		return ((Class)type).isAssignableFrom(this.getClass()); // this class is a specialization of the parameter
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.AbstractAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if ( this.inboundBindings!=null){
			for (InboundBinding listener : this.inboundBindings){
				listener.notifyChanged(msg);
			}
		}
	}

	/**
	 * This PropagatorAdapter call touch as a function of the notifications it receives
	 */
	public void touch(Object toucher){
		this.logInfo("Touched");
	} 
	
	// -------------------------------------
	// dependency management
	// -------------------------------------
	// methods managing dependencies
	public PropagatorDependencyAdapter addDependency(Notifier targetdependency, 
    												 Object adapterfunctiontype,
    												 boolean touchAfterAdd){

		PropagatorDependencyAdapter dependency = (PropagatorDependencyAdapter) Util.getAdapter(targetdependency, adapterfunctiontype);
		if ( dependency == null) {
			// create the dependency
			Class adaptertype = (Class)adapterfunctiontype;
			try {
				Constructor cons = adaptertype.getDeclaredConstructor();
				Adapter adapter = (Adapter) cons.newInstance();
				dependency = (PropagatorDependencyAdapter)adapter;
				targetdependency.eAdapters().add(adapter);
			} catch (Exception e) {
				CommonPlugin.INSTANCE.log("PropagatorLayer: no constructor for "+adaptertype.getName());
				return null;
			}
		}
		
		// add the dependent adapter
		dependency.getDependentFunctionAdapters().add(this);
		if ( touchAfterAdd ) {
			if ( dependency.isTrackToucher() ){
				this.touch(targetdependency);
			} else {
				this.touch(null);
			}
				
				
			this.touch(null);
		}

		// activate the dependency
		if ( !((EObject)dependency.getTarget()).eIsProxy() ) {
			dependency.addPropagatorFunctionAdapters();
		}
		
		return dependency;
	}

public PropagatorDependencyAdapter removeDependency(Notifier targetdependency, 
												    Object adapterfunctiontype,
												    boolean touchBeforeRemove){

	PropagatorDependencyAdapter dependency = (PropagatorDependencyAdapter) Util.getAdapter(targetdependency, adapterfunctiontype);
	if ( dependency != null){
		// normally, the dependency may not be null
		// unless the referred object has been disposed
		if ( touchBeforeRemove ) { 
			if ( dependency.isTrackToucher() ){
				this.touch(targetdependency);
			} else {
				this.touch(null);
			}
		}
		dependency.getDependentFunctionAdapters().remove(this);
		if ( dependency.getDependentFunctionAdapters().size()==0){
			dependency.disposePropagatorFunctionAdapters();
			targetdependency.eAdapters().remove(dependency);
		}
	}
	return dependency;
	    
	}


	public void addRemoveDependency(Notification notificationReferenceChange, 
									Object adapterfunctiontype,
									boolean touch){
		Object newvalue = notificationReferenceChange.getNewValue();
		Object oldvalue = notificationReferenceChange.getOldValue();
		assert newvalue!=oldvalue;
		if ( oldvalue instanceof Notifier){
			this.removeDependency((Notifier)oldvalue, adapterfunctiontype, touch);
			return;
		} else if ( oldvalue instanceof Collection<?> ){
			for ( Object element : (Collection<Object>)oldvalue){
				if ( element instanceof Notifier) {
					this.removeDependency((Notifier)element, adapterfunctiontype, touch);
				}
			}
			
		}
		if ( newvalue instanceof Notifier){
			this.addDependency((Notifier)newvalue, adapterfunctiontype, touch);
			return;
		} else if ( newvalue instanceof Collection<?> ){
			for ( Object element : (Collection<Object>)newvalue){
				if ( element instanceof Notifier) {
					this.addDependency((Notifier)element, adapterfunctiontype, touch);
				}
			}
		}
		return ;
	}

	protected void collectAntecedents(PropagatorFunctionAdapters antecedents){
		for ( InboundBinding inboundBinding : this.inboundBindings){
			inboundBinding.collectAntecedents(antecedents);
		}
		
	}

}