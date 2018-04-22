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


import com.misc.common.moplaf.solver.SolutionReaderPattern;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.SolutionReaderPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionReaderPatternItemProvider
	extends SolutionReaderItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionReaderPatternItemProvider(AdapterFactory adapterFactory) {
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

			addLinePatternPropertyDescriptor(object);
			addVarNameGroupPropertyDescriptor(object);
			addVarOptimalValueGroupPropertyDescriptor(object);
			addVarObjectiveCoefGroupPropertyDescriptor(object);
			addFirstLinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Line Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinePatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionReaderPattern_LinePattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionReaderPattern_LinePattern_feature", "_UI_SolutionReaderPattern_type"),
				 SolverPackage.Literals.SOLUTION_READER_PATTERN__LINE_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Var Name Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarNameGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionReaderPattern_VarNameGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionReaderPattern_VarNameGroup_feature", "_UI_SolutionReaderPattern_type"),
				 SolverPackage.Literals.SOLUTION_READER_PATTERN__VAR_NAME_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Var Optimal Value Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarOptimalValueGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionReaderPattern_VarOptimalValueGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionReaderPattern_VarOptimalValueGroup_feature", "_UI_SolutionReaderPattern_type"),
				 SolverPackage.Literals.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Var Objective Coef Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarObjectiveCoefGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionReaderPattern_VarObjectiveCoefGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionReaderPattern_VarObjectiveCoefGroup_feature", "_UI_SolutionReaderPattern_type"),
				 SolverPackage.Literals.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionReaderPattern_FirstLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionReaderPattern_FirstLine_feature", "_UI_SolutionReaderPattern_type"),
				 SolverPackage.Literals.SOLUTION_READER_PATTERN__FIRST_LINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SolutionReaderPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SolutionReaderPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SolutionReaderPattern)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolutionReaderPattern_type") :
			getString("_UI_SolutionReaderPattern_type") + " " + label;
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

		switch (notification.getFeatureID(SolutionReaderPattern.class)) {
			case SolverPackage.SOLUTION_READER_PATTERN__LINE_PATTERN:
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_NAME_GROUP:
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP:
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP:
			case SolverPackage.SOLUTION_READER_PATTERN__FIRST_LINE:
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
