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
/**
 */
package com.misc.common.moplaf.time.continuous.calc.provider;


import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import com.misc.common.moplaf.time.continuous.provider.PropagatorFunctionDistributionItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagatorCalcDistributionProvidedEventsItemProvider extends PropagatorFunctionDistributionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionProvidedEventsItemProvider(AdapterFactory adapterFactory) {
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

			addConcreteParentPropertyDescriptor(object);
			addAntecedentLayerCompositeeventRefreshPropertyDescriptor(object);
			addAntecedentCalcDistributionchildEventsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Concrete Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcreteParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorCalcDistributionProvidedEvents_ConcreteParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorCalcDistributionProvidedEvents_ConcreteParent_feature", "_UI_PropagatorCalcDistributionProvidedEvents_type"),
				 TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedent Layer Compositeevent Refresh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentLayerCompositeeventRefreshPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh_feature", "_UI_PropagatorCalcDistributionProvidedEvents_type"),
				 TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedent Calc Distributionchild Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentCalcDistributionchildEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents_feature", "_UI_PropagatorCalcDistributionProvidedEvents_type"),
				 TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PropagatorCalcDistributionProvidedEvents.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropagatorCalcDistributionProvidedEvents"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropagatorCalcDistributionProvidedEvents)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PropagatorCalcDistributionProvidedEvents_type") :
			getString("_UI_PropagatorCalcDistributionProvidedEvents_type") + " " + label;
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimeContinuousCalcEditPlugin.INSTANCE;
	}

}
