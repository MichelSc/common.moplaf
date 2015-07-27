package com.misc.common.moplaf.propagator;

import java.lang.reflect.Constructor;
import java.util.LinkedList;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The base class of the Adapters used by the Propagator framework. Listens to notifications 
 * and triggers changes by calling touch().
 * <p>
 * Implement some convenience methods such as
 * <ul>
 * <li>{@link #isFeatureChanged(Notification, Object)}: if some EMF feature is changed
 * <li>{@link #isListFeatureAddedRemoved(Notification, Object)}: if some reference is added/removed
 * </ul>
 * <p>
 * Delegate listening to a collection of listeners (target object of this propagator) or to  {@link 
 * PropagatorDependencyAdapter}s (other emf objects naviguable from the target object of this propagator).
 * <p>
 * Two standard Listeners are provided. A {@link FeatureListener}, listening to changes of some feature of this
 * propagator's Notifier and a {@link NavigationFeatureListener}, listening to changes of some reference held by this
 * propagator's Notifier, and allowing to listen to changes in the referred object by receiving a 
 * {@link PropagatorDependencyAdapter}. These standards Listeners can be added with the convenience methods
 * {@link #addFeatureListener(Object)} and {@link #addNavigationFeatureListener(Object, Object)} respectively.
 * <p>
 * Registering the {@link PropagatorDependencyAdapter}s is done by the method {@link Listener#addPropagatorFunctionAdapters}, called
 * when this adapter is added to the notifier. Unregistering the {@link PropagatorDependencyAdapter}s is done by the method
 * {@link Listener#disposePropagatorFunctionAdapters()}, called when the adapter is removed from the Notifier.
 * <p>
 * Unregistering the propagatorFunctionAdapters is done by the method {@link #disposePropagatorFunctionAdapters}.
 * 
 * @author michel
 *
 */
public class PropagatorAbstractAdapter extends AbstractAdapter {
	// -------------------------------------
	// listeners implementation
	// -------------------------------------
	class Listener{
		public Listener(){
		}
		protected void touch(){
			PropagatorAbstractAdapter.this.touch(null);
		};
		protected void addPropagatorFunctionAdapters(){};
		protected void disposePropagatorFunctionAdapters(){};
		protected void notifyChanged(Notification msg) {};
	}
	
	class FeatureListener extends Listener{
		protected Object feature;
		public FeatureListener(Object feature){
			this.feature = feature;
		}
		@Override
		protected void notifyChanged(Notification msg) {
			if ( msg.isTouch() ) { return ; }
			if ( msg.getFeature()!= feature)  { return ; }
			this.touch();
		}
	}
	
	class NavigationFeatureListener extends FeatureListener{
		
		protected Object adapterFunctionType;
		
		public NavigationFeatureListener(Object feature, Object adapterfunctiontype) {
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
			if ( featurevalue instanceof EList){
				EList<EObject> referredobjects = (EList<EObject>)featurevalue;
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
			if ( featurevalue instanceof EList){
				EList<EObject> referredobjects = (EList<EObject>)featurevalue;
				for (EObject referredobject : referredobjects){
					PropagatorAbstractAdapter.this.removeDependency(referredobject, this.adapterFunctionType, false);
				}
			} else if ( featurevalue instanceof EObject){
				EObject referredobject = (EObject)featurevalue;
				PropagatorAbstractAdapter.this.removeDependency(referredobject, this.adapterFunctionType, false);
			}
		}
	}
	
	protected LinkedList<Listener> listeners;
	
	protected void addListeners(){
	}
	
	protected void addListener(Listener listener){
		if ( this.listeners==null){
			this.listeners = new LinkedList<Listener>();
		}
		this.listeners.add(listener);
	}
	
	protected void addFeatureListener(Object feature){
		this.addListener(new FeatureListener(feature));
	}
	
	protected void addNavigationFeatureListener(Object feature, Object adapterdependencytype){
		this.addListener(new NavigationFeatureListener(feature, adapterdependencytype));
	}
	
	protected void logMessage(String message, String level){
		String logLine = String.format("Propagator, %4$s: %3$s, object: %1$s, function: %2$s" , 
		                 Util.LastTokenDotSeparated(this.target.getClass().getName()),
         		         Util.LastTokenDotSeparated(this.getClass().getName()),
         		         message, 
         		         level);
		CommonPlugin.INSTANCE.log( logLine);
	}
	
	protected void logInfo(String message){
		this.logMessage(message, "info");
	}
	
	protected void logWarning(String message){
		this.logMessage(message, "warning");
	}
	
	protected void logError(String message){
		this.logMessage(message, "error");
	}
	
	// -------------------------------------
	// activate, deactivate
	// -------------------------------------
	public void addPropagatorFunctionAdapters(){
		//this.logMessage("Activated");
		
		
		if ( this.listeners!=null){
			for (Listener listener : this.listeners){
				listener.addPropagatorFunctionAdapters();
			}
		}
	}
	
	public void disposePropagatorFunctionAdapters(){
		//this.logMessage("Deactivated");

		if ( this.listeners!=null){
			for (Listener listener : this.listeners){
				listener.disposePropagatorFunctionAdapters();
			}
		}
	}
	

	// -------------------------------------
	// constructor, object management
	// -------------------------------------
	public PropagatorAbstractAdapter() {
		super();
		this.addListeners();
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
		if ( this.listeners!=null){
			for (Listener listener : this.listeners){
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
			dependency.touch(null);
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
			dependency.touch(null);
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
		} else if ( oldvalue instanceof EList<?> ){
			for ( Notifier notifier : (EList<Notifier>)oldvalue){
				this.removeDependency(notifier, adapterfunctiontype, touch);
			}
			
		}
		if ( newvalue instanceof Notifier){
			this.addDependency((Notifier)newvalue, adapterfunctiontype, touch);
			return;
		} else if ( newvalue instanceof EList<?> ){
			for ( Notifier notifier : (EList<Notifier>)newvalue){
				this.addDependency(notifier, adapterfunctiontype, touch);
			}
		}
		return ;
	}


}