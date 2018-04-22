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
package com.misc.common.moplaf.solver.solverglpk.provider;


import com.misc.common.moplaf.solver.provider.SolverLpParamsItemProvider;

import com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverGLPKParamsItemProvider extends SolverLpParamsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverGLPKParamsItemProvider(AdapterFactory adapterFactory) {
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

			addEnablePresolvePropertyDescriptor(object);
			addEnableFeasibilityPumpPropertyDescriptor(object);
			addEnableGomoryCutsPropertyDescriptor(object);
			addEnableGeneratingCliqueCutsPropertyDescriptor(object);
			addEnableGeneratingMixedCoverCutsPropertyDescriptor(object);
			addEnableMixedIntegerRoundingCutsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enable Feasibility Pump feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableFeasibilityPumpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPKParams_EnableFeasibilityPump_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPKParams_EnableFeasibilityPump_feature", "_UI_SolverGLPKParams_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__24ParamSolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Gomory Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableGomoryCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPKParams_EnableGomoryCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPKParams_EnableGomoryCuts_feature", "_UI_SolverGLPKParams_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__24ParamSolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Generating Clique Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableGeneratingCliqueCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPKParams_EnableGeneratingCliqueCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPKParams_EnableGeneratingCliqueCuts_feature", "_UI_SolverGLPKParams_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__24ParamSolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Generating Mixed Cover Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableGeneratingMixedCoverCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPKParams_EnableGeneratingMixedCoverCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPKParams_EnableGeneratingMixedCoverCuts_feature", "_UI_SolverGLPKParams_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__24ParamSolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Mixed Integer Rounding Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableMixedIntegerRoundingCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPKParams_EnableMixedIntegerRoundingCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPKParams_EnableMixedIntegerRoundingCuts_feature", "_UI_SolverGLPKParams_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__24ParamSolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Presolve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnablePresolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPKParams_EnablePresolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPKParams_EnablePresolve_feature", "_UI_SolverGLPKParams_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__24ParamSolverGLPKPropertyCategory"),
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
		String label = ((SolverGLPKParams)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverGLPKParams_type") :
			getString("_UI_SolverGLPKParams_type") + " " + label;
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

		switch (notification.getFeatureID(SolverGLPKParams.class)) {
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE:
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP:
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS:
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS:
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS:
			case SolverglpkPackage.SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
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
		return SolverglpkEditPlugin.INSTANCE;
	}

}
