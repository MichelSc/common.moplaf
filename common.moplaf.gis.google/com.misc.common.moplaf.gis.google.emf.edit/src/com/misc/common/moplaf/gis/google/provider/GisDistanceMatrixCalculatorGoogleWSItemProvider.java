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
package com.misc.common.moplaf.gis.google.provider;


import com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS;
import com.misc.common.moplaf.gis.google.GisGooglePackage;

import com.misc.common.moplaf.gis.provider.GisRouteCalculatorManyToManyItemProvider;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisDistanceMatrixCalculatorGoogleWSItemProvider extends GisRouteCalculatorManyToManyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculatorGoogleWSItemProvider(AdapterFactory adapterFactory) {
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
			addPortPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addKeyPropertyDescriptor(object);
			addAvoidTollsPropertyDescriptor(object);
			addAvoidFerriesPropertyDescriptor(object);
			addAvoidHighwaysPropertyDescriptor(object);
			addTravelModelPropertyDescriptor(object);
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
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_Protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_Protocol_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ServerPropertyCategory"),
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
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_Port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_Port_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__2ServerPropertyCategory"),
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
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_Host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_Host_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ServerPropertyCategory"),
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
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_Path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_Path_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ServerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_Key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_Key_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2ServerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Avoid Tolls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvoidTollsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_AvoidTolls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_AvoidTolls_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__3DistanceMatrixPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Avoid Ferries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvoidFerriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_AvoidFerries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_AvoidFerries_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__3DistanceMatrixPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Avoid Highways feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvoidHighwaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_AvoidHighways_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_AvoidHighways_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__3DistanceMatrixPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorGoogleWS_TravelModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorGoogleWS_TravelModel_feature", "_UI_GisDistanceMatrixCalculatorGoogleWS_type"),
				 GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__3DistanceMatrixPropertyCategory"),
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
		String label = ((GisDistanceMatrixCalculatorGoogleWS)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GisDistanceMatrixCalculatorGoogleWS_type") :
			getString("_UI_GisDistanceMatrixCalculatorGoogleWS_type") + " " + label;
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

		switch (notification.getFeatureID(GisDistanceMatrixCalculatorGoogleWS.class)) {
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS:
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL:
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
		return GisgoogleEditPlugin.INSTANCE;
	}

}
