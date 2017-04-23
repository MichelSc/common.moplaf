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
import com.misc.common.moplaf.macroplanner.Routing;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.Routing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutingItemProvider 
	extends MacroPlannerDataElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingItemProvider(AdapterFactory adapterFactory) {
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
			addCodePropertyDescriptor(object);
			addCostPropertyDescriptor(object);
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
				 getString("_UI_Routing_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Routing_Name_feature", "_UI_Routing_type"),
				 MacroPlannerPackage.Literals.ROUTING__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10MacroPlannerPropertyCategory"),
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
				 getString("_UI_Routing_Code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Routing_Code_feature", "_UI_Routing_type"),
				 MacroPlannerPackage.Literals.ROUTING__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10MacroPlannerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Routing_Cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Routing_Cost_feature", "_UI_Routing_type"),
				 MacroPlannerPackage.Literals.ROUTING__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(MacroPlannerPackage.Literals.ROUTING__RESOURCES);
			childrenFeatures.add(MacroPlannerPackage.Literals.ROUTING__PRODUCTS);
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
	 * This returns Routing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MPRouting.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Routing)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Routing_type") :
			getString("_UI_Routing_type") + " " + label;
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

		switch (notification.getFeatureID(Routing.class)) {
			case MacroPlannerPackage.ROUTING__NAME:
			case MacroPlannerPackage.ROUTING__CODE:
			case MacroPlannerPackage.ROUTING__COST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerPackage.ROUTING__RESOURCES:
			case MacroPlannerPackage.ROUTING__PRODUCTS:
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
				(MacroPlannerPackage.Literals.ROUTING__RESOURCES,
				 MacroPlannerFactory.eINSTANCE.createRoutingResource()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerPackage.Literals.ROUTING__PRODUCTS,
				 MacroPlannerFactory.eINSTANCE.createRoutingProduct()));
	}

	/**
	 * Implements Command DropCommand
	 */
	public abstract class RoutingDropCommand extends AbstractCommand {

		protected Routing routing;
		
		public RoutingDropCommand(Routing routing) {
			super();
			this.routing = routing;
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

	public  class ConstructRoutingProduct extends RoutingDropCommand {
		private LocationProduct product;

		public ConstructRoutingProduct(Routing routing, LocationProduct product) {
			super(routing);
			this.product = product;
		}

		@Override
		public void execute() {
			this.routing.constructRoutingProduct(product);
		}
	};
		
	public  class ConstructRoutingResource extends RoutingDropCommand {
		private LocationResource resource;

		public ConstructRoutingResource(Routing routing, LocationResource resource) {
			super(routing);
			this.resource = resource;
		}

		@Override
		public void execute() {
			this.routing.constructRoutingResource(resource);
		}
	};
		

	/**
	 * Create a drag and drop command for this Location
	 */
	public class RoutingDragAndDropCommand extends DragAndDropCommand{
		// constructor
	   	public RoutingDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
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
			Routing thisRouting = (Routing) this.owner;
			for (Object element : collection){
				if ( element instanceof LocationProduct){
		  	   		LocationProduct droppedProduct = (LocationProduct) element;
		  	   	ConstructRoutingProduct cmd = new ConstructRoutingProduct(thisRouting, droppedProduct);
				   	compound.append(cmd);
				} else  if ( element instanceof LocationResource){
					LocationResource droppedResource = (LocationResource) element;
					ConstructRoutingResource cmd  = new ConstructRoutingResource(thisRouting, droppedResource);
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
		return new RoutingDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
}
