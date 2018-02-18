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
import org.eclipse.emf.ecore.EStructuralFeature;
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
			addCancelledPropertyDescriptor(object);
			addFeedbackPropertyDescriptor(object);
			addSubmissionTimePropertyDescriptor(object);
			addStartTimePropertyDescriptor(object);
			addEndTimePropertyDescriptor(object);
			addCancelTimePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addCancelEnabledFeedbackPropertyDescriptor(object);
			addScheduleNrPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addExecuteNrPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Execute Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecuteNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_ExecuteNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_ExecuteNr_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__EXECUTE_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
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
			childrenFeatures.add(JobClientPackage.Literals.JOB_SCHEDULED__OWNED_RUN);
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
	 * This adds a property descriptor for the Schedule Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_ScheduleNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_ScheduleNr_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__SCHEDULE_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduled_Source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduled_Source_feature", "_UI_JobScheduled_type"),
				 JobClientPackage.Literals.JOB_SCHEDULED__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns JobScheduled.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/notepad.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JobScheduled)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_JobScheduled_type") :
			getString("_UI_JobScheduled_type") + " " + label;
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
			case JobClientPackage.JOB_SCHEDULED__CANCEL_TIME:
			case JobClientPackage.JOB_SCHEDULED__DESCRIPTION:
			case JobClientPackage.JOB_SCHEDULED__STATUS:
			case JobClientPackage.JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULED__SCHEDULE_NR:
			case JobClientPackage.JOB_SCHEDULED__EXECUTE_NR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JobClientPackage.JOB_SCHEDULED__OWNED_RUN:
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
