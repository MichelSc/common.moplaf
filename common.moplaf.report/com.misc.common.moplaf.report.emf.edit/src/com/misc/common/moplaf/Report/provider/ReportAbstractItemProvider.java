/**
 */
package com.misc.common.moplaf.Report.provider;


import com.misc.common.moplaf.Report.ReportAbstract;
import com.misc.common.moplaf.Report.ReportEngine;
import com.misc.common.moplaf.Report.ReportPackage;
import com.misc.common.moplaf.emf.edit.command.RunCommand;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.Report.ReportAbstract} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportAbstractItemProvider 
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
	public ReportAbstractItemProvider(AdapterFactory adapterFactory) {
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

			addEnginePropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addGeneratedPropertyDescriptor(object);
			addOutputFilePropertyDescriptor(object);
			addLastGeneratedPropertyDescriptor(object);
			addRunModePropertyDescriptor(object);
			addMayBeRunPropertyDescriptor(object);
			addMayBeRunFeedbackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Engine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnginePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_Engine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_Engine_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__ENGINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_Format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_Format_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_Generated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_Generated_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__GENERATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_OutputFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_OutputFile_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__OUTPUT_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Generated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastGeneratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_LastGenerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_LastGenerated_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__LAST_GENERATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_RunMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_RunMode_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__RUN_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the May Be Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMayBeRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_mayBeRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_mayBeRun_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__MAY_BE_RUN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the May Be Run Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMayBeRunFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReportAbstract_mayBeRunFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReportAbstract_mayBeRunFeedback_feature", "_UI_ReportAbstract_type"),
				 ReportPackage.Literals.REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ReportAbstract.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReportAbstract"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ReportEngine labelValue = ((ReportAbstract)object).getEngine();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ReportAbstract_type") :
			getString("_UI_ReportAbstract_type") + " " + label;
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

		switch (notification.getFeatureID(ReportAbstract.class)) {
			case ReportPackage.REPORT_ABSTRACT__ENGINE:
			case ReportPackage.REPORT_ABSTRACT__FORMAT:
			case ReportPackage.REPORT_ABSTRACT__GENERATED:
			case ReportPackage.REPORT_ABSTRACT__OUTPUT_FILE:
			case ReportPackage.REPORT_ABSTRACT__LAST_GENERATED:
			case ReportPackage.REPORT_ABSTRACT__RUN_MODE:
			case ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN:
			case ReportPackage.REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK:
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
		return ReportEditPlugin.INSTANCE;
	}
	
	public class ReportRunCommand extends RunCommand{
		private ReportAbstract report;
		
		// constructor
		public ReportRunCommand(ReportAbstract areport)	{
			super();
			this.report = areport;
			String tmp = "Run the Report";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		protected boolean prepare(){
			if ( this.report==null) { return false; }
			return this.report.isMayBeRun();
		}

		@Override
		public void execute() {
			this.report.run();
		}
	} // class GeneratorRunCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RunCommand.class){
			return new ReportRunCommand((ReportAbstract) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	}
	

}
