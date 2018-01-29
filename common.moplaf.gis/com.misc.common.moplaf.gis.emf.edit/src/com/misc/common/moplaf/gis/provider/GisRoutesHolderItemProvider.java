/**
 */
package com.misc.common.moplaf.gis.provider;


import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.ClearCommand;
import com.misc.common.moplaf.emf.edit.command.FlushCommand;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRoutesHolder;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.gis.GisRoutesHolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GisRoutesHolderItemProvider extends GisRouterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderItemProvider(AdapterFactory adapterFactory) {
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

			addSymmetricalPropertyDescriptor(object);
			addCalculatorPropertyDescriptor(object);
			addRefreshFeedbackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Symmetrical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymmetricalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRoutesHolder_Symmetrical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolder_Symmetrical_feature", "_UI_GisRoutesHolder_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER__SYMMETRICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_GisRoutesHolder_Calculator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolder_Calculator_feature", "_UI_GisRoutesHolder_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER__CALCULATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refresh Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefreshFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GisRoutesHolder_RefreshFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GisRoutesHolder_RefreshFeedback_feature", "_UI_GisRoutesHolder_type"),
				 GisPackage.Literals.GIS_ROUTES_HOLDER__REFRESH_FEEDBACK,
				 false,
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
			childrenFeatures.add(GisPackage.Literals.GIS_ROUTES_HOLDER__FROM_LOCATIONS);
			childrenFeatures.add(GisPackage.Literals.GIS_ROUTES_HOLDER__TO_LOCATIONS);
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
		String label = ((GisRoutesHolder)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GisRoutesHolder_type") :
			getString("_UI_GisRoutesHolder_type") + " " + label;
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

		switch (notification.getFeatureID(GisRoutesHolder.class)) {
			case GisPackage.GIS_ROUTES_HOLDER__SYMMETRICAL:
			case GisPackage.GIS_ROUTES_HOLDER__REFRESH_FEEDBACK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
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
				(GisPackage.Literals.GIS_ROUTES_HOLDER__FROM_LOCATIONS,
				 GisFactory.eINSTANCE.createGisRoutesHolderFromLocation()));

		newChildDescriptors.add
			(createChildParameter
				(GisPackage.Literals.GIS_ROUTES_HOLDER__TO_LOCATIONS,
				 GisFactory.eINSTANCE.createGisRoutesHolderToLocation()));
	}

	/**
	 * Create a drag and drop command for this Run
	 */
	private class RunDragAndDropCommand extends DragAndDropCommand {

		public RunDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
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
			GisRoutesHolder thisMatrix= (GisRoutesHolder) owner;
			for (Object element : collection){
				if ( element instanceof GisLocation){
					compound.append(new GisRoutesHolderAddGisLocationCommand(thisMatrix, (GisLocation)element, true, true));
				}
				else {
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
		return new RunDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}

	
	/* (non-Javadoc)
	 * GisRoutesHolderFlushCommand
	 */
	public class GisRoutesHolderFlushCommand extends FlushCommand{
		private GisRoutesHolder matrix;
		
		// constructor
		public GisRoutesHolderFlushCommand(GisRoutesHolder aMatrix)	{
			super();
			this.matrix = aMatrix;
		}
		
		@Override
		public void execute() {
			this.matrix.flush();
		}
	} // class TableGroupFlushCommand

	/* (non-Javadoc)
	 * GisRoutesHolderClearCommand
	 */
	public class GisRoutesHolderClearCommand extends ClearCommand{
		private GisRoutesHolder matrix;
		
		// constructor
		public GisRoutesHolderClearCommand(GisRoutesHolder aMatrix)	{
			super();
			this.matrix = aMatrix;
		}
		
		@Override
		public void execute() {
			this.matrix.clear();
		}
	} // class TableGroupClearCommand

	/* (non-Javadoc)
	 * GisRoutesHolderRefreshCommand
	 */
	public class GisRoutesHolderRefreshCommand extends RefreshCommand{
		private GisRoutesHolder matrix;
		
		// constructor
		public GisRoutesHolderRefreshCommand(GisRoutesHolder aMatrix)	{
			super();
			this.matrix = aMatrix;
		}
		
		@Override
		protected boolean prepare() {
			boolean isExecutable = true;
			EnabledFeedback feedback = this.matrix.getRefreshFeedback();
			if ( !feedback.isEnabled() ) {
				isExecutable = false;
				this.setDescription(feedback.getFeedback());
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.matrix.refresh();
		}
	} // class GisRoutesHolderRefreshCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new GisRoutesHolderRefreshCommand((GisRoutesHolder) object); 
		} else if ( commandClass == ClearCommand.class){
			return new GisRoutesHolderClearCommand((GisRoutesHolder) object); 
		} else if ( commandClass == FlushCommand.class){
			return new GisRoutesHolderFlushCommand((GisRoutesHolder) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
