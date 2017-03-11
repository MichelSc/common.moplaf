/**
 */
package com.misc.common.moplaf.macroplanner.solver.provider;


import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider 
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
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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
			addScenarioStartPropertyDescriptor(object);
			addScenarioEndPropertyDescriptor(object);
			addSelectedMasterDataPropertyDescriptor(object);
			addSelectedDataPropertyDescriptor(object);
			addSelectedRoutingsPropertyDescriptor(object);
			addSelectedLimitsPropertyDescriptor(object);
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
				 getString("_UI_Scenario_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_Name_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenario Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_ScenarioStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_ScenarioStart_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__SCENARIO_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenario End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_ScenarioEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_ScenarioEnd_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__SCENARIO_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Master Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedMasterDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SelectedMasterData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SelectedMasterData_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__SELECTED_MASTER_DATA,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SelectedData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SelectedData_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__SELECTED_DATA,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Routings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedRoutingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SelectedRoutings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SelectedRoutings_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__SELECTED_ROUTINGS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected Limits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedLimitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_SelectedLimits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_SelectedLimits_feature", "_UI_Scenario_type"),
				 MacroPlannerSolverPackage.Literals.SCENARIO__SELECTED_LIMITS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__40ToUseMacroPlannerPropertyCategory"),
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
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.SCENARIO__LPS);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case MacroPlannerSolverPackage.SCENARIO__NAME:
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_START:
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_END:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerSolverPackage.SCENARIO__LPS:
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
				(MacroPlannerSolverPackage.Literals.SCENARIO__LPS,
				 MacroPlannerSolverFactory.eINSTANCE.createLPMacroPlanner()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MacroPlannerSolverEditPlugin.INSTANCE;
	}

}
