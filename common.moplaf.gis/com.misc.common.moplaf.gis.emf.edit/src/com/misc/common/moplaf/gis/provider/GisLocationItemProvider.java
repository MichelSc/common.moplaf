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
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisToolLocation;
import com.misc.common.moplaf.gisview.emf.edit.IItemLocationsProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisLocation} object.
 * <!-- begin-user-doc -->
 * @implements IItemLocationsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class GisLocationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemLocationsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocationItemProvider(AdapterFactory adapterFactory) {
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
			addGeocodedPropertyDescriptor(object);
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
				 getString("_UI_GisLocation_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisLocation_Description_feature", "_UI_GisLocation_type"),
				 GisPackage.Literals.GIS_LOCATION__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geocoded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeocodedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisLocation_Geocoded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisLocation_Geocoded_feature", "_UI_GisLocation_type"),
				 GisPackage.Literals.GIS_LOCATION__GEOCODED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(GisPackage.Literals.GIS_LOCATION__TOOLS);
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
	 * This returns GisLocation.gif.
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
		String label = ((GisLocation)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisLocation_type") :
			getString("_UI_GisLocation_type") + " " + label;
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

		switch (notification.getFeatureID(GisLocation.class)) {
			case GisPackage.GIS_LOCATION__DESCRIPTION:
			case GisPackage.GIS_LOCATION__GEOCODED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GisPackage.GIS_LOCATION__TOOLS:
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
				(GisPackage.Literals.GIS_LOCATION__TOOLS,
				 GisFactory.eINSTANCE.createGisLocationTool()));
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
		GisLocation location = (GisLocation)element;
		GisCoordinatesAbstract coordinates = location.getCoordinates();
		if ( coordinates==null) {
			return null;
		}
		return location;
	}

	@Override
	public double getLocationLongitude(Object element, Object location) {
		GisLocation element_as_location = (GisLocation)element;
		GisCoordinatesAbstract coordinates = element_as_location.getCoordinates();
		return coordinates.getLongitude();
	}

	@Override
	public double getLocationLatitude(Object element, Object location) {
		GisLocation element_as_location = (GisLocation)element;
		GisCoordinatesAbstract coordinates = element_as_location.getCoordinates();
		return coordinates.getLatitude();
	}

	@Override
	public String getLocationText(Object element, Object location) {
		GisLocation element_as_location = (GisLocation)element;
		return this.getText(element_as_location);
	}

	@Override
	public Object getLocationImage(Object element, Object location) {
		return this.getImage(element);
	}

	/**
	 * Create a drag and drop command for this GisLocation
	 */
	private class GisLocationDragAndDropCommand extends DragAndDropCommand {

		public GisLocationDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	CompoundCommand compound = new CompoundCommand();
			GisLocation this_location = (GisLocation) owner;
			for (Object element : collection){
				if ( element instanceof GisToolLocation){
					compound.append(new GisLocationAddToolCommand(this_location, (GisToolLocation)element));
				}
				else {
				}
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};
	
	/**
	 * Create a command for a drag and drop on this Run
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new GisLocationDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
}
