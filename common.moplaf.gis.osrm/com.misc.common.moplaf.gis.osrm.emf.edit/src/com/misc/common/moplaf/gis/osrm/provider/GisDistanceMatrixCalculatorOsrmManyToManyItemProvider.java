/**
 */
package com.misc.common.moplaf.gis.osrm.provider;


import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisDistanceMatrixCalculatorOsrmManyToManyItemProvider extends GisRouteCalculatorManyToManyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculatorOsrmManyToManyItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Protocol_feature", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Host_feature", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Port_feature", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Path_feature", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH,
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
				 getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_Profile_feature", "_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type"),
				 GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
		String label = ((GisDistanceMatrixCalculatorOsrmManyToMany)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type") :
			getString("_UI_GisDistanceMatrixCalculatorOsrmManyToMany_type") + " " + label;
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

		switch (notification.getFeatureID(GisDistanceMatrixCalculatorOsrmManyToMany.class)) {
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH:
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE:
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
