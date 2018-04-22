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
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.solver.SolverLp;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.SolverLp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverLpItemProvider
	extends SolverItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLpItemProvider(AdapterFactory adapterFactory) {
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

			addSolverOptimalityTolerancePropertyDescriptor(object);
			addSolverLinearRelaxationPropertyDescriptor(object);
			addSolOptimalityGapPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Solver Optimality Tolerance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverOptimalityTolerancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverLpParams_SolverOptimalityTolerance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverLpParams_SolverOptimalityTolerance_feature", "_UI_SolverLpParams_type"),
				 SolverPackage.Literals.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__22ParamSolverPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Linear Relaxation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverLinearRelaxationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverLpParams_SolverLinearRelaxation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverLpParams_SolverLinearRelaxation_feature", "_UI_SolverLpParams_type"),
				 SolverPackage.Literals.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__22ParamSolverPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol Optimality Gap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolOptimalityGapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverLp_SolOptimalityGap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverLp_SolOptimalityGap_feature", "_UI_SolverLp_type"),
				 SolverPackage.Literals.SOLVER_LP__SOL_OPTIMALITY_GAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__40SolutionPropertyCategory"),
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
		String label = ((SolverLp)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverLp_type") :
			getString("_UI_SolverLp_type") + " " + label;
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

		switch (notification.getFeatureID(SolverLp.class)) {
			case SolverPackage.SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE:
			case SolverPackage.SOLVER_LP__SOLVER_LINEAR_RELAXATION:
			case SolverPackage.SOLVER_LP__SOL_OPTIMALITY_GAP:
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
