/**
 */
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gisview.emf.edit.IItemPathsProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisRouteInfo} object.
 * <!-- begin-user-doc -->
 * @implements IItemPathsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class GisRouteInfoItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemPathsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouteInfoItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addFromLocationPropertyDescriptor(object);
			addDistancePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addToLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_GisRouteInfo_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRouteInfo_Description_feature", "_UI_GisRouteInfo_type"),
				 GisPackage.Literals.GIS_ROUTE_INFO__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRouteInfo_FromLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRouteInfo_FromLocation_feature", "_UI_GisRouteInfo_type"),
				 GisPackage.Literals.GIS_ROUTE_INFO__FROM_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRouteInfo_Distance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRouteInfo_Distance_feature", "_UI_GisRouteInfo_type"),
				 GisPackage.Literals.GIS_ROUTE_INFO__DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRouteInfo_Duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRouteInfo_Duration_feature", "_UI_GisRouteInfo_type"),
				 GisPackage.Literals.GIS_ROUTE_INFO__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRouteInfo_ToLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRouteInfo_ToLocation_feature", "_UI_GisRouteInfo_type"),
				 GisPackage.Literals.GIS_ROUTE_INFO__TO_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
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
			childrenFeatures.add(GisPackage.Literals.GIS_ROUTE_INFO__GEOMETRY);
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
	 * This returns GisRouteInfo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GisRouteInfo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisRouteInfo)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisRouteInfo_type") :
			getString("_UI_GisRouteInfo_type") + " " + label;
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

		switch (notification.getFeatureID(GisRouteInfo.class)) {
			case GisPackage.GIS_ROUTE_INFO__DESCRIPTION:
			case GisPackage.GIS_ROUTE_INFO__DISTANCE:
			case GisPackage.GIS_ROUTE_INFO__DURATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GisPackage.GIS_ROUTE_INFO__GEOMETRY:
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
				(GisPackage.Literals.GIS_ROUTE_INFO__GEOMETRY,
				 GisFactory.eINSTANCE.createGisAddressGeocoded()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_ROUTE_INFO__GEOMETRY,
				 GisFactory.eINSTANCE.createGisAddressStructured()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_ROUTE_INFO__GEOMETRY,
				 GisFactory.eINSTANCE.createGisAddressUnstructured()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_ROUTE_INFO__GEOMETRY,
				 GisFactory.eINSTANCE.createGisCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_ROUTE_INFO__GEOMETRY,
				 GisFactory.eINSTANCE.createGisGeometry()));
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
	public Object getPaths(Object element) {
		GisRouteInfo info = (GisRouteInfo)element;
		if ( info.getGeometry()==null) {
			return null;
		}
		return info;
	}

	@Override
	public List<?> getPathStops(Object element, Object path) {
		GisRouteInfo info = (GisRouteInfo)element;
		return info.getGeometry();
	}

	@Override
	public double getPathStopLongitude(Object element, Object path, Object stop) {
		GisLocation point = (GisLocation)stop;
		return point.getCoordinates().getLongitude();
	}

	@Override
	public double getPathStopLatitude(Object element, Object path, Object stop) {
		GisLocation point = (GisLocation)stop;
		return point.getCoordinates().getLatitude();
	}

	@Override
	public Object getPathForeground(Object element, Object path) {
		return Color.COLOR_RED.toURI();
	}
}
