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
package com.misc.common.moplaf.gis.osrm.provider;


import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;
import com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest;

import com.misc.common.moplaf.gis.provider.GisLocationPinpointerItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisPinpointerOsrmNearestItemProvider extends GisLocationPinpointerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisPinpointerOsrmNearestItemProvider(AdapterFactory adapterFactory) {
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

			addProtocolPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addProfilePropertyDescriptor(object);
			addMaxPinpointsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisPinpointerOsrmNearest_Protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisPinpointerOsrmNearest_Protocol_feature", "_UI_GisPinpointerOsrmNearest_type"),
				 GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisPinpointerOsrmNearest_Host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisPinpointerOsrmNearest_Host_feature", "_UI_GisPinpointerOsrmNearest_type"),
				 GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisPinpointerOsrmNearest_Port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisPinpointerOsrmNearest_Port_feature", "_UI_GisPinpointerOsrmNearest_type"),
				 GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisPinpointerOsrmNearest_Path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisPinpointerOsrmNearest_Path_feature", "_UI_GisPinpointerOsrmNearest_type"),
				 GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisPinpointerOsrmNearest_Profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisPinpointerOsrmNearest_Profile_feature", "_UI_GisPinpointerOsrmNearest_type"),
				 GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST__PROFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Pinpoints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPinpointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisPinpointerOsrmNearest_MaxPinpoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisPinpointerOsrmNearest_MaxPinpoints_feature", "_UI_GisPinpointerOsrmNearest_type"),
				 GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
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
		String label = ((GisPinpointerOsrmNearest)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GisPinpointerOsrmNearest_type") :
			getString("_UI_GisPinpointerOsrmNearest_type") + " " + label;
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

		switch (notification.getFeatureID(GisPinpointerOsrmNearest.class)) {
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL:
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__HOST:
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PORT:
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PATH:
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROFILE:
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS:
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
		return GisOsrmEditPlugin.INSTANCE;
	}

}
