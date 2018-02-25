/**
 */
package com.misc.common.moplaf.gis.kml.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.common.Coordinates;
import com.misc.common.moplaf.gis.kml.KmlPackage;
import com.misc.common.moplaf.gis.kml.LineString;
import com.misc.common.moplaf.gisview.emf.edit.IItemPathsProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.kml.LineString} object.
 * <!-- begin-user-doc -->
 * @implements IItemPathsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class LineStringItemProvider extends GeometryItemProvider implements IItemPathsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringItemProvider(AdapterFactory adapterFactory) {
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

			addCoordinatesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Coordinates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineString_Coordinates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineString_Coordinates_feature", "_UI_LineString_type"),
				 KmlPackage.Literals.LINE_STRING__COORDINATES,
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
		LineString lineString = (LineString)object;
		return getString("_UI_LineString_type") + " " + lineString.getColor();
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

		switch (notification.getFeatureID(LineString.class)) {
			case KmlPackage.LINE_STRING__COORDINATES:
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
	public Object getPaths(Object element) {
		return element;
	}

	@Override
	public String getPathText(Object element, Object path) {
		LineString line = (LineString)element;
		String text = line.getPlacemark().getName();
		return text;
	}

	@Override
	public Object getPathForeground(Object element, Object path) {
		LineString line = (LineString)element;
		int rgb = line.getColor();
		Color color = new Color(rgb);
		return color.toURI();
	}

	@Override
	public int getNrPathStops(Object element, Object path) {
		LineString line = (LineString)element;
		return line.getCoordinates().size();
	}

	@Override
	public double getPathStopLongitude(Object element, Object path, Object stop) {
		LineString line = (LineString)element;
		Integer location_index = (Integer)stop;
		Coordinates coordinates = line.getCoordinates().get(location_index);
		return coordinates.getX();
	}

	@Override
	public double getPathStopLatitude(Object element, Object path, Object stop) {
		LineString line = (LineString)element;
		Integer location_index = (Integer)stop;
		Coordinates coordinates = line.getCoordinates().get(location_index);
		return coordinates.getY();
	}

	@Override
	public double getPathStopElevation(Object element, Object path, Object stop) {
		LineString line = (LineString)element;
		Integer location_index = (Integer)stop;
		Coordinates coordinates = line.getCoordinates().get(location_index);
		return coordinates.getZ();
	}

}
