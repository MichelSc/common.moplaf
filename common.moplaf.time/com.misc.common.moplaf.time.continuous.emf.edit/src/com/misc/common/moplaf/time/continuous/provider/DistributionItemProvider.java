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
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.Distribution} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimePlotsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionItemProvider
	extends ObjectWithPropagatorFunctionsItemProvider
	implements	IItemTimePlotsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTimeUnitPropertyDescriptor(object);
			addHorizonStartPropertyDescriptor(object);
			addHorizonEndPropertyDescriptor(object);
			addSequenceEventsPropertyDescriptor(object);
			addEventsProvidersPropertyDescriptor(object);
			addParentDistributionPropertyDescriptor(object);
			addChildDistributionPropertyDescriptor(object);
			addProvidedEventsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_TimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_TimeUnit_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10DistributioninPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_HorizonStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_HorizonStart_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__HORIZON_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10DistributioninPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_HorizonEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_HorizonEnd_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__HORIZON_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10DistributioninPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_SequenceEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_SequenceEvents_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionRefsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Events Providers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventsProvidersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_EventsProviders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_EventsProviders_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI__20DistributionRefsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_ParentDistribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_ParentDistribution_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__PARENT_DISTRIBUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionHierarchyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_ChildDistribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_ChildDistribution_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__CHILD_DISTRIBUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionHierarchyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Provided Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_ProvidedEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_ProvidedEvents_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__PROVIDED_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20DistributionRefsPropertyCategory"),
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
				 getString("_UI_Distribution_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_Name_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10DistributioninPropertyCategory"),
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
			childrenFeatures.add(TimeContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENTS);
			childrenFeatures.add(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS);
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
	 * This returns Distribution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/distribution.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Distribution)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Distribution_type") :
			getString("_UI_Distribution_type") + " " + label;
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

		switch (notification.getFeatureID(Distribution.class)) {
			case TimeContinuousPackage.DISTRIBUTION__NAME:
			case TimeContinuousPackage.DISTRIBUTION__TIME_UNIT:
			case TimeContinuousPackage.DISTRIBUTION__HORIZON_START:
			case TimeContinuousPackage.DISTRIBUTION__HORIZON_END:
			case TimeContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
			case TimeContinuousPackage.DISTRIBUTION__START:
			case TimeContinuousPackage.DISTRIBUTION__END:
			case TimeContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
			case TimeContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TimeContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
			case TimeContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createStockChange()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createCapacityChange()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createSlopeDeltaProvider()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createSlopeAbsoluteProvider()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createAmountDeltaProvider()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createAmountAbsoluteProvider()));
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

	protected List<Object> children = null;
	
	private void initChildren(){
		if ( this.children==null){
			children = new ArrayList<Object>();
			Distribution distribution = (Distribution)this.target;
			this.children.add(new DistributionEventsProvidersItemProvider(adapterFactory, distribution));
			this.children.add(new DistributionDistributionEventsItemProvider(adapterFactory, distribution));
		}
	}

	@Override
	public Collection<?> getChildren(Object object) {
		
		// get the super children
		Collection<Object> superchildren = (Collection<Object>) super.getChildren(object);
		Iterator<Object> childIterator = superchildren.iterator();
		while ( childIterator.hasNext() ){
			Object child = childIterator.next();
			if      ( child instanceof DistributionEvent )     { childIterator.remove(); }
			else if ( child instanceof EventsProviderAbstract) { childIterator.remove(); }
		}
		
		// get the group children
		this.initChildren();
		superchildren.addAll(children);

		return superchildren;
	}
	
	public Object getEventsProviders(){
		this.initChildren();
		return this.children.get(0);
	}

	public Object getSequenceEvents(){
		this.initChildren();
		return this.children.get(1);
	}


	@Override
	public Object getTimePlots(Object element) {
		return this; // this Distribution is the Timeple
	}

	@Override
	public float getScale(Object element, Object timeplot) {
		return 1.0f;
	}

	@Override
	public String getText(Object element, Object timeplot) {
		return this.getText(element);
	}

	@Override
	public Object getForeground(Object element, Object timeplot) {
		return this.getForeground(element);
	}

	@Override
	public Collection<?> getEvents(Object element, Object timeplot) {
		Distribution distribution = (Distribution) element;
		return distribution.getSequenceEvents();
	}

	@Override
	public int getNrMoments(Object element, Object timeplot, Object event) {
		return 2; // 2 moments at the same time but with different amounts: amountBefore and amountAfter
	}

	@Override
	public Date getMoment(Object element, Object timeplot, Object event, Object moment) {
		DistributionEvent distributionEvent = (DistributionEvent) event;
		return distributionEvent.getMoment();
	}

	@Override
	public float getAmount(Object element, Object timeplot, Object event, Object moment) {
		DistributionEvent distributionEvent = (DistributionEvent) event;
		Integer moment_index = (Integer)moment;
		switch ( moment_index )
		{
		case 0: 
			return (float)distributionEvent.getAmountBefore();
		case 1: 
			return (float)distributionEvent.getAmountAfter();
		}
		return 0.0f;
	}
}
