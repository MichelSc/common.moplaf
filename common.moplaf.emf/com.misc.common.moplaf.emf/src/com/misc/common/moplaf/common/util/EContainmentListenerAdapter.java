package com.misc.common.moplaf.common.util;

/**
 * Copyright (c) 2002-2012 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */


import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * An adapter that maintains itself as an adapter for all contained objects 
 * as they come and go.
 * It can be installed for an {@link EObject}, a {@link Resource}, or a {@link ResourceSet}.
 * <p>
 * The purpose of the {@link EContainmentListenerAdapter} is to call {@link EContainmentListener}
 * each time some containment event occurred in the object hierarchy where it is added.
 * <p>
 * The Adapter can be added to a Notifer with the convenience method {@link Util#adapt(Object, Object, boolean)}
 * <p>
 * Examples places when the addition can take place are
 * <ul>
 * <li> in the constructor of the root of the hierarchy </li>
 * <li> in the method {@link #createModel} of the emf generated Editor, before or after a Resource is loaded in the ResourceSet </li>
 * </ul>
 */
public class EContainmentListenerAdapter extends AdapterImpl
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
          Notifier newValue = (Notifier)notification.getNewValue();
          addAdapter(newValue);
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
        	  handleContainmentRemoveAdapter((Notifier)oldValue, false, true);
            
          }
          Notifier newValue = (Notifier)notification.getNewValue();
          if (newValue != null)
          {
        	  handleContainmentAddAdapter(newValue);
          }
        }
        break;
      }
      case Notification.SET:
      {
        Notifier oldValue = (Notifier)notification.getOldValue();
        if (oldValue != null)
        {
        	handleContainmentRemoveAdapter(oldValue, false, true);
        }
        Notifier newValue = (Notifier)notification.getNewValue();
        if (newValue != null)
        {
        	handleContainmentAddAdapter(newValue);
        }
        break;
      }
      case Notification.ADD:
      {
        Notifier newValue = (Notifier)notification.getNewValue();
        if (newValue != null)
        {
        	handleContainmentAddAdapter(newValue);
        }
        break;
      }
      case Notification.ADD_MANY:
      {
        @SuppressWarnings("unchecked") Collection<Notifier> newValues = (Collection<Notifier>)notification.getNewValue();
        for (Notifier newValue : newValues)
        {
        	handleContainmentAddAdapter(newValue);
        }
        break;
      }
      case Notification.REMOVE:
      {
        Notifier oldValue = (Notifier)notification.getOldValue();
        if (oldValue != null)
        {
          boolean checkContainer = notification.getNotifier() instanceof Resource;
          boolean checkResource = notification.getFeature() != null;
          handleContainmentRemoveAdapter(oldValue, checkContainer, checkResource);
        }
        break;
      }
      case Notification.REMOVE_MANY:
      {
        boolean checkContainer = notification.getNotifier() instanceof Resource;
        boolean checkResource = notification.getFeature() != null;
        @SuppressWarnings("unchecked") Collection<Notifier> oldValues = (Collection<Notifier>)notification.getOldValue();
        for ( Notifier oldContentValue : oldValues)
        {
        	handleContainmentRemoveAdapter(oldContentValue, checkContainer, checkResource);
        }
        break;
      }
    }
  }
  
  /**
   * 
   * @param notifier
   */
  void handleContainmentAddAdapter(Notifier notifier){
	  this.addAdapter(notifier);
	  boolean isLoading = Util.isLoading(notifier);
	  this.onContainedNotifier(notifier, isLoading);
  }

  /**
   * 
   * @param notifier
   * @param checkContainer
   * @param checkResource
   */
  void handleContainmentRemoveAdapter(Notifier notifier, boolean checkContainer, boolean checkResource){
	  this.removeAdapter(notifier, checkContainer, checkResource);
	  this.onNotContainedNotifier(notifier);
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
    basicSetTarget(target);
    for (Iterator<? extends Notifier> i = resolve() ? 
           target.eContents().iterator() : 
           ((InternalEList<? extends Notifier>)target.eContents()).basicIterator();
         i.hasNext(); )
    {
      Notifier notifier = i.next();
      addAdapter(notifier);
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
      addAdapter(notifier);
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
    for (Iterator<? extends Notifier> i = resolve() ? 
           target.eContents().iterator() : 
           ((InternalEList<EObject>)target.eContents()).basicIterator(); 
         i.hasNext(); )
    {
      Notifier notifier = i.next();
      removeAdapter(notifier, false, true);
    }
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
      removeAdapter(notifier, true, false);
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
      removeAdapter(notifier, false, false);
    }
  }

  protected void addAdapter(Notifier notifier)
  {
    EList<Adapter> eAdapters = notifier.eAdapters();
    if (!eAdapters.contains(this))
    {
      eAdapters.add(this); 
    }
  }

  protected void removeAdapter(Notifier notifier, boolean checkContainer, boolean checkResource)
  {
    if (checkContainer || checkResource)
    {
      InternalEObject internalEObject = (InternalEObject) notifier;
      if (checkResource)
      {
        Resource eDirectResource = internalEObject.eDirectResource();
        if (eDirectResource != null && eDirectResource.eAdapters().contains(this))
        {
          return;
        }
      }
      if (checkContainer)
      {
        InternalEObject eInternalContainer = internalEObject.eInternalContainer();
        if (eInternalContainer != null && eInternalContainer.eAdapters().contains(this))
        {
          return;
        }
      }
    }

    removeAdapter(notifier);
  }

  protected void removeAdapter(Notifier notifier)
  {
    notifier.eAdapters().remove(this); 
  }

  protected boolean resolve()
  {
    return true;
  }
  
  private void onContainedNotifier(Notifier notifier, boolean isLoading){
	  if      ( notifier instanceof Resource) { this.onContainedResource((Resource) notifier, isLoading); }
	  else if ( notifier instanceof EObject)  { this.onContainedEObject((EObject) notifier,  isLoading);}
  }
  
  private void onContainedResource(Resource resource, boolean isLoading){
	  for ( EObject object : resource.getContents()){
		  this.onContainedEObject(object, isLoading);
	  }
  }
  
  private void onContainedEObject(EObject object, boolean isLoading){
	  // first this object, then the children
	  if ( object instanceof EContainmentListener ){
		  EContainmentListener listener = (EContainmentListener)object;
		  if ( isLoading ) {
			  listener.onLoaded();
		  } else {
			  listener.onContained();
		  }
	  }
	  for ( EObject child : object.eContents()){
		  this.onContainedEObject(child, isLoading);
	  }
  }
  private void onNotContainedNotifier(Notifier notifier){
	  if      ( notifier instanceof Resource) { this.onNotContainedResource((Resource) notifier); }
	  else if ( notifier instanceof EObject)  { this.onNotContainedEObject((EObject) notifier);}
  }
  
  private void onNotContainedResource(Resource resource){
	  for ( EObject object : resource.getContents()){
		  this.onNotContainedEObject(object);
	  }
  }
  
  private void onNotContainedEObject(EObject object){
	  // first the children, then this object
	  for ( EObject child : object.eContents()){
		  this.onNotContainedEObject(child);
	  }
	  if ( object instanceof EContainmentListener ){
		  EContainmentListener listener = (EContainmentListener)object;
		  listener.onNotContained();
	  }
  }
}
