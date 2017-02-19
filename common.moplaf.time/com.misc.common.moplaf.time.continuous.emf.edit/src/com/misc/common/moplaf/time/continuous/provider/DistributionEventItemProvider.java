/**
 */
package com.misc.common.moplaf.time.continuous.provider;


import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.timeview.emf.edit.IItemDiscontinuousAmountEventProvider;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.DistributionEvent} object.
 * <!-- begin-user-doc -->
 * @implements IItemDiscontinuousAmountEventProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionEventItemProvider
	extends ObjectWithPropagatorFunctionsItemProvider
	implements
		IItemDiscontinuousAmountEventProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		if ( super.isAdapterForType(type) ){ return true; }
		if ( type == IItemDiscontinuousAmountEventProvider.class) { return true; }
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

			addMomentPropertyDescriptor(object);
			addEventNrPropertyDescriptor(object);
			addNextPropertyDescriptor(object);
			addPreviousPropertyDescriptor(object);
			addAmountBeforePropertyDescriptor(object);
			addAmountAfterPropertyDescriptor(object);
			addSlopeBeforePropertyDescriptor(object);
			addSlopeAfterPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDistributionAsSequencePropertyDescriptor(object);
			addDistributionPropertyDescriptor(object);
			addDistributionAsProvidedEventPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Moment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Moment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Moment_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_EventNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_EventNr_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__EVENT_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Next_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Next_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__NEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Previous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Previous_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_AmountBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_AmountBefore_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_AmountAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_AmountAfter_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slope Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlopeBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_SlopeBefore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_SlopeBefore_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slope After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlopeAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_SlopeAfter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_SlopeAfter_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_AFTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
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
				 getString("_UI_DistributionEvent_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Description_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution As Sequence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributionAsSequencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_DistributionAsSequence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_DistributionAsSequence_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_Distribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_Distribution_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution As Provided Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributionAsProvidedEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistributionEvent_DistributionAsProvidedEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistributionEvent_DistributionAsProvidedEvent_feature", "_UI_DistributionEvent_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
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
		Date labelValue = ((DistributionEvent)object).getMoment();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DistributionEvent_type") :
			getString("_UI_DistributionEvent_type") + " " + label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {
		DistributionEvent event = (DistributionEvent) object;
		Distribution distribution = event.getDistributionAsSequence();
		if ( distribution == null ) { return null; }
		DistributionItemProvider distributionIP = (DistributionItemProvider)adapterFactory.adapt(distribution, IEditingDomainItemProvider.class);
		if ( distributionIP == null ) { return null; }
		return distributionIP.getSequenceEvents();
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

		switch (notification.getFeatureID(DistributionEvent.class)) {
			case TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
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

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 TimeContinuousFactory.eINSTANCE.createPropagatorFunctionDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 TimeContinuousFactory.eINSTANCE.createPropagatorFunctionDistributionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS,
				 TimeContinuousFactory.eINSTANCE.createPropagatorFunctionEventsProvider()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimeContinuousEditPlugin.INSTANCE;
	}

	@Override
	public float getEventAmountBefore(Object element) {
		DistributionEvent event = (DistributionEvent) element;
		return event.getAmountBefore();
	}

	@Override
	public float getEventAmountAfter(Object element) {
		DistributionEvent event = (DistributionEvent) element;
		return event.getAmountAfter();
	}

	@Override
	public Date getEventMoment(Object element) {
		DistributionEvent event = (DistributionEvent) element;
		return event.getMoment();
	}


}
