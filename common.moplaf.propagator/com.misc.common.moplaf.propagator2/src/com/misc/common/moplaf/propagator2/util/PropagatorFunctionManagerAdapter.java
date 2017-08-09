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
package com.misc.common.moplaf.propagator2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;



/**
 * An adapter that maintains itself as an adapter for all contained objects 
 * as they come and go.
 * It can be installed for an {@link EObject}, a {@link Resource}, or a {@link ResourceSet}.
 * <p>
 * Add and remove {@link PropagatorFunction}s for {@link ObjectWithPropagatorFunctions}
 * <p>
 * The PropagatorFunctionAdapterManager is added when the listening must begin, that is
 * when derived elements must be maintained. This is typically just after the objects are retrieved from
 * their persistent storage (both primitive and derived elements), so after the Resource is loaded.
 * In the EMF generated editor, this will be in the createModel method.
 * <p>
 * Handle the management of the {@link PropagatorFunction}, that is when they are constructed, enabled
 * and disabled. For this, implement specific behaviors at the following moments:
 * <ul> 
 * <li> when the Notifier is added to its container: method {@link #onNotifierContainedPre(Notifier)}
 *   <ul> 
 *   <li>call the constructor method  {@link PropagatorFunctionsConstructor#addPropagatorFunctions(ObjectWithPropagatorFunctions)}
 *   <li>this latter may create and add PropagatorFunctions
 *   <li>the created PropagatorFunctions may be touched, if the refresh must happen at construction time
 *   </ul>
 * <li>when the adapter is added: {@link #onAdapterAdded(Notifier)}
 *   <ul> 
 *   <li> enable the PropagatorFunctions: call to {@link PropagatorFunction#enable()}
 *   <li> the latter will create the dependencies: call {@link PropagatorFunctionSource#initDependencies()}
 *   </ul>
 * <li>when the Notifier is proxy resolved: {@link #onResolve(Notifier, Notifier)}
 *   <ul> 
 *   <li>move the {@link PropagatorFunctionAdapter} adapters from the proxy object to the resolved object  
 *   </ul>
 * <li> when the adapter is removed: {@link #onAdapterRemoved(Notifier)}
 *   <ul> 
 *   <li> disable the propagator: call {@link PropagatorFunction#disable()}
 *   <li> the latter will dispose the dependencies: call to {@link PropagatorFunctionSource#disposeDependencies()}
 *   </ul>
 * </ul>
 * Internally, this Adapter listens to notifications and handles them by calling the following methods, 
 * when appropriate, but always in this sequence
 *   <ul> 
 *   <li>{@link #onNotifierContainedPre(Notifier)}
 *   <li>{@link #onAdapterAdded(Notifier)}
 *   <li>Children are handled (Adapter added/removed)
 *   <li>{@link #onAdapterRemoved(Notifier)}
 *   <li>{@link #onNotifierNotContained(Notifier)}
 *   </ul>
 */
public class PropagatorFunctionManagerAdapter extends AdapterImpl
{
	private PropagatorFunctionsConstructor propagatorFunctionsConstructor;

	public PropagatorFunctionManagerAdapter(PropagatorFunctionsConstructor constructor) {
		super();
		propagatorFunctionsConstructor = constructor;
	}

	/**
	 * Handles a notification by calling {@link #selfAdapt selfAdapter}.
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		selfAdapt(notification);

		super.notifyChanged(notification);
	}

	/**
	 * Handles a notification by calling {@link #handleContainment handleContainment}
	 * for any containment-based notification.
	 */
	protected void selfAdapt(Notification notification)
	{
		Object notifier = notification.getNotifier();
		if (notifier instanceof ResourceSet)
		{
			if (notification.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES)
			{
				handleContainment(notification);
			}
		}
		else if (notifier instanceof Resource)
		{
			if (notification.getFeatureID(Resource.class) == Resource.RESOURCE__CONTENTS)
			{
				handleContainment(notification);
			}
		}
		else if (notifier instanceof EObject)
		{
			Object feature = notification.getFeature();
			if (feature instanceof EReference)
			{
				EReference eReference = (EReference)feature;
				if (eReference.isContainment())
				{
					handleContainment(notification);
				}
			}
		}
	}

	/**
	 * Handles a containment change by adding and removing the adapter as appropriate.
	 */
	protected void handleContainment(Notification notification)
	{
		switch (notification.getEventType())
		{
		case Notification.RESOLVE:
		{
			// We need to be careful that the proxy may be resolved while we are attaching this adapter.
			// We need to avoid attaching the adapter during the resolve 
			// and also attaching it again as we walk the eContents() later.
			// Checking here avoids having to check during addAdapter.
			//
			Notifier oldValue = (Notifier)notification.getOldValue();
			if (oldValue.eAdapters().contains(this))
			{
				removeAdapter(oldValue);
				this.onNotifierNotContained(oldValue);
				Notifier newValue = (Notifier)notification.getNewValue();
				this.onNotifierContainedPre(newValue);
				addAdapter(newValue);
				this.onResolve(oldValue, newValue);
				this.onNotifierContainedPost(newValue);
			}
			break;
		}
		case Notification.UNSET:
		{
			Object oldValue = notification.getOldValue();
			if (oldValue != Boolean.TRUE && oldValue != Boolean.FALSE)
			{
				if (oldValue != null)
				{
					removeAdapter((Notifier)oldValue);
					this.onNotifierNotContained((Notifier)oldValue);
				}
				Notifier newValue = (Notifier)notification.getNewValue();
				if (newValue != null)
				{
					this.onNotifierContainedPre((Notifier)newValue);
					addAdapter(newValue);
					this.onNotifierContainedPost((Notifier)newValue);
				}
			}
			break;
		}
		case Notification.SET:
		{
			Notifier oldValue = (Notifier)notification.getOldValue();
			if (oldValue != null)
			{
				removeAdapter(oldValue);
				this.onNotifierNotContained(oldValue);
			}
			Notifier newValue = (Notifier)notification.getNewValue();
			if (newValue != null)
			{
				this.onNotifierContainedPre(newValue);
				addAdapter(newValue);
				this.onNotifierContainedPost(newValue);
			}
			break;
		}
		case Notification.ADD:
		{
			Notifier newValue = (Notifier)notification.getNewValue();
			if (newValue != null)
			{
				this.onNotifierContainedPre(newValue);
				addAdapter(newValue);
				this.onNotifierContainedPost(newValue);
			}
			break;
		}
		case Notification.ADD_MANY:
		{
			@SuppressWarnings("unchecked") Collection<Notifier> newValues = (Collection<Notifier>)notification.getNewValue();
			for (Notifier newValue : newValues)
			{
				this.onNotifierContainedPre(newValue);
				addAdapter(newValue);
				this.onNotifierContainedPost(newValue);
			}
			break;
		}
		case Notification.REMOVE:
		{
			Notifier oldValue = (Notifier)notification.getOldValue();
			if (oldValue != null)
			{
				removeAdapter(oldValue);
				this.onNotifierNotContained(oldValue);
			}
			break;
		}
		case Notification.REMOVE_MANY:
		{
			@SuppressWarnings("unchecked") Collection<Notifier> oldValues = (Collection<Notifier>)notification.getOldValue();
			for ( Notifier oldContentValue : oldValues)
			{
				removeAdapter(oldContentValue);
				this.onNotifierNotContained(oldContentValue);
			}
			break;
		}
		}
	}

	/**
	 * Handles installation of the adapter
	 * by adding the adapter to each of the directly contained objects.
	 */
	@Override
	public void setTarget(Notifier target)
	{
		if (target instanceof EObject)
		{
			setTarget((EObject)target);
		}
		else if (target instanceof Resource)
		{
			setTarget((Resource)target);
		}
		else if (target instanceof ResourceSet)
		{
			setTarget((ResourceSet)target);
		}
		else
		{
			basicSetTarget(target);
		}
	}

	/**
	 * Actually sets the target by calling super.
	 */
	protected void basicSetTarget(Notifier target)
	{
		super.setTarget(target);
	}

	/**
	 * Handles installation of the adapter on an EObject
	 * by adding the adapter to each of the directly contained objects.
	 */
	protected void setTarget(EObject target)
	{
		this.onAdapterAdded(target);  // first the container objects
		basicSetTarget(target);
		for (Iterator<? extends Notifier> i = target.eContents().iterator(); i.hasNext(); )
		{
			Notifier notifier = i.next();
			addAdapter(notifier);  // second the contained objects
		}
	}

	/**
	 * Handles installation of the adapter on a Resource
	 * by adding the adapter to each of the directly contained objects.
	 */
	protected void setTarget(Resource target)
	{
		basicSetTarget(target);
		List<EObject> contents = target.getContents();
		for (int i = 0, size = contents.size(); i < size; ++i)
		{
			Notifier notifier = contents.get(i);
			addAdapter(notifier);
		}
	}

	/**
	 * Handles installation of the adapter on a ResourceSet
	 * by adding the adapter to each of the directly contained objects.
	 */
	protected void setTarget(ResourceSet target)
	{
		basicSetTarget(target);
		List<Resource> resources =  target.getResources();
		for (int i = 0; i < resources.size(); ++i)
		{
			Notifier notifier = resources.get(i);
			if (!notifier.eAdapters().contains(this))
			{
				addAdapter(notifier);
			}
		}
	}

	/**
	 * Handles undoing the installation of the adapter
	 * by removing the adapter from each of the directly contained objects.
	 */
	@Override
	public void unsetTarget(Notifier target)
	{
		unsetTarget((Object)target);
	}

	/**
	 * Actually unsets the target by calling super.
	 */
	protected void basicUnsetTarget(Notifier target)
	{
		super.unsetTarget(target);
	}

	/**
	 * Handles undoing the installation of the adapter
	 * by removing the adapter from each of the directly contained objects.
	 * @deprecated Use or override {@link #unsetTarget(Notifier)} instead.
	 */
	@Deprecated
	protected void unsetTarget(Object target)
	{
		if (target instanceof EObject)
		{
			unsetTarget((EObject)target);
		}
		else if (target instanceof Resource)
		{
			unsetTarget((Resource)target);
		}
		else if (target instanceof ResourceSet)
		{
			unsetTarget((ResourceSet)target);
		}
		else
		{
			basicUnsetTarget((Notifier)target);
		}
	}

	/**
	 * Handles undoing the installation of the adapter from an EObject
	 * by removing the adapter from each of the directly contained objects.
	 */
	protected void unsetTarget(EObject target)
	{
		basicUnsetTarget(target);
		for (Iterator<? extends Notifier> i = target.eContents().iterator(); i.hasNext(); )
		{
			Notifier notifier = i.next();
			removeAdapter(notifier);  // first the contained objects
		}
		this.onAdapterRemoved(target);  // second the container object
	}

	/**
	 * Handles undoing the installation of the adapter from a Resource
	 * by removing the adapter from each of the directly contained objects.
	 */
	protected void unsetTarget(Resource target)
	{
		basicUnsetTarget(target);
		List<EObject> contents = target.getContents();
		for (int i = 0, size = contents.size(); i < size; ++i)
		{
			Notifier notifier = contents.get(i);
			removeAdapter(notifier);
		}
	}

	/**
	 * Handles undoing the installation of the adapter from a ResourceSet
	 * by removing the adapter from each of the directly contained objects.
	 */
	protected void unsetTarget(ResourceSet target)
	{
		basicUnsetTarget(target);
		List<Resource> resources =  target.getResources();
		for (int i = 0; i < resources.size(); ++i)
		{
			Notifier notifier = resources.get(i);
			removeAdapter(notifier);
		}
	}

	protected void addAdapter(Notifier notifier)
	{
		notifier.eAdapters().add(this);
	}

	protected void removeAdapter(Notifier notifier)
	{
		notifier.eAdapters().remove(this);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		if (!(type instanceof Class)) {
			return false;
		}
		return ((Class) type).isAssignableFrom(this.getClass()); // this class
		// is a
		// specialization
		// of the
		// parameter
	}


	/**
	 * Handles the management of PropagatorFunctionAdapters (adds) when a Notifier enters the scope of the propagation
	 * Either if notifier is added or this PropagatorFunctionAdapterManager is added to the notifier
	 */
	private void onAdapterAdded(Notifier notifier){
		if ( notifier instanceof PropagatorFunction ){
			PropagatorFunction propagatorFunction = (PropagatorFunction) notifier;
			if ( propagatorFunction.getFactoryID()==this.propagatorFunctionsConstructor.getFactoryID()) {
				propagatorFunction.enable();
			}
		} else if ( notifier instanceof ObjectWithPropagatorFunctions) {
			ObjectWithPropagatorFunctions objectWithPropagatorFunctions = (ObjectWithPropagatorFunctions)notifier;
			if ( !com.misc.common.moplaf.common.util.Util.isLoading(notifier)) {
				this.propagatorFunctionsConstructor.addPropagatorFunctions(objectWithPropagatorFunctions);
			}
		}

	}

	/**
	 * Handles the management of PropagatorFunctionAdapters (removes) when a Notifier leaves the scope of the propagation
	 * Either if notifier is removed or this PropagatorFunctionAdapterManger is removed from the notifier
	 */
	private void onAdapterRemoved(Notifier notifier){
		if ( notifier instanceof PropagatorFunction ){
			PropagatorFunction propagatorFunction = (PropagatorFunction) notifier;
			if ( propagatorFunction.getFactoryID()==this.propagatorFunctionsConstructor.getFactoryID()) {
				propagatorFunction.disable();
				propagatorFunction.untouch();
			}
		} else if ( notifier instanceof ObjectWithPropagatorFunctions) {
//			ObjectWithPropagatorFunctions objectWithPropagatorFunctions = (ObjectWithPropagatorFunctions)notifier;
//			if ( !com.misc.common.moplaf.common.util.Util.isUnloading(objectWithPropagatorFunctions)){
//				Iterator<PropagatorFunction> iterator = objectWithPropagatorFunctions.getPropagatorFunctions().iterator();
//				while ( iterator.hasNext() ) {
//					PropagatorFunction propagatorFunction = iterator.next();
//					if ( propagatorFunction.getFactoryID()==this.propagatorFunctionsConstructor.getFactoryID()) {
//						iterator.remove();
//					}
//				}
//			}
		}
	}

	/**
	 */
	private void onNotifierContainedPre(Notifier notifier){
	}

	/**
	 */
	private void onNotifierContainedPost(Notifier notifier){
		if ( notifier instanceof ObjectWithPropagatorFunctions) {
			ObjectWithPropagatorFunctions objectWithPropagatorFunctions = (ObjectWithPropagatorFunctions)notifier;
			if ( !com.misc.common.moplaf.common.util.Util.isLoading(objectWithPropagatorFunctions)){
				// this is an object newly added (created)
				// its PropagtorFunctions were just created
				// they are in principle not up to date
				// so we touch
				for ( PropagatorFunction pf : objectWithPropagatorFunctions.getPropagatorFunctions()){
					if ( pf.getFactoryID()==this.propagatorFunctionsConstructor.getFactoryID()) {
						pf.touch(null);
					}
				}
			}
		}
	}

	/**
	 */
	private void onNotifierNotContained(Notifier notifier){
		// CommonPlugin.INSTANCE.log("PropagatorFunctionAdapterManager.onNotifierNotContained, notifier "+notifier);
	}

	/**
	 * Handled the PropagatorDependencyAdpater when the proxy is resolved 
	 */
	private void onResolve(Notifier oldNotifier, Notifier newNotifier){
		LinkedList<Adapter> adaptersToMove = new LinkedList<Adapter>();
		for ( Adapter adapter : oldNotifier.eAdapters()){
			if ( adapter instanceof PropagatorFunctionAdapter){
				// it would be more correct here to restrict one self to the PropagatorFunction that have been constructed by this manager
				adaptersToMove.add(adapter);
			}
		}
		oldNotifier.eAdapters().removeAll(adaptersToMove);
		newNotifier.eAdapters().addAll(adaptersToMove);
	}

} // class PropagatorFunctionAdatperManager
