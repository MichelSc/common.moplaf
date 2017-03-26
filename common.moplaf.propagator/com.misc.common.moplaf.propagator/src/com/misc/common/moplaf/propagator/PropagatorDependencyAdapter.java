/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.propagator;

import java.util.LinkedList;
import java.util.List;


/**
 * Listen to changes as mandated by some PropagatorFunctionAdapter(s).
 * <p>
 * A PropagatorFunctionAdapter manages the state of a (several) data element(s) and listens to changes of some Notifier. 
 * When the state of the managed data elements must be refreshed as a function of changes of some other Notifier, then the 
 * PropagatorFunctionAdapter delegates the listening of those changes to a {@link PropagatorDependencyAdapter}, that must implement
 * {@link #notifyChanged(org.eclipse.emf.common.notify.Notification)} and call {@link #touch(Object)} appropriately.
 * <p>
 * The {@link PropagatorDependencyAdapter} maintains a collection of PropagatorFunctionAdapters depending on this adapter.
 * <p>
 * The {@link PropagatorDependencyAdapter} may track the Notifiers touching. In that case, the concrete adapter must override the method
 * {@link #isTrackToucher()}. When Notifiers -touchers-  are tracked, instead of invoking {@link PropagatorFunctionAdapter#calculate()}, the framework
 * will call the {@link PropagatorFunctionAdapter#calculate(Object)} for every Notifier -toucher - tracked. 
 * <p>
 * A {@link PropagatorDependencyAdapter} is created and added by calling {@link PropagatorFunctionAdapter#addDependency(org.eclipse.emf.common.notify.Notifier, Object, boolean)}
 * on the depending adapter, passing the concrete type of to be created dependency adapter.
 * <p>
 * A {@link PropagatorDependencyAdapter} is removed by calling {@link PropagatorFunctionAdapter#removeDependency(org.eclipse.emf.common.notify.Notifier, Object, boolean)}
 * on the depending adapter, passing the concrete type of to be removed dependency adapter.
 * <p>
 * @author michel
 *
 */
public abstract class PropagatorDependencyAdapter extends PropagatorAbstractAdapter {
	// private members
	protected LinkedList<PropagatorAbstractAdapter> functionAdapters;
	
	// accessors
	public List<PropagatorAbstractAdapter> getDependentFunctionAdapters(){
		if ( functionAdapters==null){
			functionAdapters = new LinkedList<PropagatorAbstractAdapter>();
		}
		return functionAdapters;
	}

	/**
	 * Collect all the PropagatorFunctionAdapters depending on this PropagatorDependencyAdapter.
	 * So collect all the PropagatorFunctionAdapters having this PropagatorDependencyAdapter as
	 * dependency, either directly or transitively.
	 */
	@Override
	protected void collectDependingPropagatorFunctionAdapters(PropagatorFunctionAdapters adapters) {
		if ( this.functionAdapters!=null){
			for (PropagatorAbstractAdapter abstractAdapter : functionAdapters){
				abstractAdapter.collectDependingPropagatorFunctionAdapters(adapters);
			}
		}
	}



	/**
	 * This method may be overridden to return true. When the method returns true,
	 * - when the dependency is 'TrackToucher' - the Notifier(s) touching - the toucher(s) - 
	 * will be passed to the calculate method. When more than one toucher is involved, the
	 * calculate method is invoked for every toucher.  
	 */
	protected boolean isTrackToucher(){
		return false;
	}

	/**
	 * Touch the depending adapters. Pass the target as toucher if the adapter is 'TrackToucher', 
	 * otherwise forward the received toucher, if any.  
	 */
	public void touch(Object toucher){
		super.touch(toucher);
		if ( functionAdapters!=null){
			for (PropagatorAbstractAdapter functionadapter : functionAdapters){
				Object newToucher = toucher;
				if ( this.isTrackToucher()){
					newToucher = this.getTarget();
				}
				functionadapter.touch(newToucher);
			} // traverse the depending function adapters
		}
	} 
};

