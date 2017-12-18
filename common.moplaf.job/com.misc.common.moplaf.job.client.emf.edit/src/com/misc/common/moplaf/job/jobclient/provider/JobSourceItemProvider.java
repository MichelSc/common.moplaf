/**
 */
package com.misc.common.moplaf.job.jobclient.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.emf.edit.command.StartCommand;
import com.misc.common.moplaf.emf.edit.command.StopCommand;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobSource;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.jobclient.JobSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSourceItemProvider 
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
	public JobSourceItemProvider(AdapterFactory adapterFactory) {
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

			addJobsScheduledPropertyDescriptor(object);
			addStartFeedbackPropertyDescriptor(object);
			addStopFeedbackPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addAutoStartStopPropertyDescriptor(object);
			addRunningPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Jobs Scheduled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobsScheduledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobSource_JobsScheduled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_JobsScheduled_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__JOBS_SCHEDULED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobSource_StartFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_StartFeedback_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__START_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stop Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStopFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobSource_StopFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_StopFeedback_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__STOP_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobSource_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_Name_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_JobSource_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_Description_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_JobSource_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_Status_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Start Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoStartStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobSource_AutoStartStop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_AutoStartStop_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__AUTO_START_STOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_JobSource_Running_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSource_Running_feature", "_UI_JobSource_type"),
				 JobClientPackage.Literals.JOB_SOURCE__RUNNING,
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
		String label = ((JobSource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JobSource_type") :
			getString("_UI_JobSource_type") + " " + label;
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

		switch (notification.getFeatureID(JobSource.class)) {
			case JobClientPackage.JOB_SOURCE__START_FEEDBACK:
			case JobClientPackage.JOB_SOURCE__STOP_FEEDBACK:
			case JobClientPackage.JOB_SOURCE__NAME:
			case JobClientPackage.JOB_SOURCE__DESCRIPTION:
			case JobClientPackage.JOB_SOURCE__STATUS:
			case JobClientPackage.JOB_SOURCE__AUTO_START_STOP:
			case JobClientPackage.JOB_SOURCE__RUNNING:
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
	 * JobSourceStartCommand
	 */
	private class JobSourceStartCommand extends StartCommand{
		private JobSource jobsource;
		
		// constructor
		public JobSourceStartCommand(JobSource source)	{
			this.jobsource = source;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.jobsource.getStartFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobsource.start();
		}
	} // class JobSourceStartCommand
	
	/*
	 * JobSourceStopCommand
	 */
	private class JobSourceStopCommand extends StopCommand{
		private JobSource jobsource;
		
		// constructor
		public JobSourceStopCommand(JobSource source)	{
			this.jobsource = source;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.jobsource.getStopFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobsource.stop();
		}
	} // class JobSourceStopCommand
	
	/*
	 * JobSourceRefreshCommand
	 */
	private class JobSourceRefreshCommand extends RefreshCommand{
		private JobSource jobsource;
		
		// constructor
		public JobSourceRefreshCommand(JobSource source)	{
			this.jobsource = source;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobsource.refresh();
		}
	} // class JobSourceRefreshCommand
	


	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == StartCommand.class){
			return new JobSourceStartCommand((JobSource) object); 
		}
		else if ( commandClass == RefreshCommand.class){
			return new JobSourceRefreshCommand((JobSource) object); 
		}
		else if ( commandClass == StopCommand.class){
			return new JobSourceStopCommand((JobSource) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
