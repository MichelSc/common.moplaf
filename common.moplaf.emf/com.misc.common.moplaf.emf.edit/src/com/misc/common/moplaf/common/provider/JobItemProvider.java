/**
 */
package com.misc.common.moplaf.common.provider;


import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.Job;
import com.misc.common.moplaf.emf.edit.command.RefreshMetaDataCommand;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.common.Job} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobItemProvider 
	extends RunItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addHelpTextPropertyDescriptor(object);
			addStartTimePropertyDescriptor(object);
			addEndTimePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addArgsPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Job_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_Name_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10JobPropertyCategory"),
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
				 getString("_UI_Job_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_Status_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__11JobStatusPropertyCategory"),
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
				 getString("_UI_Job_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_Description_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__11JobStatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Help Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHelpTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Job_HelpText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_HelpText_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__HELP_TEXT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__11JobStatusPropertyCategory"),
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
				 getString("_UI_Job_StartTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_StartTime_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__START_TIME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__11JobStatusPropertyCategory"),
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
				 getString("_UI_Job_EndTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_EndTime_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__END_TIME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__11JobStatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Job_Duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_Duration_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__DURATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__11JobStatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Job_Args_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_Args_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__ARGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10JobPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Job_Parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Job_Parameters_feature", "_UI_Job_type"),
				 CommonPackage.Literals.JOB__PARAMETERS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Job.gif.
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
		String label = ((Job)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Job_type") :
			getString("_UI_Job_type") + " " + label;
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

		switch (notification.getFeatureID(Job.class)) {
			case CommonPackage.JOB__NAME:
			case CommonPackage.JOB__STATUS:
			case CommonPackage.JOB__DESCRIPTION:
			case CommonPackage.JOB__HELP_TEXT:
			case CommonPackage.JOB__START_TIME:
			case CommonPackage.JOB__END_TIME:
			case CommonPackage.JOB__DURATION:
			case CommonPackage.JOB__RUNNING:
			case CommonPackage.JOB__STOPPED:
			case CommonPackage.JOB__FINISHED:
			case CommonPackage.JOB__ARGS:
			case CommonPackage.JOB__PARAMETERS:
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


	public class JobRefreshMetaDataCommand extends RefreshMetaDataCommand{
		private Job job;
		
		public JobRefreshMetaDataCommand(Job aJob)	{
			super();
			this.job = aJob;
		}

		@Override
		public void execute() {
			this.job.refreshParameters();
		}
	} // class JobRefreshMetaDataCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshMetaDataCommand.class){
			return new JobRefreshMetaDataCommand((Job) object);
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
