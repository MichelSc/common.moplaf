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


import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIsProvider;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionLpGoal;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.SolutionLp} object.
 * <!-- begin-user-doc -->
 * @implements IItemKPIsProvider 
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionLpItemProvider extends SolutionItemProvider implements IItemKPIsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLpItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionLp_Value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionLp_Value_feature", "_UI_SolutionLp_type"),
				 SolverPackage.Literals.SOLUTION_LP__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
		String label = ((SolutionLp)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolutionLp_type") :
			getString("_UI_SolutionLp_type") + " " + label;
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

		switch (notification.getFeatureID(SolutionLp.class)) {
			case SolverPackage.SOLUTION_LP__VALUE:
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
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public Collection<?> getKPIs(Object element) {
		SolutionLp solution = (SolutionLp)element;
		return solution.getGoals();
	}

	@Override
	public float getKPIAmount(Object element, Object kpi) {
		SolutionLpGoal goal = (SolutionLpGoal)kpi;
		return (float) goal.getValue();
	}

	@Override
	public float getKPIMinAmount(Object element, Object kpi) {
		SolutionLpGoal goal = (SolutionLpGoal)kpi;
		GeneratorLpGoal genarator_goal = (GeneratorLpGoal) goal.getGoal();
		return (float) genarator_goal.getMinValueIndicative();
	}

	@Override
	public float getKPIMaxAmount(Object element, Object kpi) {
		SolutionLpGoal goal = (SolutionLpGoal)kpi;
		GeneratorLpGoal genarator_goal = (GeneratorLpGoal) goal.getGoal();
		return (float) genarator_goal.getMaxValueIndicative();
	}

	@Override
	public String getKPIID(Object element, Object kpi) {
		SolutionLpGoal goal = (SolutionLpGoal)kpi;
		GeneratorLpGoal genarator_goal = (GeneratorLpGoal) goal.getGoal();
		return genarator_goal.getName();
	}

	@Override
	public String getKPIUnit(Object element, Object kpi) {
		return null;
	}

	@Override
	public Collection<?> getKPIRanges(Object element, Object kpi) {
		return null;
	}

	@Override
	public float getKPIRangeLowAmount(Object element, Object kpi, Object range) {
		return 0;
	}

	@Override
	public float getKPIRangeHighAmount(Object element, Object kpi, Object range) {
		return 0;
	}

}
