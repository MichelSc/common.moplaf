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


import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.SolverFactory;

import com.misc.common.moplaf.solver.provider.GeneratorItemProvider;
import com.misc.common.moplaf.solver.provider.Util;
import com.misc.common.moplaf.time.discrete.TimeDiscreteFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LPMacroPlannerItemProvider extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPMacroPlannerItemProvider(AdapterFactory adapterFactory) {
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

			addBucketSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bucket Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPMacroPlanner_BucketSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPMacroPlanner_BucketSize_feature", "_UI_LPMacroPlanner_type"),
				 MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__BUCKET_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__40MacroPlannerPropertyCategory"),
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
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PRODUCT_SET);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__RESOURCE_SET);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__ROUTING_SET);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__TIME_LINE);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_ROUTINGS);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_SUPPLIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_CAPACITIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_AVAILABILITIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PENALTY_CAPACITIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__SOLVERS);
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
		String label = ((LPMacroPlanner)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LPMacroPlanner_type") :
			getString("_UI_LPMacroPlanner_type") + " " + label;
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

		switch (notification.getFeatureID(LPMacroPlanner.class)) {
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES:
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS:
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
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PRODUCT_SET,
				 MacroPlannerSolverFactory.eINSTANCE.createLPProductSet()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__RESOURCE_SET,
				 MacroPlannerSolverFactory.eINSTANCE.createLPResourceSet()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__ROUTING_SET,
				 MacroPlannerSolverFactory.eINSTANCE.createLPRoutingSet()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__TIME_LINE,
				 TimeDiscreteFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_ROUTINGS,
				 SolverFactory.eINSTANCE.createGeneratorLpGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_SUPPLIES,
				 SolverFactory.eINSTANCE.createGeneratorLpGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_CAPACITIES,
				 SolverFactory.eINSTANCE.createGeneratorLpGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_AVAILABILITIES,
				 SolverFactory.eINSTANCE.createGeneratorLpGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PENALTY_CAPACITIES,
				 SolverFactory.eINSTANCE.createGeneratorLpGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES,
				 SolverFactory.eINSTANCE.createGeneratorLpGoal()));

		Util.collectNewChildSolverDescriptors2(newChildDescriptors, 
                object, 
                MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__SOLVERS);
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
			childFeature == MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_ROUTINGS ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_SUPPLIES ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_CAPACITIES ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__COST_AVAILABILITIES ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PENALTY_CAPACITIES ||
			childFeature == MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MacroPlannerSolverEditPlugin.INSTANCE;
	}

}
