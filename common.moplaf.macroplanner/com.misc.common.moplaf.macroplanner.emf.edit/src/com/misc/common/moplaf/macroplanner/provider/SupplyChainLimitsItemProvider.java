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
package com.misc.common.moplaf.macroplanner.provider;


import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.SupplyChainLimits;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.SupplyChainLimits} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SupplyChainLimitsItemProvider 
	extends MacroPlannerDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainLimitsItemProvider(AdapterFactory adapterFactory) {
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

			addCapacitiesPropertyDescriptor(object);
			addAvailabilitiesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Capacities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SupplyChainLimits_Capacities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SupplyChainLimits_Capacities_feature", "_UI_SupplyChainLimits_type"),
				 MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__CAPACITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Availabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SupplyChainLimits_Availabilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SupplyChainLimits_Availabilities_feature", "_UI_SupplyChainLimits_type"),
				 MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__AVAILABILITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
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
				 getString("_UI_SupplyChainLimits_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SupplyChainLimits_Name_feature", "_UI_SupplyChainLimits_type"),
				 MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10MacroPlannerPropertyCategory"),
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
			childrenFeatures.add(MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__CAPACITIES);
			childrenFeatures.add(MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__AVAILABILITIES);
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
	 * This returns SupplyChainLimits.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SupplyChainLimits"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SupplyChainLimits)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SupplyChainLimits_type") :
			getString("_UI_SupplyChainLimits_type") + " " + label;
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

		switch (notification.getFeatureID(SupplyChainLimits.class)) {
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
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
				(MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__CAPACITIES,
				 MacroPlannerFactory.eINSTANCE.createCapacity()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS__AVAILABILITIES,
				 MacroPlannerFactory.eINSTANCE.createAvailability()));
	}

	/**
	 * Implements Command DropCommand
	 */
	public abstract class LimitsDropCommand extends AbstractCommand {

		protected SupplyChainLimits limits;
		
		public LimitsDropCommand(SupplyChainLimits limits) {
			super();
			this.limits = limits;
		}

		protected boolean prepare(){
			isExecutable = true;
			return isExecutable;
		}

		public boolean canUndo() { 
			return false; 
		}

		@Override
		public void redo() {
			execute();		
		}

	}

	public  class ConstructCapacity extends LimitsDropCommand {
		private LocationProduct product;

		public ConstructCapacity(SupplyChainLimits limits, LocationProduct product) {
			super(limits);
			this.product = product;
		}

		@Override
		public void execute() {
			this.limits.constructCapacity(product);
		}
	};
		
	public  class ConstructAvailability extends LimitsDropCommand {
		private LocationResource resource;

		public ConstructAvailability(SupplyChainLimits limits, LocationResource resource) {
			super(limits);
			this.resource = resource;
		}

		@Override
		public void execute() {
			this.limits.constructAvailability(resource);
		}
	};
		

	/**
	 * Create a drag and drop command for this Location
	 */
	public class LimitsDragAndDropCommand extends DragAndDropCommand{
		// constructor
	   	public LimitsDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
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
			SupplyChainLimits thisLimits = (SupplyChainLimits) this.owner;
			for (Object element : collection){
				if ( element instanceof LocationProduct){
		  	   		LocationProduct droppedProduct = (LocationProduct) element;
		  	   		ConstructCapacity cmd = new ConstructCapacity(thisLimits, droppedProduct);
				   	compound.append(cmd);
				} else  if ( element instanceof LocationResource){
					LocationResource droppedResource = (LocationResource) element;
				   	ConstructAvailability cmd  = new ConstructAvailability(thisLimits, droppedResource);
				   	compound.append(cmd);
				} 
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};
	/**
	 * Create a command for a drag and drop on this Solver
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new LimitsDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
}
