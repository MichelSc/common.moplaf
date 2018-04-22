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


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRoutesHolderElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolderElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisRoutesHolderElementItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderElementItemProvider(AdapterFactory adapterFactory) {
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
			addToLocationPropertyDescriptor(object);
			addFromLocationPropertyDescriptor(object);
			addCalculatedPropertyDescriptor(object);
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
				 getString("_UI_GisRoutesHolderElement_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolderElement_Description_feature", "_UI_GisRoutesHolderElement_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_GisRoutesHolderElement_ToLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolderElement_ToLocation_feature", "_UI_GisRoutesHolderElement_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION,
				 false,
				 false,
				 true,
				 null,
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
				 getString("_UI_GisRoutesHolderElement_FromLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolderElement_FromLocation_feature", "_UI_GisRoutesHolderElement_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calculated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalculatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRoutesHolderElement_Calculated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolderElement_Calculated_feature", "_UI_GisRoutesHolderElement_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED,
				 true,
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
			childrenFeatures.add(GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO);
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
	 * This returns GisRoutesHolderElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/route.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisRoutesHolderElement)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisRoutesHolderElement_type") :
			getString("_UI_GisRoutesHolderElement_type") + " " + label;
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

		switch (notification.getFeatureID(GisRoutesHolderElement.class)) {
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION:
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO:
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
				(GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO,
				 GisFactory.eINSTANCE.createGisRouteInfo()));
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

	/* (non-Javadoc)
	 * GisRoutesHolderRefreshCommand
	 */
	public class GisRoutesHolderRefreshCommand extends RefreshCommand{
		private GisRoutesHolderElement element;
		
		// constructor
		public GisRoutesHolderRefreshCommand(GisRoutesHolderElement anElement)	{
			super();
			this.element = anElement;
		}
		
		@Override
		protected boolean prepare() {
			boolean isExecutable = true;
			EnabledFeedback feedback = this.element.getFromLocation().getRoutesHolder().getRefreshFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.element.refresh();
		}
	} // class GisRoutesHolderRefreshCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new GisRoutesHolderRefreshCommand((GisRoutesHolderElement) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
