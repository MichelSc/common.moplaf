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


import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.GeneratorLpCons} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorLpConsItemProvider
	extends GeneratorConsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpConsItemProvider(AdapterFactory adapterFactory) {
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
			addRighHandSidePropertyDescriptor(object);
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
				 getString("_UI_GeneratorLpCons_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorLpCons_Type_feature", "_UI_GeneratorLpCons_type"),
				 SolverPackage.Literals.GENERATOR_LP_CONS__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ConstraintPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Righ Hand Side feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRighHandSidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorLpCons_RighHandSide_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorLpCons_RighHandSide_feature", "_UI_GeneratorLpCons_type"),
				 SolverPackage.Literals.GENERATOR_LP_CONS__RIGH_HAND_SIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ConstraintPropertyCategory"),
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
			childrenFeatures.add(SolverPackage.Literals.GENERATOR_LP_LINEAR__LP_TERM);
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
		String label = ((GeneratorLpCons)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_GeneratorLpCons_type") :
			getString("_UI_GeneratorLpCons_type") + " " + label;
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

		switch (notification.getFeatureID(GeneratorLpCons.class)) {
			case SolverPackage.GENERATOR_LP_CONS__TYPE:
			case SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE:
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

		newChildDescriptors.add
			(createChildParameter
				(SolverPackage.Literals.GENERATOR_LP_LINEAR__LP_TERM,
				 SolverFactory.eINSTANCE.createGeneratorLpTerm()));
	}

	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		CompoundCommand command = new CompoundCommand();
		GeneratorLpCons thisCons= (GeneratorLpCons) owner;
		List<Object> otherDroppedThings = new LinkedList<Object>();
		for (Object element : collection){
			if ( element instanceof GeneratorLpVar){
	  	   		GeneratorLpVar droppedVar = (GeneratorLpVar) element;
			   	ConstructTermCommand addVarCmd = new ConstructTermCommand(thisCons, droppedVar);
			   	command.append(addVarCmd);
			} else {
				otherDroppedThings.add(element);
			}
		}
		if ( otherDroppedThings.size()>0){
				command.append(super.createDragAndDropCommand(domain, 
					                                    owner, 
					                                    location, 
					                                    operations,
				                                      	operation, 
				                                      	otherDroppedThings));
		}
		return command;
	} // method createDragAndDropCommand
	 
	public class ConstructTermCommand extends AbstractCommand {
		   	private GeneratorLpCons constraint;
		   	private GeneratorLpVar var;
	   
		   	public ConstructTermCommand(GeneratorLpCons aConstraint, GeneratorLpVar aVar)  {
		   		super();
		   		this.constraint = aConstraint;
		   		this.var        = aVar;
		   		String tmp = "construct a constratint term";
		   		String label = "label:"+tmp;
		   		String description = "desc:"+tmp;
		   		this.setDescription(description);
		   		this.setLabel(label);
		   	}
		   
		   	@Override
		   	protected boolean prepare(){
		   		isExecutable = true;
		   		return isExecutable;
		   	}

			@Override
			public boolean canUndo() { 
				return false; 
			}

			@Override
			public void redo() {
				execute();		
			}
			
			@Override
			public void execute() {
				this.constraint.constructTerm(this.var, 1.0f);
	   }
	 } // class ConstructTermCommand
}
