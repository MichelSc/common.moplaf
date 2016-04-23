/**
 */
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.GeneratorGoal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorGoalItemProvider 
	extends GeneratorElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoalItemProvider(AdapterFactory adapterFactory) {
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

			addGeneratorPropertyDescriptor(object);
			addSubGoalPropertyDescriptor(object);
			addSelectedSolutionDisplayPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorGoal_Generator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorGoal_Generator_feature", "_UI_GeneratorGoal_type"),
				 SolverPackage.Literals.GENERATOR_GOAL__GENERATOR,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addSubGoalPropertyDescriptor(Object object) {
	    IItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_GeneratorGoal_SubGoal_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorGoal_SubGoal_feature", "_UI_GeneratorGoal_type"),
						 SolverPackage.Literals.GENERATOR_GOAL__SUB_GOAL,
						 true,  // settable
						 false, // multiline
						 true,  // sort choices
						 null,  // static image
						 getString("_UI__10GeneralPropertyCategory"),
						 null)// filter flags
	    {
	    	public java.util.Collection<?> getChoiceOfValues(java.lang.Object object){
	    		GeneratorGoal goal = (GeneratorGoal)object;
	    		Generator generator = goal.getGenerator();
	    		return generator.getGoals();
	    	}
	    };
		itemPropertyDescriptors.add(descriptor);
//		itemPropertyDescriptors.add
//		(createItemPropertyDescriptor
//			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//			 getResourceLocator(),
//			 getString("_UI_GeneratorGoal_SubGoal_feature"),
//			 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorGoal_SubGoal_feature", "_UI_GeneratorGoal_type"),
//			 SolverPackage.Literals.GENERATOR_GOAL__SUB_GOAL,
//			 true,
//			 false,
//			 false,
//			 null,
//			 getString("_UI__10GeneralPropertyCategory"),
//			 null));
	}

	/**
	 * This adds a property descriptor for the Selected Solution Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedSolutionDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorGoal_SelectedSolutionDisplay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorGoal_SelectedSolutionDisplay_feature", "_UI_GeneratorGoal_type"),
				 SolverPackage.Literals.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorGoal_Label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorGoal_Label_feature", "_UI_GeneratorGoal_type"),
				 SolverPackage.Literals.GENERATOR_GOAL__LABEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GeneratorGoal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/target.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GeneratorGoal)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_GeneratorGoal_type") :
			getString("_UI_GeneratorGoal_type") + " " + label;
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

		switch (notification.getFeatureID(GeneratorGoal.class)) {
			case SolverPackage.GENERATOR_GOAL__NAME:
			case SolverPackage.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY:
			case SolverPackage.GENERATOR_GOAL__LABEL:
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
