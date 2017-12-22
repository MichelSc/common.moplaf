/**
 */
package com.misc.common.moplaf.job.jobclient.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.StartCommand;
import com.misc.common.moplaf.emf.edit.command.StopCommand;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobSchedulerService;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.jobclient.JobSchedulerService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSchedulerServiceItemProvider 
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
	public JobSchedulerServiceItemProvider(AdapterFactory adapterFactory) {
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

			addStartFeedbackPropertyDescriptor(object);
			addStopFeedbackPropertyDescriptor(object);
			addAutoStartStopPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addRunningPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_JobSchedulerService_StartFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSchedulerService_StartFeedback_feature", "_UI_JobSchedulerService_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER_SERVICE__START_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
				 getString("_UI_JobSchedulerService_StopFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSchedulerService_StopFeedback_feature", "_UI_JobSchedulerService_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER_SERVICE__STOP_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
				 getString("_UI_JobSchedulerService_AutoStartStop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSchedulerService_AutoStartStop_feature", "_UI_JobSchedulerService_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER_SERVICE__AUTO_START_STOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__30ServicePropertyCategory"),
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
				 getString("_UI_JobSchedulerService_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSchedulerService_Name_feature", "_UI_JobSchedulerService_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER_SERVICE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30ServicePropertyCategory"),
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
				 getString("_UI_JobSchedulerService_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSchedulerService_Status_feature", "_UI_JobSchedulerService_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER_SERVICE__STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JobSchedulerService_Running_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobSchedulerService_Running_feature", "_UI_JobSchedulerService_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER_SERVICE__RUNNING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This returns JobSchedulerService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JobSchedulerService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JobSchedulerService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JobSchedulerService_type") :
			getString("_UI_JobSchedulerService_type") + " " + label;
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

		switch (notification.getFeatureID(JobSchedulerService.class)) {
			case JobClientPackage.JOB_SCHEDULER_SERVICE__START_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER_SERVICE__STOP_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER_SERVICE__AUTO_START_STOP:
			case JobClientPackage.JOB_SCHEDULER_SERVICE__NAME:
			case JobClientPackage.JOB_SCHEDULER_SERVICE__DESCRIPTION:
			case JobClientPackage.JOB_SCHEDULER_SERVICE__STATUS:
			case JobClientPackage.JOB_SCHEDULER_SERVICE__RUNNING:
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
	private class SchedulerServiceStartCommand extends StartCommand{
		private JobSchedulerService service;
		
		// constructor
		public SchedulerServiceStartCommand(JobSchedulerService service)	{
			this.service = service;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.service.getStartFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.service.start();
		}
	} // class JobSourceStartCommand
	
	/*
	 * JobSourceStopCommand
	 */
	private class SchedulerServiceStopCommand extends StopCommand{
		private JobSchedulerService service;
		
		// constructor
		public SchedulerServiceStopCommand(JobSchedulerService service)	{
			this.service = service;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.service.getStopFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.service.stop();
		}
	} // class JobSourceStopCommand
	

	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == StartCommand.class){
			return new SchedulerServiceStartCommand((JobSchedulerService) object); 
		}
		else if ( commandClass == StopCommand.class){
			return new SchedulerServiceStopCommand((JobSchedulerService) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
