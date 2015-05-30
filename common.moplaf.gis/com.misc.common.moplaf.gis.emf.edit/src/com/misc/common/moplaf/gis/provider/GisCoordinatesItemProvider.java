/**
 */
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gisview.impl.IItemLocationProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisCoordinates} object.
 * <!-- begin-user-doc -->
 * @implements IItemLocationProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class GisCoordinatesItemProvider extends GisLocationItemProvider implements IItemLocationProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisCoordinatesItemProvider(AdapterFactory adapterFactory) {
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

			addLongitudePropertyDescriptor(object);
			addLatitudePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Longitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisCoordinates_Longitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisCoordinates_Longitude_feature", "_UI_GisCoordinates_type"),
				 GisPackage.Literals.GIS_COORDINATES__LONGITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Latitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisCoordinates_Latitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisCoordinates_Latitude_feature", "_UI_GisCoordinates_type"),
				 GisPackage.Literals.GIS_COORDINATES__LATITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GisCoordinates.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GisCoordinates"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisCoordinates)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GisCoordinates_type") :
			getString("_UI_GisCoordinates_type") + " " + label;
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

		switch (notification.getFeatureID(GisCoordinates.class)) {
			case GisPackage.GIS_COORDINATES__LONGITUDE:
			case GisPackage.GIS_COORDINATES__LATITUDE:
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

	@Override
	public float getLongitude(Object element) {
		GisCoordinates coordinates = (GisCoordinates)element;
		float longitude = coordinates.getLongitude();
		return longitude;
	}

	@Override
	public float getLatitude(Object element) {
		GisCoordinates coordinates = (GisCoordinates)element;
		float latitude = coordinates.getLatitude();
		return latitude;
	}

	@Override
	public float getElevation(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

}
