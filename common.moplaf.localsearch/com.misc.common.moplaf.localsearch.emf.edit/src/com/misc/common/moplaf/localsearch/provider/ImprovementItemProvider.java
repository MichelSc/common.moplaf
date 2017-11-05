/**
 */
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.localsearch.Improvement;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.Improvement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImprovementItemProvider 
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
	public ImprovementItemProvider(AdapterFactory adapterFactory) {
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

			addMaxIterationsPropertyDescriptor(object);
			addMaxSecondsPropertyDescriptor(object);
			addSolutionPropertyDescriptor(object);
			addImprovmentsStartPropertyDescriptor(object);
			addImprovmentsEndPropertyDescriptor(object);
			addIterationsPropertyDescriptor(object);
			addDurationTotalPropertyDescriptor(object);
			addDurationAveragePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addCurrentActionNrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Improvement_MaxIterations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_MaxIterations_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__MAX_ITERATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10ImprovementPropertyCategory"),
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
				 getString("_UI_Improvement_MaxSeconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_MaxSeconds_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__MAX_SECONDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10ImprovementPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Improvement_Solution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_Solution_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__SOLUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10ImprovementPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Improvments Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImprovmentsStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Improvement_ImprovmentsStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_ImprovmentsStart_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__IMPROVMENTS_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Improvments End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImprovmentsEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Improvement_ImprovmentsEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_ImprovmentsEnd_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__IMPROVMENTS_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Improvement_Iterations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_Iterations_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__ITERATIONS,
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
				 getString("_UI_Improvement_DurationTotal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_DurationTotal_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__DURATION_TOTAL,
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
				 getString("_UI_Improvement_DurationAverage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_DurationAverage_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__DURATION_AVERAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ExecutionPropertyCategory"),
				 null));
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
				 getString("_UI_Improvement_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_Name_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10ImprovementPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Action Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentActionNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Improvement_CurrentActionNr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Improvement_CurrentActionNr_feature", "_UI_Improvement_type"),
				 LocalSearchPackage.Literals.IMPROVEMENT__CURRENT_ACTION_NR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(LocalSearchPackage.Literals.IMPROVEMENT__ACTIONS);
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
	 * This returns Improvement.gif.
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
		String label = ((Improvement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Improvement_type") :
			getString("_UI_Improvement_type") + " " + label;
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

		switch (notification.getFeatureID(Improvement.class)) {
			case LocalSearchPackage.IMPROVEMENT__MAX_ITERATIONS:
			case LocalSearchPackage.IMPROVEMENT__MAX_SECONDS:
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_START:
			case LocalSearchPackage.IMPROVEMENT__IMPROVMENTS_END:
			case LocalSearchPackage.IMPROVEMENT__ITERATIONS:
			case LocalSearchPackage.IMPROVEMENT__DURATION_TOTAL:
			case LocalSearchPackage.IMPROVEMENT__DURATION_AVERAGE:
			case LocalSearchPackage.IMPROVEMENT__NAME:
			case LocalSearchPackage.IMPROVEMENT__CURRENT_ACTION_NR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.IMPROVEMENT__ACTIONS:
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
