/**
 */
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.localsearch.LocalSearchFactory;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Phase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhaseItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseItemProvider(AdapterFactory adapterFactory) {
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
			addKeepLevelPropertyDescriptor(object);
			addMaxStepsPropertyDescriptor(object);
			addMaxSecondsPropertyDescriptor(object);
			addPhaseStartPropertyDescriptor(object);
			addPhaseEndPropertyDescriptor(object);
			addNrStepsPropertyDescriptor(object);
			addDurationTotalPropertyDescriptor(object);
			addDurationAveragePropertyDescriptor(object);
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
				 getString("_UI_Phase_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_Name_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_KeepLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_KeepLevel_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__KEEP_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_MaxSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_MaxSteps_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__MAX_STEPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Seconds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxSecondsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_MaxSeconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_MaxSeconds_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__MAX_SECONDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10StrategyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_PhaseStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_PhaseStart_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__PHASE_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_PhaseEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_PhaseEnd_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__PHASE_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_NrSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_NrSteps_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__NR_STEPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration Total feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationTotalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_DurationTotal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_DurationTotal_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__DURATION_TOTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration Average feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationAveragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Phase_DurationAverage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Phase_DurationAverage_feature", "_UI_Phase_type"),
				 LocalSearchPackage.Literals.PHASE__DURATION_AVERAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
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
			childrenFeatures.add(LocalSearchPackage.Literals.PHASE__STEPS);
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
	 * This returns Phase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/seo-performance-marketing-graphic.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Phase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Phase_type") :
			getString("_UI_Phase_type") + " " + label;
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

		switch (notification.getFeatureID(Phase.class)) {
			case LocalSearchPackage.PHASE__NAME:
			case LocalSearchPackage.PHASE__KEEP_LEVEL:
			case LocalSearchPackage.PHASE__MAX_STEPS:
			case LocalSearchPackage.PHASE__MAX_SECONDS:
			case LocalSearchPackage.PHASE__PHASE_START:
			case LocalSearchPackage.PHASE__PHASE_END:
			case LocalSearchPackage.PHASE__NR_STEPS:
			case LocalSearchPackage.PHASE__DURATION_TOTAL:
			case LocalSearchPackage.PHASE__DURATION_AVERAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.PHASE__STEPS:
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
				(LocalSearchPackage.Literals.PHASE__STEPS,
				 LocalSearchFactory.eINSTANCE.createStep()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LocalsearchEditPlugin.INSTANCE;
	}
	
}
