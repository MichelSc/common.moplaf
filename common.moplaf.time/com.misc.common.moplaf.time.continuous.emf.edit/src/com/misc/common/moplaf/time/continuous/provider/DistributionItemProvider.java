/**
 */
package com.misc.common.moplaf.time.continuous.provider;


import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.TimeUnit;
import com.misc.common.moplaf.timeview.emf.edit.IItemAmountEventsProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.Distribution} object.
 * <!-- begin-user-doc -->
 * @implements IItemAmountEventsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionItemProvider
	extends ObjectWithPropagatorFunctionsItemProvider
	implements
		IItemAmountEventsProvider {
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
			addSequenceEventsPropertyDescriptor(object);
			addParentDistributionPropertyDescriptor(object);
			addChildDistributionPropertyDescriptor(object);
			addProvidedEventsPropertyDescriptor(object);
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
				 TimeContinuousPackage.Literals.DISTRIBUTION__TIME_UNIT,
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
				 TimeContinuousPackage.Literals.DISTRIBUTION__HORIZON_START,
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
				 TimeContinuousPackage.Literals.DISTRIBUTION__HORIZON_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__1timePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_SequenceEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_SequenceEvents_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
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
				 TimeContinuousPackage.Literals.DISTRIBUTION__PARENT_DISTRIBUTION,
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
				 TimeContinuousPackage.Literals.DISTRIBUTION__CHILD_DISTRIBUTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provided Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Distribution_ProvidedEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Distribution_ProvidedEvents_feature", "_UI_Distribution_type"),
				 TimeContinuousPackage.Literals.DISTRIBUTION__PROVIDED_EVENTS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TimeContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENTS);
			childrenFeatures.add(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS);
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
			case TimeContinuousPackage.DISTRIBUTION__TIME_UNIT:
			case TimeContinuousPackage.DISTRIBUTION__HORIZON_START:
			case TimeContinuousPackage.DISTRIBUTION__HORIZON_END:
			case TimeContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
			case TimeContinuousPackage.DISTRIBUTION__START:
			case TimeContinuousPackage.DISTRIBUTION__END:
			case TimeContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
			case TimeContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TimeContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
			case TimeContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
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

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createStockChange()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createCapacityChange()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createSlopeImpulsionProvider()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createSlopeAbsoluteProvider()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createAmountImpulsionProvider()));

		newChildDescriptors.add
			(createChildParameter
				(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS,
				 TimeContinuousFactory.eINSTANCE.createAmountAbsoluteProvider()));
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

	protected List<Object> children = null;
	
	private void initChildren(){
		if ( this.children==null){
			children = new ArrayList<Object>();
			Distribution distribution = (Distribution)this.target;
			this.children.add(new DistributionEventsProvidersItemProvider(adapterFactory, distribution));
			this.children.add(new DistributionDistributionEventsItemProvider(adapterFactory, distribution));
		}
	}

	@Override
	public Collection<?> getChildren(Object object) {
		
		// get the super children
		Collection<Object> superchildren = (Collection<Object>) super.getChildren(object);
		Iterator<Object> childIterator = superchildren.iterator();
		while ( childIterator.hasNext() ){
			Object child = childIterator.next();
			if      ( child instanceof DistributionEvent )     { childIterator.remove(); }
			else if ( child instanceof EventsProviderAbstract) { childIterator.remove(); }
		}
		
		// get the group children
		this.initChildren();
		superchildren.addAll(children);

		return superchildren;
	}
	
	public Object getEventsProviders(){
		this.initChildren();
		return this.children.get(0);
	}

	public Object getSequenceEvents(){
		this.initChildren();
		return this.children.get(1);
	}
	
	@Override
	public Collection<?> getAmountEvents(Object element) {
		Distribution distribution = (Distribution) element;
		return distribution.getSequenceEvents();
	}

}
