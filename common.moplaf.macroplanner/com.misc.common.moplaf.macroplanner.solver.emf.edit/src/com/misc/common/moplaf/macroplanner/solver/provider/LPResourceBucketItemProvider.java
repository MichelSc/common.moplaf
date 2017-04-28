/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.macroplanner.solver.provider;


import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.SolverFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LPResourceBucketItemProvider extends LPTimeBucketItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceBucketItemProvider(AdapterFactory adapterFactory) {
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

			addAvailabilitiesPropertyDescriptor(object);
			addReservationsPropertyDescriptor(object);
			addReservationMaximumPropertyDescriptor(object);
			addReservationSelectedSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Availabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPResourceBucket_Availabilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPResourceBucket_Availabilities_feature", "_UI_LPResourceBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__AVAILABILITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reservations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPResourceBucket_Reservations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPResourceBucket_Reservations_feature", "_UI_LPResourceBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__RESERVATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reservation Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservationMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPResourceBucket_ReservationMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPResourceBucket_ReservationMaximum_feature", "_UI_LPResourceBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__RESERVATION_MAXIMUM,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Reservation Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservationSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPResourceBucket_ReservationSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPResourceBucket_ReservationSelectedSolution_feature", "_UI_LPResourceBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__RESERVATION_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
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
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__RESERVED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__PLANNED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__CALC_RESERVED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__CALC_PLANNED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__BALANCE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LPResourceBucket)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LPResourceBucket_type") :
			getString("_UI_LPResourceBucket_type") + " " + label;
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

		switch (notification.getFeatureID(LPResourceBucket.class)) {
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATION_MAXIMUM:
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATION_SELECTED_SOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED:
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED:
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED:
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
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
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__RESERVED,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__PLANNED,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__CALC_RESERVED,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__CALC_PLANNED,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__BALANCE,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__RESERVED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__PLANNED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__CALC_RESERVED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__CALC_PLANNED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET__BALANCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
