package com.misc.common.moplaf.propagator;

import java.util.LinkedList;
import java.util.List;

/**
 * Listen to changes as mandated by some PropagatorFunctionAdapter(s).
 * <p>
 * A PropagatorFunctionAdapter manages the state of a (several) data element(s) and listens to changes of some Notifier. 
 * When the state of the managed data elements must be refreshed as a function of changes of some other Notifier, then the 
 * PropagatorFunctionAdapter delegates the listening of those changes to a {@link PropagatorDependencyAdapter}, that must implement
 * {@link #notifyChanged(org.eclipse.emf.common.notify.Notification)} and call {@link #touch()} appropriately.
 * <p>
 * The {@link PropagatorDependencyAdapter} maintains a collection of PropagatorFunctionAdapters depending on this adapter.
 * <p>
 * A {@link PropagatorDependencyAdapter} is created and added by calling {@link PropagatorFunctionAdapter#addDependency(org.eclipse.emf.common.notify.Notifier, Object)}
 * on the depending adapter, passing the concrete type of to be created dependency adapter.
 * <p>
 * A {@link PropagatorDependencyAdapter} is removed by calling {@link PropagatorFunctionAdapter#removeDependency(org.eclipse.emf.common.notify.Notifier, Object)}
 * on the depending adapter, passing the concrete type of to be removed dependency adapter.
 * <p>
 * @author michel
 *
 */
public abstract class PropagatorDependencyAdapter extends PropagatorAbstractAdapter {
	// private members
	protected LinkedList<PropagatorAbstractAdapter> functionAdapters;
//	protected PropagatorAbstractAdapter functionAdapter;
	
	// constructor
	// accessors
	public List<PropagatorAbstractAdapter> getDependentFunctionAdapters(){
		if ( functionAdapters==null){
			functionAdapters = new LinkedList<PropagatorAbstractAdapter>();
		}
		return functionAdapters;
	}

	// modifiers
	public void touch(){
		super.touch();
		if ( functionAdapters!=null){
			for (PropagatorAbstractAdapter functionadapter : functionAdapters){
				functionadapter.touch();
			} // traverse the function adapters
		}
	} // method touch
	/*
	public void touch() {
		if ( this.functionAdapter!=null) {
			this.functionAdapter.touch();
		}
	}*/
		
	/*
	public void touchReferenceAddedRemoved(Notification msg, Object feature) {
		super.touch();
		if ( msg.isTouch() ) { return; }
		if ( msg.getFeature()!= feature)  { return; }
		if ( msg.getEventType()!=Notification.ADD 
		  && msg.getEventType()!=Notification.REMOVE
		  && msg.getEventType()!=Notification.SET) { return ; }
		Notifier newvalue = (Notifier)msg.getNewValue();
		Notifier oldvalue = (Notifier)msg.getOldValue();
		for (PropagatorAbstractAdapter functionadapter : functionAdapters){
			Notifier target = functionadapter.getTarget();
			if ( newvalue == target || oldvalue == target ) {
				functionadapter.touch();
			}
		} // traverse the function adapters
	} // method TouchReferenceAddedRemoved
		*/
}
