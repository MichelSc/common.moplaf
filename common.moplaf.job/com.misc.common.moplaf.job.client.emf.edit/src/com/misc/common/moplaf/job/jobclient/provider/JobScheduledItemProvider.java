/**
 */
package com.misc.common.moplaf.job.jobclient.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.CancelCommand;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobScheduled;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.jobclient.JobScheduled} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobScheduledItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduledItemProvider(AdapterFactory adapterFactory) {
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

			addRunPropertyDescriptor(object);
			addScheduledOnPropertyDescriptor(object);
			addNotReadyToRunPropertyDescriptor(object);
			addReadyToRunPropertyDescriptor(object);
			addRunningPropertyDescriptor(object);
			addReturnedPropertyDescriptor(object);
			addCancelledPropertyDescriptor(object);
			addFailedPropertyDescriptor(object);
			addFeedbackPropertyDescriptor(object);
			addSubmissionTimePropertyDescriptor(object);
			addStartTimePropertyDescriptor(object);
			addEndTimePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addCancelTimePropertyDescriptor(object);
			addCancelEnabledFeedbackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Run_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Run_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__RUN,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__70ReferencesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduled On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduledOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_ScheduledOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_ScheduledOn_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__SCHEDULED_ON,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__70ReferencesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Not Ready To Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotReadyToRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_NotReadyToRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_NotReadyToRun_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__NOT_READY_TO_RUN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Ready To Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadyToRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_ReadyToRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_ReadyToRun_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__READY_TO_RUN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Running feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Running_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Running_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__RUNNING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Returned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Returned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Returned_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__RETURNED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancelled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Cancelled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Cancelled_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__CANCELLED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Failed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Failed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Failed_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__FAILED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Feedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Feedback_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__FEEDBACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Submission Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmissionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_SubmissionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_SubmissionTime_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__SUBMISSION_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__50TimesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_StartTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_StartTime_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__START_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__50TimesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_EndTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_EndTime_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__END_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__50TimesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Description_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30RunPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Status_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_CancelTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_CancelTime_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__CANCEL_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__50TimesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Enabled Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelEnabledFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_CancelEnabledFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_CancelEnabledFeedback_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This returns JobScheduled.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/job.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		JobScheduled jobScheduled = (JobScheduled)object;
		return getString("_UI_JobScheduled_type") + " " + jobScheduled.isNotReadyToRun();
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

		switch (notification.getFeatureID(JobScheduled.class)) {
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
			case JobClientPackage.JOB_SCHEDULED__NOT_READY_TO_RUN:
			case JobClientPackage.JOB_SCHEDULED__READY_TO_RUN:
			case JobClientPackage.JOB_SCHEDULED__RUNNING:
			case JobClientPackage.JOB_SCHEDULED__RETURNED:
			case JobClientPackage.JOB_SCHEDULED__CANCELLED:
			case JobClientPackage.JOB_SCHEDULED__FAILED:
			case JobClientPackage.JOB_SCHEDULED__FEEDBACK:
			case JobClientPackage.JOB_SCHEDULED__SUBMISSION_TIME:
			case JobClientPackage.JOB_SCHEDULED__START_TIME:
			case JobClientPackage.JOB_SCHEDULED__END_TIME:
			case JobClientPackage.JOB_SCHEDULED__DESCRIPTION:
			case JobClientPackage.JOB_SCHEDULED__STATUS:
			case JobClientPackage.JOB_SCHEDULED__CANCEL_TIME:
			case JobClientPackage.JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK:
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
		return JobclientEditPlugin.INSTANCE;
	}

	/*
	 * RunRefreshCommand
	 */
	public class JobScheduledCancelCommand extends CancelCommand{
		private JobScheduled jobscheduled;
		
		// constructor
		public JobScheduledCancelCommand(JobScheduled aJobScheduled)	{
			this.jobscheduled = aJobScheduled;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.jobscheduled.getCancelEnabledFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobscheduled.cancel();
		}
	} 
	
	
	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == CancelCommand.class){
			return new JobScheduledCancelCommand((JobScheduled) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
