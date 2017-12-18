/**
 */
package com.misc.common.moplaf.job.jobclient.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.BaseCommand;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.emf.edit.command.StartCommand;
import com.misc.common.moplaf.emf.edit.command.StopCommand;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
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
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSchedulerItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemGridsProvider {
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
			addRefreshFeedbackPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRefreshRatePropertyDescriptor(object);
			addNrJobsWaitingPropertyDescriptor(object);
			addNrJobsRunningPropertyDescriptor(object);
			addNrJobsFailedPropertyDescriptor(object);
			addNrJobsCancelledPropertyDescriptor(object);
			addLastRefreshPropertyDescriptor(object);
			addLastFeedbackPropertyDescriptor(object);
			addCurrentJobNrPropertyDescriptor(object);
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
				 getString("_UI_JobScheduler_StopFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_StopFeedback_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__STOP_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
				 getString("_UI_JobScheduler_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_Description_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30SchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Jobs Waiting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrJobsWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_NrJobsWaiting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_NrJobsWaiting_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__NR_JOBS_WAITING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Jobs Running feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrJobsRunningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_NrJobsRunning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_NrJobsRunning_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__NR_JOBS_RUNNING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Jobs Failed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrJobsFailedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_NrJobsFailed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_NrJobsFailed_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__NR_JOBS_FAILED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Jobs Cancelled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrJobsCancelledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_NrJobsCancelled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_NrJobsCancelled_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__NR_JOBS_CANCELLED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Refresh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastRefreshPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_LastRefresh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_LastRefresh_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__LAST_REFRESH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__50TimesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_LastFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_LastFeedback_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__LAST_FEEDBACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__50TimesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Job Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentJobNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobScheduler_CurrentJobNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_CurrentJobNr_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__CURRENT_JOB_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__30SchedulerPropertyCategory"),
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
				 getString("_UI__10EnabledPropertyCategory"),
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
				 getString("_UI_JobScheduler_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_Name_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__30SchedulerPropertyCategory"),
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
				 getString("_UI__30SchedulerPropertyCategory"),
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
				 getString("_UI_JobScheduler_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobScheduler_Status_feature", "_UI_JobScheduler_type"),
				 JobClientPackage.Literals.JOB_SCHEDULER__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(JobClientPackage.Literals.JOB_SCHEDULER__JOBS);
			childrenFeatures.add(JobClientPackage.Literals.JOB_SCHEDULER__ENGINES);
			childrenFeatures.add(JobClientPackage.Literals.JOB_SCHEDULER__SOURCES);
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
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/alarm-clock.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JobScheduler)object).getDescription();
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
			case JobClientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER__STATUS:
			case JobClientPackage.JOB_SCHEDULER__DESCRIPTION:
			case JobClientPackage.JOB_SCHEDULER__NAME:
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
			case JobClientPackage.JOB_SCHEDULER__RUNNING:
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_WAITING:
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_RUNNING:
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_FAILED:
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_CANCELLED:
			case JobClientPackage.JOB_SCHEDULER__LAST_REFRESH:
			case JobClientPackage.JOB_SCHEDULER__LAST_FEEDBACK:
			case JobClientPackage.JOB_SCHEDULER__CURRENT_JOB_NR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JobClientPackage.JOB_SCHEDULER__JOBS:
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
			case JobClientPackage.JOB_SCHEDULER__SOURCES:
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
	 * SchedulerStartCommand
	 */
	private class SchedulerStartCommand extends StartCommand{
		private JobScheduler jobscheduler;
		
		// constructor
		public SchedulerStartCommand(JobScheduler aJobScheduler)	{
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
	} // class SchedulerStartCommand
	
	/*
	 * SchedulerStopCommand
	 */
	private class SchedulerStopCommand extends StopCommand{
		private JobScheduler jobscheduler;
		
		// constructor
		public SchedulerStopCommand(JobScheduler aJobScheduler)	{
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
	} // class SchedulerStopCommand
	
	/*
	 * SchedulerRefreshCommand
	 */
	private class SchedulerRefreshCommand extends RefreshCommand{
		private JobScheduler jobscheduler;
		
		// constructor
		public SchedulerRefreshCommand(JobScheduler aJobScheduler)	{
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
			return new SchedulerStartCommand((JobScheduler) object); 
		}
		else if ( commandClass == RefreshCommand.class){
			return new SchedulerRefreshCommand((JobScheduler) object); 
		}
		else if ( commandClass == StopCommand.class){
			return new SchedulerStopCommand((JobScheduler) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

	/*
	 * RunCopyParamsCommand
	 */
	public class JobSchedulerSubmitRunCommand extends BaseCommand{
		private JobScheduler scheduler;
		private Run run;
		
		// constructor
		public JobSchedulerSubmitRunCommand(JobScheduler scheduler, Run run)	{
			super("ScheduleRun", "Schedule the Run");
			this.scheduler = scheduler;
			this.run = run;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.scheduler.submitRun(run);
		}
	} // class RunResetCommand
	
	protected Command createDropCommand(Object owner, Object droppedObject){ 
		JobScheduler this_scheduler = (JobScheduler) owner;
		if ( droppedObject instanceof Run){
  	   		Run dropped_run= (Run) droppedObject;
  	   	JobSchedulerSubmitRunCommand cmd = new JobSchedulerSubmitRunCommand(this_scheduler, dropped_run);
		   	return cmd;
		} 
		return null;
	}
	
	/**
	 * Create a drag and drop command for this Run
	 */
	private class RunDragAndDropCommand extends DragAndDropCommand {

		public RunDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	CompoundCommand compound = new CompoundCommand();
			for (Object element : collection){
				Command cmd = JobSchedulerItemProvider.this.createDropCommand(this.owner, element);
				if ( cmd != null ){
					compound.append(cmd);
				}
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};
	
	/**
	 * Create a command for a drag and drop on this Run
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new RunDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
	
	@Override
	public String getGridText(Object element, Object grid) {
		JobScheduler scheduler = (JobScheduler)element;
		return scheduler.getName();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		JobScheduler scheduler = (JobScheduler)element;
		return scheduler.getJobs();
	}
	
	private abstract interface Column {
		public String getText();
		public int  getWidth();
		public Object getValue(JobScheduled job);
		default public Object getBackgroundColor(JobScheduled job) {
			return null;
		}
	}
	
	private static Column[] columns = {
			new Column() {
				public String getText() {
					return "Job";
				}
				public int  getWidth() {
					return 120;
				}
				public Object getValue(JobScheduled job) {
					return job.getRun().getLabel();
				}
			}, 
			new Column() {
				public String getText() {
					return "Status";
				}
				public int  getWidth() {
					return 120;
				}
				public Object getValue(JobScheduled job) {
					return job.getStatus().getLiteral();
				}
				public Object getBackgroundColor(JobScheduled job) {
					switch ( job.getStatus() ) {
					case NOT_READY:
						return Color.COLOR_CYAN.toURI();
					case WAITING:
						return Color.COLOR_YELLOW.toURI();
					case SCHEDULED:
						return Color.COLOR_BLUE.toURI();
					case RUNNING:
						return Color.COLOR_MAGENTA.toURI();
					case COMPLETE:
						return Color.COLOR_GREEN.toURI();
					case FAILLED:
						return Color.COLOR_RED.toURI();
					default:
						return null;
					}
				}
			}, 
			new Column() {
				public String getText() {
					return "Submission";
				}
				public int  getWidth() {
					return 160;
				}
				public Object getValue(JobScheduled job) {
					return job.getSubmissionTime();
				}
			}, 
			new Column() {
				public String getText() {
					return "Start";
				}
				public int  getWidth() {
					return 160;
				}
				public Object getValue(JobScheduled job) {
					return job.getStartTime();
				}
			}, 
			new Column() {
				public String getText() {
					return "End";
				}
				public int  getWidth() {
					return 160;
				}
				public Object getValue(JobScheduled job) {
					return job.getEndTime();
				}
			}
	};

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		JobScheduled job = (JobScheduled)row;
		String row_header = String.format("%04d", job.getJobNr());
		return row_header;
	}

	@Override
	public int getNrColumns(Object element, Object grid) {
		return columns.length;
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		Integer column_index = (Integer)column;
		return columns[column_index].getText();
	}

	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		Integer column_index = (Integer)column;
		return columns[column_index].getWidth();
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		JobScheduled job = (JobScheduled)row;
		Integer column_index = (Integer)column;
		return columns[column_index].getValue(job);
	}

	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		JobScheduled job = (JobScheduled)row;
		Integer column_index = (Integer)column;
		return columns[column_index].getBackgroundColor(job);
	}
	
	
}
