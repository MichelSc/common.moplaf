/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.localsearch.provider;


import com.misc.common.moplaf.emf.edit.command.BaseCommand;
import com.misc.common.moplaf.localsearch.LocalSearchFactory;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.SolutionRef;
import com.misc.common.moplaf.localsearch.StrategyLevel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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

			addPreviousChangePropertyDescriptor(object);
			addLevelPropertyDescriptor(object);
			addKeepSolutionsPropertyDescriptor(object);
			addNewSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION);
			childrenFeatures.add(LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION);
			childrenFeatures.add(LocalSearchPackage.Literals.SOLUTION_CHANGE__CURRENT_SOLUTION);
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
			case LocalSearchPackage.SOLUTION_CHANGE__LEVEL:
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
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
				(LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION,
				 LocalSearchFactory.eINSTANCE.createSolutionRef()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION,
				 LocalSearchFactory.eINSTANCE.createSolutionRef()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.SOLUTION_CHANGE__CURRENT_SOLUTION,
				 LocalSearchFactory.eINSTANCE.createSolutionRef()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION ||
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION ||
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__CURRENT_SOLUTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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

	/*
	 * SolutionChangeSetCurrentSolutionCommand
	 */
	public class SolutionChangeSetCurrentSolutionCommand extends BaseCommand{
		private SolutionChange change;
		private Solution solution;
		
		// constructor
		public SolutionChangeSetCurrentSolutionCommand(SolutionChange a_change, Solution solution)	{
			super("CopyParams", "Copy the Parmas");
			this.change = a_change;
			this.solution = solution;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.change.setCurrentSolution(this.solution, true);
		}
	} // class SolutionChangeSetCurrentSolutionCommand
	
	protected Command createDropCommand(EditingDomain domain, SolutionChange owner, Object droppedObject){ 
		if ( droppedObject instanceof Solution){
  	   		Solution dropped_solution = (Solution) droppedObject;
  	   		SolutionChangeSetCurrentSolutionCommand cmd = new SolutionChangeSetCurrentSolutionCommand(owner, dropped_solution);
		   	return cmd;
		} else if ( droppedObject instanceof SolutionRef ) {
  	   		SolutionRef dropped_ref = (SolutionRef) droppedObject;
  	   		SolutionChangeSetCurrentSolutionCommand cmd = new SolutionChangeSetCurrentSolutionCommand(owner, dropped_ref.getSolution());
		   	return cmd;
		}
		return null;
	}
	
	/**
	 * Create a drag and drop command for this Run
	 */
	private class SolutionChangeDragAndDropCommand extends DragAndDropCommand {

		public SolutionChangeDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	CompoundCommand compound = new CompoundCommand();
			for (Object element : collection){
				Command cmd = SolutionChangeItemProvider.this.createDropCommand(this.domain, (SolutionChange)this.owner, element);
				if ( cmd != null ){
					compound.append(cmd);
				}
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};
	
	/**
	 * Create a command for a drag and drop on this Run
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new SolutionChangeDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}}
