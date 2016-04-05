/**
 */
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpVar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorLpVarItemProvider
	extends GeneratorVarItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVarItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
			addLpGoalTermPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorLpVar_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorLpVar_Type_feature", "_UI_GeneratorLpVar_type"),
				 SolverPackage.Literals.GENERATOR_LP_VAR__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20VariablePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorLpVar_LowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorLpVar_LowerBound_feature", "_UI_GeneratorLpVar_type"),
				 SolverPackage.Literals.GENERATOR_LP_VAR__LOWER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20VariablePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorLpVar_UpperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorLpVar_UpperBound_feature", "_UI_GeneratorLpVar_type"),
				 SolverPackage.Literals.GENERATOR_LP_VAR__UPPER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20VariablePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Lp Goal Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLpGoalTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorLpVar_LpGoalTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorLpVar_LpGoalTerm_feature", "_UI_GeneratorLpVar_type"),
				 SolverPackage.Literals.GENERATOR_LP_VAR__LP_GOAL_TERM,
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
			childrenFeatures.add(SolverPackage.Literals.GENERATOR_LP_VAR__LP_TERM);
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
		String label = ((GeneratorLpVar)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_GeneratorLpVar_type") :
			getString("_UI_GeneratorLpVar_type") + " " + label;
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

		switch (notification.getFeatureID(GeneratorLpVar.class)) {
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
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

}
