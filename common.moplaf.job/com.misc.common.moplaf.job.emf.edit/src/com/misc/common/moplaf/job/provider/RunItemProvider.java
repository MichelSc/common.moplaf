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
package com.misc.common.moplaf.job.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.BaseCommand;
import com.misc.common.moplaf.emf.edit.command.CancelCommand;
import com.misc.common.moplaf.emf.edit.command.ResetCommand;
import com.misc.common.moplaf.emf.edit.command.RunBackgroundCommand;
import com.misc.common.moplaf.emf.edit.command.RunCommand;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunParams;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.Run} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunItemProvider 
	extends RunParamsItemProvider {
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

			addRunFeedbackPropertyDescriptor(object);
			addCancelFeedbackPropertyDescriptor(object);
			addResetFeedbackPropertyDescriptor(object);
			addCancelledPropertyDescriptor(object);
			addReturnedPropertyDescriptor(object);
			addReturnSuccessPropertyDescriptor(object);
			addReturnFeedbackPropertyDescriptor(object);
			addReturnInformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 JobPackage.Literals.RUN__RUN_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
				 JobPackage.Literals.RUN__CANCEL_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_ResetFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_ResetFeedback_feature", "_UI_Run_type"),
				 JobPackage.Literals.RUN__RESET_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10EnabledPropertyCategory"),
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
				 getString("_UI_Run_Cancelled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_Cancelled_feature", "_UI_Run_type"),
				 JobPackage.Literals.RUN__CANCELLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10JobStatusPropertyCategory"),
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
				 getString("_UI_Run_Returned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_Returned_feature", "_UI_Run_type"),
				 JobPackage.Literals.RUN__RETURNED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10JobStatusPropertyCategory"),
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
				 JobPackage.Literals.RUN__RETURN_SUCCESS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10JobStatusPropertyCategory"),
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
				 JobPackage.Literals.RUN__RETURN_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10JobStatusPropertyCategory"),
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
				 JobPackage.Literals.RUN__RETURN_INFORMATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10JobStatusPropertyCategory"),
				 null));
	}

	/**
	 * This returns Run.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/cogs.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Run)object).getReturnInformation();
		return label == null || label.length() == 0 ?
			getString("_UI_Run_type") :
			getString("_UI_Run_type") + " " + label;
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
			case JobPackage.RUN__RUN_FEEDBACK:
			case JobPackage.RUN__CANCEL_FEEDBACK:
			case JobPackage.RUN__RESET_FEEDBACK:
			case JobPackage.RUN__LABEL:
			case JobPackage.RUN__CANCELLED:
			case JobPackage.RUN__RETURNED:
			case JobPackage.RUN__RETURN_SUCCESS:
			case JobPackage.RUN__RETURN_FEEDBACK:
			case JobPackage.RUN__RETURN_INFORMATION:
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
		
		@Override
		public void execute() {
			this.run.runAsynch(null);
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
			EnabledFeedback feedback = this.run.getResetFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
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

	/*
	 * RunCopyParamsCommand
	 */
	public class RunCopyParamsCommand extends BaseCommand{
		private Run run;
		private RunParams runParams;
		
		// constructor
		public RunCopyParamsCommand(Run aRun, RunParams params)	{
			super("CopyParams", "Copy the Parmas");
			this.run = aRun;
			this.runParams = params;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.run.copyParams(this.runParams);
		}
	} // class RunResetCommand
	
	protected Command createDropCommand(EditingDomain domain, Run owner, Object droppedObject){ 
		if ( droppedObject instanceof RunParams){
  	   		RunParams droppedParams = (RunParams) droppedObject;
  	   		RunCopyParamsCommand cmd = new RunCopyParamsCommand(owner, droppedParams);
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
				Command cmd = RunItemProvider.this.createDropCommand(this.domain, (Run) this.owner, element);
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
}
