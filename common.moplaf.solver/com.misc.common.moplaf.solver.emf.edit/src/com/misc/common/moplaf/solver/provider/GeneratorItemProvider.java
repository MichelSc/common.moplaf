/**
 */
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.common.provider.RunItemProvider;
import com.misc.common.moplaf.emf.edit.command.RunCommand;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.Generator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorItemProvider
	extends RunItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addRemarksPropertyDescriptor(object);
			addFootprintNofVarsPropertyDescriptor(object);
			addFootprintNofConsPropertyDescriptor(object);
			addFootprintNofTermsPropertyDescriptor(object);
			addCountConsPropertyDescriptor(object);
			addCountVarsPropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Remarks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_Remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_Remarks_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__REMARKS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footprint Nof Vars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFootprintNofVarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_FootprintNofVars_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_FootprintNofVars_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__FOOTPRINT_NOF_VARS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20FootprintPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footprint Nof Cons feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFootprintNofConsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_FootprintNofCons_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_FootprintNofCons_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__FOOTPRINT_NOF_CONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20FootprintPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footprint Nof Terms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFootprintNofTermsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_FootprintNofTerms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_FootprintNofTerms_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__FOOTPRINT_NOF_TERMS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__20FootprintPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Count Cons feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountConsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_CountCons_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_CountCons_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__COUNT_CONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20FootprintPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Count Vars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountVarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_CountVars_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_CountVars_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__COUNT_VARS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__20FootprintPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_Code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_Code_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
	    IItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_Generator_Selected_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_Generator_Selected_feature", "_UI_Generator_type"),
						 SolverPackage.Literals.GENERATOR__SELECTED,  // structural feature
						 true,  // settable
						 false, // multiline
						 true,  // sort choices
						 null,  // static image
						 getString("_UI__30SolutionPropertyCategory"),// category
						 null)// filter flags
	    {
	    	public java.util.Collection<?> getChoiceOfValues(java.lang.Object object){
	    		Generator generator = (Generator)object;
	    		LinkedList<Solution> solutions = new LinkedList<Solution>();
	    		for ( SolutionProvider provider : generator.getSolutionProvider()){
	    			for ( Solution solution : provider.getSolution()){
	    				solutions.add(solution);
	    			}
	    		}
	    		return solutions;
	    	}
	    };
		itemPropertyDescriptors.add(descriptor);
		/*
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_Selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_Selected_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__SELECTED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));*/
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
			childrenFeatures.add(SolverPackage.Literals.GENERATOR__ELP_VAR_COUNT);
			childrenFeatures.add(SolverPackage.Literals.GENERATOR__ELP_CONS_COUNT);
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
	 * This returns Generator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/irregular10.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Generator)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_Generator_type") :
			getString("_UI_Generator_type") + " " + label;
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

		switch (notification.getFeatureID(Generator.class)) {
			case SolverPackage.GENERATOR__REMARKS:
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS:
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS:
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS:
			case SolverPackage.GENERATOR__COUNT_CONS:
			case SolverPackage.GENERATOR__COUNT_VARS:
			case SolverPackage.GENERATOR__CODE:
			case SolverPackage.GENERATOR__SELECTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SolverPackage.GENERATOR__ELP_VAR_COUNT:
			case SolverPackage.GENERATOR__ELP_CONS_COUNT:
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
		return SolverEditPlugin.INSTANCE;
	}

}
