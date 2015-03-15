/**
 */
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.gis.GisDistanceFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceToLocation;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisDistanceMatrix} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisDistanceMatrixItemProvider 
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
	public GisDistanceMatrixItemProvider(AdapterFactory adapterFactory) {
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

			addCalculatorPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Calculator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalculatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisDistanceMatrix_calculator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrix_calculator_feature", "_UI_GisDistanceMatrix_type"),
				 GisPackage.Literals.GIS_DISTANCE_MATRIX__CALCULATOR,
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
				 getString("_UI_GisDistanceMatrix_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisDistanceMatrix_Name_feature", "_UI_GisDistanceMatrix_type"),
				 GisPackage.Literals.GIS_DISTANCE_MATRIX__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GisPackage.Literals.GIS_DISTANCE_MATRIX__FROM_LOCATIONS);
			childrenFeatures.add(GisPackage.Literals.GIS_DISTANCE_MATRIX__TO_LOCATIONS);
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
	 * This returns GisDistanceMatrix.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GisDistanceMatrix"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GisDistanceMatrix)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GisDistanceMatrix_type") :
			getString("_UI_GisDistanceMatrix_type") + " " + label;
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

		switch (notification.getFeatureID(GisDistanceMatrix.class)) {
			case GisPackage.GIS_DISTANCE_MATRIX__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS:
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
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
				(GisPackage.Literals.GIS_DISTANCE_MATRIX__FROM_LOCATIONS,
				 GisFactory.eINSTANCE.createGisDistanceFromLocation()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_DISTANCE_MATRIX__TO_LOCATIONS,
				 GisFactory.eINSTANCE.createGisDistanceToLocation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GisEditPlugin.INSTANCE;
	}

	
	public class AddGisLocation extends AbstractCommand {
		
		private GisDistanceMatrix matrix;
		private GisLocation location;
		private boolean from;
		private boolean to;
		
		public AddGisLocation(GisDistanceMatrix aMatrix, GisLocation aLocation, boolean from, boolean to){
			this.matrix= aMatrix;
			this.location = aLocation;
			this.from = from;
			this.to = to;
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

		@Override
		public void execute() {
			if ( this.from){
				GisDistanceFromLocation newfrom = GisFactory.eINSTANCE.createGisDistanceFromLocation();
				newfrom.setLocation(this.location);
				this.matrix.getFromLocations().add(newfrom);
			}
			if ( this.to){
				GisDistanceToLocation newto = GisFactory.eINSTANCE.createGisDistanceToLocation();
				newto.setLocation(this.location);
				this.matrix.getToLocations().add(newto);
			}
		}

	} // class addSortingPlan command

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
												Object owner, 
												float location, 
												int operations, 
												int operation,
												Collection<?> collection) {
		List<Object> otherDroppedThings = new LinkedList<Object>();
		CompoundCommand command = new CompoundCommand();
		GisDistanceMatrix thisMatrix= (GisDistanceMatrix) owner;
		for (Object element : collection){
			if ( element instanceof GisLocation){
				command.append(new AddGisLocation(thisMatrix, (GisLocation)element, true, true));
			}
			else {
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
	
	
	/* (non-Javadoc)
	 * GisDistanceMatrixRefreshCommand
	 */
	public class GisDistanceMatrixRefreshCommand extends RefreshCommand{
		private GisDistanceMatrix matrix;
		
		// constructor
		public GisDistanceMatrixRefreshCommand(GisDistanceMatrix aMatrix)	{
			super();
			this.matrix = aMatrix;
			String tmp = "Refresh the distance matrix";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.matrix.calculate();
		}
	} // class TableGroupRefreshCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new GisDistanceMatrixRefreshCommand((GisDistanceMatrix) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
