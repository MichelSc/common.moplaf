/**
 */
package com.misc.common.moplaf.scheduler.provider;


import com.misc.common.moplaf.localsearch.LocalSearchPackage;

import com.misc.common.moplaf.localsearch.provider.DeltaItemProvider;

import com.misc.common.moplaf.scheduler.ScheduleDelta;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.scheduler.ScheduleDelta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduleDeltaItemProvider extends DeltaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleDeltaItemProvider(AdapterFactory adapterFactory) {
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

			addTaskToSchedulePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Task To Schedule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskToSchedulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScheduleDelta_TaskToSchedule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScheduleDelta_TaskToSchedule_feature", "_UI_ScheduleDelta_type"),
				 SchedulerPackage.Literals.SCHEDULE_DELTA__TASK_TO_SCHEDULE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DeltaPropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScheduleDelta)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_ScheduleDelta_type") :
			getString("_UI_ScheduleDelta_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
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

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.DELTA__NEXT_DELTAS,
				 SchedulerFactory.eINSTANCE.createScheduleAfter()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.DELTA__NEXT_DELTAS,
				 SchedulerFactory.eINSTANCE.createScheduleBefore()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.DELTA__NEXT_DELTAS,
				 SchedulerFactory.eINSTANCE.createUnschedule()));
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

}
