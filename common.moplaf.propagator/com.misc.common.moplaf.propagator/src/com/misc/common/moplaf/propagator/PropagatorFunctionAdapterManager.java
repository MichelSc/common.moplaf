package com.misc.common.moplaf.propagator;

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


/**
 * An adapter that maintains itself as an adapter for all contained objects 
 * as they come and go.
 * It can be installed for an {@link EObject}, a {@link Resource}, or a {@link ResourceSet}.
 * <p>
 * Add and remove {@link PropagatorFunctionAdapter}s for {@link ObjectWithPropagatorFunctionAdapter}
 * <p>
 * The PropagatorFunctionAdapterManager is added when the listening must begin, that is
 * when derived elements must be maintained. This is typically just after the objects are retrieved from
 * their persistent storage (both primitive and derived elements), so after the Resource is loaded.
 * In the EMF generated editor, this will be in the createModel method.
 * <p>
 * Handle the management of the PropagatorFunctionAdapters of the Notifiers in the containment tree. 
 * Implement specific behaviors at the following moments:
 * <ul> 
 * <li>when the adapter is added: {@link #onAdapterAdded(Notifier)}
 *   <ul> 
 *   <li>call the Notifiers's addPropagatorFunctionAdapter {@link ObjectWithPropagatorFunctionAdapter#addPropagatorFunctionAdapter}
 *   <li>call the propagator's addPropagatorFunctionAdapters {@link PropagatorFunctionAdapter#addPropagatorFunctionAdapters()}
 *   </ul>
 * <li>when the adapter is removed: {@link #onAdapterRemoved(Notifier)}
 *   <ul> 
 *   <li>call the propagator's disposePropagatorFunctionAdapters {@link PropagatorFunctionAdapter#disposePropagatorFunctionAdapters()}
 *   <li>remove the untouched propagators
 *   </ul>
 * <li>when the Notifier is added to its container: {@link #onNotifierContained(Notifier)}
 *   <ul> 
 *   <li>touch the propagators that are touch on owned   {@link PropagatorFunctionAdapter#isTouchOnOwned()}
 *   </ul>
 * <li>when the Notifier is removed from its container: {@link #onNotifierNotContained(Notifier)}
 *   <ul> 
 *   <li>touch the propagators that are touch on dispose   {@link PropagatorFunctionAdapter#isTouchOnDispose()}
 *   </ul>
 * <li>when the Notifier is proxy resolved: {@link #onResolve(Notifier, Notifier)}
 *   <ul> 
 *   <li>move the dependency adapters from the proxy to the resolved object {@link PropagatorDependencyAdapter} 
 *   </ul>
 * </ul>
 */
public class PropagatorFunctionAdapterManager extends AdapterImpl
{
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
          addAdapter(newValue);
          this.onNotifierContained(newValue);
          this.onResolve(oldValue, newValue);
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
            this.onNotifierNotContained((Notifier)oldValue);
            removeAdapter((Notifier)oldValue);
          }
          Notifier newValue = (Notifier)notification.getNewValue();
          if (newValue != null)
          {
            addAdapter(newValue);
            this.onNotifierNotContained((Notifier)newValue);
          }
        }
        break;
      }
      case Notification.SET:
      {
        Notifier oldValue = (Notifier)notification.getOldValue();
        if (oldValue != null)
        {
          this.onNotifierNotContained(oldValue);
          removeAdapter(oldValue);
        }
        Notifier newValue = (Notifier)notification.getNewValue();
        if (newValue != null)
        {
          addAdapter(newValue);
          this.onNotifierContained(newValue);
        }
        break;
      }
      case Notification.ADD:
      {
        Notifier newValue = (Notifier)notification.getNewValue();
        if (newValue != null)
        {
          addAdapter(newValue);
          this.onNotifierContained(newValue);
        }
        break;
      }
      case Notification.ADD_MANY:
      {
        @SuppressWarnings("unchecked") Collection<Notifier> newValues = (Collection<Notifier>)notification.getNewValue();
        for (Notifier newValue : newValues)
        {
          addAdapter(newValue);
          this.onNotifierContained(newValue);
        }
        break;
      }
      case Notification.REMOVE:
      {
        Notifier oldValue = (Notifier)notification.getOldValue();
        if (oldValue != null)
        {
          this.onNotifierNotContained(oldValue);
          removeAdapter(oldValue);
        }
        break;
      }
      case Notification.REMOVE_MANY:
      {
        @SuppressWarnings("unchecked") Collection<Notifier> oldValues = (Collection<Notifier>)notification.getOldValue();
        for ( Notifier oldContentValue : oldValues)
        {
          this.onNotifierNotContained(oldContentValue);
          removeAdapter(oldContentValue);
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
   * Either if notifier is added or this PropagatorFunctionAdapterManger is added to the notifier
   */
  void onAdapterAdded(Notifier notifier){
	//CommonPlugin.INSTANCE.log("PropagatorFunctionAdapterManager.onAdapterAdded, notifier "+notifier);
	// control gets here when ownership is given
	if ( notifier instanceof ObjectWithPropagatorFunctionAdapter) {
		// adapters are added when the object is owned, or when the content adapter is registered
		ObjectWithPropagatorFunctionAdapter objectWithPropagator = (ObjectWithPropagatorFunctionAdapter)notifier;
		if ( !objectWithPropagator.eIsProxy() ){
			objectWithPropagator.addPropagatorFunctionAdapter();
			for (Adapter adapter : objectWithPropagator.eAdapters()) {
				if (adapter instanceof PropagatorFunctionAdapter) {
					PropagatorFunctionAdapter propagator = (PropagatorFunctionAdapter) adapter;
					propagator.addPropagatorFunctionAdapters();
				}
			}
		}
	}
  }

  /**
   * Handles the management of PropagatorFunctionAdapters (removes) when a Notifier enters the scope of the propagation
   * Either if notifier is removed or this PropagatorFunctionAdapterManger is removed from the notifier
   */
  void onAdapterRemoved(Notifier notifier){
	//CommonPlugin.INSTANCE.log("PropagatorFunctionAdapterManager.onAdapterRemoved, notifier "+notifier);
	// control gets here when ownership is taken
	if ( notifier instanceof ObjectWithPropagatorFunctionAdapter) {
		LinkedList<Adapter> adaptersToRemove = new LinkedList<Adapter>();
		for ( Adapter adapter : notifier.eAdapters()){
			if (adapter instanceof PropagatorFunctionAdapter) {
				PropagatorFunctionAdapter propagator = (PropagatorFunctionAdapter)adapter;
				propagator.disposePropagatorFunctionAdapters();
				if ( !propagator.isTouched() ){
					// if touched, removal is delayed at the end of the refresh
					adaptersToRemove.add(adapter);
				}
			}
		}
		notifier.eAdapters().removeAll(adaptersToRemove);
	}
  }
  
  /**
   * Touches the PropagatorFunctionAdapters requiring it when the Notifier is contained 
   */
  void onNotifierContained(Notifier notifier){
	//CommonPlugin.INSTANCE.log("PropagatorFunctionAdapterManager.onNotifierContained, notifier "+notifier);
	for (Adapter adapter : notifier.eAdapters()) {
		if (adapter instanceof PropagatorFunctionAdapter) {
			PropagatorFunctionAdapter propagator = (PropagatorFunctionAdapter) adapter;
			if (propagator.isTouchOnOwned()) {
				propagator.touch();
			}
		}
	}
  }
  
  /**
   * Touches the PropagatorFunctionAdapters requiring it when the Notifier is disposed 
   */
  void onNotifierNotContained(Notifier notifier){
	//CommonPlugin.INSTANCE.log("PropagatorFunctionAdapterManager.onNotifierNotContained, notifier "+notifier);
	for (Adapter adapter : notifier.eAdapters()) {
		if (adapter instanceof PropagatorFunctionAdapter) {
			PropagatorFunctionAdapter propagator = (PropagatorFunctionAdapter) adapter;
			if (propagator.isTouchOnDispose()) {
				propagator.touch();
			}
		}
	}
  }
  
  /**
   * Handled the PropagatorDependencyAdpater when the proxy is resolved 
   */
  void onResolve(Notifier oldNotifier, Notifier newNotifier){
	LinkedList<Adapter> adaptersToMove = new LinkedList<Adapter>();
	for ( Adapter adapter : oldNotifier.eAdapters()){
		if ( adapter instanceof PropagatorDependencyAdapter ){
			adaptersToMove.add(adapter);
		}
	}
	oldNotifier.eAdapters().removeAll(adaptersToMove);
	newNotifier.eAdapters().addAll(adaptersToMove);
  }

} // class PropagatorFunctionAdatperManager
