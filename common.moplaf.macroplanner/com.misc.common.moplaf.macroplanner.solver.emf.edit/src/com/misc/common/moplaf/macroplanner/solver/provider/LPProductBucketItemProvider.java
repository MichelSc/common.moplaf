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
package com.misc.common.moplaf.macroplanner.solver.provider;


import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LPProductBucketItemProvider extends LPTimeBucketItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductBucketItemProvider(AdapterFactory adapterFactory) {
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

			addCapacitiesPropertyDescriptor(object);
			addSuppliesPropertyDescriptor(object);
			addConsumptionsPropertyDescriptor(object);
			addConsumingSelectedSolutionPropertyDescriptor(object);
			addConsumptionSelectedSolutionPropertyDescriptor(object);
			addStockedSelectedSolutionPropertyDescriptor(object);
			addStockSelectedSolutionPropertyDescriptor(object);
			addWithCapacityPropertyDescriptor(object);
			addStockMaximumPropertyDescriptor(object);
			addCapacityTightSelectedSolutionPropertyDescriptor(object);
			addCapacitySlackSelectedSolutionPropertyDescriptor(object);
			addSuppliedSelectedSolutionPropertyDescriptor(object);
			addSupplySelectedSolutionPropertyDescriptor(object);
			addWithSupplyPropertyDescriptor(object);
			addSupplyMaximumPropertyDescriptor(object);
			addSupplyTightSelectedSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Capacities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_Capacities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_Capacities_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CAPACITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppliesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_Supplies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_Supplies_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_Consumptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_Consumptions_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CONSUMPTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consuming Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumingSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_ConsumingSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_ConsumingSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CONSUMING_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Stock Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStockMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_StockMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_StockMaximum_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__STOCK_MAXIMUM,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Stock Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStockSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_StockSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_StockSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__STOCK_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the With Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWithCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_WithCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_WithCapacity_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__WITH_CAPACITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Supply Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplyMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_SupplyMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_SupplyMaximum_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLY_MAXIMUM,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Supply Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplySelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_SupplySelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_SupplySelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLY_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the With Supply feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWithSupplyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_WithSupply_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_WithSupply_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__WITH_SUPPLY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumption Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumptionSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_ConsumptionSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_ConsumptionSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CONSUMPTION_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ValuesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Stocked Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStockedSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_StockedSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_StockedSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__STOCKED_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity Tight Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityTightSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_CapacityTightSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_CapacityTightSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CAPACITY_TIGHT_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity Slack Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitySlackSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_CapacitySlackSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_CapacitySlackSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CAPACITY_SLACK_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplied Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppliedSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_SuppliedSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_SuppliedSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLIED_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Supply Tight Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplyTightSelectedSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProductBucket_SupplyTightSelectedSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProductBucket_SupplyTightSelectedSolution_feature", "_UI_LPProductBucket_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLY_TIGHT_SELECTED_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__19FlagsPropertyCategory"),
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
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CONSUMED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLIED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__STOCKED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_CONSUMED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_SUPPLIED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_STOCKED);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__BALANCE);
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
		String label = ((LPProductBucket)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LPProductBucket_type") :
			getString("_UI_LPProductBucket_type") + " " + label;
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

		switch (notification.getFeatureID(LPProductBucket.class)) {
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMING_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTION_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCK_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__WITH_CAPACITY:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCK_MAXIMUM:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITY_TIGHT_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITY_SLACK_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_SELECTED_SOLUTION:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__WITH_SUPPLY:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_MAXIMUM:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_TIGHT_SELECTED_SOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED:
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
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
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CONSUMED,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLIED,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__STOCKED,
				 SolverFactory.eINSTANCE.createGeneratorLpVar()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_CONSUMED,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_SUPPLIED,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_STOCKED,
				 SolverFactory.eINSTANCE.createGeneratorLpCons()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__BALANCE,
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
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CONSUMED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__SUPPLIED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__STOCKED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_CONSUMED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_SUPPLIED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__CALC_STOCKED ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET__BALANCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
