/**
 */
package com.misc.common.moplaf.gis.osrm.provider;


import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;

import com.misc.common.moplaf.gis.provider.GisRouteCalculatorOneToOneItemProvider;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisDistanceMatrixCalculatorOsrmOneToOneItemProvider extends GisRouteCalculatorOneToOneItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculatorOsrmOneToOneItemProvider(AdapterFactory adapterFactory) {
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
			addWithAlternativesPropertyDescriptor(object);
			addWithGeometryPropertyDescriptor(object);
			addOverviewPropertyDescriptor(object);
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Protocol_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Host_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Port_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Path_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Profile_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the With Alternatives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWithAlternativesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_WithAlternatives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_WithAlternatives_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the With Geometry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWithGeometryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_WithGeometry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_WithGeometry_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overview feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverviewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Overview_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_Overview_feature", "_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__OVERVIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GisDistanceMatrixCalculatorOsrmOneToOne.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GisDistanceMatrixCalculatorOsrmOneToOne"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisDistanceMatrixCalculatorOsrmOneToOne)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type") :
			getString("_UI_GisDistanceMatrixCalculatorOsrmOneToOne_type") + " " + label;
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

		switch (notification.getFeatureID(GisDistanceMatrixCalculatorOsrmOneToOne.class)) {
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__OVERVIEW:
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
