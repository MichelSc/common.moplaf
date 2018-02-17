/**
 */
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.DoCommand;
import com.misc.common.moplaf.emf.edit.command.FlushCommand;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisLocationTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisLocationToolItemProvider 
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
	public GisLocationToolItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addDoToolFeedbackPropertyDescriptor(object);
			addLastHandlingFeedbackPropertyDescriptor(object);
			addToolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_GisLocationTool_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisLocationTool_Description_feature", "_UI_GisLocationTool_type"),
				 GisPackage.Literals.GIS_LOCATION_TOOL__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisLocationTool_Tool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisLocationTool_Tool_feature", "_UI_GisLocationTool_type"),
				 GisPackage.Literals.GIS_LOCATION_TOOL__TOOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Handling Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastHandlingFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisLocationTool_LastHandlingFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisLocationTool_LastHandlingFeedback_feature", "_UI_GisLocationTool_type"),
				 GisPackage.Literals.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Do Tool Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoToolFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisLocationTool_DoToolFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisLocationTool_DoToolFeedback_feature", "_UI_GisLocationTool_type"),
				 GisPackage.Literals.GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS);
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
	 * This returns GisLocationTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/settings48.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisLocationTool)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisLocationTool_type") :
			getString("_UI_GisLocationTool_type") + " " + label;
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

		switch (notification.getFeatureID(GisLocationTool.class)) {
			case GisPackage.GIS_LOCATION_TOOL__DESCRIPTION:
			case GisPackage.GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK:
			case GisPackage.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GisPackage.GIS_LOCATION_TOOL__RESULTS:
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
				(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS,
				 GisFactory.eINSTANCE.createGisCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS,
				 GisFactory.eINSTANCE.createGisAddressStructured()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS,
				 GisFactory.eINSTANCE.createGisAddressUnstructured()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS,
				 GisFactory.eINSTANCE.createGisAddressGeocoded()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS,
				 GisFactory.eINSTANCE.createGisGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_LOCATION_TOOL__RESULTS,
				 GisFactory.eINSTANCE.createGisLocationPinpointed()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GisEditPlugin.INSTANCE;
	}

	public class GisLocationToolDoCommand extends DoCommand{
		private GisLocationTool location;
		
		// constructor
		public GisLocationToolDoCommand(GisLocationTool aLocation)	{
			super();
			this.location = aLocation;
		}

		@Override
		protected boolean prepare() {
			boolean isExecutable = true;
			EnabledFeedback feedback = this.location.getDoToolFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.location.doTool();
		}
	} 

	public class GisLocationToolFlushCommand extends FlushCommand{
		private GisLocationTool location;
		
		// constructor
		public GisLocationToolFlushCommand(GisLocationTool aLocation)	{
			super();
			this.location = aLocation;
		}

		@Override
		public void execute() {
			this.location.flushResults();
		}
	} 

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == DoCommand.class){
			return new GisLocationToolDoCommand((GisLocationTool) object); 
		} else 	if ( commandClass == FlushCommand.class){
			return new GisLocationToolFlushCommand((GisLocationTool) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
