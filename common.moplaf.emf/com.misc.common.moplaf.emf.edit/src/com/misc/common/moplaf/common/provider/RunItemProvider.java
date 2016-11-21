/**
 */
package com.misc.common.moplaf.common.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ProgressFeedback;
import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.Run;
import com.misc.common.moplaf.common.RunContext;
import com.misc.common.moplaf.emf.edit.command.CancelCommand;
import com.misc.common.moplaf.emf.edit.command.ResetCommand;
import com.misc.common.moplaf.emf.edit.command.RunBackgroundCommand;
import com.misc.common.moplaf.emf.edit.command.RunCommand;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.common.Run} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunItemProvider 
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
	public RunItemProvider(AdapterFactory adapterFactory) {
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

			addCanceledPropertyDescriptor(object);
			addRunFeedbackPropertyDescriptor(object);
			addCancelFeedbackPropertyDescriptor(object);
			addReturnSuccessPropertyDescriptor(object);
			addReturnFeedbackPropertyDescriptor(object);
			addReturnInformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Canceled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanceledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_Canceled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_Canceled_feature", "_UI_Run_type"),
				 CommonPackage.Literals.RUN__CANCELED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10JobControlPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_RunFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_RunFeedback_feature", "_UI_Run_type"),
				 CommonPackage.Literals.RUN__RUN_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10JobControlPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_CancelFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_CancelFeedback_feature", "_UI_Run_type"),
				 CommonPackage.Literals.RUN__CANCEL_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10JobControlPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Success feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnSuccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_ReturnSuccess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_ReturnSuccess_feature", "_UI_Run_type"),
				 CommonPackage.Literals.RUN__RETURN_SUCCESS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__12JobReturnPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_ReturnFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_ReturnFeedback_feature", "_UI_Run_type"),
				 CommonPackage.Literals.RUN__RETURN_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__12JobReturnPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_ReturnInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_ReturnInformation_feature", "_UI_Run_type"),
				 CommonPackage.Literals.RUN__RETURN_INFORMATION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__12JobReturnPropertyCategory"),
				 null));
	}

	/**
	 * This returns Run.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Run"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Run run = (Run)object;
		return getString("_UI_Run_type") + " " + run.isCanceled();
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

		switch (notification.getFeatureID(Run.class)) {
			case CommonPackage.RUN__CANCELED:
			case CommonPackage.RUN__RUN_FEEDBACK:
			case CommonPackage.RUN__CANCEL_FEEDBACK:
			case CommonPackage.RUN__RETURN_SUCCESS:
			case CommonPackage.RUN__RETURN_FEEDBACK:
			case CommonPackage.RUN__RETURN_INFORMATION:
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
		return CommonEditPlugin.INSTANCE;
	}

	/*
	 * RunRunCommand
	 */
	public class RunRunCommand extends RunCommand{
		private Run run;
		
		// constructor
		public RunRunCommand(Run aRun)	{
			this.run = aRun;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.run.getRunFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.run.run();
		}
	} // class RunRunCommand
	
	/*
	 * RunRunBackgroundCommand
	 */
	public class RunRunBackgroundCommand extends RunBackgroundCommand{
		private Run run;
		
		// constructor
		public RunRunBackgroundCommand(Run aRun)	{
			this.run = aRun;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.run.getRunFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}
		
		class BackgroundRunJob extends Job implements RunContext{
			public BackgroundRunJob(String name) {
				super(name);
			    this.setPriority(Job.SHORT);
			    this.setUser(true);
			    this.setSystem(false);
			}

			private IProgressMonitor monitor = null;
			
			@Override
			public boolean onProgress(ProgressFeedback progress) {
				boolean goOn = true;
				if ( this.monitor != null){
					if ( this.monitor.isCanceled())				{
						goOn = false;
					}
					this.monitor.setTaskName(progress.getTask());
				}
				return goOn;
			}

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				this.monitor = monitor;
	    	    monitor.beginTask("Initialization", 100);
	    	    //Plugin.INSTANCE.logInfo("Solve, job started");
	    	    RunRunBackgroundCommand.this.run.run(this);
	            this.monitor = null;
	            return Status.OK_STATUS;
			}
			
		};
		
		@Override
		public void execute() {
			
			 Job job = new BackgroundRunJob ("Run in Background");
		     //Plugin.INSTANCE.logInfo("solve, job submitted");
		     job.schedule(); // start as soon as possible			}
		}
	} // class RunRunBackgroundCommand
	
	/*
	 * RunCancelCommand
	 */
	public class RunCancelCommand extends CancelCommand{
		private Run run;
		
		// constructor
		public RunCancelCommand(Run aRun)	{
			this.run = aRun;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			EnabledFeedback feedback = this.run.getCancelFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.run.cancel();
		}
	} // class RunCancelCommand
	
	/*
	 * RunResetCommand
	 */
	public class RunResetCommand extends ResetCommand{
		private Run run;
		
		// constructor
		public RunResetCommand(Run aRun)	{
			this.run = aRun;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.run.reset();
		}
	} // class RunResetCommand
	
	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RunCommand.class){
			return new RunRunCommand((Run) object); 
		}
		else if ( commandClass == RunBackgroundCommand.class){
			return new RunRunBackgroundCommand((Run) object); 
		}
		else if ( commandClass == CancelCommand.class){
			return new RunCancelCommand((Run) object); 
		}
		else if ( commandClass == ResetCommand.class){
			return new RunResetCommand((Run) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
