/**
 */
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.StrategyLevel;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.localsearch.SolutionChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionChangeItemProvider 
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
	public SolutionChangeItemProvider(AdapterFactory adapterFactory) {
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

			addStartSolutionPropertyDescriptor(object);
			addEndSolutionPropertyDescriptor(object);
			addEndSolutionOwnedPropertyDescriptor(object);
			addPreviousChangePropertyDescriptor(object);
			addLevelPropertyDescriptor(object);
			addCurrentSolutionPropertyDescriptor(object);
			addKeepSolutionsPropertyDescriptor(object);
			addNewSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_StartSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_StartSolution_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI__10SolutionChangePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_EndSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_EndSolution_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI__10SolutionChangePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End Solution Owned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndSolutionOwnedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_EndSolutionOwned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_EndSolutionOwned_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION_OWNED,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_PreviousChange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_PreviousChange_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__PREVIOUS_CHANGE,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI__10SolutionChangePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_Level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_Level_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10SolutionChangePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_CurrentSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_CurrentSolution_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__CURRENT_SOLUTION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__10SolutionChangePropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Keep Solutions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepSolutionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_KeepSolutions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_KeepSolutions_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__KEEP_SOLUTIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10SolutionChangePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the New Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolutionChange_NewSolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolutionChange_NewSolution_feature", "_UI_SolutionChange_type"),
				 LocalSearchPackage.Literals.SOLUTION_CHANGE__NEW_SOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10SolutionChangePropertyCategory"),
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
			childrenFeatures.add(LocalSearchPackage.Literals.SOLUTION_CHANGE__SOLUTIONS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StrategyLevel labelValue = ((SolutionChange)object).getLevel();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SolutionChange_type") :
			getString("_UI_SolutionChange_type") + " " + label;
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

		switch (notification.getFeatureID(SolutionChange.class)) {
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
			case LocalSearchPackage.SOLUTION_CHANGE__LEVEL:
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
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
		return LocalsearchEditPlugin.INSTANCE;
	}

}
