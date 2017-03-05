/**
 */
package com.misc.common.moplaf.time.continuous.calc.provider;


import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import com.misc.common.moplaf.time.continuous.provider.PropagatorFunctionDistributionItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropagatorLayerCompositeEventRefreshItemProvider extends PropagatorFunctionDistributionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerCompositeEventRefreshItemProvider(AdapterFactory adapterFactory) {
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

			addConcreteParentPropertyDescriptor(object);
			addAntecedenCalcDistributionInitializationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Concrete Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcreteParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorLayerCompositeEventRefresh_ConcreteParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorLayerCompositeEventRefresh_ConcreteParent_feature", "_UI_PropagatorLayerCompositeEventRefresh_type"),
				 TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anteceden Calc Distribution Initialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedenCalcDistributionInitializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization_feature", "_UI_PropagatorLayerCompositeEventRefresh_type"),
				 TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PropagatorLayerCompositeEventRefresh.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropagatorLayerCompositeEventRefresh"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropagatorLayerCompositeEventRefresh)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PropagatorLayerCompositeEventRefresh_type") :
			getString("_UI_PropagatorLayerCompositeEventRefresh_type") + " " + label;
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimeContinuousCalcEditPlugin.INSTANCE;
	}

}
