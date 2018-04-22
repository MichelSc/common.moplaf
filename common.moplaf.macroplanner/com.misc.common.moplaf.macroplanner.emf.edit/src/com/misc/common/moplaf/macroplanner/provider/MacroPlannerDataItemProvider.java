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
package com.misc.common.moplaf.macroplanner.provider;


import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerData;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.MacroPlannerData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MacroPlannerDataItemProvider 
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
	public MacroPlannerDataItemProvider(AdapterFactory adapterFactory) {
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

			addTimeUnitPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MacroPlannerData_TimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacroPlannerData_TimeUnit_feature", "_UI_MacroPlannerData_type"),
				 MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10MacroPlannerPropertyCategory"),
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
				 getString("_UI_MacroPlannerData_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacroPlannerData_Name_feature", "_UI_MacroPlannerData_type"),
				 MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__NAME,
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
			childrenFeatures.add(MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__ELEMENTS);
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
	 * This returns MacroPlannerData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MPFolder.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MacroPlannerData)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MacroPlannerData_type") :
			getString("_UI_MacroPlannerData_type") + " " + label;
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

		switch (notification.getFeatureID(MacroPlannerData.class)) {
			case MacroPlannerPackage.MACRO_PLANNER_DATA__TIME_UNIT:
			case MacroPlannerPackage.MACRO_PLANNER_DATA__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
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
				(MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__ELEMENTS,
				 MacroPlannerFactory.eINSTANCE.createAvailability()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__ELEMENTS,
				 MacroPlannerFactory.eINSTANCE.createCapacity()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__ELEMENTS,
				 MacroPlannerFactory.eINSTANCE.createRouting()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerPackage.Literals.MACRO_PLANNER_DATA__ELEMENTS,
				 MacroPlannerFactory.eINSTANCE.createSupply()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MacroPlannerEditPlugin.INSTANCE;
	}

	/**
	 * Implements Command DropCommand
	 */
	public abstract class DataDropCommand extends AbstractCommand {

		protected MacroPlannerData data;
		
		public DataDropCommand(MacroPlannerData data) {
			super();
			this.data = data;
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

	public  class ConstructCapacity extends DataDropCommand {
		private LocationProduct product;

		public ConstructCapacity(MacroPlannerData limits, LocationProduct product) {
			super(limits);
			this.product = product;
		}

		@Override
		public void execute() {
			this.data.constructCapacity(product);
		}
	};
		
	public  class ConstructSupply extends DataDropCommand {
		private LocationProduct product;

		public ConstructSupply(MacroPlannerData limits, LocationProduct product) {
			super(limits);
			this.product = product;
		}

		@Override
		public void execute() {
			this.data.constructSupply(product);
		}
	};
		
	public  class ConstructAvailability extends DataDropCommand {
		private LocationResource resource;

		public ConstructAvailability(MacroPlannerData limits, LocationResource resource) {
			super(limits);
			this.resource = resource;
		}

		@Override
		public void execute() {
			this.data.constructAvailabilty(resource);
		}
	};
		

	/**
	 * Create a drag and drop command for this Location
	 */
	public class MacroPlannerDataDragAndDropCommand extends DragAndDropCommand{
		// constructor
	   	public MacroPlannerDataDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
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
			MacroPlannerData theseData = (MacroPlannerData) this.owner;
			for (Object element : collection){
				if ( element instanceof LocationProduct ){
		  	   		LocationProduct droppedProduct = (LocationProduct) element;
		  	   		ConstructCapacity cmd = new ConstructCapacity(theseData, droppedProduct);
				   	compound.append(cmd);
				} else if ( element instanceof LocationProduct ){
		  	   		LocationProduct droppedProduct = (LocationProduct) element;
		  	   		ConstructSupply cmd = new ConstructSupply(theseData, droppedProduct);
				   	compound.append(cmd);
				} else  if ( element instanceof LocationResource){
					LocationResource droppedResource = (LocationResource) element;
				   	ConstructAvailability cmd  = new ConstructAvailability(theseData, droppedResource);
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
		return new MacroPlannerDataDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}

}
