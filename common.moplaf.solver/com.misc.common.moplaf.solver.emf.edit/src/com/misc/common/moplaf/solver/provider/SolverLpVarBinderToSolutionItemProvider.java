/**
 */
package com.misc.common.moplaf.solver.provider;


import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolverLpVarBinderToSolution;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.SolverLpVarBinderToSolution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverLpVarBinderToSolutionItemProvider extends SolverLpVarBinderItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLpVarBinderToSolutionItemProvider(AdapterFactory adapterFactory) {
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

			addSelectedSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Selected Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addSelectedSolutionPropertyDescriptor(Object object) {
	    IItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_SolverLpVarBinderToSolution_SelectedSolution_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_SolverLpVarBinderToSolution_SelectedSolution_feature", "_UI_SolverLpVarBinderToSolution_type"),
						 SolverPackage.Literals.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION,
						 true,  // settable
						 false, // multiline
						 true,  // sort choices
						 null,  // static image
						 null,// category
						 null)// filter flags
	    {
	    	public java.util.Collection<?> getChoiceOfValues(java.lang.Object object){
	    		SolverLpVarBinderToSolution binder = (SolverLpVarBinderToSolution)object;
	    		Generator generator = binder.getSolver().getGenerator();
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
		
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_SolverLpVarBinderToSolution_SelectedSolution_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_SolverLpVarBinderToSolution_SelectedSolution_feature", "_UI_SolverLpVarBinderToSolution_type"),
//				 SolverPackage.Literals.SOLVER_LP_VAR_BINDER_TO_SOLUTION__SELECTED_SOLUTION,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SolverLpVarBinderToSolution)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverLpVarBinderToSolution_type") :
			getString("_UI_SolverLpVarBinderToSolution_type") + " " + label;
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

}
