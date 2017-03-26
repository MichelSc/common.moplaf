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
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.solver.SolverGeneratorGoal;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.SolverGeneratorGoal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverGeneratorGoalItemProvider extends SolverGoalItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverGeneratorGoalItemProvider(AdapterFactory adapterFactory) {
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

			addGoalToSolvePropertyDescriptor(object);
			addGoalWeightPropertyDescriptor(object);
			addGoalBoundPropertyDescriptor(object);
			addOptimizePropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Goal To Solve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalToSolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGeneratorGoal_GoalToSolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGeneratorGoal_GoalToSolve_feature", "_UI_SolverGeneratorGoal_type"),
				 SolverPackage.Literals.SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Goal Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGeneratorGoal_GoalWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGeneratorGoal_GoalWeight_feature", "_UI_SolverGeneratorGoal_type"),
				 SolverPackage.Literals.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Goal Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGeneratorGoal_GoalBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGeneratorGoal_GoalBound_feature", "_UI_SolverGeneratorGoal_type"),
				 SolverPackage.Literals.SOLVER_GENERATOR_GOAL__GOAL_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optimize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptimizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGeneratorGoal_Optimize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGeneratorGoal_Optimize_feature", "_UI_SolverGeneratorGoal_type"),
				 SolverPackage.Literals.SOLVER_GENERATOR_GOAL__OPTIMIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGeneratorGoal_Constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGeneratorGoal_Constraint_feature", "_UI_SolverGeneratorGoal_type"),
				 SolverPackage.Literals.SOLVER_GENERATOR_GOAL__CONSTRAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
		String label = ((SolverGeneratorGoal)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverGeneratorGoal_type") :
			getString("_UI_SolverGeneratorGoal_type") + " " + label;
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

		switch (notification.getFeatureID(SolverGeneratorGoal.class)) {
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_WEIGHT:
			case SolverPackage.SOLVER_GENERATOR_GOAL__GOAL_BOUND:
			case SolverPackage.SOLVER_GENERATOR_GOAL__OPTIMIZE:
			case SolverPackage.SOLVER_GENERATOR_GOAL__CONSTRAINT:
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

}
