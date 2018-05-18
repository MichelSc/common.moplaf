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
/**
 */
package com.misc.common.moplaf.scheduler.provider;


import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.scheduler.Resource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceItemProvider extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptionPropertyDescriptor(object);
			addScheduledTasksPropertyDescriptor(object);
			addFirstTaskPropertyDescriptor(object);
			addLastTaskPropertyDescriptor(object);
			addNrScheduledTasksPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_Description_feature", "_UI_Resource_type"),
				 SchedulerPackage.Literals.RESOURCE__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduled Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduledTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_ScheduledTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_ScheduledTasks_feature", "_UI_Resource_type"),
				 SchedulerPackage.Literals.RESOURCE__SCHEDULED_TASKS,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI__20SchedulePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the First Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_FirstTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_FirstTask_feature", "_UI_Resource_type"),
				 SchedulerPackage.Literals.RESOURCE__FIRST_TASK,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_LastTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_LastTask_feature", "_UI_Resource_type"),
				 SchedulerPackage.Literals.RESOURCE__LAST_TASK,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Scheduled Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrScheduledTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_NrScheduledTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_NrScheduledTasks_feature", "_UI_Resource_type"),
				 SchedulerPackage.Literals.RESOURCE__NR_SCHEDULED_TASKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_Name_feature", "_UI_Resource_type"),
				 SchedulerPackage.Literals.RESOURCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SchedulerPackage.Literals.RESOURCE__SCHEDULED_TASKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Resource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/resource.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Resource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Resource_type") :
			getString("_UI_Resource_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Resource.class)) {
			case SchedulerPackage.RESOURCE__DESCRIPTION:
			case SchedulerPackage.RESOURCE__FIRST_TASK:
			case SchedulerPackage.RESOURCE__LAST_TASK:
			case SchedulerPackage.RESOURCE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			case SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchedulerEditPlugin.INSTANCE;
	}

	protected Command createDropCommand(EditingDomain domain, Resource owner, Object droppedObject){ 
		if ( droppedObject instanceof Task) {
			Task task = (Task)droppedObject;
			Task next = owner.getFirstTask();
			Task previous = null;
			Schedule schedule = owner.getSchedule();
			Command cmd = new ScheduleCommand(schedule, task, task, owner, previous, next);
			return cmd;
		}
		return null;
	}
	

	/**
	 * Create a drag and drop command for this Resource
	 */
	private class ResourceDragAndDropCommand extends DragAndDropCommand {

		public ResourceDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	CompoundCommand compound = new CompoundCommand();
			for (Object element : collection){
				Command cmd = ResourceItemProvider.this.createDropCommand(this.domain, (Resource)this.owner, element);
				if ( cmd != null ){
					compound.append(cmd);
				}
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};
	
	/**
	 * Create a command for a drag and drop on this Resource
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new ResourceDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
}
