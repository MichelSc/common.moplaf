/**
 */
package com.misc.common.moplaf.job.jobclient.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.emf.edit.command.StartCommand;
import com.misc.common.moplaf.emf.edit.command.StopCommand;
import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.jobclient.JobScheduler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSchedulerItemProvider 
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
	public JobSchedulerItemProvider(AdapterFactory adapterFactory) {
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
			addRunningPropertyDescriptor(object);
			addRefreshFeedbackPropertyDescriptor(object);
			addRefreshRatePropertyDescriptor(object);
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
				 getString("_UI_JobScheduler_StartFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_StartFeedback_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__START_FEEDBACK,
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
				 getString("_UI_JobScheduler_StopFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_StopFeedback_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__STOP_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JobScheduler_Running_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_Running_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__RUNNING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refresh Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefreshFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_RefreshFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_RefreshFeedback_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__REFRESH_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refresh Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefreshRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_RefreshRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_RefreshRate_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__REFRESH_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(JobClientPackage.Literals.JOB_SCHEDULER__JOBS);
			childrenFeatures.add(JobClientPackage.Literals.JOB_SCHEDULER__ENGINES);
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
	 * This returns JobScheduler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JobScheduler"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EnabledFeedback labelValue = ((JobScheduler)object).getStartFeedback();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_JobScheduler_type") :
			getString("_UI_JobScheduler_type") + " " + label;
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

		switch (notification.getFeatureID(JobScheduler.class)) {
			case JobClientPackage.JOB_SCHEDULER__START_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER__STOP_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER__RUNNING:
			case JobClientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JobClientPackage.JOB_SCHEDULER__JOBS:
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
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

		newChildDescriptors.add
			(createChildParameter
				(JobClientPackage.Literals.JOB_SCHEDULER__JOBS,
				 JobClientFactory.eINSTANCE.createJobScheduled()));

		newChildDescriptors.add
			(createChildParameter
				(JobClientPackage.Literals.JOB_SCHEDULER__ENGINES,
				 JobClientFactory.eINSTANCE.createJobEngine()));

		newChildDescriptors.add
			(createChildParameter
				(JobClientPackage.Literals.JOB_SCHEDULER__ENGINES,
				 JobClientFactory.eINSTANCE.createJobEngineInProcess()));
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
	 * RunStartCommand
	 */
	public class RunStartCommand extends StartCommand{
		private JobScheduler jobscheduler;
		
		// constructor
		public RunStartCommand(JobScheduler aJobScheduler)	{
			this.jobscheduler = aJobScheduler;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.jobscheduler.getStartFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobscheduler.start();
		}
	} // class RunStartCommand
	
	/*
	 * RunStopCommand
	 */
	public class RunStopCommand extends StopCommand{
		private JobScheduler jobscheduler;
		
		// constructor
		public RunStopCommand(JobScheduler aJobScheduler)	{
			this.jobscheduler = aJobScheduler;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.jobscheduler.getStopFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobscheduler.stop();
		}
	} // class RunStopCommand
	
	/*
	 * RunRefreshCommand
	 */
	public class RunRefreshCommand extends RefreshCommand{
		private JobScheduler jobscheduler;
		
		// constructor
		public RunRefreshCommand(JobScheduler aJobScheduler)	{
			this.jobscheduler = aJobScheduler;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.jobscheduler.getRefreshFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.jobscheduler.refresh();
		}
	} // class RunRefreshCommand
	
	
	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == StartCommand.class){
			return new RunStartCommand((JobScheduler) object); 
		}
		else if ( commandClass == RefreshCommand.class){
			return new RunRefreshCommand((JobScheduler) object); 
		}
		else if ( commandClass == StopCommand.class){
			return new RunStopCommand((JobScheduler) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
