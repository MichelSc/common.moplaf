/**
 */
package com.misc.common.moplaf.time.continuous.provider;


import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.TimeUnit;
import com.misc.common.moplaf.timeview.impl.IItemAmountEventsProvider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.Distribution} object.
 * <!-- begin-user-doc -->
 * @implements IItemAmountEventsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemAmountEventsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		if ( super.isAdapterForType(type) ){ return true; }
		if ( type == IItemAmountEventsProvider.class) { return true; }
		return false;
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

			addTimeUnitPropertyDescriptor(object);
			addHorizonStartPropertyDescriptor(object);
			addHorizonEndPropertyDescriptor(object);
			addSequenceEventPropertyDescriptor(object);
			addParentDistributionPropertyDescriptor(object);
			addChildDistributionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_TimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_TimeUnit_feature", "_UI_Distribution_type"),
				 ContinuousPackage.Literals.DISTRIBUTION__TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1timePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_HorizonStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_HorizonStart_feature", "_UI_Distribution_type"),
				 ContinuousPackage.Literals.DISTRIBUTION__HORIZON_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1timePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_HorizonEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_HorizonEnd_feature", "_UI_Distribution_type"),
				 ContinuousPackage.Literals.DISTRIBUTION__HORIZON_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1timePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_SequenceEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_SequenceEvent_feature", "_UI_Distribution_type"),
				 ContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__3eventPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_ParentDistribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_ParentDistribution_feature", "_UI_Distribution_type"),
				 ContinuousPackage.Literals.DISTRIBUTION__PARENT_DISTRIBUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__2distributionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_ChildDistribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_ChildDistribution_feature", "_UI_Distribution_type"),
				 ContinuousPackage.Literals.DISTRIBUTION__CHILD_DISTRIBUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__2distributionPropertyCategory"),
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
			childrenFeatures.add(ContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENT);
			childrenFeatures.add(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS);
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
	 * This returns Distribution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Distribution"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimeUnit labelValue = ((Distribution)object).getTimeUnit();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Distribution_type") :
			getString("_UI_Distribution_type") + " " + label;
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

		switch (notification.getFeatureID(Distribution.class)) {
			case ContinuousPackage.DISTRIBUTION__TIME_UNIT:
			case ContinuousPackage.DISTRIBUTION__HORIZON_START:
			case ContinuousPackage.DISTRIBUTION__HORIZON_END:
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT:
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
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
				(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 ContinuousFactory.eINSTANCE.createCapacityChange()));

		newChildDescriptors.add
			(createChildParameter
				(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 ContinuousFactory.eINSTANCE.createStockChange()));

		newChildDescriptors.add
			(createChildParameter
				(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 ContinuousFactory.eINSTANCE.createAmountImpulsionAtomic()));

		newChildDescriptors.add
			(createChildParameter
				(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 ContinuousFactory.eINSTANCE.createSlopeImpulsionAtomic()));

		newChildDescriptors.add
			(createChildParameter
				(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 ContinuousFactory.eINSTANCE.createAmountAbsoluteAtomic()));

		newChildDescriptors.add
			(createChildParameter
				(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 ContinuousFactory.eINSTANCE.createSlopeAbsoluteAtomic()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimelineEditPlugin.INSTANCE;
	}

	@Override
	public Collection<?> getAmountEvents(Object element) {
		Distribution distribution = (Distribution) element;
		return distribution.getSequenceEvent();
	}

}
