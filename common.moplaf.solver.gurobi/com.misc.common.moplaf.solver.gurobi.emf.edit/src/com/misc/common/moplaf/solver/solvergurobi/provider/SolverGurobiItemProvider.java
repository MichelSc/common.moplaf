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
package com.misc.common.moplaf.solver.solvergurobi.provider;


import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.provider.SolverLpItemProvider;
import com.misc.common.moplaf.solver.solvergurobi.SolverGurobi;
import com.misc.common.moplaf.solver.solvergurobi.SolvergurobiPackage;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverGurobiItemProvider
	extends SolverLpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverGurobiItemProvider(AdapterFactory adapterFactory) {
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

			addFilePathPropertyDescriptor(object);
			addFileFormatPropertyDescriptor(object);
			addFileCompressedPropertyDescriptor(object);
			addMaxNofThreadsPropertyDescriptor(object);
			addSolverLogPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FilePath_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FileFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FileFormat_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Compressed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCompressedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FileCompressed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FileCompressed_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_COMPRESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Nof Threads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNofThreadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGurobi_MaxNofThreads_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGurobi_MaxNofThreads_feature", "_UI_SolverGurobi_type"),
				 SolvergurobiPackage.Literals.SOLVER_GUROBI__MAX_NOF_THREADS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__21SolverGurobiPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Log feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverLogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGurobi_SolverLog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGurobi_SolverLog_feature", "_UI_SolverGurobi_type"),
				 SolvergurobiPackage.Literals.SOLVER_GUROBI__SOLVER_LOG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverGLPKPropertyCategory"),
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
		String label = ((SolverGurobi)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverGurobi_type") :
			getString("_UI_SolverGurobi_type") + " " + label;
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

		switch (notification.getFeatureID(SolverGurobi.class)) {
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH:
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT:
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED:
			case SolvergurobiPackage.SOLVER_GUROBI__MAX_NOF_THREADS:
			case SolvergurobiPackage.SOLVER_GUROBI__SOLVER_LOG:
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
		return SolvergurobiEditPlugin.INSTANCE;
	}

}
