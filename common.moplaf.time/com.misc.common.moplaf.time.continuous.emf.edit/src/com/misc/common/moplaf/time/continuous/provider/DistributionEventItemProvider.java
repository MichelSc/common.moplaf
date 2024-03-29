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
package com.misc.common.moplaf.time.continuous.provider;


import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.DistributionEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionEventItemProvider
	extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEventItemProvider(AdapterFactory adapterFactory) {
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

			addMomentPropertyDescriptor(object);
			addEventNrPropertyDescriptor(object);
			addNextPropertyDescriptor(object);
			addPreviousPropertyDescriptor(object);
			addAmountBeforePropertyDescriptor(object);
			addAmountAfterPropertyDescriptor(object);
			addSlopeBeforePropertyDescriptor(object);
			addSlopeAfterPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDistributionAsSequencePropertyDescriptor(object);
			addSegmentAfterPropertyDescriptor(object);
			addSegmentBeforePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Moment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Moment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Moment_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_EventNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_EventNr_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__EVENT_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Next_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Next_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__NEXT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionRefsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Previous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Previous_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionRefsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_AmountBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_AmountBefore_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_AmountAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_AmountAfter_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Slope Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlopeBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_SlopeBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_SlopeBefore_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Slope After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlopeAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_SlopeAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_SlopeAfter_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_AFTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
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
				 getString("_UI_DistributionEvent_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Description_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution As Sequence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributionAsSequencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_DistributionAsSequence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_DistributionAsSequence_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionRefsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Segment After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSegmentAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_SegmentAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_SegmentAfter_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SEGMENT_AFTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Segment Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSegmentBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_SegmentBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_SegmentBefore_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SEGMENT_BEFORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10DistributionPropertyCategory"),
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
		String label = ((DistributionEvent)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_DistributionEvent_type") :
			getString("_UI_DistributionEvent_type") + " " + label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {
		DistributionEvent event = (DistributionEvent) object;
		Distribution distribution = event.getDistributionAsSequence();
		if ( distribution == null ) { return null; }
		DistributionItemProvider distributionIP = (DistributionItemProvider)adapterFactory.adapt(distribution, IEditingDomainItemProvider.class);
		if ( distributionIP == null ) { return null; }
		return distributionIP.getSequenceEvents();
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

		switch (notification.getFeatureID(DistributionEvent.class)) {
			case TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SEGMENT_AFTER:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SEGMENT_BEFORE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
		return TimeContinuousEditPlugin.INSTANCE;
	}

}
