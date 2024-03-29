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
package com.misc.common.moplaf.job.provider;


import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Setter;
import com.misc.common.moplaf.job.SetterAttributeFloat;
import com.misc.common.moplaf.job.SetterAttributeInt;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.SetterAttributeFloat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetterAttributeFloatItemProvider extends SetterAttributeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterAttributeFloatItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetterAttributeFloat_Value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetterAttributeFloat_Value_feature", "_UI_SetterAttributeFloat_type"),
				 JobPackage.Literals.SETTER_ATTRIBUTE_FLOAT__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SetterAttributeFloat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SetterAttributeFloat"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SetterAttributeFloat)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SetterAttributeFloat_type") :
			getString("_UI_SetterAttributeFloat_type") + " " + label;
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

		switch (notification.getFeatureID(SetterAttributeFloat.class)) {
			case JobPackage.SETTER_ATTRIBUTE_FLOAT__VALUE:
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
	 * This adds a property descriptor for the Attribute To Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addAttributeToSetPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add
	(new ItemPropertyDescriptor
		(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetterAttribute_AttributeToSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetterAttribute_AttributeToSet_feature", "_UI_SetterAttribute_type"),
				 JobPackage.Literals.SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null){
		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			EList<Object> attributesToReturn = new BasicEList<Object>();
			SetterAttributeInt thisSetterAttribute = (SetterAttributeInt)object;
			Setter thisSetter = thisSetterAttribute.getSetter();
			EClass thisSetterClass = thisSetter.getTargetClass();
			if ( thisSetterClass != null ) {
				for (  EAttribute attribute : thisSetterClass.getEAllAttributes()){
					if ( attribute.getEAttributeType()==EcorePackage.Literals.EFLOAT ){
						attributesToReturn.add(attribute);
					}
				}
			}
			return attributesToReturn;
		}; // getChoiceOfValues
		}); // add
	}  // addAttributeToSetPropertyDescriptor
}
