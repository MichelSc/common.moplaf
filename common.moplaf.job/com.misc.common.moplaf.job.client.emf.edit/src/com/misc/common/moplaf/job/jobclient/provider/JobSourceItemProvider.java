/**
 */
package com.misc.common.moplaf.job.jobclient.provider;

import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobSource;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.job.jobclient.JobSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSourceItemProvider 
	extends JobSchedulerServiceItemProvider {
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
				 false,
				 false,
				 true,
				 null,
				 getString("_UI__20StatusPropertyCategory"),
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
		String label = ((JobSource)object).getDescription();
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
		if ( commandClass == RefreshCommand.class){
			return new JobSourceRefreshCommand((JobSource) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
