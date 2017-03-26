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
package com.misc.common.moplaf.solver.solverneos.provider;


import com.misc.common.moplaf.solver.provider.SolverLpItemProvider;
import com.misc.common.moplaf.solver.solverneos.SolverNeos;
import com.misc.common.moplaf.solver.solverneos.SolverneosPackage;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.solverneos.SolverNeos} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverNeosItemProvider
	extends SolverLpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverNeosItemProvider(AdapterFactory adapterFactory) {
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

			addLpWriterPropertyDescriptor(object);
			addSolReaderPropertyDescriptor(object);
			addServerHostPropertyDescriptor(object);
			addServerPortPropertyDescriptor(object);
			addSolverCategoryPropertyDescriptor(object);
			addSolverNamePropertyDescriptor(object);
			addSolverInputPropertyDescriptor(object);
			addSolverPollDurationPropertyDescriptor(object);
			addJobSubmittedPropertyDescriptor(object);
			addJobDonePropertyDescriptor(object);
			addJobResultRetrievedPropertyDescriptor(object);
			addJobNumberPropertyDescriptor(object);
			addJobPasswordPropertyDescriptor(object);
			addJobStatusPropertyDescriptor(object);
			addJobLastStatusPropertyDescriptor(object);
			addJobNeosStatusPropertyDescriptor(object);
			addJobSubmitterEmailPropertyDescriptor(object);
			addJobResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Lp Writer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLpWriterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_LpWriter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_LpWriter_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__LP_WRITER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol Reader feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolReaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_SolReader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_SolReader_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SOL_READER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_ServerHost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_ServerHost_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SERVER_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_ServerPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_ServerPort_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SERVER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_SolverCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_SolverCategory_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SOLVER_CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_SolverName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_SolverName_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SOLVER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_SolverInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_SolverInput_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SOLVER_INPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solver Poll Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolverPollDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_SolverPollDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_SolverPollDuration_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__SOLVER_POLL_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Submitted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobSubmittedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobSubmitted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobSubmitted_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_SUBMITTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Done feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobDonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobDone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobDone_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_DONE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Result Retrieved feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobResultRetrievedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobResultRetrieved_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobResultRetrieved_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_RESULT_RETRIEVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobNumber_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_NUMBER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobPassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobPassword_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_PASSWORD,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobStatus_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Last Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobLastStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobLastStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobLastStatus_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_LAST_STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Neos Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobNeosStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobNeosStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobNeosStatus_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_NEOS_STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Submitter Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobSubmitterEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobSubmitterEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobSubmitterEmail_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_SUBMITTER_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__21SolverNeosPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Job Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverNeos_JobResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverNeos_JobResult_feature", "_UI_SolverNeos_type"),
				 SolverneosPackage.Literals.SOLVER_NEOS__JOB_RESULT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__25JobNeosPropertyCategory"),
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
		String label = ((SolverNeos)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverNeos_type") :
			getString("_UI_SolverNeos_type") + " " + label;
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

		switch (notification.getFeatureID(SolverNeos.class)) {
			case SolverneosPackage.SOLVER_NEOS__SOL_READER:
			case SolverneosPackage.SOLVER_NEOS__SERVER_HOST:
			case SolverneosPackage.SOLVER_NEOS__SERVER_PORT:
			case SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY:
			case SolverneosPackage.SOLVER_NEOS__SOLVER_NAME:
			case SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT:
			case SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION:
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED:
			case SolverneosPackage.SOLVER_NEOS__JOB_DONE:
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED:
			case SolverneosPackage.SOLVER_NEOS__JOB_NUMBER:
			case SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD:
			case SolverneosPackage.SOLVER_NEOS__JOB_STATUS:
			case SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS:
			case SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS:
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL:
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT:
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
		return SolverneosEditPlugin.INSTANCE;
	}

}
