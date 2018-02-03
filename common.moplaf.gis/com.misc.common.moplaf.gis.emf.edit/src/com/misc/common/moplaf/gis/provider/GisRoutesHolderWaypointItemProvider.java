/**
 */
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRoutesHolderWaypoint;
import com.misc.common.moplaf.gisview.emf.edit.IItemLocationsProvider;

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

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint} object.
 * <!-- begin-user-doc -->
 * @implements IItemLocationsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class GisRoutesHolderWaypointItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemLocationsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderWaypointItemProvider(AdapterFactory adapterFactory) {
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

			addLocationPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRoutesHolderWaypoint_Location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolderWaypoint_Location_feature", "_UI_GisRoutesHolderWaypoint_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER_WAYPOINT__LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
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
				 getString("_UI_GisRoutesHolderWaypoint_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolderWaypoint_Description_feature", "_UI_GisRoutesHolderWaypoint_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GisRoutesHolderWaypoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/location.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisRoutesHolderWaypoint)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisRoutesHolderWaypoint_type") :
			getString("_UI_GisRoutesHolderWaypoint_type") + " " + label;
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

		switch (notification.getFeatureID(GisRoutesHolderWaypoint.class)) {
			case GisPackage.GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION:
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
		return GisEditPlugin.INSTANCE;
	}

	@Override
	public Object getLocations(Object element) {
		GisRoutesHolderWaypoint wp = (GisRoutesHolderWaypoint)element;
		GisLocation location = wp.getLocation();
		if ( location == null) {
			return null;
		}
		GisCoordinatesAbstract coordinates = location.getCoordinates();
		if ( coordinates==null) {
			return null;
		}
		return location;
	}

	@Override
	public double getLocationLongitude(Object element, Object location) {
		GisLocation element_as_location = (GisLocation)location;
		GisCoordinatesAbstract coordinates = element_as_location.getCoordinates();
		return coordinates.getLongitude();
	}

	@Override
	public double getLocationLatitude(Object element, Object location) {
		GisLocation element_as_location = (GisLocation)location;
		GisCoordinatesAbstract coordinates = element_as_location.getCoordinates();
		return coordinates.getLatitude();
	}

	@Override
	public String getLocationText(Object element, Object location) {
		GisRoutesHolderWaypoint wp = (GisRoutesHolderWaypoint)element;
		return this.getText(wp);
	}

	@Override
	public Object getLocationImage(Object element, Object location) {
		GisRoutesHolderWaypoint wp = (GisRoutesHolderWaypoint)element;
		return this.getImage(wp);
	}
}
