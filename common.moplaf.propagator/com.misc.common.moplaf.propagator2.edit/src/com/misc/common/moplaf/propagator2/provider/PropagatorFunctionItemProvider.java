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
package com.misc.common.moplaf.propagator2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorPackage;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.propagator2.PropagatorFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagatorFunctionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunctionItemProvider(AdapterFactory adapterFactory) {
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

			addParentPropertyDescriptor(object);
			addAntecedentsPropertyDescriptor(object);
			addAntecedentsSiblingPropertyDescriptor(object);
			addTouchedPropertyDescriptor(object);
			addTouchedChildrenPropertyDescriptor(object);
			addTouchersPropertyDescriptor(object);
			addEnabledPropertyDescriptor(object);
			addObjectWithPropagatorFunctionsPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTouchedParentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_Parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_Parent_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__PARENT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10AssociationsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_Antecedents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_Antecedents_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__ANTECEDENTS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10AssociationsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedents Sibling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentsSiblingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_AntecedentsSibling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_AntecedentsSibling_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI__10AssociationsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Touched feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_Touched_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_Touched_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__TOUCHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Touched Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchedChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_TouchedChildren_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_TouchedChildren_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20StatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Touchers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_Touchers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_Touchers_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__TOUCHERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20StatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_Enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_Enabled_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Object With Propagator Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectWithPropagatorFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_ObjectWithPropagatorFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_ObjectWithPropagatorFunctions_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI__10AssociationsPropertyCategory"),
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
				 getString("_UI_PropagatorFunction_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_Description_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__00PropagatorFunctionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Touched Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchedParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorFunction_TouchedParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorFunction_TouchedParent_feature", "_UI_PropagatorFunction_type"),
				 PropagatorPackage.Literals.PROPAGATOR_FUNCTION__TOUCHED_PARENT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20StatePropertyCategory"),
				 null));
	}

	/**
	 * This returns PropagatorFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
//		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropagatorFunction"));
		return overlayImage(object, getResourceLocator().getImage("full/obj16/refreshing.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropagatorFunction)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PropagatorFunction_type") :
			getString("_UI_PropagatorFunction_type") + " " + label;
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

		switch (notification.getFeatureID(PropagatorFunction.class)) {
			case PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED:
			case PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED:
			case PropagatorPackage.PROPAGATOR_FUNCTION__TYPE:
			case PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT:
			case PropagatorPackage.PROPAGATOR_FUNCTION__INSTANCE:
			case PropagatorPackage.PROPAGATOR_FUNCTION__DESCRIPTION:
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
		return PropagatorEditPlugin.INSTANCE;
	}

}
