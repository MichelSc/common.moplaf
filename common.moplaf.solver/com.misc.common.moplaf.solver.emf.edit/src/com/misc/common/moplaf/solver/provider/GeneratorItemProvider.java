/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.job.provider.RunItemProvider;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIsProvider;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.Generator} object.
 * <!-- begin-user-doc -->
 * @implements IItemKPIsProvider   
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorItemProvider
	extends RunItemProvider implements IItemKPIsProvider {
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

			addVarBindersPropertyDescriptor(object);
			addRemarksPropertyDescriptor(object);
			addFootprintNofVarsPropertyDescriptor(object);
			addFootprintNofConsPropertyDescriptor(object);
			addFootprintNofTermsPropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Var Binders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarBindersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Generator_VarBinders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Generator_VarBinders_feature", "_UI_Generator_type"),
				 SolverPackage.Literals.GENERATOR__VAR_BINDERS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
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
			case SolverPackage.GENERATOR__CODE:
			case SolverPackage.GENERATOR__SELECTED:
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
		return SolverEditPlugin.INSTANCE;
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public Collection<?> getKPIs(Object element) {
		Generator generator = (Generator)element;
		return generator.getGoals();
	}

	@Override
	public float getKPIAmount(Object element, Object kpi) {
		GeneratorLpGoal goal = (GeneratorLpGoal) kpi;
		return goal.getSelectedSolutionValue();
	}

	@Override
	public float getKPIMinAmount(Object element, Object kpi) {
		GeneratorLpGoal goal = (GeneratorLpGoal) kpi;
		return goal.getMinValueIndicative();
	}

	@Override
	public float getKPIMaxAmount(Object element, Object kpi) {
		GeneratorLpGoal goal = (GeneratorLpGoal) kpi;
		return goal.getMaxValueIndicative();
	}

	@Override
	public String getKPIID(Object element, Object kpi) {
		GeneratorLpGoal goal = (GeneratorLpGoal) kpi;
		return goal.getName();
	}

	@Override
	public String getKPIUnit(Object element, Object kpi) {
		return null;
	}

	@Override
	public Collection<?> getKPIRanges(Object element, Object kpi) {
		return null;
	}

	@Override
	public float getKPIRangeLowAmount(Object element, Object kpi, Object range) {
		return 0;
	}

	@Override
	public float getKPIRangeHighAmount(Object element, Object kpi, Object range) {
		return 0;
	}

}
